package com.areka.app.data.repository

import com.areka.app.data.model.*

/**
 * Official Ethiopian MoE Grade 10 NEW Curriculum data repository.
 * Exactly 9 subjects with 66 official units as listed in the Ministry of Education Grade 10 student textbooks.
 */
object CurriculumData {

    val subjects: List<SubjectItem> = listOf(
        SubjectItem(
            id = "math",
            name = "Mathematics",
            iconType = "calculator",
            quizCount = 7,
            accentColorHex = 0xFF3B82F6,
            description = "Relations, Functions, Polynomials, Exponentials, Trig, Circles & Geometry"
        ),
        SubjectItem(
            id = "physics",
            name = "Physics",
            iconType = "atom",
            quizCount = 6,
            accentColorHex = 0xFF8B5CF6,
            description = "Vectors, Accelerated Motion, Elasticity, Electricity, Magnetism & Optics"
        ),
        SubjectItem(
            id = "chemistry",
            name = "Chemistry",
            iconType = "beaker",
            quizCount = 6,
            accentColorHex = 0xFF00D2FF,
            description = "Reactions, Stoichiometry, Solutions, Inorganics, Electro-Chemistry & Hydrocarbons"
        ),
        SubjectItem(
            id = "biology",
            name = "Biology",
            iconType = "dna",
            quizCount = 6,
            accentColorHex = 0xFF10B981,
            description = "Sub-fields, Plants, Biomolecules, Cell Reproduction, Human Biology & Ecology"
        ),
        SubjectItem(
            id = "geography",
            name = "Geography",
            iconType = "globe",
            quizCount = 8,
            accentColorHex = 0xFF14B8A6,
            description = "African Landforms, Climate, Resources, Demographics, Environment & Geospatial GIS"
        ),
        SubjectItem(
            id = "civics",
            name = "Citizenship / Civics",
            iconType = "balance",
            quizCount = 8,
            accentColorHex = 0xFFF59E0B,
            description = "Democracy, Digital Age, Governance, Indigenous Conflict Resolution, Federalism & Rights"
        ),
        SubjectItem(
            id = "economics",
            name = "Economics",
            iconType = "trending_up",
            quizCount = 8,
            accentColorHex = 0xFFEC4899,
            description = "Consumer Behaviour, Demand & Supply, Production & Cost, Markets, Banking & Ethiopian Economy"
        ),
        SubjectItem(
            id = "history",
            name = "History",
            iconType = "pillar",
            quizCount = 9,
            accentColorHex = 0xFFE11D48,
            description = "Capitalism, Colonial Scramble, Ethiopian Modernization, World Wars & Indigenous Heritages"
        ),
        SubjectItem(
            id = "health_pe",
            name = "Health & Physical Education",
            iconType = "fitness",
            quizCount = 8,
            accentColorHex = 0xFF84CC16,
            description = "Sport in Society, Physical Fitness, Athletics, Football, Volleyball, Basketball & Ethics"
        )
    )

