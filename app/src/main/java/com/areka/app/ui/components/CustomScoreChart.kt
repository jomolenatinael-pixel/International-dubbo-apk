package com.areka.app.ui.components

import androidx.compose.animation.core.*
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AutoAwesome
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.material.icons.filled.LocalFireDepartment
import androidx.compose.material.icons.filled.MilitaryTech
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.clipRect
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.areka.app.ui.theme.*

@Composable
fun TrendLineChart(
    points: List<Float> = listOf(20f, 45f, 35f, 60f, 50f, 85f, 95f),
    modifier: Modifier = Modifier,
    lineColor: Color = NeonCyan,
    fillStartColor: Color = NeonCyan.copy(alpha = 0.35f),
    fillEndColor: Color = Color.Transparent
) {
    val progress = remember { Animatable(0f) }

    LaunchedEffect(points) {
        progress.animateTo(
            targetValue = 1f,
            animationSpec = tween(durationMillis = 900, easing = FastOutSlowInEasing)
        )
    }

    val containerBg = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.6f)
    val borderColor = MaterialTheme.colorScheme.outline

    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(130.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(containerBg)
            .border(1.dp, borderColor, RoundedCornerShape(12.dp))
            .padding(8.dp)
    ) {
        Canvas(modifier = Modifier.fillMaxSize()) {
            val width = size.width
            val height = size.height

            // Draw faint gridlines
            val gridLines = 4
            for (i in 0..gridLines) {
                val y = height * (i / gridLines.toFloat())
                drawLine(
                    color = Color.White.copy(alpha = 0.08f),
                    start = Offset(0f, y),
                    end = Offset(width, y),
                    strokeWidth = 1f
                )
            }

            if (points.size < 2) return@Canvas

            val stepX = width / (points.size - 1)
            val maxVal = (points.maxOrNull() ?: 100f).coerceAtLeast(10f)
            val minVal = (points.minOrNull() ?: 0f).coerceAtMost(maxVal - 1f)
            val range = (maxVal - minVal).coerceAtLeast(1f)

            val animProgress = progress.value

            val coords = points.mapIndexed { index, value ->
                val x = index * stepX
                val normalizedY = (value - minVal) / range
                val y = height - (normalizedY * height * 0.8f) - (height * 0.1f)
                Offset(x, y)
            }

            val path = Path().apply {
                moveTo(coords[0].x, coords[0].y)
                for (i in 1 until coords.size) {
                    val prev = coords[i - 1]
                    val curr = coords[i]
                    val cx1 = prev.x + (curr.x - prev.x) / 2f
                    val cy1 = prev.y
                    val cx2 = prev.x + (curr.x - prev.x) / 2f
                    val cy2 = curr.y
                    cubicTo(cx1, cy1, cx2, cy2, curr.x, curr.y)
                }
            }

            val fillPath = Path().apply {
                moveTo(coords[0].x, height)
                lineTo(coords[0].x, coords[0].y)
                for (i in 1 until coords.size) {
                    val prev = coords[i - 1]
                    val curr = coords[i]
                    val cx1 = prev.x + (curr.x - prev.x) / 2f
                    val cy1 = prev.y
                    val cx2 = prev.x + (curr.x - prev.x) / 2f
                    val cy2 = curr.y
                    cubicTo(cx1, cy1, cx2, cy2, curr.x, curr.y)
                }
                lineTo(coords.last().x, height)
                close()
            }

            // Smoothly reveal chart along X axis
            clipRect(right = width * animProgress) {
                drawPath(
                    path = fillPath,
                    brush = Brush.verticalGradient(
                        colors = listOf(fillStartColor, fillEndColor)
                    )
                )

                drawPath(
                    path = path,
                    color = lineColor,
                    style = Stroke(
                        width = 3.dp.toPx(),
                        cap = StrokeCap.Round,
                        join = StrokeJoin.Round
                    )
                )

                coords.forEach { pt ->
                    drawCircle(
                        color = lineColor.copy(alpha = 0.4f),
                        radius = 5.dp.toPx(),
                        center = pt
                    )
                    drawCircle(
                        color = Color.White,
                        radius = 2.5f.dp.toPx(),
                        center = pt
                    )
                }
            }
        }
    }
}

