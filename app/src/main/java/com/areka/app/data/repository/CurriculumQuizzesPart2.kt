package com.areka.app.data.repository

import com.areka.app.data.model.Question
import com.areka.app.data.model.QuestionOption
import com.areka.app.data.model.Quiz

/**
 * Hand-authored, curriculum-aligned multiple choice quizzes for Ethiopian MoE Grade 10 New Curriculum.
 * Part 2: Biology (6 units), Geography (8 units), Citizenship/Civics (8 units) - Total 22 units
 */
object CurriculumQuizzesPart2 {

    val quizzes: Map<String, Quiz> = mapOf(
        // ==========================================
        // 4. BIOLOGY (biology) — 6 units
        // ==========================================
        "bio_u1" to Quiz(
            id = "quiz_bio_u1",
            title = "Sub-fields of Biology Quiz",
            subject = "Biology",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "dna",
            unitId = "bio_u1",
            subjectId = "biology",
            questions = listOf(
                Question(
                    id = 77,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "Which biological sub-field is specifically dedicated to the study of microscopic organisms such as bacteria and viruses?",
                    options = listOf(
                        QuestionOption("a", "Microbiology"),
                        QuestionOption("b", "Ecology"),
                        QuestionOption("c", "Ornithology"),
                        QuestionOption("d", "Morphology")
                    ),
                    correctOptionId = "a",
                    explanation = "Microbiology investigates microscopic unicellular and acellular organisms."
                ),
                Question(
                    id = 78,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "What is the primary scientific focus of Cytology?",
                    options = listOf(
                        QuestionOption("a", "Structure, function, and life history of cells"),
                        QuestionOption("b", "Fossil records and evolutionary timelines"),
                        QuestionOption("c", "Animal behavior in wildlife reserves"),
                        QuestionOption("d", "Classification of flowering plants")
                    ),
                    correctOptionId = "a",
                    explanation = "Cytology (cell biology) focuses on cellular physiology, anatomy, and biochemical mechanisms."
                ),
                Question(
                    id = 79,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "The study of interactions between living organisms and their physical environment is called:",
                    options = listOf(
                        QuestionOption("a", "Ecology"),
                        QuestionOption("b", "Anatomy"),
                        QuestionOption("c", "Histology"),
                        QuestionOption("d", "Genetics")
                    ),
                    correctOptionId = "a",
                    explanation = "Ecology analyzes biotic and abiotic relationships in ecosystems."
                ),
                Question(
                    id = 80,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "Taxonomy is the branch of biological science concerned with:",
                    options = listOf(
                        QuestionOption("a", "Classification, naming, and identification of organisms"),
                        QuestionOption("b", "Measurement of enzyme kinetic rates"),
                        QuestionOption("c", "Microscopic tissue slicing"),
                        QuestionOption("d", "Plant hormone synthesis")
                    ),
                    correctOptionId = "a",
                    explanation = "Taxonomy organizes organisms into systematic hierarchical groups using binomial nomenclature."
                )
            )
        ),
        "bio_u2" to Quiz(
            id = "quiz_bio_u2",
            title = "Plants Quiz",
            subject = "Biology",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "dna",
            unitId = "bio_u2",
            subjectId = "biology",
            questions = listOf(
                Question(
                    id = 81,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "Which specialized vascular tissue in plants is responsible for transporting water and dissolved minerals from roots to leaves?",
                    options = listOf(
                        QuestionOption("a", "Xylem"),
                        QuestionOption("b", "Phloem"),
                        QuestionOption("c", "Cambium"),
                        QuestionOption("d", "Pith")
                    ),
                    correctOptionId = "a",
                    explanation = "Xylem vessels conduct water and minerals upward using transpirational pull."
                ),
                Question(
                    id = 82,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "In which organelle of plant cells does photosynthesis take place?",
                    options = listOf(
                        QuestionOption("a", "Chloroplast"),
                        QuestionOption("b", "Mitochondria"),
                        QuestionOption("c", "Endoplasmic reticulum"),
                        QuestionOption("d", "Centriole")
                    ),
                    correctOptionId = "a",
                    explanation = "Chloroplasts contain chlorophyll pigments that capture light energy for photosynthesis."
                ),
                Question(
                    id = 83,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "What is the primary function of plant stomata?",
                    options = listOf(
                        QuestionOption("a", "Regulating gas exchange (CO₂ and O₂) and water transpiration"),
                        QuestionOption("b", "Absorbing sunlight directly into roots"),
                        QuestionOption("c", "Synthesizing cellulose for stems"),
                        QuestionOption("d", "Storing starch grains")
                    ),
                    correctOptionId = "a",
                    explanation = "Stomata bounded by guard cells control gas exchange and transpirational water loss."
                ),
                Question(
                    id = 84,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "Which plant hormone stimulates stem elongation and phototropic curvature towards light?",
                    options = listOf(
                        QuestionOption("a", "Auxin"),
                        QuestionOption("b", "Ethylene"),
                        QuestionOption("c", "Abscisic acid"),
                        QuestionOption("d", "Cytokinin")
                    ),
                    correctOptionId = "a",
                    explanation = "Auxin promotes cell elongation on the shaded side of stems, causing phototropism."
                )
            )
        ),
        "bio_u3" to Quiz(
            id = "quiz_bio_u3",
            title = "Biochemical Molecules Quiz",
            subject = "Biology",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "dna",
            unitId = "bio_u3",
            subjectId = "biology",
            questions = listOf(
                Question(
                    id = 85,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "What are the fundamental monomer building blocks of proteins?",
                    options = listOf(
                        QuestionOption("a", "Amino acids"),
                        QuestionOption("b", "Monosaccharides"),
                        QuestionOption("c", "Nucleotides"),
                        QuestionOption("d", "Fatty acids")
                    ),
                    correctOptionId = "a",
                    explanation = "Proteins are polymers constructed from 20 standard amino acid monomers linked by peptide bonds."
                ),
                Question(
                    id = 86,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "Which macromolecule serves as the universal energy currency for cellular reactions?",
                    options = listOf(
                        QuestionOption("a", "Adenosine triphosphate (ATP)"),
                        QuestionOption("b", "Deoxyribonucleic acid (DNA)"),
                        QuestionOption("c", "Cellulose"),
                        QuestionOption("d", "Cholesterol")
                    ),
                    correctOptionId = "a",
                    explanation = "ATP hydrolyzes high-energy phosphoanhydride bonds to drive metabolic activities."
                ),
                Question(
                    id = 87,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "In DNA, which nitrogenous base pairs complementarily with Adenine (A)?",
                    options = listOf(
                        QuestionOption("a", "Thymine (T)"),
                        QuestionOption("b", "Cytosine (C)"),
                        QuestionOption("c", "Guanine (G)"),
                        QuestionOption("d", "Uracil (U)")
                    ),
                    correctOptionId = "a",
                    explanation = "In DNA, Adenine forms two hydrogen bonds with Thymine (A-T)."
                ),
                Question(
                    id = 88,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "Enzymes catalyze biochemical reactions by:",
                    options = listOf(
                        QuestionOption("a", "Lowering the activation energy barrier of the reaction"),
                        QuestionOption("b", "Raising the overall enthalpy of products"),
                        QuestionOption("c", "Changing the net equilibrium position"),
                        QuestionOption("d", "Acting as consumed reactants")
                    ),
                    correctOptionId = "a",
                    explanation = "Enzymes accelerate reaction velocity by stabilizing transition states and lowering activation energy."
                )
            )
        ),
        "bio_u4" to Quiz(
            id = "quiz_bio_u4",
            title = "Cell Reproduction Quiz",
            subject = "Biology",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "dna",
            unitId = "bio_u4",
            subjectId = "biology",
            questions = listOf(
                Question(
                    id = 89,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "What is the primary biological outcome of mitosis in somatic cells?",
                    options = listOf(
                        QuestionOption("a", "Two genetically identical diploid daughter cells"),
                        QuestionOption("b", "Four genetically diverse haploid gametes"),
                        QuestionOption("c", "Eight polyploid stem cells"),
                        QuestionOption("d", "Replication of RNA viruses")
                    ),
                    correctOptionId = "a",
                    explanation = "Mitosis produces two daughter cells with identical chromosome complements for growth and repair."
                ),
                Question(
                    id = 90,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "During which phase of the cell cycle is nuclear DNA replicated?",
                    options = listOf(
                        QuestionOption("a", "S phase (Synthesis phase) of Interphase"),
                        QuestionOption("b", "Prophase"),
                        QuestionOption("c", "Metaphase"),
                        QuestionOption("d", "Telophase")
                    ),
                    correctOptionId = "a",
                    explanation = "DNA replication occurs during the S phase of interphase before mitosis begins."
                ),
                Question(
                    id = 91,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "Crossing over (genetic recombination) occurs during which stage of meiosis?",
                    options = listOf(
                        QuestionOption("a", "Prophase I"),
                        QuestionOption("b", "Metaphase II"),
                        QuestionOption("c", "Anaphase I"),
                        QuestionOption("d", "Telophase II")
                    ),
                    correctOptionId = "a",
                    explanation = "Homologous chromosomes pair up and exchange non-sister chromatid segments during Prophase I."
                ),
                Question(
                    id = 92,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "During which stage of mitosis do sister chromatids separate and move towards opposite poles?",
                    options = listOf(
                        QuestionOption("a", "Anaphase"),
                        QuestionOption("b", "Prophase"),
                        QuestionOption("c", "Metaphase"),
                        QuestionOption("d", "Cytokinesis")
                    ),
                    correctOptionId = "a",
                    explanation = "In anaphase, centromeres split and spindle fibers pull sister chromatids to opposite poles."
                )
            )
        ),
        "bio_u5" to Quiz(
            id = "quiz_bio_u5",
            title = "Human Biology Quiz",
            subject = "Biology",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "dna",
            unitId = "bio_u5",
            subjectId = "biology",
            questions = listOf(
                Question(
                    id = 93,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "Which blood vessel carries oxygenated blood from the lungs into the left atrium of the heart?",
                    options = listOf(
                        QuestionOption("a", "Pulmonary vein"),
                        QuestionOption("b", "Pulmonary artery"),
                        QuestionOption("c", "Aorta"),
                        QuestionOption("d", "Vena cava")
                    ),
                    correctOptionId = "a",
                    explanation = "Pulmonary veins are the only veins carrying freshly oxygenated blood from lungs to heart."
                ),
                Question(
                    id = 94,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "What is the structural and functional filtration unit of the human kidney?",
                    options = listOf(
                        QuestionOption("a", "Nephron"),
                        QuestionOption("b", "Alveolus"),
                        QuestionOption("c", "Neuron"),
                        QuestionOption("d", "Hepatocyte")
                    ),
                    correctOptionId = "a",
                    explanation = "Each kidney contains over one million nephrons filtering blood and forming urine."
                ),
                Question(
                    id = 95,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "Where does the chemical digestion of dietary proteins begin in the human alimentary canal?",
                    options = listOf(
                        QuestionOption("a", "Stomach (via pepsin and hydrochloric acid)"),
                        QuestionOption("b", "Mouth cavity"),
                        QuestionOption("c", "Large intestine"),
                        QuestionOption("d", "Esophagus")
                    ),
                    correctOptionId = "a",
                    explanation = "Gastric juice contains hydrochloric acid and pepsinogen (activated into pepsin) to cleave protein chains."
                ),
                Question(
                    id = 96,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "Which hormone secreted by pancreatic beta cells lowers blood glucose levels?",
                    options = listOf(
                        QuestionOption("a", "Insulin"),
                        QuestionOption("b", "Glucagon"),
                        QuestionOption("c", "Adrenaline"),
                        QuestionOption("d", "Thyroxine")
                    ),
                    correctOptionId = "a",
                    explanation = "Insulin enables cells to uptake glucose from bloodstream and convert excess into glycogen."
                )
            )
        ),
        "bio_u6" to Quiz(
            id = "quiz_bio_u6",
            title = "Ecological Interaction Quiz",
            subject = "Biology",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "dna",
            unitId = "bio_u6",
            subjectId = "biology",
            questions = listOf(
                Question(
                    id = 97,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "A symbiotic relationship in which both participating species derive mutual benefit is known as:",
                    options = listOf(
                        QuestionOption("a", "Mutualism"),
                        QuestionOption("b", "Parasitism"),
                        QuestionOption("c", "Commensalism"),
                        QuestionOption("d", "Amensalism")
                    ),
                    correctOptionId = "a",
                    explanation = "Mutualism (+/+) benefits both interacting species, such as mycorrhizal fungi and plant roots."
                ),
                Question(
                    id = 98,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "Approximately what percentage of energy is transferred from one trophic level to the next in an ecosystem?",
                    options = listOf(
                        QuestionOption("a", "10%"),
                        QuestionOption("b", "50%"),
                        QuestionOption("c", "90%"),
                        QuestionOption("d", "100%")
                    ),
                    correctOptionId = "a",
                    explanation = "According to Lindeman's 10% law, only about 10% of chemical energy transfers between adjacent trophic levels."
                ),
                Question(
                    id = 99,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "What is the primary role of saprophytic decomposers in an ecosystem?",
                    options = listOf(
                        QuestionOption("a", "Recycling inorganic nutrients from dead organic matter back into soil and atmosphere"),
                        QuestionOption("b", "Directly fixing atmospheric nitrogen for carnivores"),
                        QuestionOption("c", "Generating primary organic biomass from sunlight"),
                        QuestionOption("d", "Controlling apex predator population numbers")
                    ),
                    correctOptionId = "a",
                    explanation = "Decomposers break down dead biomass, cycling essential minerals and carbon back into the biome."
                ),
                Question(
                    id = 100,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "What is ecological succession starting on a newly formed volcanic rock surface called?",
                    options = listOf(
                        QuestionOption("a", "Primary succession"),
                        QuestionOption("b", "Secondary succession"),
                        QuestionOption("c", "Climax regression"),
                        QuestionOption("d", "Eutrophication")
                    ),
                    correctOptionId = "a",
                    explanation = "Primary succession begins in lifeless areas devoid of previous soil (e.g., bare rock or lava beds)."
                )
            )
        ),

        // ==========================================
        // 5. GEOGRAPHY (geography) — 8 units
        // ==========================================
        "geo_u1" to Quiz(
            id = "quiz_geo_u1",
            title = "Land-forms of Africa Quiz",
            subject = "Geography",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "globe",
            unitId = "geo_u1",
            subjectId = "geography",
            questions = listOf(
                Question(
                    id = 101,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "What major geological feature extends over 6,000 km from the Red Sea down through East Africa?",
                    options = listOf(
                        QuestionOption("a", "The East African Rift System (Great Rift Valley)"),
                        QuestionOption("b", "The Atlas Mountain Fold System"),
                        QuestionOption("c", "The Congo Basin Depression"),
                        QuestionOption("d", "The Kalahari Escarpment")
                    ),
                    correctOptionId = "a",
                    explanation = "The East African Rift System is an active tectonic divergent plate boundary spanning East Africa."
                ),
                Question(
                    id = 102,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "What is the highest mountain peak on the African continent?",
                    options = listOf(
                        QuestionOption("a", "Mount Kilimanjaro (5,895 m)"),
                        QuestionOption("b", "Mount Kenya"),
                        QuestionOption("c", "Ras Dejen"),
                        QuestionOption("d", "Mount Toubkal")
                    ),
                    correctOptionId = "a",
                    explanation = "Mount Kilimanjaro in Tanzania is Africa's highest summit, standing at 5,895 meters above sea level."
                ),
                Question(
                    id = 103,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "The Ethiopian Highlands are often described as the 'Roof of Africa' because of:",
                    options = listOf(
                        QuestionOption("a", "The largest contiguous area of land over 2,000 meters in altitude in Africa"),
                        QuestionOption("b", "Their position along the equator"),
                        QuestionOption("c", "Dense tropical rainforest canopies"),
                        QuestionOption("d", "Vast low-lying limestone caverns")
                    ),
                    correctOptionId = "a",
                    explanation = "The Ethiopian Plateau forms the largest continuous elevated high-altitude landmass across the continent."
                ),
                Question(
                    id = 104,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "Which of the following is a major fold mountain range in Northwestern Africa?",
                    options = listOf(
                        QuestionOption("a", "Atlas Mountains"),
                        QuestionOption("b", "Drakensberg Mountains"),
                        QuestionOption("c", "Simien Mountains"),
                        QuestionOption("d", "Ruwenzori Mountains")
                    ),
                    correctOptionId = "a",
                    explanation = "The Atlas Mountains formed via tectonic collision between the Eurasian and African plates in Northwest Africa."
                )
            )
        ),
        "geo_u2" to Quiz(
            id = "quiz_geo_u2",
            title = "Climate of Africa Quiz",
            subject = "Geography",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "globe",
            unitId = "geo_u2",
            subjectId = "geography",
            questions = listOf(
                Question(
                    id = 105,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "What is the Inter-Tropical Convergence Zone (ITCZ) that drives rainfall patterns in Africa?",
                    options = listOf(
                        QuestionOption("a", "Low-pressure belt where northeast and southeast trade winds converge"),
                        QuestionOption("b", "High-pressure zone producing permanent polar cold winds"),
                        QuestionOption("c", "Sub-surface cold ocean current"),
                        QuestionOption("d", "Jet stream confined to the Mediterranean coastline")
                    ),
                    correctOptionId = "a",
                    explanation = "The ITCZ is the equatorial trough where trade winds converge, triggering heavy convectional rainfall."
                ),
                Question(
                    id = 106,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "What type of climate is characterized by warm dry summers and mild rainy winters along the northern and southwestern tips of Africa?",
                    options = listOf(
                        QuestionOption("a", "Mediterranean Climate"),
                        QuestionOption("b", "Equatorial Rainforest Climate"),
                        QuestionOption("c", "Desert (Arid) Climate"),
                        QuestionOption("d", "Tundra Climate")
                    ),
                    correctOptionId = "a",
                    explanation = "Mediterranean climate brings winter cyclonic rains and dry hot summer seasons."
                ),
                Question(
                    id = 107,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "Which cold ocean current contributes significantly to the aridity of the Namib Desert in Southwestern Africa?",
                    options = listOf(
                        QuestionOption("a", "Benguela Current"),
                        QuestionOption("b", "Mozambique Current"),
                        QuestionOption("c", "Guinea Current"),
                        QuestionOption("d", "Agulhas Current")
                    ),
                    correctOptionId = "a",
                    explanation = "The cold Benguela Current cools onshore coastal breezes, suppressing evaporation and causing desertification."
                ),
                Question(
                    id = 108,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "How does altitude generally influence climate in high-elevation African plateaus like Ethiopia?",
                    options = listOf(
                        QuestionOption("a", "Temperature decreases by about 6.5°C per 1,000 meters elevation gain (normal lapse rate)"),
                        QuestionOption("b", "Atmospheric temperature doubles with height"),
                        QuestionOption("c", "Rainfall completely ceases above 1,500 meters"),
                        QuestionOption("d", "Humidity becomes 100% at all elevations")
                    ),
                    correctOptionId = "a",
                    explanation = "The environmental lapse rate causes higher elevations to have cooler, temperate climates."
                )
            )
        ),
        "geo_u3" to Quiz(
            id = "quiz_geo_u3",
            title = "Natural Resource Base of Africa Quiz",
            subject = "Geography",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "globe",
            unitId = "geo_u3",
            subjectId = "geography",
            questions = listOf(
                Question(
                    id = 109,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "Which river basin contains Africa's largest contiguous tropical rainforest ecosystem?",
                    options = listOf(
                        QuestionOption("a", "Congo River Basin"),
                        QuestionOption("b", "Nile River Basin"),
                        QuestionOption("c", "Niger River Basin"),
                        QuestionOption("d", "Zambezi River Basin")
                    ),
                    correctOptionId = "a",
                    explanation = "The Congo Basin houses the second largest tropical rainforest on Earth, rich in biodiversity and timber."
                ),
                Question(
                    id = 110,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "What major hydroelectric landmark is located on the Blue Nile in Ethiopia, designed to power regional economic development?",
                    options = listOf(
                        QuestionOption("a", "Grand Ethiopian Renaissance Dam (GERD)"),
                        QuestionOption("b", "Aswan High Dam"),
                        QuestionOption("c", "Kariba Dam"),
                        QuestionOption("d", "Akosombo Dam")
                    ),
                    correctOptionId = "a",
                    explanation = "The GERD is the largest hydroelectric infrastructure project in Africa, located on the Abbay (Blue Nile)."
                ),
                Question(
                    id = 111,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "The 'Copperbelt' is a major mineral-rich geological corridor located across which two African nations?",
                    options = listOf(
                        QuestionOption("a", "Zambia and DR Congo"),
                        QuestionOption("b", "Kenya and Tanzania"),
                        QuestionOption("c", "Ghana and Senegal"),
                        QuestionOption("d", "Egypt and Sudan")
                    ),
                    correctOptionId = "a",
                    explanation = "The Central African Copperbelt spans Northern Zambia and Southern DR Congo, holding global copper and cobalt reserves."
                ),
                Question(
                    id = 112,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "Renewable natural resources differ from non-renewable mineral resources because renewable resources:",
                    options = listOf(
                        QuestionOption("a", "Can naturally regenerate over human timescales if sustainably managed"),
                        QuestionOption("b", "Are completely inexhaustible regardless of human usage"),
                        QuestionOption("c", "Can never be degraded or polluted"),
                        QuestionOption("d", "Cannot be converted into useful energy")
                    ),
                    correctOptionId = "a",
                    explanation = "Renewable resources (water, forests, wildlife) regenerate through natural cycles under sustainable management."
                )
            )
        ),
        "geo_u4" to Quiz(
            id = "quiz_geo_u4",
            title = "Population of Africa Quiz",
            subject = "Geography",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "globe",
            unitId = "geo_u4",
            subjectId = "geography",
            questions = listOf(
                Question(
                    id = 113,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "What is the most populous nation on the African continent?",
                    options = listOf(
                        QuestionOption("a", "Nigeria"),
                        QuestionOption("b", "Ethiopia"),
                        QuestionOption("c", "Egypt"),
                        QuestionOption("d", "South Africa")
                    ),
                    correctOptionId = "a",
                    explanation = "Nigeria is Africa's most populous nation, followed by Ethiopia as the second most populous."
                ),
                Question(
                    id = 114,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "An expansive population pyramid with a broad base and narrow tapering apex indicates:",
                    options = listOf(
                        QuestionOption("a", "High birth rate and a predominantly youthful demographic structure"),
                        QuestionOption("b", "An aging population with declining birth rates"),
                        QuestionOption("c", "Equal proportion of elderly retirees and infants"),
                        QuestionOption("d", "Zero demographic population growth")
                    ),
                    correctOptionId = "a",
                    explanation = "A broad base reflects high fertility rates and a large percentage of youth in the demographic structure."
                ),
                Question(
                    id = 115,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "What is the demographic term for the arithmetic ratio of total population to total surface area?",
                    options = listOf(
                        QuestionOption("a", "Population density (persons per km²)"),
                        QuestionOption("b", "Dependency ratio"),
                        QuestionOption("c", "Rate of natural increase"),
                        QuestionOption("d", "Total fertility rate")
                    ),
                    correctOptionId = "a",
                    explanation = "Crude population density divides population by land area in square kilometers."
                ),
                Question(
                    id = 116,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "What is the predominant internal migration trend observed across contemporary African nations?",
                    options = listOf(
                        QuestionOption("a", "Rural-to-urban migration fueling rapid urbanization"),
                        QuestionOption("b", "Urban-to-rural resettlement"),
                        QuestionOption("c", "Cross-continental migration only"),
                        QuestionOption("d", "Abandonment of coastal port cities")
                    ),
                    correctOptionId = "a",
                    explanation = "Seeking education and employment, millions migrate from agrarian villages to growing metropolitan hubs."
                )
            )
        ),
        "geo_u5" to Quiz(
            id = "quiz_geo_u5",
            title = "Major Economic and Cultural Activities of Africa Quiz",
            subject = "Geography",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "globe",
            unitId = "geo_u5",
            subjectId = "geography",
            questions = listOf(
                Question(
                    id = 117,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "What sector of economic activity employs the largest share of the labor force across sub-Saharan Africa?",
                    options = listOf(
                        QuestionOption("a", "Agriculture (Primary sector)"),
                        QuestionOption("b", "Heavy automotive manufacturing"),
                        QuestionOption("c", "Information software engineering"),
                        QuestionOption("d", "High-seas commercial shipping")
                    ),
                    correctOptionId = "a",
                    explanation = "Agriculture employs over 50% of the active labor force in many African countries, providing food and exports."
                ),
                Question(
                    id = 118,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "What type of agricultural system involves farmers clearing plots, cultivating for a few years, and moving on as fertility declines?",
                    options = listOf(
                        QuestionOption("a", "Shifting cultivation (slash-and-burn)"),
                        QuestionOption("b", "Commercial mechanized monoculture"),
                        QuestionOption("c", "Intensive hydroponic farming"),
                        QuestionOption("d", "Urban rooftop gardening")
                    ),
                    correctOptionId = "a",
                    explanation = "Shifting cultivation relies on natural forest regeneration across rotational fallow intervals."
                ),
                Question(
                    id = 119,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "Which of the following is a leading cash-crop export for Ethiopia's national economy?",
                    options = listOf(
                        QuestionOption("a", "Coffee (Coffea arabica)"),
                        QuestionOption("b", "Cocoa"),
                        QuestionOption("c", "Rubber"),
                        QuestionOption("d", "Palm oil")
                    ),
                    correctOptionId = "a",
                    explanation = "Ethiopia is the birthplace and premier producer of Arabica coffee, which accounts for major foreign exchange."
                ),
                Question(
                    id = 120,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "Pastoralism as a traditional cultural and economic livelihood is defined by:",
                    options = listOf(
                        QuestionOption("a", "Breeding and managing mobile herds of livestock in semi-arid rangelands"),
                        QuestionOption("b", "Sedentary commercial wheat cultivation"),
                        QuestionOption("c", "Underground mineral extraction"),
                        QuestionOption("d", "Inland commercial aquaculture")
                    ),
                    correctOptionId = "a",
                    explanation = "Pastoralists herd cattle, camels, sheep, and goats to adapt to semi-arid ecosystems."
                )
            )
        ),
        "geo_u6" to Quiz(
            id = "quiz_geo_u6",
            title = "Human – Natural Environment Interactions Quiz",
            subject = "Geography",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "globe",
            unitId = "geo_u6",
            subjectId = "geography",
            questions = listOf(
                Question(
                    id = 121,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "What is the progressive loss of land productivity and vegetative cover in drylands called?",
                    options = listOf(
                        QuestionOption("a", "Desertification"),
                        QuestionOption("b", "Salinization"),
                        QuestionOption("c", "Glaciation"),
                        QuestionOption("d", "Afforestation")
                    ),
                    correctOptionId = "a",
                    explanation = "Desertification is driven by climate variations and human activities like deforestation and overgrazing in drylands."
                ),
                Question(
                    id = 122,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "Which traditional Ethiopian soil conservation practice builds earthen ridges along topographic contours to curb erosion?",
                    options = listOf(
                        QuestionOption("a", "Contour bunding and terracing"),
                        QuestionOption("b", "Deep tractor plowing downslope"),
                        QuestionOption("c", "Clear-cut deforestation"),
                        QuestionOption("d", "Over-irrigation")
                    ),
                    correctOptionId = "a",
                    explanation = "Terracing and contour bunds slow runoff, preventing topsoil erosion on steep highland slopes."
                ),
                Question(
                    id = 123,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "Environmental determinism as a geographical perspective argues that:",
                    options = listOf(
                        QuestionOption("a", "Physical environmental factors strictly dictate human culture and societal progress"),
                        QuestionOption("b", "Human technology has no environmental impact"),
                        QuestionOption("c", "All climates offer identical agricultural opportunities"),
                        QuestionOption("d", "Nature can be completely replaced by digital tools")
                    ),
                    correctOptionId = "a",
                    explanation = "Environmental determinism posited that climate and physical landscape govern human development."
                ),
                Question(
                    id = 124,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "What is the primary driver of soil nutrient depletion and runoff in deforested tropical watersheds?",
                    options = listOf(
                        QuestionOption("a", "Loss of protective forest canopy and root anchorage leading to torrential sheet erosion"),
                        QuestionOption("b", "Excessive groundwater recharging"),
                        QuestionOption("c", "Too much organic humus accumulation"),
                        QuestionOption("d", "Extreme freezing and permafrost thawing")
                    ),
                    correctOptionId = "a",
                    explanation = "Tree removal exposes fragile topsoils to direct raindrop impact, stripping away fertile nutrients."
                )
            )
        ),
        "geo_u7" to Quiz(
            id = "quiz_geo_u7",
            title = "Geographic Issues and Public Concerns in Africa Quiz",
            subject = "Geography",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "globe",
            unitId = "geo_u7",
            subjectId = "geography",
            questions = listOf(
                Question(
                    id = 125,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "The 'Great Green Wall' initiative across the Sahel region of Africa aims to:",
                    options = listOf(
                        QuestionOption("a", "Combat desertification and land degradation by planting a mosaic of trees and restored vegetation"),
                        QuestionOption("b", "Build a continuous concrete military border"),
                        QuestionOption("c", "Divert all African rivers into the Mediterranean"),
                        QuestionOption("d", "Construct a trans-continental solar highway")
                    ),
                    correctOptionId = "a",
                    explanation = "The Great Green Wall is an African-led movement to restore 100 million hectares of degraded Sahelian land."
                ),
                Question(
                    id = 126,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "Rapid unplanned urbanization in African megacities often generates which critical public infrastructure challenge?",
                    options = listOf(
                        QuestionOption("a", "Proliferation of informal settlements lacking clean piped water, sanitation, and waste collection"),
                        QuestionOption("b", "Depopulation of downtown business districts"),
                        QuestionOption("c", "Excess vacant affordable public housing"),
                        QuestionOption("d", "Zero traffic congestion on arterial routes")
                    ),
                    correctOptionId = "a",
                    explanation = "Municipal infrastructure often cannot keep pace with rural-urban influx, creating informal housing challenges."
                ),
                Question(
                    id = 127,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "Climate change is exacerbating which recurrent natural hazard across the Horn of Africa?",
                    options = listOf(
                        QuestionOption("a", "Protracted multi-year droughts and erratic rainfall cycles"),
                        QuestionOption("b", "Glacial moraine outburst floods"),
                        QuestionOption("c", "Persistent sub-zero blizzards"),
                        QuestionOption("d", "Tsunami waves on inland lakes")
                    ),
                    correctOptionId = "a",
                    explanation = "Warming Indian Ocean temperatures disrupt monsoon rains, triggering severe droughts in East Africa."
                ),
                Question(
                    id = 128,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "Sustainable development as outlined in the United Nations SDGs and AU Agenda 2063 balances:",
                    options = listOf(
                        QuestionOption("a", "Economic prosperity, social inclusion, and environmental conservation"),
                        QuestionOption("b", "Rapid industrialization at the expense of all forests"),
                        QuestionOption("c", "Immediate fossil fuel exploitation without renewable alternatives"),
                        QuestionOption("d", "Exclusive reliance on foreign food imports")
                    ),
                    correctOptionId = "a",
                    explanation = "Sustainable development meets present needs without compromising the ability of future generations to meet theirs."
                )
            )
        ),
        "geo_u8" to Quiz(
            id = "quiz_geo_u8",
            title = "Geospatial Information and Data Processing Quiz",
            subject = "Geography",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "globe",
            unitId = "geo_u8",
            subjectId = "geography",
            questions = listOf(
                Question(
                    id = 129,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "What does the acronym GIS stand for in modern geographical studies?",
                    options = listOf(
                        QuestionOption("a", "Geographic Information System"),
                        QuestionOption("b", "Global Internet Satellite"),
                        QuestionOption("c", "Geological Inventory Survey"),
                        QuestionOption("d", "General International Soilmap")
                    ),
                    correctOptionId = "a",
                    explanation = "A Geographic Information System (GIS) captures, manages, analyzes, and displays spatial data."
                ),
                Question(
                    id = 130,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "What technology acquires physical information about Earth's surface from aircraft or orbiting satellites without making physical contact?",
                    options = listOf(
                        QuestionOption("a", "Remote Sensing"),
                        QuestionOption("b", "Field Survey Chain"),
                        QuestionOption("c", "Theodolite leveling"),
                        QuestionOption("d", "Geological drill-coring")
                    ),
                    correctOptionId = "a",
                    explanation = "Remote sensing uses airborne or spaceborne sensors to detect and classify objects on Earth."
                ),
                Question(
                    id = 131,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "What is the primary purpose of the Global Positioning System (GPS)?",
                    options = listOf(
                        QuestionOption("a", "Determining precise latitude, longitude, and elevation coordinates on Earth"),
                        QuestionOption("b", "Measuring subsurface seismic wave velocities"),
                        QuestionOption("c", "Predicting solar flare occurrences"),
                        QuestionOption("d", "Filtering atmospheric carbon dioxide")
                    ),
                    correctOptionId = "a",
                    explanation = "GPS uses satellite constellation signals to compute exact 3D coordinates on Earth's surface."
                ),
                Question(
                    id = 132,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "In spatial data modeling within GIS, what format represents geographic features as points, lines, and polygons?",
                    options = listOf(
                        QuestionOption("a", "Vector data format"),
                        QuestionOption("b", "Raster pixel grid format"),
                        QuestionOption("c", "Binary executable format"),
                        QuestionOption("d", "Analog contour sheet")
                    ),
                    correctOptionId = "a",
                    explanation = "Vector data represents discrete geometric entities using coordinate geometry (points, lines, polygons)."
                )
            )
        ),

        // ==========================================
        // 6. CITIZENSHIP / CIVICS (civics) — 8 units
        // ==========================================
        "civics_u1" to Quiz(
            id = "quiz_civics_u1",
            title = "Democracy and Democratization Quiz",
            subject = "Citizenship / Civics",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "balance",
            unitId = "civics_u1",
            subjectId = "civics",
            questions = listOf(
                Question(
                    id = 133,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "What is the foundational principle underlying democratic governance?",
                    options = listOf(
                        QuestionOption("a", "Popular sovereignty (power derived from the consent of the governed)"),
                        QuestionOption("b", "Divine right of hereditary monarchs"),
                        QuestionOption("c", "Authoritarian military decree"),
                        QuestionOption("d", "Unlimited rule by an elite oligarchy")
                    ),
                    correctOptionId = "a",
                    explanation = "Democracy is grounded in popular sovereignty, where citizens exercise political authority directly or through elected representatives."
                ),
                Question(
                    id = 134,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "In a representative democracy, how do citizens primarily exercise their sovereign power?",
                    options = listOf(
                        QuestionOption("a", "Through free, fair, regular, and competitive elections"),
                        QuestionOption("b", "By obeying decrees without public consultation"),
                        QuestionOption("c", "Through compulsory lifelong military conscription"),
                        QuestionOption("d", "By appointing family members to state offices")
                    ),
                    correctOptionId = "a",
                    explanation = "Periodic elections empower voters to select representatives and hold officeholders accountable."
                ),
                Question(
                    id = 135,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "What does the principle of 'Rule of Law' signify in a constitutional democracy?",
                    options = listOf(
                        QuestionOption("a", "All individuals and government authorities are equally accountable under established law"),
                        QuestionOption("b", "Government leaders are exempt from legal prosecution"),
                        QuestionOption("c", "Laws can be altered at the whim of the executive branch"),
                        QuestionOption("d", "Only citizens in private life must obey legal statutes")
                    ),
                    correctOptionId = "a",
                    explanation = "Rule of law guarantees that no person or government institution is above the constitution and legal code."
                ),
                Question(
                    id = 136,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "Democratization refers to the ongoing political process of:",
                    options = listOf(
                        QuestionOption("a", "Transitioning from authoritarian rule toward open, pluralistic, and institutionalized democratic practices"),
                        QuestionOption("b", "Eliminating regional legislative bodies"),
                        QuestionOption("c", "Establishing a single-party monopoly on state media"),
                        QuestionOption("d", "Abolishing constitutional rights during peacetime")
                    ),
                    correctOptionId = "a",
                    explanation = "Democratization deepens institutional checks, protects civil liberties, and fosters civic participation."
                )
            )
        ),
        "civics_u2" to Quiz(
            id = "quiz_civics_u2",
            title = "Citizens in the Digital Technology Age Quiz",
            subject = "Citizenship / Civics",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "balance",
            unitId = "civics_u2",
            subjectId = "civics",
            questions = listOf(
                Question(
                    id = 137,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "What is 'Digital Citizenship' defined as in the modern information society?",
                    options = listOf(
                        QuestionOption("a", "The responsible, ethical, and safe use of digital technology, internet, and communication tools"),
                        QuestionOption("b", "Possessing an email account without ethical considerations"),
                        QuestionOption("c", "Anonymous trolling on social media forums"),
                        QuestionOption("d", "Illegally distributing copyrighted software")
                    ),
                    correctOptionId = "a",
                    explanation = "Digital citizenship includes literacy, respectful engagement, privacy protection, and ethical online communication."
                ),
                Question(
                    id = 138,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "Deliberately creating and spreading false or deceptive information online to manipulate public opinion is called:",
                    options = listOf(
                        QuestionOption("a", "Disinformation"),
                        QuestionOption("b", "Peer-reviewed journalism"),
                        QuestionOption("c", "Open-source data processing"),
                        QuestionOption("d", "Algorithmic cryptography")
                    ),
                    correctOptionId = "a",
                    explanation = "Disinformation is intentionally fabricated content designed to mislead, distinct from unintentional misinformation."
                ),
                Question(
                    id = 139,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "What constitutes good cyber hygiene to safeguard personal digital identity and privacy?",
                    options = listOf(
                        QuestionOption("a", "Using strong unique passwords, enabling multi-factor authentication, and verifying links"),
                        QuestionOption("b", "Sharing account passwords with strangers on public Wi-Fi"),
                        QuestionOption("c", "Disabling antivirus and security updates"),
                        QuestionOption("d", "Posting sensitive national identification cards publicly")
                    ),
                    correctOptionId = "a",
                    explanation = "Cyber hygiene includes MFA, strong credentials, software patching, and cautious browsing habits."
                ),
                Question(
                    id = 140,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "How does digital technology enhance civic engagement for young citizens?",
                    options = listOf(
                        QuestionOption("a", "By enabling rapid access to public information, e-governance services, and collaborative civic discourse"),
                        QuestionOption("b", "By replacing physical classrooms entirely with automated algorithms"),
                        QuestionOption("c", "By restricting voting rights exclusively to digital device owners"),
                        QuestionOption("d", "By eliminating the need for national constitutions")
                    ),
                    correctOptionId = "a",
                    explanation = "Digital platforms empower citizens to monitor policies, sign petitions, access services, and voice community needs."
                )
            )
        ),
        "civics_u3" to Quiz(
            id = "quiz_civics_u3",
            title = "Understanding Good Governance Quiz",
            subject = "Citizenship / Civics",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "balance",
            unitId = "civics_u3",
            subjectId = "civics",
            questions = listOf(
                Question(
                    id = 141,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "Which of the following is an indispensable core characteristic of good governance?",
                    options = listOf(
                        QuestionOption("a", "Transparency and public accountability"),
                        QuestionOption("b", "Absolute secrecy in public fund allocations"),
                        QuestionOption("c", "Impunity for public officials"),
                        QuestionOption("d", "Arbitrary decision-making without legal review")
                    ),
                    correctOptionId = "a",
                    explanation = "Transparency, responsiveness, rule of law, and accountability form the pillars of good governance."
                ),
                Question(
                    id = 142,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "Public accountability requires that public officials must:",
                    options = listOf(
                        QuestionOption("a", "Explain, justify, and take responsibility for decisions and resource utilization before the public"),
                        QuestionOption("b", "Answer only to their personal business associates"),
                        QuestionOption("c", "Conceal government budgets from parliamentary scrutiny"),
                        QuestionOption("d", "Retain office indefinitely without review")
                    ),
                    correctOptionId = "a",
                    explanation = "Accountability ensures civil servants and elected officials answer for their actions and expenditure of public funds."
                ),
                Question(
                    id = 143,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "Corruption in public administration undermines society primarily by:",
                    options = listOf(
                        QuestionOption("a", "Diverting scarce public resources away from healthcare, schools, and infrastructure while eroding public trust"),
                        QuestionOption("b", "Fostering rapid fair economic competition"),
                        QuestionOption("c", "Strengthening the rule of law and judicial fairness"),
                        QuestionOption("d", "Improving foreign investment inflows")
                    ),
                    correctOptionId = "a",
                    explanation = "Corruption diverts vital tax revenues, deepens poverty, and damages institutional legitimacy."
                ),
                Question(
                    id = 144,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "What is the function of an independent anti-corruption commission in a constitutional system?",
                    options = listOf(
                        QuestionOption("a", "Investigating corrupt practices, enforcing ethics, and recovering illicitly acquired public assets"),
                        QuestionOption("b", "Drafting military defense strategies"),
                        QuestionOption("c", "Managing commercial retail banks"),
                        QuestionOption("d", "Collecting municipal water bills")
                    ),
                    correctOptionId = "a",
                    explanation = "Anti-corruption bodies investigate graft, promote institutional integrity, and prosecute corrupt actors."
                )
            )
        ),
        "civics_u4" to Quiz(
            id = "quiz_civics_u4",
            title = "Peace and Indigenous Conflict Resolution Mechanisms Quiz",
            subject = "Citizenship / Civics",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "balance",
            unitId = "civics_u4",
            subjectId = "civics",
            questions = listOf(
                Question(
                    id = 145,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "What is positive peace as conceptualized in conflict studies?",
                    options = listOf(
                        QuestionOption("a", "The presence of social justice, equity, mutual respect, and absence of structural violence"),
                        QuestionOption("b", "The mere absence of open physical battlefield fighting (negative peace)"),
                        QuestionOption("c", "Imposing total military curfew on civilians"),
                        QuestionOption("d", "Suppression of all political debate")
                    ),
                    correctOptionId = "a",
                    explanation = "Positive peace addresses root causes of tension, building social harmony, equity, and human dignity."
                ),
                Question(
                    id = 146,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "What is 'Jaarsummaa' in the traditional customary dispute resolution heritage of Ethiopia?",
                    options = listOf(
                        QuestionOption("a", "An indigenous council of community elders mediating disputes and restoring social harmony"),
                        QuestionOption("b", "A formal federal appellate court system"),
                        QuestionOption("c", "An armed border patrol detachment"),
                        QuestionOption("d", "A commercial banking arbitration board")
                    ),
                    correctOptionId = "a",
                    explanation = "Jaarsummaa is a venerated Oromo indigenous mediation institution led by respected elders (Jaarsoli)."
                ),
                Question(
                    id = 147,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "Why are indigenous conflict resolution mechanisms valued alongside formal statutory courts?",
                    options = listOf(
                        QuestionOption("a", "They emphasize restorative justice, community reconciliation, accessibility, and win-win solutions"),
                        QuestionOption("b", "They always impose severe monetary fines and lengthy prison terms"),
                        QuestionOption("c", "They eliminate the need for national constitutions"),
                        QuestionOption("d", "They are strictly restricted to international maritime disputes")
                    ),
                    correctOptionId = "a",
                    explanation = "Indigenous mechanisms repair interpersonal relationships, preserve communal bonds, and offer accessible justice."
                ),
                Question(
                    id = 148,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "Which traditional institution in the Tigray region functions as a customary dispute mediation assembly?",
                    options = listOf(
                        QuestionOption("a", "Abo Gereb"),
                        QuestionOption("b", "Gadaa"),
                        QuestionOption("c", "Shimagile"),
                        QuestionOption("d", "Gedam")
                    ),
                    correctOptionId = "a",
                    explanation = "Abo Gereb is a traditional conflict resolution institution practiced in northern Ethiopia to resolve communal disputes."
                )
            )
        ),
        "civics_u5" to Quiz(
            id = "quiz_civics_u5",
            title = "Federalism in Ethiopia Quiz",
            subject = "Citizenship / Civics",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "balance",
            unitId = "civics_u5",
            subjectId = "civics",
            questions = listOf(
                Question(
                    id = 149,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "Federalism is a system of government characterized by:",
                    options = listOf(
                        QuestionOption("a", "Constitutional division of power between a central federal government and regional constituent units"),
                        QuestionOption("b", "Concentration of all legislative and executive authority in a single central capital"),
                        QuestionOption("c", "Abolition of all regional administrative boundaries"),
                        QuestionOption("d", "Direct military administration of cities")
                    ),
                    correctOptionId = "a",
                    explanation = "Federalism balances shared rule at the center with self-rule in constituent regional member states."
                ),
                Question(
                    id = 150,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "Under the 1995 FDRE Constitution of Ethiopia, which house of parliament represents the Nations, Nationalities, and Peoples?",
                    options = listOf(
                        QuestionOption("a", "The House of Federation (HoF)"),
                        QuestionOption("b", "The House of Peoples' Representatives (HoPR)"),
                        QuestionOption("c", "The Council of Ministers"),
                        QuestionOption("d", "The Supreme Federal Court")
                    ),
                    correctOptionId = "a",
                    explanation = "The House of Federation represents Ethiopian nationalities and interprets constitutional disputes."
                ),
                Question(
                    id = 151,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "What is the primary function of the House of Peoples' Representatives (HoPR) in Ethiopia?",
                    options = listOf(
                        QuestionOption("a", "Enacting federal laws, approving budgets, and overseeing the executive branch"),
                        QuestionOption("b", "Interpreting customary land treaties"),
                        QuestionOption("c", "Commanding military operations directly on frontiers"),
                        QuestionOption("d", "Serving as the national central bank")
                    ),
                    correctOptionId = "a",
                    explanation = "The HoPR is the highest legislative authority of the Federal Democratic Republic of Ethiopia."
                ),
                Question(
                    id = 152,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "What constitutional principle balances regional self-determination with overall national cohesion in Ethiopia?",
                    options = listOf(
                        QuestionOption("a", "Unity in diversity within a shared constitutional framework"),
                        QuestionOption("b", "Complete assimilation into a single culture"),
                        QuestionOption("c", "Total isolation among regional states"),
                        QuestionOption("d", "Unitary central command without regional assemblies")
                    ),
                    correctOptionId = "a",
                    explanation = "Ethiopian federalism aims to protect cultural identities while building a united socio-economic community."
                )
            )
        ),
        "civics_u6" to Quiz(
            id = "quiz_civics_u6",
            title = "Human Rights Quiz",
            subject = "Citizenship / Civics",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "balance",
            unitId = "civics_u6",
            subjectId = "civics",
            questions = listOf(
                Question(
                    id = 153,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "In which historic year was the Universal Declaration of Human Rights (UDHR) adopted by the United Nations General Assembly?",
                    options = listOf(
                        QuestionOption("a", "1948"),
                        QuestionOption("b", "1918"),
                        QuestionOption("c", "1975"),
                        QuestionOption("d", "2001")
                    ),
                    correctOptionId = "a",
                    explanation = "The UDHR was adopted on December 10, 1948, establishing foundational human rights protections."
                ),
                Question(
                    id = 154,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "Human rights are described as 'universal' because they:",
                    options = listOf(
                        QuestionOption("a", "Belong inherently to all human beings everywhere, irrespective of race, nationality, gender, or religion"),
                        QuestionOption("b", "Apply only to citizens of wealthy developed economies"),
                        QuestionOption("c", "Are granted conditionally by employers"),
                        QuestionOption("d", "Can be purchased in legal auctions")
                    ),
                    correctOptionId = "a",
                    explanation = "Universality means human rights apply equally to all people by virtue of human dignity."
                ),
                Question(
                    id = 155,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "Which of the following is categorized as a civil and political (first-generation) right?",
                    options = listOf(
                        QuestionOption("a", "Right to life, liberty, fair trial, and freedom of expression"),
                        QuestionOption("b", "Right to paid annual vacation"),
                        QuestionOption("c", "Right to clean environment"),
                        QuestionOption("d", "Right to internet subsidization")
                    ),
                    correctOptionId = "a",
                    explanation = "First-generation rights protect individual autonomy from arbitrary state encroachment."
                ),
                Question(
                    id = 156,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "What is the primary role of the Ethiopian Human Rights Commission (EHRC)?",
                    options = listOf(
                        QuestionOption("a", "Monitoring, investigating, and reporting on human rights compliance and advocating for victim remedies"),
                        QuestionOption("b", "Managing external foreign diplomatic embassies"),
                        QuestionOption("c", "Drafting corporate commercial contracts"),
                        QuestionOption("d", "Enforcing tax audits on small enterprises")
                    ),
                    correctOptionId = "a",
                    explanation = "The EHRC is an independent statutory institution monitoring and protecting constitutional human rights."
                )
            )
        ),
        "civics_u7" to Quiz(
            id = "quiz_civics_u7",
            title = "Patriotism Quiz",
            subject = "Citizenship / Civics",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "balance",
            unitId = "civics_u7",
            subjectId = "civics",
            questions = listOf(
                Question(
                    id = 157,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "How is genuine democratic patriotism distinguished from chauvinistic nationalism?",
                    options = listOf(
                        QuestionOption("a", "Democratic patriotism is devotion to constitutional values, human rights, and public welfare without hating others"),
                        QuestionOption("b", "Democratic patriotism claims superiority and hostility toward all foreign peoples"),
                        QuestionOption("c", "Democratic patriotism requires unquestioning loyalty to a single political ruler"),
                        QuestionOption("d", "Patriotism excludes cultural diversity")
                    ),
                    correctOptionId = "a",
                    explanation = "Democratic patriotism fosters civic responsibility, solidarity, and constitutional defense without xenophobia."
                ),
                Question(
                    id = 158,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "Which of the following represents a practical demonstration of civic patriotism by high school students?",
                    options = listOf(
                        QuestionOption("a", "Participating in community tree-planting, volunteering, studying diligently, and protecting public property"),
                        QuestionOption("b", "Vandalizing public street infrastructure"),
                        QuestionOption("c", "Spreading unverified rumors online"),
                        QuestionOption("d", "Evading civic responsibilities")
                    ),
                    correctOptionId = "a",
                    explanation = "Constructive patriotism is reflected in civic engagement, environmental stewardship, and academic diligence."
                ),
                Question(
                    id = 159,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "The Battle of Adwa (1896) holds immense patriotic significance for Ethiopians and Africans because it:",
                    options = listOf(
                        QuestionOption("a", "Decisively defeated a colonial invasion, preserving Ethiopia's sovereignty and inspiring global anti-colonial movements"),
                        QuestionOption("b", "Ended all foreign trade contacts"),
                        QuestionOption("c", "Divided the country into colonial zones"),
                        QuestionOption("d", "Abolished indigenous traditions")
                    ),
                    correctOptionId = "a",
                    explanation = "Adwa demonstrated united patriotic defense against Italian colonial aggression, becoming a beacon of Pan-African liberty."
                ),
                Question(
                    id = 160,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "Protecting public heritage sites and natural environments embodies patriotism because:",
                    options = listOf(
                        QuestionOption("a", "It preserves national history, biodiversity, and communal wealth for present and future generations"),
                        QuestionOption("b", "It guarantees immediate cash handouts"),
                        QuestionOption("c", "It restricts foreign scientists from visiting"),
                        QuestionOption("d", "It replaces the need for municipal governance")
                    ),
                    correctOptionId = "a",
                    explanation = "Preserving cultural and ecological assets safeguards national identity and sustainable prosperity."
                )
            )
        ),
        "civics_u8" to Quiz(
            id = "quiz_civics_u8",
            title = "Globalization and Global Issues Quiz",
            subject = "Citizenship / Civics",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "balance",
            unitId = "civics_u8",
            subjectId = "civics",
            questions = listOf(
                Question(
                    id = 161,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "What is globalization?",
                    options = listOf(
                        QuestionOption("a", "The growing worldwide interconnectedness and interdependence of economies, cultures, and technologies"),
                        QuestionOption("b", "The complete isolation of countries behind trade walls"),
                        QuestionOption("c", "The abolition of all national currencies"),
                        QuestionOption("d", "The relocation of all world governments to one city")
                    ),
                    correctOptionId = "a",
                    explanation = "Globalization accelerates cross-border flows of trade, investment, information, culture, and people."
                ),
                Question(
                    id = 162,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "Which of the following is a pressing transnational challenge that requires coordinated multilateral cooperation?",
                    options = listOf(
                        QuestionOption("a", "Global climate change and pandemics"),
                        QuestionOption("b", "Routine local municipality parking rules"),
                        QuestionOption("c", "Individual family budget planning"),
                        QuestionOption("d", "Local high school club elections")
                    ),
                    correctOptionId = "a",
                    explanation = "Climate change, global pandemics, and transnational crime transcend borders and require international teamwork."
                ),
                Question(
                    id = 163,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "Where is the permanent headquarters of the African Union (AU) located?",
                    options = listOf(
                        QuestionOption("a", "Addis Ababa, Ethiopia"),
                        QuestionOption("b", "Nairobi, Kenya"),
                        QuestionOption("c", "Cairo, Egypt"),
                        QuestionOption("d", "Johannesburg, South Africa")
                    ),
                    correctOptionId = "a",
                    explanation = "Addis Ababa is the diplomatic capital of Africa, hosting the African Union headquarters since its OAU founding in 1963."
                ),
                Question(
                    id = 164,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "How can developing nations maximize the benefits of economic globalization while mitigating its risks?",
                    options = listOf(
                        QuestionOption("a", "By investing in human capital, technology transfer, manufacturing competitiveness, and sound regulatory policies"),
                        QuestionOption("b", "By exporting raw unrefined minerals with zero local value addition"),
                        QuestionOption("c", "By shutting down all external digital internet connections"),
                        QuestionOption("d", "By borrowing unsustainable unvetted foreign loans")
                    ),
                    correctOptionId = "a",
                    explanation = "Domestic value addition, digital capacity, education, and institutional resilience allow nations to gain from global trade."
                )
            )
        )
    )
}