    val units: List<SubjectUnit> = listOf(
        // ==========================================
        // 1. Mathematics (id: math) — 7 units
        // ==========================================
        SubjectUnit("math_u1", "math", 1, "Relations and Functions", "Domain, range, mappings, composite functions, and invertible functions", 7, 1),
        SubjectUnit("math_u2", "math", 2, "Polynomial Functions", "Degree, Remainder theorem, Factor theorem, synthetic division, and roots", 7, 1),
        SubjectUnit("math_u3", "math", 3, "Exponential and Logarithmic Functions", "Exponential growth, base e, logarithmic properties, and asymptotes", 7, 1),
        SubjectUnit("math_u4", "math", 4, "Trigonometric Functions", "Radian measure, unit circle, trigonometric ratios, identities, and graphs", 7, 1),
        SubjectUnit("math_u5", "math", 5, "Circles", "Standard equation, tangent lines, inscribed angles, chords, and cyclic quadrilaterals", 7, 1),
        SubjectUnit("math_u6", "math", 6, "Solid Figures", "Euler's formula, surface area and volume of prisms, cylinders, cones, and spheres", 7, 1),
        SubjectUnit("math_u7", "math", 7, "Coordinate Geometry", "Distance formula, midpoint, slope, parallel/perpendicular lines, and point-to-line distance", 7, 1),

        // ==========================================
        // 2. Physics (id: physics) — 6 units
        // ==========================================
        SubjectUnit("physics_u1", "physics", 1, "Vector Quantities", "Scalars vs vectors, resolution into components, scalar dot and vector cross products", 7, 1),
        SubjectUnit("physics_u2", "physics", 2, "Uniformly Accelerated Motion", "Kinematic equations, free fall acceleration, projectile motion, and velocity-time graphs", 7, 1),
        SubjectUnit("physics_u3", "physics", 3, "Elasticity and Static Equilibrium of Rigid Body", "Hooke's law, stress, strain, Young's modulus, and conditions for static equilibrium", 7, 1),
        SubjectUnit("physics_u4", "physics", 4, "Static and Current Electricity", "Coulomb's law, electric field, Ohm's law, series/parallel circuits, and electrical power", 7, 1),
        SubjectUnit("physics_u5", "physics", 5, "Magnetism", "Magnetic dipoles, magnetic field lines, Lorentz force, right-hand rule, and induction", 7, 1),
        SubjectUnit("physics_u6", "physics", 6, "Electromagnetic Waves and Geometrical Optics", "EM spectrum, law of reflection, Snell's law of refraction, lenses, and total internal reflection", 7, 1),

        // ==========================================
        // 3. Chemistry (id: chemistry) — 6 units
        // ==========================================
        SubjectUnit("chem_u1", "chemistry", 1, "Chemical Reactions and Stoichiometry", "The mole concept, molar mass, limiting reactants, theoretical yield, and percentage yield", 7, 1),
        SubjectUnit("chem_u2", "chemistry", 2, "Solutions", "Solute-solvent interactions, molarity concentration, saturation, and colligative properties", 7, 1),
        SubjectUnit("chem_u3", "chemistry", 3, "Important Inorganic Compounds", "Arrhenius and Bronsted-Lowry acids/bases, pH scale, neutralization, and industrial processes", 7, 1),
        SubjectUnit("chem_u4", "chemistry", 4, "Energy Changes and Electro-Chemistry", "Exothermic vs endothermic reactions, activation energy, galvanic cells, and redox processes", 7, 1),
        SubjectUnit("chem_u5", "chemistry", 5, "Metals and Non Metals", "Metallic bonding, reactivity series, metallurgical extraction, alloys, and carbon allotropes", 7, 1),
        SubjectUnit("chem_u6", "chemistry", 6, "Hydrocarbons and Their Natural Sources", "Alkanes, alkenes, alkynes, fractional distillation of crude petroleum, and combustion", 7, 1),

        // ==========================================
        // 4. Biology (id: biology) — 6 units
        // ==========================================
        SubjectUnit("bio_u1", "biology", 1, "Sub-fields of Biology", "Microbiology, cytology, genetics, ecology, physiology, taxonomy, and biotechnology", 7, 1),
        SubjectUnit("bio_u2", "biology", 2, "Plants", "Xylem and phloem vascular transport, chloroplasts, stomata regulation, and plant hormones", 7, 1),
        SubjectUnit("bio_u3", "biology", 3, "Biochemical Molecules", "Carbohydrates, proteins, lipids, nucleic acids (DNA/RNA), ATP, and enzyme kinetics", 7, 1),
        SubjectUnit("bio_u4", "biology", 4, "Cell Reproduction", "Cell cycle, stages of mitosis (PMAT), meiosis, crossing over, and cytokinesis", 7, 1),
        SubjectUnit("bio_u5", "biology", 5, "Human Biology", "Circulatory system, nephron kidney filtration, digestion, endocrine insulin regulation, and nerves", 7, 1),
        SubjectUnit("bio_u6", "biology", 6, "Ecological Interaction", "Symbiosis, trophic food webs, 10% energy transfer rule, nitrogen cycle, and succession", 7, 1),

        // ==========================================
        // 5. Geography (id: geography) — 8 units
        // ==========================================
        SubjectUnit("geo_u1", "geography", 1, "Land-forms of Africa", "East African Rift System, Mount Kilimanjaro, Ethiopian Plateau, Atlas, and drainage basins", 7, 1),
        SubjectUnit("geo_u2", "geography", 2, "Climate of Africa", "ITCZ convergence, equatorial rainforests, savannas, Mediterranean zones, and lapse rate", 7, 1),
        SubjectUnit("geo_u3", "geography", 3, "Natural Resource Base of Africa", "Congo rainforest, GERD Blue Nile hydroelectric power, Copperbelt minerals, and renewables", 7, 1),
        SubjectUnit("geo_u4", "geography", 4, "Population of Africa", "Demographics, youthful age structure, population density, fertility rates, and rural-urban influx", 7, 1),
        SubjectUnit("geo_u5", "geography", 5, "Major Economic and Cultural Activities of Africa", "Agriculture, shifting cultivation, pastoralism, coffee exports, informal economy, and AfCFTA", 7, 1),
        SubjectUnit("geo_u6", "geography", 6, "Human – Natural Environment Interactions", "Desertification, deforestation, contour terracing, watershed management, and agroforestry", 7, 1),
        SubjectUnit("geo_u7", "geography", 7, "Geographic Issues and Public Concerns in Africa", "Great Green Wall, climate vulnerability, urbanization pressure, food security, and SDGs", 7, 1),
        SubjectUnit("geo_u8", "geography", 8, "Geospatial Information and Data Processing", "GIS systems, satellite remote sensing, GPS navigation, vector and raster spatial models", 7, 1),

        // ==========================================
        // 6. Citizenship / Civics (id: civics) — 8 units
        // ==========================================
        SubjectUnit("civics_u1", "civics", 1, "Democracy and Democratization", "Popular sovereignty, representative democracy, rule of law, separation of powers, and pluralism", 7, 1),
        SubjectUnit("civics_u2", "civics", 2, "Citizens in the Digital Technology Age", "Digital citizenship, media literacy, combating disinformation, e-governance, and cybersecurity", 7, 1),
        SubjectUnit("civics_u3", "civics", 3, "Understanding Good Governance", "Transparency, accountability, anti-corruption mechanisms, public responsiveness, and civil society", 7, 1),
        SubjectUnit("civics_u4", "civics", 4, "Peace and Indigenous Conflict Resolution Mechanisms", "Positive peace, Jaarsummaa, Shimagile elders, Abo Gereb, and restorative community justice", 7, 1),
        SubjectUnit("civics_u5", "civics", 5, "Federalism in Ethiopia", "FDRE Constitution, House of Federation (HoF), HoPR, unity in diversity, and fiscal federalism", 7, 1),
        SubjectUnit("civics_u6", "civics", 6, "Human Rights", "UDHR principles, universality, civil/political rights, economic/social rights, and EHRC role", 7, 1),
        SubjectUnit("civics_u7", "civics", 7, "Patriotism", "Democratic patriotism, Battle of Adwa heritage, civic volunteering, and defending common welfare", 7, 1),
        SubjectUnit("civics_u8", "civics", 8, "Globalization and Global Issues", "Global interconnectedness, multilateralism, African Union vision, and transnational challenges", 7, 1),

        // ==========================================
        // 7. Economics (id: economics) — 8 units
        // ==========================================
        SubjectUnit("econ_u1", "economics", 1, "Theory of Consumer Behaviour", "Utility, law of diminishing marginal utility, indifference curves, and consumer equilibrium", 7, 1),
        SubjectUnit("econ_u2", "economics", 2, "Theories of Demand and Supply", "Laws of demand/supply, market equilibrium price, price elasticity, and curve shifts", 7, 1),
        SubjectUnit("econ_u3", "economics", 3, "Theories of Production and Cost", "Short run vs long run, law of diminishing returns, fixed/variable costs, and economies of scale", 7, 1),
        SubjectUnit("econ_u4", "economics", 4, "Market Structure", "Perfect competition, monopoly, oligopoly, monopolistic competition, and profit maximization (MR=MC)", 7, 1),
        SubjectUnit("econ_u5", "economics", 5, "Banking and Finance", "Functions of money, National Bank of Ethiopia, fractional reserve banking, and monetary policy", 7, 1),
        SubjectUnit("econ_u6", "economics", 6, "Economic Growth", "GDP, real vs nominal output, per capita living standards, economic development, and HDI", 7, 1),
        SubjectUnit("econ_u7", "economics", 7, "The Ethiopian Economy", "Agricultural exports, Homegrown Economic Reform, trade deficit, service sector, and industrial parks", 7, 1),
        SubjectUnit("econ_u8", "economics", 8, "Business Startups and Innovation", "Entrepreneurship, business plans, Minimum Viable Product (MVP), incubators, and intellectual property", 7, 1),

        // ==========================================
        // 8. History (id: history) — 9 units
        // ==========================================
        SubjectUnit("hist_u1", "history", 1, "Development of Capitalism and Nationalism 1815–1914", "Congress of Vienna, German and Italian unification, industrial capitalism, and imperial expansion", 7, 1),
        SubjectUnit("hist_u2", "history", 2, "Africa & the Colonial Experience (1880s–1960s)", "Berlin Conference, Scramble for Africa, direct/indirect rule, Maji Maji revolt, and extraction", 7, 1),
        SubjectUnit("hist_u3", "history", 3, "Social, Economic & Political Developments in Ethiopia mid-19th C. to 1941", "Tewodros II centralization, Battle of Adwa (1896), Treaty of Wuchale, Menelik II, and Arbegnoch resistance", 7, 1),
        SubjectUnit("hist_u4", "history", 4, "Society and Politics in the Age of World Wars 1914–1945", "World War I causes, Treaty of Versailles, rise of fascism, League of Nations failure, and World War II", 7, 1),
        SubjectUnit("hist_u5", "history", 5, "Global and Regional Developments Since 1945", "Cold War superpower rivalry, founding of United Nations, Non-Aligned Movement, and OAU establishment (1963)", 7, 1),
        SubjectUnit("hist_u6", "history", 6, "Ethiopia: Internal Developments and External Influences from 1941 to 1991", "Post-1941 restoration, student movement 'Land to the Tiller', 1974 revolution, Derg land reform, and 1991 fall", 7, 1),
        SubjectUnit("hist_u7", "history", 7, "Africa Since 1960", "1960 Year of Africa decolonization, dismantling of Apartheid, Nelson Mandela, and African Union transformation", 7, 1),
        SubjectUnit("hist_u8", "history", 8, "Post-1991 Developments in Ethiopia", "1995 FDRE Constitution, Eritrean independence referendum, Ethio-Eritrean border war, and 2018 transition", 7, 1),
        SubjectUnit("hist_u9", "history", 9, "Indigenous Knowledge and Heritages of Ethiopia", "Aksumite stelae, Lalibela rock-hewn churches, Gadaa system, Fasil Ghebbi, Harar Jugol, and traditional medicine", 7, 1),

        // ==========================================
        // 9. Health & Physical Education (id: health_pe) — 8 units
        // ==========================================
        SubjectUnit("health_u1", "health_pe", 1, "Sport and Society", "Socializing roles of sport, Abebe Bikila legacy, traditional Ethiopian games (Genna/Gugs), and inclusion", 7, 1),
        SubjectUnit("health_u2", "health_pe", 2, "Health and Physical Fitness", "Five fitness components, F.I.T.T. principle, target heart rate, aerobic endurance, and overload", 7, 1),
        SubjectUnit("health_u3", "health_pe", 3, "Athletics", "Sprints, Ethiopian distance running dominance, relay baton exchanges, jumps, and throwing field events", 7, 1),
        SubjectUnit("health_u4", "health_pe", 4, "Football", "Laws of the Game, 11-player pitch positions, offside rule, set pieces, passing, and tactical positioning", 7, 1),
        SubjectUnit("health_u5", "health_pe", 5, "Volleyball", "Court dimensions, three-hit sequence (bump-set-spike), clockwise rotation, rally scoring, and Libero", 7, 1),
        SubjectUnit("health_u6", "health_pe", 6, "Basketball", "5-player court play, shooting values (2pt/3pt), dribbling rules, traveling, fouls, and 24-second shot clock", 7, 1),
        SubjectUnit("health_u7", "health_pe", 7, "Handball", "40×20m court, 7-player teams, 3-step/3-second rules, 6-meter goal crease, and jump shot mechanics", 7, 1),
        SubjectUnit("health_u8", "health_pe", 8, "Self-Defense and Sport Ethics", "Personal safety, conflict de-escalation, fair play sportsmanship, anti-doping rules, and R.I.C.E. protocol", 7, 1)
    )

