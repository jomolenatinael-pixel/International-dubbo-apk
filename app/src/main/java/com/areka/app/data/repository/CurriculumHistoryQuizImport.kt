package com.areka.app.data.repository

import com.areka.app.data.model.Question
import com.areka.app.data.model.QuestionOption
import com.areka.app.data.model.QuestionType
import com.areka.app.data.model.Quiz

/**
 * Imported from History_Grade10_FullSubject_Quiz.html.
 * 9 units × 100 questions, bundled for offline-first study.
 */
object CurriculumHistoryQuizImport {
    val quizzes: Map<String, Quiz> = mapOf(
        "hist_u1" to Quiz(
            id = "quiz_history_u1_full",
            title = "Development of Capitalism and Nationalism 1815–1914 Quiz",
            subject = "History",
            durationMinutes = 45,
            gradeLevel = "Grade 10",
            iconName = "pillar",
            unitId = "hist_u1",
            subjectId = "history",
            questions = listOf(
                Question(
                    id = 10001,
                    questionNumber = 1,
                    totalQuestions = 100,
                    text = "Capitalism has been the dominant economic system in the Western world since the collapse of feudalism.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The unit states that capitalism has been the dominant economic system in the West since feudalism collapsed."
                ),
                Question(
                    id = 10002,
                    questionNumber = 2,
                    totalQuestions = 100,
                    text = "In the capitalist system, most means of production are owned by the government.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "In capitalism, most means of production are privately owned, not government-owned."
                ),
                Question(
                    id = 10003,
                    questionNumber = 3,
                    totalQuestions = 100,
                    text = "The Industrial Revolution first started in England in the 18th century.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The text states the Industrial Revolution first started in England in the 18th century."
                ),
                Question(
                    id = 10004,
                    questionNumber = 4,
                    totalQuestions = 100,
                    text = "After England, Belgium, France, and the German states became industrialized.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The unit lists Belgium, France, and the German states as the countries that industrialized after England."
                ),
                Question(
                    id = 10005,
                    questionNumber = 5,
                    totalQuestions = 100,
                    text = "The Factory system replaced the domestic system of production.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The Factory system was created to replace the domestic system, in which workers used hand tools at home."
                ),
                Question(
                    id = 10006,
                    questionNumber = 6,
                    totalQuestions = 100,
                    text = "Industrialization promoted the growth of the proletariat and the bourgeoisie as new social classes.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The text says industrialization promoted new socio-economic classes, especially the proletariat and the bourgeoisie."
                ),
                Question(
                    id = 10007,
                    questionNumber = 7,
                    totalQuestions = 100,
                    text = "The transatlantic slave trade played no role in financing Europe's industrialization.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "The text says slave trade and plantation riches were important factors in the development of capitalism in Europe."
                ),
                Question(
                    id = 10008,
                    questionNumber = 8,
                    totalQuestions = 100,
                    text = "Textile mills played a key part in the rise of the city of Manchester.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The passage states textile mills played a key part in the rise of Manchester."
                ),
                Question(
                    id = 10009,
                    questionNumber = 9,
                    totalQuestions = 100,
                    text = "A command economy is one in which the government controls production, distribution, and prices.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The text defines a command economy as one where government controls volume of production, distribution and prices."
                ),
                Question(
                    id = 10010,
                    questionNumber = 10,
                    totalQuestions = 100,
                    text = "The Congress of Vienna in 1815 aimed to reverse the changes brought by Napoleon and restore monarchies.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Britain, Russia, Prussia and Austria drew the Treaty of Vienna in 1815 to reverse Napoleonic changes and restore monarchies."
                ),
                Question(
                    id = 10011,
                    questionNumber = 11,
                    totalQuestions = 100,
                    text = "In 1815, Italy was politically unified under one king.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "In 1815, Italy was left completely fragmented by the Congress of Vienna settlements, not unified."
                ),
                Question(
                    id = 10012,
                    questionNumber = 12,
                    totalQuestions = 100,
                    text = "The Papal States cut off the north of the Italian peninsula from the south.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The text says the Papal States straddled the centre of the peninsula, cutting the north off from the south."
                ),
                Question(
                    id = 10013,
                    questionNumber = 13,
                    totalQuestions = 100,
                    text = "The Kingdom of Sardinia was also called Piedmont-Sardinia.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The unit states the Kingdom of Sardinia was also called Piedmont-Sardinia."
                ),
                Question(
                    id = 10014,
                    questionNumber = 14,
                    totalQuestions = 100,
                    text = "Giuseppe Mazzini favoured monarchy as the best form of government for a united Italy.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "Mazzini viewed nation states as necessary and opposed monarchy, wanting a liberal democratic republic."
                ),
                Question(
                    id = 10015,
                    questionNumber = 15,
                    totalQuestions = 100,
                    text = "Mazzini founded the 'Young Italy' movement in 1831.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The text states Mazzini founded Young Italy in 1831."
                ),
                Question(
                    id = 10016,
                    questionNumber = 16,
                    totalQuestions = 100,
                    text = "Cavour became prime minister of the Kingdom of Sardinia in 1852.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The passage states Cavour became prime minister of independent Sardinia in 1852."
                ),
                Question(
                    id = 10017,
                    questionNumber = 17,
                    totalQuestions = 100,
                    text = "Cavour promised to give Nice and Savoy to France in exchange for military help against Austria.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "For France's help against Austria, Cavour promised to give the regions of Nice and Savoy to France."
                ),
                Question(
                    id = 10018,
                    questionNumber = 18,
                    totalQuestions = 100,
                    text = "Giuseppe Garibaldi led an army known as the Red Shirts.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The text states Garibaldi led the Red Shirts, an army that wore bright red shirts into battle."
                ),
                Question(
                    id = 10019,
                    questionNumber = 19,
                    totalQuestions = 100,
                    text = "The Kingdom of Italy was established in 1861 with Victor Emmanuel II as king.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "In 1861 the kingdom of Italy was established and King Victor Emmanuel II became its king."
                ),
                Question(
                    id = 10020,
                    questionNumber = 20,
                    totalQuestions = 100,
                    text = "Italy gained Venetia in 1866 after the Seven Weeks War.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Following Austria's defeat in the Seven Weeks War of 1866, Italy got Venetia."
                ),
                Question(
                    id = 10021,
                    questionNumber = 21,
                    totalQuestions = 100,
                    text = "Rome became part of unified Italy in 1870 after French troops withdrew during the Franco-Prussian War.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "When the Franco-Prussian war broke out in 1870, French armies withdrew from Italy and Italians entered Rome, completing unification."
                ),
                Question(
                    id = 10022,
                    questionNumber = 22,
                    totalQuestions = 100,
                    text = "After unification, the Mafia became a secret society the central Italian government could not control.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The text lists the formation of the Mafia, a state within a state the central government was powerless to control, as a post-unification problem."
                ),
                Question(
                    id = 10023,
                    questionNumber = 23,
                    totalQuestions = 100,
                    text = "The Congress of Vienna in 1815 created the German Confederation of 39 separate autonomous states.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The text states the 1815 Congress of Vienna created the German Confederation, consisting of 39 separate autonomous states."
                ),
                Question(
                    id = 10024,
                    questionNumber = 24,
                    totalQuestions = 100,
                    text = "The Revolution of 1848 succeeded in unifying the German states.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "The text says the Revolution of 1848 failed in its attempt to unify the German-speaking states."
                ),
                Question(
                    id = 10025,
                    questionNumber = 25,
                    totalQuestions = 100,
                    text = "The Zollverein was a military alliance formed by the German states in 1834.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "The Zollverein was an economic alliance (customs union) that promoted trade and removed tariffs, not a military alliance."
                ),
                Question(
                    id = 10026,
                    questionNumber = 26,
                    totalQuestions = 100,
                    text = "Otto von Bismarck came from the Junker class, the landed nobility of Prussia.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The text states Bismarck came from the Junker class, or landed nobility, in Prussia."
                ),
                Question(
                    id = 10027,
                    questionNumber = 27,
                    totalQuestions = 100,
                    text = "Bismarck pursued German unification mainly through peaceful parliamentary negotiation.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "Bismarck used realpolitik and the 'Blood and Iron' policy, achieving unification through three wars, not peaceful negotiation."
                ),
                Question(
                    id = 10028,
                    questionNumber = 28,
                    totalQuestions = 100,
                    text = "The Danish War of 1864 resulted in Schleswig going to Prussia and Holstein remaining with Austria.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "As a result of the Danish War, Schleswig was given to Prussia while Austria kept Holstein."
                ),
                Question(
                    id = 10029,
                    questionNumber = 29,
                    totalQuestions = 100,
                    text = "The Battle of Königgrätz (Sadowa) in 1866 resulted in a quick Prussian victory over Austria.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "At the Battle of Königgrätz on 3 July 1866, the Prussian army quickly defeated the Austrian forces."
                ),
                Question(
                    id = 10030,
                    questionNumber = 30,
                    totalQuestions = 100,
                    text = "The Ems Telegram was published by Bismarck to provoke France into declaring war on Prussia.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Bismarck published the edited Ems Telegram to provoke France to declare war on Prussia in 1870."
                ),
                Question(
                    id = 10031,
                    questionNumber = 31,
                    totalQuestions = 100,
                    text = "Which European country was the first to become industrialized?",
                    options = listOf(
                        QuestionOption("a", "France"),
                        QuestionOption("b", "Belgium"),
                        QuestionOption("c", "Germany"),
                        QuestionOption("d", "England")
                    ),
                    correctOptionId = "d",
                    explanation = "The text states the Industrial Revolution first started in England in the 18th century."
                ),
                Question(
                    id = 10032,
                    questionNumber = 32,
                    totalQuestions = 100,
                    text = "Which two social classes emerged especially as a result of industrialization, according to the unit?",
                    options = listOf(
                        QuestionOption("a", "The peasantry and the feudal lord"),
                        QuestionOption("b", "The capitalist and the bourgeoisie"),
                        QuestionOption("c", "The proletariat and the bourgeoisie"),
                        QuestionOption("d", "The feudal lord and the bourgeoisie")
                    ),
                    correctOptionId = "c",
                    explanation = "Industrialization promoted new socio-economic classes, especially the proletariat and the bourgeoisie."
                ),
                Question(
                    id = 10033,
                    questionNumber = 33,
                    totalQuestions = 100,
                    text = "In the capitalist system, who owns the means of production?",
                    options = listOf(
                        QuestionOption("a", "The government"),
                        QuestionOption("b", "A small group of wealthy individuals (capitalists/bourgeoisie)"),
                        QuestionOption("c", "The proletariat collectively"),
                        QuestionOption("d", "Religious institutions")
                    ),
                    correctOptionId = "b",
                    explanation = "The means of production in the capitalist system are owned by a small group of wealthy individuals known as capitalists or bourgeoisie."
                ),
                Question(
                    id = 10034,
                    questionNumber = 34,
                    totalQuestions = 100,
                    text = "What replaced wind and water power following the Industrial Revolution?",
                    options = listOf(
                        QuestionOption("a", "Solar and wind turbines"),
                        QuestionOption("b", "Coal and steam"),
                        QuestionOption("c", "Nuclear energy"),
                        QuestionOption("d", "Animal power")
                    ),
                    correctOptionId = "b",
                    explanation = "New sources of energy and power, particularly coal and steam, replaced wind and water powers."
                ),
                Question(
                    id = 10035,
                    questionNumber = 35,
                    totalQuestions = 100,
                    text = "According to the unit, riches from the slave trade brought tremendous wealth to which British port town?",
                    options = listOf(
                        QuestionOption("a", "London"),
                        QuestionOption("b", "Liverpool"),
                        QuestionOption("c", "Bristol"),
                        QuestionOption("d", "Glasgow")
                    ),
                    correctOptionId = "b",
                    explanation = "The slave trade delivered tremendous riches to British port towns such as Liverpool."
                ),
                Question(
                    id = 10036,
                    questionNumber = 36,
                    totalQuestions = 100,
                    text = "Which countries drew up the Treaty of Vienna in 1815?",
                    options = listOf(
                        QuestionOption("a", "Britain, Russia, Prussia and Austria"),
                        QuestionOption("b", "France, Spain, Italy and Germany"),
                        QuestionOption("c", "Britain, France, Italy and the Ottoman Empire"),
                        QuestionOption("d", "Russia, Germany, Spain and Austria")
                    ),
                    correctOptionId = "a",
                    explanation = "Britain, Russia, Prussia and Austria drew the Treaty of Vienna in 1815 to restore the monarchies."
                ),
                Question(
                    id = 10037,
                    questionNumber = 37,
                    totalQuestions = 100,
                    text = "Which movement helped bring about national self-consciousness through the development of national language and literature?",
                    options = listOf(
                        QuestionOption("a", "The Protestant Revolution"),
                        QuestionOption("b", "The Renaissance"),
                        QuestionOption("c", "The Industrial Revolution"),
                        QuestionOption("d", "The Congress of Vienna")
                    ),
                    correctOptionId = "b",
                    explanation = "The Renaissance, with developments of national language and literature, helped bring about national self-consciousness."
                ),
                Question(
                    id = 10038,
                    questionNumber = 38,
                    totalQuestions = 100,
                    text = "Which of the following was NOT one of the three obstacles to Italian unity in 1815?",
                    options = listOf(
                        QuestionOption("a", "Austrian occupation of Lombardy and Venice"),
                        QuestionOption("b", "The Papal States"),
                        QuestionOption("c", "The existence of several independent states"),
                        QuestionOption("d", "French colonization of Sicily")
                    ),
                    correctOptionId = "d",
                    explanation = "The three obstacles were Austrian occupation, the Papal States, and several independent states — not French colonization of Sicily."
                ),
                Question(
                    id = 10039,
                    questionNumber = 39,
                    totalQuestions = 100,
                    text = "Who founded the 'Young Italy' movement in 1831?",
                    options = listOf(
                        QuestionOption("a", "Camillo di Cavour"),
                        QuestionOption("b", "Giuseppe Garibaldi"),
                        QuestionOption("c", "Giuseppe Mazzini"),
                        QuestionOption("d", "Victor Emmanuel II")
                    ),
                    correctOptionId = "c",
                    explanation = "In 1831, Mazzini founded a movement called 'Young Italy' which attracted tens of thousands of Italians."
                ),
                Question(
                    id = 10040,
                    questionNumber = 40,
                    totalQuestions = 100,
                    text = "Mazzini was a member of which secret society formed to abolish foreign rule in Italy?",
                    options = listOf(
                        QuestionOption("a", "The Carbonari"),
                        QuestionOption("b", "The Red Shirts"),
                        QuestionOption("c", "The Zollverein"),
                        QuestionOption("d", "The Junkers")
                    ),
                    correctOptionId = "a",
                    explanation = "Mazzini was a member of the Carbonari, a secret society of Italian unification formed to abolish foreign rule in Italy."
                ),
                Question(
                    id = 10041,
                    questionNumber = 41,
                    totalQuestions = 100,
                    text = "What kind of government did Mazzini want for a united Italy?",
                    options = listOf(
                        QuestionOption("a", "An absolute monarchy"),
                        QuestionOption("b", "A liberal democratic republic"),
                        QuestionOption("c", "A military dictatorship"),
                        QuestionOption("d", "A theocracy under the Pope")
                    ),
                    correctOptionId = "b",
                    explanation = "Mazzini wanted a liberal democratic republic to govern a united Italy."
                ),
                Question(
                    id = 10042,
                    questionNumber = 42,
                    totalQuestions = 100,
                    text = "In 1852, Cavour became prime minister of which state?",
                    options = listOf(
                        QuestionOption("a", "The Kingdom of the Two Sicilies"),
                        QuestionOption("b", "The Papal States"),
                        QuestionOption("c", "The Kingdom of Sardinia"),
                        QuestionOption("d", "The Duchy of Tuscany")
                    ),
                    correctOptionId = "c",
                    explanation = "In 1852, Cavour became prime minister of the independent Kingdom of Sardinia."
                ),
                Question(
                    id = 10043,
                    questionNumber = 43,
                    totalQuestions = 100,
                    text = "In the 1858 secret agreement, Napoleon III agreed to help Sardinia against which power?",
                    options = listOf(
                        QuestionOption("a", "Prussia"),
                        QuestionOption("b", "Austria"),
                        QuestionOption("c", "France's own colonies"),
                        QuestionOption("d", "The Ottoman Empire")
                    ),
                    correctOptionId = "b",
                    explanation = "Napoleon agreed to send troops to drive the Austrians out of Lombardy and Venetia if Austria declared war on Sardinia."
                ),
                Question(
                    id = 10044,
                    questionNumber = 44,
                    totalQuestions = 100,
                    text = "What did Cavour promise to give France in return for its military help?",
                    options = listOf(
                        QuestionOption("a", "Sicily and Sardinia"),
                        QuestionOption("b", "Nice and Savoy"),
                        QuestionOption("c", "Lombardy and Venetia"),
                        QuestionOption("d", "Rome and Naples")
                    ),
                    correctOptionId = "b",
                    explanation = "Cavour promised to give the regions of Nice and Savoy to France for its help."
                ),
                Question(
                    id = 10045,
                    questionNumber = 45,
                    totalQuestions = 100,
                    text = "Giuseppe Garibaldi and his Red Shirts first captured which island?",
                    options = listOf(
                        QuestionOption("a", "Sardinia"),
                        QuestionOption("b", "Corsica"),
                        QuestionOption("c", "Sicily"),
                        QuestionOption("d", "Malta")
                    ),
                    correctOptionId = "c",
                    explanation = "Garibaldi and the Red Shirts captured the island of Sicily and then crossed into the Italian mainland."
                ),
                Question(
                    id = 10046,
                    questionNumber = 46,
                    totalQuestions = 100,
                    text = "Who became king when the Kingdom of Italy was established in 1861?",
                    options = listOf(
                        QuestionOption("a", "Napoleon III"),
                        QuestionOption("b", "Victor Emmanuel II"),
                        QuestionOption("c", "Otto von Bismarck"),
                        QuestionOption("d", "Wilhelm I")
                    ),
                    correctOptionId = "b",
                    explanation = "In 1861, the kingdom of Italy was established, and King Victor Emmanuel II became its king."
                ),
                Question(
                    id = 10047,
                    questionNumber = 47,
                    totalQuestions = 100,
                    text = "Italian unification was finalized in 1870 when Italy annexed which city?",
                    options = listOf(
                        QuestionOption("a", "Venice"),
                        QuestionOption("b", "Naples"),
                        QuestionOption("c", "Rome"),
                        QuestionOption("d", "Florence")
                    ),
                    correctOptionId = "c",
                    explanation = "When French armies withdrew from Italy in 1870, Italians entered Rome, finalizing Italian unification."
                ),
                Question(
                    id = 10048,
                    questionNumber = 48,
                    totalQuestions = 100,
                    text = "After Rome joined Italy, over what remaining territory did the Pope continue to govern?",
                    options = listOf(
                        QuestionOption("a", "Sicily"),
                        QuestionOption("b", "Vatican City"),
                        QuestionOption("c", "Naples"),
                        QuestionOption("d", "Tuscany")
                    ),
                    correctOptionId = "b",
                    explanation = "The Pope continued to govern a section of Rome known as Vatican City."
                ),
                Question(
                    id = 10049,
                    questionNumber = 49,
                    totalQuestions = 100,
                    text = "Which of the following was a problem Italy faced after political unification?",
                    options = listOf(
                        QuestionOption("a", "Total religious harmony with the Church"),
                        QuestionOption("b", "Tension between the industrialized North and agrarian South"),
                        QuestionOption("c", "Absence of any secret societies"),
                        QuestionOption("d", "Immediate political stability")
                    ),
                    correctOptionId = "b",
                    explanation = "One listed problem was the tension between the industrialized North and the agrarian South."
                ),
                Question(
                    id = 10050,
                    questionNumber = 50,
                    totalQuestions = 100,
                    text = "Which secret society formed in Italy became a 'state within a state' that the central government could not control?",
                    options = listOf(
                        QuestionOption("a", "The Carbonari"),
                        QuestionOption("b", "Young Italy"),
                        QuestionOption("c", "The Mafia"),
                        QuestionOption("d", "The Red Shirts")
                    ),
                    correctOptionId = "c",
                    explanation = "The formation of the Mafia, a kind of state within a state, was a problem the central government was powerless to control."
                ),
                Question(
                    id = 10051,
                    questionNumber = 51,
                    totalQuestions = 100,
                    text = "The German Confederation created by the Congress of Vienna in 1815 consisted of how many separate autonomous states?",
                    options = listOf(
                        QuestionOption("a", "25"),
                        QuestionOption("b", "39"),
                        QuestionOption("c", "50"),
                        QuestionOption("d", "12")
                    ),
                    correctOptionId = "b",
                    explanation = "The 1815 Congress of Vienna created the German Confederation, which consisted of 39 separate autonomous states."
                ),
                Question(
                    id = 10052,
                    questionNumber = 52,
                    totalQuestions = 100,
                    text = "Which German state took the lead in unifying the German Confederation?",
                    options = listOf(
                        QuestionOption("a", "Bavaria"),
                        QuestionOption("b", "Austria"),
                        QuestionOption("c", "Prussia"),
                        QuestionOption("d", "Saxony")
                    ),
                    correctOptionId = "c",
                    explanation = "While Austria usually dominated the German Confederation, Prussia took the lead in unifying the states into Germany."
                ),
                Question(
                    id = 10053,
                    questionNumber = 53,
                    totalQuestions = 100,
                    text = "Which of the following groups opposed German unification before 1870, according to the text?",
                    options = listOf(
                        QuestionOption("a", "Prussian Junkers"),
                        QuestionOption("b", "Small German states fearing Prussian domination"),
                        QuestionOption("c", "German railway builders"),
                        QuestionOption("d", "Zollverein merchants")
                    ),
                    correctOptionId = "b",
                    explanation = "Small German states that feared Prussian domination were among the forces opposed to German unification."
                ),
                Question(
                    id = 10054,
                    questionNumber = 54,
                    totalQuestions = 100,
                    text = "The Zollverein, created in 1834, was best described as:",
                    options = listOf(
                        QuestionOption("a", "A military pact between Prussia and Austria"),
                        QuestionOption("b", "An economic customs union between German states"),
                        QuestionOption("c", "A religious alliance of Catholic states"),
                        QuestionOption("d", "A treaty ending the Franco-Prussian War")
                    ),
                    correctOptionId = "b",
                    explanation = "The Zollverein was an economic alliance (customs union) between German states that promoted trade and removed tariffs."
                ),
                Question(
                    id = 10055,
                    questionNumber = 55,
                    totalQuestions = 100,
                    text = "Otto von Bismarck belonged to which social class?",
                    options = listOf(
                        QuestionOption("a", "The bourgeoisie"),
                        QuestionOption("b", "The proletariat"),
                        QuestionOption("c", "The Junker (landed nobility)"),
                        QuestionOption("d", "The clergy")
                    ),
                    correctOptionId = "c",
                    explanation = "Bismarck came from the Junker class, or the landed nobility, in Prussia."
                ),
                Question(
                    id = 10056,
                    questionNumber = 56,
                    totalQuestions = 100,
                    text = "In 1862, who appointed Bismarck as Prussian prime minister?",
                    options = listOf(
                        QuestionOption("a", "Napoleon III"),
                        QuestionOption("b", "King Wilhelm I"),
                        QuestionOption("c", "Franz Joseph"),
                        QuestionOption("d", "Victor Emmanuel II")
                    ),
                    correctOptionId = "b",
                    explanation = "In 1862, the new Prussian king, Wilhelm I, chose Bismarck as prime minister."
                ),
                Question(
                    id = 10057,
                    questionNumber = 57,
                    totalQuestions = 100,
                    text = "Bismarck's political philosophy of pursuing goals by any means necessary was known as:",
                    options = listOf(
                        QuestionOption("a", "Nationalism"),
                        QuestionOption("b", "Realpolitik"),
                        QuestionOption("c", "Zollverein"),
                        QuestionOption("d", "Liberalism")
                    ),
                    correctOptionId = "b",
                    explanation = "Realpolitik is defined in the text as pursuing goals by any means necessary — go to war, lie, break treaties."
                ),
                Question(
                    id = 10058,
                    questionNumber = 58,
                    totalQuestions = 100,
                    text = "Which three wars did Bismarck use to achieve German unification, in order?",
                    options = listOf(
                        QuestionOption("a", "Franco-Prussian, Danish, Austro-Prussian"),
                        QuestionOption("b", "Danish War, Seven Weeks War, Franco-Prussian War"),
                        QuestionOption("c", "Seven Weeks War, Franco-Prussian War, Danish War"),
                        QuestionOption("d", "Crimean War, Danish War, Franco-Prussian War")
                    ),
                    correctOptionId = "b",
                    explanation = "Bismarck led German unification through the Danish War (1864), the Seven Weeks War (1866), and the Franco-Prussian War (1870/71)."
                ),
                Question(
                    id = 10059,
                    questionNumber = 59,
                    totalQuestions = 100,
                    text = "As a result of the 1864 Danish War, which territory was given to Prussia?",
                    options = listOf(
                        QuestionOption("a", "Holstein"),
                        QuestionOption("b", "Schleswig"),
                        QuestionOption("c", "Alsace"),
                        QuestionOption("d", "Venetia")
                    ),
                    correctOptionId = "b",
                    explanation = "As a result of the Danish War, Schleswig was given to Prussia, while Austria kept Holstein."
                ),
                Question(
                    id = 10060,
                    questionNumber = 60,
                    totalQuestions = 100,
                    text = "At which battle did Prussia decisively defeat Austria in 1866?",
                    options = listOf(
                        QuestionOption("a", "Battle of Sedan"),
                        QuestionOption("b", "Battle of Königgrätz (Sadowa)"),
                        QuestionOption("c", "Battle of Waterloo"),
                        QuestionOption("d", "Battle of Solferino")
                    ),
                    correctOptionId = "b",
                    explanation = "At the Battle of Königgrätz (or Sadowa) on 3 July 1866, the Prussian army quickly defeated the Austrian forces."
                ),
                Question(
                    id = 10061,
                    questionNumber = 61,
                    totalQuestions = 100,
                    text = "Which of the following was NOT a result of the Seven Weeks War (1866)?",
                    options = listOf(
                        QuestionOption("a", "Holstein was annexed by Prussia"),
                        QuestionOption("b", "Austria was excluded from German affairs"),
                        QuestionOption("c", "Venetia was given to Italy"),
                        QuestionOption("d", "France annexed Alsace and Lorraine")
                    ),
                    correctOptionId = "d",
                    explanation = "Alsace and Lorraine were ceded by France after the later Franco-Prussian War, not a result of the Seven Weeks War."
                ),
                Question(
                    id = 10062,
                    questionNumber = 62,
                    totalQuestions = 100,
                    text = "What was formed under Prussian leadership after the Seven Weeks War, consisting of German states except those in the south?",
                    options = listOf(
                        QuestionOption("a", "The German Empire"),
                        QuestionOption("b", "The North German Confederation"),
                        QuestionOption("c", "The Zollverein"),
                        QuestionOption("d", "The Weimar Republic")
                    ),
                    correctOptionId = "b",
                    explanation = "The North German Confederation was formed under the leadership of Prussia after the Seven Weeks War."
                ),
                Question(
                    id = 10063,
                    questionNumber = 63,
                    totalQuestions = 100,
                    text = "The Ems Telegram, published by Bismarck, was significant because it:",
                    options = listOf(
                        QuestionOption("a", "Ended the Franco-Prussian War"),
                        QuestionOption("b", "Encouraged France to declare war on Prussia in 1870"),
                        QuestionOption("c", "United the Italian states"),
                        QuestionOption("d", "Freed enslaved people in the American South")
                    ),
                    correctOptionId = "b",
                    explanation = "The Ems Telegram encouraged France to declare war on Prussia in 1870 by inflaming popular sentiment on both sides."
                ),
                Question(
                    id = 10064,
                    questionNumber = 64,
                    totalQuestions = 100,
                    text = "At which battle were French forces defeated in September 1870, ending the French Second Empire?",
                    options = listOf(
                        QuestionOption("a", "Battle of Königgrätz"),
                        QuestionOption("b", "Battle of Sedan"),
                        QuestionOption("c", "Battle of Waterloo"),
                        QuestionOption("d", "Battle of Gettysburg")
                    ),
                    correctOptionId = "b",
                    explanation = "On September 2, 1870, French forces were defeated at the battle of Sedan, ending the French Second Empire."
                ),
                Question(
                    id = 10065,
                    questionNumber = 65,
                    totalQuestions = 100,
                    text = "Under the Treaty of Frankfurt (1871), France agreed to:",
                    options = listOf(
                        QuestionOption("a", "Annex Prussian territory"),
                        QuestionOption("b", "Cede Alsace and Lorraine and pay war indemnities"),
                        QuestionOption("c", "Form an alliance with Prussia"),
                        QuestionOption("d", "Grant independence to Bavaria")
                    ),
                    correctOptionId = "b",
                    explanation = "In the Treaty of Frankfurt, France agreed to cede Alsace and Lorraine and to pay huge war indemnities to Germany."
                ),
                Question(
                    id = 10066,
                    questionNumber = 66,
                    totalQuestions = 100,
                    text = "Who became German Emperor (Kaiser) when the German Empire was proclaimed at Versailles in 1871?",
                    options = listOf(
                        QuestionOption("a", "Otto von Bismarck"),
                        QuestionOption("b", "King William of Prussia"),
                        QuestionOption("c", "Napoleon III"),
                        QuestionOption("d", "Franz Joseph")
                    ),
                    correctOptionId = "b",
                    explanation = "In 1871, the German Empire was proclaimed at Versailles, with King William of Prussia as German Emperor (Kaiser)."
                ),
                Question(
                    id = 10067,
                    questionNumber = 67,
                    totalQuestions = 100,
                    text = "The American Civil War was fought between the Union and which group of states?",
                    options = listOf(
                        QuestionOption("a", "The Loyalists"),
                        QuestionOption("b", "The Confederate States of America"),
                        QuestionOption("c", "The Provincial States"),
                        QuestionOption("d", "The Territorial States")
                    ),
                    correctOptionId = "b",
                    explanation = "The American Civil War was fought between the Union and the Confederate States of America."
                ),
                Question(
                    id = 10068,
                    questionNumber = 68,
                    totalQuestions = 100,
                    text = "What did the seceding southern states primarily want, according to the text?",
                    options = listOf(
                        QuestionOption("a", "To take over the U.S. federal government"),
                        QuestionOption("b", "To declare themselves independent"),
                        QuestionOption("c", "To abolish slavery immediately"),
                        QuestionOption("d", "To form an alliance with Britain")
                    ),
                    correctOptionId = "b",
                    explanation = "The seceding southern states did not aim to take over the government; they wanted to declare themselves independent."
                ),
                Question(
                    id = 10069,
                    questionNumber = 69,
                    totalQuestions = 100,
                    text = "The northern American economy in the mid-19th century was based mainly on:",
                    options = listOf(
                        QuestionOption("a", "Cotton plantations"),
                        QuestionOption("b", "Industry, with factory wage labor"),
                        QuestionOption("c", "Slave-based agriculture"),
                        QuestionOption("d", "Fur trading")
                    ),
                    correctOptionId = "b",
                    explanation = "The northern economy was based more on industry, hiring factory workers at low wages, reducing reliance on enslaved labor."
                ),
                Question(
                    id = 10070,
                    questionNumber = 70,
                    totalQuestions = 100,
                    text = "Which two abolitionist leaders are named in the unit?",
                    options = listOf(
                        QuestionOption("a", "Abraham Lincoln and Jefferson Davis"),
                        QuestionOption("b", "William Lloyd Garrison and Frederick Douglass"),
                        QuestionOption("c", "John Wilkes Booth and Ulysses Grant"),
                        QuestionOption("d", "Otto von Bismarck and Camillo di Cavour")
                    ),
                    correctOptionId = "b",
                    explanation = "Famous leaders of the abolitionist movement named in the text were William Lloyd Garrison and Frederick Douglass."
                ),
                Question(
                    id = 10071,
                    questionNumber = 71,
                    totalQuestions = 100,
                    text = "The Industrial Revolution first started in _______ in the 18th century.",
                    options = emptyList(),
                    correctOptionId = "England",
                    explanation = "The text states the Industrial Revolution first started in England in the 18th century.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10072,
                    questionNumber = 72,
                    totalQuestions = 100,
                    text = "The _______ system was created to replace the domestic system of production.",
                    options = emptyList(),
                    correctOptionId = "Factory",
                    explanation = "The Factory system replaced the domestic system in which workers used hand tools at home.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10073,
                    questionNumber = 73,
                    totalQuestions = 100,
                    text = "Industrialization promoted the growth of the proletariat and the _______ as new social classes.",
                    options = emptyList(),
                    correctOptionId = "bourgeoisie",
                    explanation = "Industrialization promoted new socio-economic classes, especially the proletariat and the bourgeoisie.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10074,
                    questionNumber = 74,
                    totalQuestions = 100,
                    text = "A(n) _______ economy is one in which the government controls production, distribution and prices.",
                    options = emptyList(),
                    correctOptionId = "command",
                    explanation = "The text defines a command economy as one where the government controls production, distribution and prices.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10075,
                    questionNumber = 75,
                    totalQuestions = 100,
                    text = "The _______ was signed in 1815 by Britain, Russia, Prussia and Austria to restore Europe's monarchies.",
                    options = emptyList(),
                    correctOptionId = "Treaty of Vienna",
                    explanation = "Britain, Russia, Prussia and Austria drew the Treaty of Vienna in 1815 to restore the monarchies.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10076,
                    questionNumber = 76,
                    totalQuestions = 100,
                    text = "The Papal States straddled the centre of the Italian peninsula, cutting the north off from the _______.",
                    options = emptyList(),
                    correctOptionId = "south",
                    explanation = "The Papal States cut the north of the Italian peninsula off from the south.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10077,
                    questionNumber = 77,
                    totalQuestions = 100,
                    text = "Giuseppe Mazzini founded the movement called '_______' in 1831.",
                    options = emptyList(),
                    correctOptionId = "Young Italy",
                    explanation = "In 1831, Mazzini founded a movement called 'Young Italy'.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10078,
                    questionNumber = 78,
                    totalQuestions = 100,
                    text = "_______ became prime minister of the Kingdom of Sardinia in 1852.",
                    options = emptyList(),
                    correctOptionId = "Cavour",
                    explanation = "In 1852, Cavour became prime minister of the independent Kingdom of Sardinia.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10079,
                    questionNumber = 79,
                    totalQuestions = 100,
                    text = "Giuseppe Garibaldi led an army known as the _______.",
                    options = emptyList(),
                    correctOptionId = "Red Shirts",
                    explanation = "Garibaldi led the Red Shirts, an army that wore bright red shirts into battle.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10080,
                    questionNumber = 80,
                    totalQuestions = 100,
                    text = "The Kingdom of Italy was established in the year _______.",
                    options = emptyList(),
                    correctOptionId = "1861",
                    explanation = "In 1861, the kingdom of Italy was established with Victor Emmanuel II as king.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10081,
                    questionNumber = 81,
                    totalQuestions = 100,
                    text = "Italy gained Venetia in 1866 following the _______ War.",
                    options = emptyList(),
                    correctOptionId = "Seven Weeks",
                    explanation = "Following the defeat of Austria in the Seven Weeks War, Italy got Venetia in 1866.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10082,
                    questionNumber = 82,
                    totalQuestions = 100,
                    text = "Italian unification was completed in 1870 when Italians entered and annexed the city of _______.",
                    options = emptyList(),
                    correctOptionId = "Rome",
                    explanation = "In 1870, the Italians entered Rome, finalizing the unification of Italy.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10083,
                    questionNumber = 83,
                    totalQuestions = 100,
                    text = "After unification, the Pope continued to govern a section of Rome known as _______.",
                    options = emptyList(),
                    correctOptionId = "Vatican City",
                    explanation = "The Pope continued to govern a section of Rome known as Vatican City.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10084,
                    questionNumber = 84,
                    totalQuestions = 100,
                    text = "A secret society known as the _______ formed in Italy and became a state within a state.",
                    options = emptyList(),
                    correctOptionId = "Mafia",
                    explanation = "The formation of the Mafia, a kind of state within a state, was a post-unification problem.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10085,
                    questionNumber = 85,
                    totalQuestions = 100,
                    text = "The Congress of Vienna in 1815 created the German Confederation, consisting of _______ separate autonomous states.",
                    options = emptyList(),
                    correctOptionId = "39",
                    explanation = "The 1815 Congress of Vienna created the German Confederation of 39 separate autonomous states.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10086,
                    questionNumber = 86,
                    totalQuestions = 100,
                    text = "The _______, created in 1834, was an economic alliance between German states that removed trade tariffs.",
                    options = emptyList(),
                    correctOptionId = "Zollverein",
                    explanation = "The Zollverein was an economic alliance between German states created in 1834 that promoted trade.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10087,
                    questionNumber = 87,
                    totalQuestions = 100,
                    text = "Otto von Bismarck came from the _______ class, the landed nobility of Prussia.",
                    options = emptyList(),
                    correctOptionId = "Junker",
                    explanation = "Bismarck came from the Junker class, or the landed nobility, in Prussia.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10088,
                    questionNumber = 88,
                    totalQuestions = 100,
                    text = "In 1862, King Wilhelm I chose Bismarck as Prussian _______.",
                    options = emptyList(),
                    correctOptionId = "prime minister",
                    explanation = "In 1862, the new Prussian king, Wilhelm I, chose Bismarck as prime minister.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10089,
                    questionNumber = 89,
                    totalQuestions = 100,
                    text = "Bismarck's policy of using military power to achieve German unification was called '_______ and Iron'.",
                    options = emptyList(),
                    correctOptionId = "Blood",
                    explanation = "The 'Blood and Iron' policy referred to using military power to achieve unification of Germany.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10090,
                    questionNumber = 90,
                    totalQuestions = 100,
                    text = "As a result of the 1864 Danish War, _______ was given to Prussia.",
                    options = emptyList(),
                    correctOptionId = "Schleswig",
                    explanation = "As a result of the Danish War, Schleswig was given to Prussia while Austria kept Holstein.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10091,
                    questionNumber = 91,
                    totalQuestions = 100,
                    text = "The Prussian army defeated Austria at the Battle of Königgrätz, also known as the Battle of _______.",
                    options = emptyList(),
                    correctOptionId = "Sadowa",
                    explanation = "The Battle of Königgrätz is also called the Battle of Sadowa.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10092,
                    questionNumber = 92,
                    totalQuestions = 100,
                    text = "After the Seven Weeks War, the _______ German Confederation was formed under Prussian leadership.",
                    options = emptyList(),
                    correctOptionId = "North",
                    explanation = "The North German Confederation was formed under Prussian leadership after the Seven Weeks War.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10093,
                    questionNumber = 93,
                    totalQuestions = 100,
                    text = "Bismarck published the _______ Telegram to provoke France into declaring war on Prussia.",
                    options = emptyList(),
                    correctOptionId = "Ems",
                    explanation = "Bismarck published the edited Ems Telegram to provoke France to declare war on Prussia in 1870.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10094,
                    questionNumber = 94,
                    totalQuestions = 100,
                    text = "French forces were defeated at the Battle of _______ in September 1870, ending the French Second Empire.",
                    options = emptyList(),
                    correctOptionId = "Sedan",
                    explanation = "On September 2, 1870, French forces were defeated at the battle of Sedan.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10095,
                    questionNumber = 95,
                    totalQuestions = 100,
                    text = "Under the Treaty of Frankfurt, France ceded the provinces of Alsace and _______ to Germany.",
                    options = emptyList(),
                    correctOptionId = "Lorraine",
                    explanation = "France agreed to cede the provinces of Alsace and Lorraine to Germany under the Treaty of Frankfurt.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10096,
                    questionNumber = 96,
                    totalQuestions = 100,
                    text = "The German Empire was proclaimed in 1871 at the Palace of _______.",
                    options = emptyList(),
                    correctOptionId = "Versailles",
                    explanation = "In 1871, the German Empire was proclaimed at the Palace of Versailles.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10097,
                    questionNumber = 97,
                    totalQuestions = 100,
                    text = "Eleven southern U.S. states formed the Confederacy led by _______.",
                    options = emptyList(),
                    correctOptionId = "Jefferson Davis",
                    explanation = "Eleven southern states formed the Confederacy led by Jefferson Davis.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10098,
                    questionNumber = 98,
                    totalQuestions = 100,
                    text = "Abraham Lincoln issued the _______ Proclamation in January 1863, freeing slaves in rebelling states.",
                    options = emptyList(),
                    correctOptionId = "Emancipation",
                    explanation = "In January 1863, Lincoln issued the Emancipation Proclamation, freeing slaves in rebelling parts of the country.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10099,
                    questionNumber = 99,
                    totalQuestions = 100,
                    text = "President Lincoln was assassinated by _______ on April 14, 1865.",
                    options = emptyList(),
                    correctOptionId = "John Wilkes Booth",
                    explanation = "President Lincoln was assassinated by John Wilkes Booth, a Confederate sympathizer.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10100,
                    questionNumber = 100,
                    totalQuestions = 100,
                    text = "The _______ Amendment, adopted on December 6, 1865, officially outlawed slavery in the United States.",
                    options = emptyList(),
                    correctOptionId = "Thirteenth",
                    explanation = "On December 6, 1865, the Thirteenth Amendment was adopted, officially outlawing slavery.",
                    type = QuestionType.FILL_IN_THE_BLANK
                )
            )
        ),
        "hist_u2" to Quiz(
            id = "quiz_history_u2_full",
            title = "Africa & the Colonial Experience 1880s–1960s Quiz",
            subject = "History",
            durationMinutes = 45,
            gradeLevel = "Grade 10",
            iconName = "pillar",
            unitId = "hist_u2",
            subjectId = "history",
            questions = listOf(
                Question(
                    id = 10101,
                    questionNumber = 1,
                    totalQuestions = 100,
                    text = "Colonialism is defined as the direct and total dominance of one country by another based on possession of state authority by a foreign power.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The unit defines colonialism as the direct and total dominance of one country by another based on possession of state authority by a foreign power."
                ),
                Question(
                    id = 10102,
                    questionNumber = 2,
                    totalQuestions = 100,
                    text = "The concept of colonialism is closely tied to imperialism.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The text states colonialism is inextricably tied to imperialism, the policy of using power to rule another people."
                ),
                Question(
                    id = 10103,
                    questionNumber = 3,
                    totalQuestions = 100,
                    text = "Colonialism only began in the 19th century and had no earlier history.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "Colonialism has been practised since ancient times by the Greeks, Romans, Ottomans, and others."
                ),
                Question(
                    id = 10104,
                    questionNumber = 4,
                    totalQuestions = 100,
                    text = "'Legitimate trade' refers to the commodity trade between Africans and European merchants after the slave trade was abolished.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The text defines legitimate commerce as commodity trade between Africans and Europeans after the slave trade's abolition."
                ),
                Question(
                    id = 10105,
                    questionNumber = 5,
                    totalQuestions = 100,
                    text = "European explorers who arrived in Africa after the 1850s were mostly inspired purely by scientific curiosity.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "Explorers who arrived after the 1850s were largely European government agents, unlike earlier ones inspired by scientific inquiry."
                ),
                Question(
                    id = 10106,
                    questionNumber = 6,
                    totalQuestions = 100,
                    text = "European missionaries converted the majority of non-Muslim Africans to Christianity in the late 19th century.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "Missionaries converted less than 1% of non-Muslim Africans (outside Ethiopia) in the last two decades of the 19th century."
                ),
                Question(
                    id = 10107,
                    questionNumber = 7,
                    totalQuestions = 100,
                    text = "Demand for raw materials and new markets was among the economic motives for European colonization of Africa.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The economic motive included demand for raw materials and the need for new market centres."
                ),
                Question(
                    id = 10108,
                    questionNumber = 8,
                    totalQuestions = 100,
                    text = "The 'civilizing mission' implied that Africans were inferior and uncivilized while Europeans were superior and civilized.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The civilizing mission's clear implication was that Africans were inferior and uncivilized and Europeans superior and civilized."
                ),
                Question(
                    id = 10109,
                    questionNumber = 9,
                    totalQuestions = 100,
                    text = "Rudyard Kipling wrote the poem 'The White Man's Burden' in 1899.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The text states the White Man's Burden was a poem written by Rudyard Kipling in 1899."
                ),
                Question(
                    id = 10110,
                    questionNumber = 10,
                    totalQuestions = 100,
                    text = "Before the 1880s, most of Africa (about 90%) was independent and free from foreign rule.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Before the 1880s, only 10% of Africa was ruled by foreign powers; the rest (90%) was independent."
                ),
                Question(
                    id = 10111,
                    questionNumber = 11,
                    totalQuestions = 100,
                    text = "The Berlin Conference was held from 1884 to 1885 in Berlin, Germany.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The Berlin Conference was held from 1884 to 1885 in Berlin, Germany."
                ),
                Question(
                    id = 10112,
                    questionNumber = 12,
                    totalQuestions = 100,
                    text = "African representatives participated in the Berlin Conference.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "The text states Africa was not invited nor involved in the Berlin Conference."
                ),
                Question(
                    id = 10113,
                    questionNumber = 13,
                    totalQuestions = 100,
                    text = "The Berlin Conference confirmed the Congo Free State as the private property of King Leopold II of Belgium.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The Congo Free State was confirmed as the private property of King Leopold II of Belgium at the conference."
                ),
                Question(
                    id = 10114,
                    questionNumber = 14,
                    totalQuestions = 100,
                    text = "The principle of effective occupation required colonial powers to have treaties, fly their flag, and establish administration to claim territory.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Article 35 required colonial powers to possess treaties, fly their flag, and establish administration with police to claim rights."
                ),
                Question(
                    id = 10115,
                    questionNumber = 15,
                    totalQuestions = 100,
                    text = "The Wuchale treaty between Ethiopia and Italy is cited as an example of a fake or trickery treaty.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The text cites the Wuchale treaty as a good example of a fake or trickery treaty used to colonize."
                ),
                Question(
                    id = 10116,
                    questionNumber = 16,
                    totalQuestions = 100,
                    text = "Lack of cooperation and solidarity among Africans helped Europeans succeed in the Scramble for Africa.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The text lists lack of cooperation and solidarity among Africans as a reason Europeans succeeded in partitioning Africa."
                ),
                Question(
                    id = 10117,
                    questionNumber = 17,
                    totalQuestions = 100,
                    text = "The British South Africa Company was controlled by John Cecil Rhodes.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The B.S.A.C. was under the control of John Cecil Rhodes."
                ),
                Question(
                    id = 10118,
                    questionNumber = 18,
                    totalQuestions = 100,
                    text = "Company rule in Africa was practiced from the 1880s to 1924.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The text states company rule was exercised from the 1880s to 1924."
                ),
                Question(
                    id = 10119,
                    questionNumber = 19,
                    totalQuestions = 100,
                    text = "The French colonial policy of direct rule and assimilation was designed by Frederick Lugard.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "The French policy of direct rule and assimilation was designed by Albert Sarrout; Lugard designed British indirect rule."
                ),
                Question(
                    id = 10120,
                    questionNumber = 20,
                    totalQuestions = 100,
                    text = "Under the assimilation policy, an African who received French education stood a chance of becoming French.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "According to the assimilation policy, an African who received French education could become French."
                ),
                Question(
                    id = 10121,
                    questionNumber = 21,
                    totalQuestions = 100,
                    text = "Frederick Lugard was the architect of the British Indirect Rule policy.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The text states the architect of the British Indirect rule policy was Frederick Lugard."
                ),
                Question(
                    id = 10122,
                    questionNumber = 22,
                    totalQuestions = 100,
                    text = "Settler rule involved Europeans displacing indigenous Africans and taking their fertile lands.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "In settler colonies, fertile lands of African peasants were taken and given to minority white settlers."
                ),
                Question(
                    id = 10123,
                    questionNumber = 23,
                    totalQuestions = 100,
                    text = "Ahmadu Seku resisted French rule in West Africa and was eventually exiled to Sokoto, where he died.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Ahmadu Seku's forces were defeated, his empire broke up, and he was exiled to Sokoto where he died."
                ),
                Question(
                    id = 10124,
                    questionNumber = 24,
                    totalQuestions = 100,
                    text = "Samori Ture was finally captured by the French in 1900 and exiled to Gabon.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The French captured Samori in 1900 and exiled him to Gabon in Central Africa."
                ),
                Question(
                    id = 10125,
                    questionNumber = 25,
                    totalQuestions = 100,
                    text = "The Maji Maji Uprising was a highly organized rebellion planned well in advance under central leadership.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "The text states the Maji Maji movement was a spontaneous rising with no previous planning and central leadership."
                ),
                Question(
                    id = 10126,
                    questionNumber = 26,
                    totalQuestions = 100,
                    text = "The Herero and Nama uprisings against German rule in South West Africa were both crushed by the Germans.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Both the Herero (1904) and Nama (1905) uprisings were crushed by the Germans."
                ),
                Question(
                    id = 10127,
                    questionNumber = 27,
                    totalQuestions = 100,
                    text = "Egypt became a British colony after British forces entered Cairo in 1882 and defeated Urabi Pasha's revolt.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "In 1882, British forces entered Cairo, defeated the revolt, and Egypt became a British colony."
                ),
                Question(
                    id = 10128,
                    questionNumber = 28,
                    totalQuestions = 100,
                    text = "Colonialism destroyed African indigenous administrations and created artificial boundaries without local approval.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The political impacts included destruction of indigenous administrations and creation of artificial boundaries without local approval."
                ),
                Question(
                    id = 10129,
                    questionNumber = 29,
                    totalQuestions = 100,
                    text = "Under colonialism, Africans were encouraged and allowed to develop their own manufacturing industries.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "Africans were not allowed nor encouraged to go into manufacturing; Africa remained a supplier of raw materials."
                ),
                Question(
                    id = 10130,
                    questionNumber = 30,
                    totalQuestions = 100,
                    text = "Rinderpest disease introduced by settlers affected livestock of peoples such as the Shona in present-day Zimbabwe.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Rinderpest disease, introduced by settlers, affected the livestock of the Shona people among others."
                ),
                Question(
                    id = 10131,
                    questionNumber = 31,
                    totalQuestions = 100,
                    text = "What is colonialism, as defined in the unit?",
                    options = listOf(
                        QuestionOption("a", "A trade agreement between equal nations"),
                        QuestionOption("b", "The direct and total dominance of one country by another based on possession of state authority"),
                        QuestionOption("c", "A religious movement across Africa"),
                        QuestionOption("d", "An alliance for mutual defense")
                    ),
                    correctOptionId = "a",
                    explanation = "Colonialism is defined as the direct and total dominance of one country by another based on possession of state authority by a foreign power."
                ),
                Question(
                    id = 10132,
                    questionNumber = 32,
                    totalQuestions = 100,
                    text = "The concept of colonialism is inseparably tied to which of the following?",
                    options = listOf(
                        QuestionOption("a", "Communism"),
                        QuestionOption("b", "Socialism"),
                        QuestionOption("c", "Feudalism"),
                        QuestionOption("d", "Imperialism")
                    ),
                    correctOptionId = "d",
                    explanation = "The text states colonialism's notion is inextricably tied to that of imperialism."
                ),
                Question(
                    id = 10133,
                    questionNumber = 33,
                    totalQuestions = 100,
                    text = "What technological advancement facilitated the expansion of colonialism from the 16th century onward?",
                    options = listOf(
                        QuestionOption("a", "Advances in navigational technology"),
                        QuestionOption("b", "The printing press"),
                        QuestionOption("c", "Steam-powered factories"),
                        QuestionOption("d", "The telegraph")
                    ),
                    correctOptionId = "a",
                    explanation = "Colonialism grew in scope since the 16th century owing to advancements in navigational technology."
                ),
                Question(
                    id = 10134,
                    questionNumber = 34,
                    totalQuestions = 100,
                    text = "'Legitimate trade' in the 19th century was a trade in which:",
                    options = listOf(
                        QuestionOption("a", "Goods were exchanged equally among Africans"),
                        QuestionOption("b", "African raw materials were exchanged for European goods"),
                        QuestionOption("c", "The slave trade was expanded"),
                        QuestionOption("d", "Americans traded directly with Europeans")
                    ),
                    correctOptionId = "b",
                    explanation = "Legitimate trade refers to raw products from Africa, particularly cash crops, being exchanged for European goods."
                ),
                Question(
                    id = 10135,
                    questionNumber = 35,
                    totalQuestions = 100,
                    text = "What percentage of non-Muslim Africans (outside Ethiopia) did missionaries convert to Christianity in the last two decades of the 19th century?",
                    options = listOf(
                        QuestionOption("a", "Less than 1%"),
                        QuestionOption("b", "About 25%"),
                        QuestionOption("c", "Over 50%"),
                        QuestionOption("d", "Nearly 100%")
                    ),
                    correctOptionId = "a",
                    explanation = "European missionaries converted only less than 1% of non-Muslim Africans (outside Ethiopia) to Christianity."
                ),
                Question(
                    id = 10136,
                    questionNumber = 36,
                    totalQuestions = 100,
                    text = "Which of the following was NOT listed as a main motive for European colonization of Africa?",
                    options = listOf(
                        QuestionOption("a", "Economic demand for raw materials and markets"),
                        QuestionOption("b", "Political and strategic interest"),
                        QuestionOption("c", "The civilizing mission and religious factors"),
                        QuestionOption("d", "Africa's request for European governance")
                    ),
                    correctOptionId = "d",
                    explanation = "The listed motives were economic, political/strategic, the civilizing mission, and religious factors — not a request from Africa."
                ),
                Question(
                    id = 10137,
                    questionNumber = 37,
                    totalQuestions = 100,
                    text = "Rudyard Kipling's poem 'The White Man's Burden' proposed that:",
                    options = listOf(
                        QuestionOption("a", "Africans should govern themselves immediately"),
                        QuestionOption("b", "White people should rule over non-white people until they adopt western ways"),
                        QuestionOption("c", "Colonization should end immediately"),
                        QuestionOption("d", "Africans and Europeans were equals")
                    ),
                    correctOptionId = "b",
                    explanation = "The poem proposes that white people should rule non-white people until they can fully adopt western ways."
                ),
                Question(
                    id = 10138,
                    questionNumber = 38,
                    totalQuestions = 100,
                    text = "Before the 1880s, approximately what percentage of Africa was under foreign rule?",
                    options = listOf(
                        QuestionOption("a", "10%"),
                        QuestionOption("b", "50%"),
                        QuestionOption("c", "75%"),
                        QuestionOption("d", "90%")
                    ),
                    correctOptionId = "a",
                    explanation = "Before the 1880s, only 10% of Africa was ruled by foreign powers."
                ),
                Question(
                    id = 10139,
                    questionNumber = 39,
                    totalQuestions = 100,
                    text = "The rapid colonial expansion of Europeans in Africa from the 1880s to the early 20th century is known as:",
                    options = listOf(
                        QuestionOption("a", "The Berlin Conference"),
                        QuestionOption("b", "The Scramble for Africa"),
                        QuestionOption("c", "The Civilizing Mission"),
                        QuestionOption("d", "The Legitimate Trade")
                    ),
                    correctOptionId = "b",
                    explanation = "This fierce, rapid colonial expansion is called the Scramble for Africa."
                ),
                Question(
                    id = 10140,
                    questionNumber = 40,
                    totalQuestions = 100,
                    text = "Who led the Berlin Conference of 1884-1885?",
                    options = listOf(
                        QuestionOption("a", "Otto von Bismarck"),
                        QuestionOption("b", "King Leopold II"),
                        QuestionOption("c", "Cecil Rhodes"),
                        QuestionOption("d", "Frederick Lugard")
                    ),
                    correctOptionId = "a",
                    explanation = "The German Chancellor Otto von Bismarck was the leader of the Berlin Conference."
                ),
                Question(
                    id = 10141,
                    questionNumber = 41,
                    totalQuestions = 100,
                    text = "Which of the following countries was NOT among the major players controlling most of colonial Africa at the Berlin Conference?",
                    options = listOf(
                        QuestionOption("a", "France"),
                        QuestionOption("b", "Germany"),
                        QuestionOption("c", "Great Britain"),
                        QuestionOption("d", "Sweden-Norway")
                    ),
                    correctOptionId = "d",
                    explanation = "The major players were France, Germany, Great Britain, and Portugal; Sweden-Norway was represented but not a major player."
                ),
                Question(
                    id = 10142,
                    questionNumber = 42,
                    totalQuestions = 100,
                    text = "King Leopold II of Belgium employed which explorer to explore the Congo River?",
                    options = listOf(
                        QuestionOption("a", "David Livingstone"),
                        QuestionOption("b", "H.M. Stanley"),
                        QuestionOption("c", "Frederick Lugard"),
                        QuestionOption("d", "Cecil Rhodes")
                    ),
                    correctOptionId = "b",
                    explanation = "King Leopold II employed H.M. Stanley to explore the Congo River."
                ),
                Question(
                    id = 10143,
                    questionNumber = 43,
                    totalQuestions = 100,
                    text = "According to Article 35 of the Berlin Conference's General Act, colonial powers could acquire rights over land only if they:",
                    options = listOf(
                        QuestionOption("a", "Paid a fee to the African Union"),
                        QuestionOption("b", "Had treaties, flew their flag, and established administration with police"),
                        QuestionOption("c", "Won a war against local rulers"),
                        QuestionOption("d", "Received permission from the League of Nations")
                    ),
                    correctOptionId = "b",
                    explanation = "The principle of effective occupation required treaties, flying a flag, and establishing administration with a police force."
                ),
                Question(
                    id = 10144,
                    questionNumber = 44,
                    totalQuestions = 100,
                    text = "What was confirmed as the private property of King Leopold II at the Berlin Conference?",
                    options = listOf(
                        QuestionOption("a", "Nigeria"),
                        QuestionOption("b", "The Congo Free State"),
                        QuestionOption("c", "Tanganyika"),
                        QuestionOption("d", "Southern Rhodesia")
                    ),
                    correctOptionId = "b",
                    explanation = "The Congo Free State was confirmed as the private property of King Leopold II of Belgium."
                ),
                Question(
                    id = 10145,
                    questionNumber = 45,
                    totalQuestions = 100,
                    text = "What was the major factor behind European military victory over Africa during the Scramble?",
                    options = listOf(
                        QuestionOption("a", "Superior numbers of soldiers only"),
                        QuestionOption("b", "Military superiority with professional, well-trained armies"),
                        QuestionOption("c", "Alliance with African kingdoms"),
                        QuestionOption("d", "Naval blockades only")
                    ),
                    correctOptionId = "b",
                    explanation = "The major factor was the military superiority Europeans enjoyed, using professional and well-trained armies."
                ),
                Question(
                    id = 10146,
                    questionNumber = 46,
                    totalQuestions = 100,
                    text = "The British South Africa Company (B.S.A.C.) administered which three territories?",
                    options = listOf(
                        QuestionOption("a", "Nigeria, Ghana, and Kenya"),
                        QuestionOption("b", "Nyasaland, Northern Rhodesia, and Southern Rhodesia"),
                        QuestionOption("c", "Congo, Togo, and Cameroon"),
                        QuestionOption("d", "Egypt, Sudan, and Libya")
                    ),
                    correctOptionId = "b",
                    explanation = "The B.S.A.C., under Cecil Rhodes, administered Nyasaland, Northern Rhodesia, and Southern Rhodesia."
                ),
                Question(
                    id = 10147,
                    questionNumber = 47,
                    totalQuestions = 100,
                    text = "Company rule in Africa eventually failed mainly due to:",
                    options = listOf(
                        QuestionOption("a", "Shortage of finance and African/missionary opposition"),
                        QuestionOption("b", "Too much government funding"),
                        QuestionOption("c", "Lack of European interest in Africa"),
                        QuestionOption("d", "Total African cooperation")
                    ),
                    correctOptionId = "a",
                    explanation = "The companies' rule failed due to a shortage of finance and opposition from Africans and missionaries."
                ),
                Question(
                    id = 10148,
                    questionNumber = 48,
                    totalQuestions = 100,
                    text = "Which colonial powers are considered to have used the direct rule and assimilation model?",
                    options = listOf(
                        QuestionOption("a", "The British and Americans"),
                        QuestionOption("b", "The French, Belgians, Germans, and Portuguese"),
                        QuestionOption("c", "Only the Ottomans"),
                        QuestionOption("d", "The Spanish and Dutch")
                    ),
                    correctOptionId = "b",
                    explanation = "The French, Belgians, Germans, and Portuguese are considered to have used the direct rule and assimilation model."
                ),
                Question(
                    id = 10149,
                    questionNumber = 49,
                    totalQuestions = 100,
                    text = "Who designed the French colonial policy of direct rule and assimilation?",
                    options = listOf(
                        QuestionOption("a", "Frederick Lugard"),
                        QuestionOption("b", "Albert Sarrout"),
                        QuestionOption("c", "Cecil Rhodes"),
                        QuestionOption("d", "Otto von Bismarck")
                    ),
                    correctOptionId = "b",
                    explanation = "The French colonial policy of direct rule and assimilation was designed by Albert Sarrout."
                ),
                Question(
                    id = 10150,
                    questionNumber = 50,
                    totalQuestions = 100,
                    text = "Under the French 'association' policy, the relationship between conqueror and conquered emphasized:",
                    options = listOf(
                        QuestionOption("a", "Total identity and merging"),
                        QuestionOption("b", "Cooperation, not identity or merging"),
                        QuestionOption("c", "Military conquest only"),
                        QuestionOption("d", "Complete separation with no contact")
                    ),
                    correctOptionId = "b",
                    explanation = "Association implied the relationship should be one of cooperation, not identity and merging."
                ),
                Question(
                    id = 10151,
                    questionNumber = 51,
                    totalQuestions = 100,
                    text = "Who was the architect of the British Indirect Rule policy?",
                    options = listOf(
                        QuestionOption("a", "Albert Sarrout"),
                        QuestionOption("b", "Frederick Lugard"),
                        QuestionOption("c", "Cecil Rhodes"),
                        QuestionOption("d", "King Leopold II")
                    ),
                    correctOptionId = "b",
                    explanation = "The architect of the British Indirect Rule policy was Frederick Lugard."
                ),
                Question(
                    id = 10152,
                    questionNumber = 52,
                    totalQuestions = 100,
                    text = "Frederick Lugard explained the importance of indirect rule in which book, published in 1922?",
                    options = listOf(
                        QuestionOption("a", "The White Man's Burden"),
                        QuestionOption("b", "The Dual Mandate in British Tropical Africa"),
                        QuestionOption("c", "The Scramble for Africa"),
                        QuestionOption("d", "Heart of Darkness")
                    ),
                    correctOptionId = "b",
                    explanation = "Lugard explained indirect rule's importance in his 1922 book, The Dual Mandate in British Tropical Africa."
                ),
                Question(
                    id = 10153,
                    questionNumber = 53,
                    totalQuestions = 100,
                    text = "According to the text, why did the British prefer indirect rule?",
                    options = listOf(
                        QuestionOption("a", "It was more expensive but more prestigious"),
                        QuestionOption("b", "It was the cheapest, most effective, and reduced African resistance"),
                        QuestionOption("c", "It required no African chiefs at all"),
                        QuestionOption("d", "It was mandated by the League of Nations")
                    ),
                    correctOptionId = "b",
                    explanation = "Indirect rule was preferable because it was the cheapest and most effective way, and reduced African resistance."
                ),
                Question(
                    id = 10154,
                    questionNumber = 54,
                    totalQuestions = 100,
                    text = "Settler colonies, where fertile African lands were taken for white settlers, were found in all EXCEPT which of the following?",
                    options = listOf(
                        QuestionOption("a", "South Africa and Southern/Northern Rhodesia"),
                        QuestionOption("b", "Kenya and Algeria"),
                        QuestionOption("c", "Angola and Mozambique"),
                        QuestionOption("d", "Ethiopia and Liberia")
                    ),
                    correctOptionId = "d",
                    explanation = "Ethiopia and Liberia are not listed among the settler colonies; settler rule was in South Africa, the Rhodesias, Angola, Mozambique, Kenya, Algeria, and South West Africa."
                ),
                Question(
                    id = 10155,
                    questionNumber = 55,
                    totalQuestions = 100,
                    text = "In Kenya, which ethnic group lost ancestral land to European settlers in the 'white highlands' and migrated to cities like Nairobi?",
                    options = listOf(
                        QuestionOption("a", "The Zulu"),
                        QuestionOption("b", "The Kikuyu"),
                        QuestionOption("c", "The Herero"),
                        QuestionOption("d", "The Asante")
                    ),
                    correctOptionId = "b",
                    explanation = "The Kikuyu lost their ancestral territory in the white highlands and migrated in mass to cities like Nairobi."
                ),
                Question(
                    id = 10156,
                    questionNumber = 56,
                    totalQuestions = 100,
                    text = "Which feature was common to all forms of colonial rule, according to the unit?",
                    options = listOf(
                        QuestionOption("a", "Democratic governance"),
                        QuestionOption("b", "Divide and rule policy"),
                        QuestionOption("c", "Full African representation"),
                        QuestionOption("d", "Equal partnership with Africans")
                    ),
                    correctOptionId = "b",
                    explanation = "All forms of colonial rule engaged in 'divide and rule' and were undemocratic and imposed without consent."
                ),
                Question(
                    id = 10157,
                    questionNumber = 57,
                    totalQuestions = 100,
                    text = "Ahmadu Seku was a prominent leader of which empire in West Africa?",
                    options = listOf(
                        QuestionOption("a", "The Mandinka Empire"),
                        QuestionOption("b", "The Tukulor Empire"),
                        QuestionOption("c", "The Asante Kingdom"),
                        QuestionOption("d", "The Ottoman Empire")
                    ),
                    correctOptionId = "b",
                    explanation = "Ahmadu Seku was one of the prominent leaders of the Tukulor Empire in West Africa."
                ),
                Question(
                    id = 10158,
                    questionNumber = 58,
                    totalQuestions = 100,
                    text = "Samori Ture led resistance against the French from 1882 to 1898 while governing an area in present-day:",
                    options = listOf(
                        QuestionOption("a", "Kenya, Uganda, and Tanzania"),
                        QuestionOption("b", "Guinea, Mali, and Cote D'Ivoire"),
                        QuestionOption("c", "Nigeria and Ghana"),
                        QuestionOption("d", "Egypt and Sudan")
                    ),
                    correctOptionId = "b",
                    explanation = "Samori Ture governed an area in what is today Guinea, Mali, and Cote D'Ivoire."
                ),
                Question(
                    id = 10159,
                    questionNumber = 59,
                    totalQuestions = 100,
                    text = "British colonial expansion in Ghana faced opposition from which kingdom, led by Asantehene Prempe?",
                    options = listOf(
                        QuestionOption("a", "The Ashanti/Asante kingdom"),
                        QuestionOption("b", "The Zulu kingdom"),
                        QuestionOption("c", "The Mandinka Empire"),
                        QuestionOption("d", "The Tukulor Empire")
                    ),
                    correctOptionId = "a",
                    explanation = "British expansion in Ghana faced opposition from the Asante kingdom led by Asantehene (King) Prempe."
                ),
                Question(
                    id = 10160,
                    questionNumber = 60,
                    totalQuestions = 100,
                    text = "The Maji Maji Uprising (1905-1907) was directed against which colonial power?",
                    options = listOf(
                        QuestionOption("a", "Britain"),
                        QuestionOption("b", "France"),
                        QuestionOption("c", "Germany"),
                        QuestionOption("d", "Portugal")
                    ),
                    correctOptionId = "c",
                    explanation = "The Maji Maji Uprising in Tanganyika was the most significant African challenge to German colonial rule."
                ),
                Question(
                    id = 10161,
                    questionNumber = 61,
                    totalQuestions = 100,
                    text = "Who led the movement against the Germans in the Maji Maji Uprising, teaching people to sprinkle sacred water believed to turn bullets into water?",
                    options = listOf(
                        QuestionOption("a", "Samuel Maharero"),
                        QuestionOption("b", "Hendrik Witbooi"),
                        QuestionOption("c", "Kinjikitle Ngwale"),
                        QuestionOption("d", "Urabi Pasha")
                    ),
                    correctOptionId = "c",
                    explanation = "A prophet named Kinjikitle Ngwale led the movement, teaching people to use sacred water called Maji Maji."
                ),
                Question(
                    id = 10162,
                    questionNumber = 62,
                    totalQuestions = 100,
                    text = "Who led the Herero rebellion against German rule in South West Africa in 1904?",
                    options = listOf(
                        QuestionOption("a", "Samuel Maharero"),
                        QuestionOption("b", "Hendrik Witbooi"),
                        QuestionOption("c", "Kinjikitle Ngwale"),
                        QuestionOption("d", "Ahmadu Seku")
                    ),
                    correctOptionId = "a",
                    explanation = "In 1904, the Herero people, led by Samuel Maharero, rebelled against German colonial rule."
                ),
                Question(
                    id = 10163,
                    questionNumber = 63,
                    totalQuestions = 100,
                    text = "Who led the Nama rebellion against German colonial rule in 1905?",
                    options = listOf(
                        QuestionOption("a", "Samuel Maharero"),
                        QuestionOption("b", "Hendrik Witbooi"),
                        QuestionOption("c", "Asantehene Prempe"),
                        QuestionOption("d", "Samori Ture")
                    ),
                    correctOptionId = "b",
                    explanation = "In 1905, the Nama people, led by Hendrik Witbooi, rebelled against German colonial rule."
                ),
                Question(
                    id = 10164,
                    questionNumber = 64,
                    totalQuestions = 100,
                    text = "Who led the Egyptian revolt against Anglo-French domination in 1881-1882?",
                    options = listOf(
                        QuestionOption("a", "Khedive Ismael Pasha"),
                        QuestionOption("b", "Colonel Urabi Pasha"),
                        QuestionOption("c", "Kinjikitle Ngwale"),
                        QuestionOption("d", "Samori Ture")
                    ),
                    correctOptionId = "b",
                    explanation = "The 1881 Egyptian revolt against imperialist domination was led by Colonel Urabi Pasha."
                ),
                Question(
                    id = 10165,
                    questionNumber = 65,
                    totalQuestions = 100,
                    text = "What happened to Egypt in 1882 after British forces entered Cairo?",
                    options = listOf(
                        QuestionOption("a", "It gained full independence"),
                        QuestionOption("b", "It became a British colony"),
                        QuestionOption("c", "It was divided between Britain and France equally"),
                        QuestionOption("d", "It became part of the Ottoman Empire again")
                    ),
                    correctOptionId = "b",
                    explanation = "In 1882, British colonial forces entered Cairo, defeated the revolt, and Egypt became a British colony."
                ),
                Question(
                    id = 10166,
                    questionNumber = 66,
                    totalQuestions = 100,
                    text = "What political impact did colonialism have on Africa, according to the unit?",
                    options = listOf(
                        QuestionOption("a", "It strengthened existing African administrations"),
                        QuestionOption("b", "It created artificial boundaries without local approval, causing later conflicts"),
                        QuestionOption("c", "It gave Africans full political representation"),
                        QuestionOption("d", "It unified Africa into one nation")
                    ),
                    correctOptionId = "b",
                    explanation = "Europeans created artificial boundaries without local approval, becoming a colonial legacy causing later boundary conflicts."
                ),
                Question(
                    id = 10167,
                    questionNumber = 67,
                    totalQuestions = 100,
                    text = "What was a key economic impact of colonialism described in the unit?",
                    options = listOf(
                        QuestionOption("a", "Africa became a major manufacturing hub"),
                        QuestionOption("b", "Africa remained a supplier of raw materials while manufacturing was discouraged"),
                        QuestionOption("c", "Africans were given full control of mining"),
                        QuestionOption("d", "African resources were left completely untouched")
                    ),
                    correctOptionId = "b",
                    explanation = "Africa remained a supplier of raw materials for Europe, and Africans were not allowed or encouraged to go into manufacturing."
                ),
                Question(
                    id = 10168,
                    questionNumber = 68,
                    totalQuestions = 100,
                    text = "Which disease, introduced by colonial settlers, affected livestock of peoples like the Shona in present-day Zimbabwe?",
                    options = listOf(
                        QuestionOption("a", "Malaria"),
                        QuestionOption("b", "Rinderpest"),
                        QuestionOption("c", "Smallpox"),
                        QuestionOption("d", "Cholera")
                    ),
                    correctOptionId = "b",
                    explanation = "Rinderpest disease, introduced by settlers, affected the livestock of the Shona people."
                ),
                Question(
                    id = 10169,
                    questionNumber = 69,
                    totalQuestions = 100,
                    text = "Which of the following was cited as a positive outcome of colonialism in the unit?",
                    options = listOf(
                        QuestionOption("a", "End of tribal warfare due to colonial administration and construction of railways/roads"),
                        QuestionOption("b", "Full African self-governance"),
                        QuestionOption("c", "Complete economic equality"),
                        QuestionOption("d", "Elimination of all diseases")
                    ),
                    correctOptionId = "a",
                    explanation = "Positive outcomes included tribal warfare ending under colonial administration and construction of railways and roads."
                ),
                Question(
                    id = 10170,
                    questionNumber = 70,
                    totalQuestions = 100,
                    text = "Which four countries were German colonies in Africa, according to the unit?",
                    options = listOf(
                        QuestionOption("a", "Tanganyika, Togo, Cameroon, and Namibia"),
                        QuestionOption("b", "Nigeria, Ghana, Kenya, and Uganda"),
                        QuestionOption("c", "Congo, Angola, Mozambique, and Zambia"),
                        QuestionOption("d", "Egypt, Sudan, Libya, and Algeria")
                    ),
                    correctOptionId = "a",
                    explanation = "The four German colonies in Africa were Tanganyika, Togo, Cameroon, and Namibia (South-West Africa)."
                ),
                Question(
                    id = 10171,
                    questionNumber = 71,
                    totalQuestions = 100,
                    text = "Colonialism grew in scope since the 16th century, after the Age of _______.",
                    options = emptyList(),
                    correctOptionId = "Discovery",
                    explanation = "Colonialism grew in scope since the 16th century, after the Age of Discovery.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10172,
                    questionNumber = 72,
                    totalQuestions = 100,
                    text = "_______ trade refers to the commodity trade between Africans and Europeans after the slave trade was abolished.",
                    options = emptyList(),
                    correctOptionId = "Legitimate",
                    explanation = "'Legitimate trade' refers to the commodity trade between Africans and European merchants after the slave trade was abolished.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10173,
                    questionNumber = 73,
                    totalQuestions = 100,
                    text = "European missionaries converted less than _______% of non-Muslim Africans (outside Ethiopia) to Christianity.",
                    options = emptyList(),
                    correctOptionId = "1",
                    explanation = "Missionaries converted only less than 1% of non-Muslim Africans (outside Ethiopia) to Christianity.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10174,
                    questionNumber = 74,
                    totalQuestions = 100,
                    text = "The poem 'The White Man's Burden' was written by the English poet _______ in 1899.",
                    options = emptyList(),
                    correctOptionId = "Rudyard Kipling",
                    explanation = "The White Man's Burden was a poem written by English poet Rudyard Kipling in 1899.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10175,
                    questionNumber = 75,
                    totalQuestions = 100,
                    text = "Before the 1880s, only _______% of Africa was ruled by foreign powers.",
                    options = emptyList(),
                    correctOptionId = "10",
                    explanation = "Before the 1880s, only 10% of Africa was ruled by foreign powers.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10176,
                    questionNumber = 76,
                    totalQuestions = 100,
                    text = "The fierce, rapid colonial expansion of Europeans in Africa from the 1880s to the early 1900s is called the _______ for Africa.",
                    options = emptyList(),
                    correctOptionId = "Scramble",
                    explanation = "This rapid colonial expansion is called the Scramble for Africa.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10177,
                    questionNumber = 77,
                    totalQuestions = 100,
                    text = "The Berlin Conference was held from 1884 to _______.",
                    options = emptyList(),
                    correctOptionId = "1885",
                    explanation = "The Berlin Conference was held from 1884 to 1885.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10178,
                    questionNumber = 78,
                    totalQuestions = 100,
                    text = "_______ was the German Chancellor who led the Berlin Conference.",
                    options = emptyList(),
                    correctOptionId = "Otto von Bismarck",
                    explanation = "The German Chancellor Otto von Bismarck was the leader of the Berlin Conference.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10179,
                    questionNumber = 79,
                    totalQuestions = 100,
                    text = "King Leopold II of Belgium employed explorer _______ to explore the Congo River.",
                    options = emptyList(),
                    correctOptionId = "H.M. Stanley",
                    explanation = "King Leopold II employed H.M. Stanley to explore the Congo River.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10180,
                    questionNumber = 80,
                    totalQuestions = 100,
                    text = "The _______ Free State was confirmed as the private property of King Leopold II of Belgium.",
                    options = emptyList(),
                    correctOptionId = "Congo",
                    explanation = "The Congo Free State was confirmed as the private property of King Leopold II of Belgium.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10181,
                    questionNumber = 81,
                    totalQuestions = 100,
                    text = "The _______ treaty signed between Ethiopia and Italy is cited as an example of a fake or trickery treaty.",
                    options = emptyList(),
                    correctOptionId = "Wuchale",
                    explanation = "The Wuchale treaty is cited as an example of a fake or trickery treaty used to colonize.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10182,
                    questionNumber = 82,
                    totalQuestions = 100,
                    text = "The British South Africa Company was under the control of John Cecil _______.",
                    options = emptyList(),
                    correctOptionId = "Rhodes",
                    explanation = "The B.S.A.C. was under the control of John Cecil Rhodes.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10183,
                    questionNumber = 83,
                    totalQuestions = 100,
                    text = "The French colonial policy of direct rule and assimilation was designed by _______.",
                    options = emptyList(),
                    correctOptionId = "Albert Sarrout",
                    explanation = "The French colonial policy of direct rule and assimilation was designed by Albert Sarrout.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10184,
                    questionNumber = 84,
                    totalQuestions = 100,
                    text = "The architect of the British Indirect Rule policy was _______.",
                    options = emptyList(),
                    correctOptionId = "Frederick Lugard",
                    explanation = "The architect of the British Indirect Rule policy was Frederick Lugard.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10185,
                    questionNumber = 85,
                    totalQuestions = 100,
                    text = "Frederick Lugard's 1922 book explaining indirect rule was titled 'The Dual Mandate in British Tropical _______'.",
                    options = emptyList(),
                    correctOptionId = "Africa",
                    explanation = "Lugard's 1922 book was titled 'The Dual Mandate in British Tropical Africa.'",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10186,
                    questionNumber = 86,
                    totalQuestions = 100,
                    text = "In Kenya, the _______ people lost their ancestral land in the white highlands to European settlers.",
                    options = emptyList(),
                    correctOptionId = "Kikuyu",
                    explanation = "The Kikuyu lost their ancestral territory in the so-called white highlands to European settlers.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10187,
                    questionNumber = 87,
                    totalQuestions = 100,
                    text = "Ahmadu Seku was a prominent leader of the _______ Empire in West Africa.",
                    options = emptyList(),
                    correctOptionId = "Tukulor",
                    explanation = "Ahmadu Seku was one of the prominent leaders of the Tukulor Empire in West Africa.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10188,
                    questionNumber = 88,
                    totalQuestions = 100,
                    text = "Samori Ture engaged the French in armed resistance from 1882 to _______, before being captured and exiled to Gabon.",
                    options = emptyList(),
                    correctOptionId = "1898",
                    explanation = "Samori Ture engaged the French in protracted armed resistance from 1882 to 1898.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10189,
                    questionNumber = 89,
                    totalQuestions = 100,
                    text = "British colonial expansion in Ghana faced opposition from the Asante kingdom led by Asantehene _______.",
                    options = emptyList(),
                    correctOptionId = "Prempe",
                    explanation = "British expansion in Ghana faced opposition from the Asante kingdom led by Asantehene (King) Prempe.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10190,
                    questionNumber = 90,
                    totalQuestions = 100,
                    text = "The Maji Maji Uprising was the most significant African challenge to _______ colonial rule in Tanganyika.",
                    options = emptyList(),
                    correctOptionId = "German",
                    explanation = "The Maji Maji Uprising was the most significant African challenge to German colonial rule from 1905 to 1907.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10191,
                    questionNumber = 91,
                    totalQuestions = 100,
                    text = "The prophet _______ led the Maji Maji movement, teaching people to use sacred water believed to repel bullets.",
                    options = emptyList(),
                    correctOptionId = "Kinjikitle Ngwale",
                    explanation = "A prophet named Kinjikitle Ngwale led the movement, teaching use of the sacred Maji Maji water.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10192,
                    questionNumber = 92,
                    totalQuestions = 100,
                    text = "In 1904, the Herero people, led by Samuel _______, rebelled against German colonial rule.",
                    options = emptyList(),
                    correctOptionId = "Maharero",
                    explanation = "In 1904, the Herero people, led by Samuel Maharero, rebelled against German colonial rule.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10193,
                    questionNumber = 93,
                    totalQuestions = 100,
                    text = "In 1905, the Nama people, led by Hendrik _______, rebelled against German colonial rule.",
                    options = emptyList(),
                    correctOptionId = "Witbooi",
                    explanation = "In 1905, the Nama people, led by Hendrik Witbooi, rebelled against German colonial rule.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10194,
                    questionNumber = 94,
                    totalQuestions = 100,
                    text = "The 1881 Egyptian revolt against Anglo-French domination was led by Colonel _______ Pasha.",
                    options = emptyList(),
                    correctOptionId = "Urabi",
                    explanation = "The 1881 Egyptian revolt was led by Colonel Urabi Pasha.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10195,
                    questionNumber = 95,
                    totalQuestions = 100,
                    text = "In 1882, British colonial forces entered Cairo and Egypt became a _______ colony.",
                    options = emptyList(),
                    correctOptionId = "British",
                    explanation = "In 1882, British forces entered Cairo, defeated the revolt, and Egypt became a British colony.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10196,
                    questionNumber = 96,
                    totalQuestions = 100,
                    text = "_______ disease, introduced by settlers, affected livestock of the Shona people and others.",
                    options = emptyList(),
                    correctOptionId = "Rinderpest",
                    explanation = "Rinderpest disease, introduced by settlers, affected the livestock of the Shona people.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10197,
                    questionNumber = 97,
                    totalQuestions = 100,
                    text = "All forms of colonial rule engaged in a policy known as 'divide and _______'.",
                    options = emptyList(),
                    correctOptionId = "rule",
                    explanation = "All forms of colonial rule engaged in 'divide and rule'.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10198,
                    questionNumber = 98,
                    totalQuestions = 100,
                    text = "Company rule in Africa was exercised from the 1880s until the year _______.",
                    options = emptyList(),
                    correctOptionId = "1924",
                    explanation = "Company rule was exercised from the 1880s to 1924.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10199,
                    questionNumber = 99,
                    totalQuestions = 100,
                    text = "The Berlin Conference's General Act contained _______ articles laying international guidelines for colonization.",
                    options = emptyList(),
                    correctOptionId = "38",
                    explanation = "The General Act of the Conference laid international guidelines for colonization in 38 articles.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10200,
                    questionNumber = 100,
                    totalQuestions = 100,
                    text = "Cecil Rhodes served as prime minister of the British Cape Colony from 1890 to _______.",
                    options = emptyList(),
                    correctOptionId = "1896",
                    explanation = "Cecil Rhodes served as prime minister of the British Cape Colony from 1890-1896.",
                    type = QuestionType.FILL_IN_THE_BLANK
                )
            )
        ),
        "hist_u3" to Quiz(
            id = "quiz_history_u3_full",
            title = "Social, Economic and Political Developments in Ethiopia mid-19th c. to 1941 Quiz",
            subject = "History",
            durationMinutes = 45,
            gradeLevel = "Grade 10",
            iconName = "pillar",
            unitId = "hist_u3",
            subjectId = "history",
            questions = listOf(
                Question(
                    id = 10201,
                    questionNumber = 1,
                    totalQuestions = 100,
                    text = "The 19th century long-distance trade routes in Ethiopia started from Bonga, the capital of the Kafa Kingdom.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The unit states the two major trade routes started from Bonga, the capital of the Kafa Kingdom."
                ),
                Question(
                    id = 10202,
                    questionNumber = 2,
                    totalQuestions = 100,
                    text = "Salt bars (amole) served as a medium of exchange alongside Maria Theresa Thalers.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Salt bars (amole) served as a medium of exchange and were used side by side with Maria Theresa Thalers (MTT)."
                ),
                Question(
                    id = 10203,
                    questionNumber = 3,
                    totalQuestions = 100,
                    text = "The Maria Theresa Thaler was a coin introduced from Austria to the Horn of Africa by Arab traders.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "MTT was a coin introduced from Austria to the Horn of African region by Arab traders at the end of the eighteenth century."
                ),
                Question(
                    id = 10204,
                    questionNumber = 4,
                    totalQuestions = 100,
                    text = "Jabarti were southwestern Muslim Oromo merchants while Afqala were northern Muslim merchants.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "It is the reverse: Jabarti were northern Muslim merchants, and Afqala were southwestern Muslim Oromo merchants."
                ),
                Question(
                    id = 10205,
                    questionNumber = 5,
                    totalQuestions = 100,
                    text = "Blacksmiths among Ethiopian cottage industries manufactured items such as ploughshares, swords, and rifle spare parts.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Blacksmiths manufactured ploughshares, knives, swords, bullets, and spare parts for rifles, among other items."
                ),
                Question(
                    id = 10206,
                    questionNumber = 6,
                    totalQuestions = 100,
                    text = "Kassa Hailu of Quara took the throne name Tewodros II.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The first emperor to attempt unification was Kassa Hailu of Quara, who took the throne name Tewodros II."
                ),
                Question(
                    id = 10207,
                    questionNumber = 7,
                    totalQuestions = 100,
                    text = "The Battle of Ayshal symbolized the end of the Zemene Mesafint.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The battle of Ayshal, where the last ruler of the Yejju dynasty was defeated, symbolized the end of Zemene Mesafint."
                ),
                Question(
                    id = 10208,
                    questionNumber = 8,
                    totalQuestions = 100,
                    text = "Tewodros II established an arms manufacturing site at Gafat near Debre Tabor.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Tewodros established an arms manufacture at Gafat near Debre Tabor with European missionaries and artisans."
                ),
                Question(
                    id = 10209,
                    questionNumber = 9,
                    totalQuestions = 100,
                    text = "Tewodros II's famous mortar produced at Gafat was known as 'Sebastopol'.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "About 35 cannons were produced at Gafat, including his famous mortar known as Sebastopol."
                ),
                Question(
                    id = 10210,
                    questionNumber = 10,
                    totalQuestions = 100,
                    text = "Tewodros II died peacefully of natural causes at Maqdala.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "Tewodros committed suicide at Maqdala after the fortress was stormed by the British on April 30, 1868."
                ),
                Question(
                    id = 10211,
                    questionNumber = 11,
                    totalQuestions = 100,
                    text = "Yohannes IV recognized Menilek as Nigus of Shewa through the Liche agreement of 1878.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Yohannes recognized Menilek as Nigus of Shewa in 1878 by the Liche agreement."
                ),
                Question(
                    id = 10212,
                    questionNumber = 12,
                    totalQuestions = 100,
                    text = "The Council of Boru Meda in 1878 declared Tewahdo the only doctrine of the Ethiopian Orthodox Church.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Yohannes IV presided over the Council of Boru Meda (1878), where Tewahdo was declared the only doctrine of the EOTC."
                ),
                Question(
                    id = 10213,
                    questionNumber = 13,
                    totalQuestions = 100,
                    text = "Emperor Yohannes IV died fighting the Mahdists at Metemma in 1889.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "On 9 March 1889, Yohannes marched to Metemma where he died fighting the Mahdists."
                ),
                Question(
                    id = 10214,
                    questionNumber = 14,
                    totalQuestions = 100,
                    text = "Ras Gobana Dache played a key role in Menilek's territorial expansion into Oromo territories.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The Shewan Oromo notable Ras Gobana Dache played a pivotal role in territorial expansion."
                ),
                Question(
                    id = 10215,
                    questionNumber = 15,
                    totalQuestions = 100,
                    text = "The Arsi Oromo resistance was pacified only after six different campaigns from 1882 to 1886.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "It took six different campaigns from 1882 to 1886 to pacify the Arsi Oromo, ending at the battle of Azule."
                ),
                Question(
                    id = 10216,
                    questionNumber = 16,
                    totalQuestions = 100,
                    text = "Kawo Tona was the last king of Kafa.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "Kawo Tona was the last king of Wolaita; Tato Gaki Sherocho was the last king of Kafa."
                ),
                Question(
                    id = 10217,
                    questionNumber = 17,
                    totalQuestions = 100,
                    text = "The Great Famine (Kefu Qan) of 1888-92 was triggered partly by a rinderpest epidemic from Italian cattle imports through Massawa.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The immediate cause of the famine was the rinderpest epidemic triggered by Italian importation of infected cattle through Massawa."
                ),
                Question(
                    id = 10218,
                    questionNumber = 18,
                    totalQuestions = 100,
                    text = "Menilek II founded the Bank of Abyssinia in 1905.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Menilek II founded the first modern bank, the Bank of Abyssinia, in 1905."
                ),
                Question(
                    id = 10219,
                    questionNumber = 19,
                    totalQuestions = 100,
                    text = "General Napier's British expedition to Ethiopia in 1868 aimed to establish a permanent British colony.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "The British showed no interest in remaining in control of the country and left immediately after freeing their captives."
                ),
                Question(
                    id = 10220,
                    questionNumber = 20,
                    totalQuestions = 100,
                    text = "Ethiopian forces defeated the Egyptians at the battles of Gundet (1875) and Gura (1876).",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Emperor Yohannes IV's forces defeated the Egyptians at Gundet (1875) and Gura (1876)."
                ),
                Question(
                    id = 10221,
                    questionNumber = 21,
                    totalQuestions = 100,
                    text = "The Hewett Treaty of 1884 was brokered by the British between Ethiopia and Egypt.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The British brokered a treaty known as the Hewett Treaty between Ethiopia and Egypt in 1884."
                ),
                Question(
                    id = 10222,
                    questionNumber = 22,
                    totalQuestions = 100,
                    text = "The treaty of Wuchale was signed between Menilek II and Italian representative Count Pietro Antonelli in 1889.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The treaty was signed by King Menilek II and Count Pietro Antonelli in Wuchale on 2 May 1889."
                ),
                Question(
                    id = 10223,
                    questionNumber = 23,
                    totalQuestions = 100,
                    text = "Menilek unilaterally abrogated the Wuchale treaty in 1893 after failing to get it revised.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Upon failing to get revision of the treaty, Emperor Menilek unilaterally abrogated it in 1893."
                ),
                Question(
                    id = 10224,
                    questionNumber = 24,
                    totalQuestions = 100,
                    text = "The 'siege of Mekelle' strategy was believed to be designed by Empress Taytu.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The siege of Mekelle, which cut off Italian access to a well, was believed to be designed by Empress Taytu."
                ),
                Question(
                    id = 10225,
                    questionNumber = 25,
                    totalQuestions = 100,
                    text = "The Battle of Adwa was fought on March 1, 1896, and ended in a decisive Ethiopian victory.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The last and decisive phase of the war was fought at Adwa on March 1, 1896, resulting in a remarkable Ethiopian victory."
                ),
                Question(
                    id = 10226,
                    questionNumber = 26,
                    totalQuestions = 100,
                    text = "By the Treaty of Addis Ababa of October 1896, Italy recognized the independence of Ethiopia.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "By the treaty of Addis Ababa signed on October 26, 1896, Italy recognized the independence of Ethiopia."
                ),
                Question(
                    id = 10227,
                    questionNumber = 27,
                    totalQuestions = 100,
                    text = "The 1931 Constitution of Ethiopia strengthened the political influence of the provincial hereditary aristocracy.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "The 1931 Constitution caused the provincial hereditary aristocracy to lose a lot of political influence, except in Tigray."
                ),
                Question(
                    id = 10228,
                    questionNumber = 28,
                    totalQuestions = 100,
                    text = "The Ethiopian and Italian forces first clashed at Walwal in the Ogaden in December 1934.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Ethiopian and Italian forces clashed at Walwal in the Ogaden on December 5, 1934."
                ),
                Question(
                    id = 10229,
                    questionNumber = 29,
                    totalQuestions = 100,
                    text = "Emperor Haile Selassie re-entered Addis Ababa on May 5, 1941, after the Italian occupation ended.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Emperor Haile Selassie re-entered his capital on 5 May 1941 and officially hoisted the Ethiopian flag."
                ),
                Question(
                    id = 10230,
                    questionNumber = 30,
                    totalQuestions = 100,
                    text = "Emperor Menilek II unified the northern and central parts of Ethiopia while also expanding territorially into the south.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The making of modern Ethiopia involved unification of northern/north-central regions and territorial expansion into the south, continued under Menilek."
                ),
                Question(
                    id = 10231,
                    questionNumber = 31,
                    totalQuestions = 100,
                    text = "The two major 19th century long-distance trade routes in Ethiopia both started from which market centre?",
                    options = listOf(
                        QuestionOption("a", "Gondar"),
                        QuestionOption("b", "Harar"),
                        QuestionOption("c", "Bonga"),
                        QuestionOption("d", "Massawa")
                    ),
                    correctOptionId = "c",
                    explanation = "Both major trade routes started from Bonga, the capital of the Kafa Kingdom."
                ),
                Question(
                    id = 10232,
                    questionNumber = 32,
                    totalQuestions = 100,
                    text = "Which coin, introduced from Austria via Arab traders, served as a medium of exchange alongside salt bars?",
                    options = listOf(
                        QuestionOption("a", "The Napoleon franc"),
                        QuestionOption("b", "The Maria Theresa Thaler"),
                        QuestionOption("c", "The British sovereign"),
                        QuestionOption("d", "The Ottoman lira")
                    ),
                    correctOptionId = "b",
                    explanation = "The Maria Theresa Thaler (MTT) was introduced from Austria to the Horn of Africa and served as a medium of exchange."
                ),
                Question(
                    id = 10233,
                    questionNumber = 33,
                    totalQuestions = 100,
                    text = "Which group of merchants were described as northern Muslim merchants dominant in the long-distance trade?",
                    options = listOf(
                        QuestionOption("a", "Afqala"),
                        QuestionOption("b", "Jabarti"),
                        QuestionOption("c", "Argoba"),
                        QuestionOption("d", "Harari")
                    ),
                    correctOptionId = "b",
                    explanation = "The northern Muslim merchants were known as Jabarti."
                ),
                Question(
                    id = 10234,
                    questionNumber = 34,
                    totalQuestions = 100,
                    text = "Which item was NOT among the principal commodities of 19th century long-distance trade, according to the unit?",
                    options = listOf(
                        QuestionOption("a", "Ivory"),
                        QuestionOption("b", "Civet musk"),
                        QuestionOption("c", "Coffee"),
                        QuestionOption("d", "Slaves")
                    ),
                    correctOptionId = "c",
                    explanation = "The principal commodities were ivory, civet musk, salt bars (amole), and slaves — coffee is not listed."
                ),
                Question(
                    id = 10235,
                    questionNumber = 35,
                    totalQuestions = 100,
                    text = "Who was the first modern emperor to attempt the unification of Ethiopia?",
                    options = listOf(
                        QuestionOption("a", "Yohannes IV"),
                        QuestionOption("b", "Menilek II"),
                        QuestionOption("c", "Tewodros II"),
                        QuestionOption("d", "Haile Selassie I")
                    ),
                    correctOptionId = "c",
                    explanation = "Tewodros II (1855-1868), formerly Kassa Hailu of Quara, was the first emperor to attempt to unify the country."
                ),
                Question(
                    id = 10236,
                    questionNumber = 36,
                    totalQuestions = 100,
                    text = "At which battle was the last ruler of the Yejju dynasty defeated, symbolizing the end of the Zemene Mesafint?",
                    options = listOf(
                        QuestionOption("a", "Gur Amba"),
                        QuestionOption("b", "Gorgora Bichegn"),
                        QuestionOption("c", "Ayshal"),
                        QuestionOption("d", "Deresge")
                    ),
                    correctOptionId = "c",
                    explanation = "The battle of Ayshal, where the last ruler of the Yejju dynasty was defeated, symbolized the end of Zemene Mesafint."
                ),
                Question(
                    id = 10237,
                    questionNumber = 37,
                    totalQuestions = 100,
                    text = "Where did Tewodros II establish his arms manufacturing centre with European missionaries and artisans?",
                    options = listOf(
                        QuestionOption("a", "Maqdala"),
                        QuestionOption("b", "Gafat"),
                        QuestionOption("c", "Debre Tabor town centre"),
                        QuestionOption("d", "Gondar")
                    ),
                    correctOptionId = "b",
                    explanation = "Tewodros established an arms manufacture at Gafat, near Debre Tabor."
                ),
                Question(
                    id = 10238,
                    questionNumber = 38,
                    totalQuestions = 100,
                    text = "What was the name of Tewodros II's famous mortar produced at Gafat?",
                    options = listOf(
                        QuestionOption("a", "Sebastopol"),
                        QuestionOption("b", "Krupp"),
                        QuestionOption("c", "Big Bertha"),
                        QuestionOption("d", "Napier")
                    ),
                    correctOptionId = "a",
                    explanation = "His famous mortar produced at Gafat was known as 'Sebastopol'."
                ),
                Question(
                    id = 10239,
                    questionNumber = 39,
                    totalQuestions = 100,
                    text = "How did Emperor Tewodros II's reign come to an end in 1868?",
                    options = listOf(
                        QuestionOption("a", "He was exiled to India"),
                        QuestionOption("b", "He committed suicide after the British stormed Maqdala"),
                        QuestionOption("c", "He was assassinated by Yohannes IV"),
                        QuestionOption("d", "He abdicated peacefully")
                    ),
                    correctOptionId = "b",
                    explanation = "The storming of Meqdela by the British and the subsequent suicide of Tewodros brought an end to his reign."
                ),
                Question(
                    id = 10240,
                    questionNumber = 40,
                    totalQuestions = 100,
                    text = "Through which agreement did Yohannes IV recognize Menilek as Nigus of Shewa in 1878?",
                    options = listOf(
                        QuestionOption("a", "The Hewett Treaty"),
                        QuestionOption("b", "The Liche Agreement"),
                        QuestionOption("c", "The Wuchale Treaty"),
                        QuestionOption("d", "The Tripartite Treaty")
                    ),
                    correctOptionId = "b",
                    explanation = "Yohannes IV recognized Menilek as Nigus of Shewa in 1878 by the Liche agreement."
                ),
                Question(
                    id = 10241,
                    questionNumber = 41,
                    totalQuestions = 100,
                    text = "At the Council of Boru Meda (1878), what did Emperor Yohannes IV declare regarding the Ethiopian Orthodox Church?",
                    options = listOf(
                        QuestionOption("a", "That Islam would be the state religion"),
                        QuestionOption("b", "That Tewahdo was the only doctrine of the EOTC"),
                        QuestionOption("c", "That the church would be abolished"),
                        QuestionOption("d", "That Catholicism would be adopted")
                    ),
                    correctOptionId = "b",
                    explanation = "Yohannes IV presided over the Council of Boru Meda, where Tewahdo was declared the only doctrine of the EOTC."
                ),
                Question(
                    id = 10242,
                    questionNumber = 42,
                    totalQuestions = 100,
                    text = "How did Emperor Yohannes IV die in 1889?",
                    options = listOf(
                        QuestionOption("a", "At the Battle of Adwa"),
                        QuestionOption("b", "Fighting the Mahdists at Metemma"),
                        QuestionOption("c", "In a palace conspiracy"),
                        QuestionOption("d", "Of natural causes in Mekelle")
                    ),
                    correctOptionId = "b",
                    explanation = "On 9 March 1889, Yohannes marched to Metemma where he died fighting the Mahdists."
                ),
                Question(
                    id = 10243,
                    questionNumber = 43,
                    totalQuestions = 100,
                    text = "Which Shewan Oromo notable played a pivotal role in Menilek's territorial expansion?",
                    options = listOf(
                        QuestionOption("a", "Ras Gobana Dache"),
                        QuestionOption("b", "Ras Mekonnen Welde-Mikael"),
                        QuestionOption("c", "Ras Alula Engida"),
                        QuestionOption("d", "Fitawrari Habte Giyorgis")
                    ),
                    correctOptionId = "a",
                    explanation = "The Shewan Oromo notable Ras Gobana Dache played a pivotal role in territorial expansion and creation of the modern empire."
                ),
                Question(
                    id = 10244,
                    questionNumber = 44,
                    totalQuestions = 100,
                    text = "Who led the resistance of the western Gurage against Menilek's forces until their defeat in 1888?",
                    options = listOf(
                        QuestionOption("a", "Kawo Tona"),
                        QuestionOption("b", "Hassan Enjamo of Qabena"),
                        QuestionOption("c", "Tato Gaki Sherocho"),
                        QuestionOption("d", "Abba Jifar II")
                    ),
                    correctOptionId = "b",
                    explanation = "The western Gurage, led by Hassan Enjamo of Qabena, strongly resisted Menilek's forces until defeated in 1888."
                ),
                Question(
                    id = 10245,
                    questionNumber = 45,
                    totalQuestions = 100,
                    text = "At which battle was Ras Adal (Nigus Tekle-Haymanot) defeated by Ras Gobana, opening the way to western Ethiopia?",
                    options = listOf(
                        QuestionOption("a", "Embabo"),
                        QuestionOption("b", "Azule"),
                        QuestionOption("c", "Chalanqo"),
                        QuestionOption("d", "Anchim")
                    ),
                    correctOptionId = "a",
                    explanation = "Ras Adal was defeated at Embabo by Menilek's commander Ras Gobana."
                ),
                Question(
                    id = 10246,
                    questionNumber = 46,
                    totalQuestions = 100,
                    text = "It took six campaigns from 1882 to 1886 and the battle of Azule to pacify which people?",
                    options = listOf(
                        QuestionOption("a", "The Wolaita"),
                        QuestionOption("b", "The Arsi Oromo"),
                        QuestionOption("c", "The Kafa"),
                        QuestionOption("d", "The Harari")
                    ),
                    correctOptionId = "b",
                    explanation = "It took six campaigns from 1882 to 1886 to pacify the Arsi Oromo, ending at the battle of Azule in 1886."
                ),
                Question(
                    id = 10247,
                    questionNumber = 47,
                    totalQuestions = 100,
                    text = "At the battle of Chalanqo (1887), the combined forces of which two groups resisted Menilek's expansion into Hararghe?",
                    options = listOf(
                        QuestionOption("a", "The Harari and the Oromo"),
                        QuestionOption("b", "The Wolaita and the Gedeo"),
                        QuestionOption("c", "The Kafa and the Konso"),
                        QuestionOption("d", "The Afar and the Somali")
                    ),
                    correctOptionId = "a",
                    explanation = "In Hararghe, the combined forces of the Harari and the Oromo attempted to resist Menilek's expansion, defeated at Chalanqo."
                ),
                Question(
                    id = 10248,
                    questionNumber = 48,
                    totalQuestions = 100,
                    text = "Who was appointed governor of Hararghe by Menilek II after the battle of Chalanqo?",
                    options = listOf(
                        QuestionOption("a", "Ras Gobana Dache"),
                        QuestionOption("b", "Ras Wolde Giorgis"),
                        QuestionOption("c", "Dejjach (later Ras) Mekonnen Welde-Mikael"),
                        QuestionOption("d", "Ras Darge Sahla Sellasie")
                    ),
                    correctOptionId = "c",
                    explanation = "Dejjach (later Ras) Mekonnen Welde-Mikael was appointed governor of Hararghe after the battle of Chalanqo."
                ),
                Question(
                    id = 10249,
                    questionNumber = 49,
                    totalQuestions = 100,
                    text = "What was the immediate cause of the Great Famine (Kefu Qan) of 1888-92?",
                    options = listOf(
                        QuestionOption("a", "A prolonged drought"),
                        QuestionOption("b", "A rinderpest epidemic from Italian cattle imports through Massawa"),
                        QuestionOption("c", "A locust invasion"),
                        QuestionOption("d", "A volcanic eruption")
                    ),
                    correctOptionId = "b",
                    explanation = "The immediate cause was a rinderpest epidemic triggered by Italian importation of infected cattle through Massawa."
                ),
                Question(
                    id = 10250,
                    questionNumber = 50,
                    totalQuestions = 100,
                    text = "Who was the last king of Wolaita, arrested after resistance to Menilek's incorporation of the region in 1894?",
                    options = listOf(
                        QuestionOption("a", "Tato Gaki Sherocho"),
                        QuestionOption("b", "Kawo Tona"),
                        QuestionOption("c", "Abba Jifar II"),
                        QuestionOption("d", "Hassan Enjamo")
                    ),
                    correctOptionId = "b",
                    explanation = "The Wolaita resistance was controlled after Kawo Tona, the last king of Wolaita, was arrested."
                ),
                Question(
                    id = 10251,
                    questionNumber = 51,
                    totalQuestions = 100,
                    text = "Kafa was incorporated into the Ethiopian empire in 1897 after the defeat of which ruler?",
                    options = listOf(
                        QuestionOption("a", "Kawo Tona"),
                        QuestionOption("b", "Tato Gaki Sherocho"),
                        QuestionOption("c", "Abba Jifar II"),
                        QuestionOption("d", "Sheikh Khojale")
                    ),
                    correctOptionId = "b",
                    explanation = "Kafa was incorporated in 1897 after the forces of Tato Gaki Sherocho, the last king of Kafa, were defeated."
                ),
                Question(
                    id = 10252,
                    questionNumber = 52,
                    totalQuestions = 100,
                    text = "What was the first modern bank founded by Menilek II in 1905?",
                    options = listOf(
                        QuestionOption("a", "Commercial Bank of Ethiopia"),
                        QuestionOption("b", "Bank of Abyssinia"),
                        QuestionOption("c", "National Bank of Ethiopia"),
                        QuestionOption("d", "Development Bank of Ethiopia")
                    ),
                    correctOptionId = "b",
                    explanation = "Menilek II founded the first modern bank known as the Bank of Abyssinia in 1905."
                ),
                Question(
                    id = 10253,
                    questionNumber = 53,
                    totalQuestions = 100,
                    text = "Which railway did Menilek II sign an agreement with the French to establish in 1894?",
                    options = listOf(
                        QuestionOption("a", "Addis Ababa-Djibouti railway"),
                        QuestionOption("b", "Addis Ababa-Massawa railway"),
                        QuestionOption("c", "Addis Ababa-Mombasa railway"),
                        QuestionOption("d", "Addis Ababa-Khartoum railway")
                    ),
                    correctOptionId = "a",
                    explanation = "Menilek signed an agreement and initiated work on the Addis Ababa-Djibouti railway with the French in 1894."
                ),
                Question(
                    id = 10254,
                    questionNumber = 54,
                    totalQuestions = 100,
                    text = "Why did the British send a military expedition led by Sir Robert Napier to Ethiopia in 1868?",
                    options = listOf(
                        QuestionOption("a", "To colonize Ethiopia permanently"),
                        QuestionOption("b", "To free British/European citizens imprisoned by Tewodros"),
                        QuestionOption("c", "To support the Egyptians against Ethiopia"),
                        QuestionOption("d", "To build a railway to Massawa")
                    ),
                    correctOptionId = "b",
                    explanation = "The British sent a large military expedition to free their citizens arrested by Tewodros."
                ),
                Question(
                    id = 10255,
                    questionNumber = 55,
                    totalQuestions = 100,
                    text = "At which battle did about 8,000 of Tewodros's soldiers try but fail to check the advancing British forces in April 1868?",
                    options = listOf(
                        QuestionOption("a", "Maqdala"),
                        QuestionOption("b", "Aroge"),
                        QuestionOption("c", "Metemma"),
                        QuestionOption("d", "Adwa")
                    ),
                    correctOptionId = "b",
                    explanation = "On 10 April 1868, Tewodros's soldiers were defeated at the battle of Aroge."
                ),
                Question(
                    id = 10256,
                    questionNumber = 56,
                    totalQuestions = 100,
                    text = "Who was the architect of Khedive Ismail's scheme to invade Ethiopia in the 1870s?",
                    options = listOf(
                        QuestionOption("a", "Mohammed Rauf Pasha"),
                        QuestionOption("b", "Werner Munzinger"),
                        QuestionOption("c", "Colonel Arendrup"),
                        QuestionOption("d", "Ras Alula")
                    ),
                    correctOptionId = "b",
                    explanation = "Werner Munzinger was the architect of the whole of Ismail's scheme for the invasion of Ethiopia."
                ),
                Question(
                    id = 10257,
                    questionNumber = 57,
                    totalQuestions = 100,
                    text = "At which battle did Emperor Yohannes IV's forces severely defeat the Egyptian army in November 1875?",
                    options = listOf(
                        QuestionOption("a", "Gura"),
                        QuestionOption("b", "Gundet"),
                        QuestionOption("c", "Dogali"),
                        QuestionOption("d", "Kufit")
                    ),
                    correctOptionId = "b",
                    explanation = "Yohannes IV and Ras Alula defeated the Egyptians at the Battle of Gundet on 16 November 1875."
                ),
                Question(
                    id = 10258,
                    questionNumber = 58,
                    totalQuestions = 100,
                    text = "Italy's advance into northern Ethiopia (Mereb Melash) was decisively defeated in 1887 by Ras Alula Engida at which battle?",
                    options = listOf(
                        QuestionOption("a", "Dogali"),
                        QuestionOption("b", "Amba Alage"),
                        QuestionOption("c", "Mekelle"),
                        QuestionOption("d", "Adwa")
                    ),
                    correctOptionId = "a",
                    explanation = "They were defeated decisively at the Battle of Dogali by Ras Alula Engida in 1887."
                ),
                Question(
                    id = 10259,
                    questionNumber = 59,
                    totalQuestions = 100,
                    text = "The Hewett Treaty of 1884 required Ethiopia to facilitate the evacuation of which trapped forces?",
                    options = listOf(
                        QuestionOption("a", "British troops in Sudan"),
                        QuestionOption("b", "Egyptian soldiers encircled by the Mahdists in eastern Sudan"),
                        QuestionOption("c", "Italian troops in Eritrea"),
                        QuestionOption("d", "French troops in Djibouti")
                    ),
                    correctOptionId = "b",
                    explanation = "Ethiopia agreed to facilitate the evacuation of Egyptian soldiers encircled by the Mahdists in eastern Sudan."
                ),
                Question(
                    id = 10260,
                    questionNumber = 60,
                    totalQuestions = 100,
                    text = "Who signed the Wuchale treaty on behalf of Italy in 1889?",
                    options = listOf(
                        QuestionOption("a", "Emilio de Bono"),
                        QuestionOption("b", "Pietro Badoglio"),
                        QuestionOption("c", "Count Pietro Antonelli"),
                        QuestionOption("d", "Rudolfo Graziani")
                    ),
                    correctOptionId = "c",
                    explanation = "The treaty was signed by King Menilek II and the Italian representative, Count Pietro Antonelli."
                ),
                Question(
                    id = 10261,
                    questionNumber = 61,
                    totalQuestions = 100,
                    text = "What was the key discrepancy between the Amharic and Italian versions of Article XVII of the Wuchale treaty?",
                    options = listOf(
                        QuestionOption("a", "The Amharic version made use of Italian mediation obligatory, the Italian version optional"),
                        QuestionOption("b", "The Italian version made use of Italian mediation obligatory, the Amharic version optional"),
                        QuestionOption("c", "Both versions were identical"),
                        QuestionOption("d", "Neither version mentioned foreign relations")
                    ),
                    correctOptionId = "b",
                    explanation = "The Amharic version said the emperor 'could' use Italian mediation while the Italian text made it obligatory."
                ),
                Question(
                    id = 10262,
                    questionNumber = 62,
                    totalQuestions = 100,
                    text = "Who led the Ethiopian force that defeated the Italians at Amba Alage before the battle of Adwa?",
                    options = listOf(
                        QuestionOption("a", "Fitawrari Gebeyehu Gurmu"),
                        QuestionOption("b", "Ras Mekonnen"),
                        QuestionOption("c", "Empress Taytu"),
                        QuestionOption("d", "Ras Alula")
                    ),
                    correctOptionId = "a",
                    explanation = "A force led by Fitawrari Gebeyehu Gurmu defeated the Italians at Amba-Alage."
                ),
                Question(
                    id = 10263,
                    questionNumber = 63,
                    totalQuestions = 100,
                    text = "Approximately how many troops gathered at Wara-Illu after Menilek's proclamation for general mobilization before Adwa?",
                    options = listOf(
                        QuestionOption("a", "10,000"),
                        QuestionOption("b", "50,000"),
                        QuestionOption("c", "100,000"),
                        QuestionOption("d", "250,000")
                    ),
                    correctOptionId = "c",
                    explanation = "About 100,000 troops from every part of the country gathered at Wara-Illu."
                ),
                Question(
                    id = 10264,
                    questionNumber = 64,
                    totalQuestions = 100,
                    text = "Which country was the first to recognize Ethiopia's independence after the Battle of Adwa?",
                    options = listOf(
                        QuestionOption("a", "France"),
                        QuestionOption("b", "Britain"),
                        QuestionOption("c", "Italy"),
                        QuestionOption("d", "Russia")
                    ),
                    correctOptionId = "c",
                    explanation = "By the treaty of Addis Ababa, Italy — the first country to do so — recognized the independence of Ethiopia."
                ),
                Question(
                    id = 10265,
                    questionNumber = 65,
                    totalQuestions = 100,
                    text = "Who was crowned empress of Ethiopia after Lij Iyasu was deposed in 1916?",
                    options = listOf(
                        QuestionOption("a", "Empress Taytu"),
                        QuestionOption("b", "Empress Zewditu"),
                        QuestionOption("c", "Etege Menen"),
                        QuestionOption("d", "Shewaregard Gedle")
                    ),
                    correctOptionId = "b",
                    explanation = "Iyasu was deposed on September 27, 1916, and Zewditu, Menilek's daughter, was crowned empress."
                ),
                Question(
                    id = 10266,
                    questionNumber = 66,
                    totalQuestions = 100,
                    text = "At which battle was Iyasu's father, Nigus Mikael, defeated and captured by the Shewan army led by Ras Teferi?",
                    options = listOf(
                        QuestionOption("a", "Sagale"),
                        QuestionOption("b", "Anchim"),
                        QuestionOption("c", "Azule"),
                        QuestionOption("d", "Chalanqo")
                    ),
                    correctOptionId = "a",
                    explanation = "Nigus Mikael was defeated and captured at Sagale on October 27, 1916, the deadliest battle since Adwa."
                ),
                Question(
                    id = 10267,
                    questionNumber = 67,
                    totalQuestions = 100,
                    text = "The period of dual governance between Empress Zewditu and Ras Teferi Mekonnen after 1916 is known as:",
                    options = listOf(
                        QuestionOption("a", "The Zemene Mesafint"),
                        QuestionOption("b", "Diarchy"),
                        QuestionOption("c", "The Tripartite period"),
                        QuestionOption("d", "The Regency")
                    ),
                    correctOptionId = "b",
                    explanation = "The political settlement of 1916 marked the start of the period of dual governance known as diarchy."
                ),
                Question(
                    id = 10268,
                    questionNumber = 68,
                    totalQuestions = 100,
                    text = "Which document, adopted in 1931, provided the legal framework for Haile Selassie's emerging autocratic rule?",
                    options = listOf(
                        QuestionOption("a", "The Liche Agreement"),
                        QuestionOption("b", "The Tripartite Treaty"),
                        QuestionOption("c", "The first written constitution"),
                        QuestionOption("d", "The Treaty of Addis Ababa")
                    ),
                    correctOptionId = "c",
                    explanation = "The first written constitution of 1931 established the legal basis for Haile Selassie's emerging absolutism."
                ),
                Question(
                    id = 10269,
                    questionNumber = 69,
                    totalQuestions = 100,
                    text = "Which region was permitted to retain rule by its own local hereditary chiefs under the 1931 Constitution?",
                    options = listOf(
                        QuestionOption("a", "Gojjam"),
                        QuestionOption("b", "Tigray"),
                        QuestionOption("c", "Wallo"),
                        QuestionOption("d", "Shewa")
                    ),
                    correctOptionId = "b",
                    explanation = "With the exception of Tigray, other provinces lost internal autonomy under the 1931 Constitution."
                ),
                Question(
                    id = 10270,
                    questionNumber = 70,
                    totalQuestions = 100,
                    text = "At Walwal in the Ogaden, Ethiopian and Italian forces clashed on which date?",
                    options = listOf(
                        QuestionOption("a", "December 5, 1934"),
                        QuestionOption("b", "October 3, 1935"),
                        QuestionOption("c", "March 1, 1936"),
                        QuestionOption("d", "May 5, 1936")
                    ),
                    correctOptionId = "a",
                    explanation = "Ethiopian and Italian forces clashed at Walwal on December 5, 1934."
                ),
                Question(
                    id = 10271,
                    questionNumber = 71,
                    totalQuestions = 100,
                    text = "The two 19th century long-distance trade routes in Ethiopia both started from _______, the capital of the Kafa Kingdom.",
                    options = emptyList(),
                    correctOptionId = "Bonga",
                    explanation = "Both major trade routes started from Bonga, the capital of the Kafa Kingdom.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10272,
                    questionNumber = 72,
                    totalQuestions = 100,
                    text = "The _______ Thaler was a coin introduced from Austria to the Horn of Africa region.",
                    options = emptyList(),
                    correctOptionId = "Maria Theresa",
                    explanation = "The Maria Theresa Thaler (MTT) was a coin introduced from Austria to the Horn of Africa.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10273,
                    questionNumber = 73,
                    totalQuestions = 100,
                    text = "Kassa Hailu of Quara took the throne name _______ upon his coronation in 1855.",
                    options = emptyList(),
                    correctOptionId = "Tewodros II",
                    explanation = "Kassa Hailu took the throne name Tewodros II, King of Kings of Ethiopia.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10274,
                    questionNumber = 74,
                    totalQuestions = 100,
                    text = "Tewodros II established an arms manufacturing centre at _______, near Debre Tabor.",
                    options = emptyList(),
                    correctOptionId = "Gafat",
                    explanation = "Tewodros established an arms manufacture at Gafat, near Debre Tabor.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10275,
                    questionNumber = 75,
                    totalQuestions = 100,
                    text = "Tewodros II's famous mortar produced at Gafat was nicknamed '_______'.",
                    options = emptyList(),
                    correctOptionId = "Sebastopol",
                    explanation = "His famous mortar produced at Gafat was known as 'Sebastopol.'",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10276,
                    questionNumber = 76,
                    totalQuestions = 100,
                    text = "Emperor Yohannes IV recognized Menilek as Nigus of Shewa in 1878 through the _______ Agreement.",
                    options = emptyList(),
                    correctOptionId = "Liche",
                    explanation = "Yohannes IV recognized Menilek as Nigus of Shewa in 1878 by the Liche agreement.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10277,
                    questionNumber = 77,
                    totalQuestions = 100,
                    text = "The Council of _______ in 1878 declared Tewahdo the only doctrine of the Ethiopian Orthodox Church.",
                    options = emptyList(),
                    correctOptionId = "Boru Meda",
                    explanation = "Yohannes IV presided over the Council of Boru Meda (1878).",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10278,
                    questionNumber = 78,
                    totalQuestions = 100,
                    text = "Emperor Yohannes IV died in 1889 fighting the Mahdists at _______.",
                    options = emptyList(),
                    correctOptionId = "Metemma",
                    explanation = "On 9 March 1889, Yohannes marched to Metemma where he died fighting the Mahdists.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10279,
                    questionNumber = 79,
                    totalQuestions = 100,
                    text = "Ras _______ Dache played a pivotal role in Menilek's territorial expansion into Oromo territories.",
                    options = emptyList(),
                    correctOptionId = "Gobana",
                    explanation = "The Shewan Oromo notable Ras Gobana Dache played a pivotal role in territorial expansion.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10280,
                    questionNumber = 80,
                    totalQuestions = 100,
                    text = "The western Gurage resistance to Menilek was led by Hassan Enjamo of _______.",
                    options = emptyList(),
                    correctOptionId = "Qabena",
                    explanation = "The western Gurage, led by Hassan Enjamo of Qabena, strongly resisted Menilek's forces.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10281,
                    questionNumber = 81,
                    totalQuestions = 100,
                    text = "Ras Adal (Nigus Tekle-Haymanot) was defeated by Ras Gobana at the Battle of _______.",
                    options = emptyList(),
                    correctOptionId = "Embabo",
                    explanation = "Ras Adal was defeated at Embabo by Menilek's commander Ras Gobana.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10282,
                    questionNumber = 82,
                    totalQuestions = 100,
                    text = "The Arsi Oromo resistance was finally suppressed at the battle of _______ on 6 September 1886.",
                    options = emptyList(),
                    correctOptionId = "Azule",
                    explanation = "The Arsi resistance was suppressed at the battle of Azule on 6 September 1886.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10283,
                    questionNumber = 83,
                    totalQuestions = 100,
                    text = "The combined Harari and Oromo forces resisting Menilek's expansion were defeated at the battle of _______ in 1887.",
                    options = emptyList(),
                    correctOptionId = "Chalanqo",
                    explanation = "Their forces were defeated at the battle of Chalanqo on 6 January 1887.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10284,
                    questionNumber = 84,
                    totalQuestions = 100,
                    text = "The Great Famine of 1888-92 is also known in Amharic as _______.",
                    options = emptyList(),
                    correctOptionId = "Kefu Qan",
                    explanation = "The Great Famine (1888-92) is also referred to as Kefu Qan.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10285,
                    questionNumber = 85,
                    totalQuestions = 100,
                    text = "_______ was the last king of Wolaita, arrested after resistance in 1894.",
                    options = emptyList(),
                    correctOptionId = "Kawo Tona",
                    explanation = "The Wolaita resistance was put under control after Kawo Tona, the last king of Wolaita, was arrested.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10286,
                    questionNumber = 86,
                    totalQuestions = 100,
                    text = "Kafa was incorporated in 1897 after the defeat of _______, its last king.",
                    options = emptyList(),
                    correctOptionId = "Tato Gaki Sherocho",
                    explanation = "Kafa was incorporated after the forces of Tato Gaki Sherocho were defeated by Menilek's army.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10287,
                    questionNumber = 87,
                    totalQuestions = 100,
                    text = "Menilek II founded the first modern bank in Ethiopia, called the Bank of _______, in 1905.",
                    options = emptyList(),
                    correctOptionId = "Abyssinia",
                    explanation = "Menilek II founded the Bank of Abyssinia in 1905.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10288,
                    questionNumber = 88,
                    totalQuestions = 100,
                    text = "Menilek II signed an agreement with the French in 1894 to build the Addis Ababa-_______ railway.",
                    options = emptyList(),
                    correctOptionId = "Djibouti",
                    explanation = "Menilek initiated work on the Addis Ababa-Djibouti railway with the French in 1894.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10289,
                    questionNumber = 89,
                    totalQuestions = 100,
                    text = "The British military expedition of 1868 to free European captives from Tewodros was commanded by Sir Robert _______.",
                    options = emptyList(),
                    correctOptionId = "Napier",
                    explanation = "The British sent a military expedition commanded by Sir Robert Napier in 1868.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10290,
                    questionNumber = 90,
                    totalQuestions = 100,
                    text = "Tewodros committed suicide at _______ after the British stormed the fortress on April 30, 1868.",
                    options = emptyList(),
                    correctOptionId = "Maqdala",
                    explanation = "Tewodros committed suicide at Maqdala after the British stormed the fortress.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10291,
                    questionNumber = 91,
                    totalQuestions = 100,
                    text = "_______ was the architect of Khedive Ismail's scheme for the Egyptian invasion of Ethiopia.",
                    options = emptyList(),
                    correctOptionId = "Werner Munzinger",
                    explanation = "Werner Munzinger was the architect of the whole of Ismail's scheme for the invasion of Ethiopia.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10292,
                    questionNumber = 92,
                    totalQuestions = 100,
                    text = "Ethiopian forces under Yohannes IV and Ras Alula defeated the Egyptians at the Battle of _______ in November 1875.",
                    options = emptyList(),
                    correctOptionId = "Gundet",
                    explanation = "The Egyptian troops were severely defeated at the Battle of Gundet on 16 November 1875.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10293,
                    questionNumber = 93,
                    totalQuestions = 100,
                    text = "Italy's penetration of northern Ethiopia was decisively checked at the Battle of _______ in 1887.",
                    options = emptyList(),
                    correctOptionId = "Dogali",
                    explanation = "They were defeated decisively at the Battle of Dogali by Ras Alula Engida in 1887.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10294,
                    questionNumber = 94,
                    totalQuestions = 100,
                    text = "The 1884 treaty brokered by the British between Ethiopia and Egypt is known as the _______ Treaty.",
                    options = emptyList(),
                    correctOptionId = "Hewett",
                    explanation = "The British brokered a treaty known as the Hewett Treaty between Ethiopia and Egypt in 1884.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10295,
                    questionNumber = 95,
                    totalQuestions = 100,
                    text = "The Wuchale treaty was signed by Menilek II and the Italian representative Count Pietro _______.",
                    options = emptyList(),
                    correctOptionId = "Antonelli",
                    explanation = "The treaty was signed by King Menilek II and Count Pietro Antonelli.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10296,
                    questionNumber = 96,
                    totalQuestions = 100,
                    text = "The decisive Battle of Adwa was fought on March 1, _______.",
                    options = emptyList(),
                    correctOptionId = "1896",
                    explanation = "The last and decisive phase of the war was fought at Adwa on March 1st, 1896.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10297,
                    questionNumber = 97,
                    totalQuestions = 100,
                    text = "By the Treaty of _______ signed on October 26, 1896, Italy recognized Ethiopia's independence.",
                    options = emptyList(),
                    correctOptionId = "Addis Ababa",
                    explanation = "By the treaty of Addis Ababa signed on October 26, 1896, Italy recognized the independence of Ethiopia.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10298,
                    questionNumber = 98,
                    totalQuestions = 100,
                    text = "Empress _______ is believed to have designed the strategy known as the siege of Mekelle.",
                    options = emptyList(),
                    correctOptionId = "Taytu",
                    explanation = "The siege of Mekelle strategy was believed to be designed by Empress Taytu.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10299,
                    questionNumber = 99,
                    totalQuestions = 100,
                    text = "After Lij Iyasu was deposed in 1916, Menilek's daughter _______ was crowned empress.",
                    options = emptyList(),
                    correctOptionId = "Zewditu",
                    explanation = "Zewditu, Menilek's daughter, was crowned empress of Ethiopia in 1916.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10300,
                    questionNumber = 100,
                    totalQuestions = 100,
                    text = "Ras Teferi Mekonnen was crowned Emperor _______ in 1930, ending the period of diarchy.",
                    options = emptyList(),
                    correctOptionId = "Haile Selassie",
                    explanation = "The coronation of Ras Teferi as Emperor in 1930, under the name Haile Selassie, marked the end of diarchy.",
                    type = QuestionType.FILL_IN_THE_BLANK
                )
            )
        ),
        "hist_u4" to Quiz(
            id = "quiz_history_u4_full",
            title = "Society and Politics in the Age of World Wars 1914–1945 Quiz",
            subject = "History",
            durationMinutes = 45,
            gradeLevel = "Grade 10",
            iconName = "pillar",
            unitId = "hist_u4",
            subjectId = "history",
            questions = listOf(
                Question(
                    id = 10301,
                    questionNumber = 1,
                    totalQuestions = 100,
                    text = "The Triple Alliance, formed in 1882, originally comprised Germany, Austria-Hungary, and Italy.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The Triple Alliance, formed in 1882, comprised Germany, Austria-Hungary and Italy."
                ),
                Question(
                    id = 10302,
                    questionNumber = 2,
                    totalQuestions = 100,
                    text = "Italy remained in the Triple Alliance throughout World War I.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "Italy left the Triple Alliance and joined the Triple Entente in 1915."
                ),
                Question(
                    id = 10303,
                    questionNumber = 3,
                    totalQuestions = 100,
                    text = "By 1914, Germany had nearly 100 warships and two million trained soldiers.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "By 1914, Germany had nearly 100 warships and two million trained soldiers, reflecting the arms race."
                ),
                Question(
                    id = 10304,
                    questionNumber = 4,
                    totalQuestions = 100,
                    text = "The immediate cause of World War I was the assassination of Archduke Franz Ferdinand.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The immediate cause of WWI was the assassination of Archduke Franz Ferdinand on June 28, 1914."
                ),
                Question(
                    id = 10305,
                    questionNumber = 5,
                    totalQuestions = 100,
                    text = "Archduke Franz Ferdinand was assassinated by a Serbian nationalist named Gavrilo Princip.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Franz Ferdinand was assassinated by Gavrilo Princip, a Serbian nationalist, at Sarajevo."
                ),
                Question(
                    id = 10306,
                    questionNumber = 6,
                    totalQuestions = 100,
                    text = "The Schlieffen Plan proposed that Germany attack France through Belgium before turning east against Russia.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Schlieffen proposed attacking France through Belgium and occupying Paris before turning against Russia."
                ),
                Question(
                    id = 10307,
                    questionNumber = 7,
                    totalQuestions = 100,
                    text = "The German advance was halted at the Battle of the Marne in September 1914.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The Germans' attack was forced back at the Battle of the Marne in September 1914."
                ),
                Question(
                    id = 10308,
                    questionNumber = 8,
                    totalQuestions = 100,
                    text = "The United States declared war on Germany on April 6, 1917.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The US declared war on Germany on April 6, 1917."
                ),
                Question(
                    id = 10309,
                    questionNumber = 9,
                    totalQuestions = 100,
                    text = "The Zimmermann Telegram promised Mexico areas of the southwestern United States in return for support against America.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The Zimmermann telegram promised to reward Mexico with vast areas of the southwestern US for support against the Americans."
                ),
                Question(
                    id = 10310,
                    questionNumber = 10,
                    totalQuestions = 100,
                    text = "The Spanish flu pandemic of 1918-19 was spread partly by the mass movement of soldiers and refugees.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The mass movement of soldiers and refugees helped spread the Spanish flu pandemic of 1918-19."
                ),
                Question(
                    id = 10311,
                    questionNumber = 11,
                    totalQuestions = 100,
                    text = "The Treaty of Versailles placed sole responsibility for World War I on Germany.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The treaty placed sole responsibility for the war on Germany's shoulders, requiring it to pay reparations."
                ),
                Question(
                    id = 10312,
                    questionNumber = 12,
                    totalQuestions = 100,
                    text = "The 'Big Four' at the Paris Peace Conference included representatives of Germany.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "Germany and its allies were not represented; the Big Four were the US, France, Britain, and Italy."
                ),
                Question(
                    id = 10313,
                    questionNumber = 13,
                    totalQuestions = 100,
                    text = "Serfdom was abolished in Russia in 1861.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Serfdom was abolished in Russia in 1861."
                ),
                Question(
                    id = 10314,
                    questionNumber = 14,
                    totalQuestions = 100,
                    text = "The Bloody Sunday massacre in St. Petersburg marked the beginning of the violent phase of the Russian Revolution of 1905.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The Bloody Sunday massacre of peace demonstrators marked the beginning of the violent phase of the 1905 revolution."
                ),
                Question(
                    id = 10315,
                    questionNumber = 15,
                    totalQuestions = 100,
                    text = "The Bolsheviks were led by Vladimir Ilich Ulyanov, known as Lenin.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The Bolsheviks (majority) were led by Lenin, whose real name was Vladimir Ilich Ulyanov."
                ),
                Question(
                    id = 10316,
                    questionNumber = 16,
                    totalQuestions = 100,
                    text = "The February Revolution of 1917 ended the rule of the Romanov Dynasty.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Czar Nicholas II was deposed in the February Revolution, ending the rule of the Romanov Dynasty."
                ),
                Question(
                    id = 10317,
                    questionNumber = 17,
                    totalQuestions = 100,
                    text = "Russia formally withdrew from World War I after signing the Treaty of Brest-Litovsk with Germany in 1918.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Russia formally withdrew from WWI after signing the Treaty of Brest-Litovsk with Germany in 1918."
                ),
                Question(
                    id = 10318,
                    questionNumber = 18,
                    totalQuestions = 100,
                    text = "The League of Nations was headquartered in Geneva, Switzerland.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The League of Nations, headquartered in Geneva, Switzerland, was founded on January 10, 1920."
                ),
                Question(
                    id = 10319,
                    questionNumber = 19,
                    totalQuestions = 100,
                    text = "The United States joined the League of Nations as a founding permanent member.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "The US Congress resisted joining the League, and the US ultimately did not join."
                ),
                Question(
                    id = 10320,
                    questionNumber = 20,
                    totalQuestions = 100,
                    text = "The Great Depression began with the New York Wall Street stock market crash of October 1929.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The Great Depression began in the United States with the Wall Street stock market crash of October 1929."
                ),
                Question(
                    id = 10321,
                    questionNumber = 21,
                    totalQuestions = 100,
                    text = "Benito Mussolini formed his Fascist party in 1919.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Benito Mussolini had formed his Fascist party in 1919."
                ),
                Question(
                    id = 10322,
                    questionNumber = 22,
                    totalQuestions = 100,
                    text = "A Fascist State was established in Italy in 1922.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "A Fascist State was established in Italy in 1922."
                ),
                Question(
                    id = 10323,
                    questionNumber = 23,
                    totalQuestions = 100,
                    text = "Nazis came into power in Germany in 1933.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Nazis came into power in Germany in 1933."
                ),
                Question(
                    id = 10324,
                    questionNumber = 24,
                    totalQuestions = 100,
                    text = "Adolf Hitler wrote Mein Kampf while in prison after his failed 1923 coup attempt.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "It was during his imprisonment following the failed 1923 coup that Hitler wrote Mein Kampf."
                ),
                Question(
                    id = 10325,
                    questionNumber = 25,
                    totalQuestions = 100,
                    text = "Japan invaded Manchuria in 1931 and later withdrew from the League of Nations in 1933.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "In 1931 Japan invaded Manchuria, and when the League condemned it, Japan withdrew from the League in May 1933."
                ),
                Question(
                    id = 10326,
                    questionNumber = 26,
                    totalQuestions = 100,
                    text = "Germany invaded Poland on September 1, 1939, marking the start of World War II.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Germany invaded Poland on 1 September 1939, marking the beginning of World War II."
                ),
                Question(
                    id = 10327,
                    questionNumber = 27,
                    totalQuestions = 100,
                    text = "Japan attacked the US naval base at Pearl Harbor in December 1941.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Japan attacked the US naval base at Pearl Harbor in December 1941, leading the USA to declare war on Japan."
                ),
                Question(
                    id = 10328,
                    questionNumber = 28,
                    totalQuestions = 100,
                    text = "Adolf Hitler committed suicide on April 30, 1945.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Adolf Hitler committed suicide on 30 April 1945."
                ),
                Question(
                    id = 10329,
                    questionNumber = 29,
                    totalQuestions = 100,
                    text = "The United States dropped atomic bombs on Hiroshima and Nagasaki in August 1945.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "On the 6th and 9th of August 1945, the USA dropped atomic bombs on Hiroshima and Nagasaki."
                ),
                Question(
                    id = 10330,
                    questionNumber = 30,
                    totalQuestions = 100,
                    text = "The United Nations Organization was formed after WWII to replace the League of Nations.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The urge for a new international organization gave birth to the United Nations Organization, which replaced the League of Nations."
                ),
                Question(
                    id = 10331,
                    questionNumber = 31,
                    totalQuestions = 100,
                    text = "The Triple Alliance, formed in 1882, originally comprised which three countries?",
                    options = listOf(
                        QuestionOption("a", "Germany, Austria-Hungary, and Italy"),
                        QuestionOption("b", "France, Britain, and Russia"),
                        QuestionOption("c", "Germany, Russia, and Italy"),
                        QuestionOption("d", "Austria-Hungary, Russia, and Serbia")
                    ),
                    correctOptionId = "a",
                    explanation = "The Triple Alliance, formed in 1882, comprised Germany, Austria-Hungary and Italy."
                ),
                Question(
                    id = 10332,
                    questionNumber = 32,
                    totalQuestions = 100,
                    text = "The Triple Entente developed from the Franco-Russian Alliance of 1894 and was transformed into a Triple Entente following which 1907 agreement?",
                    options = listOf(
                        QuestionOption("a", "The Entente Cordiale"),
                        QuestionOption("b", "The Anglo-Russian Agreement"),
                        QuestionOption("c", "The Treaty of London"),
                        QuestionOption("d", "The Schlieffen Plan")
                    ),
                    correctOptionId = "b",
                    explanation = "The Triple Entente was transformed following the Anglo-Russia Agreement of 1907."
                ),
                Question(
                    id = 10333,
                    questionNumber = 33,
                    totalQuestions = 100,
                    text = "What was the immediate cause of World War I?",
                    options = listOf(
                        QuestionOption("a", "The German invasion of Belgium"),
                        QuestionOption("b", "The assassination of Archduke Franz Ferdinand"),
                        QuestionOption("c", "The sinking of the Lusitania"),
                        QuestionOption("d", "The Zimmermann Telegram")
                    ),
                    correctOptionId = "b",
                    explanation = "The immediate cause of WWI was the assassination of Archduke Franz Ferdinand at Sarajevo on June 28, 1914."
                ),
                Question(
                    id = 10334,
                    questionNumber = 34,
                    totalQuestions = 100,
                    text = "Who assassinated Archduke Franz Ferdinand at Sarajevo in June 1914?",
                    options = listOf(
                        QuestionOption("a", "Gavrilo Princip"),
                        QuestionOption("b", "Vladimir Lenin"),
                        QuestionOption("c", "Arthur Zimmermann"),
                        QuestionOption("d", "Alfred von Schlieffen")
                    ),
                    correctOptionId = "a",
                    explanation = "Franz Ferdinand was assassinated by Gavrilo Princip, a Serbian nationalist."
                ),
                Question(
                    id = 10335,
                    questionNumber = 35,
                    totalQuestions = 100,
                    text = "Who devised the German war plan that proposed attacking France through Belgium before turning against Russia?",
                    options = listOf(
                        QuestionOption("a", "Count Alfred von Schlieffen"),
                        QuestionOption("b", "Kaiser Wilhelm II"),
                        QuestionOption("c", "Otto von Bismarck"),
                        QuestionOption("d", "Woodrow Wilson")
                    ),
                    correctOptionId = "a",
                    explanation = "The Germans followed a plan devised by Count Alfred von Schlieffen, their Chief of the General Staff."
                ),
                Question(
                    id = 10336,
                    questionNumber = 36,
                    totalQuestions = 100,
                    text = "Where was the German advance halted in September 1914, starting a stalemate on the Western Front?",
                    options = listOf(
                        QuestionOption("a", "The Battle of the Marne"),
                        QuestionOption("b", "The Battle of Sedan"),
                        QuestionOption("c", "The Battle of Verdun"),
                        QuestionOption("d", "The Battle of Tannenberg")
                    ),
                    correctOptionId = "a",
                    explanation = "The Germans' attack was forced back at the Battle of the Marne in September 1914."
                ),
                Question(
                    id = 10337,
                    questionNumber = 37,
                    totalQuestions = 100,
                    text = "What discovery, along with unrestricted submarine warfare, helped push the US to declare war on Germany in 1917?",
                    options = listOf(
                        QuestionOption("a", "The Schlieffen Plan"),
                        QuestionOption("b", "The Zimmermann Telegram"),
                        QuestionOption("c", "The Treaty of Brest-Litovsk"),
                        QuestionOption("d", "The Treaty of Versailles")
                    ),
                    correctOptionId = "b",
                    explanation = "The Zimmermann Telegram, in which Germany promised Mexico US territory for support, helped push the US into the war."
                ),
                Question(
                    id = 10338,
                    questionNumber = 38,
                    totalQuestions = 100,
                    text = "Which four imperial dynasties collapsed as a result of World War I?",
                    options = listOf(
                        QuestionOption("a", "Habsburgs, Hohenzollerns, Ottoman sultanate, and Romanovs"),
                        QuestionOption("b", "Bourbons, Tudors, Stuarts, and Romanovs"),
                        QuestionOption("c", "Habsburgs, Bourbons, Ottomans, and Hohenzollerns"),
                        QuestionOption("d", "Romanovs, Ottomans, Bourbons, and Stuarts")
                    ),
                    correctOptionId = "a",
                    explanation = "Four imperial dynasties collapsed: the Habsburgs of Austria-Hungary, the Hohenzollerns of Germany, the Ottoman sultanate, and the Romanovs of Russia."
                ),
                Question(
                    id = 10339,
                    questionNumber = 39,
                    totalQuestions = 100,
                    text = "The Treaty of Versailles between Germany and the Allied Powers was signed on which date?",
                    options = listOf(
                        QuestionOption("a", "June 28, 1919"),
                        QuestionOption("b", "November 11, 1918"),
                        QuestionOption("c", "January 10, 1920"),
                        QuestionOption("d", "April 6, 1917")
                    ),
                    correctOptionId = "a",
                    explanation = "The Treaty of Versailles was signed on June 28, 1919."
                ),
                Question(
                    id = 10340,
                    questionNumber = 40,
                    totalQuestions = 100,
                    text = "Who were the members of the 'Big Four' at the Paris Peace Conference?",
                    options = listOf(
                        QuestionOption("a", "Wilson, Clemenceau, Lloyd George, and Orlando"),
                        QuestionOption("b", "Wilson, Lenin, Churchill, and Mussolini"),
                        QuestionOption("c", "Clemenceau, Hitler, Wilson, and Stalin"),
                        QuestionOption("d", "Lloyd George, Trotsky, Wilson, and Orlando")
                    ),
                    correctOptionId = "a",
                    explanation = "The Big Four were Woodrow Wilson (US), Georges Clemenceau (France), David Lloyd George (Britain), and Vittorio Orlando (Italy)."
                ),
                Question(
                    id = 10341,
                    questionNumber = 41,
                    totalQuestions = 100,
                    text = "As a result of the Treaty of Versailles, what happened to Germany's territories in Africa and the Pacific?",
                    options = listOf(
                        QuestionOption("a", "They were returned to Germany after 10 years"),
                        QuestionOption("b", "They became mandates administered by the League of Nations"),
                        QuestionOption("c", "They were annexed by the United States"),
                        QuestionOption("d", "They became independent immediately")
                    ),
                    correctOptionId = "b",
                    explanation = "Germany's territories in Africa and the Pacific were declared mandates administered by the League of Nations."
                ),
                Question(
                    id = 10342,
                    questionNumber = 42,
                    totalQuestions = 100,
                    text = "What was the most radical political group in Russia, following the teachings of Karl Marx?",
                    options = listOf(
                        QuestionOption("a", "The Social Revolutionaries"),
                        QuestionOption("b", "The Marxists (forming the RSDLP)"),
                        QuestionOption("c", "The liberal parliamentarians"),
                        QuestionOption("d", "The Kulaks")
                    ),
                    correctOptionId = "b",
                    explanation = "The most radical group was the Marxists, who formed the Russian Social Democratic Labour Party in 1898."
                ),
                Question(
                    id = 10343,
                    questionNumber = 43,
                    totalQuestions = 100,
                    text = "The Russian Social Democratic Labour Party later split into the Bolsheviks and which other faction?",
                    options = listOf(
                        QuestionOption("a", "The Mensheviks"),
                        QuestionOption("b", "The Social Revolutionaries"),
                        QuestionOption("c", "The Cadets"),
                        QuestionOption("d", "The Whites")
                    ),
                    correctOptionId = "a",
                    explanation = "The RSDLP was later divided into the Bolsheviks and the Mensheviks."
                ),
                Question(
                    id = 10344,
                    questionNumber = 44,
                    totalQuestions = 100,
                    text = "What was the immediate cause of the Russian Revolution of 1905?",
                    options = listOf(
                        QuestionOption("a", "The Crimean War"),
                        QuestionOption("b", "Defeat by Japan in the Russo-Japanese War"),
                        QuestionOption("c", "The assassination of the Tsar"),
                        QuestionOption("d", "The February Revolution")
                    ),
                    correctOptionId = "b",
                    explanation = "Defeat by Japan during the Russo-Japanese War (1904-05) became the immediate cause of the 1905 Russian Revolution."
                ),
                Question(
                    id = 10345,
                    questionNumber = 45,
                    totalQuestions = 100,
                    text = "What document did Tsar Nicholas II issue after the Bloody Sunday massacre, purportedly creating a constitutional monarchy?",
                    options = listOf(
                        QuestionOption("a", "The October Manifesto"),
                        QuestionOption("b", "The Treaty of Brest-Litovsk"),
                        QuestionOption("c", "The Decree on Peace"),
                        QuestionOption("d", "The February Proclamation")
                    ),
                    correctOptionId = "a",
                    explanation = "Nicholas II was forced to issue the October Manifesto, turning Russia into a purported constitutional monarchy."
                ),
                Question(
                    id = 10346,
                    questionNumber = 46,
                    totalQuestions = 100,
                    text = "Who led the Provisional Government formed after the February Revolution, before being succeeded by Alexander Kerensky?",
                    options = listOf(
                        QuestionOption("a", "George Lvov"),
                        QuestionOption("b", "Vladimir Lenin"),
                        QuestionOption("c", "Leo Trotsky"),
                        QuestionOption("d", "Joseph Stalin")
                    ),
                    correctOptionId = "a",
                    explanation = "The Provisional Government was led by George Lvov, who was succeeded by Alexander Kerensky."
                ),
                Question(
                    id = 10347,
                    questionNumber = 47,
                    totalQuestions = 100,
                    text = "What were the popular Bolshevik slogans that helped them win support in 1917?",
                    options = listOf(
                        QuestionOption("a", "'Liberty, Equality, Fraternity'"),
                        QuestionOption("b", "'All Power to the Soviets!' and 'Peace, Land and Bread!'"),
                        QuestionOption("c", "'Workers of the World, Unite!' only"),
                        QuestionOption("d", "'Peace at Any Price'")
                    ),
                    correctOptionId = "b",
                    explanation = "The Bolsheviks held the popular slogans 'All Power to the Soviets!' and 'Peace, Land and Bread!'"
                ),
                Question(
                    id = 10348,
                    questionNumber = 48,
                    totalQuestions = 100,
                    text = "The October 1917 Revolution led by the Bolsheviks began on which date?",
                    options = listOf(
                        QuestionOption("a", "25 October 1917"),
                        QuestionOption("b", "28 February 1917"),
                        QuestionOption("c", "1 September 1917"),
                        QuestionOption("d", "3 March 1918")
                    ),
                    correctOptionId = "a",
                    explanation = "The Bolsheviks led a popular insurrection beginning on 25 October 1917."
                ),
                Question(
                    id = 10349,
                    questionNumber = 49,
                    totalQuestions = 100,
                    text = "After seizing power, the Bolshevik regime was led by Premier Lenin and which war minister?",
                    options = listOf(
                        QuestionOption("a", "Leo Trotsky"),
                        QuestionOption("b", "Joseph Stalin"),
                        QuestionOption("c", "Georgy Zhukov"),
                        QuestionOption("d", "Kliment Voroshilov")
                    ),
                    correctOptionId = "a",
                    explanation = "The Bolsheviks established a regime led by Premier Lenin and war minister Leo Trotsky."
                ),
                Question(
                    id = 10350,
                    questionNumber = 50,
                    totalQuestions = 100,
                    text = "Russia formally withdrew from World War I by signing which treaty with Germany in 1918?",
                    options = listOf(
                        QuestionOption("a", "The Treaty of Versailles"),
                        QuestionOption("b", "The Treaty of Brest-Litovsk"),
                        QuestionOption("c", "The Treaty of Frankfurt"),
                        QuestionOption("d", "The Treaty of Sèvres")
                    ),
                    correctOptionId = "b",
                    explanation = "Russia formally withdrew from WWI after signing the Treaty of Brest-Litovsk with Germany in 1918."
                ),
                Question(
                    id = 10351,
                    questionNumber = 51,
                    totalQuestions = 100,
                    text = "What economic policy did the Bolsheviks introduce in 1921 to solve mounting economic problems?",
                    options = listOf(
                        QuestionOption("a", "The Five Year Plan"),
                        QuestionOption("b", "The New Economic Policy (NEP)"),
                        QuestionOption("c", "War Communism"),
                        QuestionOption("d", "Collectivization")
                    ),
                    correctOptionId = "b",
                    explanation = "The Bolsheviks introduced the New Economic Policy (NEP) in 1921."
                ),
                Question(
                    id = 10352,
                    questionNumber = 52,
                    totalQuestions = 100,
                    text = "Who succeeded Lenin as leader of the Soviet Union after Lenin's death in 1924?",
                    options = listOf(
                        QuestionOption("a", "Leo Trotsky"),
                        QuestionOption("b", "Joseph Stalin"),
                        QuestionOption("c", "Nicholas II"),
                        QuestionOption("d", "Alexander Kerensky")
                    ),
                    correctOptionId = "b",
                    explanation = "Lenin died in 1924 and was succeeded by Joseph Stalin."
                ),
                Question(
                    id = 10353,
                    questionNumber = 53,
                    totalQuestions = 100,
                    text = "Where was the League of Nations headquartered?",
                    options = listOf(
                        QuestionOption("a", "Paris, France"),
                        QuestionOption("b", "Geneva, Switzerland"),
                        QuestionOption("c", "London, England"),
                        QuestionOption("d", "The Hague, Netherlands")
                    ),
                    correctOptionId = "b",
                    explanation = "The League of Nations was headquartered in Geneva, Switzerland."
                ),
                Question(
                    id = 10354,
                    questionNumber = 54,
                    totalQuestions = 100,
                    text = "Who proposed the idea of forming the League of Nations?",
                    options = listOf(
                        QuestionOption("a", "Georges Clemenceau"),
                        QuestionOption("b", "President Woodrow Wilson"),
                        QuestionOption("c", "David Lloyd George"),
                        QuestionOption("d", "Vittorio Orlando")
                    ),
                    correctOptionId = "b",
                    explanation = "The idea of forming the League of Nations was proposed by President Woodrow Wilson of the USA."
                ),
                Question(
                    id = 10355,
                    questionNumber = 55,
                    totalQuestions = 100,
                    text = "Which four countries were permanent members of the League of Nations' Executive Council?",
                    options = listOf(
                        QuestionOption("a", "Great Britain, France, Japan, and Italy"),
                        QuestionOption("b", "USA, Britain, France, and Germany"),
                        QuestionOption("c", "Britain, France, Russia, and the USA"),
                        QuestionOption("d", "Germany, Japan, Italy, and the USA")
                    ),
                    correctOptionId = "a",
                    explanation = "The Council consisted of four permanent members: Great Britain, France, Japan, and Italy."
                ),
                Question(
                    id = 10356,
                    questionNumber = 56,
                    totalQuestions = 100,
                    text = "Which conflict did the League of Nations successfully mediate in the early 1930s?",
                    options = listOf(
                        QuestionOption("a", "The border dispute between Colombia and Peru"),
                        QuestionOption("b", "The Italian invasion of Ethiopia"),
                        QuestionOption("c", "The Spanish Civil War"),
                        QuestionOption("d", "The Sino-Japanese War")
                    ),
                    correctOptionId = "a",
                    explanation = "In the early 1930s, the League successfully mediated a resolution to the border dispute between Colombia and Peru."
                ),
                Question(
                    id = 10357,
                    questionNumber = 57,
                    totalQuestions = 100,
                    text = "What event marked the beginning of the Great Depression?",
                    options = listOf(
                        QuestionOption("a", "The Treaty of Versailles"),
                        QuestionOption("b", "The New York Wall Street stock market crash of October 1929"),
                        QuestionOption("c", "The Russian Revolution"),
                        QuestionOption("d", "World War I armistice")
                    ),
                    correctOptionId = "b",
                    explanation = "The Great Depression began with the New York Wall Street stock market crash of October 1929."
                ),
                Question(
                    id = 10358,
                    questionNumber = 58,
                    totalQuestions = 100,
                    text = "By 1933, at the lowest point of the Great Depression, approximately how many Americans were unemployed?",
                    options = listOf(
                        QuestionOption("a", "1 million"),
                        QuestionOption("b", "5 million"),
                        QuestionOption("c", "15 million"),
                        QuestionOption("d", "30 million")
                    ),
                    correctOptionId = "c",
                    explanation = "By 1933, when the Great Depression reached its lowest point, some 15 million Americans were unemployed."
                ),
                Question(
                    id = 10359,
                    questionNumber = 59,
                    totalQuestions = 100,
                    text = "What did the Allies agree to give Italy under the secret Treaty of London (1915) but later fail to deliver?",
                    options = listOf(
                        QuestionOption("a", "Areas like Eritrea and Trieste"),
                        QuestionOption("b", "All of North Africa"),
                        QuestionOption("c", "The whole of the Balkans"),
                        QuestionOption("d", "Egypt and Sudan")
                    ),
                    correctOptionId = "a",
                    explanation = "The Allies had agreed to give Italy areas like Eritrea and Trieste and later backed out, angering Italy."
                ),
                Question(
                    id = 10360,
                    questionNumber = 60,
                    totalQuestions = 100,
                    text = "What did Mussolini claim his Fascist party alone could save Italian society from?",
                    options = listOf(
                        QuestionOption("a", "Foreign invasion"),
                        QuestionOption("b", "The danger of communism"),
                        QuestionOption("c", "Economic prosperity"),
                        QuestionOption("d", "Religious conflict")
                    ),
                    correctOptionId = "b",
                    explanation = "Mussolini claimed labour unrest was leading Italy towards communism, and only his Fascist party could save society."
                ),
                Question(
                    id = 10361,
                    questionNumber = 61,
                    totalQuestions = 100,
                    text = "What port did Mussolini persuade Yugoslavia to hand over in 1924?",
                    options = listOf(
                        QuestionOption("a", "Trieste"),
                        QuestionOption("b", "Fiume"),
                        QuestionOption("c", "Massawa"),
                        QuestionOption("d", "Assab")
                    ),
                    correctOptionId = "b",
                    explanation = "Mussolini persuaded Yugoslavia to hand over the port of Fiume, acquiring it in 1924."
                ),
                Question(
                    id = 10362,
                    questionNumber = 62,
                    totalQuestions = 100,
                    text = "Mussolini's conquest of which country in 1936 sounded a 'death knell' for the League of Nations?",
                    options = listOf(
                        QuestionOption("a", "Albania"),
                        QuestionOption("b", "Ethiopia"),
                        QuestionOption("c", "Libya"),
                        QuestionOption("d", "Spain")
                    ),
                    correctOptionId = "b",
                    explanation = "He conquered Ethiopia in 1936, which sounded a death knell of the League of Nations."
                ),
                Question(
                    id = 10363,
                    questionNumber = 63,
                    totalQuestions = 100,
                    text = "What book did Adolf Hitler write while imprisoned after his failed 1923 coup attempt?",
                    options = listOf(
                        QuestionOption("a", "Mein Kampf"),
                        QuestionOption("b", "The Communist Manifesto"),
                        QuestionOption("c", "The Prince"),
                        QuestionOption("d", "Das Kapital")
                    ),
                    correctOptionId = "a",
                    explanation = "During his imprisonment, Hitler wrote Mein Kampf, published in 1926."
                ),
                Question(
                    id = 10364,
                    questionNumber = 64,
                    totalQuestions = 100,
                    text = "Which of the following was NOT listed as a main cause of the rise of Nazism in Germany?",
                    options = listOf(
                        QuestionOption("a", "The disillusionment from war and the Peace Settlement"),
                        QuestionOption("b", "Hostile French attitude over the Ruhr and reparations"),
                        QuestionOption("c", "Weimar Republic's acceptance of unfair treaties"),
                        QuestionOption("d", "Germany's early victory in World War I")
                    ),
                    correctOptionId = "d",
                    explanation = "Germany was defeated, not victorious, in WWI; the listed causes were disillusionment, French hostility, and the Weimar Republic's weakness."
                ),
                Question(
                    id = 10365,
                    questionNumber = 65,
                    totalQuestions = 100,
                    text = "Which country did Japan invade in 1931, later withdrawing from the League of Nations after condemnation?",
                    options = listOf(
                        QuestionOption("a", "Korea"),
                        QuestionOption("b", "Manchuria"),
                        QuestionOption("c", "Mongolia"),
                        QuestionOption("d", "Taiwan")
                    ),
                    correctOptionId = "b",
                    explanation = "In 1931 Japan invaded Manchuria, and when the League condemned this aggression, Japan withdrew from the League in 1933."
                ),
                Question(
                    id = 10366,
                    questionNumber = 66,
                    totalQuestions = 100,
                    text = "What agreement in March 1938 saw Hitler incorporate Austria under the pretext of uniting Austrian Germans with Germany?",
                    options = listOf(
                        QuestionOption("a", "The Munich Deal"),
                        QuestionOption("b", "Anschluss"),
                        QuestionOption("c", "The Nazi-Soviet Pact"),
                        QuestionOption("d", "The Treaty of Versailles")
                    ),
                    correctOptionId = "b",
                    explanation = "In March 1938, Hitler incorporated Austria in what was called the Anschluss."
                ),
                Question(
                    id = 10367,
                    questionNumber = 67,
                    totalQuestions = 100,
                    text = "What event on September 1, 1939, marked the beginning of World War II?",
                    options = listOf(
                        QuestionOption("a", "The German invasion of Poland"),
                        QuestionOption("b", "The attack on Pearl Harbor"),
                        QuestionOption("c", "The German invasion of France"),
                        QuestionOption("d", "The Battle of Britain")
                    ),
                    correctOptionId = "a",
                    explanation = "Germany invaded Poland on 1 September 1939, marking the beginning of World War II."
                ),
                Question(
                    id = 10368,
                    questionNumber = 68,
                    totalQuestions = 100,
                    text = "The Allied Powers of WWII mainly consisted of which countries?",
                    options = listOf(
                        QuestionOption("a", "France, Britain, the USA, and the USSR"),
                        QuestionOption("b", "Germany, Japan, and Italy"),
                        QuestionOption("c", "Britain, Germany, and France"),
                        QuestionOption("d", "Japan, the USA, and Germany")
                    ),
                    correctOptionId = "a",
                    explanation = "The Allied Powers consisted mainly of France, Britain, the USA (from December 1941), and the USSR."
                ),
                Question(
                    id = 10369,
                    questionNumber = 69,
                    totalQuestions = 100,
                    text = "What event in December 1941 led the USA to declare war on Japan?",
                    options = listOf(
                        QuestionOption("a", "The invasion of Poland"),
                        QuestionOption("b", "The attack on Pearl Harbor"),
                        QuestionOption("c", "The fall of France"),
                        QuestionOption("d", "The Battle of Stalingrad")
                    ),
                    correctOptionId = "b",
                    explanation = "Japan attacked the US naval base at Pearl Harbor in December 1941, leading the USA to declare war on Japan."
                ),
                Question(
                    id = 10370,
                    questionNumber = 70,
                    totalQuestions = 100,
                    text = "What decisive battles in 1942-43 marked the beginning of the Allied counter-offensive against Germany in Europe?",
                    options = listOf(
                        QuestionOption("a", "Stalingrad and Kursk"),
                        QuestionOption("b", "Normandy and the Marne"),
                        QuestionOption("c", "El Alamein and Tobruk"),
                        QuestionOption("d", "Verdun and the Somme")
                    ),
                    correctOptionId = "a",
                    explanation = "The victories at the Battles of Stalingrad (1942/3) and Kursk (1943) marked the beginning of the Allied counter-offensive."
                ),
                Question(
                    id = 10371,
                    questionNumber = 71,
                    totalQuestions = 100,
                    text = "The Triple Alliance, formed in 1882, comprised Germany, Austria-Hungary, and _______.",
                    options = emptyList(),
                    correctOptionId = "Italy",
                    explanation = "The Triple Alliance, formed in 1882, comprised Germany, Austria-Hungary and Italy.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10372,
                    questionNumber = 72,
                    totalQuestions = 100,
                    text = "Archduke Franz Ferdinand was assassinated at _______, the capital of Bosnia, on June 28, 1914.",
                    options = emptyList(),
                    correctOptionId = "Sarajevo",
                    explanation = "Franz Ferdinand was assassinated at Sarajevo, capital of Bosnia, part of Austria-Hungary.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10373,
                    questionNumber = 73,
                    totalQuestions = 100,
                    text = "The German war plan devised by Count Alfred von _______ proposed attacking France through Belgium.",
                    options = emptyList(),
                    correctOptionId = "Schlieffen",
                    explanation = "The Schlieffen Plan was devised by Count Alfred von Schlieffen.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10374,
                    questionNumber = 74,
                    totalQuestions = 100,
                    text = "The German advance was halted at the Battle of the _______ in September 1914.",
                    options = emptyList(),
                    correctOptionId = "Marne",
                    explanation = "The Germans' attack was forced back at the Battle of the Marne in September 1914.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10375,
                    questionNumber = 75,
                    totalQuestions = 100,
                    text = "The _______ Telegram promised Mexico US territory in return for support against America.",
                    options = emptyList(),
                    correctOptionId = "Zimmermann",
                    explanation = "The Zimmermann Telegram promised Mexico areas of the southwestern United States.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10376,
                    questionNumber = 76,
                    totalQuestions = 100,
                    text = "The United States declared war on Germany on April 6, _______.",
                    options = emptyList(),
                    correctOptionId = "1917",
                    explanation = "The US declared war on Germany on April 6, 1917.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10377,
                    questionNumber = 77,
                    totalQuestions = 100,
                    text = "The deadly influenza pandemic of 1918-19, spread by the movement of soldiers, was called the _______ flu.",
                    options = emptyList(),
                    correctOptionId = "Spanish",
                    explanation = "The Spanish flu of 1918-19 was spread by the mass movement of soldiers and refugees.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10378,
                    questionNumber = 78,
                    totalQuestions = 100,
                    text = "The Treaty of _______ was signed between Germany and the Allied Powers on June 28, 1919.",
                    options = emptyList(),
                    correctOptionId = "Versailles",
                    explanation = "The Treaty of Versailles was signed on June 28, 1919.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10379,
                    questionNumber = 79,
                    totalQuestions = 100,
                    text = "The Russian Social Democratic Labour Party split into the Bolsheviks and the _______.",
                    options = emptyList(),
                    correctOptionId = "Mensheviks",
                    explanation = "The RSDLP was later divided into the Bolsheviks and the Mensheviks.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10380,
                    questionNumber = 80,
                    totalQuestions = 100,
                    text = "The Bolsheviks (majority faction) were led by _______, whose real name was Vladimir Ilich Ulyanov.",
                    options = emptyList(),
                    correctOptionId = "Lenin",
                    explanation = "The Bolsheviks were led by Lenin, whose real name was Vladimir Ilich Ulyanov.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10381,
                    questionNumber = 81,
                    totalQuestions = 100,
                    text = "Serfdom was abolished in Russia in the year _______.",
                    options = emptyList(),
                    correctOptionId = "1861",
                    explanation = "Serfdom was abolished in Russia in 1861.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10382,
                    questionNumber = 82,
                    totalQuestions = 100,
                    text = "Defeat by Japan in the Russo-Japanese War (1904-05) was the immediate cause of the Russian Revolution of _______.",
                    options = emptyList(),
                    correctOptionId = "1905",
                    explanation = "Defeat by Japan became the immediate cause of the Russian Revolution of 1905.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10383,
                    questionNumber = 83,
                    totalQuestions = 100,
                    text = "The _______ Revolution of February 1917 ended the rule of the Romanov Dynasty.",
                    options = emptyList(),
                    correctOptionId = "February",
                    explanation = "The February Revolution of 1917 ended the rule of the Romanov Dynasty.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10384,
                    questionNumber = 84,
                    totalQuestions = 100,
                    text = "The October 1917 Revolution began on 25 October 1917 and was led by the _______.",
                    options = emptyList(),
                    correctOptionId = "Bolsheviks",
                    explanation = "The Bolsheviks led a popular insurrection beginning on 25 October 1917.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10385,
                    questionNumber = 85,
                    totalQuestions = 100,
                    text = "Russia withdrew from WWI by signing the Treaty of _______ with Germany in 1918.",
                    options = emptyList(),
                    correctOptionId = "Brest-Litovsk",
                    explanation = "Russia formally withdrew from WWI after signing the Treaty of Brest-Litovsk with Germany in 1918.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10386,
                    questionNumber = 86,
                    totalQuestions = 100,
                    text = "The Bolsheviks introduced the New Economic Policy, abbreviated _______, in 1921.",
                    options = emptyList(),
                    correctOptionId = "NEP",
                    explanation = "The Bolsheviks introduced the New Economic Policy (NEP) in 1921.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10387,
                    questionNumber = 87,
                    totalQuestions = 100,
                    text = "Lenin died in 1924 and was succeeded by _______.",
                    options = emptyList(),
                    correctOptionId = "Joseph Stalin",
                    explanation = "Lenin died in 1924 and was succeeded by Joseph Stalin.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10388,
                    questionNumber = 88,
                    totalQuestions = 100,
                    text = "The League of Nations was founded on January 10, _______.",
                    options = emptyList(),
                    correctOptionId = "1920",
                    explanation = "The League of Nations was founded on January 10, 1920.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10389,
                    questionNumber = 89,
                    totalQuestions = 100,
                    text = "The idea of forming the League of Nations was proposed by President _______ of the USA.",
                    options = emptyList(),
                    correctOptionId = "Woodrow Wilson",
                    explanation = "The idea of forming the League of Nations was proposed by President Woodrow Wilson.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10390,
                    questionNumber = 90,
                    totalQuestions = 100,
                    text = "The Great Depression began with the Wall Street stock market crash of October _______.",
                    options = emptyList(),
                    correctOptionId = "1929",
                    explanation = "The Great Depression began with the Wall Street stock market crash of October 1929.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10391,
                    questionNumber = 91,
                    totalQuestions = 100,
                    text = "Benito Mussolini formed his Fascist party in the year _______.",
                    options = emptyList(),
                    correctOptionId = "1919",
                    explanation = "Benito Mussolini had formed his Fascist party in 1919.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10392,
                    questionNumber = 92,
                    totalQuestions = 100,
                    text = "A Fascist State was established in Italy in the year _______.",
                    options = emptyList(),
                    correctOptionId = "1922",
                    explanation = "A Fascist State was established in Italy in 1922.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10393,
                    questionNumber = 93,
                    totalQuestions = 100,
                    text = "Nazis came to power in Germany in the year _______.",
                    options = emptyList(),
                    correctOptionId = "1933",
                    explanation = "Nazis came into power in Germany in 1933.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10394,
                    questionNumber = 94,
                    totalQuestions = 100,
                    text = "Hitler wrote his autobiography, _______, while imprisoned after his failed 1923 coup.",
                    options = emptyList(),
                    correctOptionId = "Mein Kampf",
                    explanation = "During his imprisonment, Hitler wrote Mein Kampf, published in 1926.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10395,
                    questionNumber = 95,
                    totalQuestions = 100,
                    text = "Japan invaded _______, a northern province of China, in 1931.",
                    options = emptyList(),
                    correctOptionId = "Manchuria",
                    explanation = "In 1931 Japan invaded Manchuria, a northern province of China.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10396,
                    questionNumber = 96,
                    totalQuestions = 100,
                    text = "Fascist Italy invaded Ethiopia in the month of _______ 1935.",
                    options = emptyList(),
                    correctOptionId = "October",
                    explanation = "Fascist Italy invaded Ethiopia in October 1935.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10397,
                    questionNumber = 97,
                    totalQuestions = 100,
                    text = "Germany invaded Poland on 1 September _______, marking the start of World War II.",
                    options = emptyList(),
                    correctOptionId = "1939",
                    explanation = "Germany invaded Poland on 1 September 1939, marking the beginning of World War II.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10398,
                    questionNumber = 98,
                    totalQuestions = 100,
                    text = "Adolf Hitler committed suicide on 30 April _______.",
                    options = emptyList(),
                    correctOptionId = "1945",
                    explanation = "Adolf Hitler committed suicide on 30 April 1945.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10399,
                    questionNumber = 99,
                    totalQuestions = 100,
                    text = "The USA dropped atomic bombs on the Japanese cities of Hiroshima and _______ in August 1945.",
                    options = emptyList(),
                    correctOptionId = "Nagasaki",
                    explanation = "The USA dropped atomic bombs on Hiroshima and Nagasaki on the 6th and 9th of August 1945.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10400,
                    questionNumber = 100,
                    totalQuestions = 100,
                    text = "After WWII, the United Nations Organization (UNO) replaced the League of _______.",
                    options = emptyList(),
                    correctOptionId = "Nations",
                    explanation = "The United Nations Organization was formed after WWII, replacing the League of Nations.",
                    type = QuestionType.FILL_IN_THE_BLANK
                )
            )
        ),
        "hist_u5" to Quiz(
            id = "quiz_history_u5_full",
            title = "Global and Regional Developments Since 1945 Quiz",
            subject = "History",
            durationMinutes = 45,
            gradeLevel = "Grade 10",
            iconName = "pillar",
            unitId = "hist_u5",
            subjectId = "history",
            questions = listOf(
                Question(
                    id = 10401,
                    questionNumber = 1,
                    totalQuestions = 100,
                    text = "The United Nations was established in 1945.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The United Nations is a global organization that was established in 1945."
                ),
                Question(
                    id = 10402,
                    questionNumber = 2,
                    totalQuestions = 100,
                    text = "The League of Nations was the predecessor of the United Nations.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The predecessor of the United Nations was the League of Nations."
                ),
                Question(
                    id = 10403,
                    questionNumber = 3,
                    totalQuestions = 100,
                    text = "The UN Security Council has five permanent members with veto power.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The Security Council comprises five permanent members: US, Britain, France, Russia and China, with veto power."
                ),
                Question(
                    id = 10404,
                    questionNumber = 4,
                    totalQuestions = 100,
                    text = "Arabic was one of the original five official languages chosen when the UN was founded.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "Five languages were chosen at founding; Arabic was added later, in 1973."
                ),
                Question(
                    id = 10405,
                    questionNumber = 5,
                    totalQuestions = 100,
                    text = "The Charter of the United Nations was signed in San Francisco in June 1945.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The 50 nations represented in San Francisco signed the Charter of the United Nations on June 26, 1945."
                ),
                Question(
                    id = 10406,
                    questionNumber = 6,
                    totalQuestions = 100,
                    text = "The International Court of Justice is seated in The Hague, Netherlands.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The seat of the International Court of Justice is in The Hague, Netherlands."
                ),
                Question(
                    id = 10407,
                    questionNumber = 7,
                    totalQuestions = 100,
                    text = "The United States was the sole superpower possessing atomic weapons immediately after WWII.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The United States was the sole superpower that possessed atomic weapons after bombing Hiroshima and Nagasaki in 1945."
                ),
                Question(
                    id = 10408,
                    questionNumber = 8,
                    totalQuestions = 100,
                    text = "The term 'Iron Curtain' was coined by Winston Churchill in a 1946 speech in Fulton, Missouri.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The term Iron Curtain was coined by Winston Churchill in 1946 during his speech in Fulton, Missouri."
                ),
                Question(
                    id = 10409,
                    questionNumber = 9,
                    totalQuestions = 100,
                    text = "The Truman Doctrine was issued in March 1947 to help countries threatened by communism.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The United States issued the Truman Doctrine in March 1947, resolved to stop communism's spread."
                ),
                Question(
                    id = 10410,
                    questionNumber = 10,
                    totalQuestions = 100,
                    text = "George Kennan was the architect of the Containment Doctrine.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "George Kennan was the architect of the Containment Doctrine."
                ),
                Question(
                    id = 10411,
                    questionNumber = 11,
                    totalQuestions = 100,
                    text = "The Marshall Plan raised \$17 billion for the economic and technical assistance of 16 European countries.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The USA raised \$17 billion for the economic and technical assistance of 16 European countries under the Marshall Plan."
                ),
                Question(
                    id = 10412,
                    questionNumber = 12,
                    totalQuestions = 100,
                    text = "The Soviet Union welcomed and fully participated in the Marshall Plan.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "Stalin denounced the Marshall Plan as 'Dollar Imperialism' and banned Soviet satellites from joining it."
                ),
                Question(
                    id = 10413,
                    questionNumber = 13,
                    totalQuestions = 100,
                    text = "The Berlin Blockade lasted from June 1948 to May 1949.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The Berlin Blockade lasted from 24 June 1948 to 12 May 1949."
                ),
                Question(
                    id = 10414,
                    questionNumber = 14,
                    totalQuestions = 100,
                    text = "NATO was founded in April 1949.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The North Atlantic Treaty Organization (NATO) was founded in April 1949."
                ),
                Question(
                    id = 10415,
                    questionNumber = 15,
                    totalQuestions = 100,
                    text = "The Warsaw Pact was formed by Eastern European communist countries in May 1955.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "In May 1955, the Soviet government held a meeting that formed the Warsaw Pact military bloc."
                ),
                Question(
                    id = 10416,
                    questionNumber = 16,
                    totalQuestions = 100,
                    text = "The Soviet Union launched the first earth satellite, Sputnik, in October 1957.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "On 4 October 1957, the Soviets launched the first earth satellite known as Sputnik."
                ),
                Question(
                    id = 10417,
                    questionNumber = 17,
                    totalQuestions = 100,
                    text = "The People's Republic of China was formed in October 1949 after the Chinese Communist Party won the civil war.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "In October 1949, the People's Republic of China was formed by the Chinese Communists."
                ),
                Question(
                    id = 10418,
                    questionNumber = 18,
                    totalQuestions = 100,
                    text = "Korea was divided at the 38th parallel between Soviet and American occupation zones after WWII.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The Soviet Union occupied northern Korea and the US occupied southern Korea, divided at the 38th parallel."
                ),
                Question(
                    id = 10419,
                    questionNumber = 19,
                    totalQuestions = 100,
                    text = "A peace treaty ending the Korean War was signed at Panmunjom in 1953.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "In 1953 a peace treaty was signed at Panmunjom that ended the Korean War."
                ),
                Question(
                    id = 10420,
                    questionNumber = 20,
                    totalQuestions = 100,
                    text = "The French forces were defeated by the Viet Minh at the Battle of Dien Bien Phu in 1954.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The French forces were defeated by the Viet Minh at the Battle of Dien Bien Phu on 7 May 1954."
                ),
                Question(
                    id = 10421,
                    questionNumber = 21,
                    totalQuestions = 100,
                    text = "The Socialist Republic of Vietnam was formally established in 1976, with Saigon renamed Ho Chi Minh City.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The Socialist Republic of Vietnam was formally established on July 2, 1976, and Saigon was renamed Ho Chi Minh City."
                ),
                Question(
                    id = 10422,
                    questionNumber = 22,
                    totalQuestions = 100,
                    text = "The Non-Aligned Movement's basic concept originated at the 1955 Bandung Conference in Indonesia.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The basic concept for NAM originated in 1955 during the Asia-Africa Bandung Conference held in Indonesia."
                ),
                Question(
                    id = 10423,
                    questionNumber = 23,
                    totalQuestions = 100,
                    text = "The Balfour Declaration of 1917 saw British support for a Jewish homeland in Palestine.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "In 1917 the British supported the establishment of a Jewish homeland in Palestine, known as the Balfour Declaration."
                ),
                Question(
                    id = 10424,
                    questionNumber = 24,
                    totalQuestions = 100,
                    text = "The state of Israel was proclaimed on May 14, 1948.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The Jews partially accepted the UN plan and proclaimed the establishment of the state of Israel on May 14, 1948."
                ),
                Question(
                    id = 10425,
                    questionNumber = 25,
                    totalQuestions = 100,
                    text = "The 1948 Arab-Israeli War is remembered in the Arab world as the Nakbah (Catastrophe).",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "In the Arab world, the 1948 war came to be known as the Nakbah (Catastrophe)."
                ),
                Question(
                    id = 10426,
                    questionNumber = 26,
                    totalQuestions = 100,
                    text = "The Six-Day War of 1967 resulted in Israel controlling the Golan Heights, Jerusalem, the West Bank, Gaza, and Sinai.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The war resulted in Israel controlling the Golan Heights, Jerusalem, the West Bank, the Gaza Strip, and the Sinai."
                ),
                Question(
                    id = 10427,
                    questionNumber = 27,
                    totalQuestions = 100,
                    text = "Mikhail Gorbachev introduced the reforms glasnost and perestroika.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Gorbachev introduced two bold reforms called glasnost and perestroika."
                ),
                Question(
                    id = 10428,
                    questionNumber = 28,
                    totalQuestions = 100,
                    text = "Fifteen sovereign states emerged from the collapse of the USSR in 1991.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "In 1991, fifteen sovereign states emerged from the collapse of the USSR."
                ),
                Question(
                    id = 10429,
                    questionNumber = 29,
                    totalQuestions = 100,
                    text = "All Eastern European communist regimes were overthrown by peaceful methods in 1989, without exception.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "All overthrew their communist regime by peaceful methods except Romania, where the revolution was violent."
                ),
                Question(
                    id = 10430,
                    questionNumber = 30,
                    totalQuestions = 100,
                    text = "The Cold War was primarily a conflict between the Soviet Union and its allies, and the USA and its western allies.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The Cold War was continuing political conflict, military tension, and competition primarily between the USSR/its allies and the USA/its western allies."
                ),
                Question(
                    id = 10431,
                    questionNumber = 31,
                    totalQuestions = 100,
                    text = "How many official languages does the United Nations have?",
                    options = listOf(
                        QuestionOption("a", "Four"),
                        QuestionOption("b", "Five"),
                        QuestionOption("c", "Six"),
                        QuestionOption("d", "Seven")
                    ),
                    correctOptionId = "c",
                    explanation = "The UN has six official languages: Arabic, Chinese, English, French, Russian and Spanish."
                ),
                Question(
                    id = 10432,
                    questionNumber = 32,
                    totalQuestions = 100,
                    text = "Which language was added to the UN's official languages in 1973?",
                    options = listOf(
                        QuestionOption("a", "Spanish"),
                        QuestionOption("b", "Russian"),
                        QuestionOption("c", "Arabic"),
                        QuestionOption("d", "Portuguese")
                    ),
                    correctOptionId = "c",
                    explanation = "Arabic was added as an official UN language in 1973."
                ),
                Question(
                    id = 10433,
                    questionNumber = 33,
                    totalQuestions = 100,
                    text = "How many original signatories brought the UN Charter total to in 1945, after Poland signed?",
                    options = listOf(
                        QuestionOption("a", "50"),
                        QuestionOption("b", "51"),
                        QuestionOption("c", "63"),
                        QuestionOption("d", "193")
                    ),
                    correctOptionId = "b",
                    explanation = "The 50 nations at San Francisco plus Poland brought the total of original signatories to 51."
                ),
                Question(
                    id = 10434,
                    questionNumber = 34,
                    totalQuestions = 100,
                    text = "Which UN organ is described as the most powerful body, with five permanent veto-wielding members?",
                    options = listOf(
                        QuestionOption("a", "The General Assembly"),
                        QuestionOption("b", "The Security Council"),
                        QuestionOption("c", "The Secretariat"),
                        QuestionOption("d", "The Trusteeship Council")
                    ),
                    correctOptionId = "b",
                    explanation = "The Security Council is charged with maintaining peace and security and is the most powerful body of the UNO."
                ),
                Question(
                    id = 10435,
                    questionNumber = 35,
                    totalQuestions = 100,
                    text = "Who were the five permanent members of the UN Security Council?",
                    options = listOf(
                        QuestionOption("a", "US, Britain, France, Russia, and China"),
                        QuestionOption("b", "US, Germany, Japan, Italy, and Britain"),
                        QuestionOption("c", "US, Britain, India, China, and France"),
                        QuestionOption("d", "Russia, China, Germany, Japan, and the US")
                    ),
                    correctOptionId = "a",
                    explanation = "The Security Council's five permanent members are the United States, Britain, France, Russia and China."
                ),
                Question(
                    id = 10436,
                    questionNumber = 36,
                    totalQuestions = 100,
                    text = "What is the last Trust Territory to attain independence under the UN Trusteeship system, by 1994?",
                    options = listOf(
                        QuestionOption("a", "Palau"),
                        QuestionOption("b", "Namibia"),
                        QuestionOption("c", "East Timor"),
                        QuestionOption("d", "Micronesia")
                    ),
                    correctOptionId = "a",
                    explanation = "By 1994, all Trust Territories had attained independence; the last to do so was Palau."
                ),
                Question(
                    id = 10437,
                    questionNumber = 37,
                    totalQuestions = 100,
                    text = "Where is the seat of the International Court of Justice?",
                    options = listOf(
                        QuestionOption("a", "Geneva, Switzerland"),
                        QuestionOption("b", "New York, USA"),
                        QuestionOption("c", "The Hague, Netherlands"),
                        QuestionOption("d", "Vienna, Austria")
                    ),
                    correctOptionId = "c",
                    explanation = "The seat of the International Court of Justice is in The Hague, Netherlands."
                ),
                Question(
                    id = 10438,
                    questionNumber = 38,
                    totalQuestions = 100,
                    text = "What was the term coined by Winston Churchill to describe the political and ideological barrier dividing Europe?",
                    options = listOf(
                        QuestionOption("a", "The Berlin Wall"),
                        QuestionOption("b", "The Iron Curtain"),
                        QuestionOption("c", "The Warsaw Line"),
                        QuestionOption("d", "The Maginot Line")
                    ),
                    correctOptionId = "b",
                    explanation = "The term Iron Curtain was coined by Winston Churchill in 1946 during his speech in Fulton, Missouri."
                ),
                Question(
                    id = 10439,
                    questionNumber = 39,
                    totalQuestions = 100,
                    text = "Which policy did the United States adopt to stop or slow the expansion of communism?",
                    options = listOf(
                        QuestionOption("a", "The Marshall Plan"),
                        QuestionOption("b", "Containment"),
                        QuestionOption("c", "The Domino Theory"),
                        QuestionOption("d", "Vietnamization")
                    ),
                    correctOptionId = "b",
                    explanation = "The United States adopted a new strategy known as Containment to stop or slow the expansion of communism."
                ),
                Question(
                    id = 10440,
                    questionNumber = 40,
                    totalQuestions = 100,
                    text = "Who was the architect of the Containment Doctrine?",
                    options = listOf(
                        QuestionOption("a", "George Marshall"),
                        QuestionOption("b", "George Kennan"),
                        QuestionOption("c", "Harry Truman"),
                        QuestionOption("d", "Winston Churchill")
                    ),
                    correctOptionId = "b",
                    explanation = "George Kennan was the architect of the Containment Doctrine."
                ),
                Question(
                    id = 10441,
                    questionNumber = 41,
                    totalQuestions = 100,
                    text = "What was the primary aim of the Marshall Plan besides stopping communism?",
                    options = listOf(
                        QuestionOption("a", "To help European economies recover and provide a market for American goods"),
                        QuestionOption("b", "To fund the Korean War"),
                        QuestionOption("c", "To finance the Berlin Wall"),
                        QuestionOption("d", "To rebuild Japan's economy")
                    ),
                    correctOptionId = "a",
                    explanation = "Aims of the Marshall Plan included helping European economies recover and providing a market for American goods."
                ),
                Question(
                    id = 10442,
                    questionNumber = 42,
                    totalQuestions = 100,
                    text = "What was the Soviet response to the Marshall Plan, providing aid to Eastern European satellites?",
                    options = listOf(
                        QuestionOption("a", "The Warsaw Pact"),
                        QuestionOption("b", "The Molotov Plan"),
                        QuestionOption("c", "The Comintern"),
                        QuestionOption("d", "Sputnik")
                    ),
                    correctOptionId = "b",
                    explanation = "The Soviet response to the Marshall Plan was known as the Molotov Plan, named after the Russian foreign minister."
                ),
                Question(
                    id = 10443,
                    questionNumber = 43,
                    totalQuestions = 100,
                    text = "What crisis, lasting from June 1948 to May 1949, was one of the Cold War's first major international incidents?",
                    options = listOf(
                        QuestionOption("a", "The Cuban Missile Crisis"),
                        QuestionOption("b", "The Berlin Blockade"),
                        QuestionOption("c", "The Suez Crisis"),
                        QuestionOption("d", "The Korean War")
                    ),
                    correctOptionId = "b",
                    explanation = "The Berlin Blockade, lasting from 24 June 1948 to 12 May 1949, was one of the Cold War's first significant crises."
                ),
                Question(
                    id = 10444,
                    questionNumber = 44,
                    totalQuestions = 100,
                    text = "How did the United States and its allies respond to the Berlin Blockade?",
                    options = listOf(
                        QuestionOption("a", "They launched a military attack on the Soviet zone"),
                        QuestionOption("b", "They organized the Berlin Airlift to supply West Berlin"),
                        QuestionOption("c", "They abandoned West Berlin"),
                        QuestionOption("d", "They signed a peace treaty with Stalin")
                    ),
                    correctOptionId = "b",
                    explanation = "The US and other nations launched the large 'Berlin airlift' to supply West Berlin with food and supplies."
                ),
                Question(
                    id = 10445,
                    questionNumber = 45,
                    totalQuestions = 100,
                    text = "NATO was founded in April 1949 and signed by how many nations?",
                    options = listOf(
                        QuestionOption("a", "8"),
                        QuestionOption("b", "10"),
                        QuestionOption("c", "12"),
                        QuestionOption("d", "15")
                    ),
                    correctOptionId = "c",
                    explanation = "NATO was founded in April 1949 and signed by 12 nations."
                ),
                Question(
                    id = 10446,
                    questionNumber = 46,
                    totalQuestions = 100,
                    text = "The Warsaw Pact, formed in May 1955, was a military bloc of which group of countries?",
                    options = listOf(
                        QuestionOption("a", "Western European democracies"),
                        QuestionOption("b", "Eastern European communist bloc countries"),
                        QuestionOption("c", "Non-Aligned nations"),
                        QuestionOption("d", "Latin American states")
                    ),
                    correctOptionId = "b",
                    explanation = "The Warsaw Pact was formed by representatives of the governments of the Eastern Europe communist bloc."
                ),
                Question(
                    id = 10447,
                    questionNumber = 47,
                    totalQuestions = 100,
                    text = "What event in 1949 initiated the Cold War nuclear arms race?",
                    options = listOf(
                        QuestionOption("a", "The US hydrogen bomb test"),
                        QuestionOption("b", "The Soviet Union's launch of an atomic weapon"),
                        QuestionOption("c", "The launch of Sputnik"),
                        QuestionOption("d", "The Korean War")
                    ),
                    correctOptionId = "b",
                    explanation = "The Soviet Union launched an atomic weapon in 1949, initiating the Cold War nuclear arms race."
                ),
                Question(
                    id = 10448,
                    questionNumber = 48,
                    totalQuestions = 100,
                    text = "What did the Soviets launch on 4 October 1957 that marked a milestone in the arms/space race?",
                    options = listOf(
                        QuestionOption("a", "The first ICBM"),
                        QuestionOption("b", "Sputnik, the first earth satellite"),
                        QuestionOption("c", "The first hydrogen bomb"),
                        QuestionOption("d", "The Atlas missile")
                    ),
                    correctOptionId = "b",
                    explanation = "On 4 October 1957, the Soviets launched the first earth satellite known as Sputnik."
                ),
                Question(
                    id = 10449,
                    questionNumber = 49,
                    totalQuestions = 100,
                    text = "Who established the People's Republic of China in October 1949?",
                    options = listOf(
                        QuestionOption("a", "Chiang Kai-shek"),
                        QuestionOption("b", "Mao Tse Tung (Mao Zedong)"),
                        QuestionOption("c", "Ho Chi Minh"),
                        QuestionOption("d", "Kim Il Sung")
                    ),
                    correctOptionId = "b",
                    explanation = "In October 1949, the People's Republic of China was formed by the Chinese Communists led by Mao Tse Tung."
                ),
                Question(
                    id = 10450,
                    questionNumber = 50,
                    totalQuestions = 100,
                    text = "After the Chinese Communist victory, where did the Kuomintang government flee?",
                    options = listOf(
                        QuestionOption("a", "Hong Kong"),
                        QuestionOption("b", "Taiwan (Formosa)"),
                        QuestionOption("c", "Korea"),
                        QuestionOption("d", "Japan")
                    ),
                    correctOptionId = "b",
                    explanation = "The Chinese Communists forced the Kuomintang government to flee to Taiwan (Formosa)."
                ),
                Question(
                    id = 10451,
                    questionNumber = 51,
                    totalQuestions = 100,
                    text = "Korea was divided along which parallel of latitude after WWII?",
                    options = listOf(
                        QuestionOption("a", "17th parallel"),
                        QuestionOption("b", "38th parallel"),
                        QuestionOption("c", "49th parallel"),
                        QuestionOption("d", "25th parallel")
                    ),
                    correctOptionId = "b",
                    explanation = "The dividing line between Soviet and American occupation zones in Korea was the 38th parallel."
                ),
                Question(
                    id = 10452,
                    questionNumber = 52,
                    totalQuestions = 100,
                    text = "Who was the first president of the Republic of Korea (South Korea), formed in 1948?",
                    options = listOf(
                        QuestionOption("a", "Kim Il Sung"),
                        QuestionOption("b", "Syngman Rhee"),
                        QuestionOption("c", "Chiang Kai-shek"),
                        QuestionOption("d", "Ho Chi Minh")
                    ),
                    correctOptionId = "b",
                    explanation = "In 1948, the Republic of Korea was formed in South Korea with Syngman Rhee as president."
                ),
                Question(
                    id = 10453,
                    questionNumber = 53,
                    totalQuestions = 100,
                    text = "What organization was formed in 1954 as a branch of NATO in Southeast Asia, largely as a result of the Korean War?",
                    options = listOf(
                        QuestionOption("a", "ASEAN"),
                        QuestionOption("b", "SEATO"),
                        QuestionOption("c", "NAM"),
                        QuestionOption("d", "the Warsaw Pact")
                    ),
                    correctOptionId = "b",
                    explanation = "SEATO (South East Asia Treaty Organization) was formed in 1954 as a branch of NATO in Asia."
                ),
                Question(
                    id = 10454,
                    questionNumber = 54,
                    totalQuestions = 100,
                    text = "Who led the Vietnamese communist independence movement known as Viet Minh?",
                    options = listOf(
                        QuestionOption("a", "Ho Chi Minh"),
                        QuestionOption("b", "Ngo Dinh Diem"),
                        QuestionOption("c", "Mao Tse Tung"),
                        QuestionOption("d", "Kim Il Sung")
                    ),
                    correctOptionId = "a",
                    explanation = "The people of Vietnam were led by the communist Ho Chi Minh, who established the Viet Minh."
                ),
                Question(
                    id = 10455,
                    questionNumber = 55,
                    totalQuestions = 100,
                    text = "At which battle did the French forces suffer a decisive defeat by the Viet Minh in 1954?",
                    options = listOf(
                        QuestionOption("a", "Dien Bien Phu"),
                        QuestionOption("b", "Hanoi"),
                        QuestionOption("c", "Saigon"),
                        QuestionOption("d", "Da Nang")
                    ),
                    correctOptionId = "a",
                    explanation = "The French forces were defeated by the Viet Minh at the Battle of Dien Bien Phu on 7 May 1954."
                ),
                Question(
                    id = 10456,
                    questionNumber = 56,
                    totalQuestions = 100,
                    text = "Following the Geneva Accords of 1954, Vietnam was divided at which parallel?",
                    options = listOf(
                        QuestionOption("a", "The 17th parallel"),
                        QuestionOption("b", "The 38th parallel"),
                        QuestionOption("c", "The 25th parallel"),
                        QuestionOption("d", "The 49th parallel")
                    ),
                    correctOptionId = "a",
                    explanation = "The North and South Vietnam were separated at the 17th parallel following the Geneva Accords."
                ),
                Question(
                    id = 10457,
                    questionNumber = 57,
                    totalQuestions = 100,
                    text = "What US theory described the concern that if communism was not stopped in one country, it would spread to neighboring countries?",
                    options = listOf(
                        QuestionOption("a", "The Domino Theory"),
                        QuestionOption("b", "Containment"),
                        QuestionOption("c", "Vietnamization"),
                        QuestionOption("d", "The Truman Doctrine")
                    ),
                    correctOptionId = "a",
                    explanation = "The US used the term Domino Theory to describe growing concern over communist influence spreading in Indochina."
                ),
                Question(
                    id = 10458,
                    questionNumber = 58,
                    totalQuestions = 100,
                    text = "What strategy, introduced during the Nixon administration, aimed to transfer military responsibility to South Vietnam?",
                    options = listOf(
                        QuestionOption("a", "Rolling Thunder"),
                        QuestionOption("b", "The Strategic Hamlet program"),
                        QuestionOption("c", "Vietnamization"),
                        QuestionOption("d", "The Domino Theory")
                    ),
                    correctOptionId = "c",
                    explanation = "Vietnamization aimed to reduce American involvement by transferring all military responsibilities to South Vietnam."
                ),
                Question(
                    id = 10459,
                    questionNumber = 59,
                    totalQuestions = 100,
                    text = "Where was the basic concept for the Non-Aligned Movement first developed in 1955?",
                    options = listOf(
                        QuestionOption("a", "The Bandung Conference in Indonesia"),
                        QuestionOption("b", "The Belgrade Conference in Yugoslavia"),
                        QuestionOption("c", "The Havana Conference in Cuba"),
                        QuestionOption("d", "The Geneva Conference in Switzerland")
                    ),
                    correctOptionId = "a",
                    explanation = "The basic concept for NAM originated in 1955 during the Asia-Africa Bandung Conference held in Indonesia."
                ),
                Question(
                    id = 10460,
                    questionNumber = 60,
                    totalQuestions = 100,
                    text = "Where was the first Non-Aligned Movement Conference held, in September 1961?",
                    options = listOf(
                        QuestionOption("a", "Cairo, Egypt"),
                        QuestionOption("b", "New Delhi, India"),
                        QuestionOption("c", "Belgrade, Yugoslavia"),
                        QuestionOption("d", "Accra, Ghana")
                    ),
                    correctOptionId = "c",
                    explanation = "The first NAM Conference took place in Belgrade, Yugoslavia, in September 1961."
                ),
                Question(
                    id = 10461,
                    questionNumber = 61,
                    totalQuestions = 100,
                    text = "Which of the following was NOT among the most important founding leaders of the Non-Aligned Movement named in the unit?",
                    options = listOf(
                        QuestionOption("a", "Joseph Broz Tito of Yugoslavia"),
                        QuestionOption("b", "Gamal Abdel Nasser of Egypt"),
                        QuestionOption("c", "Jawaharlal Nehru of India"),
                        QuestionOption("d", "Winston Churchill of Britain")
                    ),
                    correctOptionId = "d",
                    explanation = "The leaders named were Tito, Nasser, Nehru, Nkrumah, and Sukarno — not Churchill."
                ),
                Question(
                    id = 10462,
                    questionNumber = 62,
                    totalQuestions = 100,
                    text = "In 1917, Britain supported the establishment of a Jewish homeland in Palestine through which declaration?",
                    options = listOf(
                        QuestionOption("a", "The Balfour Declaration"),
                        QuestionOption("b", "The Sykes-Picot Agreement"),
                        QuestionOption("c", "The Sevres Treaty"),
                        QuestionOption("d", "The Havana Declaration")
                    ),
                    correctOptionId = "a",
                    explanation = "In 1917 the British supported a Jewish homeland in Palestine through the Balfour Declaration."
                ),
                Question(
                    id = 10463,
                    questionNumber = 63,
                    totalQuestions = 100,
                    text = "Who was the founder of Zionism, encouraging Jews to move to Palestine?",
                    options = listOf(
                        QuestionOption("a", "David Ben-Gurion"),
                        QuestionOption("b", "Theodor Herzl"),
                        QuestionOption("c", "Yasser Arafat"),
                        QuestionOption("d", "Chaim Weizmann")
                    ),
                    correctOptionId = "b",
                    explanation = "Theodor Herzl, the founder of Zionism, encouraged Jews to move to Palestine and buy land."
                ),
                Question(
                    id = 10464,
                    questionNumber = 64,
                    totalQuestions = 100,
                    text = "The state of Israel was proclaimed on which date?",
                    options = listOf(
                        QuestionOption("a", "May 14, 1948"),
                        QuestionOption("b", "May 15, 1948"),
                        QuestionOption("c", "November 29, 1947"),
                        QuestionOption("d", "October 29, 1956")
                    ),
                    correctOptionId = "a",
                    explanation = "The Jews proclaimed the establishment of the state of Israel on May 14, 1948."
                ),
                Question(
                    id = 10465,
                    questionNumber = 65,
                    totalQuestions = 100,
                    text = "What event triggered the Suez War of 1956?",
                    options = listOf(
                        QuestionOption("a", "Israel's declaration of independence"),
                        QuestionOption("b", "Nasser's nationalization of the Suez Canal Company"),
                        QuestionOption("c", "The Six-Day War"),
                        QuestionOption("d", "The Yom Kippur War")
                    ),
                    correctOptionId = "b",
                    explanation = "On July 26, 1956, Gamal Abdel Nasser announced the nationalization of the Suez Canal Company, triggering the war."
                ),
                Question(
                    id = 10466,
                    questionNumber = 66,
                    totalQuestions = 100,
                    text = "The Six-Day War (1967) was fought between Israel and which combination of Arab states?",
                    options = listOf(
                        QuestionOption("a", "Egypt, Syria, and Jordan"),
                        QuestionOption("b", "Iraq, Lebanon, and Syria"),
                        QuestionOption("c", "Egypt, Iraq, and Trans-Jordan"),
                        QuestionOption("d", "Saudi Arabia, Egypt, and Jordan")
                    ),
                    correctOptionId = "a",
                    explanation = "The Six-Day War was fought between Israel and the Arab states of Egypt, Syria and Jordan."
                ),
                Question(
                    id = 10467,
                    questionNumber = 67,
                    totalQuestions = 100,
                    text = "The 1973 war, launched on the holiest day of the Jewish calendar, is known as the:",
                    options = listOf(
                        QuestionOption("a", "Suez War"),
                        QuestionOption("b", "Six-Day War"),
                        QuestionOption("c", "Yom Kippur War"),
                        QuestionOption("d", "War of Independence")
                    ),
                    correctOptionId = "c",
                    explanation = "On October 6, 1973, Egyptian and Syrian forces attacked Israel on Yom Kippur, giving the war its name."
                ),
                Question(
                    id = 10468,
                    questionNumber = 68,
                    totalQuestions = 100,
                    text = "Who was Chairman of the Palestine Liberation Organization from 1969 to 2004?",
                    options = listOf(
                        QuestionOption("a", "Gamal Abdel Nasser"),
                        QuestionOption("b", "Yasser Arafat"),
                        QuestionOption("c", "Theodor Herzl"),
                        QuestionOption("d", "Anwar Sadat")
                    ),
                    correctOptionId = "b",
                    explanation = "Yasir Arafat was Chairman of the Palestine Liberation Organization from 1969 to 2004."
                ),
                Question(
                    id = 10469,
                    questionNumber = 69,
                    totalQuestions = 100,
                    text = "Mikhail Gorbachev's policy of 'openness', allowing more freedom of speech and press, was called:",
                    options = listOf(
                        QuestionOption("a", "Perestroika"),
                        QuestionOption("b", "Glasnost"),
                        QuestionOption("c", "Détente"),
                        QuestionOption("d", "Containment")
                    ),
                    correctOptionId = "b",
                    explanation = "Glasnost, a Russian word for openness, called for greater transparency and freedom of speech and press."
                ),
                Question(
                    id = 10470,
                    questionNumber = 70,
                    totalQuestions = 100,
                    text = "Gorbachev's policy of restructuring the Soviet economy toward a hybrid communist-capitalist system was called:",
                    options = listOf(
                        QuestionOption("a", "Glasnost"),
                        QuestionOption("b", "Perestroika"),
                        QuestionOption("c", "NEP"),
                        QuestionOption("d", "Collectivization")
                    ),
                    correctOptionId = "b",
                    explanation = "Perestroika refers to restructuring the USSR, aiming to allow private ownership of some businesses."
                ),
                Question(
                    id = 10471,
                    questionNumber = 71,
                    totalQuestions = 100,
                    text = "The United Nations was established in the year _______.",
                    options = emptyList(),
                    correctOptionId = "1945",
                    explanation = "The United Nations is a global organization that was established in 1945.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10472,
                    questionNumber = 72,
                    totalQuestions = 100,
                    text = "The UN Security Council has _______ permanent members with veto power.",
                    options = emptyList(),
                    correctOptionId = "five",
                    explanation = "The Security Council comprises five permanent members with veto power.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10473,
                    questionNumber = 73,
                    totalQuestions = 100,
                    text = "The Charter of the United Nations was signed in _______ on June 26, 1945.",
                    options = emptyList(),
                    correctOptionId = "San Francisco",
                    explanation = "The 50 nations represented in San Francisco signed the Charter of the United Nations.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10474,
                    questionNumber = 74,
                    totalQuestions = 100,
                    text = "The seat of the International Court of Justice is in _______, Netherlands.",
                    options = emptyList(),
                    correctOptionId = "The Hague",
                    explanation = "The seat of the International Court of Justice is in The Hague, Netherlands.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10475,
                    questionNumber = 75,
                    totalQuestions = 100,
                    text = "The term '_______ Curtain' was coined by Winston Churchill in a 1946 speech in Fulton, Missouri.",
                    options = emptyList(),
                    correctOptionId = "Iron",
                    explanation = "The term Iron Curtain was coined by Winston Churchill in 1946.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10476,
                    questionNumber = 76,
                    totalQuestions = 100,
                    text = "The US policy issued in March 1947 to help countries threatened by communism was called the _______ Doctrine.",
                    options = emptyList(),
                    correctOptionId = "Truman",
                    explanation = "The United States issued the Truman Doctrine in March 1947.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10477,
                    questionNumber = 77,
                    totalQuestions = 100,
                    text = "_______ was the architect of the US Containment Doctrine.",
                    options = emptyList(),
                    correctOptionId = "George Kennan",
                    explanation = "George Kennan was the architect of the Containment Doctrine.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10478,
                    questionNumber = 78,
                    totalQuestions = 100,
                    text = "The European Recovery Program of 1947 is commonly known as the _______ Plan.",
                    options = emptyList(),
                    correctOptionId = "Marshall",
                    explanation = "The European recovery program, often called the Marshall Plan, was announced by George Marshall in 1947.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10479,
                    questionNumber = 79,
                    totalQuestions = 100,
                    text = "Stalin denounced the Marshall Plan as '_______ Imperialism'.",
                    options = emptyList(),
                    correctOptionId = "Dollar",
                    explanation = "Stalin denounced the Marshall Plan as 'Dollar Imperialism.'",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10480,
                    questionNumber = 80,
                    totalQuestions = 100,
                    text = "The Berlin Blockade lasted from 24 June 1948 to 12 May _______.",
                    options = emptyList(),
                    correctOptionId = "1949",
                    explanation = "The Berlin Blockade lasted from 24 June 1948 to 12 May 1949.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10481,
                    questionNumber = 81,
                    totalQuestions = 100,
                    text = "NATO, founded in April 1949, stands for the North Atlantic Treaty _______.",
                    options = emptyList(),
                    correctOptionId = "Organization",
                    explanation = "NATO stands for the North Atlantic Treaty Organization, founded in April 1949.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10482,
                    questionNumber = 82,
                    totalQuestions = 100,
                    text = "The Warsaw Pact was formed by the Soviet Union and Eastern European allies in May _______.",
                    options = emptyList(),
                    correctOptionId = "1955",
                    explanation = "In May 1955, the Warsaw Pact military bloc was formed.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10483,
                    questionNumber = 83,
                    totalQuestions = 100,
                    text = "The Soviets launched the first earth satellite, known as _______, on 4 October 1957.",
                    options = emptyList(),
                    correctOptionId = "Sputnik",
                    explanation = "On 4 October 1957, the Soviets launched the first earth satellite known as Sputnik.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10484,
                    questionNumber = 84,
                    totalQuestions = 100,
                    text = "The People's Republic of China was formed in October _______ by the Chinese Communists.",
                    options = emptyList(),
                    correctOptionId = "1949",
                    explanation = "In October 1949, the People's Republic of China was formed by the Chinese Communists.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10485,
                    questionNumber = 85,
                    totalQuestions = 100,
                    text = "Korea was divided at the _______ parallel between Soviet and American occupation zones.",
                    options = emptyList(),
                    correctOptionId = "38th",
                    explanation = "The dividing line between the Soviet and American occupation zones in Korea was the 38th parallel.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10486,
                    questionNumber = 86,
                    totalQuestions = 100,
                    text = "A peace treaty ending the Korean War was signed at _______ in 1953.",
                    options = emptyList(),
                    correctOptionId = "Panmunjom",
                    explanation = "In 1953 a peace treaty was signed at Panmunjom that ended the Korean War.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10487,
                    questionNumber = 87,
                    totalQuestions = 100,
                    text = "SEATO was formed in 1954 as a branch of _______ in Asia.",
                    options = emptyList(),
                    correctOptionId = "NATO",
                    explanation = "SEATO (South East Asia Treaty Organization) was formed in 1954 as a branch of NATO in Asia.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10488,
                    questionNumber = 88,
                    totalQuestions = 100,
                    text = "The Vietnamese communist independence movement founded in 1941 and led by Ho Chi Minh was called _______.",
                    options = emptyList(),
                    correctOptionId = "Viet Minh",
                    explanation = "Ho Chi Minh established an organization known as Viet Minh (Vietnamese Independent League).",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10489,
                    questionNumber = 89,
                    totalQuestions = 100,
                    text = "The French forces were defeated by the Viet Minh at the Battle of _______ on 7 May 1954.",
                    options = emptyList(),
                    correctOptionId = "Dien Bien Phu",
                    explanation = "The French forces were defeated by the Viet Minh at the Battle of Dien Bien Phu.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10490,
                    questionNumber = 90,
                    totalQuestions = 100,
                    text = "Following the Geneva Accords, North and South Vietnam were separated at the _______ parallel.",
                    options = emptyList(),
                    correctOptionId = "17th",
                    explanation = "The North and South Vietnam were separated at the 17th parallel.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10491,
                    questionNumber = 91,
                    totalQuestions = 100,
                    text = "The Socialist Republic of Vietnam was formally established on July 2, _______.",
                    options = emptyList(),
                    correctOptionId = "1976",
                    explanation = "The Socialist Republic of Vietnam was formally established on July 2, 1976.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10492,
                    questionNumber = 92,
                    totalQuestions = 100,
                    text = "The basic concept for the Non-Aligned Movement originated in 1955 at the _______ Conference in Indonesia.",
                    options = emptyList(),
                    correctOptionId = "Bandung",
                    explanation = "The basic concept for NAM originated in 1955 during the Asia-Africa Bandung Conference.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10493,
                    questionNumber = 93,
                    totalQuestions = 100,
                    text = "The first NAM Conference took place in Belgrade, Yugoslavia, in September _______.",
                    options = emptyList(),
                    correctOptionId = "1961",
                    explanation = "The first NAM Conference took place in Belgrade, Yugoslavia, in September 1961.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10494,
                    questionNumber = 94,
                    totalQuestions = 100,
                    text = "The 1917 British declaration supporting a Jewish homeland in Palestine was known as the _______ Declaration.",
                    options = emptyList(),
                    correctOptionId = "Balfour",
                    explanation = "In 1917 the British supported a Jewish homeland in Palestine, known as the Balfour Declaration.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10495,
                    questionNumber = 95,
                    totalQuestions = 100,
                    text = "_______ was the founder of Zionism, who encouraged Jews to move to Palestine.",
                    options = emptyList(),
                    correctOptionId = "Theodor Herzl",
                    explanation = "Theodor Herzl, the founder of Zionism, encouraged Jews to move to Palestine and buy land.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10496,
                    questionNumber = 96,
                    totalQuestions = 100,
                    text = "The state of Israel was proclaimed on May 14, _______.",
                    options = emptyList(),
                    correctOptionId = "1948",
                    explanation = "The Jews proclaimed the establishment of the state of Israel on May 14, 1948.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10497,
                    questionNumber = 97,
                    totalQuestions = 100,
                    text = "The 1956 Suez War began after Nasser nationalized the _______ Canal Company.",
                    options = emptyList(),
                    correctOptionId = "Suez",
                    explanation = "On July 26, 1956, Gamal Abdel Nasser announced the nationalization of the Suez Canal Company.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10498,
                    questionNumber = 98,
                    totalQuestions = 100,
                    text = "The 1973 Arab-Israeli war, launched on the holiest Jewish day, is known as the _______ War.",
                    options = emptyList(),
                    correctOptionId = "Yom Kippur",
                    explanation = "On October 6, 1973, Egyptian and Syrian forces attacked Israel on Yom Kippur, giving the war its name.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10499,
                    questionNumber = 99,
                    totalQuestions = 100,
                    text = "Mikhail Gorbachev's policy of openness and transparency in Soviet government was called _______.",
                    options = emptyList(),
                    correctOptionId = "Glasnost",
                    explanation = "Glasnost, a Russian word for openness, called for greater transparency in the Soviet government.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10500,
                    questionNumber = 100,
                    totalQuestions = 100,
                    text = "In 1991, _______ sovereign states emerged from the collapse of the USSR.",
                    options = emptyList(),
                    correctOptionId = "fifteen",
                    explanation = "In 1991, fifteen sovereign states emerged from the collapse of the USSR.",
                    type = QuestionType.FILL_IN_THE_BLANK
                )
            )
        ),
        "hist_u6" to Quiz(
            id = "quiz_history_u6_full",
            title = "Ethiopia: Internal Developments & External Influences 1941–1991 Quiz",
            subject = "History",
            durationMinutes = 45,
            gradeLevel = "Grade 10",
            iconName = "pillar",
            unitId = "hist_u6",
            subjectId = "history",
            questions = listOf(
                Question(
                    id = 10501,
                    questionNumber = 1,
                    totalQuestions = 100,
                    text = "Haile Selassie returned to Addis Ababa on May 5, 1941.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "On May 5, 1941, Haile Selassie returned to Addis Ababa."
                ),
                Question(
                    id = 10502,
                    questionNumber = 2,
                    totalQuestions = 100,
                    text = "The first Anglo-Ethiopian treaty, signed in January 1942, gave Ethiopia complete, unrestricted sovereignty.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "The 1942 treaty recognized Ethiopia as independent but restricted sovereignty in several ways, such as British control of the army and key institutions."
                ),
                Question(
                    id = 10503,
                    questionNumber = 3,
                    totalQuestions = 100,
                    text = "Under the Second Anglo-Ethiopian Treaty of 1944, the British promised to restore Ogaden to Ethiopia.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The Second Anglo-Ethiopian treaty of December 1944 saw the British promise to restore Ogaden to Ethiopia."
                ),
                Question(
                    id = 10504,
                    questionNumber = 4,
                    totalQuestions = 100,
                    text = "Eritrea remained under British administration from 1941 to 1952.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Eritrea remained under British administration from 1941 to 1952."
                ),
                Question(
                    id = 10505,
                    questionNumber = 5,
                    totalQuestions = 100,
                    text = "UN Resolution 390V (1950) decided that Eritrea should be united with Ethiopia through federation.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "UN Resolution 390V, adopted 2 December 1950, decided Eritrea should be united with Ethiopia by federation."
                ),
                Question(
                    id = 10506,
                    questionNumber = 6,
                    totalQuestions = 100,
                    text = "The Kagnew Station in Asmara was named after an Ethiopian battalion that fought in the Korean War.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Kagnew station was renamed after the Ethiopian battalion that took part in the Korean War on the American side."
                ),
                Question(
                    id = 10507,
                    questionNumber = 7,
                    totalQuestions = 100,
                    text = "Ethiopia was reorganized into twelve teqlaygezats (governorate-generals) in 1942.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Ethiopia was reorganised into twelve teqlaygezats (governorate-generals) in 1942."
                ),
                Question(
                    id = 10508,
                    questionNumber = 8,
                    totalQuestions = 100,
                    text = "The Revised Constitution of 1955 introduced strong principles of popular sovereignty and rule of law.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "The 1955 Constitution strengthened the Emperor's absolute power and did not introduce popular sovereignty or rule of law."
                ),
                Question(
                    id = 10509,
                    questionNumber = 9,
                    totalQuestions = 100,
                    text = "Gult referred to land owned based on a lineage system, while Rist referred to the right to collect tributes.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "It is the reverse: Gult was the right to collect tributes, and Rist referred to land owned based on lineage."
                ),
                Question(
                    id = 10510,
                    questionNumber = 10,
                    totalQuestions = 100,
                    text = "Coffee was the leading agricultural export item of Ethiopia in the post-liberation period.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The leading agricultural export in the post-liberation period was coffee."
                ),
                Question(
                    id = 10511,
                    questionNumber = 11,
                    totalQuestions = 100,
                    text = "The Woyyane revolt in Tigray occurred in 1943, soon after Haile Selassie's return from exile.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The earliest noticeable revolt after Haile Selassie's return took place in Tigray in 1943, known as the Woyyane revolt."
                ),
                Question(
                    id = 10512,
                    questionNumber = 12,
                    totalQuestions = 100,
                    text = "Waqo Gutu was one of the leaders of the Bale peasant uprising.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "One of the leaders of the Bale uprising was Waqo Gutu."
                ),
                Question(
                    id = 10513,
                    questionNumber = 13,
                    totalQuestions = 100,
                    text = "The 1960 coup d'état was organized by the brothers Mengistu Neway and Germame Neway.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The coup was organized by the two brothers, Mengistu Neway and Germame Neway."
                ),
                Question(
                    id = 10514,
                    questionNumber = 14,
                    totalQuestions = 100,
                    text = "The 1960 coup successfully overthrew Emperor Haile Selassie.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "The coup failed; the emperor returned to the city and the coup was aborted after about two days."
                ),
                Question(
                    id = 10515,
                    questionNumber = 15,
                    totalQuestions = 100,
                    text = "The nucleus of the Ethiopian student movement was the University College of Addis Ababa, founded in 1950.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The nucleus of the student movement was the University College of Addis Ababa, founded in 1950."
                ),
                Question(
                    id = 10516,
                    questionNumber = 16,
                    totalQuestions = 100,
                    text = "The famous slogan of the Ethiopian student movement was 'Meret Learashu' (Land to the Tiller).",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The famous student slogan was 'Meret Learashu', 'Land to the Tiller'."
                ),
                Question(
                    id = 10517,
                    questionNumber = 17,
                    totalQuestions = 100,
                    text = "Tilahun Gizaw, the student union president, was shot by security police in December 1969.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "On December 28, 1969, student union president Tilahun Gizaw was shot by security police."
                ),
                Question(
                    id = 10518,
                    questionNumber = 18,
                    totalQuestions = 100,
                    text = "The Derg was formally established on 28 June 1974.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The Derg (Coordinating Committee of the Armed Forces) was established on 28 June 1974."
                ),
                Question(
                    id = 10519,
                    questionNumber = 19,
                    totalQuestions = 100,
                    text = "Haile Selassie was deposed by the Derg on September 12, 1974.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "On 12 September 1974, the Derg deposed Haile Selassie and transformed itself into the PMAC."
                ),
                Question(
                    id = 10520,
                    questionNumber = 20,
                    totalQuestions = 100,
                    text = "Lieutenant General Aman Mikael Andom became the first chairman of the PMAC.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Lieutenant General Aman Mikael Andom became the first chairman of PMAC."
                ),
                Question(
                    id = 10521,
                    questionNumber = 21,
                    totalQuestions = 100,
                    text = "The Land Reform Proclamation of March 1975 nationalized all rural land in Ethiopia.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "In March 1975, the Land Reform Proclamation nationalized all rural land, ending feudal relations in rural Ethiopia."
                ),
                Question(
                    id = 10522,
                    questionNumber = 22,
                    totalQuestions = 100,
                    text = "The Red Terror was a campaign carried out by the Derg against the EPRP and other suspected opponents.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The Derg carried out a ruthless campaign known as Red Terror against the EPRP and other suspected individuals."
                ),
                Question(
                    id = 10523,
                    questionNumber = 23,
                    totalQuestions = 100,
                    text = "The Workers' Party of Ethiopia (WPE) was established by the Derg in 1984.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The Derg established the Workers' Party of Ethiopia (WPE) as a vanguard party in 1984."
                ),
                Question(
                    id = 10524,
                    questionNumber = 24,
                    totalQuestions = 100,
                    text = "The People's Democratic Republic of Ethiopia (PDRE) was proclaimed in 1987.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "In 1987, the People's Democratic Republic of Ethiopia (PDRE) was proclaimed and the constitution promulgated."
                ),
                Question(
                    id = 10525,
                    questionNumber = 25,
                    totalQuestions = 100,
                    text = "The 1977 Ethio-Somalia War was initiated by President Siad Barre of Somalia.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The 1977 war was initiated by President Siad Barre of Somalia, pursuing his irredentist 'Greater Somalia' policy."
                ),
                Question(
                    id = 10526,
                    questionNumber = 26,
                    totalQuestions = 100,
                    text = "During the 1977 Ethio-Somalia War, Ethiopia was supported by the Soviet Union and Cuba, while Somalia was supported by the USA and the Arab world.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Ethiopia was supported by the Soviet Union, Cuba, and Yemen; Somalia got aid from the USA and the Arab world."
                ),
                Question(
                    id = 10527,
                    questionNumber = 27,
                    totalQuestions = 100,
                    text = "Eritrea was federated with Ethiopia in 1952 following a UN-recommended compromise.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The federation of Eritrea with Ethiopia in 1952 was the compromise solution recommended by the UN in 1950."
                ),
                Question(
                    id = 10528,
                    questionNumber = 28,
                    totalQuestions = 100,
                    text = "The Eritrean People's Liberation Front (EPLF) was founded in 1973.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "In 1973, the Eritrean People's Liberation Forces (EPLF), also known as Shabia, was founded."
                ),
                Question(
                    id = 10529,
                    questionNumber = 29,
                    totalQuestions = 100,
                    text = "The EPRDF forces controlled Addis Ababa on May 28, 1991, ending the Derg regime.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The EPRDF controlled Addis Ababa on May 28, 1991, bringing the end of the Derg regime."
                ),
                Question(
                    id = 10530,
                    questionNumber = 30,
                    totalQuestions = 100,
                    text = "The Ethiopian Ministry of Education and Fine Arts was established in 1942.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The Ministry of Education and Fine Arts was established in 1942, restarting efforts to modernize education."
                ),
                Question(
                    id = 10531,
                    questionNumber = 31,
                    totalQuestions = 100,
                    text = "When did Haile Selassie return to Addis Ababa after the Italian occupation?",
                    options = listOf(
                        QuestionOption("a", "May 5, 1941"),
                        QuestionOption("b", "September 12, 1974"),
                        QuestionOption("c", "January 31, 1942"),
                        QuestionOption("d", "December 1944")
                    ),
                    correctOptionId = "a",
                    explanation = "On May 5, 1941, Haile Selassie returned to Addis Ababa."
                ),
                Question(
                    id = 10532,
                    questionNumber = 32,
                    totalQuestions = 100,
                    text = "What administrative body did the British set up over the Ogaden and Eritrea?",
                    options = listOf(
                        QuestionOption("a", "The Provisional Military Administration Council"),
                        QuestionOption("b", "The Occupied Enemy Territory Administration (OETA)"),
                        QuestionOption("c", "The Trusteeship Council"),
                        QuestionOption("d", "The Coordinating Committee of the Armed Forces")
                    ),
                    correctOptionId = "b",
                    explanation = "The British set up the Occupied Enemy Territory Administration (OETA) over the Ogaden and Eritrea."
                ),
                Question(
                    id = 10533,
                    questionNumber = 33,
                    totalQuestions = 100,
                    text = "The first Anglo-Ethiopian treaty was signed on which date?",
                    options = listOf(
                        QuestionOption("a", "31 January 1942"),
                        QuestionOption("b", "5 May 1941"),
                        QuestionOption("c", "December 1944"),
                        QuestionOption("d", "2 December 1950")
                    ),
                    correctOptionId = "a",
                    explanation = "The first agreement between Ethiopia and the British was signed on 31 January 1942."
                ),
                Question(
                    id = 10534,
                    questionNumber = 34,
                    totalQuestions = 100,
                    text = "Which currency was made the official monetary unit of Ethiopia under the first Anglo-Ethiopian Treaty?",
                    options = listOf(
                        QuestionOption("a", "The Maria Theresa Thaler"),
                        QuestionOption("b", "The British East African Shilling"),
                        QuestionOption("c", "The Ethiopian Birr"),
                        QuestionOption("d", "The Italian Lira")
                    ),
                    correctOptionId = "b",
                    explanation = "The British East African Shilling was made the official Monetary Unit under the 1942 treaty."
                ),
                Question(
                    id = 10535,
                    questionNumber = 35,
                    totalQuestions = 100,
                    text = "Under the Second Anglo-Ethiopian Treaty of December 1944, what did the British promise regarding Ogaden?",
                    options = listOf(
                        QuestionOption("a", "Permanent British control"),
                        QuestionOption("b", "To restore it to Ethiopia"),
                        QuestionOption("c", "To transfer it to Somalia"),
                        QuestionOption("d", "To make it a UN trust territory")
                    ),
                    correctOptionId = "b",
                    explanation = "The British promised to restore Ogaden to Ethiopia in the Second Anglo-Ethiopian treaty of 1944."
                ),
                Question(
                    id = 10536,
                    questionNumber = 36,
                    totalQuestions = 100,
                    text = "Which political group in Eritrea was the single largest, demanding unification with Ethiopia?",
                    options = listOf(
                        QuestionOption("a", "The Muslim League"),
                        QuestionOption("b", "The Unionist Party"),
                        QuestionOption("c", "The Liberal Progressive Party"),
                        QuestionOption("d", "The Pro-Italian Party")
                    ),
                    correctOptionId = "b",
                    explanation = "The Unionist Party, constituting the single largest political group, demanded unification of Eritrea with Ethiopia."
                ),
                Question(
                    id = 10537,
                    questionNumber = 37,
                    totalQuestions = 100,
                    text = "Which UN resolution decided that Eritrea should be united with Ethiopia by federation?",
                    options = listOf(
                        QuestionOption("a", "Resolution 181"),
                        QuestionOption("b", "Resolution 390V"),
                        QuestionOption("c", "Resolution 242"),
                        QuestionOption("d", "Resolution 1514")
                    ),
                    correctOptionId = "b",
                    explanation = "UN Resolution 390V, adopted on 2 December 1950, decided Eritrea should be united with Ethiopia by a federation."
                ),
                Question(
                    id = 10538,
                    questionNumber = 38,
                    totalQuestions = 100,
                    text = "What agreement, signed on May 15, 1952, formalized US assistance to Ethiopia in areas like agriculture and public health?",
                    options = listOf(
                        QuestionOption("a", "The Kagnew Agreement"),
                        QuestionOption("b", "The Point Four Agreement"),
                        QuestionOption("c", "The Ethio-American Treaty of 1953"),
                        QuestionOption("d", "The Marshall Plan")
                    ),
                    correctOptionId = "b",
                    explanation = "The Point Four Agreement was signed on May 15, 1952, leading to US assistance in various sectors."
                ),
                Question(
                    id = 10539,
                    questionNumber = 39,
                    totalQuestions = 100,
                    text = "The 1953 Ethiopian-American Treaty allowed the US to operate which facility in Asmara?",
                    options = listOf(
                        QuestionOption("a", "Kagnew Station"),
                        QuestionOption("b", "OETA headquarters"),
                        QuestionOption("c", "BMME headquarters"),
                        QuestionOption("d", "The National Economic Council")
                    ),
                    correctOptionId = "a",
                    explanation = "The 1953 deal let the US operate the Kagnew station, a communication facility in Asmara."
                ),
                Question(
                    id = 10540,
                    questionNumber = 40,
                    totalQuestions = 100,
                    text = "How many teqlaygezats (governorate-generals) was Ethiopia reorganized into in 1942?",
                    options = listOf(
                        QuestionOption("a", "Nine"),
                        QuestionOption("b", "Ten"),
                        QuestionOption("c", "Twelve"),
                        QuestionOption("d", "Fourteen")
                    ),
                    correctOptionId = "c",
                    explanation = "Ethiopia was reorganised into twelve teqlaygezats (governorate-generals) in 1942."
                ),
                Question(
                    id = 10541,
                    questionNumber = 41,
                    totalQuestions = 100,
                    text = "What title was given to the head of each teqlaygezat, appointed by the Emperor?",
                    options = listOf(
                        QuestionOption("a", "Enderase"),
                        QuestionOption("b", "Dejjazmach"),
                        QuestionOption("c", "Ras"),
                        QuestionOption("d", "Fitawrari")
                    ),
                    correctOptionId = "a",
                    explanation = "The head of each teqlaygezat was known as enderase ('on my behalf'), ruling on behalf of the Emperor."
                ),
                Question(
                    id = 10542,
                    questionNumber = 42,
                    totalQuestions = 100,
                    text = "The Revised Constitution of 1955 primarily served to:",
                    options = listOf(
                        QuestionOption("a", "Introduce popular sovereignty"),
                        QuestionOption("b", "Strengthen the absolute power of the Emperor"),
                        QuestionOption("c", "Establish a multi-party democracy"),
                        QuestionOption("d", "Grant Eritrea full independence")
                    ),
                    correctOptionId = "b",
                    explanation = "The Revised Constitution of 1955 strengthened the absolute power of the Emperor."
                ),
                Question(
                    id = 10543,
                    questionNumber = 43,
                    totalQuestions = 100,
                    text = "What did 'Gult' refer to in the indigenous Ethiopian land tenure system?",
                    options = listOf(
                        QuestionOption("a", "Land owned based on lineage"),
                        QuestionOption("b", "The right to collect tributes (gibir) from peasants"),
                        QuestionOption("c", "A system of land measurement"),
                        QuestionOption("d", "Communal grazing rights")
                    ),
                    correctOptionId = "b",
                    explanation = "Gult referred to the right to collect tributes (gibir) from peasants, granted by the emperor to various ranks."
                ),
                Question(
                    id = 10544,
                    questionNumber = 44,
                    totalQuestions = 100,
                    text = "What was 'Rist' in the indigenous Ethiopian land tenure system?",
                    options = listOf(
                        QuestionOption("a", "The right to collect tributes"),
                        QuestionOption("b", "Land owned based on a lineage system"),
                        QuestionOption("c", "A tax on fertile land"),
                        QuestionOption("d", "A form of urban land ownership")
                    ),
                    correctOptionId = "b",
                    explanation = "Rist refers to land owned based on a lineage system."
                ),
                Question(
                    id = 10545,
                    questionNumber = 45,
                    totalQuestions = 100,
                    text = "The qalad land measurement system divided land into which three fertility categories?",
                    options = listOf(
                        QuestionOption("a", "Lem, lem-tef, and tef"),
                        QuestionOption("b", "Gult, Rist, and Chisegna"),
                        QuestionOption("c", "Gibir, Gebbar, and Gasha"),
                        QuestionOption("d", "Awraja, Wereda, and Kebele")
                    ),
                    correctOptionId = "a",
                    explanation = "The measured land was divided into lem, lem-tef and tef (fertile, semi-fertile and unfertile)."
                ),
                Question(
                    id = 10546,
                    questionNumber = 46,
                    totalQuestions = 100,
                    text = "What was the leading agricultural export item of Ethiopia in the post-liberation period?",
                    options = listOf(
                        QuestionOption("a", "Skins and hides"),
                        QuestionOption("b", "Coffee"),
                        QuestionOption("c", "Pulses and oilseeds"),
                        QuestionOption("d", "Gold")
                    ),
                    correctOptionId = "b",
                    explanation = "The leading agricultural export was coffee."
                ),
                Question(
                    id = 10547,
                    questionNumber = 47,
                    totalQuestions = 100,
                    text = "What economic planning body did the government create in 1954/55 to coordinate development plans?",
                    options = listOf(
                        QuestionOption("a", "The National Economic Council"),
                        QuestionOption("b", "The Workers' Party of Ethiopia"),
                        QuestionOption("c", "The Ministry of Public Health"),
                        QuestionOption("d", "The Peasant Association")
                    ),
                    correctOptionId = "a",
                    explanation = "In 1954/55, the government created the National Economic Council to coordinate the state's development plans."
                ),
                Question(
                    id = 10548,
                    questionNumber = 48,
                    totalQuestions = 100,
                    text = "What was the earliest noticeable revolt Haile Selassie faced after his return from exile, occurring in Tigray?",
                    options = listOf(
                        QuestionOption("a", "The Bale uprising"),
                        QuestionOption("b", "The Woyyane revolt"),
                        QuestionOption("c", "The Gojjam uprising"),
                        QuestionOption("d", "The Yejju uprising")
                    ),
                    correctOptionId = "b",
                    explanation = "The earliest noticeable revolt was the Woyyane revolt in Tigray, in 1943."
                ),
                Question(
                    id = 10549,
                    questionNumber = 49,
                    totalQuestions = 100,
                    text = "Who led the Woyyane revolt in Tigray in 1943?",
                    options = listOf(
                        QuestionOption("a", "Waqo Gutu"),
                        QuestionOption("b", "Bilata Haile Mariam Reda"),
                        QuestionOption("c", "Mengistu Neway"),
                        QuestionOption("d", "Tilahun Gizaw")
                    ),
                    correctOptionId = "b",
                    explanation = "The Woyyane revolt was led by Bilata Haile Mariam Reda."
                ),
                Question(
                    id = 10550,
                    questionNumber = 50,
                    totalQuestions = 100,
                    text = "What triggered the Gojjam peasant uprising of 1968?",
                    options = listOf(
                        QuestionOption("a", "The introduction of the 1967 agricultural income tax"),
                        QuestionOption("b", "The Woyyane revolt"),
                        QuestionOption("c", "The 1960 coup attempt"),
                        QuestionOption("d", "The Red Terror")
                    ),
                    correctOptionId = "a",
                    explanation = "The 1967 agricultural income tax, which the government attempted to introduce, triggered the Gojjam uprising of 1968."
                ),
                Question(
                    id = 10551,
                    questionNumber = 51,
                    totalQuestions = 100,
                    text = "Who were the two brothers who organized the coup d'état of 1960?",
                    options = listOf(
                        QuestionOption("a", "Aman Andom and Mengistu Haile Mariam"),
                        QuestionOption("b", "Mengistu Neway and Germame Neway"),
                        QuestionOption("c", "Tsige Dibu and Workneh Gebeyehu"),
                        QuestionOption("d", "Teferi Benti and Atnafu Abate")
                    ),
                    correctOptionId = "b",
                    explanation = "The coup was organized by the two brothers Mengistu Neway and Germame Neway."
                ),
                Question(
                    id = 10552,
                    questionNumber = 52,
                    totalQuestions = 100,
                    text = "Who was appointed head of state by the coup-makers during the 1960 coup attempt?",
                    options = listOf(
                        QuestionOption("a", "Ras Emeru Haile Selassie"),
                        QuestionOption("b", "Asfawosen Haile Selassie (the emperor's son)"),
                        QuestionOption("c", "General Mulugeta Buli"),
                        QuestionOption("d", "Mengistu Neway")
                    ),
                    correctOptionId = "b",
                    explanation = "The emperor's son and heir, Asfawosen Haile Selassie, was appointed head of state as a constitutional monarch."
                ),
                Question(
                    id = 10553,
                    questionNumber = 53,
                    totalQuestions = 100,
                    text = "What was the main cause for the failure of the 1960 coup?",
                    options = listOf(
                        QuestionOption("a", "Lack of support from the army"),
                        QuestionOption("b", "Foreign military intervention"),
                        QuestionOption("c", "Opposition from Eritrea"),
                        QuestionOption("d", "Opposition from student unions")
                    ),
                    correctOptionId = "a",
                    explanation = "The main cause for the failure of the coup was a lack of support from the army."
                ),
                Question(
                    id = 10554,
                    questionNumber = 54,
                    totalQuestions = 100,
                    text = "What institution was the nucleus of the Ethiopian student movement?",
                    options = listOf(
                        QuestionOption("a", "Gondar Medical College"),
                        QuestionOption("b", "University College of Addis Ababa (later Haile Selassie I University)"),
                        QuestionOption("c", "Holeta Military Academy"),
                        QuestionOption("d", "Kagnew Station")
                    ),
                    correctOptionId = "b",
                    explanation = "The nucleus of the student movement was the University College of Addis Ababa, founded in 1950."
                ),
                Question(
                    id = 10555,
                    questionNumber = 55,
                    totalQuestions = 100,
                    text = "What was the famous slogan of the Ethiopian student movement demanding land reform?",
                    options = listOf(
                        QuestionOption("a", "Ethiopia Tikdem"),
                        QuestionOption("b", "Meret Learashu (Land to the Tiller)"),
                        QuestionOption("c", "Peace, Land and Bread"),
                        QuestionOption("d", "Down with Fascism")
                    ),
                    correctOptionId = "b",
                    explanation = "The famous slogan of the students was 'Meret Learashu', 'Land to the Tiller'."
                ),
                Question(
                    id = 10556,
                    questionNumber = 56,
                    totalQuestions = 100,
                    text = "What was the Coordinating Committee of the Armed Forces, established in 1974, commonly known as?",
                    options = listOf(
                        QuestionOption("a", "PMAC"),
                        QuestionOption("b", "Derg"),
                        QuestionOption("c", "WPE"),
                        QuestionOption("d", "EPRDF")
                    ),
                    correctOptionId = "b",
                    explanation = "The Coordinating Committee of the Armed Forces (AFCC), commonly known as Derg, was set up in 1974."
                ),
                Question(
                    id = 10557,
                    questionNumber = 57,
                    totalQuestions = 100,
                    text = "What was the Derg's motto or slogan introduced after taking power?",
                    options = listOf(
                        QuestionOption("a", "Meret Learashu"),
                        QuestionOption("b", "Ethiopia Tikdem"),
                        QuestionOption("c", "Peace, Land and Bread"),
                        QuestionOption("d", "Down with Imperialism")
                    ),
                    correctOptionId = "b",
                    explanation = "The Derg introduced its motto or slogan called 'Ethiopia Tikdem'."
                ),
                Question(
                    id = 10558,
                    questionNumber = 58,
                    totalQuestions = 100,
                    text = "Who became the first chairman of the Provisional Military Administration Council (PMAC) in 1974?",
                    options = listOf(
                        QuestionOption("a", "Mengistu Haile Mariam"),
                        QuestionOption("b", "Teferi Benti"),
                        QuestionOption("c", "Lieutenant General Aman Mikael Andom"),
                        QuestionOption("d", "Atnafu Abate")
                    ),
                    correctOptionId = "c",
                    explanation = "Lieutenant General Aman Mikael Andom became the first chairman of PMAC."
                ),
                Question(
                    id = 10559,
                    questionNumber = 59,
                    totalQuestions = 100,
                    text = "What campaign, launched in December 1974, sent about 60,000 campaigners to rural areas for literacy and development work?",
                    options = listOf(
                        QuestionOption("a", "The Red Terror"),
                        QuestionOption("b", "Edget Behebret Zemecha (Development through Cooperation Campaign)"),
                        QuestionOption("c", "Operation Red Star"),
                        QuestionOption("d", "The National Democratic Revolution")
                    ),
                    correctOptionId = "b",
                    explanation = "The Development through Cooperation Campaign (Edget Behebret Zemecha) sent about 60,000 campaigners to rural areas."
                ),
                Question(
                    id = 10560,
                    questionNumber = 60,
                    totalQuestions = 100,
                    text = "What did the March 1975 Land Reform Proclamation do?",
                    options = listOf(
                        QuestionOption("a", "Privatized all rural land"),
                        QuestionOption("b", "Nationalized all rural land, ending feudal relations"),
                        QuestionOption("c", "Gave land only to the church"),
                        QuestionOption("d", "Returned land to former landlords")
                    ),
                    correctOptionId = "b",
                    explanation = "The March 1975 Land Reform Proclamation nationalized all rural land, ending feudal relations in rural Ethiopia."
                ),
                Question(
                    id = 10561,
                    questionNumber = 61,
                    totalQuestions = 100,
                    text = "Which two civilian political groups engaged in bitter struggle after the fall of the monarchy?",
                    options = listOf(
                        QuestionOption("a", "EPLF and TPLF"),
                        QuestionOption("b", "AESM (MEISON) and EPRP"),
                        QuestionOption("c", "OLF and SALF"),
                        QuestionOption("d", "WSLF and EDU")
                    ),
                    correctOptionId = "b",
                    explanation = "A bitter struggle emerged between the All Ethiopian Socialist Movement (MEISON) and the EPRP."
                ),
                Question(
                    id = 10562,
                    questionNumber = 62,
                    totalQuestions = 100,
                    text = "The Red Terror campaign was primarily directed against which group?",
                    options = listOf(
                        QuestionOption("a", "The EPRP and suspected opponents of the Derg"),
                        QuestionOption("b", "The Eritrean Liberation Front"),
                        QuestionOption("c", "Somali forces"),
                        QuestionOption("d", "The Imperial Bodyguard")
                    ),
                    correctOptionId = "a",
                    explanation = "The Derg carried out the Red Terror, a bloody campaign against the EPRP and other suspected individuals."
                ),
                Question(
                    id = 10563,
                    questionNumber = 63,
                    totalQuestions = 100,
                    text = "The Workers' Party of Ethiopia (WPE), established in 1984, was tasked with drafting the constitution for which state?",
                    options = listOf(
                        QuestionOption("a", "The Federal Democratic Republic of Ethiopia"),
                        QuestionOption("b", "The People's Democratic Republic of Ethiopia (PDRE)"),
                        QuestionOption("c", "The Union of Ethiopian Socialist Republics"),
                        QuestionOption("d", "The Ethiopian Empire")
                    ),
                    correctOptionId = "b",
                    explanation = "The WPE's primary task was devising the constitution that would inaugurate the PDRE, proclaimed in 1987."
                ),
                Question(
                    id = 10564,
                    questionNumber = 64,
                    totalQuestions = 100,
                    text = "Who held actual power as both president of the country and general secretary of the WPE?",
                    options = listOf(
                        QuestionOption("a", "Teferi Benti"),
                        QuestionOption("b", "Aman Mikael Andom"),
                        QuestionOption("c", "Mengistu Haile Mariam"),
                        QuestionOption("d", "Atnafu Abate")
                    ),
                    correctOptionId = "c",
                    explanation = "Actual power rested on Mengistu, who was president of the country and general secretary of the WPE."
                ),
                Question(
                    id = 10565,
                    questionNumber = 65,
                    totalQuestions = 100,
                    text = "What was the major reason for the 1977 Ethio-Somalia War?",
                    options = listOf(
                        QuestionOption("a", "A border dispute over Djibouti"),
                        QuestionOption("b", "Somalia's irredentist policy of creating 'Greater Somalia'"),
                        QuestionOption("c", "Ethiopian claims over northern Somalia"),
                        QuestionOption("d", "A dispute over the Nile River")
                    ),
                    correctOptionId = "b",
                    explanation = "The war was initiated by Siad Barre of Somalia, pursuing his irredentist policy of creating 'Greater Somalia'."
                ),
                Question(
                    id = 10566,
                    questionNumber = 66,
                    totalQuestions = 100,
                    text = "Which countries supported Ethiopia during the 1977 Ethio-Somalia War?",
                    options = listOf(
                        QuestionOption("a", "The USA and Arab states"),
                        QuestionOption("b", "The Soviet Union, Cuba, and Yemen"),
                        QuestionOption("c", "Britain and France"),
                        QuestionOption("d", "China and Japan")
                    ),
                    correctOptionId = "b",
                    explanation = "Ethiopia was supported by the Soviet Union, Cuba, and the Democratic Republic of Yemen."
                ),
                Question(
                    id = 10567,
                    questionNumber = 67,
                    totalQuestions = 100,
                    text = "The federation of Eritrea with Ethiopia in 1952 was based on a compromise recommended by which body?",
                    options = listOf(
                        QuestionOption("a", "The Organization of African Unity"),
                        QuestionOption("b", "The United Nations General Assembly"),
                        QuestionOption("c", "The League of Nations"),
                        QuestionOption("d", "The African Union")
                    ),
                    correctOptionId = "b",
                    explanation = "The federation of Eritrea with Ethiopia in 1952 was the compromised solution recommended by the UN General Assembly."
                ),
                Question(
                    id = 10568,
                    questionNumber = 68,
                    totalQuestions = 100,
                    text = "Which Eritrean liberation movement, founded in 1958, was the earliest?",
                    options = listOf(
                        QuestionOption("a", "Eritrean Liberation Front (ELF)"),
                        QuestionOption("b", "Eritrean People's Liberation Front (EPLF)"),
                        QuestionOption("c", "Eritrean Liberation Movement (ELM)"),
                        QuestionOption("d", "Shabia")
                    ),
                    correctOptionId = "c",
                    explanation = "The discontent led to the establishment of the Eritrean Liberation Movement (ELM) in 1958."
                ),
                Question(
                    id = 10569,
                    questionNumber = 69,
                    totalQuestions = 100,
                    text = "What military campaign did the Derg launch in 1982 to try to solve the Eritrean problem?",
                    options = listOf(
                        QuestionOption("a", "Operation Red Star"),
                        QuestionOption("b", "Operation Ethiopia Tikdem"),
                        QuestionOption("c", "Operation Red Terror"),
                        QuestionOption("d", "Operation Shabia")
                    ),
                    correctOptionId = "a",
                    explanation = "In 1982, the Derg announced a military campaign named Operation Red Star, targeting the Eritrean problem."
                ),
                Question(
                    id = 10570,
                    questionNumber = 70,
                    totalQuestions = 100,
                    text = "What natural disaster, preceded by drought and crop failure, significantly contributed to the fall of the Derg?",
                    options = listOf(
                        QuestionOption("a", "The 1958/59 Tigray famine"),
                        QuestionOption("b", "The famine of 1984/5"),
                        QuestionOption("c", "The Wallo famine of 1972/73"),
                        QuestionOption("d", "The Wag-Lasta famine of 1965/66")
                    ),
                    correctOptionId = "b",
                    explanation = "The famine of 1984/5, preceded by drought and crop failure, forced mass resettlement and contributed to the Derg's fall."
                ),
                Question(
                    id = 10571,
                    questionNumber = 71,
                    totalQuestions = 100,
                    text = "Haile Selassie returned to Addis Ababa on May 5, _______.",
                    options = emptyList(),
                    correctOptionId = "1941",
                    explanation = "On May 5, 1941, Haile Selassie returned to Addis Ababa.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10572,
                    questionNumber = 72,
                    totalQuestions = 100,
                    text = "The British set up an administration known by the acronym _______ over the Ogaden and Eritrea.",
                    options = emptyList(),
                    correctOptionId = "OETA",
                    explanation = "The British set up the Occupied Enemy Territory Administration (OETA) over the Ogaden and Eritrea.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10573,
                    questionNumber = 73,
                    totalQuestions = 100,
                    text = "The first Anglo-Ethiopian treaty was signed on 31 January _______.",
                    options = emptyList(),
                    correctOptionId = "1942",
                    explanation = "The first agreement between Ethiopia and the British was signed on 31 January 1942.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10574,
                    questionNumber = 74,
                    totalQuestions = 100,
                    text = "The Second Anglo-Ethiopian Treaty was signed in December _______.",
                    options = emptyList(),
                    correctOptionId = "1944",
                    explanation = "The Second Anglo-Ethiopian treaty was signed in December 1944.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10575,
                    questionNumber = 75,
                    totalQuestions = 100,
                    text = "UN Resolution 390V, adopted in 1950, decided Eritrea should unite with Ethiopia through _______.",
                    options = emptyList(),
                    correctOptionId = "federation",
                    explanation = "UN Resolution 390V decided that Eritrea should be united with Ethiopia by a federation.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10576,
                    questionNumber = 76,
                    totalQuestions = 100,
                    text = "The _______ Agreement, signed May 15, 1952, formalized US development assistance to Ethiopia.",
                    options = emptyList(),
                    correctOptionId = "Point Four",
                    explanation = "The Point Four Agreement was signed by Ethiopia and the US on May 15, 1952.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10577,
                    questionNumber = 77,
                    totalQuestions = 100,
                    text = "The US communication facility in Asmara, formerly Italian Radio Marina, was renamed _______ Station.",
                    options = emptyList(),
                    correctOptionId = "Kagnew",
                    explanation = "The facility was renamed Kagnew station after the Ethiopian battalion that fought in the Korean War.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10578,
                    questionNumber = 78,
                    totalQuestions = 100,
                    text = "Ethiopia was reorganized into twelve _______ (governorate-generals) in 1942.",
                    options = emptyList(),
                    correctOptionId = "teqlaygezats",
                    explanation = "Ethiopia was reorganised into twelve teqlaygezats (governorate-generals) in 1942.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10579,
                    questionNumber = 79,
                    totalQuestions = 100,
                    text = "The head of each teqlaygezat, appointed by the Emperor, was known as _______.",
                    options = emptyList(),
                    correctOptionId = "enderase",
                    explanation = "The head of each teqlaygezat was known as enderase ('on my behalf').",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10580,
                    questionNumber = 80,
                    totalQuestions = 100,
                    text = "The Revised Constitution of _______ strengthened the absolute power of the Emperor.",
                    options = emptyList(),
                    correctOptionId = "1955",
                    explanation = "The Revised Constitution of 1955 strengthened the absolute power of the Emperor.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10581,
                    questionNumber = 81,
                    totalQuestions = 100,
                    text = "_______ referred to the right to collect tributes (gibir) from peasants in the indigenous Ethiopian land system.",
                    options = emptyList(),
                    correctOptionId = "Gult",
                    explanation = "Gult referred to the right to collect tributes (gibir) from peasants.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10582,
                    questionNumber = 82,
                    totalQuestions = 100,
                    text = "The leading agricultural export item of Ethiopia in the post-liberation period was _______.",
                    options = emptyList(),
                    correctOptionId = "coffee",
                    explanation = "The leading agricultural export in the post-liberation period was coffee.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10583,
                    questionNumber = 83,
                    totalQuestions = 100,
                    text = "The earliest noticeable revolt Haile Selassie faced after returning from exile was the _______ revolt in Tigray.",
                    options = emptyList(),
                    correctOptionId = "Woyyane",
                    explanation = "The earliest noticeable revolt was the Woyyane revolt in Tigray in 1943.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10584,
                    questionNumber = 84,
                    totalQuestions = 100,
                    text = "_______ was one of the leaders of the Bale peasant uprising (1963-1970).",
                    options = emptyList(),
                    correctOptionId = "Waqo Gutu",
                    explanation = "One of the leaders of the Bale uprising was Waqo Gutu.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10585,
                    questionNumber = 85,
                    totalQuestions = 100,
                    text = "The 1960 coup d'état was organized by brothers Mengistu Neway and _______ Neway.",
                    options = emptyList(),
                    correctOptionId = "Germame",
                    explanation = "The coup was organized by the two brothers Mengistu Neway and Germame Neway.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10586,
                    questionNumber = 86,
                    totalQuestions = 100,
                    text = "The nucleus of the Ethiopian student movement was the University College of _______, founded in 1950.",
                    options = emptyList(),
                    correctOptionId = "Addis Ababa",
                    explanation = "The nucleus of the student movement was the University College of Addis Ababa, founded in 1950.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10587,
                    questionNumber = 87,
                    totalQuestions = 100,
                    text = "The famous student slogan demanding land reform was 'Meret Learashu', meaning 'Land to the _______'.",
                    options = emptyList(),
                    correctOptionId = "Tiller",
                    explanation = "The famous slogan of the students was 'Meret Learashu', 'Land to the Tiller'.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10588,
                    questionNumber = 88,
                    totalQuestions = 100,
                    text = "Student union president _______ was shot by security police on December 28, 1969.",
                    options = emptyList(),
                    correctOptionId = "Tilahun Gizaw",
                    explanation = "On December 28, 1969, student union president Tilahun Gizaw was shot by security police.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10589,
                    questionNumber = 89,
                    totalQuestions = 100,
                    text = "The Coordinating Committee of the Armed Forces, established in 1974, was commonly known as the _______.",
                    options = emptyList(),
                    correctOptionId = "Derg",
                    explanation = "The Coordinating Committee of the Armed Forces (AFCC) was commonly known as Derg.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10590,
                    questionNumber = 90,
                    totalQuestions = 100,
                    text = "The Derg's motto or slogan was '_______ Tikdem'.",
                    options = emptyList(),
                    correctOptionId = "Ethiopia",
                    explanation = "The Derg introduced its motto or slogan called 'Ethiopia Tikdem'.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10591,
                    questionNumber = 91,
                    totalQuestions = 100,
                    text = "Haile Selassie was deposed by the Derg on September 12, _______.",
                    options = emptyList(),
                    correctOptionId = "1974",
                    explanation = "On 12 September 1974, the Derg deposed Haile Selassie.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10592,
                    questionNumber = 92,
                    totalQuestions = 100,
                    text = "The March 1975 proclamation that nationalized all rural land was called the _______ Reform Proclamation.",
                    options = emptyList(),
                    correctOptionId = "Land",
                    explanation = "The Land Reform Proclamation of March 1975 nationalized all rural land.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10593,
                    questionNumber = 93,
                    totalQuestions = 100,
                    text = "The Derg's ruthless campaign against the EPRP and suspected opponents was known as the _______.",
                    options = emptyList(),
                    correctOptionId = "Red Terror",
                    explanation = "The Derg's campaign against the EPRP and other suspected individuals was known as the Red Terror.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10594,
                    questionNumber = 94,
                    totalQuestions = 100,
                    text = "The Workers' Party of Ethiopia (WPE) was established by the Derg as a vanguard party in _______.",
                    options = emptyList(),
                    correctOptionId = "1984",
                    explanation = "The Derg established the Workers' Party of Ethiopia (WPE) in 1984.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10595,
                    questionNumber = 95,
                    totalQuestions = 100,
                    text = "The People's Democratic Republic of Ethiopia (PDRE) was proclaimed in _______.",
                    options = emptyList(),
                    correctOptionId = "1987",
                    explanation = "In 1987, the People's Democratic Republic of Ethiopia (PDRE) was proclaimed.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10596,
                    questionNumber = 96,
                    totalQuestions = 100,
                    text = "The 1977 Ethio-Somalia War was initiated by Somali President _______.",
                    options = emptyList(),
                    correctOptionId = "Siad Barre",
                    explanation = "The war was initiated by President Siad Barre of Somalia.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10597,
                    questionNumber = 97,
                    totalQuestions = 100,
                    text = "The Eritrean People's Liberation Front (EPLF), also called Shabia, was founded in _______.",
                    options = emptyList(),
                    correctOptionId = "1973",
                    explanation = "In 1973, the Eritrean People's Liberation Forces (EPLF), also known as Shabia, was founded.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10598,
                    questionNumber = 98,
                    totalQuestions = 100,
                    text = "The Derg's 1982 military campaign to solve the Eritrean problem was called Operation _______.",
                    options = emptyList(),
                    correctOptionId = "Red Star",
                    explanation = "In 1982, the Derg announced a military campaign named Operation Red Star.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10599,
                    questionNumber = 99,
                    totalQuestions = 100,
                    text = "The EPRDF forces controlled Addis Ababa on May 28, _______, ending the Derg regime.",
                    options = emptyList(),
                    correctOptionId = "1991",
                    explanation = "The EPRDF controlled Addis Ababa on May 28, 1991, bringing the end of the Derg regime.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10600,
                    questionNumber = 100,
                    totalQuestions = 100,
                    text = "The Ministry of _______ and Fine Arts was established in 1942 to modernize Ethiopian education.",
                    options = emptyList(),
                    correctOptionId = "Education",
                    explanation = "The Ministry of Education and Fine Arts was established in 1942.",
                    type = QuestionType.FILL_IN_THE_BLANK
                )
            )
        ),
        "hist_u7" to Quiz(
            id = "quiz_history_u7_full",
            title = "Africa Since 1960 Quiz",
            subject = "History",
            durationMinutes = 45,
            gradeLevel = "Grade 10",
            iconName = "pillar",
            unitId = "hist_u7",
            subjectId = "history",
            questions = listOf(
                Question(
                    id = 10601,
                    questionNumber = 1,
                    totalQuestions = 100,
                    text = "Egypt achieved a unilateral declaration of independence from Britain on February 22, 1922.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "London was compelled to issue a unilateral declaration of Egyptian independence on February 22, 1922."
                ),
                Question(
                    id = 10602,
                    questionNumber = 2,
                    totalQuestions = 100,
                    text = "Libya achieved independence from Italy under UN Trusteeship on December 24, 1951.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The Kingdom of Libya achieved its independence from Italy under UN Trusteeship on December 24, 1951."
                ),
                Question(
                    id = 10603,
                    questionNumber = 3,
                    totalQuestions = 100,
                    text = "Sudan became independent on 1 January 1956, ending the Anglo-Egyptian Condominium.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "On 1 January 1956, the Anglo-Egyptian Condominium over Sudan ended and Sudan became independent."
                ),
                Question(
                    id = 10604,
                    questionNumber = 4,
                    totalQuestions = 100,
                    text = "Morocco was proclaimed independent on 2 March 1956.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Morocco was proclaimed independent on 2 March 1956 after a negotiated settlement."
                ),
                Question(
                    id = 10605,
                    questionNumber = 5,
                    totalQuestions = 100,
                    text = "The Algerian FLN's guerrilla war for independence was led by Ahmed Ben Bella.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The National Liberation Front of Algeria (FLN), led by Ahmed Ben Bella, waged the war of liberation."
                ),
                Question(
                    id = 10606,
                    questionNumber = 6,
                    totalQuestions = 100,
                    text = "Algeria was proclaimed independent on 1 July 1962.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Algeria was proclaimed independent on 1 July 1962, following a referendum."
                ),
                Question(
                    id = 10607,
                    questionNumber = 7,
                    totalQuestions = 100,
                    text = "The Gold Coast (Ghana) was the first British colony to gain independence in sub-Saharan Africa.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The first British colony to gain independence in sub-Saharan Africa was the Gold Coast, in 1957."
                ),
                Question(
                    id = 10608,
                    questionNumber = 8,
                    totalQuestions = 100,
                    text = "Kwame Nkrumah founded the Convention People's Party (CPP) in 1949.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "In 1949, Kwame Nkrumah left UGCC and founded the Convention People's Party (CPP)."
                ),
                Question(
                    id = 10609,
                    questionNumber = 9,
                    totalQuestions = 100,
                    text = "Nigeria became independent in 1960.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "It was not until 1959 that all parties agreed on 1960, the year Nigeria became independent."
                ),
                Question(
                    id = 10610,
                    questionNumber = 10,
                    totalQuestions = 100,
                    text = "Guinea (Conakry) voted YES in the 1958 French referendum and remained part of the French Community.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "Guinea, under Sekou Toure, voted NO to the referendum and became independent on 2 October 1958."
                ),
                Question(
                    id = 10611,
                    questionNumber = 11,
                    totalQuestions = 100,
                    text = "Kenya's Mau Mau revolt against British settlers occurred between 1952 and 1955.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "In Kenya, dispossessed peasants organised a revolt known as Mau Mau between 1952 and 1955."
                ),
                Question(
                    id = 10612,
                    questionNumber = 12,
                    totalQuestions = 100,
                    text = "Jomo Kenyatta became Kenya's first president after independence in 1963.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Kenya won independence in 1963 and Kenyatta became its first president."
                ),
                Question(
                    id = 10613,
                    questionNumber = 13,
                    totalQuestions = 100,
                    text = "Patrice Lumumba became the first president of the independent Republic of the Congo.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "Lumumba became Prime Minister, while Joseph Kasavubu was elected president."
                ),
                Question(
                    id = 10614,
                    questionNumber = 14,
                    totalQuestions = 100,
                    text = "Patrice Lumumba was kidnapped and executed in January 1961.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "On 17 January 1961, Katangan forces and Belgian Paratroopers kidnapped and executed Patrice Lumumba."
                ),
                Question(
                    id = 10615,
                    questionNumber = 15,
                    totalQuestions = 100,
                    text = "The African National Congress (ANC) was formed in South Africa in 1912.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The African National Congress (ANC) was formed in 1912, aimed at struggling for black South Africans' rights."
                ),
                Question(
                    id = 10616,
                    questionNumber = 16,
                    totalQuestions = 100,
                    text = "Apartheid came to power in South Africa after the Afrikaner National Party won the 1948 general election.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "In 1948, a general election brought the Afrikaner National Party to power, which promoted apartheid."
                ),
                Question(
                    id = 10617,
                    questionNumber = 17,
                    totalQuestions = 100,
                    text = "The Sharpeville Massacre occurred on March 21, 1960.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "On 21 March 1960, police fired on peaceful demonstrators at Sharpeville, killing 72 people."
                ),
                Question(
                    id = 10618,
                    questionNumber = 18,
                    totalQuestions = 100,
                    text = "Nelson Mandela became the first democratically elected president of South Africa in 1994.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "In April 1994, Mandela won the election and became the first democratically elected president of South Africa."
                ),
                Question(
                    id = 10619,
                    questionNumber = 19,
                    totalQuestions = 100,
                    text = "The Organization of African Unity (OAU) was established in Addis Ababa in May 1963.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "African states came together at Addis Ababa and established the OAU in May 1963."
                ),
                Question(
                    id = 10620,
                    questionNumber = 20,
                    totalQuestions = 100,
                    text = "The Casablanca Group favored a loose confederation of independent sovereign states.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "The Casablanca Group favored a strong political union; the Monrovia Group favored a loose confederation."
                ),
                Question(
                    id = 10621,
                    questionNumber = 21,
                    totalQuestions = 100,
                    text = "The African Union (AU) was officially launched in Durban, South Africa in July 2002.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The AU was officially launched in July 2002 in Durban, South Africa."
                ),
                Question(
                    id = 10622,
                    questionNumber = 22,
                    totalQuestions = 100,
                    text = "Southern Rhodesia's Ian Smith declared a Unilateral Declaration of Independence (UDI) in 1965.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "In 1965, the racist white settlers under Ian Smith declared the Unilateral Declaration of Independence."
                ),
                Question(
                    id = 10623,
                    questionNumber = 23,
                    totalQuestions = 100,
                    text = "Zimbabwe achieved majority rule in April 1980, with Robert Mugabe as the first Prime Minister.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Majority rule was established in April 1980, with Robert Mugabe becoming the first Prime Minister."
                ),
                Question(
                    id = 10624,
                    questionNumber = 24,
                    totalQuestions = 100,
                    text = "Namibia won its independence from South Africa in 1990.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "South-West Africa finally won its independence in 1990 and was renamed Namibia."
                ),
                Question(
                    id = 10625,
                    questionNumber = 25,
                    totalQuestions = 100,
                    text = "The Biafra War (Nigerian Civil War) arose partly from ethnic tensions between the Igbo and Hausa.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The Biafra War arose from ethnic marginalization of the Igbo, culminating in their attempted secession."
                ),
                Question(
                    id = 10626,
                    questionNumber = 26,
                    totalQuestions = 100,
                    text = "The Rwandan Genocide of 1994 resulted in approximately 800,000 deaths, mostly Tutsi.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The Rwandan Genocide resulted in 800,000 deaths, the majority being Tutsi."
                ),
                Question(
                    id = 10627,
                    questionNumber = 27,
                    totalQuestions = 100,
                    text = "The Abuja Treaty of 1991 established the African Economic Community (AEC).",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The African Economic Community (AEC) was established under the Abuja Treaty (1991)."
                ),
                Question(
                    id = 10628,
                    questionNumber = 28,
                    totalQuestions = 100,
                    text = "COMESA was formed in December 1994, replacing a Preferential Trade Area that existed since 1981.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "COMESA was formed in December 1994, replacing a Preferential Trade Area which had existed since 1981."
                ),
                Question(
                    id = 10629,
                    questionNumber = 29,
                    totalQuestions = 100,
                    text = "Africa's raw material exports rose sharply in price compared to manufactured imports since the 1960s.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "Since the 1960s, Africa's raw material exports have dropped in price compared to manufactured imports."
                ),
                Question(
                    id = 10630,
                    questionNumber = 30,
                    totalQuestions = 100,
                    text = "The Monrovia Group favored a loose confederation of independent sovereign African states.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The Monrovia Group favored a loose confederation promoting voluntary cooperation among sovereign states."
                ),
                Question(
                    id = 10631,
                    questionNumber = 31,
                    totalQuestions = 100,
                    text = "Who led the Egyptian nationalist delegation that requested Britain end its protectorate after WWI?",
                    options = listOf(
                        QuestionOption("a", "Muhammad Naguib"),
                        QuestionOption("b", "Saad Zaghlul"),
                        QuestionOption("c", "Gamal Abdel Nasser"),
                        QuestionOption("d", "King Farouk")
                    ),
                    correctOptionId = "b",
                    explanation = "Soon after WWI, the delegation of Egyptian nationalist activists was led by Saad Zaghlul."
                ),
                Question(
                    id = 10632,
                    questionNumber = 32,
                    totalQuestions = 100,
                    text = "Which country achieved independence from Italy under UN Trusteeship on December 24, 1951?",
                    options = listOf(
                        QuestionOption("a", "Egypt"),
                        QuestionOption("b", "Sudan"),
                        QuestionOption("c", "Libya"),
                        QuestionOption("d", "Tunisia")
                    ),
                    correctOptionId = "c",
                    explanation = "The Kingdom of Libya achieved independence from Italy under UN Trusteeship on December 24, 1951."
                ),
                Question(
                    id = 10633,
                    questionNumber = 33,
                    totalQuestions = 100,
                    text = "Sudan became independent from the Anglo-Egyptian Condominium on which date?",
                    options = listOf(
                        QuestionOption("a", "1 January 1956"),
                        QuestionOption("b", "22 February 1922"),
                        QuestionOption("c", "24 December 1951"),
                        QuestionOption("d", "1 July 1962")
                    ),
                    correctOptionId = "a",
                    explanation = "On 1 January 1956, the Anglo-Egyptian Condominium over Sudan ended and Sudan became independent."
                ),
                Question(
                    id = 10634,
                    questionNumber = 34,
                    totalQuestions = 100,
                    text = "Who led the Moroccan National Front's challenge to French colonial domination?",
                    options = listOf(
                        QuestionOption("a", "Sultan Mohammed V"),
                        QuestionOption("b", "Habib Bourguiba"),
                        QuestionOption("c", "Ahmed Ben Bella"),
                        QuestionOption("d", "Saad Zaghlul")
                    ),
                    correctOptionId = "a",
                    explanation = "The Moroccan National Front, challenging French colonial domination, was led by Sultan Mohammed V."
                ),
                Question(
                    id = 10635,
                    questionNumber = 35,
                    totalQuestions = 100,
                    text = "Habib Bourguiba, who led Tunisia to independence in 1956, headed which party?",
                    options = listOf(
                        QuestionOption("a", "The Neo-Destour Party"),
                        QuestionOption("b", "The FLN"),
                        QuestionOption("c", "The Casablanca Group"),
                        QuestionOption("d", "The Convention People's Party")
                    ),
                    correctOptionId = "a",
                    explanation = "Tunisia won independence in 1956 under Habib Bourguiba, who headed the Neo-Destour Party."
                ),
                Question(
                    id = 10636,
                    questionNumber = 36,
                    totalQuestions = 100,
                    text = "Which organization led Algeria's guerrilla war of liberation against France (1954-1962)?",
                    options = listOf(
                        QuestionOption("a", "The Secret Armed Organization"),
                        QuestionOption("b", "The National Liberation Front (FLN)"),
                        QuestionOption("c", "The Casablanca Group"),
                        QuestionOption("d", "The Neo-Destour Party")
                    ),
                    correctOptionId = "b",
                    explanation = "The National Liberation Front of Algeria (FLN), led by Ahmed Ben Bella, waged the war of liberation."
                ),
                Question(
                    id = 10637,
                    questionNumber = 37,
                    totalQuestions = 100,
                    text = "Which was the first British colony to gain independence in sub-Saharan Africa?",
                    options = listOf(
                        QuestionOption("a", "Nigeria"),
                        QuestionOption("b", "The Gold Coast (Ghana)"),
                        QuestionOption("c", "Sierra Leone"),
                        QuestionOption("d", "The Gambia")
                    ),
                    correctOptionId = "b",
                    explanation = "The first British colony to gain independence in sub-Saharan Africa was the Gold Coast, which became Ghana."
                ),
                Question(
                    id = 10638,
                    questionNumber = 38,
                    totalQuestions = 100,
                    text = "Kwame Nkrumah left the UGCC and founded which party to lead Ghana's independence struggle?",
                    options = listOf(
                        QuestionOption("a", "The Convention People's Party (CPP)"),
                        QuestionOption("b", "The National Council of Nigeria and Cameroon"),
                        QuestionOption("c", "The Northern People's Congress"),
                        QuestionOption("d", "The Action Group")
                    ),
                    correctOptionId = "a",
                    explanation = "In 1949, Kwame Nkrumah founded the Convention People's Party (CPP) and led the independence struggle."
                ),
                Question(
                    id = 10639,
                    questionNumber = 39,
                    totalQuestions = 100,
                    text = "In Nigeria, the Northern People's Congress (NPC) was based primarily in which ethnic/regional group?",
                    options = listOf(
                        QuestionOption("a", "Igbo land"),
                        QuestionOption("b", "Yoruba country"),
                        QuestionOption("c", "Fulbe-Hausa in the north"),
                        QuestionOption("d", "Niger Delta")
                    ),
                    correctOptionId = "c",
                    explanation = "The Northern People's Congress (NPC) was based in Fulbe-Hausa in the Northern region."
                ),
                Question(
                    id = 10640,
                    questionNumber = 40,
                    totalQuestions = 100,
                    text = "Which West African country voted NO in the 1958 French referendum and became independent immediately?",
                    options = listOf(
                        QuestionOption("a", "Senegal"),
                        QuestionOption("b", "Guinea (Conakry)"),
                        QuestionOption("c", "Ivory Coast"),
                        QuestionOption("d", "Mali")
                    ),
                    correctOptionId = "b",
                    explanation = "Guinea, under Sekou Toure, voted NO to the referendum and proclaimed independence on 2 October 1958."
                ),
                Question(
                    id = 10641,
                    questionNumber = 41,
                    totalQuestions = 100,
                    text = "Most French West and Equatorial African colonies became independent in which year?",
                    options = listOf(
                        QuestionOption("a", "1956"),
                        QuestionOption("b", "1958"),
                        QuestionOption("c", "1960"),
                        QuestionOption("d", "1962")
                    ),
                    correctOptionId = "c",
                    explanation = "Other French colonies remained under French rule until 1960, when most became independent."
                ),
                Question(
                    id = 10642,
                    questionNumber = 42,
                    totalQuestions = 100,
                    text = "Which Portuguese African colonies achieved independence only in 1973-1975, much later than British/French colonies?",
                    options = listOf(
                        QuestionOption("a", "Nigeria and Ghana"),
                        QuestionOption("b", "Guinea-Bissau, Cape Verde, Angola, and Mozambique"),
                        QuestionOption("c", "Kenya and Uganda"),
                        QuestionOption("d", "Zimbabwe and Zambia")
                    ),
                    correctOptionId = "b",
                    explanation = "Guinea-Bissau, Cape Verde Islands, Angola, and Mozambique overthrew Portuguese colonialism only in the mid-1970s."
                ),
                Question(
                    id = 10643,
                    questionNumber = 43,
                    totalQuestions = 100,
                    text = "Under whose prime ministership did Uganda attain independence from Britain in 1962?",
                    options = listOf(
                        QuestionOption("a", "Julius Nyerere"),
                        QuestionOption("b", "Milton Obote"),
                        QuestionOption("c", "Jomo Kenyatta"),
                        QuestionOption("d", "Kenneth Kaunda")
                    ),
                    correctOptionId = "b",
                    explanation = "Uganda attained independence in 1962 under the prime ministership of Milton Obote."
                ),
                Question(
                    id = 10644,
                    questionNumber = 44,
                    totalQuestions = 100,
                    text = "Who led the Tanganyika African National Union (TANU) that won Tanganyika's independence in 1961?",
                    options = listOf(
                        QuestionOption("a", "Julius Nyerere"),
                        QuestionOption("b", "Milton Obote"),
                        QuestionOption("c", "Jomo Kenyatta"),
                        QuestionOption("d", "Kenneth Kaunda")
                    ),
                    correctOptionId = "a",
                    explanation = "Tanganyika won independence in 1961 under TANU, led by Julius Nyerere."
                ),
                Question(
                    id = 10645,
                    questionNumber = 45,
                    totalQuestions = 100,
                    text = "What was the name of the Kenyan peasant revolt against British settlers (1952-1955)?",
                    options = listOf(
                        QuestionOption("a", "The Maji Maji Uprising"),
                        QuestionOption("b", "The Mau Mau revolt"),
                        QuestionOption("c", "The Herero rebellion"),
                        QuestionOption("d", "The Biafra War")
                    ),
                    correctOptionId = "b",
                    explanation = "Dispossessed Kenyan peasants organised a revolt known as Mau Mau between 1952 and 1955."
                ),
                Question(
                    id = 10646,
                    questionNumber = 46,
                    totalQuestions = 100,
                    text = "Who founded the Congo National Movement (MNC) in 1958?",
                    options = listOf(
                        QuestionOption("a", "Joseph Kasavubu"),
                        QuestionOption("b", "Patrice Lumumba"),
                        QuestionOption("c", "Moise Tshombe"),
                        QuestionOption("d", "Julius Nyerere")
                    ),
                    correctOptionId = "b",
                    explanation = "The first nationwide Congolese political party, the Congo National Movement, was launched by Patrice Lumumba."
                ),
                Question(
                    id = 10647,
                    questionNumber = 47,
                    totalQuestions = 100,
                    text = "Who was elected president of the newly independent Republic of the Congo in 1960?",
                    options = listOf(
                        QuestionOption("a", "Patrice Lumumba"),
                        QuestionOption("b", "Joseph Kasavubu"),
                        QuestionOption("c", "Moise Tshombe"),
                        QuestionOption("d", "Julius Nyerere")
                    ),
                    correctOptionId = "b",
                    explanation = "Lumumba's MNC appointed Lumumba as Prime Minister and elected Joseph Kasavubu as president."
                ),
                Question(
                    id = 10648,
                    questionNumber = 48,
                    totalQuestions = 100,
                    text = "The province of Katanga, which attempted to secede from the Congo, was led by:",
                    options = listOf(
                        QuestionOption("a", "Moise Tshombe"),
                        QuestionOption("b", "Patrice Lumumba"),
                        QuestionOption("c", "Joseph Kasavubu"),
                        QuestionOption("d", "Julius Nyerere")
                    ),
                    correctOptionId = "a",
                    explanation = "The province of Katanga, engaged in secessionist struggle, was led by Moise Tshombe."
                ),
                Question(
                    id = 10649,
                    questionNumber = 49,
                    totalQuestions = 100,
                    text = "Rwanda and Burundi became independent from Belgian mandate rule by UN decision in which year?",
                    options = listOf(
                        QuestionOption("a", "1960"),
                        QuestionOption("b", "1962"),
                        QuestionOption("c", "1963"),
                        QuestionOption("d", "1966")
                    ),
                    correctOptionId = "b",
                    explanation = "The Belgian mandate territories of Rwanda and Burundi became independent by UN decision in 1962."
                ),
                Question(
                    id = 10650,
                    questionNumber = 50,
                    totalQuestions = 100,
                    text = "Kenneth Kaunda led Zambia to independence as head of which party?",
                    options = listOf(
                        QuestionOption("a", "The African National Congress"),
                        QuestionOption("b", "The United National Independence Party (UNIP)"),
                        QuestionOption("c", "The Convention People's Party"),
                        QuestionOption("d", "TANU")
                    ),
                    correctOptionId = "b",
                    explanation = "Kenneth Kaunda was head of the United National Independence Party (UNIP), which led Zambia to independence."
                ),
                Question(
                    id = 10651,
                    questionNumber = 51,
                    totalQuestions = 100,
                    text = "Who declared the Unilateral Declaration of Independence (UDI) in Southern Rhodesia in 1965?",
                    options = listOf(
                        QuestionOption("a", "Robert Mugabe"),
                        QuestionOption("b", "Joshua Nkomo"),
                        QuestionOption("c", "Ian Smith"),
                        QuestionOption("d", "Kenneth Kaunda")
                    ),
                    correctOptionId = "c",
                    explanation = "In 1965, the racist white settlers under the leadership of Ian Smith declared the UDI."
                ),
                Question(
                    id = 10652,
                    questionNumber = 52,
                    totalQuestions = 100,
                    text = "Which two organizations led the guerrilla war that ended white minority rule in Rhodesia?",
                    options = listOf(
                        QuestionOption("a", "ANC and PAC"),
                        QuestionOption("b", "ZANU (Mugabe) and ZAPU (Nkomo)"),
                        QuestionOption("c", "FLN and Secret Armed Organization"),
                        QuestionOption("d", "UNIP and MNC")
                    ),
                    correctOptionId = "b",
                    explanation = "ZANU, led by Robert Mugabe, and ZAPU, led by Joshua Nkomo, fought the war that ended white minority rule."
                ),
                Question(
                    id = 10653,
                    questionNumber = 53,
                    totalQuestions = 100,
                    text = "South-West Africa's independence struggle against South Africa was led by which organization?",
                    options = listOf(
                        QuestionOption("a", "SWAPO"),
                        QuestionOption("b", "ZANU"),
                        QuestionOption("c", "the ANC"),
                        QuestionOption("d", "FLN")
                    ),
                    correctOptionId = "a",
                    explanation = "The struggle for South-West Africa's independence was organised and led by SWAPO."
                ),
                Question(
                    id = 10654,
                    questionNumber = 54,
                    totalQuestions = 100,
                    text = "The Afrikaner National Party came to power in South Africa in which year, subsequently instituting apartheid?",
                    options = listOf(
                        QuestionOption("a", "1910"),
                        QuestionOption("b", "1912"),
                        QuestionOption("c", "1948"),
                        QuestionOption("d", "1960")
                    ),
                    correctOptionId = "c",
                    explanation = "In 1948, a general election brought the Afrikaner National Party, which instituted apartheid, to power."
                ),
                Question(
                    id = 10655,
                    questionNumber = 55,
                    totalQuestions = 100,
                    text = "Approximately how many people were killed in the Sharpeville Massacre of March 1960?",
                    options = listOf(
                        QuestionOption("a", "12"),
                        QuestionOption("b", "72"),
                        QuestionOption("c", "186"),
                        QuestionOption("d", "800")
                    ),
                    correctOptionId = "b",
                    explanation = "On 21 March 1960, police fired on demonstrators at Sharpeville, killing 72 people."
                ),
                Question(
                    id = 10656,
                    questionNumber = 56,
                    totalQuestions = 100,
                    text = "Where was Nelson Mandela imprisoned for most of his time under apartheid?",
                    options = listOf(
                        QuestionOption("a", "Sharpeville"),
                        QuestionOption("b", "Robben Island"),
                        QuestionOption("c", "Soweto"),
                        QuestionOption("d", "Pretoria Central")
                    ),
                    correctOptionId = "b",
                    explanation = "Mandela was in jail at Robben Island until his release in 1990."
                ),
                Question(
                    id = 10657,
                    questionNumber = 57,
                    totalQuestions = 100,
                    text = "The Organization of African Unity (OAU) was established in May 1963 in which city?",
                    options = listOf(
                        QuestionOption("a", "Cairo"),
                        QuestionOption("b", "Addis Ababa"),
                        QuestionOption("c", "Accra"),
                        QuestionOption("d", "Lagos")
                    ),
                    correctOptionId = "b",
                    explanation = "African states came together at Addis Ababa and established the OAU in May 1963."
                ),
                Question(
                    id = 10658,
                    questionNumber = 58,
                    totalQuestions = 100,
                    text = "How many African countries sent delegates to establish the OAU in 1963?",
                    options = listOf(
                        QuestionOption("a", "20"),
                        QuestionOption("b", "25"),
                        QuestionOption("c", "32"),
                        QuestionOption("d", "40")
                    ),
                    correctOptionId = "c",
                    explanation = "Between 22 and 25 May 1963, delegates from 32 African countries convened to establish the OAU."
                ),
                Question(
                    id = 10659,
                    questionNumber = 59,
                    totalQuestions = 100,
                    text = "The Casablanca Group, which favored a strong political union along Nkrumah's lines, included which country?",
                    options = listOf(
                        QuestionOption("a", "Ghana"),
                        QuestionOption("b", "Nigeria"),
                        QuestionOption("c", "Ethiopia"),
                        QuestionOption("d", "Sierra Leone")
                    ),
                    correctOptionId = "a",
                    explanation = "The Casablanca Group included Ghana, Guinea, Egypt, Mali, Morocco, Libya, and the Algerian government-in-exile."
                ),
                Question(
                    id = 10660,
                    questionNumber = 60,
                    totalQuestions = 100,
                    text = "Ethiopia and Liberia played what role between the Casablanca and Monrovia Groups?",
                    options = listOf(
                        QuestionOption("a", "They refused to join the OAU"),
                        QuestionOption("b", "They were neutral and helped bridge the gulf between the rival groups"),
                        QuestionOption("c", "They led the Casablanca Group"),
                        QuestionOption("d", "They opposed the OAU's formation")
                    ),
                    correctOptionId = "b",
                    explanation = "Ethiopia and Liberia, being neutral, played a pivotal role to bridge the gulf between the rival blocks."
                ),
                Question(
                    id = 10661,
                    questionNumber = 61,
                    totalQuestions = 100,
                    text = "What was the OAU's greatest success, according to the unit?",
                    options = listOf(
                        QuestionOption("a", "Ending poverty in Africa"),
                        QuestionOption("b", "Decolonization and eradicating white minority rule"),
                        QuestionOption("c", "Preventing all civil wars"),
                        QuestionOption("d", "Achieving full economic integration")
                    ),
                    correctOptionId = "b",
                    explanation = "The OAU's greatest success was decolonization, eradicating colonialism and white minority rule in Africa."
                ),
                Question(
                    id = 10662,
                    questionNumber = 62,
                    totalQuestions = 100,
                    text = "The African Union (AU), replacing the OAU, was officially launched in which year and city?",
                    options = listOf(
                        QuestionOption("a", "July 2002 in Durban, South Africa"),
                        QuestionOption("b", "May 1963 in Addis Ababa"),
                        QuestionOption("c", "1991 in Abuja"),
                        QuestionOption("d", "1994 in Cairo")
                    ),
                    correctOptionId = "a",
                    explanation = "The AU was officially launched in July 2002 in Durban, South Africa."
                ),
                Question(
                    id = 10663,
                    questionNumber = 63,
                    totalQuestions = 100,
                    text = "The African Economic Community (AEC) was established under which 1991 treaty?",
                    options = listOf(
                        QuestionOption("a", "The Lagos Plan of Action"),
                        QuestionOption("b", "The Abuja Treaty"),
                        QuestionOption("c", "The Treaty of Addis Ababa"),
                        QuestionOption("d", "The Treaty of Casablanca")
                    ),
                    correctOptionId = "b",
                    explanation = "The African Economic Community (AEC) was established under the Abuja Treaty (1991)."
                ),
                Question(
                    id = 10664,
                    questionNumber = 64,
                    totalQuestions = 100,
                    text = "COMESA, a regional economic community, was formed in which year?",
                    options = listOf(
                        QuestionOption("a", "1981"),
                        QuestionOption("b", "1991"),
                        QuestionOption("c", "1994"),
                        QuestionOption("d", "2002")
                    ),
                    correctOptionId = "c",
                    explanation = "COMESA was formed in December 1994, replacing a Preferential Trade Area that had existed since 1981."
                ),
                Question(
                    id = 10665,
                    questionNumber = 65,
                    totalQuestions = 100,
                    text = "Which regional economic community includes Ethiopia, Sudan, South Sudan, Eritrea, Kenya, Uganda, and Djibouti?",
                    options = listOf(
                        QuestionOption("a", "ECOWAS"),
                        QuestionOption("b", "IGAD"),
                        QuestionOption("c", "SADC"),
                        QuestionOption("d", "COMESA")
                    ),
                    correctOptionId = "b",
                    explanation = "The Intergovernmental Authority on Development (IGAD) includes Ethiopia, Sudan, South Sudan, Eritrea, Kenya, Uganda, and Djibouti."
                ),
                Question(
                    id = 10666,
                    questionNumber = 66,
                    totalQuestions = 100,
                    text = "The Biafra War (Nigerian Civil War) arose largely from the marginalization and secession attempt of which ethnic group?",
                    options = listOf(
                        QuestionOption("a", "The Hausa"),
                        QuestionOption("b", "The Yoruba"),
                        QuestionOption("c", "The Igbo"),
                        QuestionOption("d", "The Fulani")
                    ),
                    correctOptionId = "c",
                    explanation = "The Igbo people, marginalized in the south-east, chose to secede and form Biafra, leading to civil war."
                ),
                Question(
                    id = 10667,
                    questionNumber = 67,
                    totalQuestions = 100,
                    text = "The Rwandan Genocide of 1994 was primarily a conflict between which two groups?",
                    options = listOf(
                        QuestionOption("a", "The Hutu and the Tutsi"),
                        QuestionOption("b", "The Igbo and the Hausa"),
                        QuestionOption("c", "The Zulu and the Xhosa"),
                        QuestionOption("d", "The Amhara and the Oromo")
                    ),
                    correctOptionId = "a",
                    explanation = "The Rwandan Genocide occurred between two of Rwanda's ethnic groups: the Tutsi and the Hutu."
                ),
                Question(
                    id = 10668,
                    questionNumber = 68,
                    totalQuestions = 100,
                    text = "Which of the following was listed as a key cause of poverty in post-colonial Africa?",
                    options = listOf(
                        QuestionOption("a", "Overproduction of food crops"),
                        QuestionOption("b", "Rapid population growth outpacing economic growth"),
                        QuestionOption("c", "Excessive foreign investment"),
                        QuestionOption("d", "Too much regional economic integration")
                    ),
                    correctOptionId = "b",
                    explanation = "Rapid population growth, which outpaces economic growth, is listed as a key cause of poverty in Africa."
                ),
                Question(
                    id = 10669,
                    questionNumber = 69,
                    totalQuestions = 100,
                    text = "According to the unit, Africa's 'Second Independence' in the 1990s and 2000s refers to:",
                    options = listOf(
                        QuestionOption("a", "A wave of re-colonization"),
                        QuestionOption("b", "A democratic wave that ended single-party dictatorships and military rule"),
                        QuestionOption("c", "The formation of the OAU"),
                        QuestionOption("d", "The end of the Cold War")
                    ),
                    correctOptionId = "b",
                    explanation = "Africa's democratic wave of the 1990s-2000s, termed 'second independence', led to the collapse of dictatorships and military rule."
                ),
                Question(
                    id = 10670,
                    questionNumber = 70,
                    totalQuestions = 100,
                    text = "What was the name of the party led by Julius Nyerere that won Tanganyika's independence?",
                    options = listOf(
                        QuestionOption("a", "TANU"),
                        QuestionOption("b", "UNIP"),
                        QuestionOption("c", "KANU"),
                        QuestionOption("d", "ZANU")
                    ),
                    correctOptionId = "a",
                    explanation = "Tanganyika won independence in 1961 under the Tanganyika African National Union (TANU), led by Julius Nyerere."
                ),
                Question(
                    id = 10671,
                    questionNumber = 71,
                    totalQuestions = 100,
                    text = "London issued a unilateral declaration of Egyptian independence on February 22, _______.",
                    options = emptyList(),
                    correctOptionId = "1922",
                    explanation = "London was compelled to issue a unilateral declaration of Egyptian independence on February 22, 1922.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10672,
                    questionNumber = 72,
                    totalQuestions = 100,
                    text = "Sudan became independent on 1 January _______, ending the Anglo-Egyptian Condominium.",
                    options = emptyList(),
                    correctOptionId = "1956",
                    explanation = "On 1 January 1956, the Anglo-Egyptian Condominium over Sudan ended.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10673,
                    questionNumber = 73,
                    totalQuestions = 100,
                    text = "The Algerian liberation movement that fought France from 1954 to 1962 was known by the acronym _______.",
                    options = emptyList(),
                    correctOptionId = "FLN",
                    explanation = "The National Liberation Front of Algeria (FLN), led by Ahmed Ben Bella, waged the liberation war.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10674,
                    questionNumber = 74,
                    totalQuestions = 100,
                    text = "Algeria was proclaimed independent on 1 July _______.",
                    options = emptyList(),
                    correctOptionId = "1962",
                    explanation = "Algeria was proclaimed independent on 1 July 1962.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10675,
                    questionNumber = 75,
                    totalQuestions = 100,
                    text = "Kwame Nkrumah founded the _______ Party in 1949 to lead Ghana's independence struggle.",
                    options = emptyList(),
                    correctOptionId = "Convention People's",
                    explanation = "In 1949, Kwame Nkrumah founded the Convention People's Party (CPP).",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10676,
                    questionNumber = 76,
                    totalQuestions = 100,
                    text = "Nigeria became independent from Britain in the year _______.",
                    options = emptyList(),
                    correctOptionId = "1960",
                    explanation = "All parties agreed on 1960, the year Nigeria became independent.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10677,
                    questionNumber = 77,
                    totalQuestions = 100,
                    text = "Guinea (Conakry), under the leadership of _______, voted NO to the 1958 French referendum.",
                    options = emptyList(),
                    correctOptionId = "Sekou Toure",
                    explanation = "Guinea, under the leadership of Sekou Toure, voted NO to the referendum.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10678,
                    questionNumber = 78,
                    totalQuestions = 100,
                    text = "The Kenyan peasant revolt against British settlers (1952-55) was known as the _______ uprising.",
                    options = emptyList(),
                    correctOptionId = "Mau Mau",
                    explanation = "Dispossessed peasants organised a revolt known as Mau Mau between 1952 and 1955.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10679,
                    questionNumber = 79,
                    totalQuestions = 100,
                    text = "Jomo Kenyatta became Kenya's first president after independence in _______.",
                    options = emptyList(),
                    correctOptionId = "1963",
                    explanation = "Kenya won independence in 1963 and Kenyatta became its first president.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10680,
                    questionNumber = 80,
                    totalQuestions = 100,
                    text = "_______ founded the Congo National Movement (MNC) in 1958.",
                    options = emptyList(),
                    correctOptionId = "Patrice Lumumba",
                    explanation = "The Congo National Movement was launched in 1958 by Patrice Lumumba.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10681,
                    questionNumber = 81,
                    totalQuestions = 100,
                    text = "The Belgian Congo achieved independence on 30 June _______.",
                    options = emptyList(),
                    correctOptionId = "1960",
                    explanation = "The Belgian Congo achieved independence on 30 June 1960.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10682,
                    questionNumber = 82,
                    totalQuestions = 100,
                    text = "Patrice Lumumba was kidnapped and executed on 17 January _______.",
                    options = emptyList(),
                    correctOptionId = "1961",
                    explanation = "On 17 January 1961, Katangan forces and Belgian Paratroopers kidnapped and executed Lumumba.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10683,
                    questionNumber = 83,
                    totalQuestions = 100,
                    text = "The African National Congress (ANC) was formed in South Africa in _______.",
                    options = emptyList(),
                    correctOptionId = "1912",
                    explanation = "The African National Congress (ANC) was formed in 1912.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10684,
                    questionNumber = 84,
                    totalQuestions = 100,
                    text = "The policy of racial segregation instituted by South Africa's Afrikaner National Party was called _______.",
                    options = emptyList(),
                    correctOptionId = "Apartheid",
                    explanation = "The Afrikaner National Party promoted a policy of discrimination known as apartheid.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10685,
                    questionNumber = 85,
                    totalQuestions = 100,
                    text = "The _______ Massacre occurred on March 21, 1960, when police killed 72 peaceful demonstrators.",
                    options = emptyList(),
                    correctOptionId = "Sharpeville",
                    explanation = "On 21 March 1960, police fired on peaceful demonstrators at Sharpeville, an event known as the Sharpeville massacre.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10686,
                    questionNumber = 86,
                    totalQuestions = 100,
                    text = "Nelson Mandela was imprisoned for most of his sentence at _______ Island.",
                    options = emptyList(),
                    correctOptionId = "Robben",
                    explanation = "Mandela was in jail at Robben Island until he was released in 1990.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10687,
                    questionNumber = 87,
                    totalQuestions = 100,
                    text = "Nelson Mandela became the first democratically elected president of South Africa in _______.",
                    options = emptyList(),
                    correctOptionId = "1994",
                    explanation = "In April 1994, Mandela won the election and became the first democratically elected president.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10688,
                    questionNumber = 88,
                    totalQuestions = 100,
                    text = "The Organization of African Unity (OAU) was established in Addis Ababa in May _______.",
                    options = emptyList(),
                    correctOptionId = "1963",
                    explanation = "African states established the OAU in Addis Ababa in May 1963.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10689,
                    questionNumber = 89,
                    totalQuestions = 100,
                    text = "The _______ Group favored a strong political union along the lines of Nkrumah's 'United States of Africa'.",
                    options = emptyList(),
                    correctOptionId = "Casablanca",
                    explanation = "The Casablanca Group favored a strong political union along Nkrumah's lines.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10690,
                    questionNumber = 90,
                    totalQuestions = 100,
                    text = "The African Union (AU) was officially launched in July 2002 in _______, South Africa.",
                    options = emptyList(),
                    correctOptionId = "Durban",
                    explanation = "The AU was officially launched in July 2002 in Durban, South Africa.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10691,
                    questionNumber = 91,
                    totalQuestions = 100,
                    text = "The African Economic Community (AEC) was established under the _______ Treaty of 1991.",
                    options = emptyList(),
                    correctOptionId = "Abuja",
                    explanation = "The African Economic Community (AEC) was established under the Abuja Treaty (1991).",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10692,
                    questionNumber = 92,
                    totalQuestions = 100,
                    text = "_______, a regional economic community with 21 members, was formed in December 1994.",
                    options = emptyList(),
                    correctOptionId = "COMESA",
                    explanation = "COMESA was formed in December 1994, replacing a Preferential Trade Area since 1981.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10693,
                    questionNumber = 93,
                    totalQuestions = 100,
                    text = "The Biafra War is also known as the _______ Civil War.",
                    options = emptyList(),
                    correctOptionId = "Nigerian",
                    explanation = "The Biafra War, also known as the Nigerian Civil War, began shortly after Nigeria's independence.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10694,
                    questionNumber = 94,
                    totalQuestions = 100,
                    text = "The Rwandan Genocide of 1994 resulted in approximately _______ deaths, mostly Tutsi.",
                    options = emptyList(),
                    correctOptionId = "800,000",
                    explanation = "The Rwandan Genocide resulted in 800,000 deaths, the majority being Tutsi.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10695,
                    questionNumber = 95,
                    totalQuestions = 100,
                    text = "Ian Smith declared the Unilateral Declaration of Independence (UDI) in Southern Rhodesia in _______.",
                    options = emptyList(),
                    correctOptionId = "1965",
                    explanation = "In 1965, the white settlers under Ian Smith declared the Unilateral Declaration of Independence.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10696,
                    questionNumber = 96,
                    totalQuestions = 100,
                    text = "Robert Mugabe became the first Prime Minister when Southern Rhodesia became _______ in 1980.",
                    options = emptyList(),
                    correctOptionId = "Zimbabwe",
                    explanation = "Majority rule was established in April 1980, and South Rhodesia adopted the name Zimbabwe.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10697,
                    questionNumber = 97,
                    totalQuestions = 100,
                    text = "South-West Africa won independence in 1990 and was renamed _______.",
                    options = emptyList(),
                    correctOptionId = "Namibia",
                    explanation = "South-West Africa finally won its independence in 1990 and was renamed Namibia.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10698,
                    questionNumber = 98,
                    totalQuestions = 100,
                    text = "The struggle for Namibian independence against South Africa was led by the organization _______.",
                    options = emptyList(),
                    correctOptionId = "SWAPO",
                    explanation = "The struggle was organised and led by the South-West African People's Organization (SWAPO).",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10699,
                    questionNumber = 99,
                    totalQuestions = 100,
                    text = "Habib Bourguiba led Tunisia to independence in 1956 as head of the _______ Party.",
                    options = emptyList(),
                    correctOptionId = "Neo-Destour",
                    explanation = "Tunisia won independence in 1956 under Habib Bourguiba, who headed the Neo-Destour Party.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10700,
                    questionNumber = 100,
                    totalQuestions = 100,
                    text = "Milton Obote led Uganda to independence in _______ as prime minister.",
                    options = emptyList(),
                    correctOptionId = "1962",
                    explanation = "Uganda attained independence in 1962 under the prime ministership of Milton Obote.",
                    type = QuestionType.FILL_IN_THE_BLANK
                )
            )
        ),
        "hist_u8" to Quiz(
            id = "quiz_history_u8_full",
            title = "Post-1991 Developments in Ethiopia Quiz",
            subject = "History",
            durationMinutes = 45,
            gradeLevel = "Grade 10",
            iconName = "pillar",
            unitId = "hist_u8",
            subjectId = "history",
            questions = listOf(
                Question(
                    id = 10701,
                    questionNumber = 1,
                    totalQuestions = 100,
                    text = "The EPRDF that toppled the Derg was dominated by the Tigray People's Liberation Front (TPLF).",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The EPRDF, a coalition of ethno-nationalist forces, was dominated by the TPLF."
                ),
                Question(
                    id = 10702,
                    questionNumber = 2,
                    totalQuestions = 100,
                    text = "The May 1991 London Conference was sponsored by the Soviet Union.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "The May 1991 London Conference was sponsored by the United States of America."
                ),
                Question(
                    id = 10703,
                    questionNumber = 3,
                    totalQuestions = 100,
                    text = "Addis Ababa was occupied by insurgents on May 28, 1991, overtaking the London Conference talks.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Addis Ababa was occupied by the insurgents on May 28, 1991, overtaking the conference."
                ),
                Question(
                    id = 10704,
                    questionNumber = 4,
                    totalQuestions = 100,
                    text = "Herman Cohen served as a mediator at the London Conference of 1991.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The United States Assistant Secretary for African Affairs, Herman Cohen, served as a mediator."
                ),
                Question(
                    id = 10705,
                    questionNumber = 5,
                    totalQuestions = 100,
                    text = "Meles Zenawi chaired the Ethiopian Democratic and Peaceful Transitional Conference of July 1991.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The July 1991 conference was chaired by Meles Zenawi."
                ),
                Question(
                    id = 10706,
                    questionNumber = 6,
                    totalQuestions = 100,
                    text = "The Transitional Charter established 14 self-governing regions of nations, nationalities, and peoples.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The Transitional Charter also established 14 'self-governing regions' of 'nations, nationalities, and peoples'."
                ),
                Question(
                    id = 10707,
                    questionNumber = 7,
                    totalQuestions = 100,
                    text = "The 1995 FDRE Constitution established Ethiopia as a federation of nine states and two city administrations.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The federal constitution makes contemporary Ethiopia a composite of nine states and two city administrations."
                ),
                Question(
                    id = 10708,
                    questionNumber = 8,
                    totalQuestions = 100,
                    text = "The 1995 constitution is a document of 106 articles contained in eleven chapters.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The 1995 Federal Constitution is a document of 106 articles contained in eleven chapters."
                ),
                Question(
                    id = 10709,
                    questionNumber = 9,
                    totalQuestions = 100,
                    text = "Article 39 of the FDRE Constitution recognizes the right of ethno-national communities to secede.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Ethno-national communities have the right to 'a full measure of self-governance' and even the right to secede (Article 39)."
                ),
                Question(
                    id = 10710,
                    questionNumber = 10,
                    totalQuestions = 100,
                    text = "The House of Federation (HoF) is tasked mainly with constitutional interpretation.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The House of Federation's main task is constitutional interpretation (Article 62)."
                ),
                Question(
                    id = 10711,
                    questionNumber = 11,
                    totalQuestions = 100,
                    text = "Oromia State accounts for about one-third of Ethiopia's total landmass.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Oromia State accounts for one-third of the country's total landmass."
                ),
                Question(
                    id = 10712,
                    questionNumber = 12,
                    totalQuestions = 100,
                    text = "Harari State is the largest regional state in the Ethiopian federation by land area.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "Harari State is by far the smallest regional state at only 340 square kilometers."
                ),
                Question(
                    id = 10713,
                    questionNumber = 13,
                    totalQuestions = 100,
                    text = "Amharic was chosen as the working language at the federal level in Ethiopia.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Amharic was chosen as the working language at the federal level, although all languages are declared equal."
                ),
                Question(
                    id = 10714,
                    questionNumber = 14,
                    totalQuestions = 100,
                    text = "Together, the Oromo and Amhara ethnic groups constitute around 70 percent of Ethiopia's population.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The ethnic composition reveals that together the Oromos and Amharas constitute around 70 per cent."
                ),
                Question(
                    id = 10715,
                    questionNumber = 15,
                    totalQuestions = 100,
                    text = "The Nile is the world's longest river, flowing south to north for about 6,825 km.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The Nile is the world's longest river, flowing south to north for about 6,825 km."
                ),
                Question(
                    id = 10716,
                    questionNumber = 16,
                    totalQuestions = 100,
                    text = "The Blue Nile contributes about 86% of the annual volume of water to the Nile.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The Blue Nile contributes about 86% of the annual volume of water to the Nile."
                ),
                Question(
                    id = 10717,
                    questionNumber = 17,
                    totalQuestions = 100,
                    text = "Ethiopia historically utilized over half of the Nile's waters despite contributing most of its volume.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "Ethiopia utilized less than 1% of the Nile's waters historically, despite contributing about 86% of its volume."
                ),
                Question(
                    id = 10718,
                    questionNumber = 18,
                    totalQuestions = 100,
                    text = "The 1929 Agreement gave Egypt the right to veto any project on the Nile that could adversely affect its interests.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The 1929 Agreement gave Egypt the right to veto any project on the Nile that could adversely affect its interests."
                ),
                Question(
                    id = 10719,
                    questionNumber = 19,
                    totalQuestions = 100,
                    text = "Under the 1959 Agreement, Egypt was granted 55.5 billion cubic meters of Nile water per annum.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The 1959 Agreement granted Egypt 55.5 billion cubic meters per annum, and Sudan 18.5 billion cubic meters."
                ),
                Question(
                    id = 10720,
                    questionNumber = 20,
                    totalQuestions = 100,
                    text = "The Nile Basin Initiative (NBI) was established on 22 February 1999 in Dar es Salaam, Tanzania.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The Nile Basin Initiative was established on 22 February 1999, signed in Dar es Salaam, Tanzania."
                ),
                Question(
                    id = 10721,
                    questionNumber = 21,
                    totalQuestions = 100,
                    text = "Construction of the Grand Ethiopian Renaissance Dam (GERD) began in April 2011.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Construction of the Grand Ethiopian Renaissance Dam started in April 2011."
                ),
                Question(
                    id = 10722,
                    questionNumber = 22,
                    totalQuestions = 100,
                    text = "The GERD is being built on the Tekeze River in the Somali region of Ethiopia.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "The GERD is being built on the Abay (Blue Nile) River in the Benishangul-Gumuz region."
                ),
                Question(
                    id = 10723,
                    questionNumber = 23,
                    totalQuestions = 100,
                    text = "The Transitional Government of Ethiopia adopted a free-market economic model in 1992.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "In 1992, the TGE adopted a free-market economic model, a departure from the previous socialist model."
                ),
                Question(
                    id = 10724,
                    questionNumber = 24,
                    totalQuestions = 100,
                    text = "Ethiopia's economy grew at around 10.9% per annum from 2005 to 2015.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The economy grew to impressive levels of around 10.9% per annum from 2005 to 2015."
                ),
                Question(
                    id = 10725,
                    questionNumber = 25,
                    totalQuestions = 100,
                    text = "Ethiopia's road network grew from about 18,000 km in 1991 to over 120,000 km in recent years.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The road network has grown from 18,000 km in 1991 to over 120,000 km nowadays."
                ),
                Question(
                    id = 10726,
                    questionNumber = 26,
                    totalQuestions = 100,
                    text = "The first two Ethiopian elections (1995 and 2000) were largely boycotted by the opposition.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The first two elections were largely boycotted by the opposition, undermining the political process' legitimacy."
                ),
                Question(
                    id = 10727,
                    questionNumber = 27,
                    totalQuestions = 100,
                    text = "In the 2005 election, the opposition won all federal parliamentary seats in Addis Ababa.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "In Addis Ababa, the opposition won all the federal parliamentary seats as well as city council seats."
                ),
                Question(
                    id = 10728,
                    questionNumber = 28,
                    totalQuestions = 100,
                    text = "Violent protests following the 2005 election claimed the lives of more than 200 protesters.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The controversy surrounding the 2005 election sparked violent protests that claimed more than 200 lives."
                ),
                Question(
                    id = 10729,
                    questionNumber = 29,
                    totalQuestions = 100,
                    text = "The Agricultural-led Development of Industrialization (ALDI) strategy aimed to industrialize Ethiopia's agrarian economy.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The ALDI strategy was adopted to try to industrialize the predominantly agrarian economy of the country."
                ),
                Question(
                    id = 10730,
                    questionNumber = 30,
                    totalQuestions = 100,
                    text = "Ethiopia traverses through the highlands and contributes water to the Nile via the Blue Nile and Tekeze rivers.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The Nile's tributaries the Blue Nile and Tekeze flow from the highlands of Ethiopia."
                ),
                Question(
                    id = 10731,
                    questionNumber = 31,
                    totalQuestions = 100,
                    text = "Which political coalition toppled the Marxist military junta (Derg) in 1991?",
                    options = listOf(
                        QuestionOption("a", "The Organization of African Unity"),
                        QuestionOption("b", "The Ethiopian People's Revolutionary Democratic Front (EPRDF)"),
                        QuestionOption("c", "The Warsaw Pact"),
                        QuestionOption("d", "The Eritrean Liberation Front")
                    ),
                    correctOptionId = "b",
                    explanation = "The Marxist military junta was toppled by the EPRDF, a coalition of ethno-nationalist forces."
                ),
                Question(
                    id = 10732,
                    questionNumber = 32,
                    totalQuestions = 100,
                    text = "Which organization dominated the EPRDF coalition?",
                    options = listOf(
                        QuestionOption("a", "The OPDO"),
                        QuestionOption("b", "The SEPDM"),
                        QuestionOption("c", "The Tigray People's Liberation Front (TPLF)"),
                        QuestionOption("d", "The EPDM")
                    ),
                    correctOptionId = "c",
                    explanation = "The EPRDF was dominated by the Tigray People's Liberation Front (TPLF)."
                ),
                Question(
                    id = 10733,
                    questionNumber = 33,
                    totalQuestions = 100,
                    text = "Who sponsored the May 1991 London Conference on Ethiopia's political transition?",
                    options = listOf(
                        QuestionOption("a", "The United Nations"),
                        QuestionOption("b", "The United States of America"),
                        QuestionOption("c", "The Soviet Union"),
                        QuestionOption("d", "The Organization of African Unity")
                    ),
                    correctOptionId = "b",
                    explanation = "The May 1991 London Conference was sponsored by the United States of America."
                ),
                Question(
                    id = 10734,
                    questionNumber = 34,
                    totalQuestions = 100,
                    text = "Who represented the EPRDF/TPLF at the May 1991 London Conference?",
                    options = listOf(
                        QuestionOption("a", "Isaias Afwerki"),
                        QuestionOption("b", "Meles Zenawi"),
                        QuestionOption("c", "Lencho Letta"),
                        QuestionOption("d", "Tesfaye Dinka")
                    ),
                    correctOptionId = "b",
                    explanation = "The EPRDF under TPLF leader Meles Zenawi attended the London Conference."
                ),
                Question(
                    id = 10735,
                    questionNumber = 35,
                    totalQuestions = 100,
                    text = "Who served as mediator at the May 1991 London Conference?",
                    options = listOf(
                        QuestionOption("a", "Herman Cohen"),
                        QuestionOption("b", "Woodrow Wilson"),
                        QuestionOption("c", "Kofi Annan"),
                        QuestionOption("d", "Boutros Boutros-Ghali")
                    ),
                    correctOptionId = "a",
                    explanation = "The United States Assistant Secretary for African Affairs, Herman Cohen, served as mediator."
                ),
                Question(
                    id = 10736,
                    questionNumber = 36,
                    totalQuestions = 100,
                    text = "What did the EPLF offer as a concession regarding Assab during the transitional negotiations?",
                    options = listOf(
                        QuestionOption("a", "Full annexation to Eritrea"),
                        QuestionOption("b", "Use as a free port for Ethiopia"),
                        QuestionOption("c", "Transfer to Sudan"),
                        QuestionOption("d", "A joint EPLF-EPRDF base")
                    ),
                    correctOptionId = "b",
                    explanation = "The EPLF sweetened the pill by offering Assab for the use of Ethiopia as a free port."
                ),
                Question(
                    id = 10737,
                    questionNumber = 37,
                    totalQuestions = 100,
                    text = "Who was elected chairman of the Council of Representatives and president of Ethiopia during the transitional period?",
                    options = listOf(
                        QuestionOption("a", "Negaso Gidada"),
                        QuestionOption("b", "Meles Zenawi"),
                        QuestionOption("c", "Mengistu Haile Mariam"),
                        QuestionOption("d", "Tesfaye Dinka")
                    ),
                    correctOptionId = "b",
                    explanation = "The Council of Representatives elected Meles Zenawi as chairman and president of Ethiopia."
                ),
                Question(
                    id = 10738,
                    questionNumber = 38,
                    totalQuestions = 100,
                    text = "How many self-governing regions of 'nations, nationalities, and peoples' did the Transitional Charter establish?",
                    options = listOf(
                        QuestionOption("a", "9"),
                        QuestionOption("b", "11"),
                        QuestionOption("c", "14"),
                        QuestionOption("d", "24")
                    ),
                    correctOptionId = "c",
                    explanation = "The Transitional Charter established 14 'self-governing regions' of nations, nationalities, and peoples."
                ),
                Question(
                    id = 10739,
                    questionNumber = 39,
                    totalQuestions = 100,
                    text = "The 1995 FDRE Constitution established Ethiopia as a federation of how many states and city administrations?",
                    options = listOf(
                        QuestionOption("a", "Nine states and two city administrations"),
                        QuestionOption("b", "Fourteen states and one city administration"),
                        QuestionOption("c", "Eleven states and no city administrations"),
                        QuestionOption("d", "Nine states and no city administrations")
                    ),
                    correctOptionId = "a",
                    explanation = "The federal constitution made Ethiopia a composite of nine states and two city administrations."
                ),
                Question(
                    id = 10740,
                    questionNumber = 40,
                    totalQuestions = 100,
                    text = "How many articles does the 1995 FDRE Constitution contain?",
                    options = listOf(
                        QuestionOption("a", "87"),
                        QuestionOption("b", "106"),
                        QuestionOption("c", "547"),
                        QuestionOption("d", "39")
                    ),
                    correctOptionId = "b",
                    explanation = "The 1995 Federal Constitution is a document of 106 articles contained in eleven chapters."
                ),
                Question(
                    id = 10741,
                    questionNumber = 41,
                    totalQuestions = 100,
                    text = "Which article of the FDRE Constitution recognizes the right of nations, nationalities, and peoples to self-determination, including secession?",
                    options = listOf(
                        QuestionOption("a", "Article 13"),
                        QuestionOption("b", "Article 39"),
                        QuestionOption("c", "Article 62"),
                        QuestionOption("d", "Article 106")
                    ),
                    correctOptionId = "b",
                    explanation = "The right to self-determination, including secession, is recognized in Article 39."
                ),
                Question(
                    id = 10742,
                    questionNumber = 42,
                    totalQuestions = 100,
                    text = "Which body is described as the supreme political organ under the FDRE Constitution?",
                    options = listOf(
                        QuestionOption("a", "The House of Federation"),
                        QuestionOption("b", "The House of Peoples' Representatives (HPR)"),
                        QuestionOption("c", "The Federal Supreme Court"),
                        QuestionOption("d", "The Council of Ministers")
                    ),
                    correctOptionId = "b",
                    explanation = "The House of Peoples' Representatives (HPR) is the supreme political organ in the country."
                ),
                Question(
                    id = 10743,
                    questionNumber = 43,
                    totalQuestions = 100,
                    text = "What is the main task of the House of Federation (HoF)?",
                    options = listOf(
                        QuestionOption("a", "Passing the federal budget"),
                        QuestionOption("b", "Constitutional interpretation"),
                        QuestionOption("c", "Electing the Prime Minister"),
                        QuestionOption("d", "Managing foreign affairs")
                    ),
                    correctOptionId = "b",
                    explanation = "The House of Federation's main task is constitutional interpretation (Article 62)."
                ),
                Question(
                    id = 10744,
                    questionNumber = 44,
                    totalQuestions = 100,
                    text = "Which regional state accounts for about one-third of Ethiopia's total landmass?",
                    options = listOf(
                        QuestionOption("a", "Amhara"),
                        QuestionOption("b", "SNNPRS"),
                        QuestionOption("c", "Oromia"),
                        QuestionOption("d", "Somali")
                    ),
                    correctOptionId = "c",
                    explanation = "Oromia State accounts for one-third of the country's total landmass."
                ),
                Question(
                    id = 10745,
                    questionNumber = 45,
                    totalQuestions = 100,
                    text = "Which regional state is the smallest in the Ethiopian federation, at only 340 square kilometers?",
                    options = listOf(
                        QuestionOption("a", "Gambella"),
                        QuestionOption("b", "Benishangul-Gumuz"),
                        QuestionOption("c", "Harari"),
                        QuestionOption("d", "Afar")
                    ),
                    correctOptionId = "c",
                    explanation = "The Harari State is by far the smallest at only 340 square kilometers."
                ),
                Question(
                    id = 10746,
                    questionNumber = 46,
                    totalQuestions = 100,
                    text = "Which language was chosen as the working language at the federal level in Ethiopia?",
                    options = listOf(
                        QuestionOption("a", "Afaan Oromo"),
                        QuestionOption("b", "Tigrigna"),
                        QuestionOption("c", "Amharic"),
                        QuestionOption("d", "Somali")
                    ),
                    correctOptionId = "c",
                    explanation = "Amharic was chosen as the working language at the federal level, although all languages are declared equal."
                ),
                Question(
                    id = 10747,
                    questionNumber = 47,
                    totalQuestions = 100,
                    text = "What are the three major tributaries of the Nile River?",
                    options = listOf(
                        QuestionOption("a", "Blue Nile, White Nile, and Tekeze"),
                        QuestionOption("b", "Blue Nile, Zambezi, and Congo"),
                        QuestionOption("c", "Awash, Blue Nile, and White Nile"),
                        QuestionOption("d", "Tekeze, Omo, and White Nile")
                    ),
                    correctOptionId = "a",
                    explanation = "The Nile has three major tributaries: the Blue Nile (Abay), the Tekeze (Atbara), and the White Nile."
                ),
                Question(
                    id = 10748,
                    questionNumber = 48,
                    totalQuestions = 100,
                    text = "What percentage of the Nile's annual water volume does the Blue Nile contribute?",
                    options = listOf(
                        QuestionOption("a", "About 25%"),
                        QuestionOption("b", "About 50%"),
                        QuestionOption("c", "About 86%"),
                        QuestionOption("d", "About 99%")
                    ),
                    correctOptionId = "c",
                    explanation = "The Blue Nile contributes about 86% of the annual volume of water to the Nile."
                ),
                Question(
                    id = 10749,
                    questionNumber = 49,
                    totalQuestions = 100,
                    text = "Despite contributing about 86% of the Nile's water, how much of it did Ethiopia historically utilize?",
                    options = listOf(
                        QuestionOption("a", "Less than 1%"),
                        QuestionOption("b", "About 25%"),
                        QuestionOption("c", "About 50%"),
                        QuestionOption("d", "About 75%")
                    ),
                    correctOptionId = "a",
                    explanation = "Ethiopia utilizes less than 1 per cent of the Nile up until recent times, despite contributing about 86%."
                ),
                Question(
                    id = 10750,
                    questionNumber = 50,
                    totalQuestions = 100,
                    text = "The 1929 Agreement on the Nile was signed between Egypt and:",
                    options = listOf(
                        QuestionOption("a", "Ethiopia"),
                        QuestionOption("b", "Great Britain (on behalf of Sudan)"),
                        QuestionOption("c", "Sudan directly"),
                        QuestionOption("d", "The League of Nations")
                    ),
                    correctOptionId = "b",
                    explanation = "The 1929 Agreement was between Great Britain, on behalf of Sudan, and Egypt."
                ),
                Question(
                    id = 10751,
                    questionNumber = 51,
                    totalQuestions = 100,
                    text = "Under the 1959 Agreement, how much Nile water was allocated to Egypt annually?",
                    options = listOf(
                        QuestionOption("a", "18.5 billion cubic meters"),
                        QuestionOption("b", "55.5 billion cubic meters"),
                        QuestionOption("c", "74 billion cubic meters"),
                        QuestionOption("d", "86 billion cubic meters")
                    ),
                    correctOptionId = "b",
                    explanation = "The 1959 Agreement granted Egypt 55.5 billion cubic meters per annum."
                ),
                Question(
                    id = 10752,
                    questionNumber = 52,
                    totalQuestions = 100,
                    text = "What was the Nile Basin Initiative (NBI), signed in 1999?",
                    options = listOf(
                        QuestionOption("a", "A military alliance among Nile states"),
                        QuestionOption("b", "An all-inclusive basin-wide institution for consultation and cooperation"),
                        QuestionOption("c", "A treaty giving Ethiopia full rights to the Nile"),
                        QuestionOption("d", "A UN peacekeeping mission")
                    ),
                    correctOptionId = "b",
                    explanation = "The NBI was the first all-inclusive basin-wide institution for consultation and coordination among Nile Basin states."
                ),
                Question(
                    id = 10753,
                    questionNumber = 53,
                    totalQuestions = 100,
                    text = "What agreement was signed between Ethiopia (Meles Zenawi) and Egypt (Hosni Mubarak) regarding general cooperation on the Nile?",
                    options = listOf(
                        QuestionOption("a", "The 1959 Agreement"),
                        QuestionOption("b", "The Cooperative Framework Agreement (CFA)"),
                        QuestionOption("c", "The Nile Basin Initiative"),
                        QuestionOption("d", "The Abuja Treaty")
                    ),
                    correctOptionId = "b",
                    explanation = "The Cooperative Framework Agreement (CFA) was signed between Ethiopia's Meles Zenawi and Egypt's Hosni Mubarak."
                ),
                Question(
                    id = 10754,
                    questionNumber = 54,
                    totalQuestions = 100,
                    text = "In which region of Ethiopia is the Grand Ethiopian Renaissance Dam (GERD) being built?",
                    options = listOf(
                        QuestionOption("a", "Amhara"),
                        QuestionOption("b", "Benishangul-Gumuz"),
                        QuestionOption("c", "Somali"),
                        QuestionOption("d", "Tigray")
                    ),
                    correctOptionId = "b",
                    explanation = "Ethiopia has embarked on constructing the GERD in the Benishangul-Gumuz region on the Abay River."
                ),
                Question(
                    id = 10755,
                    questionNumber = 55,
                    totalQuestions = 100,
                    text = "When did construction of the Grand Ethiopian Renaissance Dam begin?",
                    options = listOf(
                        QuestionOption("a", "April 2011"),
                        QuestionOption("b", "1999"),
                        QuestionOption("c", "1991"),
                        QuestionOption("d", "1959")
                    ),
                    correctOptionId = "a",
                    explanation = "Construction of the Grand Renaissance Dam started in April 2011."
                ),
                Question(
                    id = 10756,
                    questionNumber = 56,
                    totalQuestions = 100,
                    text = "What economic model did the TGE adopt in 1992, departing from the previous socialist system?",
                    options = listOf(
                        QuestionOption("a", "Command economy"),
                        QuestionOption("b", "Free-market economic model"),
                        QuestionOption("c", "State-controlled economy"),
                        QuestionOption("d", "Mixed economy under Derg control")
                    ),
                    correctOptionId = "b",
                    explanation = "In 1992, the TGE adopted a free-market economic model, a clear departure from the previous socialist model."
                ),
                Question(
                    id = 10757,
                    questionNumber = 57,
                    totalQuestions = 100,
                    text = "What was the Agricultural-led Development of Industrialization (ALDI) strategy intended to achieve?",
                    options = listOf(
                        QuestionOption("a", "Direct foreign military assistance"),
                        QuestionOption("b", "Industrializing the agrarian economy via agricultural productivity gains"),
                        QuestionOption("c", "Nationalizing all rural land"),
                        QuestionOption("d", "Replacing Amharic with English")
                    ),
                    correctOptionId = "b",
                    explanation = "ALDI aimed to industrialize the agrarian economy by improving agricultural productivity to stimulate industrial growth."
                ),
                Question(
                    id = 10758,
                    questionNumber = 58,
                    totalQuestions = 100,
                    text = "Approximately what growth rate did Ethiopia's economy reach from 2005 to 2015?",
                    options = listOf(
                        QuestionOption("a", "0.5% per annum"),
                        QuestionOption("b", "5.1% per annum"),
                        QuestionOption("c", "10.9% per annum"),
                        QuestionOption("d", "25% per annum")
                    ),
                    correctOptionId = "c",
                    explanation = "The economy grew to impressive levels of around 10.9% per annum from 2005 to 2015."
                ),
                Question(
                    id = 10759,
                    questionNumber = 59,
                    totalQuestions = 100,
                    text = "How much did Ethiopia's road network grow from 1991 to recent years?",
                    options = listOf(
                        QuestionOption("a", "From 18,000 km to over 120,000 km"),
                        QuestionOption("b", "From 5,000 km to 18,000 km"),
                        QuestionOption("c", "From 120,000 km to 200,000 km"),
                        QuestionOption("d", "From 1,000 km to 18,000 km")
                    ),
                    correctOptionId = "a",
                    explanation = "The road network grew from 18,000 km in 1991 to over 120,000 km nowadays."
                ),
                Question(
                    id = 10760,
                    questionNumber = 60,
                    totalQuestions = 100,
                    text = "Approximately how many Ethiopians still lived below the poverty line, according to the unit?",
                    options = listOf(
                        QuestionOption("a", "About 5 million"),
                        QuestionOption("b", "About 25 million"),
                        QuestionOption("c", "About 50 million"),
                        QuestionOption("d", "About 100 million")
                    ),
                    correctOptionId = "b",
                    explanation = "About 25 million people, around a quarter of the population, still live below the poverty line."
                ),
                Question(
                    id = 10761,
                    questionNumber = 61,
                    totalQuestions = 100,
                    text = "What characterized the first two Ethiopian elections (1995 and 2000)?",
                    options = listOf(
                        QuestionOption("a", "Full opposition participation and fair results"),
                        QuestionOption("b", "Largely boycotted by the opposition"),
                        QuestionOption("c", "Won overwhelmingly by CUD"),
                        QuestionOption("d", "Cancelled due to civil war")
                    ),
                    correctOptionId = "b",
                    explanation = "The first two elections were largely boycotted by the opposition, undermining legitimacy."
                ),
                Question(
                    id = 10762,
                    questionNumber = 62,
                    totalQuestions = 100,
                    text = "In the 2005 election, which two opposition alliances contested against the EPRDF?",
                    options = listOf(
                        QuestionOption("a", "CUD and UEDF"),
                        QuestionOption("b", "OLF and TPLF"),
                        QuestionOption("c", "EPDM and OPDO"),
                        QuestionOption("d", "SEPDM and SNNPRS")
                    ),
                    correctOptionId = "a",
                    explanation = "The major opposition alliances were the Coalition for Unity and Democracy (CUD) and the Union of Ethiopian Democratic Forces (UEDF)."
                ),
                Question(
                    id = 10763,
                    questionNumber = 63,
                    totalQuestions = 100,
                    text = "How many of the 547 parliamentary seats did the opposition win in the 2005 election?",
                    options = listOf(
                        QuestionOption("a", "Up to 173"),
                        QuestionOption("b", "All 547"),
                        QuestionOption("c", "Fewer than 10"),
                        QuestionOption("d", "300")
                    ),
                    correctOptionId = "a",
                    explanation = "The opposition made significant gains, winning up to 173 out of the 547 seats."
                ),
                Question(
                    id = 10764,
                    questionNumber = 64,
                    totalQuestions = 100,
                    text = "What was the annual economic growth rate of Ethiopia from 1981 to 1991, before the EPRDF came to power?",
                    options = listOf(
                        QuestionOption("a", "0.5% per annum"),
                        QuestionOption("b", "5.1% per annum"),
                        QuestionOption("c", "10.9% per annum"),
                        QuestionOption("d", "15% per annum")
                    ),
                    correctOptionId = "a",
                    explanation = "The country's economy grew from a baseline of 0.5% per annum from 1981 to 1991."
                ),
                Question(
                    id = 10765,
                    questionNumber = 65,
                    totalQuestions = 100,
                    text = "Approximately how many ethnic groups exist within the SNNPRS, prompting comparisons to 'a federation within a federation'?",
                    options = listOf(
                        QuestionOption("a", "About 10"),
                        QuestionOption("b", "About 30"),
                        QuestionOption("c", "Around 56"),
                        QuestionOption("d", "Over 100")
                    ),
                    correctOptionId = "c",
                    explanation = "The SNNPRS, having around 56 different groups, is so diverse it suggests 'a federation within a federation'."
                ),
                Question(
                    id = 10766,
                    questionNumber = 66,
                    totalQuestions = 100,
                    text = "Which countries share the 1959 Agreement's monopoly over Nile waters, according to the unit?",
                    options = listOf(
                        QuestionOption("a", "Egypt and Sudan"),
                        QuestionOption("b", "Ethiopia and Egypt"),
                        QuestionOption("c", "Sudan and Ethiopia"),
                        QuestionOption("d", "Egypt and Kenya")
                    ),
                    correctOptionId = "a",
                    explanation = "The 1959 Agreement strengthened a monopoly on the waters of the Nile by Egypt and Sudan."
                ),
                Question(
                    id = 10767,
                    questionNumber = 67,
                    totalQuestions = 100,
                    text = "How many countries does the Nile traverse, according to the unit?",
                    options = listOf(
                        QuestionOption("a", "Six"),
                        QuestionOption("b", "Eight"),
                        QuestionOption("c", "Eleven"),
                        QuestionOption("d", "Fifteen")
                    ),
                    correctOptionId = "c",
                    explanation = "The Nile traverses eleven countries in Africa, known as the Nile riparian countries."
                ),
                Question(
                    id = 10768,
                    questionNumber = 68,
                    totalQuestions = 100,
                    text = "What was a key criticism leveled at the FDRE Constitution's origins, according to the unit?",
                    options = listOf(
                        QuestionOption("a", "It was drafted entirely by foreign powers"),
                        QuestionOption("b", "It was seen as a formalization of the EPRDF's political program"),
                        QuestionOption("c", "It was never ratified"),
                        QuestionOption("d", "It abolished all regional states")
                    ),
                    correctOptionId = "b",
                    explanation = "The constitution was seen more as a formalization of the EPRDF's political program than a fresh political start."
                ),
                Question(
                    id = 10769,
                    questionNumber = 69,
                    totalQuestions = 100,
                    text = "The Tekeze River, one of the Nile's tributaries, originates from which mountains?",
                    options = listOf(
                        QuestionOption("a", "The Simien Mountains"),
                        QuestionOption("b", "The Bale Mountains"),
                        QuestionOption("c", "The Atlas Mountains"),
                        QuestionOption("d", "The Ahmar Mountains")
                    ),
                    correctOptionId = "a",
                    explanation = "The Tekeze River originates from the Siemen (Simien) Mountains, north-east of Lake Tana."
                ),
                Question(
                    id = 10770,
                    questionNumber = 70,
                    totalQuestions = 100,
                    text = "What did the Cooperative Framework Agreement (CFA) notably omit, according to the unit?",
                    options = listOf(
                        QuestionOption("a", "Any mention of Ethiopia"),
                        QuestionOption("b", "The 1959 Agreement and the principle of fair and equitable utilization"),
                        QuestionOption("c", "The GERD project"),
                        QuestionOption("d", "The Nile Basin Initiative")
                    ),
                    correctOptionId = "b",
                    explanation = "The CFA mentioned neither the 1959 Agreement nor the principle of 'fair and equitable utilization' that Ethiopia called for."
                ),
                Question(
                    id = 10771,
                    questionNumber = 71,
                    totalQuestions = 100,
                    text = "The Marxist military junta (Derg) was toppled in 1991 by the coalition known as the _______.",
                    options = emptyList(),
                    correctOptionId = "EPRDF",
                    explanation = "The Derg was toppled by a coalition of ethno-nationalist forces, the EPRDF.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10772,
                    questionNumber = 72,
                    totalQuestions = 100,
                    text = "The EPRDF coalition was dominated by the party known by the acronym _______.",
                    options = emptyList(),
                    correctOptionId = "TPLF",
                    explanation = "The EPRDF was dominated by the Tigray People's Liberation Front (TPLF).",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10773,
                    questionNumber = 73,
                    totalQuestions = 100,
                    text = "The May 1991 London Conference was sponsored by the _______.",
                    options = emptyList(),
                    correctOptionId = "United States of America",
                    explanation = "The May 1991 London Conference was sponsored by the United States of America.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10774,
                    questionNumber = 74,
                    totalQuestions = 100,
                    text = "_______ served as the US mediator at the 1991 London Conference.",
                    options = emptyList(),
                    correctOptionId = "Herman Cohen",
                    explanation = "Herman Cohen, the US Assistant Secretary for African Affairs, served as mediator.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10775,
                    questionNumber = 75,
                    totalQuestions = 100,
                    text = "Addis Ababa was occupied by the insurgents on May 28, _______.",
                    options = emptyList(),
                    correctOptionId = "1991",
                    explanation = "Addis Ababa was occupied by insurgents on May 28, 1991.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10776,
                    questionNumber = 76,
                    totalQuestions = 100,
                    text = "The Transitional Charter established _______ self-governing regions of nations, nationalities, and peoples.",
                    options = emptyList(),
                    correctOptionId = "14",
                    explanation = "The Transitional Charter established 14 self-governing regions.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10777,
                    questionNumber = 77,
                    totalQuestions = 100,
                    text = "The 1995 Constitution established the Federal Democratic Republic of Ethiopia, composed of nine states and _______ city administrations.",
                    options = emptyList(),
                    correctOptionId = "two",
                    explanation = "The federal constitution made Ethiopia a composite of nine states and two city administrations.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10778,
                    questionNumber = 78,
                    totalQuestions = 100,
                    text = "The 1995 FDRE Constitution contains _______ articles across eleven chapters.",
                    options = emptyList(),
                    correctOptionId = "106",
                    explanation = "The 1995 Federal Constitution is a document of 106 articles.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10779,
                    questionNumber = 79,
                    totalQuestions = 100,
                    text = "Article _______ of the FDRE Constitution recognizes the right of nations, nationalities and peoples to self-determination, up to secession.",
                    options = emptyList(),
                    correctOptionId = "39",
                    explanation = "The right to self-determination, including secession, is recognized in Article 39.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10780,
                    questionNumber = 80,
                    totalQuestions = 100,
                    text = "The body known as the _______ (HPR) is the supreme political organ under the FDRE Constitution, with members elected for five years.",
                    options = emptyList(),
                    correctOptionId = "House of Peoples' Representatives",
                    explanation = "The House of Peoples' Representatives (HPR) is the supreme political organ in the country.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10781,
                    questionNumber = 81,
                    totalQuestions = 100,
                    text = "The main task of the House of Federation is _______ interpretation.",
                    options = emptyList(),
                    correctOptionId = "constitutional",
                    explanation = "The House of Federation's main task is constitutional interpretation.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10782,
                    questionNumber = 82,
                    totalQuestions = 100,
                    text = "_______ State accounts for about one-third of Ethiopia's total landmass.",
                    options = emptyList(),
                    correctOptionId = "Oromia",
                    explanation = "Oromia State accounts for one-third of the country's total landmass.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10783,
                    questionNumber = 83,
                    totalQuestions = 100,
                    text = "_______ State is the smallest regional state in the Ethiopian federation, at 340 square kilometers.",
                    options = emptyList(),
                    correctOptionId = "Harari",
                    explanation = "The Harari State is by far the smallest at only 340 square kilometers.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10784,
                    questionNumber = 84,
                    totalQuestions = 100,
                    text = "_______ was chosen as the working language at the federal level of Ethiopia.",
                    options = emptyList(),
                    correctOptionId = "Amharic",
                    explanation = "Amharic was chosen as the working language at the federal level.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10785,
                    questionNumber = 85,
                    totalQuestions = 100,
                    text = "The Nile River flows for about _______ km from south to north.",
                    options = emptyList(),
                    correctOptionId = "6,825",
                    explanation = "The Nile is the world's longest river, flowing south to north for about 6,825 km.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10786,
                    questionNumber = 86,
                    totalQuestions = 100,
                    text = "The _______ Nile contributes about 86% of the annual volume of water to the Nile.",
                    options = emptyList(),
                    correctOptionId = "Blue",
                    explanation = "The Blue Nile contributes about 86% of the annual volume of water to the Nile.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10787,
                    questionNumber = 87,
                    totalQuestions = 100,
                    text = "The 1929 Agreement gave _______ the right to veto any Nile project affecting its interests.",
                    options = emptyList(),
                    correctOptionId = "Egypt",
                    explanation = "The 1929 Agreement gave Egypt the right to veto any project on the Nile affecting its interests.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10788,
                    questionNumber = 88,
                    totalQuestions = 100,
                    text = "Under the 1959 Agreement, Sudan's share of Nile water increased to _______ billion cubic meters.",
                    options = emptyList(),
                    correctOptionId = "18.5",
                    explanation = "The 1959 Agreement gave Sudan's share as 18.5 billion cubic meters.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10789,
                    questionNumber = 89,
                    totalQuestions = 100,
                    text = "The Nile Basin Initiative (NBI) was established on 22 February _______.",
                    options = emptyList(),
                    correctOptionId = "1999",
                    explanation = "The Nile Basin Initiative was established on 22 February 1999.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10790,
                    questionNumber = 90,
                    totalQuestions = 100,
                    text = "The Cooperative Framework Agreement was signed by Ethiopia's Meles Zenawi and Egypt's _______.",
                    options = emptyList(),
                    correctOptionId = "Hosni Mubarak",
                    explanation = "The CFA was signed between Ethiopia's Meles Zenawi and Egypt's Hosni Mubarak.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10791,
                    questionNumber = 91,
                    totalQuestions = 100,
                    text = "Construction of the Grand Ethiopian Renaissance Dam began in April _______.",
                    options = emptyList(),
                    correctOptionId = "2011",
                    explanation = "Construction of the Grand Renaissance Dam started in April 2011.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10792,
                    questionNumber = 92,
                    totalQuestions = 100,
                    text = "The GERD is being built in the _______ region of Ethiopia on the Abay River.",
                    options = emptyList(),
                    correctOptionId = "Benishangul-Gumuz",
                    explanation = "Ethiopia is constructing the GERD in the Benishangul-Gumuz region on the Abay River.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10793,
                    questionNumber = 93,
                    totalQuestions = 100,
                    text = "In 1992, the TGE adopted a _______-market economic model, departing from the previous socialist system.",
                    options = emptyList(),
                    correctOptionId = "free",
                    explanation = "In 1992, the TGE adopted a free-market economic model.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10794,
                    questionNumber = 94,
                    totalQuestions = 100,
                    text = "The strategy adopted to industrialize Ethiopia's agrarian economy was known by the acronym _______.",
                    options = emptyList(),
                    correctOptionId = "ALDI",
                    explanation = "The Agricultural-led Development of Industrialization (ALDI) strategy aimed to industrialize the agrarian economy.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10795,
                    questionNumber = 95,
                    totalQuestions = 100,
                    text = "Ethiopia's economy grew at around _______% per annum from 2005 to 2015.",
                    options = emptyList(),
                    correctOptionId = "10.9",
                    explanation = "The economy grew to impressive levels of around 10.9% per annum from 2005 to 2015.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10796,
                    questionNumber = 96,
                    totalQuestions = 100,
                    text = "Ethiopia's road network grew from 18,000 km in 1991 to over _______ km in recent years.",
                    options = emptyList(),
                    correctOptionId = "120,000",
                    explanation = "The road network grew from 18,000 km in 1991 to over 120,000 km nowadays.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10797,
                    questionNumber = 97,
                    totalQuestions = 100,
                    text = "About _______ million Ethiopians, around a quarter of the population, still live below the poverty line.",
                    options = emptyList(),
                    correctOptionId = "25",
                    explanation = "About 25 million people, around a quarter of the population, still live below the poverty line.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10798,
                    questionNumber = 98,
                    totalQuestions = 100,
                    text = "In the 2005 election, the opposition and EPRDF each declared victory before all _______ had been counted.",
                    options = emptyList(),
                    correctOptionId = "votes",
                    explanation = "The ruling EPRDF and major opposition alliances declared themselves winners before all the votes had even been counted.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10799,
                    questionNumber = 99,
                    totalQuestions = 100,
                    text = "Violent protests after the 2005 election claimed the lives of more than _______ protesters.",
                    options = emptyList(),
                    correctOptionId = "200",
                    explanation = "The controversy surrounding the 2005 election sparked violent protests that claimed more than 200 lives.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10800,
                    questionNumber = 100,
                    totalQuestions = 100,
                    text = "The opposition coalition known as CUD refused to take up their seats in the _______ following the 2005 election.",
                    options = emptyList(),
                    correctOptionId = "parliament",
                    explanation = "Members of the CUD coalition refused to take up their seats in parliament.",
                    type = QuestionType.FILL_IN_THE_BLANK
                )
            )
        ),
        "hist_u9" to Quiz(
            id = "quiz_history_u9_full",
            title = "Indigenous Knowledge and Heritages of Ethiopia Quiz",
            subject = "History",
            durationMinutes = 45,
            gradeLevel = "Grade 10",
            iconName = "pillar",
            unitId = "hist_u9",
            subjectId = "history",
            questions = listOf(
                Question(
                    id = 10801,
                    questionNumber = 1,
                    totalQuestions = 100,
                    text = "Indigenous knowledge is often referred to as 'local knowledge' passed down through oral tradition.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Indigenous knowledge is often known as 'local knowledge', passed down through generation via oral tradition."
                ),
                Question(
                    id = 10802,
                    questionNumber = 2,
                    totalQuestions = 100,
                    text = "Indigenous knowledge systems have been proven to be socially undesirable and economically unviable.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "Indigenous knowledge systems have been proven to be socially desired, economically viable, and sustainable."
                ),
                Question(
                    id = 10803,
                    questionNumber = 3,
                    totalQuestions = 100,
                    text = "Indigenous knowledge is typically expressed in universal, globally standardized languages.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "Indigenous knowledge is expressed in local languages, not universal ones."
                ),
                Question(
                    id = 10804,
                    questionNumber = 4,
                    totalQuestions = 100,
                    text = "Mada'a is the indigenous mechanism of conflict resolution among the Afar people.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The indigenous mechanism of conflict resolution among the Afar is known as Mada'a."
                ),
                Question(
                    id = 10805,
                    questionNumber = 5,
                    totalQuestions = 100,
                    text = "Dagu is an indigenous information exchange system used by the Afar people.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Dagu is an indigenous, unique information exchange system used by the pastoral Afar."
                ),
                Question(
                    id = 10806,
                    questionNumber = 6,
                    totalQuestions = 100,
                    text = "The Gadaa system organizes the Oromo people into five classes that succeed each other every eight years.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "In the Gadaa system, people are organized into five Gadaa classes that succeed each other every eight years."
                ),
                Question(
                    id = 10807,
                    questionNumber = 7,
                    totalQuestions = 100,
                    text = "Jaarsummaa is the Oromo process of reconciliation carried out by a group of elders (Jaarsaas).",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Jaarsummaa is the process of reconciliation between conflicting individuals or groups by a group of Jaarsaas (elders)."
                ),
                Question(
                    id = 10808,
                    questionNumber = 8,
                    totalQuestions = 100,
                    text = "Gumaa refers to blood money paid to a slain person's family or compensation to seriously injured individuals among the Oromo.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Gumaa refers to the blood money paid to the slain's family or payment to seriously injured individuals."
                ),
                Question(
                    id = 10809,
                    questionNumber = 9,
                    totalQuestions = 100,
                    text = "Siinqee is a stick symbolizing socially sanctioned rights exercised by Oromo women.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Siinqee (Siiqee) is a stick symbolizing a socially sanctioned set of rights exercised by women."
                ),
                Question(
                    id = 10810,
                    questionNumber = 10,
                    totalQuestions = 100,
                    text = "Shimgelina is the main indigenous conflict resolution mechanism among the Amhara people.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Among the Amhara people, the main indigenous conflict resolution mechanism is Shimgelina."
                ),
                Question(
                    id = 10811,
                    questionNumber = 11,
                    totalQuestions = 100,
                    text = "In Shimgelina, five Shimageles (elders) are appointed by the disputing parties themselves.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "In Shimgelina, five Shimageles (elders) would be appointed by the disputing parties themselves."
                ),
                Question(
                    id = 10812,
                    questionNumber = 12,
                    totalQuestions = 100,
                    text = "The Sidama Luwa system has five rotating age grades, each lasting eight years.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The Luwa system has five rotating age grades: Darara, Fullassa, Hirobora, Wawassa, and Mogissa, each rotating every 8 years."
                ),
                Question(
                    id = 10813,
                    questionNumber = 13,
                    totalQuestions = 100,
                    text = "The Sidama moral code of 'halale' refers to the ultimate truth, distinguishing good from evil.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The Sidama moral code halale provides the basis for distinguishing 'good' and 'evil'."
                ),
                Question(
                    id = 10814,
                    questionNumber = 14,
                    totalQuestions = 100,
                    text = "In Kambata and Hadiya culture, Seera refers to the code of behaviour followed and internalized by the people.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Seera refers to the code of behaviour that is followed and internalized by the people in Kambata and Hadiya culture."
                ),
                Question(
                    id = 10815,
                    questionNumber = 15,
                    totalQuestions = 100,
                    text = "Tangible heritage refers only to intangible practices like songs and rituals.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "Tangible Heritage refers to physical artifacts, buildings, historic places, and monuments — not intangible practices."
                ),
                Question(
                    id = 10816,
                    questionNumber = 16,
                    totalQuestions = 100,
                    text = "The Rock-hewn Churches of Lalibela were registered by UNESCO as a World Heritage Site in 1978.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The Rock-hewn Churches of Lalibela were registered by UNESCO as a World Heritage Site in 1978."
                ),
                Question(
                    id = 10817,
                    questionNumber = 17,
                    totalQuestions = 100,
                    text = "Axum and its archaeological sites were included in the List of World Heritage Sites in 1980.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Axum and its archaeological sites were included in the List of World Heritage Sites in 1980."
                ),
                Question(
                    id = 10818,
                    questionNumber = 18,
                    totalQuestions = 100,
                    text = "The Simien Mountains National Park is home to the Gelada baboon, the Simien fox, and the Walia ibex.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The Park is home to rare animals such as the Gelada baboon, the Simien fox, and the Walia ibex."
                ),
                Question(
                    id = 10819,
                    questionNumber = 19,
                    totalQuestions = 100,
                    text = "Harar Jugol was registered by UNESCO as a World Heritage Site in 2006.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The Historic City of Harar (Jugol) was registered by UNESCO as a World Heritage Site in 2006."
                ),
                Question(
                    id = 10820,
                    questionNumber = 20,
                    totalQuestions = 100,
                    text = "The Konso Cultural Landscape was inscribed on the World Heritage list in 2011.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The Konso Cultural Landscape was inscribed on the world heritage list in 2011."
                ),
                Question(
                    id = 10821,
                    questionNumber = 21,
                    totalQuestions = 100,
                    text = "The Gadaa system was inscribed on the UNESCO representative list of intangible cultural heritage in 2016.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Gadaa was inscribed on the representative list of the intangible cultural heritage of humanity in 2016."
                ),
                Question(
                    id = 10822,
                    questionNumber = 22,
                    totalQuestions = 100,
                    text = "Fichee-Chambalaalla is a New Year celebration of the Sidama people, inscribed by UNESCO in 2015.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Fichee-Chambalaalla was inscribed on the representative list of intangible cultural heritage of humanity in 2015."
                ),
                Question(
                    id = 10823,
                    questionNumber = 23,
                    totalQuestions = 100,
                    text = "Timket (Ethiopian Epiphany) was inscribed on the UNESCO intangible cultural heritage list in 2019.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Timket became Ethiopia's fourth entry in the UNESCO intangible cultural heritage list in 2019."
                ),
                Question(
                    id = 10824,
                    questionNumber = 24,
                    totalQuestions = 100,
                    text = "Ashenda/Ashendiye is a festival primarily celebrated by boys and young men.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "Ashenda, Ashendiye, Shaday or Solel is a festival solely for girls and young women in Tigray and Amhara."
                ),
                Question(
                    id = 10825,
                    questionNumber = 25,
                    totalQuestions = 100,
                    text = "Irreecha is the annual Oromo thanksgiving celebrated at the beginning of the spring season (Birra).",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Irreecha is the annual thanksgiving day of Oromo celebrated at the beginning of Birra (spring)."
                ),
                Question(
                    id = 10826,
                    questionNumber = 26,
                    totalQuestions = 100,
                    text = "Ethiopian manuscripts have traditionally been written in the Ge'ez language.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Ethiopia has a written tradition in the Ge'ez language, with manuscripts flourishing after Christianity's introduction."
                ),
                Question(
                    id = 10827,
                    questionNumber = 27,
                    totalQuestions = 100,
                    text = "The Temple of Yeha is dated to around 700 BC, built in the Sabaean style.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The Temple of Yeha is a tower built in the Sabaean style, dated to around 700 BC."
                ),
                Question(
                    id = 10828,
                    questionNumber = 28,
                    totalQuestions = 100,
                    text = "The Sof Omar cave system was formed by the Weyb River carving a channel through limestone.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The Sof Omar cave system was formed by the Weyb River as it carved a new channel through limestone foothills."
                ),
                Question(
                    id = 10829,
                    questionNumber = 29,
                    totalQuestions = 100,
                    text = "The Halala Keela (Halala Kab) wall of Dawuro was constructed during the reign of King Halala.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The construction of the Dawuro dry-stone walls was probably completed during the reign of King Halala."
                ),
                Question(
                    id = 10830,
                    questionNumber = 30,
                    totalQuestions = 100,
                    text = "Ethiopia has a written manuscript tradition dating back to the introduction of Christianity in the 4th century.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "After the introduction of Christianity in the 4th century, Ethiopian manuscripts flourished."
                ),
                Question(
                    id = 10831,
                    questionNumber = 31,
                    totalQuestions = 100,
                    text = "What is indigenous knowledge often referred to as?",
                    options = listOf(
                        QuestionOption("a", "Global knowledge"),
                        QuestionOption("b", "Local knowledge"),
                        QuestionOption("c", "Formal education"),
                        QuestionOption("d", "Scientific method")
                    ),
                    correctOptionId = "b",
                    explanation = "Indigenous knowledge is often known as 'local knowledge', passed down orally from generation to generation."
                ),
                Question(
                    id = 10832,
                    questionNumber = 32,
                    totalQuestions = 100,
                    text = "How is indigenous knowledge typically transmitted, according to the unit?",
                    options = listOf(
                        QuestionOption("a", "Through formal written textbooks only"),
                        QuestionOption("b", "Orally from generation to generation"),
                        QuestionOption("c", "Only through government institutions"),
                        QuestionOption("d", "Exclusively through the internet")
                    ),
                    correctOptionId = "b",
                    explanation = "Indigenous knowledge has been passed from generation to generation through oral tradition and practice."
                ),
                Question(
                    id = 10833,
                    questionNumber = 33,
                    totalQuestions = 100,
                    text = "Which of the following is NOT listed as a characteristic of indigenous knowledge?",
                    options = listOf(
                        QuestionOption("a", "It is simple and practical"),
                        QuestionOption("b", "It is expressed in local languages"),
                        QuestionOption("c", "It developed over a long period"),
                        QuestionOption("d", "It is standardized in a universal written language")
                    ),
                    correctOptionId = "d",
                    explanation = "Indigenous knowledge is expressed in local languages and is often oral, not standardized in a universal written form."
                ),
                Question(
                    id = 10834,
                    questionNumber = 34,
                    totalQuestions = 100,
                    text = "What is the indigenous conflict resolution mechanism of the Afar people called?",
                    options = listOf(
                        QuestionOption("a", "Gumaa"),
                        QuestionOption("b", "Mada'a"),
                        QuestionOption("c", "Shimgelina"),
                        QuestionOption("d", "Seera")
                    ),
                    correctOptionId = "b",
                    explanation = "The indigenous mechanism of conflict resolution among the Afar is known as Mada'a."
                ),
                Question(
                    id = 10835,
                    questionNumber = 35,
                    totalQuestions = 100,
                    text = "What is the name of the Afar people's indigenous information exchange system?",
                    options = listOf(
                        QuestionOption("a", "Dagu"),
                        QuestionOption("b", "Siinqee"),
                        QuestionOption("c", "Gadaa"),
                        QuestionOption("d", "Luwa")
                    ),
                    correctOptionId = "a",
                    explanation = "The Afar have an indigenous, unique information exchange system called Dagu."
                ),
                Question(
                    id = 10836,
                    questionNumber = 36,
                    totalQuestions = 100,
                    text = "The Gadaa system organizes the Oromo people into how many classes that succeed each other every eight years?",
                    options = listOf(
                        QuestionOption("a", "Three"),
                        QuestionOption("b", "Four"),
                        QuestionOption("c", "Five"),
                        QuestionOption("d", "Six")
                    ),
                    correctOptionId = "c",
                    explanation = "In the Gadaa system, the people are grouped into five Gadaa classes that succeed each other every eight years."
                ),
                Question(
                    id = 10837,
                    questionNumber = 37,
                    totalQuestions = 100,
                    text = "The foundation of the Gadaa system is rooted in which customary Oromo institutions?",
                    options = listOf(
                        QuestionOption("a", "Aadaa, seera, safuu, and heera"),
                        QuestionOption("b", "Mada'a and Dagu"),
                        QuestionOption("c", "Shimgelina and Jaarsummaa"),
                        QuestionOption("d", "Luwa and Seera")
                    ),
                    correctOptionId = "a",
                    explanation = "The Gadaa system is rooted in aadaa (custom), seera (laws), safuu (moral category/ethics), and heera (justice)."
                ),
                Question(
                    id = 10838,
                    questionNumber = 38,
                    totalQuestions = 100,
                    text = "What Oromo term refers to the process of reconciliation carried out by a group of elders (Jaarsaas)?",
                    options = listOf(
                        QuestionOption("a", "Jaarsummaa"),
                        QuestionOption("b", "Gumaa"),
                        QuestionOption("c", "Siinqee"),
                        QuestionOption("d", "Shimgelina")
                    ),
                    correctOptionId = "a",
                    explanation = "Jaarsummaa is the process of reconciliation between conflicting individuals or groups by Jaarsaas (elders)."
                ),
                Question(
                    id = 10839,
                    questionNumber = 39,
                    totalQuestions = 100,
                    text = "Among the Oromo, what does 'Gumaa' refer to?",
                    options = listOf(
                        QuestionOption("a", "A women's rights institution"),
                        QuestionOption("b", "Blood money/compensation paid in cases of homicide or serious injury"),
                        QuestionOption("c", "A New Year festival"),
                        QuestionOption("d", "An age-grade system")
                    ),
                    correctOptionId = "b",
                    explanation = "Gumaa refers to the blood money paid to the slain's family or compensation to seriously injured individuals."
                ),
                Question(
                    id = 10840,
                    questionNumber = 40,
                    totalQuestions = 100,
                    text = "What is 'heera' in the context of the Oromo Gumaa conflict resolution system?",
                    options = listOf(
                        QuestionOption("a", "A festival"),
                        QuestionOption("b", "Customary law and justice procedure"),
                        QuestionOption("c", "A type of stick"),
                        QuestionOption("d", "A New Year celebration")
                    ),
                    correctOptionId = "b",
                    explanation = "The nominated elder examines whether procedures followed are in line with heera (customary law and justice procedure)."
                ),
                Question(
                    id = 10841,
                    questionNumber = 41,
                    totalQuestions = 100,
                    text = "What is Siinqee (Siiqee) among the Oromo people?",
                    options = listOf(
                        QuestionOption("a", "A council of male elders only"),
                        QuestionOption("b", "A stick symbolizing a socially sanctioned set of rights for women"),
                        QuestionOption("c", "A type of cave"),
                        QuestionOption("d", "A form of currency")
                    ),
                    correctOptionId = "b",
                    explanation = "Siinqee is a stick symbolizing a socially sanctioned set of rights exercised by women."
                ),
                Question(
                    id = 10842,
                    questionNumber = 42,
                    totalQuestions = 100,
                    text = "What is the main indigenous conflict resolution mechanism among the Amhara people, comparable to Oromo Jaarsummaa?",
                    options = listOf(
                        QuestionOption("a", "Gumaa"),
                        QuestionOption("b", "Shimgelina"),
                        QuestionOption("c", "Dagu"),
                        QuestionOption("d", "Seera")
                    ),
                    correctOptionId = "b",
                    explanation = "Among the Amhara people, the main indigenous conflict resolution mechanism is Shimgelina."
                ),
                Question(
                    id = 10843,
                    questionNumber = 43,
                    totalQuestions = 100,
                    text = "How many Shimageles (elders) are typically appointed by disputing parties in Shimgelina?",
                    options = listOf(
                        QuestionOption("a", "Three"),
                        QuestionOption("b", "Four"),
                        QuestionOption("c", "Five"),
                        QuestionOption("d", "Seven")
                    ),
                    correctOptionId = "c",
                    explanation = "In Shimgelina, five Shimageles (elders) would be appointed by the disputing parties themselves."
                ),
                Question(
                    id = 10844,
                    questionNumber = 44,
                    totalQuestions = 100,
                    text = "Who often serves as chairman to make the Shimgelina process more acceptable to society?",
                    options = listOf(
                        QuestionOption("a", "A government official"),
                        QuestionOption("b", "A priest of the local church"),
                        QuestionOption("c", "A police officer"),
                        QuestionOption("d", "A university professor")
                    ),
                    correctOptionId = "b",
                    explanation = "In most cases, a priest of the local church serves as chairman to make Shimgelina more acceptable."
                ),
                Question(
                    id = 10845,
                    questionNumber = 45,
                    totalQuestions = 100,
                    text = "The Sidama Luwa system is administered by an age grade system where each grade rotates every how many years?",
                    options = listOf(
                        QuestionOption("a", "Five years"),
                        QuestionOption("b", "Eight years"),
                        QuestionOption("c", "Ten years"),
                        QuestionOption("d", "Twelve years")
                    ),
                    correctOptionId = "b",
                    explanation = "The Luwa system is administered by an age grade system where each grade rotates every 8 years."
                ),
                Question(
                    id = 10846,
                    questionNumber = 46,
                    totalQuestions = 100,
                    text = "Which of the following is NOT one of the five rotating age grades in the Sidama Luwa system?",
                    options = listOf(
                        QuestionOption("a", "Darara"),
                        QuestionOption("b", "Fullassa"),
                        QuestionOption("c", "Hirobora"),
                        QuestionOption("d", "Gumaa")
                    ),
                    correctOptionId = "d",
                    explanation = "The five Luwa age grades are Darara, Fullassa, Hirobora, Wawassa, and Mogissa — Gumaa is an Oromo term, not a Luwa grade."
                ),
                Question(
                    id = 10847,
                    questionNumber = 47,
                    totalQuestions = 100,
                    text = "What is the primary objective of the Sidama Luwa system regarding able-bodied men?",
                    options = listOf(
                        QuestionOption("a", "Recruitment and training for national defence"),
                        QuestionOption("b", "Organizing trade caravans"),
                        QuestionOption("c", "Building irrigation systems"),
                        QuestionOption("d", "Managing agricultural taxes")
                    ),
                    correctOptionId = "a",
                    explanation = "The first and most important objective of the Luwa system is recruiting and training able-bodied men for national defence."
                ),
                Question(
                    id = 10848,
                    questionNumber = 48,
                    totalQuestions = 100,
                    text = "The Sidama moral code that provides the basis for distinguishing good from evil is called:",
                    options = listOf(
                        QuestionOption("a", "Heera"),
                        QuestionOption("b", "Halale"),
                        QuestionOption("c", "Safuu"),
                        QuestionOption("d", "Seera")
                    ),
                    correctOptionId = "b",
                    explanation = "The Sidama moral code halale provides the basis for distinguishing 'good' and 'evil'."
                ),
                Question(
                    id = 10849,
                    questionNumber = 49,
                    totalQuestions = 100,
                    text = "In Kambata and Hadiya culture, what governs political administration, social involvement, and dispute resolution?",
                    options = listOf(
                        QuestionOption("a", "Gadaa"),
                        QuestionOption("b", "Seera"),
                        QuestionOption("c", "Luwa"),
                        QuestionOption("d", "Mada'a")
                    ),
                    correctOptionId = "b",
                    explanation = "In Kambata and Hadiya culture, Seera is the basis for political administration and dispute resolution."
                ),
                Question(
                    id = 10850,
                    questionNumber = 50,
                    totalQuestions = 100,
                    text = "What are the three main types of heritage identified in the unit?",
                    options = listOf(
                        QuestionOption("a", "Natural, tangible, and intangible"),
                        QuestionOption("b", "Cultural, political, and economic"),
                        QuestionOption("c", "Ancient, medieval, and modern"),
                        QuestionOption("d", "Religious, secular, and royal")
                    ),
                    correctOptionId = "a",
                    explanation = "There are different types of heritage: natural, tangible, and intangible heritages."
                ),
                Question(
                    id = 10851,
                    questionNumber = 51,
                    totalQuestions = 100,
                    text = "Which of the following is an example of intangible heritage?",
                    options = listOf(
                        QuestionOption("a", "The Stelae of Aksum"),
                        QuestionOption("b", "Fasil Ghebbi"),
                        QuestionOption("c", "Fichee-Chambalaalla"),
                        QuestionOption("d", "Harar Jugol")
                    ),
                    correctOptionId = "c",
                    explanation = "Fichee-Chambalaalla, a Sidama New Year celebration, is an intangible cultural heritage — the others are tangible sites."
                ),
                Question(
                    id = 10852,
                    questionNumber = 52,
                    totalQuestions = 100,
                    text = "The Stelae of Aksum were included in the UNESCO List of World Heritage Sites in which year?",
                    options = listOf(
                        QuestionOption("a", "1978"),
                        QuestionOption("b", "1980"),
                        QuestionOption("c", "2006"),
                        QuestionOption("d", "2011")
                    ),
                    correctOptionId = "b",
                    explanation = "Axum and its archaeological sites were included in the List of World Heritage Sites in 1980."
                ),
                Question(
                    id = 10853,
                    questionNumber = 53,
                    totalQuestions = 100,
                    text = "The Rock-hewn Churches of Lalibela were registered by UNESCO as a World Heritage Site in which year?",
                    options = listOf(
                        QuestionOption("a", "1978"),
                        QuestionOption("b", "1980"),
                        QuestionOption("c", "1996"),
                        QuestionOption("d", "2013")
                    ),
                    correctOptionId = "a",
                    explanation = "The Rock-hewn Churches of Lalibela were registered by UNESCO as a World Heritage Site in 1978."
                ),
                Question(
                    id = 10854,
                    questionNumber = 54,
                    totalQuestions = 100,
                    text = "Fasil Ghebbi, the premise of King Fasiledes, is located in which town?",
                    options = listOf(
                        QuestionOption("a", "Axum"),
                        QuestionOption("b", "Lalibela"),
                        QuestionOption("c", "Gondar"),
                        QuestionOption("d", "Harar")
                    ),
                    correctOptionId = "c",
                    explanation = "Fasil Ghebbi is found in Gondar town, the Royal enclosure of King Fasiledes."
                ),
                Question(
                    id = 10855,
                    questionNumber = 55,
                    totalQuestions = 100,
                    text = "The Simien Mountains National Park is home to which rare animals?",
                    options = listOf(
                        QuestionOption("a", "The Gelada baboon, Simien fox, and Walia ibex"),
                        QuestionOption("b", "Lions, elephants, and zebras"),
                        QuestionOption("c", "Gorillas and chimpanzees"),
                        QuestionOption("d", "Giraffes and rhinos")
                    ),
                    correctOptionId = "a",
                    explanation = "The Park is home to rare animals such as the Gelada baboon, the Simien fox, and the Walia ibex."
                ),
                Question(
                    id = 10856,
                    questionNumber = 56,
                    totalQuestions = 100,
                    text = "The Lower Valley of Awash, a UNESCO World Heritage Site, is significant for what kind of research?",
                    options = listOf(
                        QuestionOption("a", "Marine biology"),
                        QuestionOption("b", "Paleo-anthropological research"),
                        QuestionOption("c", "Volcanic geology"),
                        QuestionOption("d", "Medieval architecture")
                    ),
                    correctOptionId = "b",
                    explanation = "The Lower Valley of Awash is a site of Paleo-anthropological research."
                ),
                Question(
                    id = 10857,
                    questionNumber = 57,
                    totalQuestions = 100,
                    text = "The Tiya archaeological site, listed as a World Heritage Site in 1980, contains how many monuments?",
                    options = listOf(
                        QuestionOption("a", "16"),
                        QuestionOption("b", "24"),
                        QuestionOption("c", "36"),
                        QuestionOption("d", "50")
                    ),
                    correctOptionId = "c",
                    explanation = "The Tiya site contains 36 monuments, including 32 carved stelae covered with symbols."
                ),
                Question(
                    id = 10858,
                    questionNumber = 58,
                    totalQuestions = 100,
                    text = "The historic walled city of Harar (Jugol) was built during the time of which ruler?",
                    options = listOf(
                        QuestionOption("a", "King Fasiledes"),
                        QuestionOption("b", "Emir Nur Ibn Mujahid"),
                        QuestionOption("c", "King Halala"),
                        QuestionOption("d", "Emperor Menilek")
                    ),
                    correctOptionId = "b",
                    explanation = "The wall (Jugol) of Harar was built during the time of Emir Nur Ibn Mujahid in the 16th century."
                ),
                Question(
                    id = 10859,
                    questionNumber = 59,
                    totalQuestions = 100,
                    text = "The Konso Cultural Landscape, inscribed on the World Heritage list in 2011, is characterized by:",
                    options = listOf(
                        QuestionOption("a", "Rock-hewn churches"),
                        QuestionOption("b", "Stone-walled terraces and fortified settlements"),
                        QuestionOption("c", "Underground caves"),
                        QuestionOption("d", "Royal palaces")
                    ),
                    correctOptionId = "b",
                    explanation = "Konso Cultural Landscape is an arid property of stone-walled terraces and fortified settlements."
                ),
                Question(
                    id = 10860,
                    questionNumber = 60,
                    totalQuestions = 100,
                    text = "Meskel (the Finding of the True Cross) was inscribed on the UNESCO intangible cultural heritage list in which year?",
                    options = listOf(
                        QuestionOption("a", "2011"),
                        QuestionOption("b", "2013"),
                        QuestionOption("c", "2015"),
                        QuestionOption("d", "2019")
                    ),
                    correctOptionId = "b",
                    explanation = "Meskel was inscribed on the UNESCO Representative List of the Intangible Cultural Heritage of Humanity in 2013."
                ),
                Question(
                    id = 10861,
                    questionNumber = 61,
                    totalQuestions = 100,
                    text = "Gadaa, the indigenous democratic socio-political system of the Oromo, was inscribed on UNESCO's intangible heritage list in which year?",
                    options = listOf(
                        QuestionOption("a", "2013"),
                        QuestionOption("b", "2015"),
                        QuestionOption("c", "2016"),
                        QuestionOption("d", "2019")
                    ),
                    correctOptionId = "c",
                    explanation = "Gadaa was inscribed on the representative list of the intangible cultural heritage of humanity in 2016."
                ),
                Question(
                    id = 10862,
                    questionNumber = 62,
                    totalQuestions = 100,
                    text = "Timket (Ethiopian Epiphany) became Ethiopia's how many-th entry on the UNESCO intangible cultural heritage list, inscribed in 2019?",
                    options = listOf(
                        QuestionOption("a", "Second"),
                        QuestionOption("b", "Third"),
                        QuestionOption("c", "Fourth"),
                        QuestionOption("d", "Fifth")
                    ),
                    correctOptionId = "c",
                    explanation = "Timket became the fourth entry for Ethiopia in the list of UNESCO intangible cultural heritage in 2019."
                ),
                Question(
                    id = 10863,
                    questionNumber = 63,
                    totalQuestions = 100,
                    text = "Which festival is described as being solely for girls and young women in Tigray and Amhara regions?",
                    options = listOf(
                        QuestionOption("a", "Irreecha"),
                        QuestionOption("b", "Timket"),
                        QuestionOption("c", "Ashenda (Ashendiye)"),
                        QuestionOption("d", "Meskel")
                    ),
                    correctOptionId = "c",
                    explanation = "Ashenda, Ashendiye, Shaday or Solel is the biggest cultural festival solely for girls and young women."
                ),
                Question(
                    id = 10864,
                    questionNumber = 64,
                    totalQuestions = 100,
                    text = "Irreecha, the Oromo thanksgiving festival, is celebrated annually near which kind of location?",
                    options = listOf(
                        QuestionOption("a", "Mountain peaks only"),
                        QuestionOption("b", "River banks or water and trees"),
                        QuestionOption("c", "Deep forests only"),
                        QuestionOption("d", "Desert plains only")
                    ),
                    correctOptionId = "b",
                    explanation = "Irreecha is celebrated near the river bank or water and tree, at the beginning of Birra (spring)."
                ),
                Question(
                    id = 10865,
                    questionNumber = 65,
                    totalQuestions = 100,
                    text = "Ethiopian manuscripts have traditionally been written in which language?",
                    options = listOf(
                        QuestionOption("a", "Amharic"),
                        QuestionOption("b", "Ge'ez"),
                        QuestionOption("c", "Tigrigna"),
                        QuestionOption("d", "Oromiffa")
                    ),
                    correctOptionId = "b",
                    explanation = "Ethiopia has a written tradition in the Ge'ez language, and manuscripts flourished after Christianity's introduction."
                ),
                Question(
                    id = 10866,
                    questionNumber = 66,
                    totalQuestions = 100,
                    text = "What were the traditional writing materials for Ethiopian manuscripts?",
                    options = listOf(
                        QuestionOption("a", "Papyrus and charcoal"),
                        QuestionOption("b", "Parchment from goatskin and ink from plants/minerals"),
                        QuestionOption("c", "Clay tablets and stone chisels"),
                        QuestionOption("d", "Bamboo paper and synthetic ink")
                    ),
                    correctOptionId = "b",
                    explanation = "Writing materials included parchment from goatskin, ink from plants and minerals, and pens from reed or bamboo."
                ),
                Question(
                    id = 10867,
                    questionNumber = 67,
                    totalQuestions = 100,
                    text = "The Temple of Yeha, dated to around 700 BC, was built in which architectural style?",
                    options = listOf(
                        QuestionOption("a", "Gothic style"),
                        QuestionOption("b", "Sabaean style"),
                        QuestionOption("c", "Byzantine style"),
                        QuestionOption("d", "Axumite obelisk style")
                    ),
                    correctOptionId = "b",
                    explanation = "The Temple of Yeha is a tower built in the Sabaean style, dated to around 700 BC."
                ),
                Question(
                    id = 10868,
                    questionNumber = 68,
                    totalQuestions = 100,
                    text = "The Sof Omar cave system was formed by which river changing its course?",
                    options = listOf(
                        QuestionOption("a", "The Awash River"),
                        QuestionOption("b", "The Weyb River"),
                        QuestionOption("c", "The Omo River"),
                        QuestionOption("d", "The Abay River")
                    ),
                    correctOptionId = "b",
                    explanation = "The Sof Omar cave system was formed by the Weyb River as it carved a new channel through limestone."
                ),
                Question(
                    id = 10869,
                    questionNumber = 69,
                    totalQuestions = 100,
                    text = "The Halala Keela (Halala Kab) wall of Dawuro was bordered by which two rivers?",
                    options = listOf(
                        QuestionOption("a", "The Omo and Gojeb Rivers"),
                        QuestionOption("b", "The Awash and Wabe Rivers"),
                        QuestionOption("c", "The Blue Nile and Tekeze Rivers"),
                        QuestionOption("d", "The Baro and Akobo Rivers")
                    ),
                    correctOptionId = "a",
                    explanation = "The Dawuro wall was constructed on strategic defense positions, bordered by the Omo and Gojeb Rivers."
                ),
                Question(
                    id = 10870,
                    questionNumber = 70,
                    totalQuestions = 100,
                    text = "What did Ethiopia have special schools for, in Gondar and Shewa, related to manuscript production?",
                    options = listOf(
                        QuestionOption("a", "Calligraphy and bookbinding"),
                        QuestionOption("b", "Metalworking"),
                        QuestionOption("c", "Pottery"),
                        QuestionOption("d", "Weaving")
                    ),
                    correctOptionId = "a",
                    explanation = "There were special schools for calligraphy in Gondar and Shewa, and a school for bookbinding."
                ),
                Question(
                    id = 10871,
                    questionNumber = 71,
                    totalQuestions = 100,
                    text = "Indigenous knowledge is often known as '_______ knowledge'.",
                    options = emptyList(),
                    correctOptionId = "local",
                    explanation = "Indigenous knowledge is often known as 'local knowledge'.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10872,
                    questionNumber = 72,
                    totalQuestions = 100,
                    text = "The Afar people's indigenous conflict resolution mechanism is called _______.",
                    options = emptyList(),
                    correctOptionId = "Mada'a",
                    explanation = "The indigenous mechanism of conflict resolution among the Afar is known as Mada'a.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10873,
                    questionNumber = 73,
                    totalQuestions = 100,
                    text = "The Afar people's indigenous information exchange system is called _______.",
                    options = emptyList(),
                    correctOptionId = "Dagu",
                    explanation = "The Afar have an indigenous, unique information exchange system called Dagu.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10874,
                    questionNumber = 74,
                    totalQuestions = 100,
                    text = "In the Gadaa system, the Oromo people are organized into five classes that succeed each other every _______ years.",
                    options = emptyList(),
                    correctOptionId = "eight",
                    explanation = "The five Gadaa classes succeed each other every eight years.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10875,
                    questionNumber = 75,
                    totalQuestions = 100,
                    text = "The Oromo process of reconciliation carried out by a group of elders is called _______.",
                    options = emptyList(),
                    correctOptionId = "Jaarsummaa",
                    explanation = "Jaarsummaa is the process of reconciliation between conflicting individuals or groups by Jaarsaas.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10876,
                    questionNumber = 76,
                    totalQuestions = 100,
                    text = "Among the Oromo, _______ refers to the blood money paid to a slain person's family.",
                    options = emptyList(),
                    correctOptionId = "Gumaa",
                    explanation = "Gumaa refers to the blood money paid to the slain's family or compensation to injured individuals.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10877,
                    questionNumber = 77,
                    totalQuestions = 100,
                    text = "The Oromo term for customary law and justice procedure is _______.",
                    options = emptyList(),
                    correctOptionId = "heera",
                    explanation = "Heera refers to customary law and justice procedure among the Oromo.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10878,
                    questionNumber = 78,
                    totalQuestions = 100,
                    text = "_______ is a stick symbolizing a socially sanctioned set of rights exercised by Oromo women.",
                    options = emptyList(),
                    correctOptionId = "Siinqee",
                    explanation = "Siinqee (Siiqee) is a stick symbolizing a socially sanctioned set of rights exercised by women.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10879,
                    questionNumber = 79,
                    totalQuestions = 100,
                    text = "The main indigenous conflict resolution mechanism among the Amhara people is called _______.",
                    options = emptyList(),
                    correctOptionId = "Shimgelina",
                    explanation = "Among the Amhara people, the main indigenous conflict resolution mechanism is Shimgelina.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10880,
                    questionNumber = 80,
                    totalQuestions = 100,
                    text = "In Shimgelina, _______ elders (Shimageles) are appointed by the disputing parties.",
                    options = emptyList(),
                    correctOptionId = "five",
                    explanation = "In Shimgelina, five Shimageles (elders) would be appointed by the disputing parties.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10881,
                    questionNumber = 81,
                    totalQuestions = 100,
                    text = "The Sidama age-grade institution, with grades rotating every 8 years, is called the _______ system.",
                    options = emptyList(),
                    correctOptionId = "Luwa",
                    explanation = "The Sidama Luwa system is an age-related institution with grades rotating every 8 years.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10882,
                    questionNumber = 82,
                    totalQuestions = 100,
                    text = "The Sidama moral code providing the basis for distinguishing good and evil is called _______.",
                    options = emptyList(),
                    correctOptionId = "halale",
                    explanation = "The Sidama moral code halale provides the basis for distinguishing good and evil.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10883,
                    questionNumber = 83,
                    totalQuestions = 100,
                    text = "In Kambata and Hadiya culture, the code of behaviour governing social life is called _______.",
                    options = emptyList(),
                    correctOptionId = "Seera",
                    explanation = "Seera refers to the code of behaviour that is followed and internalized in Kambata and Hadiya culture.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10884,
                    questionNumber = 84,
                    totalQuestions = 100,
                    text = "_______ Heritage refers to physical artifacts, buildings, and monuments passed from generation to generation.",
                    options = emptyList(),
                    correctOptionId = "Tangible",
                    explanation = "Tangible Heritage refers to physical artifacts, buildings and historic places transmitted from generation to generation.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10885,
                    questionNumber = 85,
                    totalQuestions = 100,
                    text = "The Stelae of Aksum were included in the UNESCO List of World Heritage Sites in _______.",
                    options = emptyList(),
                    correctOptionId = "1980",
                    explanation = "Axum and its archaeological sites were included in the List of World Heritage Sites in 1980.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10886,
                    questionNumber = 86,
                    totalQuestions = 100,
                    text = "The Rock-hewn Churches of _______ were registered by UNESCO as a World Heritage Site in 1978.",
                    options = emptyList(),
                    correctOptionId = "Lalibela",
                    explanation = "The Rock-hewn Churches of Lalibela were registered by UNESCO as a World Heritage Site in 1978.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10887,
                    questionNumber = 87,
                    totalQuestions = 100,
                    text = "Fasil Ghebbi, the premise of King Fasiledes, is found in the town of _______.",
                    options = emptyList(),
                    correctOptionId = "Gondar",
                    explanation = "Fasil Ghebbi is found in Gondar town.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10888,
                    questionNumber = 88,
                    totalQuestions = 100,
                    text = "The Simien Mountains National Park is home to the Gelada baboon, the Simien fox, and the _______ ibex.",
                    options = emptyList(),
                    correctOptionId = "Walia",
                    explanation = "The Park is home to the Gelada baboon, Simien fox, and Walia ibex.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10889,
                    questionNumber = 89,
                    totalQuestions = 100,
                    text = "The Lower Valley of _______ is significant for Paleo-anthropological research, located in Afar Regional State.",
                    options = emptyList(),
                    correctOptionId = "Awash",
                    explanation = "The Lower Valley of Awash is a site of Paleo-anthropological research located in Afar Regional State.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10890,
                    questionNumber = 90,
                    totalQuestions = 100,
                    text = "The _______ archaeological site, listed in 1980, contains 36 monuments including 32 carved stelae.",
                    options = emptyList(),
                    correctOptionId = "Tiya",
                    explanation = "The Tiya site contains 36 monuments, including 32 carved stelae covered with symbols.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10891,
                    questionNumber = 91,
                    totalQuestions = 100,
                    text = "The historic walled city of _______ (Jugol) was registered by UNESCO as a World Heritage Site in 2006.",
                    options = emptyList(),
                    correctOptionId = "Harar",
                    explanation = "The Historic City of Harar (Jugol) was registered by UNESCO as a World Heritage Site in 2006.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10892,
                    questionNumber = 92,
                    totalQuestions = 100,
                    text = "The Konso Cultural Landscape was inscribed on the World Heritage list in _______.",
                    options = emptyList(),
                    correctOptionId = "2011",
                    explanation = "The Konso Cultural Landscape was inscribed on the world heritage list in 2011.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10893,
                    questionNumber = 93,
                    totalQuestions = 100,
                    text = "_______, the commemoration of the finding of the True Cross, was inscribed as intangible heritage in 2013.",
                    options = emptyList(),
                    correctOptionId = "Meskel",
                    explanation = "Meskel was inscribed on the UNESCO Representative List of the Intangible Cultural Heritage of Humanity in 2013.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10894,
                    questionNumber = 94,
                    totalQuestions = 100,
                    text = "The _______ system, the Oromo indigenous democratic socio-political system, was inscribed by UNESCO in 2016.",
                    options = emptyList(),
                    correctOptionId = "Gadaa",
                    explanation = "Gadaa was inscribed on the representative list of the intangible cultural heritage of humanity in 2016.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10895,
                    questionNumber = 95,
                    totalQuestions = 100,
                    text = "Fichee-Chambalaalla, the Sidama New Year celebration, was inscribed as intangible heritage in _______.",
                    options = emptyList(),
                    correctOptionId = "2015",
                    explanation = "Fichee-Chambalaalla was inscribed on the representative list of intangible cultural heritage of humanity in 2015.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10896,
                    questionNumber = 96,
                    totalQuestions = 100,
                    text = "_______, the festival marking the baptism of Jesus, became Ethiopia's fourth UNESCO intangible heritage entry in 2019.",
                    options = emptyList(),
                    correctOptionId = "Timket",
                    explanation = "Timket (Ethiopian Epiphany) became Ethiopia's fourth entry on the UNESCO intangible cultural heritage list in 2019.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10897,
                    questionNumber = 97,
                    totalQuestions = 100,
                    text = "Ethiopian manuscripts have traditionally been written in the _______ language.",
                    options = emptyList(),
                    correctOptionId = "Ge'ez",
                    explanation = "Ethiopia has a written tradition in the Ge'ez language.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10898,
                    questionNumber = 98,
                    totalQuestions = 100,
                    text = "The Temple of _______, dated to around 700 BC, is built in the Sabaean architectural style.",
                    options = emptyList(),
                    correctOptionId = "Yeha",
                    explanation = "The Temple of Yeha is a tower built in the Sabaean style, dated to around 700 BC.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10899,
                    questionNumber = 99,
                    totalQuestions = 100,
                    text = "The Sof Omar cave system was formed by the _______ River carving a channel through limestone.",
                    options = emptyList(),
                    correctOptionId = "Weyb",
                    explanation = "The Sof Omar cave system was formed by the Weyb River.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 10900,
                    questionNumber = 100,
                    totalQuestions = 100,
                    text = "There were special schools for _______ in Gondar and Shewa for manuscript production.",
                    options = emptyList(),
                    correctOptionId = "calligraphy",
                    explanation = "There were special schools for calligraphy in Gondar and Shewa.",
                    type = QuestionType.FILL_IN_THE_BLANK
                )
            )
        )
    )
}
