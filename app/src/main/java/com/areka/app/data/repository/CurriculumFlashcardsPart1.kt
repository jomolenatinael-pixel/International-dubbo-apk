package com.areka.app.data.repository

import com.areka.app.data.model.Flashcard

/**
 * High-quality Grade 10 Ethiopian New Curriculum Flashcards (Part 1).
 * Mathematics (7 units) & Physics (6 units) - 7 to 8 cards per unit.
 */
object CurriculumFlashcardsPart1 {

    val cards: List<Flashcard> = listOf(
        // ==========================================
        // 1. MATHEMATICS (math) — 7 units
        // ==========================================
        // Unit 1: Relations and Functions
        Flashcard("fc_m1_1", "math", "math_u1", "Relation", "A subset of the Cartesian product A × B, consisting of a collection of ordered pairs (x, y)."),
        Flashcard("fc_m1_2", "math", "math_u1", "Function", "A special relation where every element in the domain is mapped to exactly one unique element in the codomain."),
        Flashcard("fc_m1_3", "math", "math_u1", "Domain and Range", "Domain is the set of all valid input values (x-values); Range is the set of all resulting output values (y-values)."),
        Flashcard("fc_m1_4", "math", "math_u1", "Vertical Line Test", "A curve in the xy-plane represents a function if and only if no vertical line intersects it at more than one point."),
        Flashcard("fc_m1_5", "math", "math_u1", "Horizontal Line Test", "Determines if a function is one-to-one (injective); every horizontal line must cross the graph at most once."),
        Flashcard("fc_m1_6", "math", "math_u1", "Composite Function (f ∘ g)(x)", "Applying function g first, then applying f to the result: (f ∘ g)(x) = f(g(x))."),
        Flashcard("fc_m1_7", "math", "math_u1", "Inverse Function f⁻¹(x)", "A function that reverses the operation of f; exists if and only if f is bijective (one-to-one and onto)."),

        // Unit 2: Polynomial Functions
        Flashcard("fc_m2_1", "math", "math_u2", "Polynomial Function", "A function of the form P(x) = aₙxⁿ + aₙ₋₁xⁿ⁻¹ + ... + a₁x + a₀, where n is a non-negative integer."),
        Flashcard("fc_m2_2", "math", "math_u2", "Degree of a Polynomial", "The highest power n of the variable x that possesses a non-zero coefficient aₙ."),
        Flashcard("fc_m2_3", "math", "math_u2", "Remainder Theorem", "When a polynomial P(x) is divided by (x - c), the resulting remainder is equal to P(c)."),
        Flashcard("fc_m2_4", "math", "math_u2", "Factor Theorem", "The linear binomial (x - c) is a factor of polynomial P(x) if and only if P(c) = 0."),
        Flashcard("fc_m2_5", "math", "math_u2", "Rational Root Theorem", "Any rational zero p/q of a polynomial with integer coefficients must have p dividing a₀ and q dividing aₙ."),
        Flashcard("fc_m2_6", "math", "math_u2", "Fundamental Theorem of Algebra", "Every polynomial of degree n ≥ 1 has exactly n complex roots (counting algebraic multiplicities)."),
        Flashcard("fc_m2_7", "math", "math_u2", "Synthetic Division", "A streamlined shortcut method of dividing a polynomial by a linear binomial of the form (x - c)."),

        // Unit 3: Exponential and Logarithmic Functions
        Flashcard("fc_m3_1", "math", "math_u3", "Exponential Function", "A function defined as f(x) = bˣ, where base b > 0 and b ≠ 1; domain is all real numbers."),
        Flashcard("fc_m3_2", "math", "math_u3", "Natural Base e", "An irrational mathematical constant approximately equal to 2.71828, foundational in continuous compounding."),
        Flashcard("fc_m3_3", "math", "math_u3", "Logarithmic Function", "The inverse of the exponential function: y = log_b(x) is equivalent to bʸ = x (x > 0)."),
        Flashcard("fc_m3_4", "math", "math_u3", "Product Rule for Logarithms", "log_b(M · N) = log_b(M) + log_b(N)."),
        Flashcard("fc_m3_5", "math", "math_u3", "Quotient Rule for Logarithms", "log_b(M / N) = log_b(M) - log_b(N)."),
        Flashcard("fc_m3_6", "math", "math_u3", "Power Rule for Logarithms", "log_b(Mᵏ) = k · log_b(M)."),
        Flashcard("fc_m3_7", "math", "math_u3", "Change of Base Formula", "log_b(x) = ln(x) / ln(b) = log₁₀(x) / log₁₀(b)."),

        // Unit 4: Trigonometric Functions
        Flashcard("fc_m4_1", "math", "math_u4", "Radian Measure", "The angle subtended at the circle center by an arc equal in length to radius: π rad = 180°."),
        Flashcard("fc_m4_2", "math", "math_u4", "Unit Circle Definition", "A circle of radius r = 1 centered at origin where coordinates of a terminal point are (cos θ, sin θ)."),
        Flashcard("fc_m4_3", "math", "math_u4", "Pythagorean Identity", "sin²(θ) + cos²(θ) = 1, valid for all real angles θ."),
        Flashcard("fc_m4_4", "math", "math_u4", "Tangent Ratio", "tan(θ) = sin(θ) / cos(θ) = Opposite / Adjacent in right-angled triangles."),
        Flashcard("fc_m4_5", "math", "math_u4", "Periodicity of Sine and Cosine", "Both sin(x) and cos(x) repeat their waveform cycle every 2π radians (period = 2π)."),
        Flashcard("fc_m4_6", "math", "math_u4", "Reciprocal Trig Functions", "csc(θ) = 1/sin(θ), sec(θ) = 1/cos(θ), and cot(θ) = 1/tan(θ)."),
        Flashcard("fc_m4_7", "math", "math_u4", "Signs of Trig Ratios (CAST)", "All positive in Q I; Sine in Q II; Tangent in Q III; Cosine in Q IV."),

        // Unit 5: Circles
        Flashcard("fc_m5_1", "math", "math_u5", "Equation of a Circle", "Standard Cartesian form: (x - h)² + (y - k)² = r², with center (h, k) and radius r."),
        Flashcard("fc_m5_2", "math", "math_u5", "Tangent to a Circle", "A line touching a circle at exactly one point; always perpendicular to the radius at that point."),
        Flashcard("fc_m5_3", "math", "math_u5", "Inscribed Angle Theorem", "The measure of an inscribed angle is half the measure of its intercepted central arc: θ = ½ arc."),
        Flashcard("fc_m5_4", "math", "math_u5", "Thales's Theorem", "An angle inscribed inside a semicircle is always a right angle (90°)."),
        Flashcard("fc_m5_5", "math", "math_u5", "Cyclic Quadrilateral", "A 4-sided polygon whose vertices all lie on a circle; opposite angles sum to 180°."),
        Flashcard("fc_m5_6", "math", "math_u5", "Secant Line", "A line that intersects a circle at two distinct points, containing a chord."),
        Flashcard("fc_m5_7", "math", "math_u5", "Arc Length Formula", "Length of an arc s = r · θ, where central angle θ is measured in radians."),

        // Unit 6: Solid Figures
        Flashcard("fc_m6_1", "math", "math_u6", "Euler's Polyhedron Formula", "For any convex polyhedron with V vertices, E edges, and F faces: V - E + F = 2."),
        Flashcard("fc_m6_2", "math", "math_u6", "Cylinder Volume and Area", "Volume V = πr²h; Total Surface Area A = 2πrh + 2πr²."),
        Flashcard("fc_m6_3", "math", "math_u6", "Right Circular Cone Volume", "Volume V = (1/3)πr²h; one-third of a cylinder with matching radius and height."),
        Flashcard("fc_m6_4", "math", "math_u6", "Sphere Volume and Surface", "Volume V = (4/3)πr³; Total Surface Area A = 4πr²."),
        Flashcard("fc_m6_5", "math", "math_u6", "Pyramid Volume", "Volume V = (1/3) × Base Area × Height for any regular base."),
        Flashcard("fc_m6_6", "math", "math_u6", "Frustum of a Cone", "The sliced portion of a cone between its base and a parallel cutting plane: V = (1/3)πh(R² + Rr + r²)."),
        Flashcard("fc_m6_7", "math", "math_u6", "Prism Volume", "Volume V = Base Area × Height; lateral faces are parallelograms."),

        // Unit 7: Coordinate Geometry
        Flashcard("fc_m7_1", "math", "math_u7", "Distance Formula", "d = √((x₂ - x₁)² + (y₂ - y₁)²), derived directly from the Pythagorean theorem."),
        Flashcard("fc_m7_2", "math", "math_u7", "Midpoint Coordinates", "M = ((x₁ + x₂)/2, (y₁ + y₂)/2), calculating the exact midpoint of a line segment."),
        Flashcard("fc_m7_3", "math", "math_u7", "Slope of a Line", "m = (y₂ - y₁) / (x₂ - x₁), measuring the vertical rise per unit horizontal run."),
        Flashcard("fc_m7_4", "math", "math_u7", "Perpendicular Line Slopes", "Two non-vertical lines are perpendicular if their slopes multiply to -1: m₁ · m₂ = -1."),
        Flashcard("fc_m7_5", "math", "math_u7", "Point-Slope Form", "y - y₁ = m(x - x₁), convenient when given a point and the directional slope."),
        Flashcard("fc_m7_6", "math", "math_u7", "Point-to-Line Distance", "d = |Ax₀ + By₀ + C| / √(A² + B²) from point (x₀, y₀) to line Ax + By + C = 0."),
        Flashcard("fc_m7_7", "math", "math_u7", "Section Formula", "Finds coordinates dividing a segment in ratio m:n: ((mx₂ + nx₁)/(m + n), (my₂ + ny₁)/(m + n))."),

        // ==========================================
        // 2. PHYSICS (physics) — 6 units
        // ==========================================
        // Unit 1: Vector Quantities
        Flashcard("fc_p1_1", "physics", "physics_u1", "Scalar vs Vector", "Scalars have magnitude only (e.g., speed, mass); vectors have both magnitude and direction (e.g., force, velocity)."),
        Flashcard("fc_p1_2", "physics", "physics_u1", "Vector Resolution", "Breaking a 2D vector into orthogonal Cartesian components: A_x = A cos θ, A_y = A sin θ."),
        Flashcard("fc_p1_3", "physics", "physics_u1", "Resultant Vector", "The single vector representing the combined net effect of two or more individual vectors."),
        Flashcard("fc_p1_4", "physics", "physics_u1", "Scalar (Dot) Product", "A · B = |A||B| cos θ; produces a scalar; equals 0 when vectors are perpendicular."),
        Flashcard("fc_p1_5", "physics", "physics_u1", "Vector (Cross) Product", "A × B = |A||B| sin θ n̂; results in a vector perpendicular to both operand vectors."),
        Flashcard("fc_p1_6", "physics", "physics_u1", "Unit Vector", "A vector with magnitude exactly equal to 1, used solely to indicate spatial direction (î, ĵ, k̂)."),
        Flashcard("fc_p1_7", "physics", "physics_u1", "Parallelogram Law of Vectors", "If two vectors are represented as adjacent sides of a parallelogram, the diagonal represents their resultant."),

        // Unit 2: Uniformly Accelerated Motion
        Flashcard("fc_p2_1", "physics", "physics_u2", "Uniform Acceleration", "Motion in which velocity changes at a constant, steady rate over equal intervals of time (a = Δv/Δt)."),
        Flashcard("fc_p2_2", "physics", "physics_u2", "First Kinematic Equation", "v = u + at, relating initial velocity, acceleration, elapsed time, and final velocity."),
        Flashcard("fc_p2_3", "physics", "physics_u2", "Displacement Equation", "s = ut + ½at², determining position under constant linear acceleration."),
        Flashcard("fc_p2_4", "physics", "physics_u2", "Time-Independent Kinematic Equation", "v² = u² + 2as, connecting velocities, acceleration, and total distance without time."),
        Flashcard("fc_p2_5", "physics", "physics_u2", "Free Fall Acceleration", "Motion solely influenced by gravity; near Earth's surface, downward g ≈ 9.8 m/s²."),
        Flashcard("fc_p2_6", "physics", "physics_u2", "Velocity-Time Slope & Area", "Slope of v-t curve represents acceleration; total area under the v-t curve represents displacement."),
        Flashcard("fc_p2_7", "physics", "physics_u2", "Projectile Motion", "2D motion combining constant horizontal velocity (a_x = 0) with vertical gravitational free fall (a_y = -g)."),

        // Unit 3: Elasticity and Static Equilibrium of Rigid Body
        Flashcard("fc_p3_1", "physics", "physics_u3", "Hooke's Law", "F = -kx; restoring force of an elastic spring is directly proportional to displacement within elastic limit."),
        Flashcard("fc_p3_2", "physics", "physics_u3", "Stress (Tensile/Compressive)", "Internal restoring force per unit cross-sectional area: σ = F / A (measured in Pascals, N/m²)."),
        Flashcard("fc_p3_3", "physics", "physics_u3", "Strain", "Fractional deformation or relative change in dimension: ε = ΔL / L₀ (dimensionless ratio)."),
        Flashcard("fc_p3_4", "physics", "physics_u3", "Young's Modulus (Y)", "The ratio of tensile stress to tensile strain within elastic limits: Y = (F/A) / (ΔL/L₀)."),
        Flashcard("fc_p3_5", "physics", "physics_u3", "First Condition of Equilibrium", "Translational equilibrium: the vector sum of all external forces acting on a rigid body is zero (ΣF = 0)."),
        Flashcard("fc_p3_6", "physics", "physics_u3", "Second Condition of Equilibrium", "Rotational equilibrium: the algebraic sum of all external torques about any pivot point is zero (Στ = 0)."),
        Flashcard("fc_p3_7", "physics", "physics_u3", "Torque (Moment of Force)", "Rotational turning effect: τ = r F sin θ, measured in Newton-meters (N·m)."),

        // Unit 4: Static and Current Electricity
        Flashcard("fc_p4_1", "physics", "physics_u4", "Coulomb's Law", "F = k|q₁q₂| / r²; electrostatic force between charges is proportional to product of charges and inverse square of distance."),
        Flashcard("fc_p4_2", "physics", "physics_u4", "Electric Field Intensity (E)", "Force experienced per unit positive test charge: E = F / q (N/C or V/m)."),
        Flashcard("fc_p4_3", "physics", "physics_u4", "Ohm's Law", "Electric current through an ohmic conductor is directly proportional to potential difference: V = I · R."),
        Flashcard("fc_p4_4", "physics", "physics_u4", "Series Resistor Formula", "R_total = R₁ + R₂ + R₃; identical current flows through each series component."),
        Flashcard("fc_p4_5", "physics", "physics_u4", "Parallel Resistor Formula", "1/R_total = 1/R₁ + 1/R₂ + 1/R₃; voltage remains identical across all parallel branches."),
        Flashcard("fc_p4_6", "physics", "physics_u4", "Electric Power", "Rate of electrical energy transfer: P = V · I = I²R = V² / R (measured in Watts)."),
        Flashcard("fc_p4_7", "physics", "physics_u4", "Resistivity (ρ)", "Intrinsic material resistance: R = ρL / A, depending on substance temperature and atomic lattice."),

        // Unit 5: Magnetism
        Flashcard("fc_p5_1", "physics", "physics_u5", "Magnetic Dipole", "Magnets always possess pairs of North and South poles; isolated magnetic monopoles do not exist in classical physics."),
        Flashcard("fc_p5_2", "physics", "physics_u5", "Magnetic Field Lines", "Continuous closed loops directed externally from North pole to South pole and internally South to North."),
        Flashcard("fc_p5_3", "physics", "physics_u5", "Magnetic Lorentz Force", "F = qvB sin θ; force on a moving charge q with velocity v inside magnetic field B."),
        Flashcard("fc_p5_4", "physics", "physics_u5", "Right-Hand Rule for Force", "Index finger in direction of velocity v, middle finger along field B; thumb indicates magnetic force on positive charge."),
        Flashcard("fc_p5_5", "physics", "physics_u5", "Magnetic Force on Wire", "F = I L B sin θ; force acting on a current-carrying conductor placed within a magnetic field."),
        Flashcard("fc_p5_6", "physics", "physics_u5", "Electromagnetic Induction", "Inducing an electromotive force (EMF) in a closed circuit via time-varying magnetic flux (Faraday's Law)."),
        Flashcard("fc_p5_7", "physics", "physics_u5", "Lenz's Law", "The direction of an induced current always opposes the change in magnetic flux that produced it."),

        // Unit 6: Electromagnetic Waves and Geometrical Optics
        Flashcard("fc_p6_1", "physics", "physics_u6", "Electromagnetic Wave Nature", "Transverse waves consisting of oscillating electric and magnetic fields traveling at c ≈ 3.0 × 10⁸ m/s in vacuum."),
        Flashcard("fc_p6_2", "physics", "physics_u6", "Electromagnetic Spectrum", "Radio waves, Microwaves, Infrared, Visible Light, Ultraviolet, X-rays, Gamma rays (in order of increasing frequency)."),
        Flashcard("fc_p6_3", "physics", "physics_u6", "Law of Reflection", "Angle of incidence equals angle of reflection (θ_i = θ_r), both measured relative to the normal line."),
        Flashcard("fc_p6_4", "physics", "physics_u6", "Snell's Law of Refraction", "n₁ sin θ₁ = n₂ sin θ₂; governs light bending when moving between media of differing optical density."),
        Flashcard("fc_p6_5", "physics", "physics_u6", "Index of Refraction (n)", "Ratio of speed of light in vacuum to speed in medium: n = c / v (always n ≥ 1)."),
        Flashcard("fc_p6_6", "physics", "physics_u6", "Total Internal Reflection", "Occurs when light hits an interface with lower refractive index at an angle exceeding critical angle θ_c."),
        Flashcard("fc_p6_7", "physics", "physics_u6", "Thin Lens Equation", "1/f = 1/d_o + 1/d_i, relating focal length f, object distance d_o, and image distance d_i.")
    )
}