    val flashcards: List<Flashcard> = 
        CurriculumFlashcardsPart1.cards +
        CurriculumFlashcardsPart2.cards +
        CurriculumFlashcardsPart3.cards +
        CurriculumFlashcardsPart4.cards

    private val allQuizzesMap: Map<String, Quiz> = 
        CurriculumQuizzesPart1.quizzes +
        CurriculumQuizzesPart2.quizzes +
        CurriculumQuizzesPart3.quizzes +
        CurriculumHistoryQuizImport.quizzes

    fun getUnitsForSubject(subjectId: String): List<SubjectUnit> {
        return units.filter { it.subjectId == subjectId }
    }

    fun getFlashcardsForUnit(unitId: String): List<Flashcard> {
        return flashcards.filter { it.unitId == unitId }
    }

    fun getQuizForUnit(unitId: String): Quiz {
        val handAuthored = allQuizzesMap[unitId]
        if (handAuthored != null) {
            return handAuthored
        }

        // Fallback generator if a specific unit is queried dynamically
        val unit = units.find { it.id == unitId } ?: units.first()
        val subject = subjects.find { it.id == unit.subjectId } ?: subjects.first()
        val unitCards = getFlashcardsForUnit(unit.id)

        val questions = unitCards.take(4).mapIndexed { index, card ->
            val wrongOptions = unitCards
                .filter { it.id != card.id }
                .sortedBy { "${unit.id}:${it.id}:wrong".hashCode() }
                .map { it.back }
                .take(3)
            val allOptionTexts = (listOf(card.back) + wrongOptions)
                .sortedBy { "${unit.id}:$index:${it.hashCode()}".hashCode() }
            val correctIndex = allOptionTexts.indexOf(card.back)
            val correctId = ('a'.code + (if (correctIndex >= 0) correctIndex else 0)).toChar().toString()

            val optionLetters = listOf("a", "b", "c", "d")
            val options = allOptionTexts.take(4).mapIndexed { optIdx, optText ->
                QuestionOption(optionLetters.getOrElse(optIdx) { "a" }, optText)
            }

            Question(
                id = 500 + index,
                questionNumber = index + 1,
                totalQuestions = unitCards.take(4).size,
                text = "What is the key principle or definition for: ${card.front}?",
                options = options,
                correctOptionId = correctId,
                explanation = "${card.front}: ${card.back}"
            )
        }

        return Quiz(
            id = "quiz_${unit.id}",
            title = "${unit.title} Quiz",
            subject = subject.name,
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = subject.iconType,
            unitId = unit.id,
            subjectId = subject.id,
            questions = questions
        )
    }
}
