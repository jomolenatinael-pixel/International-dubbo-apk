package com.areka.app.data.repository

import com.areka.app.data.model.Question
import com.areka.app.data.model.QuestionOption
import com.areka.app.data.model.Quiz

/**
 * Hand-authored, curriculum-aligned multiple choice quizzes for Ethiopian MoE Grade 10 New Curriculum.
 * Part 3: Economics (8 units), History (9 units), Health & PE (8 units) - Total 25 units
 */
object CurriculumQuizzesPart3 {

    val quizzes: Map<String, Quiz> = mapOf(
        // ==========================================
        // 7. ECONOMICS (economics) — 8 units
        // ==========================================
        "econ_u1" to Quiz(
            id = "quiz_econ_u1",
            title = "Theory of Consumer Behaviour Quiz",
            subject = "Economics",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "trending_up",
            unitId = "econ_u1",
            subjectId = "economics",
            questions = listOf(
                Question(
                    id = 165,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "According to the Law of Diminishing Marginal Utility, as consumption of a good increases:",
                    options = listOf(
                        QuestionOption("a", "The additional satisfaction (utility) derived from each extra unit decreases"),
                        QuestionOption("b", "Total utility immediately turns negative"),
                        QuestionOption("c", "Marginal utility increases exponentially"),
                        QuestionOption("d", "Consumer budget doubles automatically")
                    ),
                    correctOptionId = "a",
                    explanation = "As more units of a specific commodity are consumed, the satisfaction gained from each subsequent unit diminishes."
                ),
                Question(
                    id = 166,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "An indifference curve in ordinal utility analysis represents:",
                    options = listOf(
                        QuestionOption("a", "All combinations of two goods that yield the exact same level of satisfaction to a consumer"),
                        QuestionOption("b", "The price ratio between domestic and imported products"),
                        QuestionOption("c", "The maximum revenue earned by a monopolistic firm"),
                        QuestionOption("d", "Variations in national tax brackets")
                    ),
                    correctOptionId = "a",
                    explanation = "Any point along a single indifference curve provides equal total utility to the consumer."
                ),
                Question(
                    id = 167,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "What is consumer equilibrium in cardinal utility analysis with two goods X and Y?",
                    options = listOf(
                        QuestionOption("a", "MU_x / P_x = MU_y / P_y"),
                        QuestionOption("b", "MU_x × P_x = MU_y × P_y"),
                        QuestionOption("c", "P_x / MU_x = P_y × MU_y"),
                        QuestionOption("d", "MU_x + MU_y = 100")
                    ),
                    correctOptionId = "a",
                    explanation = "Utility maximization occurs when marginal utility per dollar spent is equalized across all goods."
                ),
                Question(
                    id = 168,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "What does the slope of a consumer's budget line represent?",
                    options = listOf(
                        QuestionOption("a", "The negative ratio of the prices of the two goods (-P_x / P_y)"),
                        QuestionOption("b", "The consumer's total monthly income"),
                        QuestionOption("c", "The rate of national price inflation"),
                        QuestionOption("d", "Marginal tax rates on luxury goods")
                    ),
                    correctOptionId = "a",
                    explanation = "The budget line slope reflects the relative market price trade-off between the two commodities."
                )
            )
        ),
        "econ_u2" to Quiz(
            id = "quiz_econ_u2",
            title = "Theories of Demand and Supply Quiz",
            subject = "Economics",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "trending_up",
            unitId = "econ_u2",
            subjectId = "economics",
            questions = listOf(
                Question(
                    id = 169,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "The Law of Demand states that, holding other factors constant (ceteris paribus):",
                    options = listOf(
                        QuestionOption("a", "As the price of a good rises, the quantity demanded decreases"),
                        QuestionOption("b", "As price rises, quantity demanded also increases"),
                        QuestionOption("c", "Price has zero correlation with quantity demanded"),
                        QuestionOption("d", "Supply and demand are always perfectly equal")
                    ),
                    correctOptionId = "a",
                    explanation = "An inverse relationship exists between price and quantity demanded when all other variables remain unchanged."
                ),
                Question(
                    id = 170,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "What happens in a competitive market when the current price is set above the equilibrium price?",
                    options = listOf(
                        QuestionOption("a", "A market surplus (excess supply) emerges, putting downward pressure on prices"),
                        QuestionOption("b", "A market shortage (excess demand) occurs"),
                        QuestionOption("c", "Both demand and supply curves disappear"),
                        QuestionOption("d", "Consumers buy infinite quantities")
                    ),
                    correctOptionId = "a",
                    explanation = "At prices above equilibrium, quantity supplied exceeds quantity demanded, creating a surplus that lowers prices."
                ),
                Question(
                    id = 171,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "If price elasticity of demand (|E_d|) is greater than 1, demand for that product is classified as:",
                    options = listOf(
                        QuestionOption("a", "Price Elastic"),
                        QuestionOption("b", "Price Inelastic"),
                        QuestionOption("c", "Unitary Elastic"),
                        QuestionOption("d", "Perfectlys Inelastic")
                    ),
                    correctOptionId = "a",
                    explanation = "When |E_d| > 1, the percentage change in quantity demanded is greater than the percentage change in price."
                ),
                Question(
                    id = 172,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "Which of the following will cause a rightward shift of the entire market supply curve?",
                    options = listOf(
                        QuestionOption("a", "Technological advancement reducing production costs"),
                        QuestionOption("b", "An increase in production input wages"),
                        QuestionOption("c", "Imposition of heavy per-unit production taxes"),
                        QuestionOption("d", "A natural disaster destroying manufacturing facilities")
                    ),
                    correctOptionId = "a",
                    explanation = "Technological innovation lowers marginal costs, allowing producers to supply more output at every price level."
                )
            )
        ),
        "econ_u3" to Quiz(
            id = "quiz_econ_u3",
            title = "Theories of Production and Cost Quiz",
            subject = "Economics",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "trending_up",
            unitId = "econ_u3",
            subjectId = "economics",
            questions = listOf(
                Question(
                    id = 173,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "In microeconomics, the short run is defined as a production timeframe in which:",
                    options = listOf(
                        QuestionOption("a", "At least one input factor (such as plant size or capital) is fixed"),
                        QuestionOption("b", "All input factors are completely variable"),
                        QuestionOption("c", "Production cannot take place under any circumstances"),
                        QuestionOption("d", "Firms make zero sales")
                    ),
                    correctOptionId = "a",
                    explanation = "In the short run, some inputs (plant capacity) cannot be adjusted, unlike the long run where all inputs are variable."
                ),
                Question(
                    id = 174,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "What is the Law of Diminishing Marginal Returns in short-run production?",
                    options = listOf(
                        QuestionOption("a", "Adding more units of a variable input to fixed inputs eventually leads to smaller increases in output"),
                        QuestionOption("b", "Total output immediately drops to zero when hiring an extra worker"),
                        QuestionOption("c", "Fixed costs double with every additional unit of labor"),
                        QuestionOption("d", "Product prices drop continuously")
                    ),
                    correctOptionId = "a",
                    explanation = "With fixed plant capacity, adding successive variable workers eventually yields progressively smaller marginal output."
                ),
                Question(
                    id = 175,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "Marginal Cost (MC) is defined mathematically as:",
                    options = listOf(
                        QuestionOption("a", "Change in Total Cost divided by change in Quantity produced (ΔTC / ΔQ)"),
                        QuestionOption("b", "Total Fixed Cost divided by Quantity"),
                        QuestionOption("c", "Total Revenue minus Total Cost"),
                        QuestionOption("d", "Average Variable Cost multiplied by Total Output")
                    ),
                    correctOptionId = "a",
                    explanation = "Marginal cost measures the additional cost incurred to manufacture one extra unit of output."
                ),
                Question(
                    id = 176,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "Economies of scale occur in the long run when:",
                    options = listOf(
                        QuestionOption("a", "Long-run average total cost declines as the scale of output expands"),
                        QuestionOption("b", "Average cost increases due to administrative bottlenecks"),
                        QuestionOption("c", "Output becomes strictly zero"),
                        QuestionOption("d", "Input prices triple in a short timeframe")
                    ),
                    correctOptionId = "a",
                    explanation = "Firms achieve economies of scale through specialization, bulk purchasing, and advanced mass production."
                )
            )
        ),
        "econ_u4" to Quiz(
            id = "quiz_econ_u4",
            title = "Market Structure Quiz",
            subject = "Economics",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "trending_up",
            unitId = "econ_u4",
            subjectId = "economics",
            questions = listOf(
                Question(
                    id = 177,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "Which of the following is a core characteristic of a perfectly competitive market?",
                    options = listOf(
                        QuestionOption("a", "Large number of buyers and sellers trading identical (homogeneous) products"),
                        QuestionOption("b", "A single seller setting prices unilaterally"),
                        QuestionOption("c", "Substantial legal barriers preventing new competitors from entering"),
                        QuestionOption("d", "Heavy non-price advertising competition")
                    ),
                    correctOptionId = "a",
                    explanation = "Perfect competition features many firms selling identical goods with free entry and exit, making firms price-takers."
                ),
                Question(
                    id = 178,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "A monopoly market structure is defined by:",
                    options = listOf(
                        QuestionOption("a", "A single producer/seller with no close substitutes and high barriers to entry"),
                        QuestionOption("b", "Hundreds of small independent sellers"),
                        QuestionOption("c", "Free and unhindered entry for any new startup"),
                        QuestionOption("d", "Zero control over selling price")
                    ),
                    correctOptionId = "a",
                    explanation = "A monopoly exists when one firm controls the entire supply of a good or service lacking close substitutes."
                ),
                Question(
                    id = 179,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "In any market structure, profit maximization occurs at the level of output where:",
                    options = listOf(
                        QuestionOption("a", "Marginal Revenue equals Marginal Cost (MR = MC)"),
                        QuestionOption("b", "Total Revenue equals Total Fixed Cost"),
                        QuestionOption("c", "Price equals Average Fixed Cost"),
                        QuestionOption("d", "Marginal Cost is at its absolute maximum")
                    ),
                    correctOptionId = "a",
                    explanation = "Producing where MR = MC guarantees that the firm captures all profit-generating units of output."
                ),
                Question(
                    id = 180,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "An oligopoly market is characterized by:",
                    options = listOf(
                        QuestionOption("a", "Domination of the market by a few large interdependent firms"),
                        QuestionOption("b", "Complete absence of advertising"),
                        QuestionOption("c", "Infinite numbers of agricultural micro-vendors"),
                        QuestionOption("d", "Government owning all production facilities")
                    ),
                    correctOptionId = "a",
                    explanation = "In an oligopoly (e.g., telecom, airlines), a few dominant players closely react to competitors' pricing and strategies."
                )
            )
        ),
        "econ_u5" to Quiz(
            id = "quiz_econ_u5",
            title = "Banking and Finance Quiz",
            subject = "Economics",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "trending_up",
            unitId = "econ_u5",
            subjectId = "economics",
            questions = listOf(
                Question(
                    id = 181,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "What is the primary institution responsible for formulating monetary policy and issuing legal tender in Ethiopia?",
                    options = listOf(
                        QuestionOption("a", "National Bank of Ethiopia (NBE)"),
                        QuestionOption("b", "Commercial Bank of Ethiopia (CBE)"),
                        QuestionOption("c", "Ministry of Agriculture"),
                        QuestionOption("d", "Addis Ababa Chamber of Commerce")
                    ),
                    correctOptionId = "a",
                    explanation = "The National Bank of Ethiopia serves as the country's central bank, regulating currency, reserves, and monetary policy."
                ),
                Question(
                    id = 182,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "How do commercial banks create credit money in a fractional reserve banking system?",
                    options = listOf(
                        QuestionOption("a", "By retaining a required reserve fraction of deposits and loaning out the remainder"),
                        QuestionOption("b", "By printing paper currency notes in local bank branches"),
                        QuestionOption("c", "By converting all deposits into gold bullion"),
                        QuestionOption("d", "By lending only from government treasury grants")
                    ),
                    correctOptionId = "a",
                    explanation = "Under fractional reserve banking, banks loan out eligible deposit funds, expanding the broader money supply."
                ),
                Question(
                    id = 183,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "Which of the following is one of the three classic functions of money in an economy?",
                    options = listOf(
                        QuestionOption("a", "Medium of exchange"),
                        QuestionOption("b", "Source of electrical power"),
                        QuestionOption("c", "Tool for physical measurement of distance"),
                        QuestionOption("d", "Substitute for labor inputs")
                    ),
                    correctOptionId = "a",
                    explanation = "Money functions as a medium of exchange, a unit of account, and a store of value."
                ),
                Question(
                    id = 184,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "What is inflation in macroeconomic terms?",
                    options = listOf(
                        QuestionOption("a", "A sustained increase in the general price level of goods and services over time"),
                        QuestionOption("b", "A sudden decrease in all consumer prices"),
                        QuestionOption("c", "An increase in the purchasing power of money"),
                        QuestionOption("d", "A complete freeze on bank withdrawals")
                    ),
                    correctOptionId = "a",
                    explanation = "Inflation diminishes the purchasing power of money over time as overall prices climb."
                )
            )
        ),
        "econ_u6" to Quiz(
            id = "quiz_econ_u6",
            title = "Economic Growth Quiz",
            subject = "Economics",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "trending_up",
            unitId = "econ_u6",
            subjectId = "economics",
            questions = listOf(
                Question(
                    id = 185,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "Gross Domestic Product (GDP) measures:",
                    options = listOf(
                        QuestionOption("a", "The total monetary value of all final goods and services produced within a country in a year"),
                        QuestionOption("b", "Total wealth owned by citizens abroad"),
                        QuestionOption("c", "The sum of all physical paper currency printed"),
                        QuestionOption("d", "Total volume of imported consumer goods")
                    ),
                    correctOptionId = "a",
                    explanation = "GDP quantifies total economic output generated within domestic borders during a specified year."
                ),
                Question(
                    id = 186,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "How does economic development differ from mere quantitative economic growth?",
                    options = listOf(
                        QuestionOption("a", "Development incorporates structural improvements in living standards, health, literacy, and equity"),
                        QuestionOption("b", "Economic growth includes democracy while development does not"),
                        QuestionOption("c", "Development only measures agricultural exports"),
                        QuestionOption("d", "They are identical terms with no distinction")
                    ),
                    correctOptionId = "a",
                    explanation = "While growth measures GDP expansion, economic development entails qualitative advances in human wellbeing."
                ),
                Question(
                    id = 187,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "What is Real GDP per capita commonly used to evaluate?",
                    options = listOf(
                        QuestionOption("a", "Average economic output per person, adjusted for price changes (inflation)"),
                        QuestionOption("b", "The exact daily salary of every worker"),
                        QuestionOption("c", "The market valuation of the national stock exchange"),
                        QuestionOption("d", "Foreign exchange currency reserves")
                    ),
                    correctOptionId = "a",
                    explanation = "Real GDP per capita adjusts national output for population size and inflation to assess average standard of living."
                ),
                Question(
                    id = 188,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "Which of the following is a major engine for long-term sustained productivity growth?",
                    options = listOf(
                        QuestionOption("a", "Investment in human capital (education and healthcare) and technological innovation"),
                        QuestionOption("b", "Relying solely on external emergency food aid"),
                        QuestionOption("c", "Restricting vocational school enrollments"),
                        QuestionOption("d", "Maintaining obsolete manual equipment")
                    ),
                    correctOptionId = "a",
                    explanation = "Equipping workers with technical skills, education, and modern capital drives long-run productivity."
                )
            )
        ),
        "econ_u7" to Quiz(
            id = "quiz_econ_u7",
            title = "The Ethiopian Economy Quiz",
            subject = "Economics",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "trending_up",
            unitId = "econ_u7",
            subjectId = "economics",
            questions = listOf(
                Question(
                    id = 189,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "What has traditionally been the backbone of the Ethiopian national economy in terms of employment and raw exports?",
                    options = listOf(
                        QuestionOption("a", "Agriculture"),
                        QuestionOption("b", "Automotive manufacturing"),
                        QuestionOption("c", "Offshore oil drilling"),
                        QuestionOption("d", "Commercial aviation finance")
                    ),
                    correctOptionId = "a",
                    explanation = "Agriculture provides livelihood for the majority of the Ethiopian population and supplies key exports like coffee."
                ),
                Question(
                    id = 190,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "Ethiopia's Homegrown Economic Reform Agenda aims to:",
                    options = listOf(
                        QuestionOption("a", "Address macroeconomic imbalances, unlock private sector potential, and stimulate job-creating growth"),
                        QuestionOption("b", "Nationalize all private agricultural farms"),
                        QuestionOption("c", "Cease all cross-border trade with neighboring countries"),
                        QuestionOption("d", "Eliminate digital banking platforms")
                    ),
                    correctOptionId = "a",
                    explanation = "The Homegrown Economic Reform promotes macroeconomic stability, structural transformation, and sectoral growth."
                ),
                Question(
                    id = 191,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "What major non-agricultural service sector in Ethiopia has expanded rapidly over the last two decades?",
                    options = listOf(
                        QuestionOption("a", "Telecommunications, air transport (Ethiopian Airlines), and mobile financial services"),
                        QuestionOption("b", "Deep-sea submarine tourism"),
                        QuestionOption("c", "Nuclear power plant export"),
                        QuestionOption("d", "Space tourism rocketry")
                    ),
                    correctOptionId = "a",
                    explanation = "Aviation, logistics, telecom modernization, and mobile banking (Telebirr) have driven substantial service sector growth."
                ),
                Question(
                    id = 192,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "What is a major structural challenge faced by Ethiopia's balance of payments?",
                    options = listOf(
                        QuestionOption("a", "A trade deficit where the value of merchandise imports substantially exceeds export earnings"),
                        QuestionOption("b", "Massive surplus of foreign currency reserves"),
                        QuestionOption("c", "Zero importation of capital machinery or fuel"),
                        QuestionOption("d", "Total absence of domestic banking institutions")
                    ),
                    correctOptionId = "a",
                    explanation = "High demand for imported machinery, fuel, and fertilizer relative to commodity export revenue creates a trade deficit."
                )
            )
        ),
        "econ_u8" to Quiz(
            id = "quiz_econ_u8",
            title = "Business Startups and Innovation Quiz",
            subject = "Economics",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "trending_up",
            unitId = "econ_u8",
            subjectId = "economics",
            questions = listOf(
                Question(
                    id = 193,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "What is entrepreneurship defined as in modern economic analysis?",
                    options = listOf(
                        QuestionOption("a", "The process of identifying opportunities, taking calculated risks, organizing resources, and creating a venture"),
                        QuestionOption("b", "Working in a secure civil service position without taking risks"),
                        QuestionOption("c", "Inheriting real estate without managing it"),
                        QuestionOption("d", "Copying identical business models without adaptation")
                    ),
                    correctOptionId = "a",
                    explanation = "Entrepreneurs coordinate land, labor, and capital while undertaking financial risk to innovate products or services."
                ),
                Question(
                    id = 194,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "What is a Minimum Viable Product (MVP) in lean startup methodology?",
                    options = listOf(
                        QuestionOption("a", "A basic prototype version of a new product with enough features to gather validated customer feedback"),
                        QuestionOption("b", "A fully mass-produced product launched after 5 years of secret testing"),
                        QuestionOption("c", "A product that has failed regulatory safety guidelines"),
                        QuestionOption("d", "An expired inventory batch sold at discount")
                    ),
                    correctOptionId = "a",
                    explanation = "An MVP enables entrepreneurs to test core hypotheses and iterate quickly with minimum initial development cost."
                ),
                Question(
                    id = 195,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "What is the function of a business incubator for early-stage entrepreneurial startups?",
                    options = listOf(
                        QuestionOption("a", "Providing workspace, mentorship, technical training, and networking access to nurture young enterprises"),
                        QuestionOption("b", "Collecting corporate tax arrears for revenue authorities"),
                        QuestionOption("c", "Dissolving bankrupt manufacturing companies"),
                        QuestionOption("d", "Restricting startups from using internet tools")
                    ),
                    correctOptionId = "a",
                    explanation = "Incubators accelerate business development by providing vital advisory, infrastructural, and funding networks."
                ),
                Question(
                    id = 196,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "How does technological innovation impact economic productivity?",
                    options = listOf(
                        QuestionOption("a", "It enables higher output and value creation from existing labor and capital resources"),
                        QuestionOption("b", "It permanently halts all commercial trade"),
                        QuestionOption("c", "It guarantees that no new businesses are ever created"),
                        QuestionOption("d", "It decreases the efficiency of supply chains")
                    ),
                    correctOptionId = "a",
                    explanation = "Innovation drives productivity gains by lowering costs, reducing waste, and generating superior products."
                )
            )
        ),

        // ==========================================
        // 8. HISTORY (history) — 9 units
        // ==========================================
        "hist_u1" to Quiz(
            id = "quiz_hist_u1",
            title = "Development of Capitalism and Nationalism 1815–1914 Quiz",
            subject = "History",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "pillar",
            unitId = "hist_u1",
            subjectId = "history",
            questions = listOf(
                Question(
                    id = 197,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "What was the primary goal of the Congress of Vienna (1814–1815) in Europe?",
                    options = listOf(
                        QuestionOption("a", "Restoring monarchical stability and establishing a European balance of power after the Napoleonic Wars"),
                        QuestionOption("b", "Promoting radical socialist worker revolutions across the continent"),
                        QuestionOption("c", "Dismantling the British colonial fleet"),
                        QuestionOption("d", "Establishing a single pan-European republican president")
                    ),
                    correctOptionId = "a",
                    explanation = "The Congress of Vienna redrew Europe's map to re-establish conservative balance and suppress revolutionary unrest."
                ),
                Question(
                    id = 198,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "Who was the 'Iron Chancellor' who orchestrated the unification of Germany in 1871 through his 'Blood and Iron' policy?",
                    options = listOf(
                        QuestionOption("a", "Otto von Bismarck"),
                        QuestionOption("b", "Klemens von Metternich"),
                        QuestionOption("c", "Giuseppe Garibaldi"),
                        QuestionOption("d", "Napoleon Bonaparte")
                    ),
                    correctOptionId = "a",
                    explanation = "Bismarck utilized calculated wars and Prussian military strength to unify the German states into a single empire."
                ),
                Question(
                    id = 199,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "The Industrial Revolution catalyzed 19th-century European imperialism primarily because industrial nations sought:",
                    options = listOf(
                        QuestionOption("a", "Cheap raw materials for factories and captive overseas markets for manufactured surplus goods"),
                        QuestionOption("b", "Places to build agricultural communes"),
                        QuestionOption("c", "To abandon steam technologies"),
                        QuestionOption("d", "To adopt traditional African legal systems")
                    ),
                    correctOptionId = "a",
                    explanation = "Industrialization generated immense demand for rubber, oil, cotton, and mineral inputs, driving imperial expansion."
                ),
                Question(
                    id = 200,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "Which Italian leaders played prominent roles in the Risorgimento (unification of Italy)?",
                    options = listOf(
                        QuestionOption("a", "Count Cavour and Giuseppe Garibaldi"),
                        QuestionOption("b", "Otto von Bismarck and Kaiser Wilhelm"),
                        QuestionOption("c", "Vladimir Lenin and Leon Trotsky"),
                        QuestionOption("d", "Robespierre and Danton")
                    ),
                    correctOptionId = "a",
                    explanation = "Cavour's diplomatic maneuvers and Garibaldi's 'Redshirts' military campaign unified Italy by 1871."
                )
            )
        ),
        "hist_u2" to Quiz(
            id = "quiz_hist_u2",
            title = "Africa & the Colonial Experience (1880s–1960s) Quiz",
            subject = "History",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "pillar",
            unitId = "hist_u2",
            subjectId = "history",
            questions = listOf(
                Question(
                    id = 201,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "Which conference convened by Otto von Bismarck established the rules for European colonial partition of Africa?",
                    options = listOf(
                        QuestionOption("a", "The Berlin Conference (1884–1885)"),
                        QuestionOption("b", "The Treaty of Versailles"),
                        QuestionOption("c", "The Geneva Convention"),
                        QuestionOption("d", "The Bandung Conference")
                    ),
                    correctOptionId = "a",
                    explanation = "The Berlin Conference regulated European colonization and trade in Africa, formalizing the 'Scramble for Africa'."
                ),
                Question(
                    id = 202,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "What was the French colonial policy of 'Assimilation' designed to achieve?",
                    options = listOf(
                        QuestionOption("a", "Transforming African subjects into culturally, linguistically, and legally French citizens"),
                        QuestionOption("b", "Ruling exclusively through indigenous chiefs and customary councils (Indirect Rule)"),
                        QuestionOption("c", "Preserving traditional African monarchies without interference"),
                        QuestionOption("d", "Evacuating all European personnel within five years")
                    ),
                    correctOptionId = "a",
                    explanation = "Assimilation sought to indoctrinate colonized peoples into French language, culture, and institutions."
                ),
                Question(
                    id = 203,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "Which colonial power made extensive use of the 'Indirect Rule' system spearheaded by Lord Lugard?",
                    options = listOf(
                        QuestionOption("a", "Britain"),
                        QuestionOption("b", "Portugal"),
                        QuestionOption("c", "Belgium"),
                        QuestionOption("d", "Germany")
                    ),
                    correctOptionId = "a",
                    explanation = "British colonial administration used traditional rulers as administrative intermediaries to govern subjects economically."
                ),
                Question(
                    id = 204,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "What was the Maji Maji rebellion (1905–1907) in German East Africa (Tanzania)?",
                    options = listOf(
                        QuestionOption("a", "An armed multi-ethnic indigenous uprising against forced cotton cultivation and German taxation"),
                        QuestionOption("b", "A peaceful diplomatic boundary negotiation"),
                        QuestionOption("c", "A civil war between coastal merchants"),
                        QuestionOption("d", "A rebellion against British railway construction")
                    ),
                    correctOptionId = "a",
                    explanation = "The Maji Maji revolt united diverse ethnic groups against harsh German colonial exploitation."
                )
            )
        ),
        "hist_u3" to Quiz(
            id = "quiz_hist_u3",
            title = "Social, Economic & Political Developments in Ethiopia mid-19th C. to 1941 Quiz",
            subject = "History",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "pillar",
            unitId = "hist_u3",
            subjectId = "history",
            questions = listOf(
                Question(
                    id = 205,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "Emperor Tewodros II (r. 1855–1868) is celebrated in modern Ethiopian history for initiating:",
                    options = listOf(
                        QuestionOption("a", "The reunification and centralization of the fragmented Ethiopian state, ending the Zemene Mesafint"),
                        QuestionOption("b", "The construction of the Franco-Ethiopian railway"),
                        QuestionOption("c", "The foundation of Addis Ababa as the permanent capital"),
                        QuestionOption("d", "The introduction of modern aviation")
                    ),
                    correctOptionId = "a",
                    explanation = "Tewodros II sought to break the regional feudal warlords (Zemene Mesafint) and build a unified, modernized nation."
                ),
                Question(
                    id = 206,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "On March 1, 1896, Ethiopian forces under Emperor Menelik II and Empress Taytu Betul achieved an epochal victory at:",
                    options = listOf(
                        QuestionOption("a", "The Battle of Adwa"),
                        QuestionOption("b", "The Battle of Gundet"),
                        QuestionOption("c", "The Battle of Metemma"),
                        QuestionOption("d", "The Battle of Maichew")
                    ),
                    correctOptionId = "a",
                    explanation = "The Battle of Adwa routed Italian invading armies, preserving Ethiopia's sovereign independence."
                ),
                Question(
                    id = 207,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "What was the discrepancy between the Amharic and Italian texts of Article XVII in the Treaty of Wuchale (1889)?",
                    options = listOf(
                        QuestionOption("a", "The Italian text claimed a protectorate over Ethiopia, while the Amharic text made foreign contacts optional"),
                        QuestionOption("b", "The Amharic text ceded all northern ports to Italy"),
                        QuestionOption("c", "The Italian text demanded annual tribute payments in gold"),
                        QuestionOption("d", "There was no disagreement between the language versions")
                    ),
                    correctOptionId = "a",
                    explanation = "Italian deceit in Article XVII falsely asserted an Italian protectorate, precipitating Emperor Menelik's declaration of war."
                ),
                Question(
                    id = 208,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "During the 1936–1941 Italian fascist occupation of Ethiopia, what characterized the patriotic resistance (Arbegnoch)?",
                    options = listOf(
                        QuestionOption("a", "Protracted guerrilla warfare in the countryside that tied down occupying forces until liberation in 1941"),
                        QuestionOption("b", "Complete surrender without resistance"),
                        QuestionOption("c", "Immediate mass emigration to Europe"),
                        QuestionOption("d", "Acceptance of colonial rule by all provincial leaders")
                    ),
                    correctOptionId = "a",
                    explanation = "Ethiopian Patriots (Arbegnoch) fought tenaciously across rural terrains, culminating in liberation in May 1941."
                )
            )
        ),
        "hist_u4" to Quiz(
            id = "quiz_hist_u4",
            title = "Society and Politics in the Age of World Wars 1914–1945 Quiz",
            subject = "History",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "pillar",
            unitId = "hist_u4",
            subjectId = "history",
            questions = listOf(
                Question(
                    id = 209,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "What immediate event triggered the outbreak of World War I in June 1914?",
                    options = listOf(
                        QuestionOption("a", "The assassination of Archduke Franz Ferdinand of Austria in Sarajevo"),
                        QuestionOption("b", "The German invasion of Poland"),
                        QuestionOption("c", "The sinking of the Lusitania"),
                        QuestionOption("d", "The Bolshevik Revolution in Russia")
                    ),
                    correctOptionId = "a",
                    explanation = "The assassination of the Austro-Hungarian heir triggered the web of European military alliances into general war."
                ),
                Question(
                    id = 210,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "Which 1919 peace treaty imposed war guilt, disarmament, and severe financial reparations on Germany?",
                    options = listOf(
                        QuestionOption("a", "The Treaty of Versailles"),
                        QuestionOption("b", "The Treaty of Utrecht"),
                        QuestionOption("c", "The Treaty of Brest-Litovsk"),
                        QuestionOption("d", "The Potsdam Agreement")
                    ),
                    correctOptionId = "a",
                    explanation = "The Treaty of Versailles humiliated Germany and established the League of Nations, creating resentment that led to WWII."
                ),
                Question(
                    id = 211,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "What totalitarian ideology emerged in Italy under Benito Mussolini and later in Germany under Adolf Hitler?",
                    options = listOf(
                        QuestionOption("a", "Fascism and Nazism"),
                        QuestionOption("b", "Democratic Socialism"),
                        QuestionOption("c", "Anarcho-syndicalism"),
                        QuestionOption("d", "Constitutional Liberalism")
                    ),
                    correctOptionId = "a",
                    explanation = "Fascism combined authoritarian dictatorship, hyper-nationalism, militarism, and suppression of civil freedoms."
                ),
                Question(
                    id = 212,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "Why did the League of Nations fail to stop Italy's unprovoked invasion of Ethiopia in 1935?",
                    options = listOf(
                        QuestionOption("a", "Major powers pursued appeasement and failed to enforce meaningful economic or oil sanctions"),
                        QuestionOption("b", "Ethiopia was not a member of the League"),
                        QuestionOption("c", "The League lacked any diplomatic charter"),
                        QuestionOption("d", "Italy had left the United Nations")
                    ),
                    correctOptionId = "a",
                    explanation = "The League of Nations proved powerless as Britain and France appeased Mussolini, ignoring Emperor Haile Selassie's plea."
                )
            )
        ),
        "hist_u5" to Quiz(
            id = "quiz_hist_u5",
            title = "Global and Regional Developments Since 1945 Quiz",
            subject = "History",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "pillar",
            unitId = "hist_u5",
            subjectId = "history",
            questions = listOf(
                Question(
                    id = 213,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "The post-WWII geopolitical rivalry between the United States and the Soviet Union is known as:",
                    options = listOf(
                        QuestionOption("a", "The Cold War"),
                        QuestionOption("b", "The Hundred Years' War"),
                        QuestionOption("c", "The War of the Spanish Succession"),
                        QuestionOption("d", "The Continental Blockade")
                    ),
                    correctOptionId = "a",
                    explanation = "The Cold War was characterized by nuclear arms races, ideological conflict, proxy wars, and alliance blocs."
                ),
                Question(
                    id = 214,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "What international organization was founded in San Francisco in 1945 to maintain global peace and security?",
                    options = listOf(
                        QuestionOption("a", "The United Nations (UN)"),
                        QuestionOption("b", "The League of Nations"),
                        QuestionOption("c", "The Warsaw Pact"),
                        QuestionOption("d", "The North Atlantic Treaty Organization (NATO)")
                    ),
                    correctOptionId = "a",
                    explanation = "The UN was founded post-WWII with Ethiopia as one of its 51 original founding member states."
                ),
                Question(
                    id = 215,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "What was the Non-Aligned Movement (NAM) founded at Belgrade in 1961?",
                    options = listOf(
                        QuestionOption("a", "A coalition of developing states declining formal alliance with either the US or Soviet superpower bloc"),
                        QuestionOption("b", "A military treaty uniting Western Europe"),
                        QuestionOption("c", "A nuclear weapons proliferation treaty"),
                        QuestionOption("d", "An organization dedicated to reviving colonial empires")
                    ),
                    correctOptionId = "a",
                    explanation = "Leaders like Tito, Nehru, Nasser, and Nkrumah created NAM to safeguard sovereignty amidst Cold War tensions."
                ),
                Question(
                    id = 216,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "In which year did the Organization of African Unity (OAU) establish its permanent headquarters in Addis Ababa?",
                    options = listOf(
                        QuestionOption("a", "1963"),
                        QuestionOption("b", "1945"),
                        QuestionOption("c", "1980"),
                        QuestionOption("d", "2002")
                    ),
                    correctOptionId = "a",
                    explanation = "On May 25, 1963, 32 independent African heads of state founded the OAU in Addis Ababa to promote unity and decolonization."
                )
            )
        ),
        "hist_u6" to Quiz(
            id = "quiz_hist_u6",
            title = "Ethiopia: Internal Developments and External Influences from 1941 to 1991 Quiz",
            subject = "History",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "pillar",
            unitId = "hist_u6",
            subjectId = "history",
            questions = listOf(
                Question(
                    id = 217,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "What popular student movement slogan in the 1960s challenged feudal tenancy and land ownership in Ethiopia?",
                    options = listOf(
                        QuestionOption("a", "'Land to the Tiller!'"),
                        QuestionOption("b", "'Liberty, Equality, Fraternity!'"),
                        QuestionOption("c", "'Peace, Bread, Land!'"),
                        QuestionOption("d", "'No Taxation without Representation!'")
                    ),
                    correctOptionId = "a",
                    explanation = "Ethiopian university students mobilized the public against feudal land tenure under the banner 'Land to the Tiller'."
                ),
                Question(
                    id = 218,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "In September 1974, which military coordinating committee deposed Emperor Haile Selassie I?",
                    options = listOf(
                        QuestionOption("a", "The Derg (Provisional Military Administrative Council)"),
                        QuestionOption("b", "The EPRDF"),
                        QuestionOption("c", "The Meison"),
                        QuestionOption("d", "The OLF")
                    ),
                    correctOptionId = "a",
                    explanation = "The Derg seized power during the 1974 revolution, ending centuries of imperial dynastic rule in Ethiopia."
                ),
                Question(
                    id = 219,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "What was the 1975 rural land proclamation enacted by the Derg regime?",
                    options = listOf(
                        QuestionOption("a", "Nationalization of all rural land without compensation, abolishing landlordism"),
                        QuestionOption("b", "Sale of rural farmland to foreign multinational corporations"),
                        QuestionOption("c", "Restoration of all feudal land holdings"),
                        QuestionOption("d", "Partition of farmland into private individual titled estates")
                    ),
                    correctOptionId = "a",
                    explanation = "Proclamation 31/1975 declared all rural land collective public property, granting usufruct rights to peasant cultivators."
                ),
                Question(
                    id = 220,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "In which year did armed insurgent forces (EPRDF) capture Addis Ababa, bringing an end to the Derg regime?",
                    options = listOf(
                        QuestionOption("a", "1991 (May 28)"),
                        QuestionOption("b", "1974"),
                        QuestionOption("c", "1984"),
                        QuestionOption("d", "2000")
                    ),
                    correctOptionId = "a",
                    explanation = "On May 28, 1991, the Derg government collapsed as EPRDF forces entered Addis Ababa, ushering in the transitional period."
                )
            )
        ),
        "hist_u7" to Quiz(
            id = "quiz_hist_u7",
            title = "Africa Since 1960 Quiz",
            subject = "History",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "pillar",
            unitId = "hist_u7",
            subjectId = "history",
            questions = listOf(
                Question(
                    id = 221,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "Why is the year 1960 famously commemorated as the 'Year of Africa'?",
                    options = listOf(
                        QuestionOption("a", "Seventeen African nations achieved formal political independence from colonial rule"),
                        QuestionOption("b", "The Berlin Conference was held"),
                        QuestionOption("c", "The African Union was established"),
                        QuestionOption("d", "Apartheid was first instituted in South Africa")
                    ),
                    correctOptionId = "a",
                    explanation = "In 1960, seventeen countries (mostly former French and British colonies) gained sovereign statehood."
                ),
                Question(
                    id = 222,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "What was the institutionalized system of racial segregation and white-minority rule in South Africa called?",
                    options = listOf(
                        QuestionOption("a", "Apartheid"),
                        QuestionOption("b", "Jim Crow"),
                        QuestionOption("c", "Assimilation"),
                        QuestionOption("d", "Indirect Rule")
                    ),
                    correctOptionId = "a",
                    explanation = "Apartheid was dismantled in the early 1990s through internal resistance (ANC) and global boycotts."
                ),
                Question(
                    id = 223,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "Who was elected as the first democratic, multi-racial President of post-apartheid South Africa in 1994?",
                    options = listOf(
                        QuestionOption("a", "Nelson Mandela"),
                        QuestionOption("b", "Kwame Nkrumah"),
                        QuestionOption("c", "Julius Nyerere"),
                        QuestionOption("d", "Patrice Lumumba")
                    ),
                    correctOptionId = "a",
                    explanation = "Nelson Mandela led South Africa's transition to a non-racial democracy after 27 years of political imprisonment."
                ),
                Question(
                    id = 224,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "In 2002, the Organization of African Unity (OAU) was officially transformed in Durban into:",
                    options = listOf(
                        QuestionOption("a", "The African Union (AU)"),
                        QuestionOption("b", "ECOWAS"),
                        QuestionOption("c", "COMESA"),
                        QuestionOption("d", "SADC")
                    ),
                    correctOptionId = "a",
                    explanation = "The AU was launched to accelerate economic integration, democratic governance, and peace across the continent."
                )
            )
        ),
        "hist_u8" to Quiz(
            id = "quiz_hist_u8",
            title = "Post-1991 Developments in Ethiopia Quiz",
            subject = "History",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "pillar",
            unitId = "hist_u8",
            subjectId = "history",
            questions = listOf(
                Question(
                    id = 225,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "What major constitutional document was ratified in December 1994, establishing the Federal Democratic Republic of Ethiopia?",
                    options = listOf(
                        QuestionOption("a", "The 1995 FDRE Constitution"),
                        QuestionOption("b", "The 1931 Imperial Constitution"),
                        QuestionOption("c", "The 1987 PDRE Constitution"),
                        QuestionOption("d", "The Transitional Charter of 1974")
                    ),
                    correctOptionId = "a",
                    explanation = "The 1995 Constitution restructured Ethiopia into a multinational federation of regional states."
                ),
                Question(
                    id = 226,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "Following a UN-monitored referendum in April 1993, which former province became an independent sovereign state?",
                    options = listOf(
                        QuestionOption("a", "Eritrea"),
                        QuestionOption("b", "Djibouti"),
                        QuestionOption("c", "Somaliland"),
                        QuestionOption("d", "South Sudan")
                    ),
                    correctOptionId = "a",
                    explanation = "Eritreans voted overwhelmingly for self-determination, resulting in internationally recognized independence in May 1993."
                ),
                Question(
                    id = 227,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "What major border war erupted in the Horn of Africa between 1998 and 2000, ending with the Algiers Peace Agreement?",
                    options = listOf(
                        QuestionOption("a", "The Ethio-Eritrean Border War"),
                        QuestionOption("b", "The Ogaden Conflict"),
                        QuestionOption("c", "The Mahdist Invasion"),
                        QuestionOption("d", "The Suez Crisis")
                    ),
                    correctOptionId = "a",
                    explanation = "The Ethio-Eritrean conflict over disputed borders concluded with the signing of the Algiers Agreement in December 2000."
                ),
                Question(
                    id = 228,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "The political reforms initiated in Ethiopia in 2018 placed primary emphasis on:",
                    options = listOf(
                        QuestionOption("a", "Expanding political space, freeing prisoners, peace with Eritrea, and national institutional reforms"),
                        QuestionOption("b", "Restoring imperial monarchy under constitutional decree"),
                        QuestionOption("c", "Severing all foreign diplomatic relations"),
                        QuestionOption("d", "Establishing a single military tribunal")
                    ),
                    correctOptionId = "a",
                    explanation = "The 2018 transition brought reconciliation with Eritrea, economic reforms, and widening of political participation."
                )
            )
        ),
        "hist_u9" to Quiz(
            id = "quiz_hist_u9",
            title = "Indigenous Knowledge and Heritages of Ethiopia Quiz",
            subject = "History",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "pillar",
            unitId = "hist_u9",
            subjectId = "history",
            questions = listOf(
                Question(
                    id = 229,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "Which ancient Ethiopian civilization erected towering monolithic granite stelae during the 3rd and 4th centuries CE?",
                    options = listOf(
                        QuestionOption("a", "The Aksumite Civilization"),
                        QuestionOption("b", "The Damat Kingdom"),
                        QuestionOption("c", "The Zagwe Dynasty"),
                        QuestionOption("d", "The Sultanate of Adal")
                    ),
                    correctOptionId = "a",
                    explanation = "The Kingdom of Aksum carved and raised enormous monolithic obelisks over royal burial hypogea."
                ),
                Question(
                    id = 230,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "The eleven rock-hewn monolithic churches inscribed on the UNESCO World Heritage list were constructed under which ruler?",
                    options = listOf(
                        QuestionOption("a", "King Lalibela (Zagwe Dynasty)"),
                        QuestionOption("b", "Emperor Ezana"),
                        QuestionOption("c", "Emperor Fasilides"),
                        QuestionOption("d", "Emperor Susenyos")
                    ),
                    correctOptionId = "a",
                    explanation = "King Lalibela commissioned the remarkable subterranean monolithic churches in Roha (Lalibela) in the 12th–13th century."
                ),
                Question(
                    id = 231,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "The Gadaa system, recognized by UNESCO as an Intangible Cultural Heritage of Humanity, is:",
                    options = listOf(
                        QuestionOption("a", "An indigenous democratic socio-political generation-class system of the Oromo people"),
                        QuestionOption("b", "A military secret code used during WWII"),
                        QuestionOption("c", "A style of stone palace masonry in Gondar"),
                        QuestionOption("d", "An imperial taxation ledger")
                    ),
                    correctOptionId = "a",
                    explanation = "Gadaa guides political, social, and judicial life through periodic 8-year peaceful power handovers."
                ),
                Question(
                    id = 232,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "Fasil Ghebbi, the fortified imperial compound of castles and palaces, is located in which historic Ethiopian city?",
                    options = listOf(
                        QuestionOption("a", "Gondar"),
                        QuestionOption("b", "Harar"),
                        QuestionOption("c", "Mekelle"),
                        QuestionOption("d", "Hawassa")
                    ),
                    correctOptionId = "a",
                    explanation = "Emperor Fasilides established Gondar as the permanent imperial capital in 1636, constructing stone castles inside Fasil Ghebbi."
                )
            )
        ),

        // ==========================================
        // 9. HEALTH & PHYSICAL EDUCATION (health_pe) — 8 units
        // ==========================================
        "health_u1" to Quiz(
            id = "quiz_health_u1",
            title = "Sport and Society Quiz",
            subject = "Health & Physical Education",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "fitness",
            unitId = "health_u1",
            subjectId = "health_pe",
            questions = listOf(
                Question(
                    id = 233,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "How does organized participation in sports contribute to positive socialization?",
                    options = listOf(
                        QuestionOption("a", "It instills teamwork, discipline, fair play, leadership skills, and mutual respect"),
                        QuestionOption("b", "It promotes violence and hostility between neighbors"),
                        QuestionOption("c", "It encourages cheating whenever referees are distracted"),
                        QuestionOption("d", "It discourages academic study habits")
                    ),
                    correctOptionId = "a",
                    explanation = "Sport teaches social cooperation, ethical conduct, self-regulation, and collaborative problem-solving."
                ),
                Question(
                    id = 234,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "How have legendary Ethiopian distance runners (such as Abebe Bikila and Derartu Tulu) impacted national identity?",
                    options = listOf(
                        QuestionOption("a", "They inspired national unity, international pride, and showcased African athletic excellence on the global Olympic stage"),
                        QuestionOption("b", "They prevented other sports from being played in the country"),
                        QuestionOption("c", "They discouraged youth from entering athletics"),
                        QuestionOption("d", "They restricted sports participation to military officers")
                    ),
                    correctOptionId = "a",
                    explanation = "Abebe Bikila's barefoot 1960 Olympic gold and subsequent champions forged a legendary heritage of perseverance."
                ),
                Question(
                    id = 235,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "What is the primary role of gender equity initiatives in community physical education?",
                    options = listOf(
                        QuestionOption("a", "Ensuring equal opportunities, resources, facilities, and encouragement for girls and women in sports"),
                        QuestionOption("b", "Excluding female participants from competitive matches"),
                        QuestionOption("c", "Mandating identical physical strength outcomes for all ages"),
                        QuestionOption("d", "Abolishing all school sports tournaments")
                    ),
                    correctOptionId = "a",
                    explanation = "Gender equity breaks barriers, fostering women's empowerment, wellness, and equal competitive participation."
                ),
                Question(
                    id = 236,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "Traditional cultural games in Ethiopia (such as Genna, Gugs, and Qille) serve the societal function of:",
                    options = listOf(
                        QuestionOption("a", "Preserving cultural heritage, celebrating holidays, and strengthening community solidarity"),
                        QuestionOption("b", "Replacing formal mathematics education"),
                        QuestionOption("c", "Causing permanent divisions between villages"),
                        QuestionOption("d", "Eliminating traditional music and dance")
                    ),
                    correctOptionId = "a",
                    explanation = "Traditional games (like Genna played at Christmas) preserve cultural folklore, physical dexterity, and festive fellowship."
                )
            )
        ),
        "health_u2" to Quiz(
            id = "quiz_health_u2",
            title = "Health and Physical Fitness Quiz",
            subject = "Health & Physical Education",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "fitness",
            unitId = "health_u2",
            subjectId = "health_pe",
            questions = listOf(
                Question(
                    id = 237,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "What are the five health-related components of physical fitness?",
                    options = listOf(
                        QuestionOption("a", "Cardiorespiratory endurance, muscular strength, muscular endurance, flexibility, body composition"),
                        QuestionOption("b", "Agility, balance, coordination, power, reaction time"),
                        QuestionOption("c", "Speed, height, weight, eyesight, hearing"),
                        QuestionOption("d", "Caloric intake, water hydration, sleep duration, pulse, blood type")
                    ),
                    correctOptionId = "a",
                    explanation = "Health-related fitness directly correlates with daily health status, metabolic wellness, and disease prevention."
                ),
                Question(
                    id = 238,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "In exercise prescription, what does the F.I.T.T. acronym stand for?",
                    options = listOf(
                        QuestionOption("a", "Frequency, Intensity, Time, Type"),
                        QuestionOption("b", "Fast, Interval, Treadmill, Technique"),
                        QuestionOption("c", "Fitness, Intake, Target, Training"),
                        QuestionOption("d", "Flexibility, Isometric, Total, Torque")
                    ),
                    correctOptionId = "a",
                    explanation = "F.I.T.T. guides sound training: How often (Frequency), how hard (Intensity), how long (Time), and what mode (Type)."
                ),
                Question(
                    id = 239,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "Aerobic physical exercise differs from anaerobic training primarily because aerobic exercise:",
                    options = listOf(
                        QuestionOption("a", "Utilizes oxygen for sustained, rhythmic cardiovascular exertion over an extended duration"),
                        QuestionOption("b", "Relies strictly on anaerobic glycolysis for 10-second explosive efforts"),
                        QuestionOption("c", "Does not involve the heart or lungs"),
                        QuestionOption("d", "Can only be performed underwater")
                    ),
                    correctOptionId = "a",
                    explanation = "Aerobic activities (jogging, cycling) train heart-lung efficiency by delivering oxygen to working muscles over time."
                ),
                Question(
                    id = 240,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "What is the training principle of 'Overload'?",
                    options = listOf(
                        QuestionOption("a", "To improve fitness, biological systems must be subjected to workloads greater than accustomed levels"),
                        QuestionOption("b", "Exercising to the point of acute bone fractures"),
                        QuestionOption("c", "Training continuously without ever drinking water"),
                        QuestionOption("d", "Repeating identical low-intensity routines for decades")
                    ),
                    correctOptionId = "a",
                    explanation = "Progressive overload challenges muscles and cardiovascular systems to stimulate physiological adaptation and growth."
                )
            )
        ),
        "health_u3" to Quiz(
            id = "quiz_health_u3",
            title = "Athletics Quiz",
            subject = "Health & Physical Education",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "fitness",
            unitId = "health_u3",
            subjectId = "health_pe",
            questions = listOf(
                Question(
                    id = 241,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "Which track events are classified as sprint races in athletics?",
                    options = listOf(
                        QuestionOption("a", "100 m, 200 m, and 400 m"),
                        QuestionOption("b", "800 m and 1,500 m"),
                        QuestionOption("c", "5,000 m and 10,000 m"),
                        QuestionOption("d", "Marathon (42.195 km)")
                    ),
                    correctOptionId = "a",
                    explanation = "Sprints encompass short explosive events up to 400 meters run in designated lanes from starting blocks."
                ),
                Question(
                    id = 242,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "What is the standard baton exchange zone length in a 4 × 100 meter relay race?",
                    options = listOf(
                        QuestionOption("a", "20 meters (or 30 m including acceleration zone under modern WA rules)"),
                        QuestionOption("b", "5 meters"),
                        QuestionOption("c", "50 meters"),
                        QuestionOption("d", "100 meters")
                    ),
                    correctOptionId = "a",
                    explanation = "Relay runners must pass the baton within the specified passing takeover zone to avoid disqualification."
                ),
                Question(
                    id = 243,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "Which of the following field events is classified as a jumping event in athletics?",
                    options = listOf(
                        QuestionOption("a", "Long Jump, Triple Jump, High Jump, and Pole Vault"),
                        QuestionOption("b", "Shot Put and Discus Throw"),
                        QuestionOption("c", "Javelin Throw and Hammer Throw"),
                        QuestionOption("d", "Steeplechase water jump only")
                    ),
                    correctOptionId = "a",
                    explanation = "The four standard Olympic jumping field disciplines are long jump, triple jump, high jump, and pole vault."
                ),
                Question(
                    id = 244,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "In distance running races (e.g., 5,000 m or 10,000 m), what physiological metric best measures aerobic capacity?",
                    options = listOf(
                        QuestionOption("a", "VO₂ max (maximal oxygen consumption rate)"),
                        QuestionOption("b", "Peak bench press strength"),
                        QuestionOption("c", "Standing vertical jump height"),
                        QuestionOption("d", "Skin melanin density")
                    ),
                    correctOptionId = "a",
                    explanation = "VO₂ max measures the maximum volume of oxygen the body can transport and utilize during exhaustive aerobic exercise."
                )
            )
        ),
        "health_u4" to Quiz(
            id = "quiz_health_u4",
            title = "Football Quiz",
            subject = "Health & Physical Education",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "fitness",
            unitId = "health_u4",
            subjectId = "health_pe",
            questions = listOf(
                Question(
                    id = 245,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "How many players per team are on the pitch at the kickoff of a standard association football match?",
                    options = listOf(
                        QuestionOption("a", "11 players (including one goalkeeper)"),
                        QuestionOption("b", "9 players"),
                        QuestionOption("c", "15 players"),
                        QuestionOption("d", "7 players")
                    ),
                    correctOptionId = "a",
                    explanation = "Standard IFAB football rules specify 11 players per side on the pitch at kickoff."
                ),
                Question(
                    id = 246,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "According to Law 11 (Offside), a player is in an offside position if they are:",
                    options = listOf(
                        QuestionOption("a", "Nearer to the opponents' goal line than both the ball and the second-last opponent in the attacking half"),
                        QuestionOption("b", "Behind the ball when it is passed forward"),
                        QuestionOption("c", "Directly receiving a throw-in, corner kick, or goal kick"),
                        QuestionOption("d", "Standing in their own defensive half of the pitch")
                    ),
                    correctOptionId = "a",
                    explanation = "An attacking player is offside if ahead of the ball and second-last opponent when the ball is played to them."
                ),
                Question(
                    id = 247,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "What restart is awarded when the defending team kicks the ball over their own goal line (not into the goal)?",
                    options = listOf(
                        QuestionOption("a", "Corner kick to the attacking team"),
                        QuestionOption("b", "Goal kick to the defending team"),
                        QuestionOption("c", "Penalty kick"),
                        QuestionOption("d", "Dropped ball at midfield")
                    ),
                    correctOptionId = "a",
                    explanation = "If the defending team touches the ball last before it crosses the goal line, a corner kick is awarded."
                ),
                Question(
                    id = 248,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "What is the duration of a standard regulation adult football match?",
                    options = listOf(
                        QuestionOption("a", "Two equal halves of 45 minutes (90 minutes total plus stoppage time)"),
                        QuestionOption("b", "Four quarters of 15 minutes"),
                        QuestionOption("c", "Two halves of 30 minutes"),
                        QuestionOption("d", "60 minutes total with stopped clock")
                    ),
                    correctOptionId = "a",
                    explanation = "Regulation football consists of two 45-minute halves with a 15-minute halftime interval."
                )
            )
        ),
        "health_u5" to Quiz(
            id = "quiz_health_u5",
            title = "Volleyball Quiz",
            subject = "Health & Physical Education",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "fitness",
            unitId = "health_u5",
            subjectId = "health_pe",
            questions = listOf(
                Question(
                    id = 249,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "What is the maximum number of consecutive ball contacts allowed for a team before returning the ball over the net?",
                    options = listOf(
                        QuestionOption("a", "3 contacts (excluding a block contact)"),
                        QuestionOption("b", "1 contact"),
                        QuestionOption("c", "5 contacts"),
                        QuestionOption("d", "Unlimited touches as long as the ball does not bounce")
                    ),
                    correctOptionId = "a",
                    explanation = "Teams must return the ball within 3 contacts (typically bump/pass, set, and spike)."
                ),
                Question(
                    id = 250,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "In standard volleyball rotation rules, which direction do players rotate upon winning the service?",
                    options = listOf(
                        QuestionOption("a", "Clockwise"),
                        QuestionOption("b", "Counter-clockwise"),
                        QuestionOption("c", "Diagonal switch only"),
                        QuestionOption("d", "Players do not rotate positions")
                    ),
                    correctOptionId = "a",
                    explanation = "When a receiving team earns a side-out, its players rotate one spot in a clockwise direction."
                ),
                Question(
                    id = 251,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "What is the specialized defensive role of the 'Libero' player in volleyball?",
                    options = listOf(
                        QuestionOption("a", "Back-row defensive specialist who wears a contrasting jersey and cannot serve, attack, or block"),
                        QuestionOption("b", "Primary front-row spike attacker"),
                        QuestionOption("c", "Team goalkeeper defending the net floor"),
                        QuestionOption("d", "Sole player allowed to catch the ball")
                    ),
                    correctOptionId = "a",
                    explanation = "The Libero provides expert digging and passing in the back row, wearing a distinct jersey."
                ),
                Question(
                    id = 252,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "In rally scoring volleyball, how many points are needed to win a standard non-deciding set?",
                    options = listOf(
                        QuestionOption("a", "25 points, with at least a 2-point advantage"),
                        QuestionOption("b", "15 points flat"),
                        QuestionOption("c", "21 points, sudden death"),
                        QuestionOption("d", "50 points")
                    ),
                    correctOptionId = "a",
                    explanation = "Sets 1 to 4 are played to 25 points (win by 2); the deciding 5th set is played to 15 points (win by 2)."
                )
            )
        ),
        "health_u6" to Quiz(
            id = "quiz_health_u6",
            title = "Basketball Quiz",
            subject = "Health & Physical Education",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "fitness",
            unitId = "health_u6",
            subjectId = "health_pe",
            questions = listOf(
                Question(
                    id = 253,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "How many points is a successful field goal shot from beyond the three-point arc worth?",
                    options = listOf(
                        QuestionOption("a", "3 points"),
                        QuestionOption("b", "2 points"),
                        QuestionOption("c", "1 point"),
                        QuestionOption("d", "4 points")
                    ),
                    correctOptionId = "a",
                    explanation = "Baskets scored from behind the 3-point perimeter line count for 3 points."
                ),
                Question(
                    id = 254,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "What violation occurs if an offensive player takes more than two steps without dribbling the ball?",
                    options = listOf(
                        QuestionOption("a", "Traveling violation"),
                        QuestionOption("b", "Double dribble"),
                        QuestionOption("c", "Shot clock expiration"),
                        QuestionOption("d", "Three-second key violation")
                    ),
                    correctOptionId = "a",
                    explanation = "Moving both feet without dribbling constitutes a traveling violation, turning possession over."
                ),
                Question(
                    id = 255,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "In FIBA international basketball rules, what is the shot clock duration allowed for an offensive possession?",
                    options = listOf(
                        QuestionOption("a", "24 seconds"),
                        QuestionOption("b", "30 seconds"),
                        QuestionOption("c", "45 seconds"),
                        QuestionOption("d", "60 seconds")
                    ),
                    correctOptionId = "a",
                    explanation = "Teams must attempt a shot that contacts the rim within 24 seconds of gaining control."
                ),
                Question(
                    id = 256,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "What is a 'double dribble' infraction in basketball?",
                    options = listOf(
                        QuestionOption("a", "Dribbling with both hands simultaneously, or resuming dribbling after bringing it to a complete stop"),
                        QuestionOption("b", "Scoring two baskets in a row"),
                        QuestionOption("c", "Passing the ball off the backboard"),
                        QuestionOption("d", "Dribbling between the legs")
                    ),
                    correctOptionId = "a",
                    explanation = "Once a player stops their dribble by holding the ball, they may not dribble again."
                )
            )
        ),
        "health_u7" to Quiz(
            id = "quiz_health_u7",
            title = "Handball Quiz",
            subject = "Health & Physical Education",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "fitness",
            unitId = "health_u7",
            subjectId = "health_pe",
            questions = listOf(
                Question(
                    id = 257,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "How many steps is a team handball court player allowed to take with the ball without bouncing (dribbling) it?",
                    options = listOf(
                        QuestionOption("a", "A maximum of 3 steps"),
                        QuestionOption("b", "1 step only"),
                        QuestionOption("c", "5 steps"),
                        QuestionOption("d", "Unlimited steps")
                    ),
                    correctOptionId = "a",
                    explanation = "Handball rules limit holding the ball without dribbling or passing to a maximum of 3 steps and 3 seconds."
                ),
                Question(
                    id = 258,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "Who is the only player permitted inside the 6-meter goal area (crease) in team handball?",
                    options = listOf(
                        QuestionOption("a", "The defending goalkeeper"),
                        QuestionOption("b", "The team captain"),
                        QuestionOption("c", "The offensive pivot/center"),
                        QuestionOption("d", "Any defender in a standing position")
                    ),
                    correctOptionId = "a",
                    explanation = "Court players cannot touch the floor inside the 6-meter D-zone; only the goalkeeper is allowed inside."
                ),
                Question(
                    id = 259,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "How many players represent each team on the court during an official team handball match?",
                    options = listOf(
                        QuestionOption("a", "7 players (6 court players + 1 goalkeeper)"),
                        QuestionOption("b", "5 players"),
                        QuestionOption("c", "11 players"),
                        QuestionOption("d", "9 players")
                    ),
                    correctOptionId = "a",
                    explanation = "Handball is contested by 7 active players per team on a 40 × 20 meter indoor court."
                ),
                Question(
                    id = 260,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "What is the penalty duration for a player receiving a 2-minute suspension for a serious foul in handball?",
                    options = listOf(
                        QuestionOption("a", "2 minutes in the penalty box, with their team playing one player down"),
                        QuestionOption("b", "Permanent ejection for the rest of the season"),
                        QuestionOption("c", "10 minutes of extra jogging"),
                        QuestionOption("d", "Zero time, only a verbal reminder")
                    ),
                    correctOptionId = "a",
                    explanation = "A 2-minute suspension forces the penalized team to play shorthanded for two full minutes."
                )
            )
        ),
        "health_u8" to Quiz(
            id = "quiz_health_u8",
            title = "Self-Defense and Sport Ethics Quiz",
            subject = "Health & Physical Education",
            durationMinutes = 10,
            gradeLevel = "Grade 10",
            iconName = "fitness",
            unitId = "health_u8",
            subjectId = "health_pe",
            questions = listOf(
                Question(
                    id = 261,
                    questionNumber = 1,
                    totalQuestions = 4,
                    text = "What is the primary objective of self-defense training for students?",
                    options = listOf(
                        QuestionOption("a", "Personal safety, situational awareness, conflict de-escalation, and escaping harm"),
                        QuestionOption("b", "Starting fights with bullies in public"),
                        QuestionOption("c", "Demonstrating physical dominance over peers"),
                        QuestionOption("d", "Learning illegal street combat moves")
                    ),
                    correctOptionId = "a",
                    explanation = "Self-defense emphasizes risk avoidance, de-escalation, boundary setting, and necessary proportional evasion."
                ),
                Question(
                    id = 262,
                    questionNumber = 2,
                    totalQuestions = 4,
                    text = "What does 'Fair Play' mean as a core ethical principle in athletic competitions?",
                    options = listOf(
                        QuestionOption("a", "Adhering to rules, respecting opponents and officials, and rejecting performance-enhancing doping"),
                        QuestionOption("b", "Winning at all costs by breaking rules if not caught"),
                        QuestionOption("c", "Bribing match judges"),
                        QuestionOption("d", "Intimidating younger teammates")
                    ),
                    correctOptionId = "a",
                    explanation = "Fair play embodies honesty, respect, integrity, and graciousness in both victory and defeat."
                ),
                Question(
                    id = 263,
                    questionNumber = 3,
                    totalQuestions = 4,
                    text = "Why is doping (using prohibited performance-enhancing substances) condemned in sports?",
                    options = listOf(
                        QuestionOption("a", "It undermines health, violates fair play, creates unfair advantages, and corrupts sportsmanship"),
                        QuestionOption("b", "It makes athletes too slow"),
                        QuestionOption("c", "It reduces stadium ticket prices"),
                        QuestionOption("d", "It is encouraged by Olympic committees")
                    ),
                    correctOptionId = "a",
                    explanation = "Doping causes severe health risks, destroys competitive integrity, and violates anti-doping codes (WADA)."
                ),
                Question(
                    id = 264,
                    questionNumber = 4,
                    totalQuestions = 4,
                    text = "In emergency first aid, what is the immediate recommended protocol for acute muscle sprains and joint strains?",
                    options = listOf(
                        QuestionOption("a", "R.I.C.E. (Rest, Ice, Compression, Elevation)"),
                        QuestionOption("b", "Immediate aggressive heavy weight lifting"),
                        QuestionOption("c", "Applying boiling hot water directly to the swollen joint"),
                        QuestionOption("d", "Running a 10-kilometer sprint")
                    ),
                    correctOptionId = "a",
                    explanation = "The R.I.C.E. protocol reduces inflammation, internal hemorrhage, and swelling in acute soft-tissue injuries."
                )
            )
        )
    )
}