@Composable
fun CircularScoreGauge(
    percentage: Int,
    modifier: Modifier = Modifier,
    sizeDp: Int = 140,
    strokeWidthDp: Int = 12,
    primaryColor: Color = NeonCyan,
    trackColor: Color = DarkNavyCardBorder
) {
    val clampedPercentage = percentage.coerceIn(0, 100)
    val animatedPercentage = remember { Animatable(0f) }

    LaunchedEffect(clampedPercentage) {
        animatedPercentage.animateTo(
            targetValue = clampedPercentage.toFloat(),
            animationSpec = tween(durationMillis = 1100, easing = FastOutSlowInEasing)
        )
    }

    val actualTrackColor = if (LocalThemeIsDark.current) trackColor else LightCardBorder

    Box(
        modifier = modifier.size(sizeDp.dp),
        contentAlignment = Alignment.Center
    ) {
        Canvas(modifier = Modifier.fillMaxSize()) {
            val sweepAngle = 260f
            val startAngle = 140f
            val progressSweep = sweepAngle * (animatedPercentage.value / 100f)

            val stroke = Stroke(
                width = strokeWidthDp.dp.toPx(),
                cap = StrokeCap.Round
            )

            // Background track arc
            drawArc(
                color = actualTrackColor,
                startAngle = startAngle,
                sweepAngle = sweepAngle,
                useCenter = false,
                style = stroke,
                topLeft = Offset(strokeWidthDp.dp.toPx(), strokeWidthDp.dp.toPx()),
                size = Size(
                    size.width - (strokeWidthDp * 2).dp.toPx(),
                    size.height - (strokeWidthDp * 2).dp.toPx()
                )
            )

            // Foreground progress arc
            if (progressSweep > 0.5f) {
                drawArc(
                    color = primaryColor,
                    startAngle = startAngle,
                    sweepAngle = progressSweep,
                    useCenter = false,
                    style = stroke,
                    topLeft = Offset(strokeWidthDp.dp.toPx(), strokeWidthDp.dp.toPx()),
                    size = Size(
                        size.width - (strokeWidthDp * 2).dp.toPx(),
                        size.height - (strokeWidthDp * 2).dp.toPx()
                    )
                )
            }
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "${animatedPercentage.value.toInt()}%",
                style = MaterialTheme.typography.headlineLarge.copy(
                    fontWeight = FontWeight.Bold,
                    color = primaryColor
                )
            )
            Text(
                text = when {
                    percentage >= 80 -> "Exemplary"
                    percentage >= 60 -> "Proficient"
                    else -> "Needs Review"
                },
                style = MaterialTheme.typography.bodySmall.copy(
                    color = MaterialTheme.colorScheme.secondaryTextColor,
                    fontSize = 11.sp
                )
            )
        }
    }
}

@Composable
fun GlowingBadgeItem(
    title: String,
    days: Int,
    color: Color,
    isUnlocked: Boolean,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.padding(horizontal = 6.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val badgeBorderColor = if (isUnlocked) AmberGold.copy(alpha = 0.6f) else MaterialTheme.colorScheme.outline
        val badgeBgColor = if (isUnlocked) MaterialTheme.colorScheme.surface else MaterialTheme.colorScheme.surfaceVariant

        Box(
            modifier = Modifier
                .size(48.dp)
                .clip(CircleShape)
                .background(badgeBgColor)
                .border(1.dp, badgeBorderColor, CircleShape),
            contentAlignment = Alignment.Center
        ) {
            val iconVector = when {
                days <= 7 -> Icons.Default.Star
                days <= 14 -> Icons.Default.MilitaryTech
                days <= 30 -> Icons.Default.EmojiEvents
                days <= 60 -> Icons.Default.LocalFireDepartment
                else -> Icons.Default.EmojiEvents
            }

            Icon(
                imageVector = iconVector,
                contentDescription = "$title ($days days requirement)",
                tint = if (isUnlocked) AmberGold else MaterialTheme.colorScheme.secondaryTextColor,
                modifier = Modifier.size(22.dp)
            )
        }

        Spacer(modifier = Modifier.height(4.dp))

        Text(
            text = "${days}d",
            style = MaterialTheme.typography.labelSmall.copy(
                fontWeight = FontWeight.Bold,
                color = if (isUnlocked) AmberGold else MaterialTheme.colorScheme.secondaryTextColor,
                fontSize = 11.sp
            )
        )
    }
}
