package com.areka.app.data.repository

import com.areka.app.data.model.Question
import com.areka.app.data.model.QuestionOption
import com.areka.app.data.model.Quiz

/**
 * Hand-authored, curriculum-aligned multiple choice quizzes for Ethiopian MoE Grade 10 New Curriculum.
 * Part 1: Mathematics (7 units), Physics (6 units), Chemistry (6 units) - Total 19 units
 */
object CurriculumQuizzesPart1 {

    val quizzes: Map<String, Quiz> = mapOf(
        // ==========================================
        // 1. MATHEMATICS (math) — 7 units
        // ==========================================
        "math_u1" to Quiz(
            id = "quiz_math_u1",
            title = "Relations and Functions Quiz",
            subject = "Mathematics",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "calculator",
            unitId = "math_u1",
            subjectId = "math",
            questions = listOf(
                Question(
                    id = 1,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "A relation R from set A to set B is classified as a function if and only if:",
                    options = listOf(
                        QuestionOption("a", "Every element in set A is paired with exactly one element in set B"),
                        QuestionOption("b", "Every element in set B is paired with at least two elements in set A"),
                        QuestionOption("c", "The domain of R is strictly smaller than the codomain"),
                        QuestionOption("d", "The relation has no inverse mapping")
                    ),
                    correctOptionId = "a",
                    explanation = "By definition, a function pairs each input from its domain with a unique output in its codomain."
                ),
                Question(
                    id = 2,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "Which graphical test determines whether a curve in the Cartesian plane represents a function y = f(x)?",
                    options = listOf(
                        QuestionOption("a", "Vertical Line Test"),
                        QuestionOption("b", "Horizontal Line Test"),
                        QuestionOption("c", "Tangent Line Test"),
                        QuestionOption("d", "Asymptote Intersection Test")
                    ),
                    correctOptionId = "a",
                    explanation = "If any vertical line intersects the graph at more than one point, a single x-value yields multiple y-values, so it is not a function."
                ),
                Question(
                    id = 3,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "Given f(x) = 2x + 3 and g(x) = x² - 1, what is the composite value (f ∘ g)(2)?",
                    options = listOf(
                        QuestionOption("a", "9"),
                        QuestionOption("b", "7"),
                        QuestionOption("c", "11"),
                        QuestionOption("d", "48")
                    ),
                    correctOptionId = "a",
                    explanation = "First compute g(2) = 2² - 1 = 3. Then f(g(2)) = f(3) = 2(3) + 3 = 9."
                ),
                Question(
                    id = 4,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "For a function f to possess an inverse function f⁻¹, f must be:",
                    options = listOf(
                        QuestionOption("a", "Bijective (both one-to-one and onto)"),
                        QuestionOption("b", "A quadratic polynomial with positive leading coefficient"),
                        QuestionOption("c", "Periodic and continuous everywhere"),
                        QuestionOption("d", "Strictly non-linear on its domain")
                    ),
                    correctOptionId = "a",
                    explanation = "An inverse function exists if and only if f is bijective (injective and surjective), ensuring a unique reverse mapping."
                )
            )
        ),
        "math_u2" to Quiz(
            id = "quiz_math_u2",
            title = "Polynomial Functions Quiz",
            subject = "Mathematics",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "calculator",
            unitId = "math_u2",
            subjectId = "math",
            questions = listOf(
                Question(
                    id = 5,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "According to the Remainder Theorem, dividing polynomial P(x) by (x - c) results in a remainder equal to:",
                    options = listOf(
                        QuestionOption("a", "P(c)"),
                        QuestionOption("b", "P(-c)"),
                        QuestionOption("c", "P'(c)"),
                        QuestionOption("d", "c · P(0)")
                    ),
                    correctOptionId = "a",
                    explanation = "When P(x) = (x - c)Q(x) + R, evaluating at x = c yields P(c) = 0 · Q(c) + R = R."
                ),
                Question(
                    id = 6,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "What is the degree of the polynomial function P(x) = 5x⁴ - 3x² + 7x - 9?",
                    options = listOf(
                        QuestionOption("a", "4"),
                        QuestionOption("b", "5"),
                        QuestionOption("c", "3"),
                        QuestionOption("d", "9")
                    ),
                    correctOptionId = "a",
                    explanation = "The degree of a polynomial is the highest power of the variable x with a non-zero coefficient, which is 4."
                ),
                Question(
                    id = 7,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "By the Factor Theorem, (x - 2) is a factor of P(x) = x³ - 4x² + x + 6 if:",
                    options = listOf(
                        QuestionOption("a", "P(2) = 0"),
                        QuestionOption("b", "P(-2) = 0"),
                        QuestionOption("c", "P(0) = 2"),
                        QuestionOption("d", "P(2) > 0")
                    ),
                    correctOptionId = "a",
                    explanation = "P(2) = 2³ - 4(2)² + 2 + 6 = 8 - 16 + 2 + 6 = 0, proving that (x - 2) is indeed a factor."
                ),
                Question(
                    id = 8,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "How many complex roots (counting multiplicities) does a polynomial of degree n possess?",
                    options = listOf(
                        QuestionOption("a", "Exactly n roots"),
                        QuestionOption("b", "At most n - 1 roots"),
                        QuestionOption("c", "Between n and 2n roots"),
                        QuestionOption("d", "Infinitely many roots")
                    ),
                    correctOptionId = "a",
                    explanation = "The Fundamental Theorem of Algebra states that every non-zero single-variable polynomial of degree n has exactly n complex roots."
                )
            )
        ),
        "math_u3" to Quiz(
            id = "quiz_math_u3",
            title = "Exponential and Logarithmic Functions Quiz",
            subject = "Mathematics",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "calculator",
            unitId = "math_u3",
            subjectId = "math",
            questions = listOf(
                Question(
                    id = 9,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "What is the domain of the natural logarithmic function f(x) = ln(x)?",
                    options = listOf(
                        QuestionOption("a", "(0, ∞)"),
                        QuestionOption("b", "[0, ∞)"),
                        QuestionOption("c", "(-∞, ∞)"),
                        QuestionOption("d", "(-∞, 0)")
                    ),
                    correctOptionId = "a",
                    explanation = "Logarithms are only defined for strictly positive arguments, so the domain is all real numbers x > 0."
                ),
                Question(
                    id = 10,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "If log₂(x) = 5, what is the value of x?",
                    options = listOf(
                        QuestionOption("a", "32"),
                        QuestionOption("b", "25"),
                        QuestionOption("c", "10"),
                        QuestionOption("d", "64")
                    ),
                    correctOptionId = "a",
                    explanation = "Converting logarithmic form to exponential form: x = 2⁵ = 32."
                ),
                Question(
                    id = 11,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "Which logarithmic property correctly rewrites log_b(M · N)?",
                    options = listOf(
                        QuestionOption("a", "log_b(M) + log_b(N)"),
                        QuestionOption("b", "log_b(M) · log_b(N)"),
                        QuestionOption("c", "log_b(M) - log_b(N)"),
                        QuestionOption("d", "(log_b M) / (log_b N)")
                    ),
                    correctOptionId = "a",
                    explanation = "The product rule for logarithms establishes that log_b(M · N) = log_b(M) + log_b(N)."
                ),
                Question(
                    id = 12,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "What is the horizontal asymptote of the exponential curve f(x) = 3^x - 4?",
                    options = listOf(
                        QuestionOption("a", "y = -4"),
                        QuestionOption("b", "y = 0"),
                        QuestionOption("c", "x = -4"),
                        QuestionOption("d", "y = 3")
                    ),
                    correctOptionId = "a",
                    explanation = "As x → -∞, 3^x approaches 0, so f(x) approaches 0 - 4 = -4, giving horizontal asymptote y = -4."
                )
            )
        ),
        "math_u4" to Quiz(
            id = "quiz_math_u4",
            title = "Trigonometric Functions Quiz",
            subject = "Mathematics",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "calculator",
            unitId = "math_u4",
            subjectId = "math",
            questions = listOf(
                Question(
                    id = 13,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "What is the exact radian measure corresponding to 150°?",
                    options = listOf(
                        QuestionOption("a", "5π/6 radians"),
                        QuestionOption("b", "2π/3 radians"),
                        QuestionOption("c", "3π/4 radians"),
                        QuestionOption("d", "7π/6 radians")
                    ),
                    correctOptionId = "a",
                    explanation = "Radians = degrees × (π / 180) = 150 × (π / 180) = 5π/6."
                ),
                Question(
                    id = 14,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "Which fundamental Pythagorean identity holds true for all angle values θ?",
                    options = listOf(
                        QuestionOption("a", "sin²(θ) + cos²(θ) = 1"),
                        QuestionOption("b", "sin²(θ) - cos²(θ) = 1"),
                        QuestionOption("c", "tan²(θ) + 1 = cos²(θ)"),
                        QuestionOption("d", "sin(θ) + cos(θ) = 1")
                    ),
                    correctOptionId = "a",
                    explanation = "On the unit circle, x² + y² = 1 translates directly into cos²(θ) + sin²(θ) = 1."
                ),
                Question(
                    id = 15,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "What is the period of the standard sine function y = sin(x)?",
                    options = listOf(
                        QuestionOption("a", "2π radians (360°)"),
                        QuestionOption("b", "π radians (180°)"),
                        QuestionOption("c", "4π radians (720°)"),
                        QuestionOption("d", "π/2 radians (90°)")
                    ),
                    correctOptionId = "a",
                    explanation = "The sine wave completes one full repeating oscillation every 2π radians."
                ),
                Question(
                    id = 16,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "If angle θ lies in the second quadrant (Quadrant II), which trigonometric ratio is positive?",
                    options = listOf(
                        QuestionOption("a", "sin(θ)"),
                        QuestionOption("b", "cos(θ)"),
                        QuestionOption("c", "tan(θ)"),
                        QuestionOption("d", "sec(θ)")
                    ),
                    correctOptionId = "a",
                    explanation = "In Quadrant II, y > 0 and x < 0; hence sin(θ) = y/r is positive while cos(θ) and tan(θ) are negative."
                )
            )
        ),
        "math_u5" to Quiz(
            id = "quiz_math_u5",
            title = "Circles Quiz",
            subject = "Mathematics",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "calculator",
            unitId = "math_u5",
            subjectId = "math",
            questions = listOf(
                Question(
                    id = 17,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "What is the measure of an angle inscribed in a semicircle?",
                    options = listOf(
                        QuestionOption("a", "90° (Right angle)"),
                        QuestionOption("b", "60°"),
                        QuestionOption("c", "45°"),
                        QuestionOption("d", "180°")
                    ),
                    correctOptionId = "a",
                    explanation = "By Thales's theorem, an inscribed angle intercepting a semicircle of 180° measures exactly half that arc: 90°."
                ),
                Question(
                    id = 18,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "What is the relationship between a tangent line to a circle and the radius drawn to the point of tangency?",
                    options = listOf(
                        QuestionOption("a", "They are perpendicular (intersect at 90°)"),
                        QuestionOption("b", "They are parallel to each other"),
                        QuestionOption("c", "They intersect at 45°"),
                        QuestionOption("d", "They have equal algebraic slopes")
                    ),
                    correctOptionId = "a",
                    explanation = "A tangent to a circle is always perpendicular to the radius at the point of contact."
                ),
                Question(
                    id = 19,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "What is the center and radius of the circle defined by (x - 3)² + (y + 5)² = 49?",
                    options = listOf(
                        QuestionOption("a", "Center (3, -5), radius r = 7"),
                        QuestionOption("b", "Center (-3, 5), radius r = 49"),
                        QuestionOption("c", "Center (3, 5), radius r = 7"),
                        QuestionOption("d", "Center (-3, -5), radius r = 14")
                    ),
                    correctOptionId = "a",
                    explanation = "The standard form (x - h)² + (y - k)² = r² gives center (h, k) = (3, -5) and r = √49 = 7."
                ),
                Question(
                    id = 20,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "What is the sum of opposite angles in any cyclic quadrilateral?",
                    options = listOf(
                        QuestionOption("a", "180° (supplementary)"),
                        QuestionOption("b", "90° (complementary)"),
                        QuestionOption("c", "360°"),
                        QuestionOption("d", "270°")
                    ),
                    correctOptionId = "a",
                    explanation = "The opposite angles of a quadrilateral inscribed in a circle always sum to 180°."
                )
            )
        ),
        "math_u6" to Quiz(
            id = "quiz_math_u6",
            title = "Solid Figures Quiz",
            subject = "Mathematics",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "calculator",
            unitId = "math_u6",
            subjectId = "math",
            questions = listOf(
                Question(
                    id = 21,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "What is Euler's polyhedron formula relating Vertices (V), Edges (E), and Faces (F)?",
                    options = listOf(
                        QuestionOption("a", "V - E + F = 2"),
                        QuestionOption("b", "V + E - F = 2"),
                        QuestionOption("c", "V + E + F = 2"),
                        QuestionOption("d", "V - E - F = 0")
                    ),
                    correctOptionId = "a",
                    explanation = "Euler's characteristic for any convex 3D polyhedron states that V - E + F = 2."
                ),
                Question(
                    id = 22,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "What is the formula for the volume of a right circular cone of radius r and height h?",
                    options = listOf(
                        QuestionOption("a", "V = (1/3)πr²h"),
                        QuestionOption("b", "V = πr²h"),
                        QuestionOption("c", "V = (4/3)πr³"),
                        QuestionOption("d", "V = 2πrh")
                    ),
                    correctOptionId = "a",
                    explanation = "A cone has one-third the volume of a cylinder with the same circular base and perpendicular height: V = (1/3)πr²h."
                ),
                Question(
                    id = 23,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "If a sphere has radius r = 3 cm, what is its total surface area?",
                    options = listOf(
                        QuestionOption("a", "36π cm²"),
                        QuestionOption("b", "12π cm²"),
                        QuestionOption("c", "27π cm²"),
                        QuestionOption("d", "9π cm²")
                    ),
                    correctOptionId = "a",
                    explanation = "Surface area of a sphere is 4πr² = 4 · π · 3² = 36π cm²."
                ),
                Question(
                    id = 24,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "A pyramid has a square base with side length 6 m and height 10 m. What is its volume?",
                    options = listOf(
                        QuestionOption("a", "120 m³"),
                        QuestionOption("b", "360 m³"),
                        QuestionOption("c", "60 m³"),
                        QuestionOption("d", "180 m³")
                    ),
                    correctOptionId = "a",
                    explanation = "Volume = (1/3) × Base Area × Height = (1/3) × (6 × 6) × 10 = (1/3) × 36 × 10 = 120 m³."
                )
            )
        ),
        "math_u7" to Quiz(
            id = "quiz_math_u7",
            title = "Coordinate Geometry Quiz",
            subject = "Mathematics",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "calculator",
            unitId = "math_u7",
            subjectId = "math",
            questions = listOf(
                Question(
                    id = 25,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "What is the Euclidean distance between points A(1, 2) and B(4, 6)?",
                    options = listOf(
                        QuestionOption("a", "5 units"),
                        QuestionOption("b", "7 units"),
                        QuestionOption("c", "25 units"),
                        QuestionOption("d", "√14 units")
                    ),
                    correctOptionId = "a",
                    explanation = "d = √((4 - 1)² + (6 - 2)²) = √(3² + 4²) = √(9 + 16) = √25 = 5 units."
                ),
                Question(
                    id = 26,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "What are the coordinates of the midpoint of segment joining P(-2, 8) and Q(6, 4)?",
                    options = listOf(
                        QuestionOption("a", "(2, 6)"),
                        QuestionOption("b", "(4, 12)"),
                        QuestionOption("c", "(2, 4)"),
                        QuestionOption("d", "(8, 2)")
                    ),
                    correctOptionId = "a",
                    explanation = "M = ((x₁ + x₂)/2, (y₁ + y₂)/2) = ((-2 + 6)/2, (8 + 4)/2) = (4/2, 12/2) = (2, 6)."
                ),
                Question(
                    id = 27,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "Two non-vertical lines are perpendicular if and only if the product of their slopes m₁ · m₂ equals:",
                    options = listOf(
                        QuestionOption("a", "-1"),
                        QuestionOption("b", "1"),
                        QuestionOption("c", "0"),
                        QuestionOption("d", "Undefined")
                    ),
                    correctOptionId = "a",
                    explanation = "Perpendicular lines satisfy the negative reciprocal relationship m₁ · m₂ = -1."
                ),
                Question(
                    id = 28,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "What is the perpendicular distance from point (x₀, y₀) to the line Ax + By + C = 0?",
                    options = listOf(
                        QuestionOption("a", "|Ax₀ + By₀ + C| / √(A² + B²)"),
                        QuestionOption("b", "(Ax₀ + By₀ + C) / (A + B)"),
                        QuestionOption("c", "|Ax₀ + By₀| / √(A² + B²)"),
                        QuestionOption("d", "√(A² + B²) / |C|")
                    ),
                    correctOptionId = "a",
                    explanation = "The standard perpendicular point-to-line distance formula is d = |Ax₀ + By₀ + C| / √(A² + B²)."
                )
            )
        ),

        // ==========================================
        // 2. PHYSICS (physics) — 6 units
        // ==========================================
        "physics_u1" to Quiz(
            id = "quiz_physics_u1",
            title = "Vector Quantities Quiz",
            subject = "Physics",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "atom",
            unitId = "physics_u1",
            subjectId = "physics",
            questions = listOf(
                Question(
                    id = 29,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "Which of the following physical quantities is a vector quantity?",
                    options = listOf(
                        QuestionOption("a", "Displacement"),
                        QuestionOption("b", "Speed"),
                        QuestionOption("c", "Mass"),
                        QuestionOption("d", "Temperature")
                    ),
                    correctOptionId = "a",
                    explanation = "Displacement specifies both a magnitude and direction, whereas speed, mass, and temperature are scalar quantities."
                ),
                Question(
                    id = 30,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "Two perpendicular vectors have magnitudes of 6 N and 8 N. What is their resultant magnitude?",
                    options = listOf(
                        QuestionOption("a", "10 N"),
                        QuestionOption("b", "14 N"),
                        QuestionOption("c", "2 N"),
                        QuestionOption("d", "48 N")
                    ),
                    correctOptionId = "a",
                    explanation = "For orthogonal vectors, R = √(A² + B²) = √(6² + 8²) = √(36 + 64) = √100 = 10 N."
                ),
                Question(
                    id = 31,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "What is the scalar (dot) product of two non-zero orthogonal (perpendicular) vectors?",
                    options = listOf(
                        QuestionOption("a", "Zero (0)"),
                        QuestionOption("b", "1"),
                        QuestionOption("c", "Equal to the product of their magnitudes"),
                        QuestionOption("d", "Negative one (-1)")
                    ),
                    correctOptionId = "a",
                    explanation = "A · B = |A||B| cos(90°) = 0, because cos(90°) = 0."
                ),
                Question(
                    id = 32,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "If vector A makes an angle θ with the positive x-axis, its horizontal component A_x is given by:",
                    options = listOf(
                        QuestionOption("a", "A cos(θ)"),
                        QuestionOption("b", "A sin(θ)"),
                        QuestionOption("c", "A tan(θ)"),
                        QuestionOption("d", "A / cos(θ)")
                    ),
                    correctOptionId = "a",
                    explanation = "Resolving along the Cartesian axis gives A_x = A cos(θ) and A_y = A sin(θ)."
                )
            )
        ),
        "physics_u2" to Quiz(
            id = "quiz_physics_u2",
            title = "Uniformly Accelerated Motion Quiz",
            subject = "Physics",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "atom",
            unitId = "physics_u2",
            subjectId = "physics",
            questions = listOf(
                Question(
                    id = 33,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "What does the slope of a velocity-time (v-t) graph represent?",
                    options = listOf(
                        QuestionOption("a", "Acceleration"),
                        QuestionOption("b", "Displacement"),
                        QuestionOption("c", "Velocity"),
                        QuestionOption("d", "Total force")
                    ),
                    correctOptionId = "a",
                    explanation = "The slope of velocity over time (Δv / Δt) represents acceleration."
                ),
                Question(
                    id = 34,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "A car accelerates uniformly from rest at 3 m/s² for 4 seconds. What distance does it cover?",
                    options = listOf(
                        QuestionOption("a", "24 meters"),
                        QuestionOption("b", "12 meters"),
                        QuestionOption("c", "48 meters"),
                        QuestionOption("d", "36 meters")
                    ),
                    correctOptionId = "a",
                    explanation = "s = ut + ½at² = 0 + ½(3)(4)² = ½(3)(16) = 24 meters."
                ),
                Question(
                    id = 35,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "In the absence of air resistance, what is the acceleration of any freely falling body near Earth's surface?",
                    options = listOf(
                        QuestionOption("a", "Approximately 9.8 m/s² directed downwards"),
                        QuestionOption("b", "Proportional to its mass"),
                        QuestionOption("c", "Zero at maximum height"),
                        QuestionOption("d", "9.8 m/s directed horizontally")
                    ),
                    correctOptionId = "a",
                    explanation = "All bodies in free fall experience constant gravitational acceleration g ≈ 9.8 m/s² directed downward regardless of mass."
                ),
                Question(
                    id = 36,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "Which kinematic equation relates final velocity, initial velocity, acceleration, and displacement?",
                    options = listOf(
                        QuestionOption("a", "v² = u² + 2as"),
                        QuestionOption("b", "s = ut + 2a"),
                        QuestionOption("c", "v = u + as²"),
                        QuestionOption("d", "v² = u + at")
                    ),
                    correctOptionId = "a",
                    explanation = "The time-independent kinematic relation is v² = u² + 2as."
                )
            )
        ),
        "physics_u3" to Quiz(
            id = "quiz_physics_u3",
            title = "Elasticity and Static Equilibrium of Rigid Body Quiz",
            subject = "Physics",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "atom",
            unitId = "physics_u3",
            subjectId = "physics",
            questions = listOf(
                Question(
                    id = 37,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "According to Hooke's Law within elastic limits, the restoring force F is proportional to:",
                    options = listOf(
                        QuestionOption("a", "Displacement or extension (x)"),
                        QuestionOption("b", "Square of the extension (x²)"),
                        QuestionOption("c", "Inversely proportional to extension (1/x)"),
                        QuestionOption("d", "Cross-sectional area only")
                    ),
                    correctOptionId = "a",
                    explanation = "Hooke's Law states F = -kx; restoring force is directly proportional to displacement within elastic limits."
                ),
                Question(
                    id = 38,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "What is Young's Modulus of elasticity defined as?",
                    options = listOf(
                        QuestionOption("a", "Tensile Stress divided by Tensile Strain"),
                        QuestionOption("b", "Force multiplied by cross-sectional area"),
                        QuestionOption("c", "Strain divided by Stress"),
                        QuestionOption("d", "Bulk stress multiplied by volume")
                    ),
                    correctOptionId = "a",
                    explanation = "Young's modulus (Y) = Stress / Strain = (F / A) / (ΔL / L₀), measured in Pascals (N/m²)."
                ),
                Question(
                    id = 39,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "What are the two necessary conditions for a rigid body to remain in static equilibrium?",
                    options = listOf(
                        QuestionOption("a", "Net force ΣF = 0 and net torque Στ = 0"),
                        QuestionOption("b", "Constant linear acceleration and zero torque"),
                        QuestionOption("c", "Zero momentum and infinite inertia"),
                        QuestionOption("d", "Equal internal tension and external friction")
                    ),
                    correctOptionId = "a",
                    explanation = "Static equilibrium requires translational balance (ΣF = 0) and rotational balance (Στ = 0)."
                ),
                Question(
                    id = 40,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "Torque (moment of a force) about a pivot is calculated as:",
                    options = listOf(
                        QuestionOption("a", "τ = r · F · sin(θ)"),
                        QuestionOption("b", "τ = F / r"),
                        QuestionOption("c", "τ = m · g · h"),
                        QuestionOption("d", "τ = ½ I ω²")
                    ),
                    correctOptionId = "a",
                    explanation = "Torque equals perpendicular lever arm distance multiplied by applied force: τ = r F sin(θ)."
                )
            )
        ),
        "physics_u4" to Quiz(
            id = "quiz_physics_u4",
            title = "Static and Current Electricity Quiz",
            subject = "Physics",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "atom",
            unitId = "physics_u4",
            subjectId = "physics",
            questions = listOf(
                Question(
                    id = 41,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "According to Coulomb's Law, what happens to electrostatic force between two charges if the distance is doubled?",
                    options = listOf(
                        QuestionOption("a", "It decreases to one-fourth (1/4) of its original value"),
                        QuestionOption("b", "It doubles"),
                        QuestionOption("c", "It halves (1/2)"),
                        QuestionOption("d", "It quadruples")
                    ),
                    correctOptionId = "a",
                    explanation = "Coulomb's Law follows an inverse square law: F ∝ 1/r², so doubling distance reduces force by 2² = 4 times."
                ),
                Question(
                    id = 42,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "According to Ohm's Law, electric current I flowing through an ohmic conductor equals:",
                    options = listOf(
                        QuestionOption("a", "V / R (Voltage divided by Resistance)"),
                        QuestionOption("b", "V · R"),
                        QuestionOption("c", "R / V"),
                        QuestionOption("d", "V² / R")
                    ),
                    correctOptionId = "a",
                    explanation = "Ohm's Law states V = IR, which rearranges to I = V / R."
                ),
                Question(
                    id = 43,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "Three resistors of 2 Ω, 4 Ω, and 6 Ω are connected in series. What is the equivalent resistance?",
                    options = listOf(
                        QuestionOption("a", "12 Ω"),
                        QuestionOption("b", "1.09 Ω"),
                        QuestionOption("c", "6 Ω"),
                        QuestionOption("d", "8 Ω")
                    ),
                    correctOptionId = "a",
                    explanation = "For series circuits, equivalent resistance is the algebraic sum: R_eq = 2 + 4 + 6 = 12 Ω."
                ),
                Question(
                    id = 44,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "What is the electric power dissipated in a circuit with voltage V and current I?",
                    options = listOf(
                        QuestionOption("a", "P = V · I"),
                        QuestionOption("b", "P = V / I"),
                        QuestionOption("c", "P = I² / V"),
                        QuestionOption("d", "P = V² · I")
                    ),
                    correctOptionId = "a",
                    explanation = "Electric power P = V · I = I²R = V² / R, measured in Watts."
                )
            )
        ),
        "physics_u5" to Quiz(
            id = "quiz_physics_u5",
            title = "Magnetism Quiz",
            subject = "Physics",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "atom",
            unitId = "physics_u5",
            subjectId = "physics",
            questions = listOf(
                Question(
                    id = 45,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "Magnetic field lines outside a bar magnet continuously travel from:",
                    options = listOf(
                        QuestionOption("a", "North pole to South pole"),
                        QuestionOption("b", "South pole to North pole"),
                        QuestionOption("c", "Center towards the outer edges"),
                        QuestionOption("d", "East pole to West pole")
                    ),
                    correctOptionId = "a",
                    explanation = "External magnetic field lines emerge from the North pole and enter the South pole in closed loops."
                ),
                Question(
                    id = 46,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "What happens if you break a permanent bar magnet into two equal pieces?",
                    options = listOf(
                        QuestionOption("a", "Each piece becomes a complete magnet with both North and South poles"),
                        QuestionOption("b", "One piece has only a North pole and the other only a South pole"),
                        QuestionOption("c", "Both pieces lose all magnetic properties"),
                        QuestionOption("d", "The magnetic fields cancel out completely")
                    ),
                    correctOptionId = "a",
                    explanation = "Magnetic monopoles do not exist in classical physics; dividing a magnet creates two separate dipoles."
                ),
                Question(
                    id = 47,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "What rule determines the direction of the magnetic force on a moving positive charge in a magnetic field?",
                    options = listOf(
                        QuestionOption("a", "Right-Hand Rule"),
                        QuestionOption("b", "Left-Hand Ohm Rule"),
                        QuestionOption("c", "Archimedes Principle"),
                        QuestionOption("d", "Newton's Third Law")
                    ),
                    correctOptionId = "a",
                    explanation = "Using the right-hand rule (index finger in direction of velocity v, middle finger in direction of B), thumb points in magnetic force F."
                ),
                Question(
                    id = 48,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "What is the magnetic force on a charge moving parallel to a magnetic field?",
                    options = listOf(
                        QuestionOption("a", "Zero (0 N)"),
                        QuestionOption("b", "Maximum possible force"),
                        QuestionOption("c", "F = qvB"),
                        QuestionOption("d", "Negative infinite force")
                    ),
                    correctOptionId = "a",
                    explanation = "F = qvB sin(θ). When velocity is parallel to B, θ = 0° and sin(0°) = 0, so F = 0."
                )
            )
        ),
        "physics_u6" to Quiz(
            id = "quiz_physics_u6",
            title = "Electromagnetic Waves and Geometrical Optics Quiz",
            subject = "Physics",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "atom",
            unitId = "physics_u6",
            subjectId = "physics",
            questions = listOf(
                Question(
                    id = 49,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "What is the speed of electromagnetic waves in a vacuum?",
                    options = listOf(
                        QuestionOption("a", "3.0 × 10⁸ m/s"),
                        QuestionOption("b", "3.0 × 10⁶ m/s"),
                        QuestionOption("c", "343 m/s"),
                        QuestionOption("d", "9.8 × 10⁸ m/s")
                    ),
                    correctOptionId = "a",
                    explanation = "All electromagnetic waves travel at the speed of light c ≈ 3.0 × 10⁸ m/s in a vacuum."
                ),
                Question(
                    id = 50,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "According to the Law of Reflection, the angle of incidence is:",
                    options = listOf(
                        QuestionOption("a", "Equal to the angle of reflection"),
                        QuestionOption("b", "Always greater than the angle of reflection"),
                        QuestionOption("c", "Always 90° to the surface"),
                        QuestionOption("d", "Complementary to the angle of refraction")
                    ),
                    correctOptionId = "a",
                    explanation = "The law of reflection states that angle of incidence equals angle of reflection (θ_i = θ_r) relative to normal."
                ),
                Question(
                    id = 51,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "Snell's Law of refraction relates refractive indices and angles as:",
                    options = listOf(
                        QuestionOption("a", "n₁ sin(θ₁) = n₂ sin(θ₂)"),
                        QuestionOption("b", "n₁ / sin(θ₁) = n₂ / sin(θ₂)"),
                        QuestionOption("c", "n₁ cos(θ₁) = n₂ cos(θ₂)"),
                        QuestionOption("d", "n₁ + sin(θ₁) = n₂ + sin(θ₂)")
                    ),
                    correctOptionId = "a",
                    explanation = "Snell's law describes light bending at optical boundaries: n₁ sin(θ₁) = n₂ sin(θ₂)."
                ),
                Question(
                    id = 52,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "Total internal reflection can only occur when light travels from:",
                    options = listOf(
                        QuestionOption("a", "An optically denser medium to a less dense medium (higher to lower n)"),
                        QuestionOption("b", "A less dense medium into an optically denser medium"),
                        QuestionOption("c", "A vacuum into water at 0° incidence"),
                        QuestionOption("d", "Air into diamond at any angle")
                    ),
                    correctOptionId = "a",
                    explanation = "Total internal reflection requires light to travel from higher refractive index to lower refractive index at an angle greater than critical angle."
                )
            )
        ),

        // ==========================================
        // 3. CHEMISTRY (chemistry) — 6 units
        // ==========================================
        "chem_u1" to Quiz(
            id = "quiz_chem_u1",
            title = "Chemical Reactions and Stoichiometry Quiz",
            subject = "Chemistry",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "beaker",
            unitId = "chem_u1",
            subjectId = "chemistry",
            questions = listOf(
                Question(
                    id = 53,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "What is the value of Avogadro's number, representing the number of entities in one mole?",
                    options = listOf(
                        QuestionOption("a", "6.022 × 10²³ entities/mol"),
                        QuestionOption("b", "3.00 × 10⁸ entities/mol"),
                        QuestionOption("c", "1.602 × 10⁻¹⁹ entities/mol"),
                        QuestionOption("d", "9.81 × 10²³ entities/mol")
                    ),
                    correctOptionId = "a",
                    explanation = "One mole contains Avogadro's constant number of particles: 6.022 × 10²³."
                ),
                Question(
                    id = 54,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "In a chemical reaction, the reactant that is completely consumed first and caps product yield is called:",
                    options = listOf(
                        QuestionOption("a", "Limiting reactant (reagent)"),
                        QuestionOption("b", "Excess reactant"),
                        QuestionOption("c", "Catalytic substrate"),
                        QuestionOption("d", "Spectator reagent")
                    ),
                    correctOptionId = "a",
                    explanation = "The limiting reactant determines the maximum theoretical yield of product formed."
                ),
                Question(
                    id = 55,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "What is the molar mass of water (H₂O), given H = 1.0 g/mol and O = 16.0 g/mol?",
                    options = listOf(
                        QuestionOption("a", "18.0 g/mol"),
                        QuestionOption("b", "17.0 g/mol"),
                        QuestionOption("c", "34.0 g/mol"),
                        QuestionOption("d", "20.0 g/mol")
                    ),
                    correctOptionId = "a",
                    explanation = "Molar mass = 2(1.0) + 16.0 = 18.0 g/mol."
                ),
                Question(
                    id = 56,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "How is percentage yield calculated in a synthesis experiment?",
                    options = listOf(
                        QuestionOption("a", "(Actual Yield / Theoretical Yield) × 100%"),
                        QuestionOption("b", "(Theoretical Yield / Actual Yield) × 100%"),
                        QuestionOption("c", "(Limiting Reagent / Total Mass) × 100%"),
                        QuestionOption("d", "Actual Yield - Theoretical Yield")
                    ),
                    correctOptionId = "a",
                    explanation = "Percentage yield evaluates efficiency by taking (actual experimental yield / theoretical maximum yield) × 100%."
                )
            )
        ),
        "chem_u2" to Quiz(
            id = "quiz_chem_u2",
            title = "Solutions Quiz",
            subject = "Chemistry",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "beaker",
            unitId = "chem_u2",
            subjectId = "chemistry",
            questions = listOf(
                Question(
                    id = 57,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "Molarity (M) of a chemical solution is defined as:",
                    options = listOf(
                        QuestionOption("a", "Moles of solute per liter of solution"),
                        QuestionOption("b", "Grams of solute per kilogram of solvent"),
                        QuestionOption("c", "Moles of solute per kilogram of solvent"),
                        QuestionOption("d", "Milliliters of solute per 100 mL solvent")
                    ),
                    correctOptionId = "a",
                    explanation = "Molarity M = moles of solute / liters of total solution (mol/L)."
                ),
                Question(
                    id = 58,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "A solution that contains the maximum amount of dissolved solute at a given temperature in dynamic equilibrium is:",
                    options = listOf(
                        QuestionOption("a", "Saturated"),
                        QuestionOption("b", "Unsaturated"),
                        QuestionOption("c", "Supersaturated"),
                        QuestionOption("d", "Dilute")
                    ),
                    correctOptionId = "a",
                    explanation = "A saturated solution holds the equilibrium limit of dissolved solute at specified conditions."
                ),
                Question(
                    id = 59,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "Which of the following is a colligative property of a solution?",
                    options = listOf(
                        QuestionOption("a", "Freezing point depression"),
                        QuestionOption("b", "Solution color"),
                        QuestionOption("c", "Viscosity"),
                        QuestionOption("d", "Chemical reactivity")
                    ),
                    correctOptionId = "a",
                    explanation = "Colligative properties depend on the concentration of solute particles, including freezing point depression and boiling point elevation."
                ),
                Question(
                    id = 60,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "What is the Tyndall effect observed in colloidal mixtures?",
                    options = listOf(
                        QuestionOption("a", "Scattering of visible light beams by dispersed colloidal particles"),
                        QuestionOption("b", "Rapid precipitation of solute crystals"),
                        QuestionOption("c", "Formation of a gas bubble matrix"),
                        QuestionOption("d", "Complete optical transparency like true solutions")
                    ),
                    correctOptionId = "a",
                    explanation = "Colloids scatter light rays, making light paths visible through the suspension (Tyndall effect)."
                )
            )
        ),
        "chem_u3" to Quiz(
            id = "quiz_chem_u3",
            title = "Important Inorganic Compounds Quiz",
            subject = "Chemistry",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "beaker",
            unitId = "chem_u3",
            subjectId = "chemistry",
            questions = listOf(
                Question(
                    id = 61,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "According to the Arrhenius definition, an acid is a substance that produces what ions in aqueous solution?",
                    options = listOf(
                        QuestionOption("a", "Hydrogen ions (H⁺ or H₃O⁺)"),
                        QuestionOption("b", "Hydroxide ions (OH⁻)"),
                        QuestionOption("c", "Chloride ions (Cl⁻)"),
                        QuestionOption("d", "Sodium cations (Na⁺)")
                    ),
                    correctOptionId = "a",
                    explanation = "Arrhenius acids dissociate in water to generate hydrogen/hydronium ions (H⁺/H₃O⁺)."
                ),
                Question(
                    id = 62,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "A neutral solution at 25°C has a pH value of:",
                    options = listOf(
                        QuestionOption("a", "7.0"),
                        QuestionOption("b", "0.0"),
                        QuestionOption("c", "14.0"),
                        QuestionOption("d", "1.0")
                    ),
                    correctOptionId = "a",
                    explanation = "At 25°C, pH 7 represents neutrality where [H⁺] = [OH⁻] = 1.0 × 10⁻⁷ M."
                ),
                Question(
                    id = 63,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "What products are formed in a neutralization reaction between hydrochloric acid (HCl) and sodium hydroxide (NaOH)?",
                    options = listOf(
                        QuestionOption("a", "Sodium chloride salt and water (NaCl + H₂O)"),
                        QuestionOption("b", "Hydrogen gas and chlorine gas"),
                        QuestionOption("c", "Sodium hydride and oxygen"),
                        QuestionOption("d", "Carbon dioxide and salt")
                    ),
                    correctOptionId = "a",
                    explanation = "Acid + Base → Salt + Water: HCl + NaOH → NaCl + H₂O."
                ),
                Question(
                    id = 64,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "Which of the following oxides is classified as an acidic oxide?",
                    options = listOf(
                        QuestionOption("a", "Sulfur dioxide (SO₂)"),
                        QuestionOption("b", "Calcium oxide (CaO)"),
                        QuestionOption("c", "Sodium oxide (Na₂O)"),
                        QuestionOption("d", "Magnesium oxide (MgO)")
                    ),
                    correctOptionId = "a",
                    explanation = "Non-metal oxides such as SO₂ react with water to form acids (H₂SO₃), making them acidic oxides."
                )
            )
        ),
        "chem_u4" to Quiz(
            id = "quiz_chem_u4",
            title = "Energy Changes and Electro-Chemistry Quiz",
            subject = "Chemistry",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "beaker",
            unitId = "chem_u4",
            subjectId = "chemistry",
            questions = listOf(
                Question(
                    id = 65,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "An exothermic chemical reaction is characterized by:",
                    options = listOf(
                        QuestionOption("a", "Release of heat energy into surroundings (negative ΔH)"),
                        QuestionOption("b", "Absorption of heat from surroundings (positive ΔH)"),
                        QuestionOption("c", "Zero enthalpy change (ΔH = 0)"),
                        QuestionOption("d", "Decrease in overall entropy alone")
                    ),
                    correctOptionId = "a",
                    explanation = "Exothermic reactions release thermal energy, producing a negative enthalpy change (ΔH < 0)."
                ),
                Question(
                    id = 66,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "In an electrochemical cell, which process occurs at the cathode?",
                    options = listOf(
                        QuestionOption("a", "Reduction (gain of electrons)"),
                        QuestionOption("b", "Oxidation (loss of electrons)"),
                        QuestionOption("c", "Anion precipitation"),
                        QuestionOption("d", "Electrolyte combustion")
                    ),
                    correctOptionId = "a",
                    explanation = "Remember 'Red Cat': Reduction always takes place at the Cathode in electrochemical systems."
                ),
                Question(
                    id = 67,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "What is the function of the salt bridge in a galvanic (voltaic) cell?",
                    options = listOf(
                        QuestionOption("a", "Maintains electrical neutrality by allowing ion migration between half-cells"),
                        QuestionOption("b", "Transfers electrons directly through the solution"),
                        QuestionOption("c", "Increases external voltage to infinity"),
                        QuestionOption("d", "Prevents oxidation at the anode")
                    ),
                    correctOptionId = "a",
                    explanation = "The salt bridge permits ions to flow between half-cells to neutralize charge buildup, completing the circuit."
                ),
                Question(
                    id = 68,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "In the redox reaction Zn + Cu²⁺ → Zn²⁺ + Cu, which species undergoes oxidation?",
                    options = listOf(
                        QuestionOption("a", "Zinc (Zn)"),
                        QuestionOption("b", "Copper ion (Cu²⁺)"),
                        QuestionOption("c", "Copper metal (Cu)"),
                        QuestionOption("d", "Zinc ion (Zn²⁺)")
                    ),
                    correctOptionId = "a",
                    explanation = "Zinc loses 2 electrons (Zn → Zn²⁺ + 2e⁻), so Zn is oxidized."
                )
            )
        ),
        "chem_u5" to Quiz(
            id = "quiz_chem_u5",
            title = "Metals and Non Metals Quiz",
            subject = "Chemistry",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "beaker",
            unitId = "chem_u5",
            subjectId = "chemistry",
            questions = listOf(
                Question(
                    id = 69,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "Which of the following properties is characteristic of most metals?",
                    options = listOf(
                        QuestionOption("a", "High electrical and thermal conductivity, malleability, and ductility"),
                        QuestionOption("b", "Brittle nature and poor thermal conduction"),
                        QuestionOption("c", "Tendency to readily gain electrons to form anions"),
                        QuestionOption("d", "Low melting point and dull non-reflective surface")
                    ),
                    correctOptionId = "a",
                    explanation = "Metals have delocalized sea-of-electrons giving them conductivity, malleability, and ductility."
                ),
                Question(
                    id = 70,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "In the reactivity series of metals, which metal is the most reactive among the following?",
                    options = listOf(
                        QuestionOption("a", "Potassium (K)"),
                        QuestionOption("b", "Iron (Fe)"),
                        QuestionOption("c", "Copper (Cu)"),
                        QuestionOption("d", "Gold (Au)")
                    ),
                    correctOptionId = "a",
                    explanation = "Potassium is an alkali metal located at the very top of the activity series, reacting vigorously even with cold water."
                ),
                Question(
                    id = 71,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "What is an alloy?",
                    options = listOf(
                        QuestionOption("a", "A homogeneous mixture of a metal with one or more other metals or non-metals"),
                        QuestionOption("b", "A pure non-metallic ionic crystal"),
                        QuestionOption("c", "A radioactive isotope of copper"),
                        QuestionOption("d", "A chemical compound of oxygen and sulfur")
                    ),
                    correctOptionId = "a",
                    explanation = "An alloy (e.g., bronze, steel, brass) is a metallic mixture designed to enhance strength and corrosion resistance."
                ),
                Question(
                    id = 72,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "Which non-metal is an electrical conductor in its allotropic form?",
                    options = listOf(
                        QuestionOption("a", "Carbon (as graphite)"),
                        QuestionOption("b", "Sulfur"),
                        QuestionOption("c", "Phosphorus"),
                        QuestionOption("d", "Oxygen")
                    ),
                    correctOptionId = "a",
                    explanation = "Graphite has planar layers of sp²-hybridized carbon with free delocalized pi electrons that conduct electricity."
                )
            )
        ),
        "chem_u6" to Quiz(
            id = "quiz_chem_u6",
            title = "Hydrocarbons and Their Natural Sources Quiz",
            subject = "Chemistry",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "beaker",
            unitId = "chem_u6",
            subjectId = "chemistry",
            questions = listOf(
                Question(
                    id = 73,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "What is the general molecular formula for acyclic saturated hydrocarbons (alkanes)?",
                    options = listOf(
                        QuestionOption("a", "C_n H_(2n+2)"),
                        QuestionOption("b", "C_n H_(2n)"),
                        QuestionOption("c", "C_n H_(2n-2)"),
                        QuestionOption("d", "C_n H_n")
                    ),
                    correctOptionId = "a",
                    explanation = "Alkanes have the general molecular formula C_n H_(2n+2) with single C-C bonds."
                ),
                Question(
                    id = 74,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "What type of chemical reaction is characteristic of unsaturated alkenes due to their double bond?",
                    options = listOf(
                        QuestionOption("a", "Addition reaction"),
                        QuestionOption("b", "Substitution reaction only"),
                        QuestionOption("c", "Precipitation reaction"),
                        QuestionOption("d", "Electrochemical neutralization")
                    ),
                    correctOptionId = "a",
                    explanation = "Alkenes possess reactive pi bonds that readily undergo addition of halogens, hydrogen, and hydrogen halides."
                ),
                Question(
                    id = 75,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "What primary industrial process separates crude petroleum into distinct gasoline, kerosene, and diesel fractions?",
                    options = listOf(
                        QuestionOption("a", "Fractional distillation"),
                        QuestionOption("b", "Electrochemical electrolysis"),
                        QuestionOption("c", "Paper chromatography"),
                        QuestionOption("d", "Thermal calcination")
                    ),
                    correctOptionId = "a",
                    explanation = "Fractional distillation separates crude oil hydrocarbons based on differences in their boiling points."
                ),
                Question(
                    id = 76,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "Complete combustion of a hydrocarbon fuel in excess oxygen produces which two products?",
                    options = listOf(
                        QuestionOption("a", "Carbon dioxide (CO₂) and water (H₂O)"),
                        QuestionOption("b", "Carbon monoxide (CO) and hydrogen gas (H₂)"),
                        QuestionOption("c", "Carbon black and ozone"),
                        QuestionOption("d", "Methane and oxygen")
                    ),
                    correctOptionId = "a",
                    explanation = "Complete combustion of any hydrocarbon yields carbon dioxide and water vapor: C_x H_y + O₂ → CO₂ + H₂O + Heat."
                )
            )
        )
    )
}
