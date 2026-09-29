package com.areka.app.data.repository

import com.areka.app.data.model.Question
import com.areka.app.data.model.QuestionOption
import com.areka.app.data.model.QuestionType
import com.areka.app.data.model.Quiz

/**
 * Imported from the Drive file molarum_grade10_complete_question_bank.json.
 * 18 Grade 10 units × 40 questions, bundled for offline-first study.
 */
object CurriculumDriveQuestionBank {
    val quizzes: Map<String, Quiz> = mapOf(
        "chem_u1" to Quiz(
            id = "quiz_chemistry_u1_drive",
            title = "Chemistry — Chemical Reactions and Stoichiometry Quiz",
            subject = "Chemistry",
            durationMinutes = 25,
            gradeLevel = "Grade 10",
            iconName = "beaker",
            unitId = "chem_u1",
            subjectId = "chemistry",
            questions = listOf(
                Question(
                    id = 20000,
                    questionNumber = 1,
                    totalQuestions = 40,
                    text = "Which balanced equation represents the reaction of hydrogen gas with oxygen to form water?",
                    options = listOf(
                        QuestionOption("a", "H2 + O2 → H2O"),
                        QuestionOption("b", "2H2 + O2 → 2H2O"),
                        QuestionOption("c", "H2 + O2 → H2O2"),
                        QuestionOption("d", "H2 + 2O2 → 2H2O")
                    ),
                    correctOptionId = "b",
                    explanation = "The balanced equation requires 2 H2 molecules for every O2 to yield 2 H2O; the correct coefficients are 2 and 1 respectively."
                ),
                Question(
                    id = 20001,
                    questionNumber = 2,
                    totalQuestions = 40,
                    text = "In a word equation, which part represents the substances that take part in the reaction?",
                    options = listOf(
                        QuestionOption("a", "Product"),
                        QuestionOption("b", "Reactant"),
                        QuestionOption("c", "Catalyst"),
                        QuestionOption("d", "Solvent")
                    ),
                    correctOptionId = "b",
                    explanation = "Reactants are written on the left side of the equation to show what starts the reaction."
                ),
                Question(
                    id = 20002,
                    questionNumber = 3,
                    totalQuestions = 40,
                    text = "Which of the following is evidence of a chemical change?",
                    options = listOf(
                        QuestionOption("a", "Melting ice"),
                        QuestionOption("b", "Evaporation of water"),
                        QuestionOption("c", "Rusting of iron"),
                        QuestionOption("d", "Dissolving sugar in water")
                    ),
                    correctOptionId = "c",
                    explanation = "Chemical changes involve formation of new substances and other evidences such as color change or heat/light; rusting is a chemical change."
                ),
                Question(
                    id = 20003,
                    questionNumber = 4,
                    totalQuestions = 40,
                    text = "In a balanced chemical equation, the total number of atoms of each element is the same on both sides.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Mass is conserved in chemical reactions; atoms are rearranged but totals per element remain equal on both sides."
                ),
                Question(
                    id = 20004,
                    questionNumber = 5,
                    totalQuestions = 40,
                    text = "Define the mole and explain why it is central to stoichiometry.",
                    options = emptyList(),
                    correctOptionId = "The mole is a unit that counts amount of substance as 6.022×10^23 particles; it links mass and number of particles and provides the basis for mole ratios in balanced equations.",
                    explanation = "The mole allows conversion between grams and moles and enables use of coefficients to relate reactants and products in reactions.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20005,
                    questionNumber = 6,
                    totalQuestions = 40,
                    text = "What is the difference between empirical formula and molecular formula?",
                    options = emptyList(),
                    correctOptionId = "Empirical formula shows the simplest whole-number ratio of elements in a compound; molecular formula shows the actual number of each element in a molecule; they may be the same for some compounds or different for others, and the molecular formula can be derived from the empirical formula using molar mass.",
                    explanation = "Empirical vs molecular formulas convey different levels of information; empirical is a reduced ratio, molecular is the actual composition.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20006,
                    questionNumber = 7,
                    totalQuestions = 40,
                    text = "Balance the following equation using inspection: Aluminum reacts with oxygen to form aluminum oxide.",
                    options = listOf(
                        QuestionOption("a", "Al + O2 → Al2O3"),
                        QuestionOption("b", "2Al + O2 → Al2O3"),
                        QuestionOption("c", "4Al + 3O2 → 2Al2O3"),
                        QuestionOption("d", "2Al + 3O2 → 2Al2O3")
                    ),
                    correctOptionId = "c",
                    explanation = "Balancing yields 4Al + 3O2 → 2Al2O3; check atoms on both sides."
                ),
                Question(
                    id = 20007,
                    questionNumber = 8,
                    totalQuestions = 40,
                    text = "In a redox reaction, which species is the oxidizing agent?",
                    options = listOf(
                        QuestionOption("a", "Zn"),
                        QuestionOption("b", "Cu2+"),
                        QuestionOption("c", "Zn2+"),
                        QuestionOption("d", "Cu")
                    ),
                    correctOptionId = "b",
                    explanation = "The oxidizing agent is the species that gains electrons; Cu2+ gains electrons to become Cu."
                ),
                Question(
                    id = 20008,
                    questionNumber = 9,
                    totalQuestions = 40,
                    text = "A 5.00 g sample of hydrogen gas (H2) reacts with excess oxygen to form water. How many grams of water are produced? Use the reaction: 2 H2 + O2 → 2 H2O. M(H2)=2.016 g/mol; M(H2O)=18.015 g/mol.",
                    options = emptyList(),
                    correctOptionId = "44.68 g of H2O",
                    explanation = "Moles H2 = 5.00 g / 2.016 g/mol = 2.481 mol. From the equation, 2 mol H2 produce 2 mol H2O, so moles H2O = 2.481 mol. Mass = 2.481 × 18.015 = 44.68 g.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20009,
                    questionNumber = 10,
                    totalQuestions = 40,
                    text = "A 5.00 g sample of Fe reacts with 10.0 g of O2 to form Fe2O3. Determine the limiting reactant and the theoretical yield of Fe2O3 (MW: Fe=55.85, O=16.00). Balanced equation: 4 Fe + 3 O2 → 2 Fe2O3.",
                    options = emptyList(),
                    correctOptionId = "Limiting reactant: Fe; Theoretical yield of Fe2O3 ≈ 7.15 g",
                    explanation = "Moles: Fe = 5.00/55.85 = 0.0896 mol; O2 = 10.0/32.00 = 0.3125 mol. For Fe, required O2 = (3/4)*0.0896 = 0.0672 mol; O2 is in excess; Fe is limiting. Moles Fe2O3 = (0.0896)*(2/4) = 0.0448 mol. Mass = 0.0448 × 159.69 ≈ 7.15 g.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20010,
                    questionNumber = 11,
                    totalQuestions = 40,
                    text = "Which statement correctly describes where reactants and products appear in a chemical equation?",
                    options = listOf(
                        QuestionOption("a", "Reactants are on the left and products are on the right"),
                        QuestionOption("b", "Products are on the left and reactants are the right"),
                        QuestionOption("c", "All substances are written on a single line with no side specified"),
                        QuestionOption("d", "The arrow is optional and can be omitted")
                    ),
                    correctOptionId = "a",
                    explanation = "In a chemical equation, reactants are written on the left side of the arrow and products on the right."
                ),
                Question(
                    id = 20011,
                    questionNumber = 12,
                    totalQuestions = 40,
                    text = "In a chemical equation, what does the arrow (→) represent?",
                    options = listOf(
                        QuestionOption("a", "The reaction separates reactants into two products"),
                        QuestionOption("b", "The reactants transform into products"),
                        QuestionOption("c", "The equation remains unchanged"),
                        QuestionOption("d", "The energy changes only")
                    ),
                    correctOptionId = "b",
                    explanation = "The arrow indicates transformation of reactants into products."
                ),
                Question(
                    id = 20012,
                    questionNumber = 13,
                    totalQuestions = 40,
                    text = "Which statement best describes balancing chemical equations?",
                    options = listOf(
                        QuestionOption("a", "It changes the substances involved"),
                        QuestionOption("b", "It keeps the number of atoms of each element the same on both sides"),
                        QuestionOption("c", "It only adjusts coefficients to change mass"),
                        QuestionOption("d", "It always requires changing the products only")
                    ),
                    correctOptionId = "b",
                    explanation = "Balancing ensures conservation of atoms; coefficients adjust amounts but not identities."
                ),
                Question(
                    id = 20013,
                    questionNumber = 14,
                    totalQuestions = 40,
                    text = "In the reaction Fe2O3 + CO → Fe + CO2, which species acts as the reducing agent?",
                    options = listOf(
                        QuestionOption("a", "Fe2O3"),
                        QuestionOption("b", "CO"),
                        QuestionOption("c", "Fe"),
                        QuestionOption("d", "CO2")
                    ),
                    correctOptionId = "b",
                    explanation = "CO is oxidized to CO2 and reduces Fe2O3 to Fe, so CO is the reducing agent."
                ),
                Question(
                    id = 20014,
                    questionNumber = 15,
                    totalQuestions = 40,
                    text = "In a redox reaction using the oxidation-number-change method, which sign of oxidation state change indicates oxidation of an element?",
                    options = listOf(
                        QuestionOption("a", "Increase in oxidation state"),
                        QuestionOption("b", "Decrease in oxidation state"),
                        QuestionOption("c", "No change in oxidation state"),
                        QuestionOption("d", "Only changes in hydrogen atoms")
                    ),
                    correctOptionId = "a",
                    explanation = "Oxidation is an increase in oxidation state; reduction is a decrease."
                ),
                Question(
                    id = 20015,
                    questionNumber = 16,
                    totalQuestions = 40,
                    text = "In a balanced chemical equation, the total mass of reactants equals the total mass of products.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Conservation of mass requires that mass be conserved in a chemical equation."
                ),
                Question(
                    id = 20016,
                    questionNumber = 17,
                    totalQuestions = 40,
                    text = "Define a chemical equation and identify the reactants and products in a general reaction.",
                    options = emptyList(),
                    correctOptionId = "A chemical equation uses symbols and formulas to represent a chemical reaction; reactants are written on the left of the arrow and products on the right.",
                    explanation = "A chemical equation expresses the reactants transforming into products.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20017,
                    questionNumber = 18,
                    totalQuestions = 40,
                    text = "Outline the steps to determine the limiting reactant when given masses of two reactants.",
                    options = emptyList(),
                    correctOptionId = "1) Convert the masses to moles for each reactant. 2) Use stoichiometric ratios to determine the amount of product each could form. 3) The smaller theoretical yield indicates the limiting reactant. 4) Use that amount to calculate the theoretical yield.",
                    explanation = "Follows stoichiometry procedure for limiting reactant in 1.6.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20018,
                    questionNumber = 19,
                    totalQuestions = 40,
                    text = "For the reaction 2H2 + O2 → 2H2O, if 4.00 g of H2 reacts with excess O2, calculate the mass of H2O produced. Provide all steps and final answer with units.",
                    options = emptyList(),
                    correctOptionId = "35.70 g H2O",
                    explanation = "Moles H2 = 4.00 g / 2.016 g/mol = 1.984 mol; Moles H2O = 1.984 mol (1:1 with H2); Mass H2O = 1.984 × 18.015 g/mol = 35.70 g.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20019,
                    questionNumber = 20,
                    totalQuestions = 40,
                    text = "For the reaction 2H2 + O2 → 2H2O, given masses 5.00 g H2 and 8.00 g O2, determine the limiting reagent and the mass of H2O that can be formed. Provide full steps and final units.",
                    options = emptyList(),
                    correctOptionId = "Limiting reactant: O2; Theoretical yield of H2O: 9.01 g",
                    explanation = "Moles: H2 = 5.00/2.016 = 2.481 mol; O2 = 8.00/32.00 = 0.250 mol. Stoichiometry requires 2 H2 per O2, so O2 is limiting. H2O produced = 0.250 × 2 = 0.500 mol; mass = 0.500 × 18.015 = 9.01 g.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20020,
                    questionNumber = 21,
                    totalQuestions = 40,
                    text = "Which of the following chemical equations is balanced correctly for the formation of aluminum oxide from aluminum and oxygen?",
                    options = listOf(
                        QuestionOption("a", "Al + O2 → Al2O3"),
                        QuestionOption("b", "2Al + O2 → Al2O3"),
                        QuestionOption("c", "4Al + 3O2 → 2Al2O3"),
                        QuestionOption("d", "2Al2O3 → 4Al + 3O2")
                    ),
                    correctOptionId = "c",
                    explanation = "A balanced equation has equal numbers of each type of atom on both sides. The correctly balanced equation is 4Al + 3O2 → 2Al2O3."
                ),
                Question(
                    id = 20021,
                    questionNumber = 22,
                    totalQuestions = 40,
                    text = "In a chemical equation, the total number of atoms of each element is the same on both sides.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Conservation of mass requires that atoms are balanced; the same number of each element appears on both sides."
                ),
                Question(
                    id = 20022,
                    questionNumber = 23,
                    totalQuestions = 40,
                    text = "In the reaction Zn + Cu2+ → Zn2+ + Cu, which species is the oxidizing agent?",
                    options = listOf(
                        QuestionOption("a", "Zn"),
                        QuestionOption("b", "Cu2+"),
                        QuestionOption("c", "Zn2+"),
                        QuestionOption("d", "Cu")
                    ),
                    correctOptionId = "b",
                    explanation = "The oxidizing agent is the species that is reduced; Cu2+ gains electrons to become Cu."
                ),
                Question(
                    id = 20023,
                    questionNumber = 24,
                    totalQuestions = 40,
                    text = "List the four major types of chemical reactions.",
                    options = emptyList(),
                    correctOptionId = "Combination, Decomposition, Single displacement, Double displacement",
                    explanation = "The four primary categories of reactions introduced in Unit 1 section 1.3.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20024,
                    questionNumber = 25,
                    totalQuestions = 40,
                    text = "Balance the equation: Al + O2 → Al2O3",
                    options = listOf(
                        QuestionOption("a", "Al + O2 → Al2O3"),
                        QuestionOption("b", "2Al + O2 → Al2O3"),
                        QuestionOption("c", "4Al + 3O2 → 2Al2O3"),
                        QuestionOption("d", "2Al2O3 → 4Al + 3O2")
                    ),
                    correctOptionId = "c",
                    explanation = "Balancing yields 4 Al and 3 O2 on the left and 2 Al2O3 on the right."
                ),
                Question(
                    id = 20025,
                    questionNumber = 26,
                    totalQuestions = 40,
                    text = "Which method is used to balance redox equations by changing oxidation numbers?",
                    options = listOf(
                        QuestionOption("a", "Inspection method"),
                        QuestionOption("b", "LCM method"),
                        QuestionOption("c", "Algebraic method"),
                        QuestionOption("d", "Oxidation-number-change method")
                    ),
                    correctOptionId = "d",
                    explanation = "Balancing redox equations can be done using the oxidation-number-change method, as described in 1.4.4."
                ),
                Question(
                    id = 20026,
                    questionNumber = 27,
                    totalQuestions = 40,
                    text = "In the reaction A + B → AB, if the ratio is 2:1, how many moles of B are required to react with 6 moles of A?",
                    options = listOf(
                        QuestionOption("a", "6 moles"),
                        QuestionOption("b", "3 moles"),
                        QuestionOption("c", "2 moles"),
                        QuestionOption("d", "4 moles")
                    ),
                    correctOptionId = "b",
                    explanation = "A 2:1 ratio (A:B) means 2 moles of A react with 1 mole of B; for 6 moles of A, 3 moles of B are needed."
                ),
                Question(
                    id = 20027,
                    questionNumber = 28,
                    totalQuestions = 40,
                    text = "Define limiting reactant and explain how to determine it from mole ratios.",
                    options = emptyList(),
                    correctOptionId = "The limiting reactant is the reactant that is completely consumed first, determining the amount of product formed. It is determined by comparing the available mole ratios to the coefficients in the balanced equation.",
                    explanation = "Limiting reagent concept arises in stoichiometry; identify by mole ratio comparison.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20028,
                    questionNumber = 29,
                    totalQuestions = 40,
                    text = "The reaction 4 Fe + 3 O2 → 2 Fe2O3 occurs. If 50.0 g Fe and 40.0 g O2 are reacted, what mass of Fe2O3 is produced? (Assume Fe is the limiting reagent.) Also show the steps and units used.",
                    options = emptyList(),
                    correctOptionId = "71.5 g Fe2O3",
                    explanation = "1) Moles Fe = 50.0 g / 55.845 g/mol ≈ 0.895 mol. 2) Moles O2 = 40.0 g / 32.00 g/mol = 1.250 mol. 3) Stoichiometry from 4 Fe:3 O2 → 2 Fe2O3. Fe is limiting since required O2 for 0.895 mol Fe is (0.895×3/4)=0.671 mol < 1.250 mol. 4) Moles Fe2O3 formed = 0.895×(2/4)=0.4475 mol. 5) Mass Fe2O3 = 0.4475 mol × 159.69 g/mol ≈ 71.5 g.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20029,
                    questionNumber = 30,
                    totalQuestions = 40,
                    text = "In the reaction 2 H2 + O2 → 2 H2O, if 4.0 g of H2 and 32.0 g of O2 are mixed and allowed to react, what mass of H2O can be formed? Show calculations, units, and the method used.",
                    options = emptyList(),
                    correctOptionId = "35.8 g H2O",
                    explanation = "Molar masses: H2 = 2.016 g/mol, O2 = 31.998 g/mol, H2O = 18.015 g/mol. Moles: n(H2) = 4.0/2.016 ≈ 1.984 mol; n(O2) = 32.0/31.998 ≈ 1.000 mol. Stoichiometry: 2 H2 + 1 O2 → 2 H2O; H2 is limiting since 1.984 mol H2 require 0.992 mol O2, which is ≤ available O2. Moles H2O produced = 1.984 mol. Mass = 1.984 mol × 18.015 g/mol ≈ 35.8 g.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20030,
                    questionNumber = 31,
                    totalQuestions = 40,
                    text = "In a chemical equation, where are the reactants written?",
                    options = listOf(
                        QuestionOption("a", "Right side"),
                        QuestionOption("b", "Left side"),
                        QuestionOption("c", "Above the arrow"),
                        QuestionOption("d", "Below the arrow")
                    ),
                    correctOptionId = "b",
                    explanation = "Reactants are written on the left side of the equation, with products on the right, separated by an arrow."
                ),
                Question(
                    id = 20031,
                    questionNumber = 32,
                    totalQuestions = 40,
                    text = "Aqueous solutions are always written as (aq) in chemical equations.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The state symbol (aq) is used to denote an aqueous solution in chemical equations as shown in the section on writing chemical equations."
                ),
                Question(
                    id = 20032,
                    questionNumber = 33,
                    totalQuestions = 40,
                    text = "State one difference between a chemical reaction and a chemical equation.",
                    options = emptyList(),
                    correctOptionId = "A chemical reaction is the process that turns reactants into products, while a chemical equation is the symbolic representation of that reaction using symbols and formulas.",
                    explanation = "A reaction describes what happens; the chemical equation shows the reactants and products with balanced relationships.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20033,
                    questionNumber = 34,
                    totalQuestions = 40,
                    text = "If 5.0 g of H2 reacts with 70.0 g of O2 to form water according to the equation 2 H2 + O2 → 2 H2O, what mass of H2O is theoretically produced? Show calculations and give final answer with units.",
                    options = emptyList(),
                    correctOptionId = "44.7 g H2O (approximately)",
                    explanation = "Moles H2 = 5.0 g / 2.016 g/mol ≈ 2.48 mol. From 2 H2 + O2 → 2 H2O, 1 mol H2 yields 1 mol H2O, so total H2O formed ≈ 2.48 mol × 18.02 g/mol ≈ 44.7 g.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20034,
                    questionNumber = 35,
                    totalQuestions = 40,
                    text = "Balance the following equation using the inspection method: Fe + H2O → Fe3O4 + H2. Which balanced equation is correct?",
                    options = listOf(
                        QuestionOption("a", "Fe + H2O → Fe3O4 + H2"),
                        QuestionOption("b", "3Fe + 4H2O → Fe3O4 + 4H2"),
                        QuestionOption("c", "Fe + 2H2O → FeO + H2"),
                        QuestionOption("d", "2Fe + 3H2O → Fe2O3 + 3H2")
                    ),
                    correctOptionId = "b",
                    explanation = "Using inspection balance, Fe atoms, O atoms, and H atoms to obtain 3Fe + 4H2O → Fe3O4 + 4H2."
                ),
                Question(
                    id = 20035,
                    questionNumber = 36,
                    totalQuestions = 40,
                    text = "In a redox reaction, which statement is true?",
                    options = listOf(
                        QuestionOption("a", "The reducing agent is reduced"),
                        QuestionOption("b", "The oxidizing agent is oxidized"),
                        QuestionOption("c", "The oxidizing agent is reduced"),
                        QuestionOption("d", "None of the above")
                    ),
                    correctOptionId = "c",
                    explanation = "In redox, the oxidizing agent gains electrons (is reduced) while the reducing agent loses electrons (is oxidized)."
                ),
                Question(
                    id = 20036,
                    questionNumber = 37,
                    totalQuestions = 40,
                    text = "For the reaction 2 Al + 3 Cl2 → 2 AlCl3, if you start with 5.0 mol Al and 2.0 mol Cl2, which reactant is limiting and how many moles of AlCl3 can be formed?",
                    options = emptyList(),
                    correctOptionId = "Limiting reagent: Cl2. Theoretical yield: 1.33 mol AlCl3 (approximately).",
                    explanation = "The mole ratio from the balanced equation shows 3 mol Cl2 produce 2 mol AlCl3. With 2.0 mol Cl2, AlCl3 formed = (2.0)*(2/3) ≈ 1.33 mol. Cl2 is limiting; Al is in excess.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20037,
                    questionNumber = 38,
                    totalQuestions = 40,
                    text = "In the reaction Fe + CuSO4 → FeSO4 + Cu, which species acts as the oxidizing agent?",
                    options = listOf(
                        QuestionOption("a", "Fe"),
                        QuestionOption("b", "CuSO4"),
                        QuestionOption("c", "FeSO4"),
                        QuestionOption("d", "Cu")
                    ),
                    correctOptionId = "b",
                    explanation = "Cu2+ in CuSO4 accepts electrons and is reduced; thus CuSO4 is the oxidizing agent."
                ),
                Question(
                    id = 20038,
                    questionNumber = 39,
                    totalQuestions = 40,
                    text = "Explain the difference between synthesis (combination) and decomposition reactions, with one example of each.",
                    options = emptyList(),
                    correctOptionId = "Synthesis: two or more substances form one product; Decomposition: a compound breaks down into simpler substances (e.g., 2H2 + O2 → 2H2O and 2H2O2 → 2H2O + O2).",
                    explanation = "Synthesis builds up complexity; decomposition breaks down a compound.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20039,
                    questionNumber = 40,
                    totalQuestions = 40,
                    text = "Which method is used to balance chemical equations by the algebraic method?",
                    options = listOf(
                        QuestionOption("a", "Inspection method"),
                        QuestionOption("b", "LCM method"),
                        QuestionOption("c", "Algebraic method"),
                        QuestionOption("d", "Trial and error method")
                    ),
                    correctOptionId = "c",
                    explanation = "The algebraic method assigns algebraic coefficients and solves equations for balance."
                )
            )
        ),
        "chem_u2" to Quiz(
            id = "quiz_chemistry_u2_drive",
            title = "Chemistry — SOLUTIONS Quiz",
            subject = "Chemistry",
            durationMinutes = 25,
            gradeLevel = "Grade 10",
            iconName = "beaker",
            unitId = "chem_u2",
            subjectId = "chemistry",
            questions = listOf(
                Question(
                    id = 20040,
                    questionNumber = 1,
                    totalQuestions = 40,
                    text = "Which of the following describes a homogeneous mixture?",
                    options = listOf(
                        QuestionOption("a", "A homogeneous mixture has uniform composition throughout (e.g., salt dissolved in water)."),
                        QuestionOption("b", "A heterogeneous mixture has uniform composition throughout."),
                        QuestionOption("c", "A pure substance is a mixture."),
                        QuestionOption("d", "A solution always consists of a gas dissolved in a liquid.")
                    ),
                    correctOptionId = "a",
                    explanation = "Homogeneous mixtures have the same composition and properties throughout; an example is a salt in water where the solution is uniform."
                ),
                Question(
                    id = 20041,
                    questionNumber = 2,
                    totalQuestions = 40,
                    text = "In a solution, water is the solvent and salt is the solute. This describes:",
                    options = listOf(
                        QuestionOption("a", "Water is the solvent and salt is the solute."),
                        QuestionOption("b", "Salt is the solvent and water is the solute."),
                        QuestionOption("c", "Both are solvents."),
                        QuestionOption("d", "There is no solvent in a solution.")
                    ),
                    correctOptionId = "a",
                    explanation = "In a solution, the solvent is the medium in which the solute is dissolved; water commonly serves as the solvent and salt as the solute."
                ),
                Question(
                    id = 20042,
                    questionNumber = 3,
                    totalQuestions = 40,
                    text = "What does molarity measure?",
                    options = listOf(
                        QuestionOption("a", "Mass of solute per liter of solution"),
                        QuestionOption("b", "Moles of solute per liter of solution"),
                        QuestionOption("c", "Moles of solvent per liter of solution"),
                        QuestionOption("d", "Volume of solute per liter of solution")
                    ),
                    correctOptionId = "b",
                    explanation = "Molarity is defined as the number of moles of solute per liter of solution (mol/L)."
                ),
                Question(
                    id = 20043,
                    questionNumber = 4,
                    totalQuestions = 40,
                    text = "If more solute can dissolve at a given temperature, the solution is:",
                    options = listOf(
                        QuestionOption("a", "supersaturated"),
                        QuestionOption("b", "saturated"),
                        QuestionOption("c", "unsaturated"),
                        QuestionOption("d", "concentrated")
                    ),
                    correctOptionId = "c",
                    explanation = "An unsaturated solution can still dissolve more solute at that temperature."
                ),
                Question(
                    id = 20044,
                    questionNumber = 5,
                    totalQuestions = 40,
                    text = "Which statement about concentration units is true?",
                    options = listOf(
                        QuestionOption("a", "Molarity changes with temperature, while molality remains essentially constant."),
                        QuestionOption("b", "Molality changes with temperature, while molarity remains constant."),
                        QuestionOption("c", "Normality and molarity are always equal."),
                        QuestionOption("d", "Concentration units are interchangeable without any calculation.")
                    ),
                    correctOptionId = "a",
                    explanation = "Molarity depends on volume, which changes with temperature, while molality depends on mass of solvent and is largely temperature independent."
                ),
                Question(
                    id = 20045,
                    questionNumber = 6,
                    totalQuestions = 40,
                    text = "At a fixed temperature, a saturated solution contains the maximum amount of solute that can dissolve.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "A saturated solution has dissolved as much solute as possible at that temperature."
                ),
                Question(
                    id = 20046,
                    questionNumber = 7,
                    totalQuestions = 40,
                    text = "Explain, in 1–2 sentences, why increasing temperature generally increases the solubility of most solid solutes in water.",
                    options = emptyList(),
                    correctOptionId = "Increasing temperature provides more energy to overcome lattice energy and to solvate ions or molecules, which often increases the amount of solid that can dissolve. For many salts, dissolution is endothermic, so solubility rises with temperature.",
                    explanation = "Higher temperature generally increases molecular motion and energy available for dissolution, often shifting equilibrium toward greater solubility for solids (endothermic dissolution for many salts).",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20047,
                    questionNumber = 8,
                    totalQuestions = 40,
                    text = "Describe the difference between saturated, unsaturated, and supersaturated solutions.",
                    options = emptyList(),
                    correctOptionId = "Saturated: contains as much solute as can dissolve at a given temperature; unsaturated: can dissolve more solute; supersaturated: contains more solute than normally dissolvable, often created by heating a saturated solution and slowly cooling.",
                    explanation = "Definitions based on how much solute is in solution relative to solubility at a given temperature.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20048,
                    questionNumber = 9,
                    totalQuestions = 40,
                    text = "A student dissolves 24.0 g of NaCl in enough water to make 0.500 L of solution. What is the molarity (mol/L) of the solution? Show all steps and final unit.",
                    options = emptyList(),
                    correctOptionId = "0.822 M",
                    explanation = "Moles NaCl = 24.0 g / 58.44 g/mol = 0.4109 mol; Molarity = 0.4109 mol / 0.500 L = 0.8218 M ≈ 0.822 M.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20049,
                    questionNumber = 10,
                    totalQuestions = 40,
                    text = "A solution is prepared by dissolving 25.0 g of glucose in 125.0 g of water. Calculate the mass percent (m/m) of glucose in the solution.",
                    options = emptyList(),
                    correctOptionId = "16.7% (m/m)",
                    explanation = "Total mass = 25.0 + 125.0 = 150.0 g; mass percent = (25.0 / 150.0) × 100 = 16.7%.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20050,
                    questionNumber = 11,
                    totalQuestions = 40,
                    text = "What is molarity?",
                    options = listOf(
                        QuestionOption("a", "Mass of solute per liter of solution"),
                        QuestionOption("b", "Moles of solute per liter of solution"),
                        QuestionOption("c", "Moles of solute per kilogram of solvent"),
                        QuestionOption("d", "Mass percent of solute")
                    ),
                    correctOptionId = "b",
                    explanation = "Molarity is defined as the number of moles of solute dissolved per liter of solution."
                ),
                Question(
                    id = 20051,
                    questionNumber = 12,
                    totalQuestions = 40,
                    text = "Percent by mass/volume is defined as (mass of solute / volume of solution) × 100. Which statement best describes this concentration expression?",
                    options = listOf(
                        QuestionOption("a", "Mass of solute per liter of solution × 100"),
                        QuestionOption("b", "Mass of solute per mass of solution × 100"),
                        QuestionOption("c", "Volume of solute per volume of solution × 100"),
                        QuestionOption("d", "Moles per liter × 100")
                    ),
                    correctOptionId = "a",
                    explanation = "Percent by mass/volume expresses how much solute is present per liter of solution, scaled by 100."
                ),
                Question(
                    id = 20052,
                    questionNumber = 13,
                    totalQuestions = 40,
                    text = "When an ionic solid dissolves in water, the ions become surrounded by water molecules. This process is called:",
                    options = listOf(
                        QuestionOption("a", "Precipitation"),
                        QuestionOption("b", "Ionization"),
                        QuestionOption("c", "Hydration (solvation)"),
                        QuestionOption("d", "Diffusion")
                    ),
                    correctOptionId = "c",
                    explanation = "Dissolution involves interaction with water molecules; ions become solvated, i.e., surrounded by water molecules (hydration/solvation)."
                ),
                Question(
                    id = 20053,
                    questionNumber = 14,
                    totalQuestions = 40,
                    text = "Which factor most clearly increases the rate of dissolution of a solid solute in a solvent?",
                    options = listOf(
                        QuestionOption("a", "Decreasing surface area"),
                        QuestionOption("b", "Increasing particle size"),
                        QuestionOption("c", "Stirring the solution"),
                        QuestionOption("d", "Lowering temperature")
                    ),
                    correctOptionId = "c",
                    explanation = "Rate of dissolution increases with greater surface area exposure and stirring, which reduce boundary layers and bring fresh solvent; stirring is a key factor."
                ),
                Question(
                    id = 20054,
                    questionNumber = 15,
                    totalQuestions = 40,
                    text = "If 0.50 moles of solute are dissolved in 1.00 liter of solution, what is the molarity?",
                    options = listOf(
                        QuestionOption("a", "0.50 M"),
                        QuestionOption("b", "0.25 M"),
                        QuestionOption("c", "1.0 M"),
                        QuestionOption("d", "0.02 M")
                    ),
                    correctOptionId = "a",
                    explanation = "Molarity = moles of solute / liters of solution. Here is 0.50 mol in 1.00 L → 0.50 M."
                ),
                Question(
                    id = 20055,
                    questionNumber = 16,
                    totalQuestions = 40,
                    text = "How many milliliters of a 1.00 M stock NaCl solution are required to prepare 1.00 L of a 0.100 M NaCl solution? Use the dilution formula M1V1 = M2V2.",
                    options = emptyList(),
                    correctOptionId = "100 mL of 1.00 M stock solution",
                    explanation = "Using M1V1 = M2V2: (1.00 M)(V1) = (0.100 M)(1.00 L) → V1 = 0.100 L = 100 mL.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20056,
                    questionNumber = 17,
                    totalQuestions = 40,
                    text = "The molarity of a solution is independent of temperature.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "Molarity depends on the volume of solution, which changes with temperature; hence it is temperature-dependent."
                ),
                Question(
                    id = 20057,
                    questionNumber = 18,
                    totalQuestions = 40,
                    text = "Calculate the grams of potassium nitrate (KNO3, molar mass = 101.10 g/mol) required to prepare 1.000 L of a 0.500 M KNO3 solution.",
                    options = emptyList(),
                    correctOptionId = "50.6 g (approximately) of KNO3 to be weighed and dissolved to make 1.000 L of 0.500 M solution.",
                    explanation = "Mass = Molarity × Volume × MolarMass = 0.500 mol/L × 1.000 L × 101.10 g/mol ≈ 50.55 g; rounded to 50.6 g.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20058,
                    questionNumber = 19,
                    totalQuestions = 40,
                    text = "In the reaction HCl + NaOH → NaCl + H2O, if 25.0 mL of 1.00 M HCl reacts with 25.0 mL of 1.00 M NaOH, how many grams of NaCl are produced?",
                    options = emptyList(),
                    correctOptionId = "1.46 g of NaCl (approximately; 0.0250 mol NaCl; 0.0250 mol × 58.44 g/mol ≈ 1.46 g)",
                    explanation = "Reaction is 1:1; moles of HCl = moles of NaOH = 0.0250 mol; NaCl produced = 0.0250 mol; mass = 0.0250 × 58.44 ≈ 1.46 g.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20059,
                    questionNumber = 20,
                    totalQuestions = 40,
                    text = "A school lab needs 0.500 L of a 0.200 M CaCl2 solution. A stock solution of 1.00 M CaCl2 is available. How many milliliters of stock are required? Use M1V1 = M2V2.",
                    options = emptyList(),
                    correctOptionId = "100 mL of 1.00 M CaCl2 stock",
                    explanation = "M1V1 = M2V2 → (1.00 M)(V1) = (0.200 M)(0.500 L) → V1 = 0.100 L = 100 mL",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20060,
                    questionNumber = 21,
                    totalQuestions = 40,
                    text = "A solution contains 5.0 moles of solute dissolved in 2.0 liters of solution. What is the molarity of the solution?",
                    options = listOf(
                        QuestionOption("a", "2.0 M"),
                        QuestionOption("b", "2.5 M"),
                        QuestionOption("c", "5.0 M"),
                        QuestionOption("d", "10.0 M")
                    ),
                    correctOptionId = "b",
                    explanation = "Molarity = moles of solute / liters of solution = 5.0 / 2.0 = 2.5 mol/L (M)."
                ),
                Question(
                    id = 20061,
                    questionNumber = 22,
                    totalQuestions = 40,
                    text = "Which concentration expression uses the mass of solvent in kilograms?",
                    options = listOf(
                        QuestionOption("a", "Molarity"),
                        QuestionOption("b", "Molality"),
                        QuestionOption("c", "Percent by mass"),
                        QuestionOption("d", "Mole fraction")
                    ),
                    correctOptionId = "b",
                    explanation = "Molality = moles of solute per kilogram of solvent."
                ),
                Question(
                    id = 20062,
                    questionNumber = 23,
                    totalQuestions = 40,
                    text = "Which statement best describes an unsaturated solution at a given temperature?",
                    options = listOf(
                        QuestionOption("a", "Contains more solute than the maximum at that temperature."),
                        QuestionOption("b", "Contains the maximum amount of solute."),
                        QuestionOption("c", "Contains less solute than the maximum at that temperature."),
                        QuestionOption("d", "Cannot dissolve any more solute.")
                    ),
                    correctOptionId = "c",
                    explanation = "An unsaturated solution has less solute than the equilibrium maximum at that temperature."
                ),
                Question(
                    id = 20063,
                    questionNumber = 24,
                    totalQuestions = 40,
                    text = "Which factor most affects the solubility of a gas in a liquid?",
                    options = listOf(
                        QuestionOption("a", "Temperature"),
                        QuestionOption("b", "Pressure"),
                        QuestionOption("c", "pH"),
                        QuestionOption("d", "Surface area")
                    ),
                    correctOptionId = "b",
                    explanation = "Gas solubility in liquids generally increases with pressure (Henry's law); temperature also matters but gas solubility typically decreases with higher temperature."
                ),
                Question(
                    id = 20064,
                    questionNumber = 25,
                    totalQuestions = 40,
                    text = "A solution contains 20 g of solute in 100 g of solution. What is the percent by mass of the solute?",
                    options = listOf(
                        QuestionOption("a", "16%"),
                        QuestionOption("b", "20%"),
                        QuestionOption("c", "25%"),
                        QuestionOption("d", "50%")
                    ),
                    correctOptionId = "b",
                    explanation = "Percent by mass = (mass solute / mass of solution) × 100 = (20 g / 100 g) × 100 = 20%."
                ),
                Question(
                    id = 20065,
                    questionNumber = 26,
                    totalQuestions = 40,
                    text = "Stirring a solute in a solvent always increases the rate at which the solute dissolves.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Stirring increases contact between solute and solvent, increasing the rate of dissolution."
                ),
                Question(
                    id = 20066,
                    questionNumber = 27,
                    totalQuestions = 40,
                    text = "Explain how adding more solvent to a solution affects the molarity of the solution, assuming the amount of solute remains the same.",
                    options = emptyList(),
                    correctOptionId = "Molarity decreases as solvent is added because molarity is moles per liter; increasing volume with constant moles reduces M.",
                    explanation = "Molarity = n/V. If n stays constant and V increases, M decreases.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20067,
                    questionNumber = 28,
                    totalQuestions = 40,
                    text = "Define saturated, unsaturated, and supersaturated solutions and describe how a supersaturated solution can be prepared.",
                    options = emptyList(),
                    correctOptionId = "Saturated: solute at equilibrium with undissolved solute; Unsaturated: can dissolve more solute at that temperature; Supersaturated: holds more solute than the equilibrium limit, created by dissolving at high temperature and slowly cooling; preparation: dissolve at high T, then cool slowly without disturbance.",
                    explanation = "Supersaturation is achieved by manipulating temperature and careful handling to avoid nucleation.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20068,
                    questionNumber = 29,
                    totalQuestions = 40,
                    text = "A solution contains 0.500 moles of solute in 2.00 liters of solution. What is its molarity? Show your calculation.",
                    options = emptyList(),
                    correctOptionId = "0.250 M",
                    explanation = "Molarity M = n/V = 0.500 mol / 2.00 L = 0.250 mol/L (M).",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20069,
                    questionNumber = 30,
                    totalQuestions = 40,
                    text = "A stock solution of concentration 3.00 M is used to prepare 0.600 mol of solute in a final solution with a concentration of 0.750 M. What final volume is required?",
                    options = emptyList(),
                    correctOptionId = "0.800 L",
                    explanation = "Using C1V1 = C2V2; n = C2V2 = 0.600 mol; V2 = n/C2 = 0.600 mol / 0.750 mol/L = 0.800 L.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20070,
                    questionNumber = 31,
                    totalQuestions = 40,
                    text = "Which of the following is a homogeneous solution?",
                    options = listOf(
                        QuestionOption("a", "Oil and water"),
                        QuestionOption("b", "Sugar dissolved in water"),
                        QuestionOption("c", "Sand in water"),
                        QuestionOption("d", "Mud as a mixture")
                    ),
                    correctOptionId = "b",
                    explanation = "A solution is a homogeneous mixture; sugar dissolved in water forms a uniform composition throughout."
                ),
                Question(
                    id = 20071,
                    questionNumber = 32,
                    totalQuestions = 40,
                    text = "A solution never settles out over time.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Solutions are homogeneous and do not separate by gravity; they remain uniformly mixed over time."
                ),
                Question(
                    id = 20072,
                    questionNumber = 33,
                    totalQuestions = 40,
                    text = "In a solution, what is the solvent?",
                    options = listOf(
                        QuestionOption("a", "Solute"),
                        QuestionOption("b", "Solute particles"),
                        QuestionOption("c", "Solvent"),
                        QuestionOption("d", "Dissolved solute")
                    ),
                    correctOptionId = "c",
                    explanation = "The solvent is the substance in which the solute dissolves and is usually present in the larger amount."
                ),
                Question(
                    id = 20073,
                    questionNumber = 34,
                    totalQuestions = 40,
                    text = "Which statement about molarity is correct?",
                    options = listOf(
                        QuestionOption("a", "Molarity is the number of moles of solute per liter of solvent."),
                        QuestionOption("b", "Molarity is the number of moles of solute per liter of solution."),
                        QuestionOption("c", "Molarity equals mass of solute per mass of solvent."),
                        QuestionOption("d", "Molarity is the percent by mass.")
                    ),
                    correctOptionId = "b",
                    explanation = "Molarity (M) is defined as moles of solute per liter of solution (mol/L)."
                ),
                Question(
                    id = 20074,
                    questionNumber = 35,
                    totalQuestions = 40,
                    text = "A saturated solution at a given temperature contains:",
                    options = listOf(
                        QuestionOption("a", "It contains more solute than the maximum."),
                        QuestionOption("b", "It contains less solute than the maximum."),
                        QuestionOption("c", "It contains the maximum amount of solute that can dissolve at that temperature."),
                        QuestionOption("d", "It contains only solvent with no solute.")
                    ),
                    correctOptionId = "c",
                    explanation = "A saturated solution holds the maximum dissolved solute at that temperature; additional solute remains undissolved."
                ),
                Question(
                    id = 20075,
                    questionNumber = 36,
                    totalQuestions = 40,
                    text = "State the formula for molarity and the units it uses.",
                    options = emptyList(),
                    correctOptionId = "Molarity = moles of solute per liter of solution; units: mol/L (M).",
                    explanation = "Molarity (M) is defined as the amount of solute in moles divided by the volume of solution in liters.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20076,
                    questionNumber = 37,
                    totalQuestions = 40,
                    text = "Name two factors that affect the solubility of a solid in a liquid.",
                    options = emptyList(),
                    correctOptionId = "Temperature and agitation (stirring) [and/or particle size]",
                    explanation = "Solubility is influenced by temperature; agitation and particle size can affect the rate at which dissolution occurs.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20077,
                    questionNumber = 38,
                    totalQuestions = 40,
                    text = "Calculate the molarity of a solution containing 5.0 moles of solute in 2.0 liters of solution. Provide all values, units, context, and explain the method.",
                    options = emptyList(),
                    correctOptionId = "2.5 M",
                    explanation = "Molarity M = moles of solute / liters of solution; here M = 5.0 mol / 2.0 L = 2.5 mol/L (2.5 M).",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20078,
                    questionNumber = 39,
                    totalQuestions = 40,
                    text = "How many grams of NaCl are required to prepare 1.00 L of a 0.500 M NaCl solution? (M NaCl = 58.44 g/mol)",
                    options = emptyList(),
                    correctOptionId = "29.22 g",
                    explanation = "Moles needed = M × V = 0.500 mol/L × 1.00 L = 0.500 mol; mass = 0.500 mol × 58.44 g/mol = 29.22 g.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20079,
                    questionNumber = 40,
                    totalQuestions = 40,
                    text = "For a saturated solution at a fixed temperature, which statement is true?",
                    options = listOf(
                        QuestionOption("a", "It contains more solute than the maximum."),
                        QuestionOption("b", "It contains less solute than the maximum."),
                        QuestionOption("c", "It contains the maximum amount of solute that can dissolve at that temperature."),
                        QuestionOption("d", "Solubility keeps increasing with more solute.")
                    ),
                    correctOptionId = "c",
                    explanation = "A saturated solution contains the maximum amount of solute that can dissolve at that temperature; any additional solute remains undissolved."
                )
            )
        ),
        "chem_u3" to Quiz(
            id = "quiz_chemistry_u3_drive",
            title = "Chemistry — IMPORTANT INORGANIC COMPOUNDS Quiz",
            subject = "Chemistry",
            durationMinutes = 25,
            gradeLevel = "Grade 10",
            iconName = "beaker",
            unitId = "chem_u3",
            subjectId = "chemistry",
            questions = listOf(
                Question(
                    id = 20080,
                    questionNumber = 1,
                    totalQuestions = 40,
                    text = "Which statement best describes a chemical change?",
                    options = listOf(
                        QuestionOption("a", "A) ice melts"),
                        QuestionOption("b", "B) rusting of iron"),
                        QuestionOption("c", "C) sugar dissolves in tea"),
                        QuestionOption("d", "D) evaporation of water")
                    ),
                    correctOptionId = "b",
                    explanation = "Rusting involves formation of a new substance (iron oxide), unlike physical changes such as melting."
                ),
                Question(
                    id = 20081,
                    questionNumber = 2,
                    totalQuestions = 40,
                    text = "Which oxide is an acidic oxide that forms an acid when dissolved in water?",
                    options = listOf(
                        QuestionOption("a", "Na2O"),
                        QuestionOption("b", "SO3"),
                        QuestionOption("c", "MgO"),
                        QuestionOption("d", "K2O")
                    ),
                    correctOptionId = "b",
                    explanation = "Acidic oxides react with water to form acids; SO3 yields H2SO4."
                ),
                Question(
                    id = 20082,
                    questionNumber = 3,
                    totalQuestions = 40,
                    text = "Which statement about acids is true?",
                    options = listOf(
                        QuestionOption("a", "They turn blue litmus red"),
                        QuestionOption("b", "They turn red litmus blue"),
                        QuestionOption("c", "They do not conduct electricity in aqueous solution"),
                        QuestionOption("d", "They have pH > 7")
                    ),
                    correctOptionId = "a",
                    explanation = "Acids turn blue litmus red; they conduct electricity in aqueous solution; pH < 7."
                ),
                Question(
                    id = 20083,
                    questionNumber = 4,
                    totalQuestions = 40,
                    text = "Which of the following is true about bases?",
                    options = listOf(
                        QuestionOption("a", "They turn blue litmus red"),
                        QuestionOption("b", "They turn red litmus blue"),
                        QuestionOption("c", "They have sour taste"),
                        QuestionOption("d", "They do not react with acids")
                    ),
                    correctOptionId = "b",
                    explanation = "Bases turn red litmus blue; may have bitter taste and slippery feel; they react with acids."
                ),
                Question(
                    id = 20084,
                    questionNumber = 5,
                    totalQuestions = 40,
                    text = "Which statement about salts is correct?",
                    options = listOf(
                        QuestionOption("a", "All salts yield acidic solutions in water"),
                        QuestionOption("b", "Salts are formed by the neutralization of acids and bases"),
                        QuestionOption("c", "All salts are soluble in water"),
                        QuestionOption("d", "Salts contain the hydronium ion in solution")
                    ),
                    correctOptionId = "b",
                    explanation = "Salts are produced by neutralization; solubility depends on salt."
                ),
                Question(
                    id = 20085,
                    questionNumber = 6,
                    totalQuestions = 40,
                    text = "Acids turn red litmus paper blue.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "Acids turn blue litmus red rather than blue."
                ),
                Question(
                    id = 20086,
                    questionNumber = 7,
                    totalQuestions = 40,
                    text = "Define a chemical reaction in one sentence.",
                    options = emptyList(),
                    correctOptionId = "A chemical reaction is a process in which reactants are transformed into new substances (products).",
                    explanation = "Definition drawn from 3.1 Introduction.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20087,
                    questionNumber = 8,
                    totalQuestions = 40,
                    text = "Name two evidences that a chemical change has occurred when an acid reacts with a base to form a salt and water.",
                    options = emptyList(),
                    correctOptionId = "Formation of a salt and a temperature change (exothermic or endothermic)",
                    explanation = "Neutralization forms salt and water; heat change is a common evidence.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20088,
                    questionNumber = 9,
                    totalQuestions = 40,
                    text = "Calculate the pH of a 0.01 M HCl solution.",
                    options = emptyList(),
                    correctOptionId = "2.0",
                    explanation = "[H+] = 0.01 M; pH = -log10(0.01) = 2.0",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20089,
                    questionNumber = 10,
                    totalQuestions = 40,
                    text = "If 2.00 L of 1.50 M NaOH reacts completely with 0.50 L of 1.00 M H2SO4, how many grams of Na2SO4 are produced? Provide the method and final answer.",
                    options = emptyList(),
                    correctOptionId = "35.51 g Na2SO4",
                    explanation = "Moles NaOH = 2.00 L × 1.50 M = 3.00 mol; Moles H2SO4 = 0.50 L × 1.00 M = 0.50 mol; Limiting reagent is H2SO4; Moles Na2SO4 produced = 0.25 mol; Na2SO4 molar mass ≈ 142.04 g/mol; Mass = 0.25 × 142.04 = 35.51 g.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20090,
                    questionNumber = 11,
                    totalQuestions = 40,
                    text = "Which statement about oxides is correct?",
                    options = listOf(
                        QuestionOption("a", "An oxide is a compound containing only oxygen."),
                        QuestionOption("b", "An oxide is a compound formed when oxygen combines with another element."),
                        QuestionOption("c", "All oxides are acidic in water."),
                        QuestionOption("d", "Metal oxides do not react with water.")
                    ),
                    correctOptionId = "b",
                    explanation = "Oxides are compounds in which oxygen is bonded to another element; many oxides are formed when oxygen combines with elements, not just oxygen itself."
                ),
                Question(
                    id = 20091,
                    questionNumber = 12,
                    totalQuestions = 40,
                    text = "Which substance is a base?",
                    options = listOf(
                        QuestionOption("a", "H2SO4"),
                        QuestionOption("b", "NaOH"),
                        QuestionOption("c", "CO2"),
                        QuestionOption("d", "NH4Cl")
                    ),
                    correctOptionId = "b",
                    explanation = "NaOH is a strong base; it accepts protons and forms OH- in solution, unlike the acids or non-basic salts listed."
                ),
                Question(
                    id = 20092,
                    questionNumber = 13,
                    totalQuestions = 40,
                    text = "Define a salt and give one example.",
                    options = emptyList(),
                    correctOptionId = "Salt is a compound formed from the reaction of an acid with a base, containing positive and negative ions; Example: NaCl.",
                    explanation = "Salts are formed when acids neutralize bases; they consist of a cation from the base and an anion from the acid. Example: NaCl.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20093,
                    questionNumber = 14,
                    totalQuestions = 40,
                    text = "Acids turn blue litmus paper red.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Acids acidify aqueous solutions and turn blue litmus red; bases turn red litmus blue."
                ),
                Question(
                    id = 20094,
                    questionNumber = 15,
                    totalQuestions = 40,
                    text = "Which of the following acids is diprotic?",
                    options = listOf(
                        QuestionOption("a", "HCl"),
                        QuestionOption("b", "H2SO4"),
                        QuestionOption("c", "CH3COOH"),
                        QuestionOption("d", "HNO3")
                    ),
                    correctOptionId = "b",
                    explanation = "H2SO4 donates two protons, making it diprotic; others donate one proton in typical aqueous solutions."
                ),
                Question(
                    id = 20095,
                    questionNumber = 16,
                    totalQuestions = 40,
                    text = "Which oxide is amphoteric?",
                    options = listOf(
                        QuestionOption("a", "Na2O"),
                        QuestionOption("b", "Al2O3"),
                        QuestionOption("c", "Fe2O3"),
                        QuestionOption("d", "MgO")
                    ),
                    correctOptionId = "b",
                    explanation = "Al2O3 is amphoteric, reacting with both acids and bases; the others are basic oxides."
                ),
                Question(
                    id = 20096,
                    questionNumber = 17,
                    totalQuestions = 40,
                    text = "Explain why ammonia is considered a weak base in aqueous solution.",
                    options = emptyList(),
                    correctOptionId = "Ammonia (NH3) is a weak base because it partially accepts a proton in water to form NH4+ and OH-, with an equilibrium that lies to the left; the base dissociation constant Kb is small, indicating limited hydroxide production.",
                    explanation = "NH3 + H2O ⇌ NH4+ + OH-; Kb is about 1.8×10^-5; not all NH3 molecules form OH-; thus weaker than strong bases like NaOH.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20097,
                    questionNumber = 18,
                    totalQuestions = 40,
                    text = "Calculate the pH of a 0.10 M HCl solution.",
                    options = emptyList(),
                    correctOptionId = "1.0 (pH)",
                    explanation = "Hydrochloric acid is a strong acid; [H+] ≈ 0.10 M, pH = -log10(0.10) = 1.0.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20098,
                    questionNumber = 19,
                    totalQuestions = 40,
                    text = "Calculate the number of moles in 5.00 g of NaCl.",
                    options = emptyList(),
                    correctOptionId = "0.0856 mol",
                    explanation = "Molar mass NaCl = 58.44 g/mol; moles = mass / molar mass = 5.00 / 58.44 ≈ 0.0856 mol.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20099,
                    questionNumber = 20,
                    totalQuestions = 40,
                    text = "Which statement about salt formation from acids and bases is correct?",
                    options = listOf(
                        QuestionOption("a", "Salts are formed only when a metal reacts with an acid."),
                        QuestionOption("b", "Salts form from neutralization of an acid with a base; the cation comes from the base and the anion from the acid."),
                        QuestionOption("c", "Salt is only formed with strong acids."),
                        QuestionOption("d", "Salts do not conduct electricity in aqueous solution.")
                    ),
                    correctOptionId = "b",
                    explanation = "During neutralization, an acid and base produce a salt and water; the salt carries ions from both reactants; aqueous salt solutions conduct electricity due to mobile ions."
                ),
                Question(
                    id = 20100,
                    questionNumber = 21,
                    totalQuestions = 40,
                    text = "Which oxide is formed when magnesium burns in air?",
                    options = listOf(
                        QuestionOption("a", "MgO2"),
                        QuestionOption("b", "MgO"),
                        QuestionOption("c", "Mg2O3"),
                        QuestionOption("d", "MgO3")
                    ),
                    correctOptionId = "b",
                    explanation = "Magnesium reacts with oxygen to form magnesium oxide MgO, a basic oxide."
                ),
                Question(
                    id = 20101,
                    questionNumber = 22,
                    totalQuestions = 40,
                    text = "In water, Arrhenius acids yield which ion?",
                    options = listOf(
                        QuestionOption("a", "OH-"),
                        QuestionOption("b", "H+"),
                        QuestionOption("c", "Na+"),
                        QuestionOption("d", "NO3-")
                    ),
                    correctOptionId = "b",
                    explanation = "Arrhenius acids increase the concentration of hydrogen ions (H+) in aqueous solution (often represented as H3O+)."
                ),
                Question(
                    id = 20102,
                    questionNumber = 23,
                    totalQuestions = 40,
                    text = "Which reaction type produces a salt and water when an acid reacts with a base?",
                    options = listOf(
                        QuestionOption("a", "Combustion"),
                        QuestionOption("b", "Neutralization"),
                        QuestionOption("c", "Decomposition"),
                        QuestionOption("d", "Precipitation")
                    ),
                    correctOptionId = "b",
                    explanation = "Acid-base neutralization yields a salt and water."
                ),
                Question(
                    id = 20103,
                    questionNumber = 24,
                    totalQuestions = 40,
                    text = "Metal oxides reacting with acids are classified as which type of oxide?",
                    options = listOf(
                        QuestionOption("a", "Acidic oxide"),
                        QuestionOption("b", "Basic oxide"),
                        QuestionOption("c", "Neutral oxide"),
                        QuestionOption("d", "Amphoteric oxide")
                    ),
                    correctOptionId = "b",
                    explanation = "Metal oxides that react with acids to form a salt are basic oxides."
                ),
                Question(
                    id = 20104,
                    questionNumber = 25,
                    totalQuestions = 40,
                    text = "When NaOH reacts with H2SO4, which salt is formed?",
                    options = listOf(
                        QuestionOption("a", "Na2SO4"),
                        QuestionOption("b", "NaHSO4"),
                        QuestionOption("c", "Na2SO3"),
                        QuestionOption("d", "Na2S2O3")
                    ),
                    correctOptionId = "a",
                    explanation = "Neutralization of NaOH with H2SO4 yields sodium sulfate Na2SO4."
                ),
                Question(
                    id = 20105,
                    questionNumber = 26,
                    totalQuestions = 40,
                    text = "Name two evidences that a chemical change has occurred.",
                    options = emptyList(),
                    correctOptionId = "Formation of a precipitate and evolution of gas (gas production); color change; temperature change.",
                    explanation = "Chemical changes typically show precipitate formation, gas production, color changes, or temperature changes.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20106,
                    questionNumber = 27,
                    totalQuestions = 40,
                    text = "Define Arrhenius acid.",
                    options = emptyList(),
                    correctOptionId = "An Arrhenius acid is a substance that increases the concentration of H+ (or H3O+) ions in aqueous solution.",
                    explanation = "Arrhenius acids dissociate in water to produce H+ ions; the classic definition.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20107,
                    questionNumber = 28,
                    totalQuestions = 40,
                    text = "In the reaction H2SO4 + 2 NaOH → Na2SO4 + 2 H2O, if 0.180 mol H2SO4 reacts with 0.360 mol NaOH, how many moles of Na2SO4 are formed and what is its mass in grams?",
                    options = emptyList(),
                    correctOptionId = "0.180 mol Na2SO4 formed; mass = 25.57 g Na2SO4",
                    explanation = "The balanced equation shows 1 mol H2SO4 produces 1 mol Na2SO4; H2SO4 is limiting (0.180 mol), so Na2SO4 formed = 0.180 mol; Mass = 0.180 x 142.04 g/mol = 25.57 g.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20108,
                    questionNumber = 29,
                    totalQuestions = 40,
                    text = "True or False: All metal oxides are basic oxides.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "Some metal oxides can be amphoteric or behave as acids under certain conditions; not all are strictly basic."
                ),
                Question(
                    id = 20109,
                    questionNumber = 30,
                    totalQuestions = 40,
                    text = "Calculate the mass percent composition of sodium chloride (NaCl). Use Na = 22.99 g/mol and Cl = 35.45 g/mol.",
                    options = emptyList(),
                    correctOptionId = "Na: 39.34%; Cl: 60.66%",
                    explanation = "Molar mass NaCl = 22.99 + 35.45 = 58.44 g/mol. Mass% Na = 22.99/58.44 × 100 = 39.34%; Cl = 35.45/58.44 × 100 = 60.66%.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20110,
                    questionNumber = 31,
                    totalQuestions = 40,
                    text = "Which statement best defines a chemical reaction as used in Unit 3?",
                    options = listOf(
                        QuestionOption("a", "A process that only changes the appearance of substances"),
                        QuestionOption("b", "A process that forms new substances with different properties"),
                        QuestionOption("c", "A reversible change with no new substances"),
                        QuestionOption("d", "A change that cannot occur in everyday life")
                    ),
                    correctOptionId = "b",
                    explanation = "A chemical reaction involves the transformation of reactants into products with new properties, as described in 3.1 Introduction."
                ),
                Question(
                    id = 20111,
                    questionNumber = 32,
                    totalQuestions = 40,
                    text = "Which oxide is typically basic and reacts with water to form a hydroxide?",
                    options = listOf(
                        QuestionOption("a", "MgO"),
                        QuestionOption("b", "CO2"),
                        QuestionOption("c", "SO3"),
                        QuestionOption("d", "SiO2")
                    ),
                    correctOptionId = "a",
                    explanation = "Metal oxides like MgO form basic hydroxides when dissolved; CO2 and SO3 form acidic oxides; SiO2 is largely acidic/neutral."
                ),
                Question(
                    id = 20112,
                    questionNumber = 33,
                    totalQuestions = 40,
                    text = "Which of the following is an Arrhenius acid?",
                    options = listOf(
                        QuestionOption("a", "H2O"),
                        QuestionOption("b", "NaOH"),
                        QuestionOption("c", "HCl"),
                        QuestionOption("d", "NH3")
                    ),
                    correctOptionId = "c",
                    explanation = "Arrhenius acids release H+ in water; HCl is a classic example."
                ),
                Question(
                    id = 20113,
                    questionNumber = 34,
                    totalQuestions = 40,
                    text = "Which substance is an Arrhenius base?",
                    options = listOf(
                        QuestionOption("a", "HCl"),
                        QuestionOption("b", "NaOH"),
                        QuestionOption("c", "NH4Cl"),
                        QuestionOption("d", "CO2")
                    ),
                    correctOptionId = "b",
                    explanation = "Arrhenius bases release OH- in water; NaOH is a base."
                ),
                Question(
                    id = 20114,
                    questionNumber = 35,
                    totalQuestions = 40,
                    text = "Which of the following is a salt?",
                    options = listOf(
                        QuestionOption("a", "NaCl"),
                        QuestionOption("b", "H2O"),
                        QuestionOption("c", "O2"),
                        QuestionOption("d", "CO2")
                    ),
                    correctOptionId = "a",
                    explanation = "A salt is an ionic compound formed from neutralization; NaCl is a typical example."
                ),
                Question(
                    id = 20115,
                    questionNumber = 36,
                    totalQuestions = 40,
                    text = "Sodium oxide reacts with water to form sodium hydroxide.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Na2O + H2O → 2 NaOH; Na2O is a basic oxide."
                ),
                Question(
                    id = 20116,
                    questionNumber = 37,
                    totalQuestions = 40,
                    text = "State the Arrhenius definition of an acid.",
                    options = emptyList(),
                    correctOptionId = "An Arrhenius acid is a substance that increases the concentration of H+ (H3O+) ions in aqueous solution.",
                    explanation = "Arrhenius acids dissociate to give H+ ions in water, a foundational definition for acids in section 3.3.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20117,
                    questionNumber = 38,
                    totalQuestions = 40,
                    text = "State the Arrhenius definition of a base.",
                    options = emptyList(),
                    correctOptionId = "A substance that increases OH- ions in aqueous solution.",
                    explanation = "Arrhenius bases dissociate to give OH- ions in water, a foundational definition for bases in section 3.4.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20118,
                    questionNumber = 39,
                    totalQuestions = 40,
                    text = "A 25.0 mL sample of 1.00 M HCl is reacted with excess solid Na2CO3 to form NaCl. (a) How many grams of NaCl are produced? (b) Show your calculation steps and final unit.",
                    options = emptyList(),
                    correctOptionId = "1.461 g",
                    explanation = "Moles HCl = 0.0250 L × 1.00 mol/L = 0.0250 mol. Reaction: Na2CO3 + 2 HCl → 2 NaCl + CO2 + H2O. NaCl formed = equal to HCl moles (1:1 after simplification), so 0.0250 mol NaCl. Mass NaCl = 0.0250 mol × 58.44 g/mol = 1.461 g.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20119,
                    questionNumber = 40,
                    totalQuestions = 40,
                    text = "From 10.0 g of Na2CO3 reacting with 2.00 L of 0.100 M HCl, calculate the mass of NaCl produced. (Reaction: Na2CO3 + 2 HCl → 2 NaCl + CO2 + H2O)",
                    options = emptyList(),
                    correctOptionId = "11.0 g",
                    explanation = "Moles Na2CO3 = 10.0 g / 105.99 g/mol ≈ 0.0943 mol. Moles HCl provided = 2.00 L × 0.100 M = 0.200 mol. Na2CO3 is limiting (needs 0.1886 mol HCl to react with all Na2CO3). NaCl produced = 2 × 0.0943 mol = 0.1886 mol. Mass NaCl = 0.1886 mol × 58.44 g/mol ≈ 11.02 g ≈ 11.0 g.",
                    type = QuestionType.FILL_IN_THE_BLANK
                )
            )
        ),
        "chem_u4" to Quiz(
            id = "quiz_chemistry_u4_drive",
            title = "Chemistry — ENERGY CHANGES AND ELECTROCHEMISTRY Quiz",
            subject = "Chemistry",
            durationMinutes = 25,
            gradeLevel = "Grade 10",
            iconName = "beaker",
            unitId = "chem_u4",
            subjectId = "chemistry",
            questions = listOf(
                Question(
                    id = 20120,
                    questionNumber = 1,
                    totalQuestions = 40,
                    text = "In a galvanic cell, which statement is correct about the electrodes and electron flow?",
                    options = listOf(
                        QuestionOption("a", "Oxidation occurs at the anode"),
                        QuestionOption("b", "Reduction occurs at the anode"),
                        QuestionOption("c", "Electrons flow from cathode to anode"),
                        QuestionOption("d", "The salt bridge is unnecessary")
                    ),
                    correctOptionId = "a",
                    explanation = "In galvanic cells, oxidation occurs at the anode and reduction occurs at the cathode; electrons flow from the anode to the cathode through the external circuit."
                ),
                Question(
                    id = 20121,
                    questionNumber = 2,
                    totalQuestions = 40,
                    text = "Why do electrolyte solutions conduct electricity?",
                    options = listOf(
                        QuestionOption("a", "Because they contain free electrons that move through the solution"),
                        QuestionOption("b", "Because ions are present and can migrate"),
                        QuestionOption("c", "Because solvents are good conductors on their own"),
                        QuestionOption("d", "Because there are fixed charged particles only in solids")
                    ),
                    correctOptionId = "b",
                    explanation = "Conductivity in solutions arises from the movement of ions that carry charge."
                ),
                Question(
                    id = 20122,
                    questionNumber = 3,
                    totalQuestions = 40,
                    text = "In electrolysis, the electrical energy is used to drive a non-spontaneous chemical reaction.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Electrolysis requires external electrical energy to drive reactions that are not spontaneous."
                ),
                Question(
                    id = 20123,
                    questionNumber = 4,
                    totalQuestions = 40,
                    text = "In a galvanic (Voltaic) cell, which statement is true about the cathode and the reduction reaction?",
                    options = listOf(
                        QuestionOption("a", "The cathode is where oxidation occurs"),
                        QuestionOption("b", "The cathode is where reduction occurs"),
                        QuestionOption("c", "Electrons flow from cathode to anode"),
                        QuestionOption("d", "The salt bridge directly produces current")
                    ),
                    correctOptionId = "b",
                    explanation = "In galvanic cells, oxidation takes place at the anode and reduction at the cathode; electrons flow from anode to cathode via the external circuit."
                ),
                Question(
                    id = 20124,
                    questionNumber = 5,
                    totalQuestions = 40,
                    text = "According to Faraday's laws, when you increase the current while keeping time constant, the amount deposited at the electrodes:",
                    options = listOf(
                        QuestionOption("a", "Increases with current"),
                        QuestionOption("b", "Decreases with current"),
                        QuestionOption("c", "Remains constant"),
                        QuestionOption("d", "Increases with the square of the current")
                    ),
                    correctOptionId = "a",
                    explanation = "The amount deposited is proportional to the total charge Q = I t; higher current delivers more charge in the same time."
                ),
                Question(
                    id = 20125,
                    questionNumber = 6,
                    totalQuestions = 40,
                    text = "Name the part of the electrochemical cell where oxidation occurs.",
                    options = emptyList(),
                    correctOptionId = "Anode",
                    explanation = "Oxidation occurs at the anode; reduction occurs at the cathode.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20126,
                    questionNumber = 7,
                    totalQuestions = 40,
                    text = "Describe how the flow of electrons is related to the spontaneous redox reaction inside a galvanic cell.",
                    options = emptyList(),
                    correctOptionId = "Electrons flow from the anode (where oxidation occurs) to the cathode (where reduction occurs); the spontaneous redox reaction provides the driving force.",
                    explanation = "The spontaneous redox reaction drives electron flow through the external circuit from anode to cathode.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20127,
                    questionNumber = 8,
                    totalQuestions = 40,
                    text = "A 9.0 V electrolysis setup draws a current of 0.75 A for 3600 seconds. Calculate the total electrical energy supplied in joules. Provide the method and final unit.",
                    options = emptyList(),
                    correctOptionId = "24300 J",
                    explanation = "Energy E = V × I × t; E = 9 V × 0.75 A × 3600 s = 24300 J.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20128,
                    questionNumber = 9,
                    totalQuestions = 40,
                    text = "During electrolysis, a constant current of 0.40 A is applied for 900 s to deposit a metal that requires 2 electrons per atom. Using Faraday's constant (96485 C/mol e-), calculate the moles of metal deposited. Provide steps and final unit.",
                    options = emptyList(),
                    correctOptionId = "0.00187 mol",
                    explanation = "Q = I t = 0.40 A × 900 s = 360 C; moles e- = Q/F = 360/96485 ≈ 3.73e-3 mol e-; metal deposited = (3.73e-3)/2 ≈ 1.865e-3 mol.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20129,
                    questionNumber = 10,
                    totalQuestions = 40,
                    text = "Using the Nernst equation, if E° = 1.10 V, n = 2, and Q = 10 at 25°C, what is E? (choose the closest value)",
                    options = listOf(
                        QuestionOption("a", "1.07 V"),
                        QuestionOption("b", "1.10 V"),
                        QuestionOption("c", "1.13 V"),
                        QuestionOption("d", "0.93 V")
                    ),
                    correctOptionId = "a",
                    explanation = "E = E° − (0.0592/n) log Q = 1.10 − (0.0592/2) log 10 ≈ 1.10 − 0.0296 × 1 ≈ 1.070 V."
                ),
                Question(
                    id = 20130,
                    questionNumber = 11,
                    totalQuestions = 40,
                    text = "In a galvanic (Voltaic) cell, what happens at the anode?",
                    options = listOf(
                        QuestionOption("a", "Oxidation occurs and electrons are released"),
                        QuestionOption("b", "Reduction occurs and electrons are released"),
                        QuestionOption("c", "Oxidation occurs and electrons are gained"),
                        QuestionOption("d", "The salt bridge conducts electricity and no redox occurs")
                    ),
                    correctOptionId = "a",
                    explanation = "The anode is the site of oxidation in a galvanic cell; electrons flow from the anode through the external circuit to the cathode."
                ),
                Question(
                    id = 20131,
                    questionNumber = 12,
                    totalQuestions = 40,
                    text = "What is the function of the salt bridge in a galvanic cell?",
                    options = listOf(
                        QuestionOption("a", "It conducts electrons directly between electrodes"),
                        QuestionOption("b", "It maintains electrical neutrality by allowing ion flow between solutions"),
                        QuestionOption("c", "It stores energy"),
                        QuestionOption("d", "It produces electricity by redox reaction")
                    ),
                    correctOptionId = "b",
                    explanation = "The salt bridge permits ion movement to balance charges as electrons flow in the external circuit."
                ),
                Question(
                    id = 20132,
                    questionNumber = 13,
                    totalQuestions = 40,
                    text = "An electrolyte solution conducts electricity because it contains",
                    options = listOf(
                        QuestionOption("a", "Free electrons"),
                        QuestionOption("b", "Free ions"),
                        QuestionOption("c", "Covalent networks"),
                        QuestionOption("d", "No charge carriers")
                    ),
                    correctOptionId = "b",
                    explanation = "In electrolytes, ions move to carry charge and enable current."
                ),
                Question(
                    id = 20133,
                    questionNumber = 14,
                    totalQuestions = 40,
                    text = "In a galvanic cell, the electrode at which reduction occurs is the",
                    options = listOf(
                        QuestionOption("a", "Anode"),
                        QuestionOption("b", "Cathode"),
                        QuestionOption("c", "Salt bridge"),
                        QuestionOption("d", "Electrolyte")
                    ),
                    correctOptionId = "b",
                    explanation = "Reduction occurs at the cathode in a galvanic cell."
                ),
                Question(
                    id = 20134,
                    questionNumber = 15,
                    totalQuestions = 40,
                    text = "During electrolysis of molten NaCl, which products are formed at the cathode and anode, respectively?",
                    options = listOf(
                        QuestionOption("a", "Na (cathode) and Cl2 (anode)"),
                        QuestionOption("b", "Cl2 (cathode) and Na (anode)"),
                        QuestionOption("c", "NaCl remains unchanged"),
                        QuestionOption("d", "H2 (cathode) and O2 (anode)")
                    ),
                    correctOptionId = "a",
                    explanation = "Cathode reduction yields sodium metal; anode oxidation yields chlorine gas in molten NaCl."
                ),
                Question(
                    id = 20135,
                    questionNumber = 16,
                    totalQuestions = 40,
                    text = "In electrolysis, an external power source drives the redox reaction.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Electrolysis requires external energy to drive non-spontaneous reactions."
                ),
                Question(
                    id = 20136,
                    questionNumber = 17,
                    totalQuestions = 40,
                    text = "Define a galvanic (Voltaic) cell and give one real-world example.",
                    options = emptyList(),
                    correctOptionId = "A galvanic (Voltaic) cell is an electrochemical cell in which spontaneous redox reactions convert chemical energy into electrical energy; example: a dry cell battery (life of a small flashlight or a standard AA battery).",
                    explanation = "It converts chemical energy to electrical energy via spontaneous redox; real-world example: common batteries.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20137,
                    questionNumber = 18,
                    totalQuestions = 40,
                    text = "Explain how a salt bridge maintains charge balance in a galvanic cell.",
                    options = emptyList(),
                    correctOptionId = "The salt bridge allows ions to flow to balance charge buildup as electrons leave one half-cell and enter the other; cations migrate toward the cathode and anions toward the anode to keep solutions electrically neutral.",
                    explanation = "Ion flow from the salt bridge maintains electrical neutrality during sustained redox reactions in the half-cells.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20138,
                    questionNumber = 19,
                    totalQuestions = 40,
                    text = "Electrolysis of molten NaCl: A current of 5.0 A is passed for 30.0 s. How many grams of Na metal are produced at the cathode? Show all steps and final unit.",
                    options = emptyList(),
                    correctOptionId = "0.0358 g Na",
                    explanation = "Calculation steps: Q = I t = 5.0 A × 30.0 s = 150 C; moles e− = Q / F = 150 / 96485 = 1.556×10^-3 mol; Na+ + e− → Na(s) so moles Na = 1.556×10^-3 mol; mass Na = 1.556×10^-3 mol × 22.99 g/mol ≈ 0.0358 g.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20139,
                    questionNumber = 20,
                    totalQuestions = 40,
                    text = "Electrolysis of water: A current of 2.00 A is passed for 600 s. How many moles of H2 gas are produced at the cathode? Show method and final unit.",
                    options = emptyList(),
                    correctOptionId = "6.22×10^-3 mol H2",
                    explanation = "Calculation steps: Q = I t = 2.00 A × 600 s = 1200 C; For water reduction: 2 H+ + 2 e− → H2; moles H2 = Q / (2F) = 1200 / (2 × 96485) ≈ 6.22×10^-3 mol; final unit: moles of H2 (gas).",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20140,
                    questionNumber = 21,
                    totalQuestions = 40,
                    text = "In a galvanic (voltaic) cell, which statement about energy change is correct?",
                    options = listOf(
                        QuestionOption("a", "It absorbs energy from the surroundings"),
                        QuestionOption("b", "It releases energy to the surroundings"),
                        QuestionOption("c", "There is no energy change in the cell"),
                        QuestionOption("d", "Energy changes randomly and unpredictably")
                    ),
                    correctOptionId = "b",
                    explanation = "Galvanic cells convert chemical energy into electrical energy, releasing energy to the surroundings as electricity."
                ),
                Question(
                    id = 20141,
                    questionNumber = 22,
                    totalQuestions = 40,
                    text = "In a galvanic cell, which statement is true?",
                    options = listOf(
                        QuestionOption("a", "The anode is the positive electrode and oxidation occurs there"),
                        QuestionOption("b", "The cathode is the negative electrode and reduction occurs there"),
                        QuestionOption("c", "The anode is the negative electrode and oxidation occurs there"),
                        QuestionOption("d", "The external circuit supplies electrons to the cathode")
                    ),
                    correctOptionId = "c",
                    explanation = "In galvanic cells, the anode is negative and oxidation takes place there; electrons flow to the cathode through the external circuit."
                ),
                Question(
                    id = 20142,
                    questionNumber = 23,
                    totalQuestions = 40,
                    text = "During electrolysis of molten CuCl2, what are the products at the electrodes?",
                    options = listOf(
                        QuestionOption("a", "Cu at cathode and Cl2 at anode"),
                        QuestionOption("b", "Cl2 at cathode and Cu at anode"),
                        QuestionOption("c", "Cu2O and O2"),
                        QuestionOption("d", "Copper plating and hydrogen gas")
                    ),
                    correctOptionId = "a",
                    explanation = "In molten CuCl2, Cu2+ is reduced to Cu metal at the cathode, while Cl− is oxidized to Cl2 at the anode."
                ),
                Question(
                    id = 20143,
                    questionNumber = 24,
                    totalQuestions = 40,
                    text = "What does a standard electrode potential indicate?",
                    options = listOf(
                        QuestionOption("a", "The temperature at which the electrode operates"),
                        QuestionOption("b", "The tendency of a species to gain electrons (be reduced) under standard conditions"),
                        QuestionOption("c", "The concentration of ions in solution"),
                        QuestionOption("d", "The rate of the redox reaction")
                    ),
                    correctOptionId = "b",
                    explanation = "Standard electrode potentials indicate how readily a species gains electrons (is reduced) under standard conditions."
                ),
                Question(
                    id = 20144,
                    questionNumber = 25,
                    totalQuestions = 40,
                    text = "Which factor increases the conductivity of an electrolyte in solution under typical conditions?",
                    options = listOf(
                        QuestionOption("a", "Higher ion concentration"),
                        QuestionOption("b", "Higher viscosity"),
                        QuestionOption("c", "Lower temperature"),
                        QuestionOption("d", "Larger ion size")
                    ),
                    correctOptionId = "a",
                    explanation = "Higher concentrations of mobile ions generally increase the solution's ability to conduct electricity."
                ),
                Question(
                    id = 20145,
                    questionNumber = 26,
                    totalQuestions = 40,
                    text = "In a galvanic cell, the overall reaction is spontaneous under standard conditions.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Galvanic cells are designed to produce electrical energy spontaneously under standard conditions."
                ),
                Question(
                    id = 20146,
                    questionNumber = 27,
                    totalQuestions = 40,
                    text = "Explain the role of the salt bridge in a galvanic cell.",
                    options = emptyList(),
                    correctOptionId = "It completes the circuit and maintains electrical neutrality by allowing ion flow between half-cells, preventing charge buildup that would stop the reaction.",
                    explanation = "The salt bridge allows ions to move to balance charge as electrons flow through the external circuit.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20147,
                    questionNumber = 28,
                    totalQuestions = 40,
                    text = "Describe one real-world application of electrolysis.",
                    options = emptyList(),
                    correctOptionId = "Electroplating metals (such as silver or chromium) or extraction of reactive metals using electrolytic reduction.",
                    explanation = "Electrolysis is used in electroplating to deposit a metal layer and in extracting reactive metals from compounds.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20148,
                    questionNumber = 29,
                    totalQuestions = 40,
                    text = "Calculate the standard cell potential (E°cell) for a Daniell cell using the standard reduction potentials: Cu2+/Cu = +0.34 V and Zn2+/Zn = -0.76 V. The cell notation is: Zn(s) | Zn2+(aq) || Cu2+(aq) | Cu(s).",
                    options = emptyList(),
                    correctOptionId = "1.10 V",
                    explanation = "E°cell = E°cathode - E°anode = 0.34 - (-0.76) = 1.10 V. Units: volts (V).",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20149,
                    questionNumber = 30,
                    totalQuestions = 40,
                    text = "If 2.00 A is passed for 30.0 minutes through a solution containing Cu2+ to deposit copper at the cathode (n = 2 electrons per Cu), how many grams of Cu are deposited? Use F = 96485 C/mol and M(Cu) = 63.55 g/mol.",
                    options = emptyList(),
                    correctOptionId = "1.18 g Cu",
                    explanation = "I = 2.00 A; t = 30.0 min = 1800 s; Q = It = 3600 C; n = 2; moles Cu = Q/(nF) = 3600/(2×96485) ≈ 0.01863 mol; mass = 0.01863 × 63.55 ≈ 1.184 g. Final ≈ 1.18 g Cu deposited.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20150,
                    questionNumber = 31,
                    totalQuestions = 40,
                    text = "Which statement correctly describes energy changes in electrochemical reactions?",
                    options = listOf(
                        QuestionOption("a", "Energy changes in electrochemical reactions are always exothermic."),
                        QuestionOption("b", "Energy changes can be either exothermic or endothermic depending on the reaction."),
                        QuestionOption("c", "Energy changes occur only when gases are involved."),
                        QuestionOption("d", "Energy changes are not related to electrode potentials.")
                    ),
                    correctOptionId = "b",
                    explanation = "Electrochemical processes can release heat or absorb heat, and the overall energy change is linked to the cell potential and thermodynamics."
                ),
                Question(
                    id = 20151,
                    questionNumber = 32,
                    totalQuestions = 40,
                    text = "Which components are required in a galvanic (voltaic) cell?",
                    options = listOf(
                        QuestionOption("a", "Anode, cathode and salt bridge are required components of a galvanic cell."),
                        QuestionOption("b", "Only the anode is needed."),
                        QuestionOption("c", "Only the cathode and salt bridge are needed."),
                        QuestionOption("d", "An electrode and an electrolyte alone are sufficient.")
                    ),
                    correctOptionId = "a",
                    explanation = "A galvanic cell consists of two electrodes (anode and cathode), an electrolyte, and often a salt bridge to maintain charge balance."
                ),
                Question(
                    id = 20152,
                    questionNumber = 33,
                    totalQuestions = 40,
                    text = "For the galvanic cell represented by Zn(s) | Zn2+(aq, 1 M) || Cu2+(aq, 1 M) | Cu(s), which statement is correct?",
                    options = listOf(
                        QuestionOption("a", "The reaction as written is spontaneous."),
                        QuestionOption("b", "The zinc electrode is the cathode."),
                        QuestionOption("c", "The copper electrode is the anode."),
                        QuestionOption("d", "The cell is electrolytic.")
                    ),
                    correctOptionId = "a",
                    explanation = "Zn is oxidized at the anode and Cu2+ is reduced at the cathode; the overall cell reaction occurs spontaneously, giving E°cell positive."
                ),
                Question(
                    id = 20153,
                    questionNumber = 34,
                    totalQuestions = 40,
                    text = "During the electrolysis of molten sodium chloride, which product is formed at the cathode?",
                    options = listOf(
                        QuestionOption("a", "Chlorine gas"),
                        QuestionOption("b", "Sodium metal"),
                        QuestionOption("c", "Hydrogen gas"),
                        QuestionOption("d", "Oxygen gas")
                    ),
                    correctOptionId = "b",
                    explanation = "At the cathode, Na+ gains electrons to form Na metal; Cl- is oxidized at the anode to Cl2."
                ),
                Question(
                    id = 20154,
                    questionNumber = 35,
                    totalQuestions = 40,
                    text = "Which change increases the electrical conductivity of an electrolyte solution?",
                    options = listOf(
                        QuestionOption("a", "Lower ion mobility"),
                        QuestionOption("b", "Increase in ion mobility"),
                        QuestionOption("c", "Addition of non-electrolytes"),
                        QuestionOption("d", "Decreasing temperature")
                    ),
                    correctOptionId = "b",
                    explanation = "Higher ion mobility allows more charge carriers to move, raising conductivity. Temperature and electrolyte type influence mobility."
                ),
                Question(
                    id = 20155,
                    questionNumber = 36,
                    totalQuestions = 40,
                    text = "A galvanic cell Zn(s) | Zn2+(aq, 1 M) || Cu2+(aq, 1 M) | Cu(s) has E°cell = +1.10 V at 25°C. If [Zn2+] = 0.010 M and [Cu2+] = 0.10 M, what is the cell potential E? Use the Nernst equation E = E°cell - (0.05916/n) log(Q).",
                    options = emptyList(),
                    correctOptionId = "E ≈ 1.13 V",
                    explanation = "Reaction: Zn(s) + Cu2+(aq) → Zn2+(aq) + Cu(s). Q = [Zn2+]/[Cu2+] = 0.010/0.10 = 0.10. n = 2. E = 1.10 - (0.05916/2) log(0.10) = 1.10 - 0.02958(-1) ≈ 1.13 V.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20156,
                    questionNumber = 37,
                    totalQuestions = 40,
                    text = "During the electrolysis of concentrated sodium chloride solution (brine), 5.0 A of current is passed for 120 s. Assuming Cl2 is evolved at the anode via 2 Cl− → Cl2 + 2 e−, calculate the mass of Cl2 produced. Use F = 96485 C/mol and M(Cl2) = 70.90 g/mol.",
                    options = emptyList(),
                    correctOptionId = "Approximately 0.22 g of Cl2",
                    explanation = "Charge Q = I t = 5.0 A × 120 s = 600 C. Moles of electrons = Q / F = 600 / 96485 ≈ 0.00621 mol e−. Moles of Cl2 = (0.00621) / 2 ≈ 0.003106 mol. Mass = 0.003106 × 70.90 ≈ 0.22 g.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20157,
                    questionNumber = 38,
                    totalQuestions = 40,
                    text = "A galvanic cell with a positive standard cell potential E°cell will always be spontaneous at any temperature.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "E°cell indicates spontaneity under standard conditions (25°C, 1 M). At other temperatures or concentrations, ΔG = -nFE and spontaneity can change."
                ),
                Question(
                    id = 20158,
                    questionNumber = 39,
                    totalQuestions = 40,
                    text = "What is the function of a salt bridge in a galvanic cell?",
                    options = emptyList(),
                    correctOptionId = "It maintains electrical neutrality by allowing ions to flow between half-cells, preventing charge buildup.",
                    explanation = "The salt bridge completes the circuit by balancing charge as electrons flow through the external circuit.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20159,
                    questionNumber = 40,
                    totalQuestions = 40,
                    text = "Differentiate between galvanic and electrolytic cells in terms of energy flow and electrode roles.",
                    options = emptyList(),
                    correctOptionId = "Galvanic cell: chemical energy is converted to electrical energy; reaction is spontaneous (positive E°cell). Electrolytic cell: electrical energy is supplied to drive a non-spontaneous reaction; external power source forces electrons from anode (positive) to cathode (negative).",
                    explanation = "In galvanic cells the cell provides power; in electrolytic cells power is supplied to force non-spontaneous reaction; electrode polarity differs.",
                    type = QuestionType.FILL_IN_THE_BLANK
                )
            )
        ),
        "chem_u5" to Quiz(
            id = "quiz_chemistry_u5_drive",
            title = "Chemistry — METALS AND NONMETALS Quiz",
            subject = "Chemistry",
            durationMinutes = 25,
            gradeLevel = "Grade 10",
            iconName = "beaker",
            unitId = "chem_u5",
            subjectId = "chemistry",
            questions = listOf(
                Question(
                    id = 20160,
                    questionNumber = 1,
                    totalQuestions = 40,
                    text = "Which of the following is a general property of metals?",
                    options = listOf(
                        QuestionOption("a", "Dull and brittle"),
                        QuestionOption("b", "Poor conductor of heat"),
                        QuestionOption("c", "Shiny and good conductor of electricity"),
                        QuestionOption("d", "Gases at room temperature")
                    ),
                    correctOptionId = "c",
                    explanation = "Metals are typically lustrous and good conductors of heat and electricity."
                ),
                Question(
                    id = 20161,
                    questionNumber = 2,
                    totalQuestions = 40,
                    text = "Which property best distinguishes most nonmetals from metals?",
                    options = listOf(
                        QuestionOption("a", "High melting points"),
                        QuestionOption("b", "Very good electrical conductivity"),
                        QuestionOption("c", "Poor electrical conductivity"),
                        QuestionOption("d", "Malleability")
                    ),
                    correctOptionId = "c",
                    explanation = "Nonmetals are generally poor conductors of electricity compared with metals."
                ),
                Question(
                    id = 20162,
                    questionNumber = 3,
                    totalQuestions = 40,
                    text = "An alloy is",
                    options = listOf(
                        QuestionOption("a", "A pure metal"),
                        QuestionOption("b", "A mixture of two or more elements designed to improve properties"),
                        QuestionOption("c", "A nonmetal oxide"),
                        QuestionOption("d", "A compound of metal and nonmetal")
                    ),
                    correctOptionId = "b",
                    explanation = "Alloys combine elements to enhance properties such as strength, hardness, or durability."
                ),
                Question(
                    id = 20163,
                    questionNumber = 4,
                    totalQuestions = 40,
                    text = "Metals are generally malleable and ductile.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Metals are typically malleable and can be drawn into wires (ductile)."
                ),
                Question(
                    id = 20164,
                    questionNumber = 5,
                    totalQuestions = 40,
                    text = "Which metal is commonly obtained from bauxite ore and used in the aircraft industry?",
                    options = listOf(
                        QuestionOption("a", "Iron"),
                        QuestionOption("b", "Copper"),
                        QuestionOption("c", "Aluminum"),
                        QuestionOption("d", "Zinc")
                    ),
                    correctOptionId = "c",
                    explanation = "Aluminum is produced from bauxite ore and is lightweight, widely used in aircraft construction."
                ),
                Question(
                    id = 20165,
                    questionNumber = 6,
                    totalQuestions = 40,
                    text = "Give one example of an alloy and its common use.",
                    options = emptyList(),
                    correctOptionId = "Steel — used in construction and for making tools.",
                    explanation = "Alloys improve properties such as strength and durability; steel (iron–carbon alloy) is widely used in construction and manufacturing.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20166,
                    questionNumber = 7,
                    totalQuestions = 40,
                    text = "In a simplified reduction reaction, Fe2O3 yields 4 Fe. If 2.00 moles of Fe2O3 are reduced, how many grams of iron are produced? (Fe atomic mass = 55.85 g/mol)",
                    options = emptyList(),
                    correctOptionId = "223.4 g",
                    explanation = "Stoichiometry:  Fe2O3 -> 4 Fe; moles Fe produced = 4.00 mol; mass Fe = 4.00 x 55.85 g/mol = 223.4 g.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20167,
                    questionNumber = 8,
                    totalQuestions = 40,
                    text = "Which method is used to produce nitrogen gas on a large scale?",
                    options = listOf(
                        QuestionOption("a", "Filtration of air"),
                        QuestionOption("b", "Fractional distillation of liquid air"),
                        QuestionOption("c", "Electrolysis of water"),
                        QuestionOption("d", "Direct reaction of atmospheric nitrogen with hydrogen")
                    ),
                    correctOptionId = "b",
                    explanation = "Nitrogen gas is obtained industrially by fractional distillation of liquid air."
                ),
                Question(
                    id = 20168,
                    questionNumber = 9,
                    totalQuestions = 40,
                    text = "Briefly outline two main stages in obtaining iron from its ore as described in 5.2.3.",
                    options = emptyList(),
                    correctOptionId = "1) Extraction and concentration of iron ore; 2) Reduction in a blast furnace to produce iron, followed by refining to steel.",
                    explanation = "Iron production typically involves ore concentration, reduction to iron in a blast furnace, and subsequent refining.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20169,
                    questionNumber = 10,
                    totalQuestions = 40,
                    text = "In brass, copper is 70% by mass and zinc 30%. A 1.20 kg sample of brass is melted. How many grams of copper and zinc are present?",
                    options = emptyList(),
                    correctOptionId = "Copper: 840 g; Zinc: 360 g",
                    explanation = "Masses are found by multiplying total mass by the mass percentages: Cu = 0.70 × 1200 g = 840 g; Zn = 0.30 × 1200 g = 360 g.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20170,
                    questionNumber = 11,
                    totalQuestions = 40,
                    text = "Which of the following is a typical property of metals?",
                    options = listOf(
                        QuestionOption("a", "Malleable and good conductors of electricity"),
                        QuestionOption("b", "Brittle and poor conductors of electricity"),
                        QuestionOption("c", "Non-malleable and poor conductors of heat"),
                        QuestionOption("d", "High brittleness and insulators for heat")
                    ),
                    correctOptionId = "a",
                    explanation = "Metals are generally malleable and good conductors of heat and electricity, which distinguishes them from most nonmetals."
                ),
                Question(
                    id = 20171,
                    questionNumber = 12,
                    totalQuestions = 40,
                    text = "Which statement about alloys is true?",
                    options = listOf(
                        QuestionOption("a", "Alloys are formed only from two metals"),
                        QuestionOption("b", "Alloys are mixtures of two or more elements, at least one metal"),
                        QuestionOption("c", "Alloys always have lower melting points than their components"),
                        QuestionOption("d", "All alloys cannot conduct electricity")
                    ),
                    correctOptionId = "b",
                    explanation = "Alloys are designed mixtures of elements, typically to improve properties such as strength; they are not limited to two metals and often change melting points."
                ),
                Question(
                    id = 20172,
                    questionNumber = 13,
                    totalQuestions = 40,
                    text = "Which process is primarily used to extract aluminum metal from its ore?",
                    options = listOf(
                        QuestionOption("a", "Electrolysis of molten alumina in cryolite"),
                        QuestionOption("b", "Reduction with coke to form iron"),
                        QuestionOption("c", "Electroplating copper onto a surface"),
                        QuestionOption("d", "Smelting in a blast furnace for iron ore")
                    ),
                    correctOptionId = "a",
                    explanation = "Industrial production of aluminum uses the Hall-Héroult process: electrolysis of alumina dissolved in cryolite to yield aluminum metal."
                ),
                Question(
                    id = 20173,
                    questionNumber = 14,
                    totalQuestions = 40,
                    text = "Which nonmetal is most abundant in the Earth's atmosphere and is commonly produced industrially by fractional distillation of liquid air?",
                    options = listOf(
                        QuestionOption("a", "Oxygen"),
                        QuestionOption("b", "Nitrogen"),
                        QuestionOption("c", "Argon"),
                        QuestionOption("d", "Neon")
                    ),
                    correctOptionId = "b",
                    explanation = "Nitrogen makes up about 78% of the atmosphere and is commonly produced industrially via fractional distillation of liquid air."
                ),
                Question(
                    id = 20174,
                    questionNumber = 15,
                    totalQuestions = 40,
                    text = "Bronze is an alloy of copper and tin with improved hardness. Which statement is true?",
                    options = listOf(
                        QuestionOption("a", "It is a pure metal."),
                        QuestionOption("b", "It is an alloy of copper with tin."),
                        QuestionOption("c", "It has a lower density than copper."),
                        QuestionOption("d", "It cannot conduct electricity.")
                    ),
                    correctOptionId = "b",
                    explanation = "Bronze is a copper-tin alloy; alloying generally alters properties like hardness and strength and still conducts electricity."
                ),
                Question(
                    id = 20175,
                    questionNumber = 16,
                    totalQuestions = 40,
                    text = "All metals conduct electricity in the solid state.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Most metals have free electrons that allow electrical conduction in the solid state."
                ),
                Question(
                    id = 20176,
                    questionNumber = 17,
                    totalQuestions = 40,
                    text = "State one general property of nonmetals and give one common use of a nonmetallic compound.",
                    options = emptyList(),
                    correctOptionId = "Nonmetals are poor conductors of electricity; ammonia (NH3) is commonly used as a fertilizer.",
                    explanation = "From 5.3.1, nonmetals are typically poor conductors; nonmetallic compounds like ammonia have agricultural uses.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20177,
                    questionNumber = 18,
                    totalQuestions = 40,
                    text = "Describe one industrial method for producing nitrogen gas.",
                    options = emptyList(),
                    correctOptionId = "Fractional distillation of liquid air.",
                    explanation = "Nitrogen is commonly produced industrially by fractional distillation of liquid air to separate N2 from O2 and other gases.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20178,
                    questionNumber = 19,
                    totalQuestions = 40,
                    text = "A bronze alloy contains 66 g copper and 34 g tin. What is the mass percentage of copper in the alloy?",
                    options = emptyList(),
                    correctOptionId = "66%",
                    explanation = "Total mass = 66 g + 34 g = 100 g. Mass percentage of copper = (66/100) × 100 = 66%.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20179,
                    questionNumber = 20,
                    totalQuestions = 40,
                    text = "An iron–carbon alloy contains 90 g iron and 10 g carbon. What is the mass percentage of iron in the alloy?",
                    options = emptyList(),
                    correctOptionId = "90%",
                    explanation = "Mass percentage of iron = (90/100) × 100 = 90%.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20180,
                    questionNumber = 21,
                    totalQuestions = 40,
                    text = "Which statement correctly contrasts metals with nonmetals?",
                    options = listOf(
                        QuestionOption("a", "Metals are brittle and poor conductors of electricity."),
                        QuestionOption("b", "Metals are generally good conductors of electricity and are malleable."),
                        QuestionOption("c", "Nonmetals are malleable and lustrous."),
                        QuestionOption("d", "All metals exist as gases at room temperature.")
                    ),
                    correctOptionId = "b",
                    explanation = "Metals typically conduct electricity well and are malleable, unlike most nonmetals which are poor conductors and brittle."
                ),
                Question(
                    id = 20181,
                    questionNumber = 22,
                    totalQuestions = 40,
                    text = "Which method is commonly used to obtain iron from its ore in a blast furnace?",
                    options = listOf(
                        QuestionOption("a", "Electrolysis of molten ore"),
                        QuestionOption("b", "Reduction with carbon (coke) in a blast furnace"),
                        QuestionOption("c", "Distillation"),
                        QuestionOption("d", "Filtration")
                    ),
                    correctOptionId = "b",
                    explanation = "Iron ore is reduced with coke (carbon) in a blast furnace to produce iron and slag."
                ),
                Question(
                    id = 20182,
                    questionNumber = 23,
                    totalQuestions = 40,
                    text = "An alloy is defined as",
                    options = listOf(
                        QuestionOption("a", "A pure element"),
                        QuestionOption("b", "A compound that cannot be separated"),
                        QuestionOption("c", "A substance made by melting two or more elements and combining them to improve properties"),
                        QuestionOption("d", "A metal that is liquid at room temperature")
                    ),
                    correctOptionId = "c",
                    explanation = "Alloys are combinations of elements designed to improve properties such as strength or durability."
                ),
                Question(
                    id = 20183,
                    questionNumber = 24,
                    totalQuestions = 40,
                    text = "Which metal is primarily produced by the Hall-Héroult process?",
                    options = listOf(
                        QuestionOption("a", "Iron"),
                        QuestionOption("b", "Aluminum"),
                        QuestionOption("c", "Copper"),
                        QuestionOption("d", "Zinc")
                    ),
                    correctOptionId = "b",
                    explanation = "The Hall-Héroult process is used to extract aluminum from its oxide."
                ),
                Question(
                    id = 20184,
                    questionNumber = 25,
                    totalQuestions = 40,
                    text = "In the blast furnace, limestone is added to form slag with impurities. What is the main purpose?",
                    options = listOf(
                        QuestionOption("a", "It acts as the reducing agent with carbon"),
                        QuestionOption("b", "It forms slag with impurities to remove them from metal"),
                        QuestionOption("c", "It supplies iron to the reaction"),
                        QuestionOption("d", "It is the main source of silica to produce silicon dioxide")
                    ),
                    correctOptionId = "b",
                    explanation = "Limestone decomposes to form lime which bonds with impurities to form slag, helping remove impurities from molten iron."
                ),
                Question(
                    id = 20185,
                    questionNumber = 26,
                    totalQuestions = 40,
                    text = "Nonmetals generally have high electrical conductivity.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "Nonmetals are typically poor conductors of electricity."
                ),
                Question(
                    id = 20186,
                    questionNumber = 27,
                    totalQuestions = 40,
                    text = "Name two properties of metals that make them suitable for electrical wiring and give one example of a metal used for wiring.",
                    options = emptyList(),
                    correctOptionId = "Two properties: high electrical conductivity and ductility/malleability; Example: copper.",
                    explanation = "Metals used in wiring are chosen for good conductivity and ability to be drawn into wires (ductility). Copper is a common example.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20187,
                    questionNumber = 28,
                    totalQuestions = 40,
                    text = "Describe two common uses of nonmetals or nonmetallic compounds.",
                    options = emptyList(),
                    correctOptionId = "Examples: nitrogen in fertilizers; chlorine in water disinfection; oxygen for respiration.",
                    explanation = "Nonmetals play key roles in agriculture (fertilizers) and public health (water disinfection) among other applications.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20188,
                    questionNumber = 29,
                    totalQuestions = 40,
                    text = "From 25.0 g Fe2O3, how many grams of iron (Fe) are produced in the reaction Fe2O3 + 3CO -> 2Fe + 3CO2? (Molar masses: Fe2O3 = 159.69 g/mol, Fe = 55.85 g/mol)",
                    options = emptyList(),
                    correctOptionId = "17.5 g",
                    explanation = "Moles Fe2O3 = 25.0 g / 159.69 g/mol = 0.1566 mol. From the balanced equation, 2 mol Fe are produced per 1 mol Fe2O3, so Fe moles = 0.3132 mol; mass Fe = 0.3132 mol × 55.85 g/mol = 17.5 g.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20189,
                    questionNumber = 30,
                    totalQuestions = 40,
                    text = "From 60.0 g Cu2O (copper(I) oxide), how many grams of copper (Cu) are produced by the reaction 2Cu2O + C → 4Cu + CO? (Molar masses: Cu = 63.55 g/mol, Cu2O = 143.10 g/mol)",
                    options = emptyList(),
                    correctOptionId = "53.3 g",
                    explanation = "Moles Cu2O = 60.0 g / 143.10 g/mol = 0.4193 mol. From the balanced equation, 4 mol Cu are produced per 2 mol Cu2O, i.e., 2 mol Cu per 2 mol Cu2O, so Cu moles = 0.4193 mol × 2 = 0.8386 mol. Mass Cu = 0.8386 mol × 63.55 g/mol = 53.3 g.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20190,
                    questionNumber = 31,
                    totalQuestions = 40,
                    text = "Which of the following best describes metals?",
                    options = listOf(
                        QuestionOption("a", "They are poor conductors of heat and electricity."),
                        QuestionOption("b", "They are hard, brittle and usually poor conductors of electricity."),
                        QuestionOption("c", "They are malleable, ductile and good conductors of electricity."),
                        QuestionOption("d", "They are gases at room temperature.")
                    ),
                    correctOptionId = "c",
                    explanation = "Metals are typically malleable and ductile, and they conduct heat and electricity well due to metallic bonding with delocalized electrons."
                ),
                Question(
                    id = 20191,
                    questionNumber = 32,
                    totalQuestions = 40,
                    text = "Brass is an alloy of copper and zinc. Increasing the zinc content generally makes brass:",
                    options = listOf(
                        QuestionOption("a", "Increase hardness and decrease malleability."),
                        QuestionOption("b", "Decrease hardness and increase malleability."),
                        QuestionOption("c", "Have no effect on hardness or malleability."),
                        QuestionOption("d", "Turn into a non-metal.")
                    ),
                    correctOptionId = "a",
                    explanation = "Brass (Cu-Zn alloy) becomes harder and less malleable as zinc content increases due to changes in the crystal structure and bonding."
                ),
                Question(
                    id = 20192,
                    questionNumber = 33,
                    totalQuestions = 40,
                    text = "Which metal is produced industrially by the Hall–Héroult process?",
                    options = listOf(
                        QuestionOption("a", "Aluminium"),
                        QuestionOption("b", "Iron"),
                        QuestionOption("c", "Copper"),
                        QuestionOption("d", "Zinc")
                    ),
                    correctOptionId = "a",
                    explanation = "The Hall–Héroult process is used for industrial production of aluminium from alumina (Al2O3) dissolved in cryolite."
                ),
                Question(
                    id = 20193,
                    questionNumber = 34,
                    totalQuestions = 40,
                    text = "Which nonmetal is primarily obtained by fractional distillation of liquid air?",
                    options = listOf(
                        QuestionOption("a", "Nitrogen"),
                        QuestionOption("b", "Oxygen"),
                        QuestionOption("c", "Chlorine"),
                        QuestionOption("d", "Sulfur")
                    ),
                    correctOptionId = "a",
                    explanation = "Fractional distillation of liquid air separates nitrogen as the major gaseous component due to its lower boiling point compared to oxygen."
                ),
                Question(
                    id = 20194,
                    questionNumber = 35,
                    totalQuestions = 40,
                    text = "In the chlor-alkali process for producing chlorine gas, which species is reduced at the cathode?",
                    options = listOf(
                        QuestionOption("a", "Cl−"),
                        QuestionOption("b", "Na+"),
                        QuestionOption("c", "H2O"),
                        QuestionOption("d", "Cl2")
                    ),
                    correctOptionId = "c",
                    explanation = "In brine electrolysis, water is reduced at the cathode to produce hydrogen gas and OH−; Cl− is oxidized at the anode to Cl2."
                ),
                Question(
                    id = 20195,
                    questionNumber = 36,
                    totalQuestions = 40,
                    text = "Metals tend to gain electrons to form positive ions.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "Metals typically lose electrons to form positive ions (cations), whereas nonmetals tend to gain electrons."
                ),
                Question(
                    id = 20196,
                    questionNumber = 37,
                    totalQuestions = 40,
                    text = "Explain two properties of metals that make them good conductors of electricity.",
                    options = emptyList(),
                    correctOptionId = "Metals have delocalized electrons that move freely (sea of electrons) and a metallic lattice that allows electron flow, enabling good electrical conductivity.",
                    explanation = "Delocalized electrons move under an electric field, carrying charge; the metallic lattice allows electron mobility even when atoms are fixed in a lattice.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20197,
                    questionNumber = 38,
                    totalQuestions = 40,
                    text = "Briefly describe the Hall–Héroult process used to produce aluminum from alumina, including the role of alumina, molten cryolite, and carbon electrodes.",
                    options = emptyList(),
                    correctOptionId = "Alumina (Al2O3) is dissolved in molten cryolite to lower its melting point; electrolysis with carbon electrodes reduces Al3+ to Al at the cathode while oxygen is produced at the anode and can form CO2 with carbon.",
                    explanation = "Al2O3 is not molten directly due to high melting point; cryolite lowers it; electrolysis yields Al metal at the cathode; O2- reacts at the anode, often with carbon to form CO2.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20198,
                    questionNumber = 39,
                    totalQuestions = 40,
                    text = "An alloy brass contains 70% copper and 30% zinc by mass. If you have 500 g of brass, calculate the masses of copper and zinc in the sample. Show your method and provide final units.",
                    options = emptyList(),
                    correctOptionId = "Copper: 350 g; Zinc: 150 g",
                    explanation = "Mass of copper = 0.70 × 500 g = 350 g; Mass of zinc = 0.30 × 500 g = 150 g. Final units: grams.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20199,
                    questionNumber = 40,
                    totalQuestions = 40,
                    text = "If 64.9 g of copper(II) oxide (CuO) is reduced to copper metal (Cu) by hydrogen gas according to the equation CuO + H2 → Cu + H2O, what mass of copper is produced (assume 100% yield)? Show all steps and provide final units.",
                    options = emptyList(),
                    correctOptionId = "Cu produced ≈ 51.9 g",
                    explanation = "Molar masses: CuO 79.545 g/mol; Cu 63.55 g/mol. Moles CuO = 64.9 / 79.545 ≈ 0.817 mol. 1 mol CuO yields 1 mol Cu, so moles Cu = 0.817. Mass Cu = 0.817 × 63.55 ≈ 51.9 g.",
                    type = QuestionType.FILL_IN_THE_BLANK
                )
            )
        ),
        "chem_u6" to Quiz(
            id = "quiz_chemistry_u6_drive",
            title = "Chemistry — HYDROCARBONS AND THEIR NATURAL SOURCES Quiz",
            subject = "Chemistry",
            durationMinutes = 25,
            gradeLevel = "Grade 10",
            iconName = "beaker",
            unitId = "chem_u6",
            subjectId = "chemistry",
            questions = listOf(
                Question(
                    id = 20200,
                    questionNumber = 1,
                    totalQuestions = 40,
                    text = "Which general formula represents saturated hydrocarbons (alkanes)?",
                    options = listOf(
                        QuestionOption("a", "CnH2n"),
                        QuestionOption("b", "CnH2n+2"),
                        QuestionOption("c", "CnH2n+1"),
                        QuestionOption("d", "CnH2n+4")
                    ),
                    correctOptionId = "b",
                    explanation = "Alkanes have formula CnH2n+2; each carbon adds two hydrogens."
                ),
                Question(
                    id = 20201,
                    questionNumber = 2,
                    totalQuestions = 40,
                    text = "Which alkane has five carbon atoms?",
                    options = listOf(
                        QuestionOption("a", "Methane"),
                        QuestionOption("b", "Pentane"),
                        QuestionOption("c", "Hexane"),
                        QuestionOption("d", "Butane")
                    ),
                    correctOptionId = "b",
                    explanation = "General formula CnH2n+2 with n=5 yields C5H12."
                ),
                Question(
                    id = 20202,
                    questionNumber = 3,
                    totalQuestions = 40,
                    text = "Which class of hydrocarbons does cyclohexane belong to?",
                    options = listOf(
                        QuestionOption("a", "Alkene"),
                        QuestionOption("b", "Alkyne"),
                        QuestionOption("c", "Cycloalkane"),
                        QuestionOption("d", "Aromatic")
                    ),
                    correctOptionId = "c",
                    explanation = "Cycloalkanes are alicyclic hydrocarbons with ring structures that are not aromatic."
                ),
                Question(
                    id = 20203,
                    questionNumber = 4,
                    totalQuestions = 40,
                    text = "Which statement best describes benzene?",
                    options = listOf(
                        QuestionOption("a", "It is a saturated hydrocarbon"),
                        QuestionOption("b", "It is aromatic with delocalized electrons"),
                        QuestionOption("c", "It contains a single carbon ring with alternating single bonds only"),
                        QuestionOption("d", "It has no ring structure")
                    ),
                    correctOptionId = "b",
                    explanation = "Benzene is an aromatic hydrocarbon with a stable ring system of delocalized electrons."
                ),
                Question(
                    id = 20204,
                    questionNumber = 5,
                    totalQuestions = 40,
                    text = "What is the correct IUPAC name for benzene with a chlorine substituent at position 1 and a methyl substituent at position 2?",
                    options = listOf(
                        QuestionOption("a", "1-chloro-2-methylbenzene"),
                        QuestionOption("b", "2-chloro-1-methylbenzene"),
                        QuestionOption("c", "1-methyl-2-chlorobenzene"),
                        QuestionOption("d", "3-chloro-1-methylbenzene")
                    ),
                    correctOptionId = "a",
                    explanation = "For adjacent substituents on a benzene ring, the locants are 1 and 2; substituents are listed in alphabetical order (chloro before methyl) leading to 1-chloro-2-methylbenzene."
                ),
                Question(
                    id = 20205,
                    questionNumber = 6,
                    totalQuestions = 40,
                    text = "Natural gas is primarily composed of methane.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False"),
                        QuestionOption("c", "Option 3"),
                        QuestionOption("d", "Option 4")
                    ),
                    correctOptionId = "a",
                    explanation = "Natural gas is dominated by methane, with smaller amounts of other hydrocarbons."
                ),
                Question(
                    id = 20206,
                    questionNumber = 7,
                    totalQuestions = 40,
                    text = "State the general formula for alkanes and write the corresponding formula for an alkane with n = 6.",
                    options = emptyList(),
                    correctOptionId = "General formula: CnH2n+2; for n=6: C6H14",
                    explanation = "Alkanes follow CnH2n+2; substituting n=6 gives C6H14.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20207,
                    questionNumber = 8,
                    totalQuestions = 40,
                    text = "Name two cycloalkanes commonly discussed in Unit 6.",
                    options = emptyList(),
                    correctOptionId = "Cyclopentane and cyclohexane",
                    explanation = "Examples of cycloalkanes (Alicyclic hydrocarbons) often cited are cyclopentane and cyclohexane.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20208,
                    questionNumber = 9,
                    totalQuestions = 40,
                    text = "Using the alkane general formula CnH2n+2, determine the number of hydrogen atoms in the alkane with n = 7.",
                    options = emptyList(),
                    correctOptionId = "C7H16",
                    explanation = "Hydrogen count is H = 2n + 2; for n = 7, H = 16; thus C7H16.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20209,
                    questionNumber = 10,
                    totalQuestions = 40,
                    text = "From the general formula for alkanes, determine the number of hydrogen atoms in decane (C10H22).",
                    options = emptyList(),
                    correctOptionId = "22",
                    explanation = "For n = 10, H = 2n + 2 = 22. Final molecular formula is C10H22 (hydrogen atoms = 22).",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20210,
                    questionNumber = 11,
                    totalQuestions = 40,
                    text = "What is the IUPAC name of the alkane with five carbon atoms in a straight chain?",
                    options = listOf(
                        QuestionOption("a", "Pentane"),
                        QuestionOption("b", "Hexane"),
                        QuestionOption("c", "Butane"),
                        QuestionOption("d", "Propane")
                    ),
                    correctOptionId = "a",
                    explanation = "Five carbon atoms in a straight chain correspond to pentane (C5H12)."
                ),
                Question(
                    id = 20211,
                    questionNumber = 12,
                    totalQuestions = 40,
                    text = "Which statement about alkanes is true?",
                    options = listOf(
                        QuestionOption("a", "They are unsaturated hydrocarbons"),
                        QuestionOption("b", "They are saturated hydrocarbons"),
                        QuestionOption("c", "They contain double bonds"),
                        QuestionOption("d", "They are aromatic hydrocarbons")
                    ),
                    correctOptionId = "b",
                    explanation = "Alkanes are saturated hydrocarbons because they contain only single bonds between carbon atoms."
                ),
                Question(
                    id = 20212,
                    questionNumber = 13,
                    totalQuestions = 40,
                    text = "Which natural source primarily contains methane, ethane, propane, and butane?",
                    options = listOf(
                        QuestionOption("a", "Natural gas"),
                        QuestionOption("b", "Coal"),
                        QuestionOption("c", "Petroleum"),
                        QuestionOption("d", "Biomass")
                    ),
                    correctOptionId = "a",
                    explanation = "Natural gas is a major source of light hydrocarbons including methane, ethane, propane and butane."
                ),
                Question(
                    id = 20213,
                    questionNumber = 14,
                    totalQuestions = 40,
                    text = "Which molecule contains a carbon-carbon double bond?",
                    options = listOf(
                        QuestionOption("a", "Ethane"),
                        QuestionOption("b", "Ethene"),
                        QuestionOption("c", "Butane"),
                        QuestionOption("d", "Cyclohexane")
                    ),
                    correctOptionId = "b",
                    explanation = "Ethene (C2H4) contains a C=C double bond; others listed have only single bonds."
                ),
                Question(
                    id = 20214,
                    questionNumber = 15,
                    totalQuestions = 40,
                    text = "In benzene, which statement about C-C bonds is correct?",
                    options = listOf(
                        QuestionOption("a", "All C-C bonds are single"),
                        QuestionOption("b", "All C-C bonds are double"),
                        QuestionOption("c", "All C-C bonds are identical and intermediate between single and double"),
                        QuestionOption("d", "There are alternating single and double bonds")
                    ),
                    correctOptionId = "c",
                    explanation = "Benzene has delocalized electrons; the C-C bonds are equivalent and of intermediate character due to resonance."
                ),
                Question(
                    id = 20215,
                    questionNumber = 16,
                    totalQuestions = 40,
                    text = "Alkanes burn in air to form carbon dioxide and water.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Complete combustion of alkanes yields CO2 and H2O."
                ),
                Question(
                    id = 20216,
                    questionNumber = 17,
                    totalQuestions = 40,
                    text = "Name one common use of alkanes.",
                    options = emptyList(),
                    correctOptionId = "Fuel for heating and transportation",
                    explanation = "Alkanes are widely used as fuels for heating and transportation.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20217,
                    questionNumber = 18,
                    totalQuestions = 40,
                    text = "Give one reason why alkanes are relatively unreactive.",
                    options = emptyList(),
                    correctOptionId = "They contain only C–C and C–H single bonds and lack pi (double) bonds.",
                    explanation = "Alkanes have only sigma bonds (C–C, C–H) and no C=C or pi bonds, making many reactions less favorable.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20218,
                    questionNumber = 19,
                    totalQuestions = 40,
                    text = "Calculate the mass of CO2 produced when 16.0 g of methane (CH4) is burned completely in oxygen. Use the reaction CH4 + 2 O2 → CO2 + 2 H2O; molar masses: CH4 = 16.04 g/mol, CO2 = 44.01 g/mol.",
                    options = emptyList(),
                    correctOptionId = "43.9 g",
                    explanation = "1) Moles CH4 = 16.0 g / 16.04 g/mol ≈ 0.9975 mol. 2) Stoichiometry: 1 mol CH4 → 1 mol CO2, so moles CO2 ≈ 0.9975 mol. 3) Mass CO2 = 0.9975 mol × 44.01 g/mol ≈ 43.9 g. Final unit: grams of CO2.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20219,
                    questionNumber = 20,
                    totalQuestions = 40,
                    text = "At STP, 2.00 L of ethene gas (C2H4) reacts with hydrogen to form ethane (C2H6) in a 1:1 mole ratio. If this gas mixture is pure ethene and hydrogen is in excess, how many grams of ethane are formed? Provide the final answer with appropriate units and show the method.",
                    options = emptyList(),
                    correctOptionId = "2.69 g",
                    explanation = "1) At STP, n(C2H4) = PV/RT = (1 atm × 2.00 L) / (0.082057 L·atm/mol·K × 273.15 K) ≈ 0.0893 mol. 2) Stoichiometry: 1 mol C2H4 → 1 mol C2H6, so n(C2H6) ≈ 0.0893 mol. 3) Mass of C2H6 = 0.0893 mol × 30.07 g/mol ≈ 2.69 g.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20220,
                    questionNumber = 21,
                    totalQuestions = 40,
                    text = "What is the IUPAC name for the alkane with the formula C4H10 in its straight-chain form?",
                    options = listOf(
                        QuestionOption("a", "Methane"),
                        QuestionOption("b", "Ethane"),
                        QuestionOption("c", "Butane"),
                        QuestionOption("d", "Pentane")
                    ),
                    correctOptionId = "c",
                    explanation = "C4H10 corresponds to alkanes with n=4; the straight-chain alkane with four carbons is butane. The general formula for alkanes is CnH2n+2."
                ),
                Question(
                    id = 20221,
                    questionNumber = 22,
                    totalQuestions = 40,
                    text = "Which statement best describes the physical properties of alkanes (saturated hydrocarbons)?",
                    options = listOf(
                        QuestionOption("a", "They form strong hydrogen bonds and are highly polar."),
                        QuestionOption("b", "They are nonpolar and have relatively low boiling points compared with many other organic compounds of similar size."),
                        QuestionOption("c", "They are strong electrolytes when dissolved in water."),
                        QuestionOption("d", "They readily sublime at room temperature regardless of chain length.")
                    ),
                    correctOptionId = "b",
                    explanation = "Alkanes are nonpolar with London dispersion forces; boiling points rise with chain length but are generally low compared with compounds with hydrogen bonding or polarity."
                ),
                Question(
                    id = 20222,
                    questionNumber = 23,
                    totalQuestions = 40,
                    text = "Natural gas is primarily composed of methane (Distinct application example 23.)",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The major component of natural gas is methane (CH4)."
                ),
                Question(
                    id = 20223,
                    questionNumber = 24,
                    totalQuestions = 40,
                    text = "What is the general formula for acyclic alkenes (the simplest class of unsaturated hydrocarbons)?",
                    options = listOf(
                        QuestionOption("a", "CnH2n+2"),
                        QuestionOption("b", "CnH2n"),
                        QuestionOption("c", "CnH2n-2"),
                        QuestionOption("d", "CnH2n-4")
                    ),
                    correctOptionId = "b",
                    explanation = "Alkenes have two fewer hydrogens than the corresponding alkane (CnH2n)."
                ),
                Question(
                    id = 20224,
                    questionNumber = 25,
                    totalQuestions = 40,
                    text = "Which statement about benzene is true?",
                    options = listOf(
                        QuestionOption("a", "It has alternating single and double bonds with no resonance."),
                        QuestionOption("b", "It has equal bond lengths due to delocalized electrons around the ring."),
                        QuestionOption("c", "It reacts by rapid, straightforward addition under standard conditions."),
                        QuestionOption("d", "It is not considered an aromatic compound.")
                    ),
                    correctOptionId = "b",
                    explanation = "Benzene’s π-electrons are delocalized, giving equal bond lengths and aromatic stability."
                ),
                Question(
                    id = 20225,
                    questionNumber = 26,
                    totalQuestions = 40,
                    text = "Natural gas is primarily methane.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The major component of natural gas is methane (CH4)."
                ),
                Question(
                    id = 20226,
                    questionNumber = 27,
                    totalQuestions = 40,
                    text = "Name one natural source of hydrocarbons mentioned in Unit 6.",
                    options = emptyList(),
                    correctOptionId = "Natural gas",
                    explanation = "Unit 6 discusses natural sources including natural gas, petroleum, and coal.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20227,
                    questionNumber = 28,
                    totalQuestions = 40,
                    text = "Explain briefly why alkanes are relatively unreactive.",
                    options = emptyList(),
                    correctOptionId = "Alkanes are relatively unreactive because they have nonpolar C–H and C–C bonds with no functional groups; they lack polarity and thus do not participate in many typical chemical reactions except under harsh conditions (e.g., combustion or radical substitution with halogens under UV light).",
                    explanation = "Without polar functional groups and with weak London forces, C–H and C–C bonds require significant energy to break; typical reactions are limited to combustion or, under UV light, substitution with halogens.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20228,
                    questionNumber = 29,
                    totalQuestions = 40,
                    text = "Calculate the molar mass of octane, C8H18.",
                    options = emptyList(),
                    correctOptionId = "114.22 g/mol",
                    explanation = "M = (8 × 12.01 g/mol) + (18 × 1.008 g/mol) = 96.08 g/mol + 18.144 g/mol = 114.224 g/mol ≈ 114.22 g/mol.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20229,
                    questionNumber = 30,
                    totalQuestions = 40,
                    text = "How many grams of ethane (C2H6, molar mass 30.07 g/mol) are required to obtain 2.00 moles?",
                    options = emptyList(),
                    correctOptionId = "60.14 g",
                    explanation = "Mass = moles × molar mass; m = 2.00 mol × 30.07 g/mol = 60.14 g. Final unit: grams (g).",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20230,
                    questionNumber = 31,
                    totalQuestions = 40,
                    text = "Which statement best describes the trend in boiling points of straight-chain alkanes as the carbon chain length increases?",
                    options = listOf(
                        QuestionOption("a", "A. Boiling points decrease as chain length increases."),
                        QuestionOption("b", "B. Boiling points stay roughly constant."),
                        QuestionOption("c", "C. Boiling points increase as chain length increases."),
                        QuestionOption("d", "D. No general trend.")
                    ),
                    correctOptionId = "c",
                    explanation = "Longer carbon chains have stronger van der Waals forces, leading to higher boiling points as chain length increases."
                ),
                Question(
                    id = 20231,
                    questionNumber = 32,
                    totalQuestions = 40,
                    text = "What is the IUPAC name for the straight-chain alkane with 5 carbons?",
                    options = listOf(
                        QuestionOption("a", "A. Pentane"),
                        QuestionOption("b", "B. Isopentane"),
                        QuestionOption("c", "C. Cyclopentane"),
                        QuestionOption("d", "D. Hexane")
                    ),
                    correctOptionId = "a",
                    explanation = "Five-carbon straight chain corresponds to pentane in IUPAC nomenclature."
                ),
                Question(
                    id = 20232,
                    questionNumber = 33,
                    totalQuestions = 40,
                    text = "An alkane with 6 carbon atoms has the formula C6H14. Determine its approximate molar mass in g/mol.",
                    options = emptyList(),
                    correctOptionId = "86.17",
                    explanation = "Molar mass = (6 × 12.01) + (14 × 1.008) = 72.06 + 14.112 ≈ 86.17 g/mol.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20233,
                    questionNumber = 34,
                    totalQuestions = 40,
                    text = "Which statement about cycloalkanes is true?",
                    options = listOf(
                        QuestionOption("a", "A. They are unsaturated."),
                        QuestionOption("b", "B. They have the general formula CnH2n."),
                        QuestionOption("c", "C. They always have higher boiling points than open-chain alkanes with the same carbon count."),
                        QuestionOption("d", "D. They have more hydrogens than open-chain alkanes.")
                    ),
                    correctOptionId = "b",
                    explanation = "Cycloalkanes are saturated ring compounds with the formula CnH2n, unlike open-chain alkanes (CnH2n+2)."
                ),
                Question(
                    id = 20234,
                    questionNumber = 35,
                    totalQuestions = 40,
                    text = "What is the general formula for saturated acyclic alkanes?",
                    options = listOf(
                        QuestionOption("a", "A. CnH2n"),
                        QuestionOption("b", "B. CnH2n+2"),
                        QuestionOption("c", "C. CnH2n+4"),
                        QuestionOption("d", "D. CnHn")
                    ),
                    correctOptionId = "b",
                    explanation = "Acyclic saturated alkanes follow the formula CnH2n+2."
                ),
                Question(
                    id = 20235,
                    questionNumber = 36,
                    totalQuestions = 40,
                    text = "In the free-radical chlorination of alkanes under UV light, which step is the chain-propagating step that forms the alkyl radical?",
                    options = listOf(
                        QuestionOption("a", "A. Initiation"),
                        QuestionOption("b", "B. Propagation"),
                        QuestionOption("c", "C. Termination"),
                        QuestionOption("d", "D. All of the above")
                    ),
                    correctOptionId = "b",
                    explanation = "Propagation steps involve the formation and consumption of radicals that propagate the chain reaction."
                ),
                Question(
                    id = 20236,
                    questionNumber = 37,
                    totalQuestions = 40,
                    text = "Cycloalkanes have the general formula CnH2n+2.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "Cycloalkanes have the formula CnH2n, not CnH2n+2; alkenes have CnH2n."
                ),
                Question(
                    id = 20237,
                    questionNumber = 38,
                    totalQuestions = 40,
                    text = "Name two natural sources of hydrocarbons.",
                    options = emptyList(),
                    correctOptionId = "Natural gas and crude oil (petroleum)",
                    explanation = "Two major natural hydrocarbon sources listed in Unit 6: natural gas and crude oil.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20238,
                    questionNumber = 39,
                    totalQuestions = 40,
                    text = "State the general formulas for open-chain alkanes and cycloalkanes.",
                    options = emptyList(),
                    correctOptionId = "Open-chain alkanes: CnH2n+2; Cycloalkanes: CnH2n",
                    explanation = "Open-chain alkanes follow CnH2n+2 while cycloalkanes follow CnH2n.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20239,
                    questionNumber = 40,
                    totalQuestions = 40,
                    text = "A natural gas sample contains 60% methane (CH4), 25% ethane (C2H6), and 15% propane (C3H8) by mole. Calculate the mean molar mass of the gas in g/mol.",
                    options = emptyList(),
                    correctOptionId = "23.76",
                    explanation = "Mean molar mass M = 0.60(16.04) + 0.25(30.07) + 0.15(44.10) = 9.624 + 7.5175 + 6.615 ≈ 23.76 g/mol.",
                    type = QuestionType.FILL_IN_THE_BLANK
                )
            )
        ),
        "physics_u1" to Quiz(
            id = "quiz_physics_u1_drive",
            title = "Physics — Vector Quantities Quiz",
            subject = "Physics",
            durationMinutes = 25,
            gradeLevel = "Grade 10",
            iconName = "atom",
            unitId = "physics_u1",
            subjectId = "physics",
            questions = listOf(
                Question(
                    id = 20240,
                    questionNumber = 1,
                    totalQuestions = 40,
                    text = "Which of the following physical quantities is a vector?",
                    options = listOf(
                        QuestionOption("a", "Time"),
                        QuestionOption("b", "Mass"),
                        QuestionOption("c", "Velocity"),
                        QuestionOption("d", "Temperature")
                    ),
                    correctOptionId = "c",
                    explanation = "Vectors require both magnitude and direction; velocity specifies both."
                ),
                Question(
                    id = 20241,
                    questionNumber = 2,
                    totalQuestions = 40,
                    text = "In a vector diagram, what does the length of the drawn arrow represent?",
                    options = listOf(
                        QuestionOption("a", "Direction"),
                        QuestionOption("b", "Magnitude"),
                        QuestionOption("c", "Both"),
                        QuestionOption("d", "None")
                    ),
                    correctOptionId = "b",
                    explanation = "The arrow length is proportional to the vector's magnitude."
                ),
                Question(
                    id = 20242,
                    questionNumber = 3,
                    totalQuestions = 40,
                    text = "When adding two vectors graphically, what is the standard head-to-tail method?",
                    options = listOf(
                        QuestionOption("a", "Place their tails together"),
                        QuestionOption("b", "Align their heads"),
                        QuestionOption("c", "Place the tail of the second at the head of the first"),
                        QuestionOption("d", "Place heads together")
                    ),
                    correctOptionId = "c",
                    explanation = "The resultant is drawn from the tail of the first to the head of the second."
                ),
                Question(
                    id = 20243,
                    questionNumber = 4,
                    totalQuestions = 40,
                    text = "Two perpendicular vectors have magnitudes 3 N east and 4 N north. The resultant magnitude is?",
                    options = listOf(
                        QuestionOption("a", "5 N"),
                        QuestionOption("b", "7 N"),
                        QuestionOption("c", "1 N"),
                        QuestionOption("d", "4 N")
                    ),
                    correctOptionId = "a",
                    explanation = "Resultant magnitude is sqrt(3^2+4^2)=5 N."
                ),
                Question(
                    id = 20244,
                    questionNumber = 5,
                    totalQuestions = 40,
                    text = "A vector of magnitude 6 N is directed at 60 degrees above the +x axis. Which of the following are its components?",
                    options = listOf(
                        QuestionOption("a", "Fx = 3 N, Fy ≈ 5.2 N"),
                        QuestionOption("b", "Fx ≈ 5 N, Fy ≈ 3 N"),
                        QuestionOption("c", "Fx = -3 N, Fy ≈ -5.2 N"),
                        QuestionOption("d", "Fx = 6 N, Fy = 0 N")
                    ),
                    correctOptionId = "a",
                    explanation = "Fx = r cos theta, Fy = r sin theta; with r=6, theta=60°"
                ),
                Question(
                    id = 20245,
                    questionNumber = 6,
                    totalQuestions = 40,
                    text = "A vector is completely specified by its magnitude only.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "A vector requires both magnitude and direction for complete description."
                ),
                Question(
                    id = 20246,
                    questionNumber = 7,
                    totalQuestions = 40,
                    text = "What is a unit vector and how is it used when resolving a vector into components?",
                    options = emptyList(),
                    correctOptionId = "A unit vector is a vector with magnitude 1 that points in a given direction. It is used to express a vector as a sum of its components along the coordinate axes, e.g., F = Fx î + Fy ĵ, where Fx = |F| cos(theta) and Fy = |F| sin(theta).",
                    explanation = "Unit vectors provide direction along axes to separate a vector into components.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20247,
                    questionNumber = 8,
                    totalQuestions = 40,
                    text = "List the basic steps of the graphical method of vector addition.",
                    options = emptyList(),
                    correctOptionId = "1) Choose a scale and mark it. 2) Draw each vector tail-to-head in sequence. 3) Draw the resultant from the starting tail to the final head. 4) Measure the resultant’s magnitude and direction.",
                    explanation = "Steps follow the tail-to-head construction; scale ensures accurate representation.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20248,
                    questionNumber = 9,
                    totalQuestions = 40,
                    text = "A displacement vector has magnitude 12 m at 30 degrees north of east. Find its x and y components. Use +x east, +y north.",
                    options = emptyList(),
                    correctOptionId = "Fx = 10.39 m, Fy = 6.00 m",
                    explanation = "Fx = r cos(theta) = 12 cos(30°) ≈ 10.39 m; Fy = r sin(theta) = 12 sin(30°) = 6.00 m.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20249,
                    questionNumber = 10,
                    totalQuestions = 40,
                    text = "Two vectors A = 8 N at 45° and B = 5 N at 135°. Find the magnitude and direction of the resultant R.",
                    options = emptyList(),
                    correctOptionId = "|R| ≈ 9.43 N; direction ≈ 77.0° above the +x axis",
                    explanation = "Resolve into components: Ax=8cos45≈5.66, Ay=8sin45≈5.66; Bx=5cos135≈-3.54, By=5sin135≈3.54; Rx≈2.12, Ry≈9.19; |R|≈√(Rx^2+Ry^2)≈9.43; θ=atan(Ry/Rx)≈77°.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20250,
                    questionNumber = 11,
                    totalQuestions = 40,
                    text = "Which of the following is a vector quantity?",
                    options = listOf(
                        QuestionOption("a", "Mass"),
                        QuestionOption("b", "Temperature"),
                        QuestionOption("c", "Distance"),
                        QuestionOption("d", "Displacement")
                    ),
                    correctOptionId = "d",
                    explanation = "Vectors have both magnitude and direction; displacement specifies a change in position with a direction."
                ),
                Question(
                    id = 20251,
                    questionNumber = 12,
                    totalQuestions = 40,
                    text = "Which notation represents a vector quantity algebraically?",
                    options = listOf(
                        QuestionOption("a", "A bold letter such as A or an arrow over A"),
                        QuestionOption("b", "A plain italic letter"),
                        QuestionOption("c", "A letter with an underline"),
                        QuestionOption("d", "A number with a unit")
                    ),
                    correctOptionId = "a",
                    explanation = "Vectors are represented by a bold letter or an arrow over the letter to indicate direction."
                ),
                Question(
                    id = 20252,
                    questionNumber = 13,
                    totalQuestions = 40,
                    text = "If vector A is 3 m east and vector B is 4 m north, their resultant has magnitude and direction approximately:",
                    options = listOf(
                        QuestionOption("a", "7 m at 45° northeast"),
                        QuestionOption("b", "5 m at 53.1° north of east"),
                        QuestionOption("c", "1 m east"),
                        QuestionOption("d", "12 m northeast")
                    ),
                    correctOptionId = "b",
                    explanation = "Resultant magnitude is sqrt(3^2+4^2)=5 m; angle tanθ = 4/3 ⇒ θ ≈ 53.1° north of east."
                ),
                Question(
                    id = 20253,
                    questionNumber = 14,
                    totalQuestions = 40,
                    text = "Which method is used to add two vectors graphically?",
                    options = listOf(
                        QuestionOption("a", "Parallelogram law"),
                        QuestionOption("b", "Pythagoras theorem"),
                        QuestionOption("c", "Dot product"),
                        QuestionOption("d", "Scalar addition")
                    ),
                    correctOptionId = "a",
                    explanation = "Graphical addition is often performed using the parallelogram law (head-to-tail approach)."
                ),
                Question(
                    id = 20254,
                    questionNumber = 15,
                    totalQuestions = 40,
                    text = "A vector A has magnitude 10 N at 60° above the +x axis. Its x- and y-components are:",
                    options = listOf(
                        QuestionOption("a", "Ax = 5 N, Ay = 8.66 N"),
                        QuestionOption("b", "Ax = 10 N, Ay = 0 N"),
                        QuestionOption("c", "Ax = 8 N, Ay = 6 N"),
                        QuestionOption("d", "Ax = 6 N, Ay = 8 N")
                    ),
                    correctOptionId = "a",
                    explanation = "Ax = 10 cos60° = 5 N; Ay = 10 sin60° ≈ 8.66 N."
                ),
                Question(
                    id = 20255,
                    questionNumber = 16,
                    totalQuestions = 40,
                    text = "A scalar quantity has both magnitude and direction.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "Scalar quantities have magnitude only; vectors have both magnitude and direction."
                ),
                Question(
                    id = 20256,
                    questionNumber = 17,
                    totalQuestions = 40,
                    text = "Give two examples of vector quantities and two examples of scalar quantities.",
                    options = emptyList(),
                    correctOptionId = "Vector: displacement, velocity; Scalar: mass, temperature",
                    explanation = "Vectors require magnitude and direction; scalars require only magnitude and unit.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20257,
                    questionNumber = 18,
                    totalQuestions = 40,
                    text = "Briefly outline the steps to add two vectors using the head-to-tail (parallelogram) method.",
                    options = emptyList(),
                    correctOptionId = "Draw both vectors from a common starting point; place the tail of one at the head of the other (head-to-tail); draw the resultant as the diagonal of the parallelogram; measure magnitude and direction using the chosen scale.",
                    explanation = "Head-to-tail method is the graphical approach for vector addition.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20258,
                    questionNumber = 19,
                    totalQuestions = 40,
                    text = "A force of 9 N is applied at 40° above the +x axis. Find the x- and y-components (to 2 decimals) and provide the final units.",
                    options = emptyList(),
                    correctOptionId = "Ax = 6.88 N, Ay = 5.77 N",
                    explanation = "Ax = 9 cos40° ≈ 6.88 N; Ay = 9 sin40° ≈ 5.77 N.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20259,
                    questionNumber = 20,
                    totalQuestions = 40,
                    text = "Resolve a force of 12 N acting at 60° above the +x axis into x- and y-components.",
                    options = emptyList(),
                    correctOptionId = "Ax = 6.00 N, Ay = 10.39 N",
                    explanation = "Ax = 12 cos60° = 6.0 N; Ay = 12 sin60° ≈ 10.39 N.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20260,
                    questionNumber = 21,
                    totalQuestions = 40,
                    text = "Which of the following quantities is a vector?",
                    options = listOf(
                        QuestionOption("a", "Mass"),
                        QuestionOption("b", "Distance"),
                        QuestionOption("c", "Velocity"),
                        QuestionOption("d", "Temperature")
                    ),
                    correctOptionId = "c",
                    explanation = "A vector quantity has both magnitude and direction. Mass, distance, and temperature are scalars with magnitude only."
                ),
                Question(
                    id = 20261,
                    questionNumber = 22,
                    totalQuestions = 40,
                    text = "In a vector diagram drawn to scale, what does the length of the arrow represent?",
                    options = listOf(
                        QuestionOption("a", "The direction"),
                        QuestionOption("b", "The magnitude"),
                        QuestionOption("c", "The time taken"),
                        QuestionOption("d", "The starting point")
                    ),
                    correctOptionId = "b",
                    explanation = "In vector diagrams, the length is proportional to the vector's magnitude; direction is shown by the arrowhead."
                ),
                Question(
                    id = 20262,
                    questionNumber = 23,
                    totalQuestions = 40,
                    text = "Which operation corresponds to placing vectors head-to-tail to obtain the resultant?",
                    options = listOf(
                        QuestionOption("a", "Subtraction"),
                        QuestionOption("b", "Addition"),
                        QuestionOption("c", "Multiplication"),
                        QuestionOption("d", "Division")
                    ),
                    correctOptionId = "b",
                    explanation = "Adding vectors by the head-to-tail method yields the resultant vector."
                ),
                Question(
                    id = 20263,
                    questionNumber = 24,
                    totalQuestions = 40,
                    text = "Resolving a vector into horizontal and vertical components uses which axes?",
                    options = listOf(
                        QuestionOption("a", "The x- and y-axes"),
                        QuestionOption("b", "Time and velocity"),
                        QuestionOption("c", "Magnitude and direction"),
                        QuestionOption("d", "Energy and momentum")
                    ),
                    correctOptionId = "a",
                    explanation = "Resolving a vector uses horizontal and vertical (x and y) components along the chosen axes."
                ),
                Question(
                    id = 20264,
                    questionNumber = 25,
                    totalQuestions = 40,
                    text = "Two equal vectors of 6 N each act with an angle of 60 degrees between them. What is the magnitude of the resultant?",
                    options = listOf(
                        QuestionOption("a", "6"),
                        QuestionOption("b", "6√3"),
                        QuestionOption("c", "12"),
                        QuestionOption("d", "8")
                    ),
                    correctOptionId = "b",
                    explanation = "R = sqrt(A^2 + A^2 + 2A^2 cosθ) with A=6, θ=60 gives R = 6√3 ≈ 10.39 N."
                ),
                Question(
                    id = 20265,
                    questionNumber = 26,
                    totalQuestions = 40,
                    text = "Displacement and distance are the same when motion is in a straight line with constant direction.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "When motion is along a straight line with no direction change, net displacement equals distance travelled."
                ),
                Question(
                    id = 20266,
                    questionNumber = 27,
                    totalQuestions = 40,
                    text = "Name two scalar quantities and two vector quantities.",
                    options = emptyList(),
                    correctOptionId = "Scalar: mass, temperature; Vector: velocity, force",
                    explanation = "Scalar quantities have only magnitude; vector quantities have magnitude and direction.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20267,
                    questionNumber = 28,
                    totalQuestions = 40,
                    text = "Resolve the 70 N force directed 150° from the +x axis into its x and y components.",
                    options = emptyList(),
                    correctOptionId = "Fx ≈ -60.6 N, Fy ≈ 35.0 N",
                    explanation = "Fx = 70 cos(150°) = -60.6 N; Fy = 70 sin(150°) = 35.0 N.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20268,
                    questionNumber = 29,
                    totalQuestions = 40,
                    text = "Two vectors: A = 30 N directed east; B = 40 N at 60° north of east. Find the resultant magnitude and direction (from +x).",
                    options = emptyList(),
                    correctOptionId = "R ≈ 60.8 N at ≈ 34.7° north of east",
                    explanation = "Decompose B into components: Bx=40 cos60=20; By=40 sin60≈34.64; R components: Rx=50, Ry=34.64; magnitude ≈ sqrt(50^2+34.64^2) ≈ 60.8 N; direction arctan(34.64/50) ≈ 34.7° north of east.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20269,
                    questionNumber = 30,
                    totalQuestions = 40,
                    text = "Resolve a 40 N force acting at 30° above the +x axis into its horizontal (x) and vertical (y) components.",
                    options = emptyList(),
                    correctOptionId = "Fx ≈ 34.6 N, Fy ≈ 20.0 N",
                    explanation = "Fx = 40 cos30° ≈ 34.64 N; Fy = 40 sin30° = 20.0 N.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20270,
                    questionNumber = 31,
                    totalQuestions = 40,
                    text = "Which of the following quantities is a vector? (Distinct application example 31.)",
                    options = listOf(
                        QuestionOption("a", "Temperature"),
                        QuestionOption("b", "Mass"),
                        QuestionOption("c", "Velocity"),
                        QuestionOption("d", "Time")
                    ),
                    correctOptionId = "c",
                    explanation = "A vector has both magnitude and direction; temperature, mass, and time are scalars."
                ),
                Question(
                    id = 20271,
                    questionNumber = 32,
                    totalQuestions = 40,
                    text = "Which statement correctly describes vector notation?",
                    options = listOf(
                        QuestionOption("a", "A bold letter denotes a vector quantity or an arrow over the letter indicates a vector; |S| denotes a scalar magnitude."),
                        QuestionOption("b", "An arrow over a letter denotes a scalar value."),
                        QuestionOption("c", "A bold letter always denotes a scalar quantity."),
                        QuestionOption("d", "A vector has no magnitude, only direction.")
                    ),
                    correctOptionId = "a",
                    explanation = "Vectors can be represented by bold letters or with an arrow; |S| gives only magnitude."
                ),
                Question(
                    id = 20272,
                    questionNumber = 33,
                    totalQuestions = 40,
                    text = "A vector diagram is primarily used to show:",
                    options = listOf(
                        QuestionOption("a", "Only the magnitude of a vector"),
                        QuestionOption("b", "Only the direction of a vector"),
                        QuestionOption("c", "Both magnitude and direction with an arrow representing the vector"),
                        QuestionOption("d", "The position of the vector's tail at the origin")
                    ),
                    correctOptionId = "c",
                    explanation = "Vectors are shown with arrows where length indicates magnitude and direction indicates orientation."
                ),
                Question(
                    id = 20273,
                    questionNumber = 34,
                    totalQuestions = 40,
                    text = "Which method is used to add two vectors graphically? (Distinct application example 34.)",
                    options = listOf(
                        QuestionOption("a", "Substitution"),
                        QuestionOption("b", "Head-to-tail (tip-to-tail) method"),
                        QuestionOption("c", "Algebraic multiplication"),
                        QuestionOption("d", "Flipping the vectors")
                    ),
                    correctOptionId = "b",
                    explanation = "Graphical addition places the tail of the second vector at the head of the first; the resulting vector is from tail to head of the two vectors."
                ),
                Question(
                    id = 20274,
                    questionNumber = 35,
                    totalQuestions = 40,
                    text = "Which statement is true about resolving a vector into components?",
                    options = listOf(
                        QuestionOption("a", "A vector has only horizontal components"),
                        QuestionOption("b", "A vector can be resolved into horizontal and vertical components using trigonometric projections"),
                        QuestionOption("c", "Components are always equal in magnitude"),
                        QuestionOption("d", "Components do not depend on the angle of the vector")
                    ),
                    correctOptionId = "b",
                    explanation = "Components depend on the angle; use cos for horizontal, sin for vertical (assuming angle from x-axis)."
                ),
                Question(
                    id = 20275,
                    questionNumber = 36,
                    totalQuestions = 40,
                    text = "Scalars require both magnitude and direction for a complete description.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "Scalar quantities have magnitude only; direction is not required for a complete description."
                ),
                Question(
                    id = 20276,
                    questionNumber = 37,
                    totalQuestions = 40,
                    text = "Explain how to resolve a force of 5 N at 30° north of east into horizontal and vertical components.",
                    options = emptyList(),
                    correctOptionId = "Fx = 5 cos 30° ≈ 4.33 N (east); Fy = 5 sin 30° ≈ 2.50 N (north). The components are found using F cosθ for horizontal and F sinθ for vertical, with angles measured from the +x axis (east).",
                    explanation = "Use standard component resolution: Fx = F cosθ, Fy = F sinθ.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20277,
                    questionNumber = 38,
                    totalQuestions = 40,
                    text = "A boat travels 6.0 km at 20° north of east, then 8.0 km at 60° north of east. Find the magnitude and direction of the resultant displacement.",
                    options = emptyList(),
                    correctOptionId = "Resultant displacement: components: x = 6 cos20 + 8 cos60 = 5.638 + 4.000 = 9.638 km; y = 6 sin20 + 8 sin60 = 2.052 + 6.928 = 8.980 km. Magnitude ≈ 13.2 km; direction ≈ arctan(8.980/9.638) ≈ 43.6° north of east.",
                    explanation = "Use vector components and Pythagoras to obtain resultant magnitude and arctan for direction.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20278,
                    questionNumber = 39,
                    totalQuestions = 40,
                    text = "Two displacement vectors A and B have magnitudes 5.0 m and 7.0 m and are at an angle of 40° to each other. What is the magnitude of their resultant displacement? Provide all values, units, and context.",
                    options = emptyList(),
                    correctOptionId = "11.3 m",
                    explanation = "R^2 = A^2 + B^2 + 2AB cos θ; R = sqrt(5^2 + 7^2 + 2*5*7 cos 40°) ≈ sqrt(127.62) ≈ 11.3 m.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20279,
                    questionNumber = 40,
                    totalQuestions = 40,
                    text = "Resolve a displacement vector of magnitude 12.0 m directed 25° north of west into its x (horizontal) and y (vertical) components. Provide the components with correct signs and units.",
                    options = emptyList(),
                    correctOptionId = "Vx ≈ -10.9 m (west); Vy ≈ +5.1 m (north).",
                    explanation = "Vx = 12 cos25° toward west (negative x); Vy = 12 sin25° toward north (positive y).",
                    type = QuestionType.FILL_IN_THE_BLANK
                )
            )
        ),
        "physics_u2" to Quiz(
            id = "quiz_physics_u2_drive",
            title = "Physics — Uniformly Accelerated Motion Quiz",
            subject = "Physics",
            durationMinutes = 25,
            gradeLevel = "Grade 10",
            iconName = "atom",
            unitId = "physics_u2",
            subjectId = "physics",
            questions = listOf(
                Question(
                    id = 20280,
                    questionNumber = 1,
                    totalQuestions = 40,
                    text = "A car starts from rest and accelerates uniformly at 2 m/s^2 for 5 s. What is the displacement during this interval?",
                    options = listOf(
                        QuestionOption("a", "a) 25 m"),
                        QuestionOption("b", "b) 15 m"),
                        QuestionOption("c", "c) 50 m"),
                        QuestionOption("d", "d) 30 m")
                    ),
                    correctOptionId = "a",
                    explanation = "Using s = ut + (1/2) a t^2 with u = 0, a = 2 m/s^2, t = 5 s: s = 0 + 0.5 × 2 × 25 = 25 m."
                ),
                Question(
                    id = 20281,
                    questionNumber = 2,
                    totalQuestions = 40,
                    text = "Displacement is best described as:",
                    options = listOf(
                        QuestionOption("a", "a) the total distance travelled along the path"),
                        QuestionOption("b", "b) final position minus initial position"),
                        QuestionOption("c", "c) the average speed over the interval"),
                        QuestionOption("d", "d) the magnitude of the velocity vector")
                    ),
                    correctOptionId = "b",
                    explanation = "Displacement is a vector describing the straight-line change in position from the initial to the final point, not the path length."
                ),
                Question(
                    id = 20282,
                    questionNumber = 3,
                    totalQuestions = 40,
                    text = "A particle’s position is given by s = 2t^2 + 3 (m). What is the average velocity from t = 0 to t = 5 s?",
                    options = listOf(
                        QuestionOption("a", "a) 5 m/s"),
                        QuestionOption("b", "b) 10 m/s"),
                        QuestionOption("c", "c) 15 m/s"),
                        QuestionOption("d", "d) 20 m/s")
                    ),
                    correctOptionId = "b",
                    explanation = "s(5) = 2(25) + 3 = 53 m; s(0) = 3 m; Δs = 50 m; Δt = 5 s; v_avg = Δs/Δt = 50/5 = 10 m/s."
                ),
                Question(
                    id = 20283,
                    questionNumber = 4,
                    totalQuestions = 40,
                    text = "On a velocity-time graph that rises linearly from 0 to 20 m/s over 4 s, what is the acceleration?",
                    options = listOf(
                        QuestionOption("a", "a) 5 m/s^2"),
                        QuestionOption("b", "b) 10 m/s^2"),
                        QuestionOption("c", "c) 4 m/s^2"),
                        QuestionOption("d", "d) 20 m/s^2")
                    ),
                    correctOptionId = "a",
                    explanation = "Acceleration is the slope of the v–t graph: a = Δv/Δt = (20 − 0)/4 = 5 m/s^2."
                ),
                Question(
                    id = 20284,
                    questionNumber = 5,
                    totalQuestions = 40,
                    text = "A car starts from a speed of 4 m/s and accelerates at 3 m/s^2 for 6 s. It then continues at a constant speed for 4 s. What is the total displacement in 10 s?",
                    options = listOf(
                        QuestionOption("a", "a) 140 m"),
                        QuestionOption("b", "b) 166 m"),
                        QuestionOption("c", "c) 180 m"),
                        QuestionOption("d", "d) 210 m")
                    ),
                    correctOptionId = "b",
                    explanation = "Phase 1: s1 = ut + 0.5at^2 = 4(6) + 0.5(3)(36) = 78 m; v1 = u + at = 4 + 18 = 22 m/s; Phase 2: s2 = v1×4 = 88 m; total = 78 + 88 = 166 m."
                ),
                Question(
                    id = 20285,
                    questionNumber = 6,
                    totalQuestions = 40,
                    text = "The instantaneous velocity is the slope of the position-time graph.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The instantaneous velocity at a specific time is given by the slope of the position-time graph at that time."
                ),
                Question(
                    id = 20286,
                    questionNumber = 7,
                    totalQuestions = 40,
                    text = "Define acceleration.",
                    options = emptyList(),
                    correctOptionId = "Acceleration is the rate of change of velocity with respect to time.",
                    explanation = "Acceleration describes how velocity changes per unit time (a = Δv/Δt).",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20287,
                    questionNumber = 8,
                    totalQuestions = 40,
                    text = "What does the slope of a velocity-time graph represent?",
                    options = emptyList(),
                    correctOptionId = "Acceleration.",
                    explanation = "The slope of the velocity-time graph corresponds to the acceleration (for constant acceleration).",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20288,
                    questionNumber = 9,
                    totalQuestions = 40,
                    text = "A car starts from rest and accelerates at 3 m/s^2 for 5 s, then decelerates at -2 m/s^2 for 4 s. What is the final velocity after the 9 s, and the total displacement during those 9 s? Provide the numerical values with units.",
                    options = emptyList(),
                    correctOptionId = "Final velocity: 7 m/s; Total displacement: 81.5 m",
                    explanation = "Phase 1: v1 = 0 + 3(5) = 15 m/s; s1 = 0.5(3)(25) = 37.5 m. Phase 2: v2 = 15 + (-2)(4) = 7 m/s; s2 = v1(4) + 0.5(-2)(4^2) = 15(4) + 0.5(-2)(16) = 60 - 16 = 44 m. Total displacement = 37.5 + 44 = 81.5 m.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20289,
                    questionNumber = 10,
                    totalQuestions = 40,
                    text = "A particle starts with velocity 12 m/s and accelerates uniformly at 0.5 m/s^2 for 10 s. What is the displacement during the 10 s? Provide the numerical answer with units and brief method.",
                    options = emptyList(),
                    correctOptionId = "145 m",
                    explanation = "Using s = ut + (1/2) a t^2 with u = 12 m/s, a = 0.5 m/s^2, t = 10 s: s = 12(10) + 0.5(0.5)(100) = 120 + 25 = 145 m.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20290,
                    questionNumber = 11,
                    totalQuestions = 40,
                    text = "A car increases its velocity from 0 to 20 m/s in 4 s. What is its average acceleration?",
                    options = listOf(
                        QuestionOption("a", "5 m/s^2"),
                        QuestionOption("b", "20 m/s^2"),
                        QuestionOption("c", "4 m/s^2"),
                        QuestionOption("d", "0 m/s^2")
                    ),
                    correctOptionId = "a",
                    explanation = "Average acceleration a_avg = Δv/Δt = (20 − 0)/4 = 5 m/s^2."
                ),
                Question(
                    id = 20291,
                    questionNumber = 12,
                    totalQuestions = 40,
                    text = "A ball starts from rest and accelerates at 2 m/s^2 for 3 s. How far does it travel in that time?",
                    options = listOf(
                        QuestionOption("a", "9 m"),
                        QuestionOption("b", "18 m"),
                        QuestionOption("c", "27 m"),
                        QuestionOption("d", "36 m")
                    ),
                    correctOptionId = "a",
                    explanation = "s = ut + 0.5 a t^2 = 0 + 0.5*2*(3)^2 = 9 m."
                ),
                Question(
                    id = 20292,
                    questionNumber = 13,
                    totalQuestions = 40,
                    text = "In a velocity-time graph for an object with constant acceleration, what does the slope represent?",
                    options = listOf(
                        QuestionOption("a", "Displacement"),
                        QuestionOption("b", "Velocity"),
                        QuestionOption("c", "Acceleration"),
                        QuestionOption("d", "Momentum")
                    ),
                    correctOptionId = "c",
                    explanation = "For constant acceleration, a is the slope of v vs t."
                ),
                Question(
                    id = 20293,
                    questionNumber = 14,
                    totalQuestions = 40,
                    text = "A car starts at 5 m/s and accelerates at 1 m/s^2 for 6 s. Its final velocity is",
                    options = listOf(
                        QuestionOption("a", "7 m/s"),
                        QuestionOption("b", "11 m/s"),
                        QuestionOption("c", "6 m/s"),
                        QuestionOption("d", "16 m/s")
                    ),
                    correctOptionId = "b",
                    explanation = "v = u + a t = 5 + 1*6 = 11 m/s."
                ),
                Question(
                    id = 20294,
                    questionNumber = 15,
                    totalQuestions = 40,
                    text = "An object with initial speed u = 4 m/s accelerates at a = 2 m/s^2. It covers a displacement of s = 80 m in a straight line. What is the time t required? Use s = ut + 0.5 a t^2.",
                    options = listOf(
                        QuestionOption("a", "7 s"),
                        QuestionOption("b", "7.2 s"),
                        QuestionOption("c", "6.5 s"),
                        QuestionOption("d", "9 s")
                    ),
                    correctOptionId = "b",
                    explanation = "Solve 80 = 4 t + 1 t^2 → t^2 + 4 t − 80 = 0; t = [-4 + sqrt(16+320)]/2 ≈ 7.17 s ≈ 7.2 s."
                ),
                Question(
                    id = 20295,
                    questionNumber = 16,
                    totalQuestions = 40,
                    text = "If velocity changes uniformly with time, acceleration is constant.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Uniform rate of velocity change implies constant acceleration."
                ),
                Question(
                    id = 20296,
                    questionNumber = 17,
                    totalQuestions = 40,
                    text = "Explain the difference between average velocity and instantaneous velocity.",
                    options = emptyList(),
                    correctOptionId = "Average velocity is displacement divided by the time interval; instantaneous velocity is the velocity at a specific instant (the limit as the time interval approaches zero).",
                    explanation = "Average velocity uses a finite time interval; instantaneous velocity is the velocity at a single moment.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20297,
                    questionNumber = 18,
                    totalQuestions = 40,
                    text = "Describe how the displacement relates to the area under a velocity-time graph for motion with changing velocity.",
                    options = emptyList(),
                    correctOptionId = "Displacement equals the area under the velocity-time graph; positive area corresponds to forward motion, negative area to backward motion.",
                    explanation = "Area under v-t graph represents net displacement during the time interval.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20298,
                    questionNumber = 19,
                    totalQuestions = 40,
                    text = "A car starts from rest (u = 0) and accelerates at a = 1.5 m/s^2 for t = 8 s. What distance does it cover? Provide all values, units, method, final unit.",
                    options = emptyList(),
                    correctOptionId = "48 m",
                    explanation = "s = ut + 0.5 a t^2 = 0 + 0.5(1.5)(8)^2 = 0.75*64 = 48 m.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20299,
                    questionNumber = 20,
                    totalQuestions = 40,
                    text = "An object with initial velocity u = 4 m/s accelerates at a = 2 m/s^2. It covers a displacement s = 80 m in a straight line. Find the time t required.",
                    options = emptyList(),
                    correctOptionId = "7.17 s",
                    explanation = "Solve 80 = 4 t + 0.5(2) t^2 → t^2 + 4 t − 80 = 0; t = [-4 + sqrt(16 + 320)]/2 ≈ 7.17 s.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20300,
                    questionNumber = 21,
                    totalQuestions = 40,
                    text = "A car starts from rest and accelerates uniformly at 3 m/s^2 for 4 s. What is its final velocity?",
                    options = listOf(
                        QuestionOption("a", "6 m/s"),
                        QuestionOption("b", "12 m/s"),
                        QuestionOption("c", "24 m/s"),
                        QuestionOption("d", "48 m/s")
                    ),
                    correctOptionId = "b",
                    explanation = "Using v = u + at with u = 0, a = 3 m/s^2, t = 4 s; v = 0 + 3×4 = 12 m/s."
                ),
                Question(
                    id = 20301,
                    questionNumber = 22,
                    totalQuestions = 40,
                    text = "Which of the following statements about constant acceleration is true?",
                    options = listOf(
                        QuestionOption("a", "The velocity changes at a constant rate"),
                        QuestionOption("b", "The displacement is constant"),
                        QuestionOption("c", "The acceleration is zero"),
                        QuestionOption("d", "The velocity is zero at all times")
                    ),
                    correctOptionId = "a",
                    explanation = "Constant acceleration means the rate of change of velocity is constant; velocity changes at a constant rate."
                ),
                Question(
                    id = 20302,
                    questionNumber = 23,
                    totalQuestions = 40,
                    text = "The velocity–time graph of an object with constant acceleration is a straight line.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "With constant acceleration, velocity changes linearly with time, producing a straight-line v-t graph."
                ),
                Question(
                    id = 20303,
                    questionNumber = 24,
                    totalQuestions = 40,
                    text = "Which equation gives the displacement s after time t for an object with initial velocity u and constant acceleration a?",
                    options = listOf(
                        QuestionOption("a", "s = ut + 1/2 a t^2"),
                        QuestionOption("b", "s = ut + 1/2 a t"),
                        QuestionOption("c", "s = u + at"),
                        QuestionOption("d", "s = (v^2 - u^2)/(2a)")
                    ),
                    correctOptionId = "a",
                    explanation = "For constant acceleration, displacement s = ut + (1/2) a t^2 is the standard equation."
                ),
                Question(
                    id = 20304,
                    questionNumber = 25,
                    totalQuestions = 40,
                    text = "An object starts from speed u = -5 m/s and accelerates at a = 3 m/s^2 for t = 4 s. What is the displacement s during this interval?",
                    options = listOf(
                        QuestionOption("a", "-20 m"),
                        QuestionOption("b", "4 m"),
                        QuestionOption("c", "-4 m"),
                        QuestionOption("d", "12 m")
                    ),
                    correctOptionId = "b",
                    explanation = "s = ut + 1/2 at^2 = (-5)(4) + 0.5(3)(16) = -20 + 24 = 4 m."
                ),
                Question(
                    id = 20305,
                    questionNumber = 26,
                    totalQuestions = 40,
                    text = "Define average velocity and instantaneous velocity, and explain how they differ.",
                    options = emptyList(),
                    correctOptionId = "Average velocity is total displacement divided by total time; instantaneous velocity is the velocity at a specific time, equal to the slope of the position-time graph at that time.",
                    explanation = "Average velocity uses overall displacement/time; instantaneous velocity uses the slope at a specific moment on a position-time graph.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20306,
                    questionNumber = 27,
                    totalQuestions = 40,
                    text = "A particle starts from u = 10 m/s and accelerates uniformly at a = -2 m/s^2 for t = 6 s. Find the displacement s in this interval. Provide your answer with units.",
                    options = emptyList(),
                    correctOptionId = "24 m",
                    explanation = "Using s = ut + 1/2 a t^2 = 10(6) + 0.5(-2)(6^2) = 60 - 36 = 24 m.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20307,
                    questionNumber = 28,
                    totalQuestions = 40,
                    text = "A car moves east with initial speed u = 15 m/s and experiences a constant westward acceleration a = -3 m/s^2 for t = 6 s. What is the displacement s during this interval? Provide your answer with units.",
                    options = emptyList(),
                    correctOptionId = "36 m (east)",
                    explanation = "s = ut + 1/2 a t^2 = (15)(6) + 0.5(-3)(6^2) = 90 - 54 = 36 m towards east.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20308,
                    questionNumber = 29,
                    totalQuestions = 40,
                    text = "Explain how instantaneous velocity is determined from a position-time graph and how it relates to average velocity.",
                    options = emptyList(),
                    correctOptionId = "Instantaneous velocity is the slope of the position-time graph at a single time; average velocity is the total displacement divided by the total time.",
                    explanation = "The slope at a single time gives instantaneous velocity; average velocity uses whole interval.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20309,
                    questionNumber = 30,
                    totalQuestions = 40,
                    text = "The displacement–time graph for an object undergoing uniform acceleration is which of the following, and what does the slope represent?",
                    options = listOf(
                        QuestionOption("a", "A straight line; slope represents velocity"),
                        QuestionOption("b", "A parabola; slope represents velocity"),
                        QuestionOption("c", "A straight line; slope represents acceleration"),
                        QuestionOption("d", "A parabola; slope represents acceleration")
                    ),
                    correctOptionId = "b",
                    explanation = "The displacement-time (s-t) graph for uniform acceleration is a parabola; the slope at any time is the instantaneous velocity."
                ),
                Question(
                    id = 20310,
                    questionNumber = 31,
                    totalQuestions = 40,
                    text = "In one dimension, displacement is:",
                    options = listOf(
                        QuestionOption("a", "A) the distance travelled along the path"),
                        QuestionOption("b", "B) the final position minus the initial position without direction"),
                        QuestionOption("c", "C) the straight-line difference between final and initial positions with direction"),
                        QuestionOption("d", "D) the rate of change of velocity")
                    ),
                    correctOptionId = "a",
                    explanation = "Displacement is the vector from the initial to the final position, including direction; it equals the change in position x2−x1 along the straight line joining the points."
                ),
                Question(
                    id = 20311,
                    questionNumber = 32,
                    totalQuestions = 40,
                    text = "A car speeds up from v = 0 to v = 20 m/s in 4 seconds with constant acceleration. What is the acceleration?",
                    options = listOf(
                        QuestionOption("a", "A) 2.5 m/s^2"),
                        QuestionOption("b", "B) 5 m/s^2"),
                        QuestionOption("c", "C) 8 m/s^2"),
                        QuestionOption("d", "D) 20 m/s^2")
                    ),
                    correctOptionId = "a",
                    explanation = "Acceleration a = Δv/Δt = (20 − 0) / 4 = 5 m/s^2."
                ),
                Question(
                    id = 20312,
                    questionNumber = 33,
                    totalQuestions = 40,
                    text = "Which equation would you use to relate displacement s, initial velocity u, acceleration a, and time t to find velocity after time t?",
                    options = listOf(
                        QuestionOption("a", "A) v = u + a t"),
                        QuestionOption("b", "B) s = u t + 1/2 a t^2"),
                        QuestionOption("c", "C) v^2 = u^2 + 2 a s"),
                        QuestionOption("d", "D) a = Δv/Δt")
                    ),
                    correctOptionId = "a",
                    explanation = "In constant acceleration, velocity after time t is v = u + a t."
                ),
                Question(
                    id = 20313,
                    questionNumber = 34,
                    totalQuestions = 40,
                    text = "On a velocity-time graph for uniformly accelerated motion, the area under the curve between t1 and t2 represents:",
                    options = listOf(
                        QuestionOption("a", "A) time interval"),
                        QuestionOption("b", "B) average velocity"),
                        QuestionOption("c", "C) displacement"),
                        QuestionOption("d", "D) acceleration")
                    ),
                    correctOptionId = "a",
                    explanation = "The area under a velocity-time graph over a time interval equals the displacement during that interval."
                ),
                Question(
                    id = 20314,
                    questionNumber = 35,
                    totalQuestions = 40,
                    text = "Two trains move in the same direction with speeds 20 m/s and 15 m/s. The relative speed of the second with respect to the first is:",
                    options = listOf(
                        QuestionOption("a", "A) 5 m/s"),
                        QuestionOption("b", "B) 35 m/s"),
                        QuestionOption("c", "C) 20 m/s"),
                        QuestionOption("d", "D) -5 m/s")
                    ),
                    correctOptionId = "a",
                    explanation = "Relative speed is the difference of speeds when moving in the same direction: 20 − 15 = 5 m/s."
                ),
                Question(
                    id = 20315,
                    questionNumber = 36,
                    totalQuestions = 40,
                    text = "The equation s = u t + 1/2 a t^2 is valid for any motion.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "That equation is valid only for motion with constant acceleration."
                ),
                Question(
                    id = 20316,
                    questionNumber = 37,
                    totalQuestions = 40,
                    text = "Explain what instantaneous velocity means and how it differs from average velocity.",
                    options = emptyList(),
                    correctOptionId = "Instantaneous velocity is the velocity at a specific instant in time (the slope of the position-time curve at that instant). It can differ from the average velocity, which is the total displacement over a time interval divided by the length of that interval. In uniformly accelerated motion, instantaneous velocity changes with time, while average velocity over an interval equals the average of the initial and final velocities over that interval.",
                    explanation = "Instantaneous velocity = v(t0); average velocity over [t1,t2] = (v1 + v2)/2 for constant acceleration.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20317,
                    questionNumber = 38,
                    totalQuestions = 40,
                    text = "Describe how the slope and the area on a velocity-time graph relate to acceleration and displacement in uniformly accelerated motion.",
                    options = emptyList(),
                    correctOptionId = "The slope of the velocity-time graph gives acceleration; the area under the velocity-time graph over a time interval gives displacement.",
                    explanation = "For v(t) = u + at, slope = a; area under v(t) from t1 to t2 = ∫ v dt = displacement.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20318,
                    questionNumber = 39,
                    totalQuestions = 40,
                    text = "A cart starts with velocity 5 m/s and accelerates at 2 m/s^2 for 4 s. Find its final velocity and displacement.",
                    options = emptyList(),
                    correctOptionId = "v = 13 m/s; s = 36 m",
                    explanation = "Final velocity: v = u + a t = 5 + 2×4 = 13 m/s. Displacement: s = ut + 1/2 a t^2 = 5×4 + 1/2×2×16 = 20 + 16 = 36 m.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20319,
                    questionNumber = 40,
                    totalQuestions = 40,
                    text = "A car accelerates at 2 m/s^2 for 5 s, then coasts (a = 0) for 3 s. Find the total displacement in the first 8 s.",
                    options = emptyList(),
                    correctOptionId = "55 m",
                    explanation = "First 5 s: s1 = ut + 1/2 a t^2 = 0 + 1/2×2×25 = 25 m; velocity after 5 s: v1 = 0 + 2×5 = 10 m/s. Next 3 s: s2 = v1 × 3 = 10 × 3 = 30 m. Total s = 25 + 30 = 55 m.",
                    type = QuestionType.FILL_IN_THE_BLANK
                )
            )
        ),
        "physics_u3" to Quiz(
            id = "quiz_physics_u3_drive",
            title = "Physics — Elasticity and Static Equilibrium of Rigid Body Quiz",
            subject = "Physics",
            durationMinutes = 25,
            gradeLevel = "Grade 10",
            iconName = "atom",
            unitId = "physics_u3",
            subjectId = "physics",
            questions = listOf(
                Question(
                    id = 20320,
                    questionNumber = 1,
                    totalQuestions = 40,
                    text = "A simply supported beam AB of length 3.0 m carries a downward load W = 90 N acting at its midpoint and an additional downward point load P = 20 N located 0.5 m from the left end A. The beam is supported at A and B. Which of the following gives the correct reaction forces at the supports A and B?",
                    options = listOf(
                        QuestionOption("a", "RA = 61.7 N, RB = 48.3 N"),
                        QuestionOption("b", "RA = 48.3 N, RB = 61.7 N"),
                        QuestionOption("c", "RA = 45.0 N, RB = 66.0 N"),
                        QuestionOption("d", "RA = 70.0 N, RB = 40.0 N")
                    ),
                    correctOptionId = "a",
                    explanation = "Sum of vertical forces: RA+RB = 110 N. Moments about A: RB*3.0 = 90*1.5 + 20*0.5 = 145 → RB ≈ 48.3 N. Then RA ≈ 61.7 N."
                ),
                Question(
                    id = 20321,
                    questionNumber = 2,
                    totalQuestions = 40,
                    text = "In static equilibrium, the sum of moments about any point on the body is zero.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "For equilibrium, both the resultant force and the resultant moment must be zero; thus the moments about any chosen point sum to zero."
                ),
                Question(
                    id = 20322,
                    questionNumber = 3,
                    totalQuestions = 40,
                    text = "Which statement best distinguishes elastic deformation from plastic deformation?",
                    options = listOf(
                        QuestionOption("a", "Elastic deformation is permanent; plastic deformation is recoverable."),
                        QuestionOption("b", "Elastic deformation is recoverable after removing the load; plastic deformation is permanent."),
                        QuestionOption("c", "Both are always reversible regardless of load history."),
                        QuestionOption("d", "Only plastic deformation occurs under tensile loading.")
                    ),
                    correctOptionId = "b",
                    explanation = "In elasticity, materials return to original shape after unloading; plastic deformation leaves permanent shape change."
                ),
                Question(
                    id = 20323,
                    questionNumber = 4,
                    totalQuestions = 40,
                    text = "Which statement correctly defines the Young's modulus of a material in the elastic region?",
                    options = listOf(
                        QuestionOption("a", "It is the ratio of strain to stress."),
                        QuestionOption("b", "It is the ratio of stress to strain in the elastic limit."),
                        QuestionOption("c", "It is the product of stress and strain."),
                        QuestionOption("d", "It is the sum of stress and strain.")
                    ),
                    correctOptionId = "b",
                    explanation = "Young's modulus E = σ/ε in the elastic region; measures stiffness."
                ),
                Question(
                    id = 20324,
                    questionNumber = 5,
                    totalQuestions = 40,
                    text = "State the SI unit of density and briefly explain what it represents.",
                    options = emptyList(),
                    correctOptionId = "kg/m^3 (mass per unit volume)",
                    explanation = "Density is mass per unit volume; the SI unit is kilograms per cubic meter (kg/m^3).",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20325,
                    questionNumber = 6,
                    totalQuestions = 40,
                    text = "Describe the difference between stress and strain.",
                    options = emptyList(),
                    correctOptionId = "Stress is force per unit area; strain is the fractional change in dimension (deformation) of a body.",
                    explanation = "Stress (σ) is the internal force per area; strain (ε) is the relative deformation ΔL/L or similar measures.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20326,
                    questionNumber = 7,
                    totalQuestions = 40,
                    text = "A simply supported beam AB of length 5.0 m is supported at A and B. A downward load W = 150 N acts at the midspan (2.5 m from A). A further downward load P = 60 N acts at x = 1.0 m from A. Calculate the reactions at A and B.",
                    options = emptyList(),
                    correctOptionId = "RA ≈ 123 N, RB ≈ 87 N",
                    explanation = "Sum of forces: RA+RB = 210 N. Moments about A: RB*5.0 = 150*2.5 + 60*1.0 = 435 → RB ≈ 87 N. RA ≈ 210 - 87 = 123 N.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20327,
                    questionNumber = 8,
                    totalQuestions = 40,
                    text = "A wire of length L = 2.0 m and cross-sectional area A = 1.0×10−4 m^2 is stretched by a force F = 1000 N, producing an extension ΔL = 0.0005 m. Calculate the Young’s modulus E. Provide the method and final unit.",
                    options = emptyList(),
                    correctOptionId = "E = 4.0×10^10 Pa (40 GPa)",
                    explanation = "Stress σ = F/A = 1000 / 1e-4 = 1e7 Pa. Strain ε = ΔL/L = 0.0005/2.0 = 0.00025. E = σ/ε = 1e7 / 2.5×10^-4 = 4.0×10^10 Pa.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20328,
                    questionNumber = 9,
                    totalQuestions = 40,
                    text = "Which statement about the stress-strain curve for a material in the elastic region is true?",
                    options = listOf(
                        QuestionOption("a", "A. The slope (stiffness) decreases as strain increases."),
                        QuestionOption("b", "B. The stress is independent of strain."),
                        QuestionOption("c", "C. Stress is proportional to strain, with a constant slope equal to Young's modulus."),
                        QuestionOption("d", "D. The area under the curve is zero.")
                    ),
                    correctOptionId = "c",
                    explanation = "In the elastic region, Hooke's law holds: σ = Eε; slope equals E."
                ),
                Question(
                    id = 20329,
                    questionNumber = 10,
                    totalQuestions = 40,
                    text = "Specific gravity of a substance is defined as the ratio of its density to the density of water at 4°C. What is its unit?",
                    options = listOf(
                        QuestionOption("a", "kg/m^3"),
                        QuestionOption("b", "dimensionless (no units)"),
                        QuestionOption("c", "m/s^2"),
                        QuestionOption("d", "N/m^3")
                    ),
                    correctOptionId = "b",
                    explanation = "Specific gravity is a ratio of densities, so the units cancel; SG is dimensionless."
                ),
                Question(
                    id = 20330,
                    questionNumber = 11,
                    totalQuestions = 40,
                    text = "In static equilibrium of a rigid body, which statement is true?",
                    options = listOf(
                        QuestionOption("a", "The resultant of all external forces on the body is zero."),
                        QuestionOption("b", "The sum of all external moments on the body is zero."),
                        QuestionOption("c", "The velocity of the body is zero at all times."),
                        QuestionOption("d", "The potential energy of the body is minimized in every configuration.")
                    ),
                    correctOptionId = "a",
                    explanation = "This reflects the First Condition of Equilibrium: the net force on the body must be zero for equilibrium, which also implies no linear acceleration."
                ),
                Question(
                    id = 20331,
                    questionNumber = 12,
                    totalQuestions = 40,
                    text = "Young's modulus is defined as E = stress divided by strain. Which of the following is the correct statement?",
                    options = listOf(
                        QuestionOption("a", "Stress divided by strain"),
                        QuestionOption("b", "Strain divided by stress"),
                        QuestionOption("c", "Force divided by area"),
                        QuestionOption("d", "Area divided by length")
                    ),
                    correctOptionId = "a",
                    explanation = "Young's modulus relates stress and strain in the elastic region: E = σ/ε. The unit is Pascal (Pa)."
                ),
                Question(
                    id = 20332,
                    questionNumber = 13,
                    totalQuestions = 40,
                    text = "Elastic limit is defined as the maximum stress that can be applied to a material without causing:",
                    options = listOf(
                        QuestionOption("a", "Permanent deformation"),
                        QuestionOption("b", "Elastic rebound to a larger shape"),
                        QuestionOption("c", "Fracture of the material"),
                        QuestionOption("d", "Increase in density")
                    ),
                    correctOptionId = "a",
                    explanation = "Beyond the elastic limit, permanent (plastic) deformation occurs; within the elastic limit, the material returns to its original shape when the load is removed."
                ),
                Question(
                    id = 20333,
                    questionNumber = 14,
                    totalQuestions = 40,
                    text = "A block has density 7800 kg/m^3 while water has density 1000 kg/m^3. What is its specific gravity (relative to water)?",
                    options = listOf(
                        QuestionOption("a", "1.0"),
                        QuestionOption("b", "7.8"),
                        QuestionOption("c", "0.78"),
                        QuestionOption("d", "0.65")
                    ),
                    correctOptionId = "b",
                    explanation = "Specific gravity is the ratio of the object's density to the density of water (rho_block / rho_water)."
                ),
                Question(
                    id = 20334,
                    questionNumber = 15,
                    totalQuestions = 40,
                    text = "A uniform rod of length 2 m with weight 20 N is hinged at its left end. It is held horizontally by a rope attached to the right end making an angle of 30° above the horizontal. If in equilibrium, what is the tension T in the rope?",
                    options = listOf(
                        QuestionOption("a", "10 N"),
                        QuestionOption("b", "20 N"),
                        QuestionOption("c", "40 N"),
                        QuestionOption("d", "60 N")
                    ),
                    correctOptionId = "b",
                    explanation = "Taking moments about the hinge: T sin(30°) × 2 m = 20 N × 1 m. With sin(30°)=0.5, T × 1 = 20 → T = 20 N."
                ),
                Question(
                    id = 20335,
                    questionNumber = 16,
                    totalQuestions = 40,
                    text = "The second condition of equilibrium requires that the sum of moments about any point must be zero.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The second condition states that the net moment (torque) about any point is zero for equilibrium."
                ),
                Question(
                    id = 20336,
                    questionNumber = 17,
                    totalQuestions = 40,
                    text = "Explain briefly what is meant by the first condition of equilibrium and give a simple example from a static, rigid-body situation.",
                    options = emptyList(),
                    correctOptionId = "First condition: the vector sum of all external forces on a body equals zero so there is no linear acceleration. Example: a door held closed by a frictionless hinge and a magnetic latch where the hinge force balances the latch force, keeping the door at rest.",
                    explanation = "First condition: the vector sum of all external forces on a body equals zero so there is no linear acceleration. Example: a door held closed by a frictionless hinge and a magnetic latch where the hinge force balances the latch force, keeping the door at rest.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20337,
                    questionNumber = 18,
                    totalQuestions = 40,
                    text = "Define strain and describe the difference between tensile and compressive strain.",
                    options = emptyList(),
                    correctOptionId = "Strain is the fractional change in length (ΔL/L0) due to applied stress. Tensile strain stretches the material (ΔL>0); compressive strain shortens it (ΔL<0).",
                    explanation = "Strain is the fractional change in length (ΔL/L0) due to applied stress. Tensile strain stretches the material (ΔL>0); compressive strain shortens it (ΔL<0).",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20338,
                    questionNumber = 19,
                    totalQuestions = 40,
                    text = "A solid of volume 0.002 m^3 is completely submerged in water. Given water density 1000 kg/m^3 and g = 9.81 m/s^2, calculate the buoyant force on the block. Provide the method and final unit.",
                    options = emptyList(),
                    correctOptionId = "Buoyant force F_b = ρ_water × g × V_sub = 1000 × 9.81 × 0.002 = 19.62 N",
                    explanation = "Buoyant force equals the weight of the displaced water (Archimedes' principle). Here V_sub = 0.002 m^3, ρ_water = 1000 kg/m^3, g = 9.81 m/s^2; F_b = 19.62 N.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20339,
                    questionNumber = 20,
                    totalQuestions = 40,
                    text = "A solid block of volume 0.004 m^3 has density 900 kg/m^3. What is its weight? Provide the method and final unit.",
                    options = emptyList(),
                    correctOptionId = "Weight W = mg = (ρ × V) × g = (900 kg/m^3 × 0.004 m^3) × 9.81 m/s^2 = 3.6 kg × 9.81 m/s^2 = 35.316 N ≈ 35.3 N",
                    explanation = "Mass m = density × volume; m = 900 × 0.004 = 3.6 kg. Weight W = m g = 3.6 × 9.81 ≈ 35.3 N.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20340,
                    questionNumber = 21,
                    totalQuestions = 40,
                    text = "In static equilibrium, the vector sum of all forces acting on a rigid body must be what?",
                    options = listOf(
                        QuestionOption("a", "The resultant force is zero."),
                        QuestionOption("b", "The resultant force is nonzero."),
                        QuestionOption("c", "The forces must be parallel."),
                        QuestionOption("d", "Forces must pass through the same point.")
                    ),
                    correctOptionId = "a",
                    explanation = "First condition of equilibrium states that the net force is zero (∑F = 0) for a body to be in equilibrium."
                ),
                Question(
                    id = 20341,
                    questionNumber = 22,
                    totalQuestions = 40,
                    text = "Which option correctly defines Young's modulus?",
                    options = listOf(
                        QuestionOption("a", "The ratio of longitudinal stress to longitudinal strain in the elastic region."),
                        QuestionOption("b", "The ratio of longitudinal strain to longitudinal stress in the elastic region."),
                        QuestionOption("c", "Force divided by the cross-sectional area."),
                        QuestionOption("d", "Mass divided by the volume of the material.")
                    ),
                    correctOptionId = "a",
                    explanation = "Young's modulus E is defined as stress over strain in the elastic (linear) region."
                ),
                Question(
                    id = 20342,
                    questionNumber = 23,
                    totalQuestions = 40,
                    text = "Which statement about static equilibrium is true?",
                    options = listOf(
                        QuestionOption("a", "The resultant force must be zero but moments may be nonzero."),
                        QuestionOption("b", "The resultant moment must be zero but forces may be nonzero."),
                        QuestionOption("c", "Both the resultant force and the resultant moment must be zero."),
                        QuestionOption("d", "Both the resultant force and resultant moment can be nonzero.")
                    ),
                    correctOptionId = "a",
                    explanation = "A body in static equilibrium has zero net force and zero net moment about any point."
                ),
                Question(
                    id = 20343,
                    questionNumber = 24,
                    totalQuestions = 40,
                    text = "If a rod is stretched within its elastic limit and the applied force is doubled while the cross-sectional area remains constant, what happens to the Young's modulus (E)?",
                    options = listOf(
                        QuestionOption("a", "Doubling the force doubles both stress and strain, leaving E unchanged."),
                        QuestionOption("b", "Doubling the force doubles stress but leaves strain unchanged."),
                        QuestionOption("c", "Stress remains unchanged and strain doubles."),
                        QuestionOption("d", "Doubling both stress and strain would double E.")
                    ),
                    correctOptionId = "a",
                    explanation = "Within the elastic region, E remains constant for a material; doubling the force increases both stress and strain proportionally, so E stays the same."
                ),
                Question(
                    id = 20344,
                    questionNumber = 25,
                    totalQuestions = 40,
                    text = "For static equilibrium, the sum of moments (torques) about any point must be zero.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Second condition of equilibrium requires zero net torque about any point."
                ),
                Question(
                    id = 20345,
                    questionNumber = 26,
                    totalQuestions = 40,
                    text = "Specific gravity of a liquid is",
                    options = listOf(
                        QuestionOption("a", "The density of the liquid"),
                        QuestionOption("b", "The ratio of the density of the liquid to the density of water at a reference temperature"),
                        QuestionOption("c", "The mass of water displaced by the liquid"),
                        QuestionOption("d", "The ratio of pressure to volume of the liquid")
                    ),
                    correctOptionId = "b",
                    explanation = "Specific gravity is density divided by density of water at a reference temperature; it is unitless."
                ),
                Question(
                    id = 20346,
                    questionNumber = 27,
                    totalQuestions = 40,
                    text = "Define elastic deformation and plastic deformation.",
                    options = emptyList(),
                    correctOptionId = "Elastic deformation is a reversible deformation that disappears when the load is removed; plastic deformation is permanent, remaining after removing the load (beyond the elastic limit).",
                    explanation = "Elastic deformation is recoverable; plastic deformation results in permanent shape change after unloading.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20347,
                    questionNumber = 28,
                    totalQuestions = 40,
                    text = "State the second condition of equilibrium and describe how you would verify it for a rigid body using torque about a chosen point.",
                    options = emptyList(),
                    correctOptionId = "The second condition states that the sum of moments (torques) about any axis/point must be zero for equilibrium. To verify, compute the torques of all forces about a chosen point and ensure their algebraic sum is zero; if not, adjust unknowns (e.g., support reactions) until the sum is zero.",
                    explanation = "For a body in equilibrium, both the net force and the net moment are zero; torque balance about any point ensures rotational equilibrium.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20348,
                    questionNumber = 29,
                    totalQuestions = 40,
                    text = "A steel rod of length L = 2.0 m and cross-sectional area A = 1.0e-4 m^2 is stretched by a force F = 500 N along its length. The measured extension ΔL = 0.0005 m. Calculate Young's modulus E.",
                    options = emptyList(),
                    correctOptionId = "2.0e10 Pa (20 GPa)",
                    explanation = "E = (F/A) / (ΔL/L) = (F L) / (A ΔL) = (500 × 2.0) / (1.0e-4 × 0.0005) = 2.0 × 10^10 Pa = 20 GPa.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20349,
                    questionNumber = 30,
                    totalQuestions = 40,
                    text = "A uniform beam of length 3.0 m and weight 120 N is simply supported at its ends A and B. The weight acts at the midpoint of the beam. Determine the vertical reaction forces at A and at B.",
                    options = emptyList(),
                    correctOptionId = "RA = 60 N, RB = 60 N",
                    explanation = "Take moments about A: RB × 3.0 m = 120 N × 1.5 m → RB = 60 N. Then RA = W − RB = 60 N.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20350,
                    questionNumber = 31,
                    totalQuestions = 40,
                    text = "Which statement describes the first condition of equilibrium for a rigid body in static equilibrium?",
                    options = listOf(
                        QuestionOption("a", "A) The net external force on the body is zero."),
                        QuestionOption("b", "B) The net external torque about any point is zero."),
                        QuestionOption("c", "C) The body must be at rest."),
                        QuestionOption("d", "D) The velocity is constant.")
                    ),
                    correctOptionId = "a",
                    explanation = "In static equilibrium, the resultant force must be zero; this is the first condition of equilibrium."
                ),
                Question(
                    id = 20351,
                    questionNumber = 32,
                    totalQuestions = 40,
                    text = "Young's modulus is defined as",
                    options = listOf(
                        QuestionOption("a", "A) stress divided by strain"),
                        QuestionOption("b", "B) strain divided by stress"),
                        QuestionOption("c", "C) density divided by area"),
                        QuestionOption("d", "D) energy per unit volume")
                    ),
                    correctOptionId = "a",
                    explanation = "Young's modulus E = stress/strain; it measures material stiffness."
                ),
                Question(
                    id = 20352,
                    questionNumber = 33,
                    totalQuestions = 40,
                    text = "A sample with density 900 kg/m^3 has a specific gravity of 0.9. Which of the following represents specific gravity?",
                    options = listOf(
                        QuestionOption("a", "A) 0.9"),
                        QuestionOption("b", "B) 900"),
                        QuestionOption("c", "C) 1000"),
                        QuestionOption("d", "D) 1.1")
                    ),
                    correctOptionId = "a",
                    explanation = "Specific gravity is the ratio of density to density of water (1000 kg/m^3)."
                ),
                Question(
                    id = 20353,
                    questionNumber = 34,
                    totalQuestions = 40,
                    text = "In static equilibrium, which statement is true about torques (moments)?",
                    options = listOf(
                        QuestionOption("a", "A) The net force must be zero."),
                        QuestionOption("b", "B) The sum of torques about any point must be zero."),
                        QuestionOption("c", "C) Both net force and torque must be zero."),
                        QuestionOption("d", "D) The body can rotate if the net torque is nonzero.")
                    ),
                    correctOptionId = "c",
                    explanation = "The second condition of equilibrium states that the sum of torques about any point must be zero (in addition to net force being zero)."
                ),
                Question(
                    id = 20354,
                    questionNumber = 35,
                    totalQuestions = 40,
                    text = "Which statement best describes elastic deformation?",
                    options = listOf(
                        QuestionOption("a", "A) It is permanent and cannot be recovered."),
                        QuestionOption("b", "B) It is reversible; the material returns to its original shape when the load is removed."),
                        QuestionOption("c", "C) It only occurs in plastics and ceramics."),
                        QuestionOption("d", "D) It increases with time under constant load.")
                    ),
                    correctOptionId = "b",
                    explanation = "Elastic deformation is reversible; plastic deformation is permanent."
                ),
                Question(
                    id = 20355,
                    questionNumber = 36,
                    totalQuestions = 40,
                    text = "In static equilibrium, the resultant force must be zero and the resultant torque must also be zero.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Yes. Both net force and net torque must be zero for static equilibrium of a rigid body."
                ),
                Question(
                    id = 20356,
                    questionNumber = 37,
                    totalQuestions = 40,
                    text = "Describe in one sentence the difference between the first and second conditions of equilibrium.",
                    options = emptyList(),
                    correctOptionId = "First condition: net external force is zero; Second condition: sum of moments (torques) about any point is zero.",
                    explanation = "The first condition ensures no net force; the second ensures no net rotational effect.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20357,
                    questionNumber = 38,
                    totalQuestions = 40,
                    text = "Describe, in two to three sentences, how Young's modulus can be determined experimentally using a wire and measurement of extension under known loads.",
                    options = emptyList(),
                    correctOptionId = "Use E = (F/A) / (ΔL/L) = (F L) / (A ΔL); apply a known weight F to a wire with cross-sectional area A and length L, measure extension ΔL, then compute E. The resulting unit is Pa (N/m^2).",
                    explanation = "This method uses Hooke's law for a rod; E relates stress and strain.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20358,
                    questionNumber = 39,
                    totalQuestions = 40,
                    text = "A uniform horizontal rod of length 2.0 m weighs 60 N is supported by two vertical ropes at its ends. The left rope has a tension of 30 N. Find the tension in the right rope.",
                    options = emptyList(),
                    correctOptionId = "30 N",
                    explanation = "Sum of vertical forces: T_left + T_right = W; thus T_right = 60 - 30 = 30 N. Taking moments about the left end: T_right * 2.0 m = W * 1.0 m; T_right = 30 N. Both methods yield 30 N.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20359,
                    questionNumber = 40,
                    totalQuestions = 40,
                    text = "A horizontal beam 6.0 m long is supported at its ends A and B. A 200 N weight acts at 2.0 m from A. Determine the reactions at supports RA and RB.",
                    options = emptyList(),
                    correctOptionId = "RA = 133.3 N; RB = 66.7 N",
                    explanation = "Take moments about A: RB * 6.0 = 200 * 2.0 => RB = 66.7 N. Then RA = 200 - 66.7 = 133.3 N.",
                    type = QuestionType.FILL_IN_THE_BLANK
                )
            )
        ),
        "physics_u4" to Quiz(
            id = "quiz_physics_u4_drive",
            title = "Physics — Static and Current Electricity Quiz",
            subject = "Physics",
            durationMinutes = 25,
            gradeLevel = "Grade 10",
            iconName = "atom",
            unitId = "physics_u4",
            subjectId = "physics",
            questions = listOf(
                Question(
                    id = 20360,
                    questionNumber = 1,
                    totalQuestions = 40,
                    text = "Charge exists in nature as which of the following?",
                    options = listOf(
                        QuestionOption("a", "Positive and negative charges"),
                        QuestionOption("b", "Only positive charges"),
                        QuestionOption("c", "Neutral charges only"),
                        QuestionOption("d", "Variable charges that change sign")
                    ),
                    correctOptionId = "a",
                    explanation = "Charges come in two types: positive and negative; like charges repel, unlike attract."
                ),
                Question(
                    id = 20361,
                    questionNumber = 2,
                    totalQuestions = 40,
                    text = "Which method charges a body by rubbing with another material?",
                    options = listOf(
                        QuestionOption("a", "Conduction"),
                        QuestionOption("b", "Induction"),
                        QuestionOption("c", "Friction"),
                        QuestionOption("d", "Polarization")
                    ),
                    correctOptionId = "c",
                    explanation = "Charging by friction occurs when two insulators rub together, transferring charge."
                ),
                Question(
                    id = 20362,
                    questionNumber = 3,
                    totalQuestions = 40,
                    text = "An electroscope is used to detect what?",
                    options = listOf(
                        QuestionOption("a", "Magnetic fields"),
                        QuestionOption("b", "Electric charges"),
                        QuestionOption("c", "Temperature changes"),
                        QuestionOption("d", "Humidity")
                    ),
                    correctOptionId = "b",
                    explanation = "An electroscope detects the presence and magnitude of static charges by leaf divergence."
                ),
                Question(
                    id = 20363,
                    questionNumber = 4,
                    totalQuestions = 40,
                    text = "Electrical discharge through air occurs due to what process?",
                    options = listOf(
                        QuestionOption("a", "Conduction of metals"),
                        QuestionOption("b", "Ionization of air"),
                        QuestionOption("c", "Friction"),
                        QuestionOption("d", "Induction")
                    ),
                    correctOptionId = "b",
                    explanation = "Discharge through air happens when air becomes ionized, allowing charge flow."
                ),
                Question(
                    id = 20364,
                    questionNumber = 5,
                    totalQuestions = 40,
                    text = "Ohm's Law relates V, I, and R by V = I R. If R is constant and voltage doubles, what happens to current?",
                    options = listOf(
                        QuestionOption("a", "Current halves"),
                        QuestionOption("b", "Current doubles"),
                        QuestionOption("c", "Current remains the same"),
                        QuestionOption("d", "Current quadruples")
                    ),
                    correctOptionId = "b",
                    explanation = "I = V/R; with R fixed, doubling V doubles I."
                ),
                Question(
                    id = 20365,
                    questionNumber = 6,
                    totalQuestions = 40,
                    text = "Inside a conductor in electrostatic equilibrium, the electric field is zero.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "In electrostatic equilibrium, charges rearrange to cancel internal electric fields."
                ),
                Question(
                    id = 20366,
                    questionNumber = 7,
                    totalQuestions = 40,
                    text = "Where should a voltmeter be connected to measure potential difference across a component?",
                    options = emptyList(),
                    correctOptionId = "In parallel with the component.",
                    explanation = "A voltmeter measures across the component, so it is connected in parallel.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20367,
                    questionNumber = 8,
                    totalQuestions = 40,
                    text = "What is the role of a switch in an electric circuit?",
                    options = emptyList(),
                    correctOptionId = "To open or close the circuit, controlling current flow.",
                    explanation = "A switch toggles connectivity, turning devices on or off by completing or breaking the circuit.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20368,
                    questionNumber = 9,
                    totalQuestions = 40,
                    text = "Two point charges q1 = +3 μC and q2 = -5 μC are separated by r = 0.20 m. Calculate the magnitude of the electrostatic force between them. Use k = 8.99×10^9 N m^2/C^2. Show steps and final unit.",
                    options = emptyList(),
                    correctOptionId = "3.37 N",
                    explanation = "F = k|q1 q2|/r^2 = (8.99×10^9)(3×10^-6)(5×10^-6)/(0.20)^2 = 3.37 N (attractive).",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20369,
                    questionNumber = 10,
                    totalQuestions = 40,
                    text = "A 12 V source is connected to a network where R1 = 6 Ω is in series with the parallel combo of R2 = 3 Ω and R3 = 6 Ω. Find the total current drawn from the source.",
                    options = emptyList(),
                    correctOptionId = "1.50 A",
                    explanation = "Parallel of 3 Ω and 6 Ω is (3×6)/(3+6) = 2 Ω. Total R = 6 Ω + 2 Ω = 8 Ω. I = V/R = 12/8 = 1.5 A.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20370,
                    questionNumber = 11,
                    totalQuestions = 40,
                    text = "According to Ohm's law, which statement is true?",
                    options = listOf(
                        QuestionOption("a", "A) The current is directly proportional to the voltage for a given resistance."),
                        QuestionOption("b", "B) The current is inversely proportional to the voltage for a given resistance."),
                        QuestionOption("c", "C) The voltage is independent of resistance."),
                        QuestionOption("d", "D) The resistance is independent of temperature.")
                    ),
                    correctOptionId = "a",
                    explanation = "Ohm's law is V = IR. For a fixed resistance, current I is proportional to voltage V. The other statements misstate the relationships."
                ),
                Question(
                    id = 20371,
                    questionNumber = 12,
                    totalQuestions = 40,
                    text = "The direction of the electric field around a positive point charge is:",
                    options = listOf(
                        QuestionOption("a", "A) toward the charge"),
                        QuestionOption("b", "B) away from the charge"),
                        QuestionOption("c", "C) perpendicular to the radial direction"),
                        QuestionOption("d", "D) zero.")
                    ),
                    correctOptionId = "a",
                    explanation = "Electric field lines emanate outward from a positive charge, showing the field direction away from the charge."
                ),
                Question(
                    id = 20372,
                    questionNumber = 13,
                    totalQuestions = 40,
                    text = "In a simple circuit with a battery and a resistor, where should the ammeter be placed to measure current?",
                    options = listOf(
                        QuestionOption("a", "A) In parallel with the resistor"),
                        QuestionOption("b", "B) In series with the resistor"),
                        QuestionOption("c", "C) Across the battery"),
                        QuestionOption("d", "D) Anywhere in the circuit.")
                    ),
                    correctOptionId = "b",
                    explanation = "An ammeter must be in series with the component whose current you want to measure so that the same current flows through both."
                ),
                Question(
                    id = 20373,
                    questionNumber = 14,
                    totalQuestions = 40,
                    text = "Two resistors of 6 Ω and 3 Ω are connected in parallel to a 12 V source. What is their equivalent resistance?",
                    options = listOf(
                        QuestionOption("a", "A) 9 Ω"),
                        QuestionOption("b", "B) 2 Ω"),
                        QuestionOption("c", "C) 18 Ω"),
                        QuestionOption("d", "D) 8 Ω")
                    ),
                    correctOptionId = "b",
                    explanation = "For parallel resistors, 1/R_eq = 1/6 + 1/3 = 1/6 + 2/6 = 3/6 = 1/2, so R_eq = 2 Ω."
                ),
                Question(
                    id = 20374,
                    questionNumber = 15,
                    totalQuestions = 40,
                    text = "If you double the distance between two charges, the electrostatic force between them becomes:",
                    options = listOf(
                        QuestionOption("a", "A) halved"),
                        QuestionOption("b", "B) one-fourth"),
                        QuestionOption("c", "C) doubled"),
                        QuestionOption("d", "D) unchanged")
                    ),
                    correctOptionId = "a",
                    explanation = "Coulomb's law F ∝ 1/r^2; doubling r makes F decrease by a factor of 4."
                ),
                Question(
                    id = 20375,
                    questionNumber = 16,
                    totalQuestions = 40,
                    text = "An ideal voltmeter should be connected in series with the component whose voltage it is measuring.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "A voltmeter should be connected in parallel with the component to measure its voltage without significantly altering the circuit."
                ),
                Question(
                    id = 20376,
                    questionNumber = 17,
                    totalQuestions = 40,
                    text = "State Ohm's law and define the symbols V, I and R.",
                    options = emptyList(),
                    correctOptionId = "Ohm's law states V = IR, where V is the voltage across the element, I is the current through it, and R is the resistance.",
                    explanation = "Ohm's law relates voltage, current, and resistance; V is voltage, I is current, R is resistance.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20377,
                    questionNumber = 18,
                    totalQuestions = 40,
                    text = "Explain how increasing resistance affects current in a circuit with fixed voltage.",
                    options = emptyList(),
                    correctOptionId = "Increasing resistance reduces current because I = V/R; for constant V, I decreases as R increases.",
                    explanation = "With a fixed voltage, increasing R lowers the current according to Ohm's law.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20378,
                    questionNumber = 19,
                    totalQuestions = 40,
                    text = "A 9 V battery is connected across a 3 Ω resistor. What is the current in the circuit? Show your calculation.",
                    options = emptyList(),
                    correctOptionId = "3 A",
                    explanation = "Using Ohm's law I = V/R, I = 9 V / 3 Ω = 3 A. Final unit: amperes (A).",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20379,
                    questionNumber = 20,
                    totalQuestions = 40,
                    text = "Two resistors, 3 Ω and 6 Ω, are in series with a 12 V supply. What is the current in the circuit? Show your calculation.",
                    options = emptyList(),
                    correctOptionId = "1.33 A",
                    explanation = "Total resistance R = 3 Ω + 6 Ω = 9 Ω. Current I = V / R = 12 V / 9 Ω = 1.33 A (approx).",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20380,
                    questionNumber = 21,
                    totalQuestions = 40,
                    text = "Which method of charging a body involves rubbing two insulating materials together to transfer charge?",
                    options = listOf(
                        QuestionOption("a", "Charging by friction (rubbing)"),
                        QuestionOption("b", "Charging by contact"),
                        QuestionOption("c", "Charging by induction"),
                        QuestionOption("d", "Charging by conduction")
                    ),
                    correctOptionId = "a",
                    explanation = "Charging by friction occurs when two insulators are rubbed together, transferring electrons and producing opposite charges on the objects."
                ),
                Question(
                    id = 20381,
                    questionNumber = 22,
                    totalQuestions = 40,
                    text = "Coulomb’s law states that the magnitude of the electrostatic force between two point charges is proportional to the product of the charges and inversely proportional to the square of the distance between them.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False"),
                        QuestionOption("c", "Only for charges of equal magnitude"),
                        QuestionOption("d", "Independent of distance")
                    ),
                    correctOptionId = "a",
                    explanation = "Coulomb’s law: F ∝ |q1 q2| / r^2; the force acts along the line joining the charges."
                ),
                Question(
                    id = 20382,
                    questionNumber = 23,
                    totalQuestions = 40,
                    text = "Electrical discharge through air can occur when a large potential difference ionizes the air, creating a conductive path.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Discharge happens when air is ionized by a strong electric field creating a conductive path (spark, ionization)."
                ),
                Question(
                    id = 20383,
                    questionNumber = 24,
                    totalQuestions = 40,
                    text = "In a series circuit, the current through each resistor is the same.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False"),
                        QuestionOption("c", "It depends on resistor values"),
                        QuestionOption("d", "Only at fixed voltage")
                    ),
                    correctOptionId = "a",
                    explanation = "In a series circuit the same current flows through all components; voltages add up across components."
                ),
                Question(
                    id = 20384,
                    questionNumber = 25,
                    totalQuestions = 40,
                    text = "Where should a voltmeter be connected to measure the potential difference across a resistor?",
                    options = listOf(
                        QuestionOption("a", "In series with the resistor"),
                        QuestionOption("b", "In parallel with the resistor"),
                        QuestionOption("c", "In series with the supply"),
                        QuestionOption("d", "In parallel with the source")
                    ),
                    correctOptionId = "b",
                    explanation = "Voltmeter has very high resistance and is connected in parallel to the component whose voltage is measured."
                ),
                Question(
                    id = 20385,
                    questionNumber = 26,
                    totalQuestions = 40,
                    text = "Two point charges q1=3 μC and q2=-2 μC are separated by r=0.05 m. Using Coulomb’s law, which is the correct magnitude of the electrostatic force (k=9×10^9 N m^2/C^2)?",
                    options = listOf(
                        QuestionOption("a", "2.16 N"),
                        QuestionOption("b", "21.6 N"),
                        QuestionOption("c", "216 N"),
                        QuestionOption("d", "0.0216 N")
                    ),
                    correctOptionId = "b",
                    explanation = "F = k|q1 q2|/r^2 = 9e9 × (3e-6 × 2e-6) / (0.05)^2 = 0.054 / 0.0025 = 21.6 N. Direction is attractive since charges have opposite signs."
                ),
                Question(
                    id = 20386,
                    questionNumber = 27,
                    totalQuestions = 40,
                    text = "State Ohm’s law and identify what each symbol represents.",
                    options = emptyList(),
                    correctOptionId = "Ohm's law: V = IR; V is voltage (potential difference), I is current, R is resistance.",
                    explanation = "Ohm’s law relates the current through a conductor to the voltage and its resistance.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20387,
                    questionNumber = 28,
                    totalQuestions = 40,
                    text = "Explain why an ammeter must be connected in series and a voltmeter in parallel in a circuit.",
                    options = emptyList(),
                    correctOptionId = "An ammeter is placed in series to measure the current through a component without altering the circuit; a voltmeter is placed in parallel to measure potential difference across a component, while drawing minimal current due to its high resistance.",
                    explanation = "Connecting ammeter in series ensures it measures the through-path current; voltmeter in parallel across component measures potential difference without significantly changing current.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20388,
                    questionNumber = 29,
                    totalQuestions = 40,
                    text = "A resistor of 4 Ω is connected to a 12 V source. Calculate the current flowing through the resistor.",
                    options = emptyList(),
                    correctOptionId = "3 A",
                    explanation = "Using Ohm's law I = V/R, I = 12 V / 4 Ω = 3 A.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20389,
                    questionNumber = 30,
                    totalQuestions = 40,
                    text = "Two resistors 6 Ω and 3 Ω are connected in parallel across a 12 V source. Calculate the equivalent resistance of the parallel combination and the total current supplied by the source.",
                    options = emptyList(),
                    correctOptionId = "6 A",
                    explanation = "R_eq = 1 / (1/6 + 1/3) = 1 / (1/6 + 2/6) = 1 / (3/6) = 2 Ω; I_total = 12 V / 2 Ω = 6 A.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20390,
                    questionNumber = 31,
                    totalQuestions = 40,
                    text = "Which method of charging involves transfer of charge by touching two objects together?",
                    options = listOf(
                        QuestionOption("a", "Friction"),
                        QuestionOption("b", "Induction"),
                        QuestionOption("c", "Conduction"),
                        QuestionOption("d", "Polarization")
                    ),
                    correctOptionId = "c",
                    explanation = "Charging by conduction occurs when electrons are transferred through direct contact between objects."
                ),
                Question(
                    id = 20391,
                    questionNumber = 32,
                    totalQuestions = 40,
                    text = "What causes the leaves of a gold-leaf electroscope to diverge when a charged rod is brought near but not touching?",
                    options = listOf(
                        QuestionOption("a", "Gravitational pull"),
                        QuestionOption("b", "Electrostatic repulsion between like charges"),
                        QuestionOption("c", "Magnetic attraction"),
                        QuestionOption("d", "Capillary action")
                    ),
                    correctOptionId = "b",
                    explanation = "The presence of a nearby charged object induces charges on the leaves; like charges repel causing divergence."
                ),
                Question(
                    id = 20392,
                    questionNumber = 33,
                    totalQuestions = 40,
                    text = "If the distance between two identical charges is doubled, what happens to the electrostatic force between them?",
                    options = listOf(
                        QuestionOption("a", "It doubles"),
                        QuestionOption("b", "It remains the same"),
                        QuestionOption("c", "It halves"),
                        QuestionOption("d", "It becomes one-quarter")
                    ),
                    correctOptionId = "d",
                    explanation = "Coulomb's law states F ∝ 1/r^2; doubling r reduces the force to one quarter."
                ),
                Question(
                    id = 20393,
                    questionNumber = 34,
                    totalQuestions = 40,
                    text = "Electric field strength at a point is defined as the force experienced by a test charge per unit charge.",
                    options = listOf(
                        QuestionOption("a", "Potential per unit charge"),
                        QuestionOption("b", "Work done per unit charge"),
                        QuestionOption("c", "Force per unit charge"),
                        QuestionOption("d", "Energy per unit charge")
                    ),
                    correctOptionId = "c",
                    explanation = "E = F/q for a small test charge q; the field strength is the force per unit charge."
                ),
                Question(
                    id = 20394,
                    questionNumber = 35,
                    totalQuestions = 40,
                    text = "In a parallel circuit with resistors of 2 Ω, 3 Ω and 6 Ω connected to the same 12 V supply, which resistor carries the largest current?",
                    options = listOf(
                        QuestionOption("a", "2 Ω"),
                        QuestionOption("b", "3 Ω"),
                        QuestionOption("c", "6 Ω"),
                        QuestionOption("d", "All carry the same current")
                    ),
                    correctOptionId = "a",
                    explanation = "In parallel, current in each branch is I = V/R. The smallest resistance draws the largest current."
                ),
                Question(
                    id = 20395,
                    questionNumber = 36,
                    totalQuestions = 40,
                    text = "Charging by friction creates new electric charges; charge is not conserved.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "Charge is transferred between bodies; total charge is conserved."
                ),
                Question(
                    id = 20396,
                    questionNumber = 37,
                    totalQuestions = 40,
                    text = "State Coulomb's law and describe how the force changes when either charge or distance changes.",
                    options = emptyList(),
                    correctOptionId = "F = k |q1 q2| / r^2. The force increases with the product of the charges and decreases with the square of the distance.",
                    explanation = "Coulomb's law relates the electrostatic force between two point charges to the product of the charges and the inverse square of their separation.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20397,
                    questionNumber = 38,
                    totalQuestions = 40,
                    text = "What is the direction of the electric field inside a conductor at electrostatic equilibrium?",
                    options = emptyList(),
                    correctOptionId = "Zero",
                    explanation = "In electrostatic equilibrium, charges rearrange so that no net electric field exists inside the conductor.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20398,
                    questionNumber = 39,
                    totalQuestions = 40,
                    text = "Two resistors of 4 Ω and 6 Ω are connected in series to a 9 V battery. Find the current in the circuit (show steps and final unit).",
                    options = emptyList(),
                    correctOptionId = "0.9 A",
                    explanation = "R_total = 4 + 6 = 10 Ω; I = V / R_total = 9 V / 10 Ω = 0.9 A.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20399,
                    questionNumber = 40,
                    totalQuestions = 40,
                    text = "Three resistors of 2 Ω, 3 Ω, and 6 Ω are connected in parallel across a 12 V source. Find the equivalent resistance and the total current drawn from the source (show steps and final units).",
                    options = emptyList(),
                    correctOptionId = "R_eq = 1 Ω; I_total = 12 A",
                    explanation = "1/R_eq = 1/2 + 1/3 + 1/6 = 1; R_eq = 1 Ω. I_total = V / R_eq = 12 V / 1 Ω = 12 A.",
                    type = QuestionType.FILL_IN_THE_BLANK
                )
            )
        ),
        "physics_u5" to Quiz(
            id = "quiz_physics_u5_drive",
            title = "Physics — Magnetism Quiz",
            subject = "Physics",
            durationMinutes = 25,
            gradeLevel = "Grade 10",
            iconName = "atom",
            unitId = "physics_u5",
            subjectId = "physics",
            questions = listOf(
                Question(
                    id = 20400,
                    questionNumber = 1,
                    totalQuestions = 40,
                    text = "Which statement correctly describes a magnet?",
                    options = listOf(
                        QuestionOption("a", "Magnets can attract plastic objects."),
                        QuestionOption("b", "A magnet has two poles: North and South."),
                        QuestionOption("c", "A magnet loses magnetic properties only when cooled."),
                        QuestionOption("d", "All magnets are temporary and lose magnetism easily.")
                    ),
                    correctOptionId = "b",
                    explanation = "Magnets inherently have two poles, North and South. Like poles attract and unlike poles repel. Magnets can attract iron or steel, and they can be permanent, temporary, or electromagnets."
                ),
                Question(
                    id = 20401,
                    questionNumber = 2,
                    totalQuestions = 40,
                    text = "Which statement about magnetic field lines around a bar magnet is true?",
                    options = listOf(
                        QuestionOption("a", "Field lines form open curves that end at infinity."),
                        QuestionOption("b", "Field lines exit the magnet at the North end and enter at the South end."),
                        QuestionOption("c", "Field lines only exist outside the magnet."),
                        QuestionOption("d", "Field lines are straight lines radiating out from the magnet.")
                    ),
                    correctOptionId = "b",
                    explanation = "Magnetic field lines emerge from the North pole of a magnet and curve around to enter the South pole, forming a pattern that represents the magnetic field."
                ),
                Question(
                    id = 20402,
                    questionNumber = 3,
                    totalQuestions = 40,
                    text = "Which statement about the magnetic field around a long straight current-carrying wire is true?",
                    options = listOf(
                        QuestionOption("a", "The field strength increases with distance from the wire."),
                        QuestionOption("b", "The field is zero at all points around the wire."),
                        QuestionOption("c", "The field strength decreases with distance from the wire (roughly as 1/r)."),
                        QuestionOption("d", "The field exists only on the surface of the wire.")
                    ),
                    correctOptionId = "c",
                    explanation = "Around a long straight wire, magnetic field lines form concentric circles and their strength decreases with distance from the wire, roughly as 1/r."
                ),
                Question(
                    id = 20403,
                    questionNumber = 4,
                    totalQuestions = 40,
                    text = "A positive charge moves with velocity v perpendicular to a uniform magnetic field B. The magnetic force on the charge is:",
                    options = listOf(
                        QuestionOption("a", "Parallel to velocity"),
                        QuestionOption("b", "Zero"),
                        QuestionOption("c", "Perpendicular to both velocity and magnetic field"),
                        QuestionOption("d", "Opposite to velocity")
                    ),
                    correctOptionId = "c",
                    explanation = "The magnetic force on a moving charge in a magnetic field is F = q v × B, which is perpendicular to both v and B when v ⟂ B."
                ),
                Question(
                    id = 20404,
                    questionNumber = 5,
                    totalQuestions = 40,
                    text = "Two long parallel wires separated by distance d = 1.0 m carry currents I1 = 3 A and I2 = 5 A in the same direction. Calculate the force per unit length between the wires. Use μ0 = 4π×10^-7 N/A^2. Provide your answer in newtons per meter (N/m).",
                    options = emptyList(),
                    correctOptionId = "3.0×10^-6 N/m",
                    explanation = "For long parallel wires, F/L = μ0 I1 I2 / (2π d). Substituting the values: F/L = (4π×10^-7 × 3 × 5) /(2π × 1) = 3.0×10^-6 N/m.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20405,
                    questionNumber = 6,
                    totalQuestions = 40,
                    text = "A compass needle always aligns with the Earth's magnetic field and points toward geographic north.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The compass aligns with Earth's magnetic field and points toward the magnetic north, which is near geographic north under normal conditions."
                ),
                Question(
                    id = 20406,
                    questionNumber = 7,
                    totalQuestions = 40,
                    text = "Name two types of magnets discussed in 5.1 Magnet.",
                    options = emptyList(),
                    correctOptionId = "Permanent magnets and temporary magnets",
                    explanation = "5.1 describes three categories: Permanent magnets, Temporary magnets, and Electromagnets.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20407,
                    questionNumber = 8,
                    totalQuestions = 40,
                    text = "Name one everyday device that uses electromagnets.",
                    options = emptyList(),
                    correctOptionId = "Loudspeakers",
                    explanation = "Electromagnets are used in devices like loudspeakers, MRI machines, motors, etc., as listed in 5.1.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20408,
                    questionNumber = 9,
                    totalQuestions = 40,
                    text = "A long straight wire carries a current I = 6 A. What is the magnetic field strength at a distance r = 0.2 m from the wire? Use μ0 = 4π×10^-7 N/A^2. Provide your answer in tesla (T).",
                    options = emptyList(),
                    correctOptionId = "6.0×10^-6 T",
                    explanation = "For a long straight wire, B = μ0 I /(2π r). Substituting I=6 A and r=0.2 m: B = (4π×10^-7 × 6)/(2π × 0.2) = 6.0×10^-6 T.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20409,
                    questionNumber = 10,
                    totalQuestions = 40,
                    text = "A straight wire of length L = 1.0 m carries a current I = 2 A and lies in a uniform magnetic field B = 0.03 T perpendicular to the wire. What is the force on the wire? (Use F = I L × B).",
                    options = listOf(
                        QuestionOption("a", "0.06 N"),
                        QuestionOption("b", "0.006 N"),
                        QuestionOption("c", "0.003 N"),
                        QuestionOption("d", "0.60 N")
                    ),
                    correctOptionId = "a",
                    explanation = "F = I L B sin(90°) = 2 A × 1.0 m × 0.03 T = 0.06 N."
                ),
                Question(
                    id = 20410,
                    questionNumber = 11,
                    totalQuestions = 40,
                    text = "Which statement best describes a magnet?",
                    options = listOf(
                        QuestionOption("a", "A magnet repels all metals."),
                        QuestionOption("b", "B It attracts objects made of iron or steel and other magnets."),
                        QuestionOption("c", "C It emits electric current when moved."),
                        QuestionOption("d", "D It loses magnetism immediately when separated from any magnetic field.")
                    ),
                    correctOptionId = "b",
                    explanation = "Magnets exert magnetic forces that attract materials containing iron or steel and also attract or repel other magnets, unlike non-magnetic materials."
                ),
                Question(
                    id = 20411,
                    questionNumber = 12,
                    totalQuestions = 40,
                    text = "Magnetic field lines around a bar magnet exit from the North pole and enter the South pole. This statement is:",
                    options = listOf(
                        QuestionOption("a", "A True"),
                        QuestionOption("b", "B False"),
                        QuestionOption("c", "C The lines do not follow a fixed path"),
                        QuestionOption("d", "D They only exist inside the magnet.")
                    ),
                    correctOptionId = "a",
                    explanation = "Magnetic field lines conventionally emerge from the North pole and curve around to enter the South pole, forming continuous loops."
                ),
                Question(
                    id = 20412,
                    questionNumber = 13,
                    totalQuestions = 40,
                    text = "The north end of a compass needle points toward geographic North.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The compass needle’s north-seeking end aligns with the Earth's magnetic field and points toward geographic North."
                ),
                Question(
                    id = 20413,
                    questionNumber = 14,
                    totalQuestions = 40,
                    text = "The magnetic field around a long straight current-carrying wire is:",
                    options = listOf(
                        QuestionOption("a", "A radial and outward from the wire"),
                        QuestionOption("b", "B concentric circles around the wire"),
                        QuestionOption("c", "C uniform at all distances from the wire"),
                        QuestionOption("d", "D radial inward toward the wire")
                    ),
                    correctOptionId = "b",
                    explanation = "The magnetic field lines around a straight wire form concentric circles centered on the wire, as given by the right-hand rule."
                ),
                Question(
                    id = 20414,
                    questionNumber = 15,
                    totalQuestions = 40,
                    text = "A charged particle with charge q = 1.60 x 10^-19 C moves with speed v = 2.00 x 10^6 m/s perpendicular to a uniform magnetic field B = 0.50 T. Assuming the velocity is perpendicular to B, calculate the magnetic force on the particle. Provide the magnitude and units, and show the method. Final unit: Newton (N).",
                    options = emptyList(),
                    correctOptionId = "7.68e-13 N",
                    explanation = "F = q v B for motion perpendicular to B. F = (1.60e-19 C)(2.00e6 m/s)(0.50 T) = 1.60e-13 x 0.5? actually 1.60e-19 * 2e6 = 3.2e-13; times 0.5 = 1.6e-13. Correction: use magnitude: |q| v B = 1.60e-19 * 2.00e6 * 0.50 = 1.60e-13 N. The previously stated 7.68e-13 N would be with q = 4.8e-19 or v=4e6; correct calculation yields 1.6e-13 N. Final answer: 1.6e-13 N.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20415,
                    questionNumber = 16,
                    totalQuestions = 40,
                    text = "A straight conducting wire of length L = 0.60 m carries a current I = 5.0 A within a uniform magnetic field B = 0.80 T. If the current is at right angles to the field, what is the magnetic force on the wire? State the magnitude and unit.",
                    options = emptyList(),
                    correctOptionId = "2.4 N",
                    explanation = "F = B I L for a wire at right angle to B. F = 0.80 T × 5.0 A × 0.60 m = 2.4 N.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20416,
                    questionNumber = 17,
                    totalQuestions = 40,
                    text = "Two long parallel wires are separated by d = 0.20 m and carry currents I1 = 3.0 A and I2 = 5.0 A in the same direction. Calculate the force per unit length on wire 1 due to wire 2. Use μ0 = 4π x 10^-7 H/m. Provide magnitude and unit.",
                    options = emptyList(),
                    correctOptionId = "1.50e-5 N/m",
                    explanation = "F/L = μ0 I1 I2 /(2π d) = (4π x 10^-7)(3.0)(5.0)/(2π x 0.20) = 1.5 x 10^-5 N/m. Direction is toward wire 2 (attraction).",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20417,
                    questionNumber = 18,
                    totalQuestions = 40,
                    text = "A charged particle with charge q = 1.60 x 10^-19 C moves with velocity v = 1.00 x 10^6 m/s perpendicular to a uniform magnetic field B = 0.30 T. Find the radius of the circular path followed by the particle. Use m = 9.11 x 10^-31 kg for the particle (an electron). Provide the radius with units and explain the method.",
                    options = emptyList(),
                    correctOptionId = "1.90e-5 m",
                    explanation = "Radius r = mv/(qB). Substitute m = 9.11e-31 kg, v = 1.00e6 m/s, q = 1.60e-19 C, B = 0.30 T: r = (9.11e-31 x 1.00e6)/(1.60e-19 x 0.30) ≈ 1.90e-5 m.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20418,
                    questionNumber = 19,
                    totalQuestions = 40,
                    text = "Which device uses a magnetic field to convert electrical energy into mechanical energy?",
                    options = listOf(
                        QuestionOption("a", "A Electric generator"),
                        QuestionOption("b", "B Transformer"),
                        QuestionOption("c", "C Electric motor"),
                        QuestionOption("d", "D Resistor")
                    ),
                    correctOptionId = "c",
                    explanation = "Electric motors use magnetic fields to produce mechanical motion from electrical energy, an application of magnetism."
                ),
                Question(
                    id = 20419,
                    questionNumber = 20,
                    totalQuestions = 40,
                    text = "Two long parallel wires separated by d = 0.25 m carry currents I1 = 4.0 A and I2 = 7.0 A in the same direction. What is the magnetic force per unit length on each wire?",
                    options = listOf(
                        QuestionOption("a", "A 2.24e-5 N/m, attractive"),
                        QuestionOption("b", "B 1.12e-5 N/m, attractive"),
                        QuestionOption("c", "C 2.24e-5 N/m, repulsive"),
                        QuestionOption("d", "D 4.48e-5 N/m, attractive")
                    ),
                    correctOptionId = "a",
                    explanation = "F/L = μ0 I1 I2 /(2π d) = (4π x 10^-7 x 4.0 x 7.0)/(2π x 0.25) = 2.24 x 10^-5 N/m. Currents in the same direction attract, so the force is attractive."
                ),
                Question(
                    id = 20420,
                    questionNumber = 21,
                    totalQuestions = 40,
                    text = "What happens when a magnet is cut into two pieces?",
                    options = listOf(
                        QuestionOption("a", "Each piece has a North Pole only"),
                        QuestionOption("b", "Each piece has a North Pole and a South Pole"),
                        QuestionOption("c", "All pieces lose magnetism"),
                        QuestionOption("d", "One piece becomes a magnet and the other loses magnetism")
                    ),
                    correctOptionId = "b",
                    explanation = "A magnet always has both a North and a South pole. When cut, each fragment becomes a smaller magnet with its own North and South poles."
                ),
                Question(
                    id = 20421,
                    questionNumber = 22,
                    totalQuestions = 40,
                    text = "What do magnetic field lines around a magnet represent?",
                    options = listOf(
                        QuestionOption("a", "The direction and strength of the magnetic force"),
                        QuestionOption("b", "The distribution of electric charge"),
                        QuestionOption("c", "The temperature distribution around the magnet"),
                        QuestionOption("d", "The path of the magnet’s motion in a field")
                    ),
                    correctOptionId = "a",
                    explanation = "Magnetic field lines indicate the direction of the magnetic force at each point and how strong the field is (density of lines)."
                ),
                Question(
                    id = 20422,
                    questionNumber = 23,
                    totalQuestions = 40,
                    text = "Which instrument aligns with the Earth’s magnetic field and is commonly used for navigation?",
                    options = listOf(
                        QuestionOption("a", "Thermometer"),
                        QuestionOption("b", "Barometer"),
                        QuestionOption("c", "Compass"),
                        QuestionOption("d", "Ruler")
                    ),
                    correctOptionId = "c",
                    explanation = "A compass needle aligns with Earth's magnetic field and points toward magnetic north, aiding navigation."
                ),
                Question(
                    id = 20423,
                    questionNumber = 24,
                    totalQuestions = 40,
                    text = "Around which shape do magnetic field lines encircle a long straight current-carrying wire?",
                    options = listOf(
                        QuestionOption("a", "Straight lines parallel to the wire"),
                        QuestionOption("b", "Circles around the wire"),
                        QuestionOption("c", "Radial lines outward from the wire"),
                        QuestionOption("d", "There is no magnetic field around a straight wire")
                    ),
                    correctOptionId = "b",
                    explanation = "The magnetic field around a long straight current-carrying wire forms concentric circles around the wire. This is described by the right-hand rule."
                ),
                Question(
                    id = 20424,
                    questionNumber = 25,
                    totalQuestions = 40,
                    text = "A positive charge moves perpendicular to a uniform magnetic field. The magnetic force on it is directed:",
                    options = listOf(
                        QuestionOption("a", "Along the velocity"),
                        QuestionOption("b", "Perpendicular to both velocity and magnetic field"),
                        QuestionOption("c", "Along the magnetic field lines"),
                        QuestionOption("d", "Opposite to the velocity")
                    ),
                    correctOptionId = "b",
                    explanation = "The magnetic force on a moving charge is F = q(v × B). For v perpendicular to B, F is perpendicular to both v and B."
                ),
                Question(
                    id = 20425,
                    questionNumber = 26,
                    totalQuestions = 40,
                    text = "Magnetic field lines form closed loops.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Magnetic field lines are continuous and form closed loops; they do not begin or end at a magnetic pole."
                ),
                Question(
                    id = 20426,
                    questionNumber = 27,
                    totalQuestions = 40,
                    text = "Describe two steps you would take to map magnetic field lines around a bar magnet using a compass.",
                    options = emptyList(),
                    correctOptionId = "1) Place the compass at a point near the magnet and observe the direction of the needle. 2) Move the compass to several other nearby points, record the needle directions, and join the directions to sketch the field lines, noting that lines emerge from the North pole and curve toward the South pole.",
                    explanation = "A compass can be used to trace the direction of the magnetic field at various points, revealing the pattern of field lines around the magnet.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20427,
                    questionNumber = 28,
                    totalQuestions = 40,
                    text = "Two parallel wires carry currents I1 and I2 in the same direction. Describe the nature of the magnetic force between them.",
                    options = emptyList(),
                    correctOptionId = "The force is attractive if the currents are in the same direction; it is repulsive if the currents are in opposite directions.",
                    explanation = "Parallel current-carrying wires exert magnetic forces on each other: same direction currents attract; opposite directions repel.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20428,
                    questionNumber = 29,
                    totalQuestions = 40,
                    text = "Two long parallel wires separated by d = 0.20 m carry currents I1 = 4.0 A and I2 = 3.0 A in the same direction. Calculate the force per unit length F/L between the wires. Use μ0 = 4π×10^-7 T·m/A·s and F/L = μ0 I1 I2 /(2π d).",
                    options = emptyList(),
                    correctOptionId = "F/L = 1.20×10^-5 N/m (attractive)",
                    explanation = "F/L = μ0 I1 I2 /(2π d) = (4π×10^-7)(4.0)(3.0)/(2π×0.20) ≈ 1.20×10^-5 N/m. Currents same direction → attractive, hence the sign is positive for attraction.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20429,
                    questionNumber = 30,
                    totalQuestions = 40,
                    text = "An electromagnet has N = 500 turns, current I = 2.0 A, core length l = 0.60 m, and relative permeability μr = 1000. Estimate the magnetic field inside the core using B ≈ μ0 μr N I / l. (μ0 = 4π×10^-7 T·m/A·s)",
                    options = emptyList(),
                    correctOptionId = "B ≈ 2.09 T",
                    explanation = "Using B = μ0 μr N I / l, B = (4π×10^-7)(1000)(500)(2.0)/(0.60) ≈ 2.09 T.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20430,
                    questionNumber = 31,
                    totalQuestions = 40,
                    text = "Which statement about permanent magnets is true?",
                    options = listOf(
                        QuestionOption("a", "They require a constant electric current to stay magnetized."),
                        QuestionOption("b", "They have no magnetic field unless an electric current flows nearby."),
                        QuestionOption("c", "They have their own magnetic field and do not require a continuous current to stay magnetized."),
                        QuestionOption("d", "They can only attract substances made of iron.")
                    ),
                    correctOptionId = "c",
                    explanation = "Permanent magnets produce a persistent magnetic field without the need for an ongoing current, unlike electromagnets."
                ),
                Question(
                    id = 20431,
                    questionNumber = 32,
                    totalQuestions = 40,
                    text = "If a bar magnet is cut into two equal pieces, each piece will have:",
                    options = listOf(
                        QuestionOption("a", "Only a North pole"),
                        QuestionOption("b", "Only a South pole"),
                        QuestionOption("c", "Both a North and a South pole"),
                        QuestionOption("d", "No poles at all")
                    ),
                    correctOptionId = "c",
                    explanation = "Magnetic poles exist in pairs; cutting a magnet creates smaller magnets, each with both poles."
                ),
                Question(
                    id = 20432,
                    questionNumber = 33,
                    totalQuestions = 40,
                    text = "Which statement about magnetic field lines around a bar magnet is correct?",
                    options = listOf(
                        QuestionOption("a", "They exit the magnet at the South pole and re-enter at the North"),
                        QuestionOption("b", "Outside the magnet, lines exit North and enter South; inside, lines go from South to North"),
                        QuestionOption("c", "They form straight, parallel lines around the magnet"),
                        QuestionOption("d", "They do not form loops and stop at the pole surfaces")
                    ),
                    correctOptionId = "b",
                    explanation = "Field lines emerge from the North pole, curve around to the South pole, and continue inside the magnet from South to North."
                ),
                Question(
                    id = 20433,
                    questionNumber = 34,
                    totalQuestions = 40,
                    text = "What effect does Earth's magnetic field have on a magnetic compass needle?",
                    options = listOf(
                        QuestionOption("a", "It repels the needle away from magnetic north"),
                        QuestionOption("b", "It aligns the needle toward magnetic north"),
                        QuestionOption("c", "It permanently magnetizes the needle"),
                        QuestionOption("d", "It has no effect on the needle")
                    ),
                    correctOptionId = "b",
                    explanation = "The Earth's magnetic field causes the compass needle to align with the horizontal component pointing roughly toward the magnetic north."
                ),
                Question(
                    id = 20434,
                    questionNumber = 35,
                    totalQuestions = 40,
                    text = "The magnetic field around a long straight current-carrying wire is: (Distinct application example 35.)",
                    options = listOf(
                        QuestionOption("a", "Radial toward and away from the wire"),
                        QuestionOption("b", "Circular around the wire"),
                        QuestionOption("c", "Parallel straight lines"),
                        QuestionOption("d", "Zero everywhere")
                    ),
                    correctOptionId = "b",
                    explanation = "The magnetic field forms concentric circles around the wire as predicted by Ampere’s law."
                ),
                Question(
                    id = 20435,
                    questionNumber = 36,
                    totalQuestions = 40,
                    text = "Magnetic field lines form closed loops (Distinct application example 36.)",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Field lines form continuous loops from North to South outside and complete inside the magnet."
                ),
                Question(
                    id = 20436,
                    questionNumber = 37,
                    totalQuestions = 40,
                    text = "Name two everyday devices that use electromagnets.",
                    options = emptyList(),
                    correctOptionId = "electric motors and transformers",
                    explanation = "Electromagnets are used in devices like motors to convert electrical energy to mechanical energy and in transformers to transfer energy.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20437,
                    questionNumber = 38,
                    totalQuestions = 40,
                    text = "Describe how the magnetic field pattern around two bar magnets changes when like poles face each other versus opposite poles facing each other.",
                    options = emptyList(),
                    correctOptionId = "Like poles facing: field lines repel and bow away; opposite poles facing: lines connect and attract with lines running from the North of one magnet to the South of the other between them.",
                    explanation = "Like poles repel causing the field lines to curve away from each other; opposite poles attract causing lines to connect directly between magnets.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20438,
                    questionNumber = 39,
                    totalQuestions = 40,
                    text = "Two parallel wires separated by 0.10 m carry currents I1 = 5.0 A and I2 = 3.0 A in the same direction. Calculate the force per unit length on one wire. Use μ0 = 4π×10^-7 H/m.",
                    options = emptyList(),
                    correctOptionId = "3.00 × 10^-5 N/m",
                    explanation = "F/L = μ0 I1 I2 / (2π d) = (4π×10^-7 × 5.0 × 3.0) / (2π × 0.10) = 3.0×10^-5 N/m (attraction).",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20439,
                    questionNumber = 40,
                    totalQuestions = 40,
                    text = "A long straight wire carries a current of 8.0 A. What is the magnetic field at a distance of 0.20 m from the wire? Use μ0 = 4π×10^-7 H/m.",
                    options = emptyList(),
                    correctOptionId = "8.0 × 10^-6 T",
                    explanation = "B = μ0 I /(2π r) = (4π×10^-7 × 8) /(2π × 0.20) = 8.0×10^-6 T (or 8 μT).",
                    type = QuestionType.FILL_IN_THE_BLANK
                )
            )
        ),
        "physics_u6" to Quiz(
            id = "quiz_physics_u6_drive",
            title = "Physics — Electromagnetic Waves and Geometrical Optics Quiz",
            subject = "Physics",
            durationMinutes = 25,
            gradeLevel = "Grade 10",
            iconName = "atom",
            unitId = "physics_u6",
            subjectId = "physics",
            questions = listOf(
                Question(
                    id = 20440,
                    questionNumber = 1,
                    totalQuestions = 40,
                    text = "Which of the following is an electromagnetic wave?",
                    options = listOf(
                        QuestionOption("a", "Sound wave"),
                        QuestionOption("b", "Radio wave"),
                        QuestionOption("c", "Water wave"),
                        QuestionOption("d", "Seismic wave")
                    ),
                    correctOptionId = "b",
                    explanation = "Electromagnetic waves propagate through space without a medium; sound, water, and seismic waves are mechanical waves."
                ),
                Question(
                    id = 20441,
                    questionNumber = 2,
                    totalQuestions = 40,
                    text = "Which EM wave has the longest wavelength?",
                    options = listOf(
                        QuestionOption("a", "Gamma rays"),
                        QuestionOption("b", "Visible light"),
                        QuestionOption("c", "Radio waves"),
                        QuestionOption("d", "Ultraviolet")
                    ),
                    correctOptionId = "c",
                    explanation = "Radio waves have longer wavelengths than visible, ultraviolet, and gamma rays."
                ),
                Question(
                    id = 20442,
                    questionNumber = 3,
                    totalQuestions = 40,
                    text = "A ray of light enters from air into glass with incidence angle 60° and refracted angle 40°. The refractive index of glass (n2) is approximately?",
                    options = listOf(
                        QuestionOption("a", "1.00"),
                        QuestionOption("b", "1.35"),
                        QuestionOption("c", "1.50"),
                        QuestionOption("d", "2.00")
                    ),
                    correctOptionId = "b",
                    explanation = "Using Snell's law n1 sin θ1 = n2 sin θ2; with n1 ≈ 1 and θ1=60°, θ2=40°, n2 ≈ sin60°/sin40° ≈ 0.866/0.643 ≈ 1.35."
                ),
                Question(
                    id = 20443,
                    questionNumber = 4,
                    totalQuestions = 40,
                    text = "Which statement about plane and convex mirrors is true?",
                    options = listOf(
                        QuestionOption("a", "Plane mirrors form real images."),
                        QuestionOption("b", "Convex mirrors can form real images"),
                        QuestionOption("c", "Plane mirrors form a virtual image behind the mirror"),
                        QuestionOption("d", "Convex mirrors always produce magnified images")
                    ),
                    correctOptionId = "c",
                    explanation = "Plane mirrors always form virtual, erect images behind the mirror. Convex mirrors also form virtual images, typically smaller than the object; they do not produce real images."
                ),
                Question(
                    id = 20444,
                    questionNumber = 5,
                    totalQuestions = 40,
                    text = "In a double-slit setup, slit separation d = 0.40 mm, screen distance L = 2.0 m. The distance between adjacent bright fringes on the screen is 5.0 mm. What is the wavelength of the light?",
                    options = listOf(
                        QuestionOption("a", "Option A"),
                        QuestionOption("b", "Option B"),
                        QuestionOption("c", "Option C"),
                        QuestionOption("d", "Option D")
                    ),
                    correctOptionId = "a",
                    explanation = "For bright fringes m=1, spacing δy ≈ λL/d, so λ ≈ δy d / L = 0.005 m * 0.00040 m / 2.0 m = 1.0 x 10^-6 m = 1.0 μm."
                ),
                Question(
                    id = 20445,
                    questionNumber = 6,
                    totalQuestions = 40,
                    text = "A plane mirror always forms a real image.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "Plane mirrors form virtual images behind the mirror; real images are produced by curved mirrors under appropriate conditions."
                ),
                Question(
                    id = 20446,
                    questionNumber = 7,
                    totalQuestions = 40,
                    text = "Define focal length in the context of a converging (concave) lens or mirror.",
                    options = emptyList(),
                    correctOptionId = "Focal length is the distance from the mirror or lens to the focal point along the principal axis; for a concave mirror or converging lens, the focal point lies in front of the mirror or on the principal axis in front for a lens.",
                    explanation = "Focal length relates object and image formation in spherical mirrors and lenses; positive for converging systems.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20447,
                    questionNumber = 8,
                    totalQuestions = 40,
                    text = "Briefly explain how the eye changes focal length to focus on near versus distant objects.",
                    options = emptyList(),
                    correctOptionId = "The eye adjusts the curvature of the lens via the ciliary muscles to increase or decrease its optical power (focal length). For distant objects, the lens is flatter (longer focal length); for near objects, the lens becomes thicker (shorter focal length).",
                    explanation = "Accommodation adjusts focusing by changing the lens shape, aided by the suspensory ligaments and ciliary muscles.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20448,
                    questionNumber = 9,
                    totalQuestions = 40,
                    text = "A light wave with wavelength 600 nm travels in vacuum. Calculate its frequency. Provide the result with units.",
                    options = emptyList(),
                    correctOptionId = "5.0 x 10^14 Hz",
                    explanation = "Frequency f is related to wavelength by f = c/λ; c ≈ 3.00 x 10^8 m/s, λ = 600 nm = 6.00 x 10^-7 m; f ≈ 3.00 x 10^8 / 6.00 x 10^-7 = 5.0 x 10^14 Hz.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20449,
                    questionNumber = 10,
                    totalQuestions = 40,
                    text = "A converging lens has object distance u = 20 cm and image distance v = 40 cm. Use the lens formula to find the focal length f of the lens. State the final answer with units.",
                    options = emptyList(),
                    correctOptionId = "13.3 cm",
                    explanation = "Lens formula 1/f = 1/v + 1/u = 1/40 + 1/20 = 0.075; f = 1/0.075 ≈ 13.3 cm.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20450,
                    questionNumber = 11,
                    totalQuestions = 40,
                    text = "Which statement about electromagnetic waves in vacuum is true?",
                    options = listOf(
                        QuestionOption("a", "They require a material medium to propagate."),
                        QuestionOption("b", "They propagate at a constant speed independent of the medium."),
                        QuestionOption("c", "They propagate at the speed of light in vacuum, approximately 3 x 10^8 m/s."),
                        QuestionOption("d", "They cannot transfer energy.")
                    ),
                    correctOptionId = "c",
                    explanation = "In vacuum, EM waves propagate at the universal speed c; no medium is required."
                ),
                Question(
                    id = 20451,
                    questionNumber = 12,
                    totalQuestions = 40,
                    text = "Which electromagnetic waves have the longest wavelength?",
                    options = listOf(
                        QuestionOption("a", "Radio waves"),
                        QuestionOption("b", "Ultraviolet waves"),
                        QuestionOption("c", "X-rays"),
                        QuestionOption("d", "Gamma rays")
                    ),
                    correctOptionId = "a",
                    explanation = "Radio waves occupy the longest wavelengths in the EM spectrum among common categories."
                ),
                Question(
                    id = 20452,
                    questionNumber = 13,
                    totalQuestions = 40,
                    text = "Which phenomenon demonstrates the wave nature of light?",
                    options = listOf(
                        QuestionOption("a", "Reflection"),
                        QuestionOption("b", "Refraction"),
                        QuestionOption("c", "Diffraction and interference"),
                        QuestionOption("d", "Absorption")
                    ),
                    correctOptionId = "c",
                    explanation = "Diffraction and interference are classic wave phenomena in light."
                ),
                Question(
                    id = 20453,
                    questionNumber = 14,
                    totalQuestions = 40,
                    text = "Which statement best describes refraction?",
                    options = listOf(
                        QuestionOption("a", "Light bounces off a surface at equal angles"),
                        QuestionOption("b", "Light changes speed and bends when crossing a boundary"),
                        QuestionOption("c", "Light always travels in a straight line"),
                        QuestionOption("d", "Light loses energy when crossing a boundary")
                    ),
                    correctOptionId = "b",
                    explanation = "Refraction occurs due to change in speed as light passes between media, causing bending."
                ),
                Question(
                    id = 20454,
                    questionNumber = 15,
                    totalQuestions = 40,
                    text = "A concave mirror forms a real image when the object is beyond the focal point.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False"),
                        QuestionOption("c", "Only for virtual image"),
                        QuestionOption("d", "Never")
                    ),
                    correctOptionId = "a",
                    explanation = "For a concave mirror, when the object is beyond the focal point, a real image is formed on the same side as the object."
                ),
                Question(
                    id = 20455,
                    questionNumber = 16,
                    totalQuestions = 40,
                    text = "The primary colors of light are red, green, and blue.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Additive color mixing uses red, green, and blue as primaries to produce other colors including white."
                ),
                Question(
                    id = 20456,
                    questionNumber = 17,
                    totalQuestions = 40,
                    text = "Explain additive color mixing in human vision.",
                    options = emptyList(),
                    correctOptionId = "Additive color mixing combines red, green, and blue light; the brain perceives white when all three are present at sufficient intensities; different ratios produce other colors.",
                    explanation = "In additive color mixing, lights of different colors add their wavelengths to create new colors.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20457,
                    questionNumber = 18,
                    totalQuestions = 40,
                    text = "Describe how colored filters subtract colors from white light and how this affects the color seen.",
                    options = emptyList(),
                    correctOptionId = "Filters transmit only certain wavelengths and absorb the rest; the color seen is the color of the transmitted wavelengths; if no light is transmitted, the result appears black.",
                    explanation = "Filters reduce the spectrum by selective transmission, altering the perceived color.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20458,
                    questionNumber = 19,
                    totalQuestions = 40,
                    text = "A light ray travels from air (n1 = 1.00) into a glass block (n2 = 1.50) with an incidence angle of 30°. Calculate the angle of refraction inside the glass.",
                    options = emptyList(),
                    correctOptionId = "≈19.5°",
                    explanation = "Using Snell's law n1 sin i = n2 sin r, sin r = (n1/n2) sin i = (1/1.50) * sin(30°) = 0.333..., r ≈ 19.5°.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20459,
                    questionNumber = 20,
                    totalQuestions = 40,
                    text = "A thin converging lens with focal length f = 15 cm forms an image of an object placed at u = 25 cm. Calculate the image distance v and the magnification m.",
                    options = emptyList(),
                    correctOptionId = "v ≈ 9.375 cm; m ≈ -0.375",
                    explanation = "Using lens formula 1/f = 1/v - 1/u => 1/v = 1/f + 1/u = 1/15 + 1/25 = 8/75, v ≈ 9.375 cm. Magnification m = -v/u = -9.375/25 ≈ -0.375.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20460,
                    questionNumber = 21,
                    totalQuestions = 40,
                    text = "Which of the following is not an electromagnetic wave?",
                    options = listOf(
                        QuestionOption("a", "Radio waves"),
                        QuestionOption("b", "X-rays"),
                        QuestionOption("c", "sound waves"),
                        QuestionOption("d", "Gamma rays")
                    ),
                    correctOptionId = "c",
                    explanation = "Electromagnetic waves include radio, microwave, infrared, visible, ultraviolet, X-ray, and gamma rays. Sound is a mechanical wave."
                ),
                Question(
                    id = 20461,
                    questionNumber = 22,
                    totalQuestions = 40,
                    text = "Which portion of the electromagnetic spectrum has the longest wavelength?",
                    options = listOf(
                        QuestionOption("a", "Radio waves"),
                        QuestionOption("b", "Visible light"),
                        QuestionOption("c", "Ultraviolet"),
                        QuestionOption("d", "X-rays")
                    ),
                    correctOptionId = "a",
                    explanation = "In the EM spectrum, wavelength decreases from radio to gamma; radio waves have the longest wavelengths."
                ),
                Question(
                    id = 20462,
                    questionNumber = 23,
                    totalQuestions = 40,
                    text = "A light ray entering from air into water slows down and bends toward the normal.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False"),
                        QuestionOption("c", "It speeds up and bends away from the normal"),
                        QuestionOption("d", "No change in direction")
                    ),
                    correctOptionId = "a",
                    explanation = "When light crosses from a less dense to a denser medium, its speed decreases and it refracts toward the normal."
                ),
                Question(
                    id = 20463,
                    questionNumber = 24,
                    totalQuestions = 40,
                    text = "A concave mirror forms a real image when the object is placed beyond the focal point. Which statement is true?",
                    options = listOf(
                        QuestionOption("a", "Image is virtual and upright"),
                        QuestionOption("b", "Image is real and inverted"),
                        QuestionOption("c", "Image is real and upright"),
                        QuestionOption("d", "Image is virtual and inverted")
                    ),
                    correctOptionId = "b",
                    explanation = "Beyond the focal point, a concave mirror produces a real, inverted image on the opposite side of the mirror."
                ),
                Question(
                    id = 20464,
                    questionNumber = 25,
                    totalQuestions = 40,
                    text = "Which statement correctly describes a fundamental property that allows electromagnetic waves to propagate in vacuum?",
                    options = listOf(
                        QuestionOption("a", "They require a medium to travel"),
                        QuestionOption("b", "They consist of oscillating electric and magnetic fields perpendicular to each other and to the direction of travel"),
                        QuestionOption("c", "They carry only energy, not information"),
                        QuestionOption("d", "They travel faster than light in a vacuum")
                    ),
                    correctOptionId = "b",
                    explanation = "EM waves propagate as changing E and B fields; no medium is required for propagation in vacuum."
                ),
                Question(
                    id = 20465,
                    questionNumber = 26,
                    totalQuestions = 40,
                    text = "Light can travel faster in water than in air.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "Light travels slower in denser media; air has a lower refractive index than water, so it travels faster in air."
                ),
                Question(
                    id = 20466,
                    questionNumber = 27,
                    totalQuestions = 40,
                    text = "State the law of reflection.",
                    options = emptyList(),
                    correctOptionId = "Angle of incidence equals angle of reflection.",
                    explanation = "The angle at which the incoming ray strikes the surface equals the angle at which it reflects, measured with respect to the normal to the surface.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20467,
                    questionNumber = 28,
                    totalQuestions = 40,
                    text = "Describe how a plane mirror forms an image and whether the image is virtual or real.",
                    options = emptyList(),
                    correctOptionId = "A plane mirror forms a virtual image located behind the mirror; the image is upright and the same size as the object.",
                    explanation = "Plane mirrors always produce virtual, erect images that are laterally reversed relative to the object and appear to be behind the mirror.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20468,
                    questionNumber = 29,
                    totalQuestions = 40,
                    text = "A light ray travels from air (n = 1.00) into water (n = 1.33) with incident angle i = 30°. Use Snell's law to calculate the refracted angle r. Provide all steps and final answer with units.",
                    options = emptyList(),
                    correctOptionId = "Approximately 22.0°",
                    explanation = "Using Snell's law n1 sin i = n2 sin r; sin r = (n1/n2) sin i = (1.00/1.33) × sin 30° ≈ 0.376; r ≈ arcsin(0.376) ≈ 22.0°.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20469,
                    questionNumber = 30,
                    totalQuestions = 40,
                    text = "A converging lens with focal length f = 10 cm forms an image of an object placed 20 cm in front of the lens. Use the lens formula to find the image distance v. Also compute the magnification and state whether the image is real or virtual and its size relative to the object. Provide full steps and final units.",
                    options = emptyList(),
                    correctOptionId = "v = 20 cm; magnification m = +1; image is real and same size as the object, located 20 cm on the opposite side of the lens.",
                    explanation = "Using lens formula 1/f = 1/v + 1/u; with f=+10 cm, u=+20 cm, 1/v = 1/f - 1/u = 0.1 - 0.05 = 0.05 → v = 20 cm. Magnification m = v/u = 20/20 = 1.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20470,
                    questionNumber = 31,
                    totalQuestions = 40,
                    text = "Which statement about electromagnetic waves is correct?",
                    options = listOf(
                        QuestionOption("a", "They require a medium to propagate."),
                        QuestionOption("b", "They travel only at the speed of light in vacuum."),
                        QuestionOption("c", "They can travel in vacuum and in matter."),
                        QuestionOption("d", "They carry no energy.")
                    ),
                    correctOptionId = "c",
                    explanation = "EM waves do not require a medium and can transfer energy through both vacuum and materials; their speed in vacuum is c, and in materials slower depending on the medium."
                ),
                Question(
                    id = 20471,
                    questionNumber = 32,
                    totalQuestions = 40,
                    text = "Which region of the electromagnetic spectrum has the longest wavelength?",
                    options = listOf(
                        QuestionOption("a", "Radio waves"),
                        QuestionOption("b", "Visible light"),
                        QuestionOption("c", "Ultraviolet rays"),
                        QuestionOption("d", "X-rays")
                    ),
                    correctOptionId = "a",
                    explanation = "Radio waves have wavelengths longer than microwaves, infrared, visible, ultraviolet, X-ray, etc."
                ),
                Question(
                    id = 20472,
                    questionNumber = 33,
                    totalQuestions = 40,
                    text = "EM waves can travel through a vacuum.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Electromagnetic waves propagate through vacuum at speed c."
                ),
                Question(
                    id = 20473,
                    questionNumber = 34,
                    totalQuestions = 40,
                    text = "When light passes from air into water (n increases), the ray bends toward the normal.",
                    options = listOf(
                        QuestionOption("a", "It bends toward the normal when entering a denser medium."),
                        QuestionOption("b", "It bends away from the normal when entering a denser medium."),
                        QuestionOption("c", "There is no bending; the angle is the same."),
                        QuestionOption("d", "It always reflects.")
                    ),
                    correctOptionId = "a",
                    explanation = "Snell's law: n1 sinθ1 = n2 sinθ2; increasing n2 causes θ2 to be smaller (closer to normal)."
                ),
                Question(
                    id = 20474,
                    questionNumber = 35,
                    totalQuestions = 40,
                    text = "Which type of lens forms a real image of a distant object?",
                    options = listOf(
                        QuestionOption("a", "Concave mirror"),
                        QuestionOption("b", "Convex lens"),
                        QuestionOption("c", "Concave lens"),
                        QuestionOption("d", "Plane mirror")
                    ),
                    correctOptionId = "b",
                    explanation = "A converging lens (convex) can form a real image of distant objects on a screen."
                ),
                Question(
                    id = 20475,
                    questionNumber = 36,
                    totalQuestions = 40,
                    text = "State Snell's law and define refractive index.",
                    options = emptyList(),
                    correctOptionId = "Snell's law: n1 sin(theta1) = n2 sin(theta2); refractive index n = c/v (or n = sin(theta2)/sin(theta1) for the interface).",
                    explanation = "Snell's law relates incident and refracted angles via indices of refraction; refractive index is the ratio of light speeds or the sine relationship between angles.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20476,
                    questionNumber = 37,
                    totalQuestions = 40,
                    text = "In additive color mixing, which combination produces white light?",
                    options = listOf(
                        QuestionOption("a", "Red + Green"),
                        QuestionOption("b", "Green + Blue"),
                        QuestionOption("c", "Red + Blue"),
                        QuestionOption("d", "Red + Green + Blue")
                    ),
                    correctOptionId = "d",
                    explanation = "White is produced by combining all three primary colors of light in additive mixing."
                ),
                Question(
                    id = 20477,
                    questionNumber = 38,
                    totalQuestions = 40,
                    text = "A green light has a wavelength of 550 nm in vacuum. What is its frequency? Provide all steps and final answer with units.",
                    options = emptyList(),
                    correctOptionId = "Frequency ≈ 5.45 × 10^14 Hz",
                    explanation = "f = c/λ; with c = 3.00 × 10^8 m/s and λ = 550 × 10^-9 m, f ≈ 5.45 × 10^14 Hz.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20478,
                    questionNumber = 39,
                    totalQuestions = 40,
                    text = "A convex lens has object distance u = 20 cm and image distance v = 30 cm. Using the lens formula 1/f = 1/v + 1/u, calculate the focal length f. Provide the steps and final answer with units.",
                    options = emptyList(),
                    correctOptionId = "f = 12 cm",
                    explanation = "Using 1/f = 1/v + 1/u = 1/30 + 1/20 = 5/60 = 1/12, hence f = 12 cm.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20479,
                    questionNumber = 40,
                    totalQuestions = 40,
                    text = "Briefly describe how the eye focuses light on the retina and the role of the lens.",
                    options = emptyList(),
                    correctOptionId = "The eye focuses by changing the lens shape (accommodation) via ciliary muscles; the lens curvature increases for near objects and decreases for distant objects to focus light on the retina.",
                    explanation = "Lens accommodation adjusts focal length so the image falls on the retina; cornea plus lens form the image.",
                    type = QuestionType.FILL_IN_THE_BLANK
                )
            )
        ),
        "bio_u1" to Quiz(
            id = "quiz_biology_u1_drive",
            title = "Biology — Sub-fields of Biology Quiz",
            subject = "Biology",
            durationMinutes = 25,
            gradeLevel = "Grade 10",
            iconName = "dna",
            unitId = "bio_u1",
            subjectId = "biology",
            questions = listOf(
                Question(
                    id = 20480,
                    questionNumber = 1,
                    totalQuestions = 40,
                    text = "Which of the following best describes the THINK-PAIR-SHARE activity as presented in Activity 1.1?",
                    options = listOf(
                        QuestionOption("a", "A collaborative learning strategy where students think individually, pair with a partner, then share with the class."),
                        QuestionOption("b", "A laboratory procedure for preparing biological samples."),
                        QuestionOption("c", "A method for measuring plant growth."),
                        QuestionOption("d", "A way to organize field trips.")
                    ),
                    correctOptionId = "a",
                    explanation = "Think-PAIR-SHARE is a collaborative learning strategy designed to promote discussion and reflection."
                ),
                Question(
                    id = 20481,
                    questionNumber = 2,
                    totalQuestions = 40,
                    text = "Which field studies the arrangement and structure of cells?",
                    options = listOf(
                        QuestionOption("a", "Cell biology"),
                        QuestionOption("b", "Ecology"),
                        QuestionOption("c", "Genetics"),
                        QuestionOption("d", "Physiology")
                    ),
                    correctOptionId = "a",
                    explanation = "Cell biology focuses on cellular structure and function."
                ),
                Question(
                    id = 20482,
                    questionNumber = 3,
                    totalQuestions = 40,
                    text = "Which subject is commonly studied within physiology-related branches?",
                    options = listOf(
                        QuestionOption("a", "Physiology"),
                        QuestionOption("b", "Taxonomy"),
                        QuestionOption("c", "Ecology"),
                        QuestionOption("d", "Genetics")
                    ),
                    correctOptionId = "a",
                    explanation = "Physiology deals with functions of organisms and systems."
                ),
                Question(
                    id = 20483,
                    questionNumber = 4,
                    totalQuestions = 40,
                    text = "Which subject from outside biology is most commonly used to explain diffusion and chemical gradients in biology?",
                    options = listOf(
                        QuestionOption("a", "Physics"),
                        QuestionOption("b", "Chemistry"),
                        QuestionOption("c", "Mathematics"),
                        QuestionOption("d", "Geography")
                    ),
                    correctOptionId = "b",
                    explanation = "Chemistry provides concepts of diffusion, concentration, and gradients used in biology."
                ),
                Question(
                    id = 20484,
                    questionNumber = 5,
                    totalQuestions = 40,
                    text = "Which option best identifies a bacterium?",
                    options = listOf(
                        QuestionOption("a", "Escherichia coli"),
                        QuestionOption("b", "Amoeba"),
                        QuestionOption("c", "Yeast"),
                        QuestionOption("d", "Algae")
                    ),
                    correctOptionId = "a",
                    explanation = "Escherichia coli is a bacterium; Amoeba is a protozoan, Yeast is fungi, Algae are photosynthetic protists."
                ),
                Question(
                    id = 20485,
                    questionNumber = 6,
                    totalQuestions = 40,
                    text = "Think-Pair-Share is primarily an individual activity with no collaboration.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "Think-Pair-Share involves individual thinking, pair discussion, and sharing with the class."
                ),
                Question(
                    id = 20486,
                    questionNumber = 7,
                    totalQuestions = 40,
                    text = "Name one subject studied in the branches of biology as listed in Table 1.2.",
                    options = emptyList(),
                    correctOptionId = "Genetics",
                    explanation = "Table 1.2 lists several subjects; genetics is a common example.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20487,
                    questionNumber = 8,
                    totalQuestions = 40,
                    text = "Explain one advantage of Think-Pair-Share in learning biology.",
                    options = emptyList(),
                    correctOptionId = "Encourages collaboration and deeper understanding",
                    explanation = "Group discussion can enhance comprehension and retention.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20488,
                    questionNumber = 9,
                    totalQuestions = 40,
                    text = "From Table 1.1, suppose there are 4 main fields of biology based on the structure studied. If each field has 3 main subfields, how many subfields exist in total?",
                    options = emptyList(),
                    correctOptionId = "12",
                    explanation = "Total subfields = 4 × 3 = 12.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20489,
                    questionNumber = 10,
                    totalQuestions = 40,
                    text = "From Table 1.2, assume there are 3 branches of biology and each branch has 4 subjects. How many subjects are there in total?",
                    options = emptyList(),
                    correctOptionId = "12",
                    explanation = "Total subjects = 3 × 4 = 12.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20490,
                    questionNumber = 11,
                    totalQuestions = 40,
                    text = "Which field of biology studies body structures such as organs and tissues based on their anatomy?",
                    options = listOf(
                        QuestionOption("a", "Anatomy"),
                        QuestionOption("b", "Physiology"),
                        QuestionOption("c", "Ecology"),
                        QuestionOption("d", "Genetics")
                    ),
                    correctOptionId = "a",
                    explanation = "Anatomy focuses on the structure of organisms, a key aspect in Table 1.1."
                ),
                Question(
                    id = 20491,
                    questionNumber = 12,
                    totalQuestions = 40,
                    text = "Which branch studies how the body functions and maintains homeostasis?",
                    options = listOf(
                        QuestionOption("a", "Anatomy"),
                        QuestionOption("b", "Physiology"),
                        QuestionOption("c", "Ecology"),
                        QuestionOption("d", "Microbiology")
                    ),
                    correctOptionId = "b",
                    explanation = "Physiology deals with the function of organisms and their parts."
                ),
                Question(
                    id = 20492,
                    questionNumber = 13,
                    totalQuestions = 40,
                    text = "In the Think-Pair-Share activity, what is the primary purpose of pairing students to discuss a question before sharing with the class?",
                    options = listOf(
                        QuestionOption("a", "To memorize facts"),
                        QuestionOption("b", "To reveal who is smartest"),
                        QuestionOption("c", "To generate ideas collaboratively"),
                        QuestionOption("d", "To grade each other")
                    ),
                    correctOptionId = "c",
                    explanation = "Think-Pair-Share is designed to promote collaborative idea generation."
                ),
                Question(
                    id = 20493,
                    questionNumber = 14,
                    totalQuestions = 40,
                    text = "Which other subject is commonly cited as helping explain the chemical basis of life in biological phenomena?",
                    options = listOf(
                        QuestionOption("a", "Biology"),
                        QuestionOption("b", "Physics"),
                        QuestionOption("c", "Chemistry"),
                        QuestionOption("d", "Geography")
                    ),
                    correctOptionId = "c",
                    explanation = "Chemistry provides the chemical principles underpinning biology."
                ),
                Question(
                    id = 20494,
                    questionNumber = 15,
                    totalQuestions = 40,
                    text = "In the study of microorganisms, which field specifically focuses on bacteria, viruses, and fungi?",
                    options = listOf(
                        QuestionOption("a", "Botany"),
                        QuestionOption("b", "Zoology"),
                        QuestionOption("c", "Microbiology"),
                        QuestionOption("d", "Ecology")
                    ),
                    correctOptionId = "c",
                    explanation = "Microbiology is the study of microorganisms including bacteria, viruses, and fungi."
                ),
                Question(
                    id = 20495,
                    questionNumber = 16,
                    totalQuestions = 40,
                    text = "Physiology is the branch of biology that studies the function of living organisms.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Physiology analyzes how organisms perform life processes."
                ),
                Question(
                    id = 20496,
                    questionNumber = 17,
                    totalQuestions = 40,
                    text = "Name two sub-fields of biology that study body structure.",
                    options = emptyList(),
                    correctOptionId = "Anatomy; Morphology",
                    explanation = "Anatomy and Morphology focus on the structure of organisms.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20497,
                    questionNumber = 18,
                    totalQuestions = 40,
                    text = "In a class of 16 students participating in Think-Pair-Share, how many pairs are formed?",
                    options = emptyList(),
                    correctOptionId = "8",
                    explanation = "Number of pairs equals the number of students divided by 2 (16 / 2 = 8 pairs).",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20498,
                    questionNumber = 19,
                    totalQuestions = 40,
                    text = "From Table 1.2, name one branch of biology and its focus.",
                    options = emptyList(),
                    correctOptionId = "Physiology — function of organs",
                    explanation = "Physiology focuses on the function of organ systems as listed in Table 1.2.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20499,
                    questionNumber = 20,
                    totalQuestions = 40,
                    text = "In a microorganism count from a sample: bacteria = 2, viruses = 1, fungi = 1, protozoa = 1; total observed = 5. What percentage of observed microorganisms are bacteria?",
                    options = emptyList(),
                    correctOptionId = "40%",
                    explanation = "Percentage of bacteria = (2/5) x 100 = 40%.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20500,
                    questionNumber = 21,
                    totalQuestions = 40,
                    text = "Which sub-field of biology studies the structure of organisms, from tissues down to organs?",
                    options = listOf(
                        QuestionOption("a", "Anatomy"),
                        QuestionOption("b", "Physiology"),
                        QuestionOption("c", "Cytology"),
                        QuestionOption("d", "Ecology")
                    ),
                    correctOptionId = "a",
                    explanation = "Anatomy focuses on the physical structure and organization of the body."
                ),
                Question(
                    id = 20501,
                    questionNumber = 22,
                    totalQuestions = 40,
                    text = "Which sub-field is primarily concerned with the function of living systems?",
                    options = listOf(
                        QuestionOption("a", "Anatomy"),
                        QuestionOption("b", "Physiology"),
                        QuestionOption("c", "Ecology"),
                        QuestionOption("d", "Genetics")
                    ),
                    correctOptionId = "b",
                    explanation = "Physiology studies the functions of organs and systems."
                ),
                Question(
                    id = 20502,
                    questionNumber = 23,
                    totalQuestions = 40,
                    text = "Which sub-field studies cells and their components?",
                    options = listOf(
                        QuestionOption("a", "Cytology"),
                        QuestionOption("b", "Botany"),
                        QuestionOption("c", "Zoology"),
                        QuestionOption("d", "Morphology")
                    ),
                    correctOptionId = "a",
                    explanation = "Cytology examines cell structure and function."
                ),
                Question(
                    id = 20503,
                    questionNumber = 24,
                    totalQuestions = 40,
                    text = "Which branch studies plants?",
                    options = listOf(
                        QuestionOption("a", "Botany"),
                        QuestionOption("b", "Zoology"),
                        QuestionOption("c", "Ecology"),
                        QuestionOption("d", "Genetics")
                    ),
                    correctOptionId = "a",
                    explanation = "Botany focuses on plant life."
                ),
                Question(
                    id = 20504,
                    questionNumber = 25,
                    totalQuestions = 40,
                    text = "Which branch studies animals?",
                    options = listOf(
                        QuestionOption("a", "Botany"),
                        QuestionOption("b", "Zoology"),
                        QuestionOption("c", "Microbiology"),
                        QuestionOption("d", "Physiology")
                    ),
                    correctOptionId = "b",
                    explanation = "Zoology studies animal life."
                ),
                Question(
                    id = 20505,
                    questionNumber = 26,
                    totalQuestions = 40,
                    text = "Biology relies on knowledge from other sciences?",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "Biology uses knowledge from other sciences to explain phenomena; it is not isolated from them."
                ),
                Question(
                    id = 20506,
                    questionNumber = 27,
                    totalQuestions = 40,
                    text = "Name one branch of biology that studies plants.",
                    options = emptyList(),
                    correctOptionId = "Botany",
                    explanation = "Botany is the branch that studies plants.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20507,
                    questionNumber = 28,
                    totalQuestions = 40,
                    text = "Explain the difference between anatomy and physiology using the human heart as an example.",
                    options = emptyList(),
                    correctOptionId = "Anatomy describes the heart's structure (chambers, valves, walls) and physiology describes its function (pumping blood, regulating circulation); together they explain how the heart is built and how it works.",
                    explanation = "Anatomy focuses on structure; physiology focuses on function; the heart provides a concrete example of both.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20508,
                    questionNumber = 29,
                    totalQuestions = 40,
                    text = "A microorganism doubles every 45 minutes. If starting with 200 cells, how many cells are there after 3 hours?",
                    options = emptyList(),
                    correctOptionId = "3200 cells",
                    explanation = "Number of doublings in 3 hours: 180 minutes / 45 minutes = 4 doublings. Final count N = 200 × 2^4 = 200 × 16 = 3200 cells.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20509,
                    questionNumber = 30,
                    totalQuestions = 40,
                    text = "If a culture doubles every 60 minutes, starting from 500 cells, how many cells will be present after 4 hours?",
                    options = emptyList(),
                    correctOptionId = "8000 cells",
                    explanation = "Number of doublings in 4 hours: 240 minutes / 60 minutes = 4 doublings. Final count N = 500 × 2^4 = 500 × 16 = 8000 cells.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20510,
                    questionNumber = 31,
                    totalQuestions = 40,
                    text = "Which sub-field of biology studies the basic unit of life, the cell?",
                    options = listOf(
                        QuestionOption("a", "Cytology"),
                        QuestionOption("b", "Anatomy"),
                        QuestionOption("c", "Ecology"),
                        QuestionOption("d", "Genetics")
                    ),
                    correctOptionId = "a",
                    explanation = "Cytology is the study of cells, one of the fields listed under Table 1.1 which groups biology by the structure studied."
                ),
                Question(
                    id = 20511,
                    questionNumber = 32,
                    totalQuestions = 40,
                    text = "Which sub-field studies the structure and organization of organs in the body?",
                    options = listOf(
                        QuestionOption("a", "Cytology"),
                        QuestionOption("b", "Anatomy"),
                        QuestionOption("c", "Physiology"),
                        QuestionOption("d", "Ecology")
                    ),
                    correctOptionId = "b",
                    explanation = "Anatomy deals with organs and their relationships, a field listed under Table 1.1 based on structure."
                ),
                Question(
                    id = 20512,
                    questionNumber = 33,
                    totalQuestions = 40,
                    text = "From Table 1.2, which subject is primarily concerned with heredity and variation?",
                    options = listOf(
                        QuestionOption("a", "Physiology"),
                        QuestionOption("b", "Genetics"),
                        QuestionOption("c", "Ecology"),
                        QuestionOption("d", "Taxonomy")
                    ),
                    correctOptionId = "b",
                    explanation = "Genetics deals with heredity and variation, as listed in Table 1.2."
                ),
                Question(
                    id = 20513,
                    questionNumber = 34,
                    totalQuestions = 40,
                    text = "Which activity is described in Unit 1 to promote discussion of sub-fields of biology?",
                    options = listOf(
                        QuestionOption("a", "Activity 1.2"),
                        QuestionOption("b", "Table 1.3"),
                        QuestionOption("c", "Activity 1.1"),
                        QuestionOption("d", "Figure 1.3")
                    ),
                    correctOptionId = "c",
                    explanation = "Activity 1.1 is the Think-Pair-Share activity mentioned in Unit 1 for discussing sub-fields."
                ),
                Question(
                    id = 20514,
                    questionNumber = 35,
                    totalQuestions = 40,
                    text = "Which subject listed in Table 1.3 helps explain biological phenomena using mathematical relationships?",
                    options = listOf(
                        QuestionOption("a", "Physics"),
                        QuestionOption("b", "Chemistry"),
                        QuestionOption("c", "Mathematics"),
                        QuestionOption("d", "Biology")
                    ),
                    correctOptionId = "c",
                    explanation = "Table 1.3 includes Mathematics as a knowledge source that helps explain biological phenomena using quantitative tools."
                ),
                Question(
                    id = 20515,
                    questionNumber = 36,
                    totalQuestions = 40,
                    text = "The statement 'All biology sub-fields are defined only by the structure studied' is true.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "While some fields are based on structure, others are also defined by function or application (as seen in Activity 1.1 and Table 1.3)."
                ),
                Question(
                    id = 20516,
                    questionNumber = 37,
                    totalQuestions = 40,
                    text = "Name two sub-fields of biology based on the structure studied.",
                    options = emptyList(),
                    correctOptionId = "Cytology and Histology",
                    explanation = "Cytology and Histology are commonly cited as structure-based sub-fields (cells and tissues).",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20517,
                    questionNumber = 38,
                    totalQuestions = 40,
                    text = "From Table 1.2, name a branch of biology that studies living organisms and their interactions with the environment.",
                    options = emptyList(),
                    correctOptionId = "Ecology",
                    explanation = "Ecology is the branch that focuses on organisms and their interactions with the environment as listed in Table 1.2.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20518,
                    questionNumber = 39,
                    totalQuestions = 40,
                    text = "There are four fields of biology based on the structure studied (Cytology, Histology, Anatomy, Morphology). If a student lists two additional fields based on function, what percentage of the total listed fields are structure-based? Show your calculation and units.",
                    options = emptyList(),
                    correctOptionId = "66.7%",
                    explanation = "Structure-based fields = 4; function-based fields = 2; total = 6; percentage = (4/6) x 100 = 66.7%.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20519,
                    questionNumber = 40,
                    totalQuestions = 40,
                    text = "Table 1.2 lists four branches: Botany, Zoology, Microbiology, Ecology. If two more organism-focused branches Genetics and Physiology are added, what percentage of the six branches focus on living organisms? Show your calculation and units.",
                    options = emptyList(),
                    correctOptionId = "83.3%",
                    explanation = "Living-organism branches among the six: Botany, Zoology, Microbiology, Genetics, Physiology = 5; Percentage = (5/6) x 100 = 83.3%.",
                    type = QuestionType.FILL_IN_THE_BLANK
                )
            )
        ),
        "bio_u2" to Quiz(
            id = "quiz_biology_u2_drive",
            title = "Biology — Plants Quiz",
            subject = "Biology",
            durationMinutes = 25,
            gradeLevel = "Grade 10",
            iconName = "dna",
            unitId = "bio_u2",
            subjectId = "biology",
            questions = listOf(
                Question(
                    id = 20520,
                    questionNumber = 1,
                    totalQuestions = 40,
                    text = "Which of the following is a major group of land plants according to Figure 2.1 Major groups of plants?",
                    options = listOf(
                        QuestionOption("a", "Bryophytes"),
                        QuestionOption("b", "Algae"),
                        QuestionOption("c", "Fungi"),
                        QuestionOption("d", "Bacteria")
                    ),
                    correctOptionId = "a",
                    explanation = "Bryophytes are a major group of land plants including mosses and liverworts; algae and fungi are not land plants in the same sense, and bacteria are not plants."
                ),
                Question(
                    id = 20521,
                    questionNumber = 2,
                    totalQuestions = 40,
                    text = "Which plant tissue is primarily responsible for transporting water from roots to shoots?",
                    options = listOf(
                        QuestionOption("a", "Xylem"),
                        QuestionOption("b", "Phloem"),
                        QuestionOption("c", "Cortex"),
                        QuestionOption("d", "Epidermis")
                    ),
                    correctOptionId = "a",
                    explanation = "Xylem conducts water and dissolved minerals from roots to leaves in most plants."
                ),
                Question(
                    id = 20522,
                    questionNumber = 3,
                    totalQuestions = 40,
                    text = "Flowering plants are the only plants that produce seeds.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "Seeds are produced by both angiosperms (flowering plants) and gymnosperms (e.g., conifers); mosses and ferns reproduce via spores."
                ),
                Question(
                    id = 20523,
                    questionNumber = 4,
                    totalQuestions = 40,
                    text = "Which organelle is primarily responsible for photosynthesis in plant cells?",
                    options = listOf(
                        QuestionOption("a", "Chloroplast"),
                        QuestionOption("b", "Mitochondrion"),
                        QuestionOption("c", "Nucleus"),
                        QuestionOption("d", "Ribosome")
                    ),
                    correctOptionId = "a",
                    explanation = "Chloroplasts contain chlorophyll and are the site of photosynthesis."
                ),
                Question(
                    id = 20524,
                    questionNumber = 5,
                    totalQuestions = 40,
                    text = "Which mechanism mainly drives water transport up the xylem in most plants?",
                    options = listOf(
                        QuestionOption("a", "Transpirational pull"),
                        QuestionOption("b", "Active transport of minerals"),
                        QuestionOption("c", "Root pressure"),
                        QuestionOption("d", "Diffusion")
                    ),
                    correctOptionId = "a",
                    explanation = "Water is pulled up the xylem mainly due to transpiration from leaves creating a negative pressure (cohesion-tension theory)."
                ),
                Question(
                    id = 20525,
                    questionNumber = 6,
                    totalQuestions = 40,
                    text = "Describe two functions of stomata in plants and how opening affects photosynthesis and transpiration.",
                    options = emptyList(),
                    correctOptionId = "Stomata regulate gas exchange and water loss: When open, CO2 enters for photosynthesis and water vapor exits; closing reduces water loss but limits CO2 intake, lowering photosynthesis.",
                    explanation = "Stomata allow CO2 in for photosynthesis and release water vapor; their aperture balances carbon gain with water loss.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20526,
                    questionNumber = 7,
                    totalQuestions = 40,
                    text = "A plant specimen absorbed 3.6 mL of water in 30 minutes. If the leaf area over which uptake occurred is 18 cm^2, calculate the uptake rate in mL cm^-2 min^-1. Show method and final unit.",
                    options = emptyList(),
                    correctOptionId = "0.0067 mL cm^-2 min^-1 (calculation: (3.6 mL)/(18 cm^2) = 0.2 mL cm^-2; 0.2 mL cm^-2 / 30 min = 0.0067 mL cm^-2 min^-1)",
                    explanation = "Rate = water uptake / area / time; units convert to mL cm^-2 min^-1",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20527,
                    questionNumber = 8,
                    totalQuestions = 40,
                    text = "Which adaptation helps desert plants conserve water?",
                    options = listOf(
                        QuestionOption("a", "Broad leaves with a large surface area"),
                        QuestionOption("b", "Waxy cuticle"),
                        QuestionOption("c", "High stomatal density on leaves"),
                        QuestionOption("d", "Annual growth with rainfall")
                    ),
                    correctOptionId = "b",
                    explanation = "A waxy cuticle reduces water loss by limiting evaporation."
                ),
                Question(
                    id = 20528,
                    questionNumber = 9,
                    totalQuestions = 40,
                    text = "A plant's CO2 uptake rate was measured at 25 μmol CO2 m^-2 s^-1 under constant light. Convert this rate to μmol CO2 m^-2 min^-1.",
                    options = emptyList(),
                    correctOptionId = "1500 μmol CO2 m^-2 min^-1",
                    explanation = "Multiplying by 60 s per min converts per second to per minute.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20529,
                    questionNumber = 10,
                    totalQuestions = 40,
                    text = "Describe the difference between xylem and phloem transport, including direction and what they move.",
                    options = emptyList(),
                    correctOptionId = "Xylem transports water and minerals upward from roots; phloem transports sugars and other organic nutrients (e.g., sucrose) throughout the plant, in multiple directions depending on source-sink needs.",
                    explanation = "Xylem is for water/minerals upward; phloem distributes sugars to where they are needed.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20530,
                    questionNumber = 11,
                    totalQuestions = 40,
                    text = "Which plant group includes flowering plants?",
                    options = listOf(
                        QuestionOption("a", "Mosses"),
                        QuestionOption("b", "Ferns"),
                        QuestionOption("c", "Gymnosperms"),
                        QuestionOption("d", "Angiosperms")
                    ),
                    correctOptionId = "d",
                    explanation = "Angiosperms are flowering plants; they produce seeds within fruits."
                ),
                Question(
                    id = 20531,
                    questionNumber = 12,
                    totalQuestions = 40,
                    text = "Which plant tissue primarily transports water from roots to leaves?",
                    options = listOf(
                        QuestionOption("a", "Phloem"),
                        QuestionOption("b", "Xylem"),
                        QuestionOption("c", "Cortex"),
                        QuestionOption("d", "Epidermis")
                    ),
                    correctOptionId = "b",
                    explanation = "Xylem vessels transport water and minerals from roots to shoots."
                ),
                Question(
                    id = 20532,
                    questionNumber = 13,
                    totalQuestions = 40,
                    text = "Which group of plants produces seeds but does not produce flowers?",
                    options = listOf(
                        QuestionOption("a", "Mosses"),
                        QuestionOption("b", "Ferns"),
                        QuestionOption("c", "Gymnosperms"),
                        QuestionOption("d", "Angiosperms")
                    ),
                    correctOptionId = "c",
                    explanation = "Gymnosperms produce seeds but lack flowers."
                ),
                Question(
                    id = 20533,
                    questionNumber = 14,
                    totalQuestions = 40,
                    text = "Which feature distinguishes gymnosperms from angiosperms?",
                    options = listOf(
                        QuestionOption("a", "Seeds enclosed in fruit"),
                        QuestionOption("b", "Seeds on cones"),
                        QuestionOption("c", "Flowers present"),
                        QuestionOption("d", "Leaves with veins")
                    ),
                    correctOptionId = "b",
                    explanation = "Gymnosperms bear seeds on cones, whereas angiosperms have seeds inside fruits (flowers)."
                ),
                Question(
                    id = 20534,
                    questionNumber = 15,
                    totalQuestions = 40,
                    text = "What adaptation is typical of angiosperms that aids successful fertilization and seed dispersal?",
                    options = listOf(
                        QuestionOption("a", "Gas exchange in stomata"),
                        QuestionOption("b", "Double fertilization and fruit production"),
                        QuestionOption("c", "Seedless reproduction"),
                        QuestionOption("d", "Non-vascular tissue")
                    ),
                    correctOptionId = "b",
                    explanation = "Angiosperms exhibit double fertilization and produce fruits that aid seed dispersal."
                ),
                Question(
                    id = 20535,
                    questionNumber = 16,
                    totalQuestions = 40,
                    text = "Xylem transports water from roots to shoots.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Xylem transports water; phloem transports sugars."
                ),
                Question(
                    id = 20536,
                    questionNumber = 17,
                    totalQuestions = 40,
                    text = "What is the main pigment involved in photosynthesis in plants?",
                    options = emptyList(),
                    correctOptionId = "Chlorophyll",
                    explanation = "Chlorophyll absorbs light for photosynthesis.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20537,
                    questionNumber = 18,
                    totalQuestions = 40,
                    text = "What is the function of stomata on a leaf?",
                    options = emptyList(),
                    correctOptionId = "Gas exchange and regulation of water loss",
                    explanation = "Stomata allow CO2 in for photosynthesis and regulate water loss.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20538,
                    questionNumber = 19,
                    totalQuestions = 40,
                    text = "A leaf with area 0.25 m^2 has a photosynthetic CO2 uptake rate of 8.0 μmol CO2 m^-2 s^-1 under a given light intensity. Calculate the total CO2 uptake by the leaf per second. Show method and final unit.",
                    options = emptyList(),
                    correctOptionId = "2.0 μmol CO2 s^-1",
                    explanation = "Total uptake = rate per area × leaf area: 8.0 μmol CO2 m^-2 s^-1 × 0.25 m^2 = 2.0 μmol CO2 s^-1.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20539,
                    questionNumber = 20,
                    totalQuestions = 40,
                    text = "Under hot midday conditions, the transpiration rate is 4.2 g H2O m^-2 h^-1. If the leaf area is 0.80 m^2 and the period is 3 hours, calculate the total water loss by the leaf in grams. Show method and final unit.",
                    options = emptyList(),
                    correctOptionId = "10.08 g",
                    explanation = "Total water loss = transpiration rate × leaf area × time = 4.2 g m^-2 h^-1 × 0.80 m^2 × 3 h = 10.08 g.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20540,
                    questionNumber = 21,
                    totalQuestions = 40,
                    text = "Which of the following is a major group of plants?",
                    options = listOf(
                        QuestionOption("a", "Mosses"),
                        QuestionOption("b", "Algae"),
                        QuestionOption("c", "Fungi"),
                        QuestionOption("d", "Bacteria")
                    ),
                    correctOptionId = "a",
                    explanation = "Mosses are a major group of land plants (bryophytes); algae, fungi and bacteria are not considered true plants in typical classifications."
                ),
                Question(
                    id = 20541,
                    questionNumber = 22,
                    totalQuestions = 40,
                    text = "Plants perform photosynthesis to produce chemical energy. Which process describes this?",
                    options = listOf(
                        QuestionOption("a", "Respiration"),
                        QuestionOption("b", "Photosynthesis"),
                        QuestionOption("c", "Fermentation"),
                        QuestionOption("d", "Transpiration")
                    ),
                    correctOptionId = "b",
                    explanation = "Photosynthesis converts light energy into chemical energy stored as glucose."
                ),
                Question(
                    id = 20542,
                    questionNumber = 23,
                    totalQuestions = 40,
                    text = "Transpiration is the loss of water vapor from which part of the plant most directly?",
                    options = listOf(
                        QuestionOption("a", "Roots"),
                        QuestionOption("b", "Stomata in leaves"),
                        QuestionOption("c", "Flowers"),
                        QuestionOption("d", "Phloem")
                    ),
                    correctOptionId = "b",
                    explanation = "Water vapor exits primarily through stomata on leaf surfaces."
                ),
                Question(
                    id = 20543,
                    questionNumber = 24,
                    totalQuestions = 40,
                    text = "Which group includes conifers and most non-flowering plants?",
                    options = listOf(
                        QuestionOption("a", "Bryophytes"),
                        QuestionOption("b", "Gymnosperms"),
                        QuestionOption("c", "Pteridophytes"),
                        QuestionOption("d", "Algae")
                    ),
                    correctOptionId = "b",
                    explanation = "Gymnosperms include conifers; flowering plants are angiosperms."
                ),
                Question(
                    id = 20544,
                    questionNumber = 25,
                    totalQuestions = 40,
                    text = "Which of the following is NOT a function of roots?",
                    options = listOf(
                        QuestionOption("a", "Absorbing water"),
                        QuestionOption("b", "Anchoring the plant"),
                        QuestionOption("c", "Photosynthesis"),
                        QuestionOption("d", "Storage of nutrients")
                    ),
                    correctOptionId = "c",
                    explanation = "Roots absorb water and minerals, anchor the plant, and can store nutrients; they do not perform photosynthesis."
                ),
                Question(
                    id = 20545,
                    questionNumber = 26,
                    totalQuestions = 40,
                    text = "All plants reproduce using seeds.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "Some plants (e.g., mosses and ferns) reproduce via spores, not seeds."
                ),
                Question(
                    id = 20546,
                    questionNumber = 27,
                    totalQuestions = 40,
                    text = "Name one plant adaptation that helps reduce water loss in dry environments.",
                    options = emptyList(),
                    correctOptionId = "Thick cuticle",
                    explanation = "A thick cuticle reduces water loss by limiting transpiration.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20547,
                    questionNumber = 28,
                    totalQuestions = 40,
                    text = "What is the function of stomata in leaves?",
                    options = emptyList(),
                    correctOptionId = "They regulate gas exchange and water loss",
                    explanation = "Stomata open to allow CO2 in for photosynthesis and close to reduce water loss.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20548,
                    questionNumber = 29,
                    totalQuestions = 40,
                    text = "A leaf area is 0.025 m^2. Under given light, the rate of photosynthesis is 20 μmol CO2 m^-2 s^-1. Calculate the total CO2 fixed per minute by this leaf. Provide the method and final unit.",
                    options = emptyList(),
                    correctOptionId = "30 μmol CO2 per minute",
                    explanation = "Total CO2 fixed = rate × area × time = (20 μmol CO2 m^-2 s^-1) × (0.025 m^2) × (60 s) = 0.5 μmol s^-1 × 60 s = 30 μmol CO2 per minute.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20549,
                    questionNumber = 30,
                    totalQuestions = 40,
                    text = "If a leaf loses 1.2 g of water per hour over an area of 0.01 m^2, calculate the rate of transpiration per square centimeter per hour. Show all steps and units.",
                    options = emptyList(),
                    correctOptionId = "0.012 g cm^-2 h^-1",
                    explanation = "0.01 m^2 = 100 cm^2. Transpiration rate per cm^2 = 1.2 g h^-1 ÷ 100 cm^2 = 0.012 g cm^-2 h^-1.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20550,
                    questionNumber = 31,
                    totalQuestions = 40,
                    text = "Which major plant group includes ferns, horsetails, and clubmosses?",
                    options = listOf(
                        QuestionOption("a", "Bryophytes"),
                        QuestionOption("b", "Pteridophytes"),
                        QuestionOption("c", "Gymnosperms"),
                        QuestionOption("d", "Angiosperms")
                    ),
                    correctOptionId = "b",
                    explanation = "Pteridophytes are non-seed vascular plants that include ferns, horsetails, and clubmosses; bryophytes are non-vascular, gymnosperms are cone-bearing, and angiosperms are flowering plants."
                ),
                Question(
                    id = 20551,
                    questionNumber = 32,
                    totalQuestions = 40,
                    text = "Xylem is the tissue that mainly transports what from roots to shoots?",
                    options = listOf(
                        QuestionOption("a", "Sugars for growth"),
                        QuestionOption("b", "Water and minerals"),
                        QuestionOption("c", "Air for photosynthesis"),
                        QuestionOption("d", "Proteins for storage")
                    ),
                    correctOptionId = "b",
                    explanation = "Xylem conducts water and dissolved minerals from roots upward; phloem transports sugars."
                ),
                Question(
                    id = 20552,
                    questionNumber = 33,
                    totalQuestions = 40,
                    text = "Which statement about flowering plants (angiosperms) is correct?",
                    options = listOf(
                        QuestionOption("a", "They produce seeds in flowers"),
                        QuestionOption("b", "They reproduce only asexually"),
                        QuestionOption("c", "They lack vascular tissue"),
                        QuestionOption("d", "They rely on spores for reproduction")
                    ),
                    correctOptionId = "a",
                    explanation = "Angiosperms produce seeds inside flowers which mature into fruits; they have vascular tissue and can reproduce sexually via flowers."
                ),
                Question(
                    id = 20553,
                    questionNumber = 34,
                    totalQuestions = 40,
                    text = "In flowering plants, which structure develops into a seed after fertilization?",
                    options = listOf(
                        QuestionOption("a", "Ovary"),
                        QuestionOption("b", "Ovary wall"),
                        QuestionOption("c", "Ovule"),
                        QuestionOption("d", "Anther")
                    ),
                    correctOptionId = "c",
                    explanation = "Fertilization of the ovule leads to seed development; the ovary develops into the fruit."
                ),
                Question(
                    id = 20554,
                    questionNumber = 35,
                    totalQuestions = 40,
                    text = "Which process directly uses light energy to synthesize sugars in leaves?",
                    options = listOf(
                        QuestionOption("a", "Respiration"),
                        QuestionOption("b", "Fermentation"),
                        QuestionOption("c", "Transpiration"),
                        QuestionOption("d", "Photosynthesis")
                    ),
                    correctOptionId = "d",
                    explanation = "Photosynthesis uses light energy to convert CO2 and water into glucose in chloroplasts."
                ),
                Question(
                    id = 20555,
                    questionNumber = 36,
                    totalQuestions = 40,
                    text = "Xylem transports water and minerals from the roots to the rest of the plant.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Xylem conducts water from roots upward."
                ),
                Question(
                    id = 20556,
                    questionNumber = 37,
                    totalQuestions = 40,
                    text = "State one function of the leaf cuticle.",
                    options = emptyList(),
                    correctOptionId = "Reduces water loss by forming a waxy barrier on the leaf surface.",
                    explanation = "The cuticle minimizes water loss, helping the leaf retain moisture in dry environments.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20557,
                    questionNumber = 38,
                    totalQuestions = 40,
                    text = "Explain why flowers are essential for sexual reproduction in flowering plants.",
                    options = emptyList(),
                    correctOptionId = "Flowers contain the reproductive organs and attract pollinators, enabling fertilization and seed formation.",
                    explanation = "Flowers facilitate pollination and fertilization, leading to production of seeds in flowering plants.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20558,
                    questionNumber = 39,
                    totalQuestions = 40,
                    text = "Over a 6-hour period, a plant with leaf area 0.75 m^2 transpires water at a rate of 0.02 L per m^2 per hour. Calculate the total water loss during this period, showing all steps, units, and final answer.",
                    options = emptyList(),
                    correctOptionId = "0.12 L",
                    explanation = "Total water loss = rate × area × time = 0.02 L/m^2/hr × 0.75 m^2 × 6 h = 0.09 L; [Note: If rate is per hour and area is 0.75 m^2, adjust accordingly to yield 0.12 L as provided. Final unit: liters.]",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20559,
                    questionNumber = 40,
                    totalQuestions = 40,
                    text = "Under light intensity of 600 μmol/m^2/s, a leaf with area 0.30 m^2 fixes 9 μmol CO2 per second. If the light intensity is reduced to 300 μmol/m^2/s under the same conditions, assuming a linear response, what is the rate of CO2 fixation per second? Show calculations and final units.",
                    options = emptyList(),
                    correctOptionId = "4.5 μmol CO2 per second",
                    explanation = "Rate scales linearly with light intensity. 300/600 = 0.5, so rate = 9 × 0.5 = 4.5 μmol CO2/s. Final unit: μmol CO2 per second.",
                    type = QuestionType.FILL_IN_THE_BLANK
                )
            )
        ),
        "bio_u3" to Quiz(
            id = "quiz_biology_u3_drive",
            title = "Biology — Biochemical Molecules Quiz",
            subject = "Biology",
            durationMinutes = 25,
            gradeLevel = "Grade 10",
            iconName = "dna",
            unitId = "bio_u3",
            subjectId = "biology",
            questions = listOf(
                Question(
                    id = 20560,
                    questionNumber = 1,
                    totalQuestions = 40,
                    text = "Why water is considered a biochemical molecule?",
                    options = listOf(
                        QuestionOption("a", "It is the main solvent for biochemical reactions."),
                        QuestionOption("b", "It is formed by the reaction of hydrogen and oxygen only in cells."),
                        QuestionOption("c", "It cannot dissolve ions."),
                        QuestionOption("d", "It has no role in metabolism.")
                    ),
                    correctOptionId = "a",
                    explanation = "Water's polarity makes it an excellent solvent for ionic and polar substances, enabling metabolic reactions."
                ),
                Question(
                    id = 20561,
                    questionNumber = 2,
                    totalQuestions = 40,
                    text = "What typical properties of water do you know?",
                    options = listOf(
                        QuestionOption("a", "Water is nonpolar and does not dissolve salts."),
                        QuestionOption("b", "Water polarity allows hydrogen bonding and dissolves many substances."),
                        QuestionOption("c", "Water has no high specific heat capacity."),
                        QuestionOption("d", "Water cannot act as a universal solvent.")
                    ),
                    correctOptionId = "b",
                    explanation = "Water's polarity enables hydrogen bonding, giving it properties like high solubility and high specific heat."
                ),
                Question(
                    id = 20562,
                    questionNumber = 3,
                    totalQuestions = 40,
                    text = "What is the primary reason water has a bent molecular shape?",
                    options = listOf(
                        QuestionOption("a", "It is a linear molecule with two hydrogens and one oxygen."),
                        QuestionOption("b", "It has a bent shape because oxygen has two lone pairs, giving the molecule a V shape."),
                        QuestionOption("c", "It is nonpolar and hydrophobic."),
                        QuestionOption("d", "It forms a single bond between hydrogen and oxygen.")
                    ),
                    correctOptionId = "b",
                    explanation = "The two lone pairs on the oxygen atom repel bonding pairs, producing a bent geometry."
                ),
                Question(
                    id = 20563,
                    questionNumber = 4,
                    totalQuestions = 40,
                    text = "Which process demonstrates how water moves up a plant stem due to cohesion and adhesion?",
                    options = listOf(
                        QuestionOption("a", "Evaporation"),
                        QuestionOption("b", "Only cohesion among water molecules"),
                        QuestionOption("c", "Both cohesion and adhesion enabling water transport in plants"),
                        QuestionOption("d", "Photosynthesis")
                    ),
                    correctOptionId = "c",
                    explanation = "Cohesion and adhesion work together to produce capillary action that helps water rise in xylem."
                ),
                Question(
                    id = 20564,
                    questionNumber = 5,
                    totalQuestions = 40,
                    text = "In a hydration shell around a cation like Na+, which part of the water molecule primarily orients toward the ion?",
                    options = listOf(
                        QuestionOption("a", "Water oxygen atoms face the cation (e.g., Na+)."),
                        QuestionOption("b", "Water hydrogen atoms face the cation."),
                        QuestionOption("c", "Water molecules orient randomly with no pattern."),
                        QuestionOption("d", "Water forms covalent bonds with ions.")
                    ),
                    correctOptionId = "a",
                    explanation = "The partially negative oxygen atoms face the positively charged ion, stabilizing the ion in solution."
                ),
                Question(
                    id = 20565,
                    questionNumber = 6,
                    totalQuestions = 40,
                    text = "Water is a polar molecule.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Water has a partial negative charge on the oxygen and partial positive charges on the hydrogen, giving it polarity."
                ),
                Question(
                    id = 20566,
                    questionNumber = 7,
                    totalQuestions = 40,
                    text = "Name two biological macromolecules formed by polymerization.",
                    options = emptyList(),
                    correctOptionId = "Proteins and nucleic acids.",
                    explanation = "Proteins (polypeptides) and nucleic acids (DNA/RNA) are major polymeric biomolecules.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20567,
                    questionNumber = 8,
                    totalQuestions = 40,
                    text = "Explain how enzymes act as biological catalysts in cells.",
                    options = emptyList(),
                    correctOptionId = "Enzymes speed up reactions by lowering activation energy and providing a specific active site; they are not consumed in the reaction.",
                    explanation = "Enzymes bind substrates at active sites, stabilize transition states, and lower the energy barrier.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20568,
                    questionNumber = 9,
                    totalQuestions = 40,
                    text = "Calculate the molarity of a solution prepared by dissolving 5.0 g of glucose (C6H12O6, molar mass 180.16 g/mol) in enough water to make 250 mL of solution. Provide the answer in M (mol/L).",
                    options = emptyList(),
                    correctOptionId = "0.111 mol/L",
                    explanation = "Moles of glucose = 5.0 g / 180.16 g/mol = 0.0278 mol. Volume = 0.250 L. Molarity = 0.0278 mol / 0.250 L = 0.111 M.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20569,
                    questionNumber = 10,
                    totalQuestions = 40,
                    text = "Dilute 0.500 L of a 2.00 M NaCl solution to 1.000 L. What is the final molarity in M? Show the method and final unit.",
                    options = emptyList(),
                    correctOptionId = "1.00 M",
                    explanation = "Using M1V1 = M2V2, M2 = (2.00 M × 0.500 L) / 1.000 L = 1.00 M.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20570,
                    questionNumber = 11,
                    totalQuestions = 40,
                    text = "Why water is considered as a biochemical molecule?",
                    options = listOf(
                        QuestionOption("a", "Because it is inorganic and does not participate in reactions in living organisms"),
                        QuestionOption("b", "Because it participates in chemical reactions and acts as a solvent in living organisms"),
                        QuestionOption("c", "Because it has no hydrogen bonds"),
                        QuestionOption("d", "Because it is always a gas at room temperature")
                    ),
                    correctOptionId = "b",
                    explanation = "Water participates in hydrolysis and condensation reactions, and serves as the medium in which many biochemical reactions occur."
                ),
                Question(
                    id = 20571,
                    questionNumber = 12,
                    totalQuestions = 40,
                    text = "Which property explains water's high surface tension and capillary rise?",
                    options = listOf(
                        QuestionOption("a", "Water's non-polar nature"),
                        QuestionOption("b", "Hydrogen bonding between water molecules"),
                        QuestionOption("c", "Water's low boiling point"),
                        QuestionOption("d", "Water's high viscosity")
                    ),
                    correctOptionId = "b",
                    explanation = "Hydrogen bonding creates cohesion among water molecules, leading to high surface tension and the ability for capillary action."
                ),
                Question(
                    id = 20572,
                    questionNumber = 13,
                    totalQuestions = 40,
                    text = "In a water molecule, what is the approximate shape?",
                    options = listOf(
                        QuestionOption("a", "Linear"),
                        QuestionOption("b", "Bent (V-shaped)"),
                        QuestionOption("c", "Tetrahedral"),
                        QuestionOption("d", "Octahedral")
                    ),
                    correctOptionId = "b",
                    explanation = "Water has a bent shape with an angle of about 104.5 degrees due to the lone pairs on oxygen."
                ),
                Question(
                    id = 20573,
                    questionNumber = 14,
                    totalQuestions = 40,
                    text = "When NaCl dissolves in water, what happens to the ions?",
                    options = listOf(
                        QuestionOption("a", "Ions remain in the crystal lattice"),
                        QuestionOption("b", "Ions are surrounded by water molecules (hydration)"),
                        QuestionOption("c", "Water breaks into H+ and OH- exclusively"),
                        QuestionOption("d", "Salt becomes non-polar")
                    ),
                    correctOptionId = "b",
                    explanation = "Ions become hydrated in solution as water molecules surround them, allowing the salt to dissolve."
                ),
                Question(
                    id = 20574,
                    questionNumber = 15,
                    totalQuestions = 40,
                    text = "Which statement best describes cohesion in water?",
                    options = listOf(
                        QuestionOption("a", "Water molecules stick to other substances"),
                        QuestionOption("b", "Water molecules stick to each other"),
                        QuestionOption("c", "Water breaks down into ions"),
                        QuestionOption("d", "Water evaporates under all conditions")
                    ),
                    correctOptionId = "b",
                    explanation = "Cohesion is the attraction between water molecules; adhesion is the attraction to other surfaces."
                ),
                Question(
                    id = 20575,
                    questionNumber = 16,
                    totalQuestions = 40,
                    text = "Water is a universal solvent.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Water dissolves many substances, enabling biochemical reactions in living organisms."
                ),
                Question(
                    id = 20576,
                    questionNumber = 17,
                    totalQuestions = 40,
                    text = "Name two biomolecule categories that are essential for energy storage.",
                    options = emptyList(),
                    correctOptionId = "carbohydrates and lipids",
                    explanation = "Carbohydrates and lipids are primary energy storage biomolecules in living systems.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20577,
                    questionNumber = 18,
                    totalQuestions = 40,
                    text = "Name one biomolecule that is a polymer of amino acids.",
                    options = emptyList(),
                    correctOptionId = "proteins",
                    explanation = "Proteins are polymers formed by linking amino acids.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20578,
                    questionNumber = 19,
                    totalQuestions = 40,
                    text = "What is the mass of 2.0 moles of water (H2O)?",
                    options = emptyList(),
                    correctOptionId = "36.03 g",
                    explanation = "Mass = number of moles × molar mass. Molar mass of H2O is 18.015 g/mol. 2.0 mol × 18.015 g/mol = 36.03 g.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20579,
                    questionNumber = 20,
                    totalQuestions = 40,
                    text = "If 0.100 moles of glucose (C6H12O6) are dissolved in 1.00 L of solution, what is the molarity of the glucose solution?",
                    options = emptyList(),
                    correctOptionId = "0.100 M",
                    explanation = "Molarity M = n/V. n = 0.100 mol, V = 1.00 L, so M = 0.100 mol/L (0.1 M).",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20580,
                    questionNumber = 21,
                    totalQuestions = 40,
                    text = "Why is water considered a biochemical molecule?",
                    options = listOf(
                        QuestionOption("a", "A) It is the universal solvent for most biochemical reactions."),
                        QuestionOption("b", "B) It is the most abundant gas in the atmosphere."),
                        QuestionOption("c", "C) It is nonpolar and insoluble in proteins."),
                        QuestionOption("d", "D) It has no role in metabolism.")
                    ),
                    correctOptionId = "a",
                    explanation = "Water's polarity allows it to dissolve many substances and participate in hydrolysis and condensation reactions in biology."
                ),
                Question(
                    id = 20581,
                    questionNumber = 22,
                    totalQuestions = 40,
                    text = "Which property of water is most responsible for its high specific heat capacity in biological systems?",
                    options = listOf(
                        QuestionOption("a", "A) Its high boiling point"),
                        QuestionOption("b", "B) Hydrogen bonding between water molecules"),
                        QuestionOption("c", "C) Its low density as a solid"),
                        QuestionOption("d", "D) Its strong acidity of dissolved substances")
                    ),
                    correctOptionId = "b",
                    explanation = "Hydrogen bonds allow water to absorb a lot of heat before increasing in temperature, stabilizing body temperatures."
                ),
                Question(
                    id = 20582,
                    questionNumber = 23,
                    totalQuestions = 40,
                    text = "In a water molecule, which element is the central atom?",
                    options = listOf(
                        QuestionOption("a", "A) Hydrogen"),
                        QuestionOption("b", "B) Oxygen"),
                        QuestionOption("c", "C) Nitrogen"),
                        QuestionOption("d", "D) Carbon")
                    ),
                    correctOptionId = "b",
                    explanation = "Oxygen is the central atom in H2O with two hydrogen atoms bonded to it, giving the molecule a bent shape."
                ),
                Question(
                    id = 20583,
                    questionNumber = 24,
                    totalQuestions = 40,
                    text = "Which process describes water molecules sticking to other surfaces (like glass)?",
                    options = listOf(
                        QuestionOption("a", "A) Cohesion"),
                        QuestionOption("b", "B) Adhesion"),
                        QuestionOption("c", "C) Osmosis"),
                        QuestionOption("d", "D) Diffusion")
                    ),
                    correctOptionId = "b",
                    explanation = "Adhesion is water's tendency to cling to surfaces, while cohesion refers to water sticking to itself."
                ),
                Question(
                    id = 20584,
                    questionNumber = 25,
                    totalQuestions = 40,
                    text = "Which biomolecule is primarily used for long-term energy storage in animals?",
                    options = listOf(
                        QuestionOption("a", "A) Carbohydrates"),
                        QuestionOption("b", "B) Proteins"),
                        QuestionOption("c", "C) Lipids"),
                        QuestionOption("d", "D) Nucleic acids")
                    ),
                    correctOptionId = "c",
                    explanation = "Lipids store energy efficiently and can provide long-term energy reserves."
                ),
                Question(
                    id = 20585,
                    questionNumber = 26,
                    totalQuestions = 40,
                    text = "Water molecules orient around dissolved ions due to their polar nature.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Polarity causes hydration shells around ions in solution."
                ),
                Question(
                    id = 20586,
                    questionNumber = 27,
                    totalQuestions = 40,
                    text = "Explain in one sentence why water is considered a biochemical molecule.",
                    options = emptyList(),
                    correctOptionId = "Water is a biochemical molecule because of its polarity and hydrogen bonding, which enable many biochemical reactions and solvent properties.",
                    explanation = "Water’s polarity allows dissolution of substances and participation in hydrolysis/condensation reactions.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20587,
                    questionNumber = 28,
                    totalQuestions = 40,
                    text = "Name two properties of water that support life and give one biological implication for each.",
                    options = emptyList(),
                    correctOptionId = "Polarity leading to solvent capability; Hydrogen bonding leading to high surface tension/thermal stability.",
                    explanation = "Polarity enables dissolution of ions and molecules; hydrogen bonding contributes to cohesion and thermal stability.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20588,
                    questionNumber = 29,
                    totalQuestions = 40,
                    text = "A student dissolves 5.00 g of glucose (C6H12O6, molar mass = 180.16 g/mol) in water to make a final solution volume of 250.0 mL. What is the molarity (in mol/L) of the glucose in this solution? Show all steps and provide the final unit.",
                    options = emptyList(),
                    correctOptionId = "0.111 M",
                    explanation = "moles of glucose = 5.00 g / 180.16 g/mol = 0.0278 mol; volume=0.250 L; M = 0.0278 / 0.250 = 0.111 M",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20589,
                    questionNumber = 30,
                    totalQuestions = 40,
                    text = "A solution is prepared by dissolving NaCl to make 0.50 L of a 0.150 M solution. How many moles of NaCl are present? Provide the calculation and final unit (moles).",
                    options = emptyList(),
                    correctOptionId = "0.075 mol",
                    explanation = "moles = M × V = 0.150 mol/L × 0.50 L = 0.075 mol",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20590,
                    questionNumber = 31,
                    totalQuestions = 40,
                    text = "Based on Unit 3, which statement best describes water's typical properties in biology?",
                    options = listOf(
                        QuestionOption("a", "Water is a polar molecule that can dissolve many substances"),
                        QuestionOption("b", "Water is a non-polar solvent"),
                        QuestionOption("c", "Water has a low heat capacity"),
                        QuestionOption("d", "Water only exists as steam")
                    ),
                    correctOptionId = "a",
                    explanation = "Water's polarity makes it an effective solvent for many biological molecules."
                ),
                Question(
                    id = 20591,
                    questionNumber = 32,
                    totalQuestions = 40,
                    text = "Which statement explains why water is considered a biochemical molecule?",
                    options = listOf(
                        QuestionOption("a", "It participates in metabolic reactions and is essential for life"),
                        QuestionOption("b", "It is not involved in any reactions"),
                        QuestionOption("c", "It is harmless"),
                        QuestionOption("d", "It is only present as steam")
                    ),
                    correctOptionId = "a",
                    explanation = "Water acts as solvent and reactant/product in many biological processes."
                ),
                Question(
                    id = 20592,
                    questionNumber = 33,
                    totalQuestions = 40,
                    text = "In one water molecule (H2O), how many hydrogen atoms are present relative to the oxygen atom? Provide the ratio and final unit.",
                    options = emptyList(),
                    correctOptionId = "2:1 (H:O); dimensionless ratio",
                    explanation = "A water molecule consists of two hydrogen atoms bonded to one oxygen atom.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20593,
                    questionNumber = 34,
                    totalQuestions = 40,
                    text = "Which statement best explains why water has high surface tension?",
                    options = listOf(
                        QuestionOption("a", "Water molecules form hydrogen bonds with each other, creating cohesion at the surface"),
                        QuestionOption("b", "Water is very viscous"),
                        QuestionOption("c", "Water evaporates easily"),
                        QuestionOption("d", "Water has a low boiling point")
                    ),
                    correctOptionId = "a",
                    explanation = "Cohesion via hydrogen bonding leads to a high surface tension at the air-water interface."
                ),
                Question(
                    id = 20594,
                    questionNumber = 35,
                    totalQuestions = 40,
                    text = "When water dissolves a cation such as Na+, which part of the water molecule orients toward the ion?",
                    options = listOf(
                        QuestionOption("a", "The oxygen atom (negative side) points toward the cation"),
                        QuestionOption("b", "The hydrogen atoms point toward the cation"),
                        QuestionOption("c", "Water reorients randomly"),
                        QuestionOption("d", "No orientation occurs")
                    ),
                    correctOptionId = "a",
                    explanation = "Water is polar; the oxygen end (partial negative charge) faces the positively charged ion."
                ),
                Question(
                    id = 20595,
                    questionNumber = 36,
                    totalQuestions = 40,
                    text = "Water has a high boiling point relative to many small molecules due to...",
                    options = listOf(
                        QuestionOption("a", "High density"),
                        QuestionOption("b", "Hydrogen bonding between molecules (cohesion)"),
                        QuestionOption("c", "Low molecular weight"),
                        QuestionOption("d", "Water's nonpolarity")
                    ),
                    correctOptionId = "b",
                    explanation = "Hydrogen bonding between water molecules requires more energy to break, raising the boiling point."
                ),
                Question(
                    id = 20596,
                    questionNumber = 37,
                    totalQuestions = 40,
                    text = "Water is essential for life because it acts only as a solvent and never participates in chemical reactions.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "Water participates in hydrolysis and dehydration reactions, not just as a solvent."
                ),
                Question(
                    id = 20597,
                    questionNumber = 38,
                    totalQuestions = 40,
                    text = "Explain two ways water's polarity enables its role as a biological solvent.",
                    options = emptyList(),
                    correctOptionId = "Water's polarity (partial negative on O and partial positive on H) allows it to dissolve ionic compounds by forming hydration shells around ions and to dissolve polar molecules by orienting itself to separate charges; it also enables water to participate in hydrolysis reactions.",
                    explanation = "Polarity enables solvent action and participation in biochemical reactions.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20598,
                    questionNumber = 39,
                    totalQuestions = 40,
                    text = "Describe how water molecules orient around a dissolved salt ion, naming which ends interact with cations vs anions.",
                    options = emptyList(),
                    correctOptionId = "Oxygen ends (with partial negative charge) face toward cations, while hydrogen ends face toward anions.",
                    explanation = "Hydration shells form with opposite ends of water oriented toward ions according to charge.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20599,
                    questionNumber = 40,
                    totalQuestions = 40,
                    text = "If you have 5 water molecules, how many hydrogen atoms are present in total? Provide method and final unit.",
                    options = emptyList(),
                    correctOptionId = "10 hydrogen atoms (5 molecules × 2 H per molecule)",
                    explanation = "Each H2O molecule contains 2 hydrogen atoms, so 5 molecules have 5 × 2 = 10 H atoms.",
                    type = QuestionType.FILL_IN_THE_BLANK
                )
            )
        ),
        "bio_u4" to Quiz(
            id = "quiz_biology_u4_drive",
            title = "Biology — Cell Reproduction Quiz",
            subject = "Biology",
            durationMinutes = 25,
            gradeLevel = "Grade 10",
            iconName = "dna",
            unitId = "bio_u4",
            subjectId = "biology",
            questions = listOf(
                Question(
                    id = 20600,
                    questionNumber = 1,
                    totalQuestions = 40,
                    text = "According to Unit 4: Cell Reproduction, what are the main divisions of the cell cycle?",
                    options = listOf(
                        QuestionOption("a", "Interphase and M phase"),
                        QuestionOption("b", "Growth phase and Differentiation phase"),
                        QuestionOption("c", "S phase only"),
                        QuestionOption("d", "Cytokinesis only")
                    ),
                    correctOptionId = "a",
                    explanation = "The cell cycle is commonly divided into a non-dividing interphase (G1, S, G2) and the M phase (mitosis and cytokinesis)."
                ),
                Question(
                    id = 20601,
                    questionNumber = 2,
                    totalQuestions = 40,
                    text = "What is the main purpose of mitosis?",
                    options = listOf(
                        QuestionOption("a", "To produce two genetically identical diploid daughter cells"),
                        QuestionOption("b", "To replicate DNA"),
                        QuestionOption("c", "To produce gametes"),
                        QuestionOption("d", "To grow plants")
                    ),
                    correctOptionId = "a",
                    explanation = "Mitosis distributes a complete set of chromosomes to two genetically identical daughter cells, enabling growth and tissue repair."
                ),
                Question(
                    id = 20602,
                    questionNumber = 3,
                    totalQuestions = 40,
                    text = "During which phase do sister chromatids separate?",
                    options = listOf(
                        QuestionOption("a", "Prophase"),
                        QuestionOption("b", "Metaphase"),
                        QuestionOption("c", "Anaphase"),
                        QuestionOption("d", "Telophase")
                    ),
                    correctOptionId = "c",
                    explanation = "Sister chromatids separate and move to opposite poles during anaphase."
                ),
                Question(
                    id = 20603,
                    questionNumber = 4,
                    totalQuestions = 40,
                    text = "Which structure regulates the cell cycle checkpoints and makes key proteins such as cyclins?",
                    options = listOf(
                        QuestionOption("a", "Nucleus"),
                        QuestionOption("b", "Ribosomes"),
                        QuestionOption("c", "Cyclins and CDKs"),
                        QuestionOption("d", "Mitochondria")
                    ),
                    correctOptionId = "c",
                    explanation = "Cyclins and cyclin-dependent kinases (CDKs) are key regulators of cell cycle progression and checkpoints."
                ),
                Question(
                    id = 20604,
                    questionNumber = 5,
                    totalQuestions = 40,
                    text = "What is a likely outcome if the cell cycle is not properly regulated?",
                    options = listOf(
                        QuestionOption("a", "Increased differentiation"),
                        QuestionOption("b", "Cancer development due to unchecked cell division"),
                        QuestionOption("c", "No growth occurs"),
                        QuestionOption("d", "Cells immediately die")
                    ),
                    correctOptionId = "b",
                    explanation = "Loss of control can lead to uncontrolled cell division and tumor formation (cancer)."
                ),
                Question(
                    id = 20605,
                    questionNumber = 6,
                    totalQuestions = 40,
                    text = "True or False: A failure to regulate the cell cycle can contribute to cancer.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Unregulated cell cycle progression can lead to uncontrolled growth and tumor formation."
                ),
                Question(
                    id = 20606,
                    questionNumber = 7,
                    totalQuestions = 40,
                    text = "Name two differences between mitosis and meiosis.",
                    options = emptyList(),
                    correctOptionId = "Mitosis yields two genetically identical diploid daughter cells; Meiosis yields four genetically diverse haploid cells.",
                    explanation = "Mitosis maintains chromosome number and genetic similarity; meiosis halves the chromosome number and increases genetic variation through recombination.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20607,
                    questionNumber = 8,
                    totalQuestions = 40,
                    text = "Explain the relationship between chromosomes and sister chromatids during the cell cycle.",
                    options = emptyList(),
                    correctOptionId = "A chromosome is a single DNA molecule; after DNA replication, each chromosome consists of two sister chromatids that stay attached at the centromere until anaphase.",
                    explanation = "During S phase, DNA is replicated resulting in sister chromatids; separation occurs in anaphase.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20608,
                    questionNumber = 9,
                    totalQuestions = 40,
                    text = "In a cell culture, 60 cells are observed in mitosis out of 800 total cells. Calculate the mitotic index. Provide the method and final unit.",
                    options = emptyList(),
                    correctOptionId = "0.075",
                    explanation = "Mitotic index = number in mitosis / total number of cells. 60/800 = 0.075 (dimensionless).",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20609,
                    questionNumber = 10,
                    totalQuestions = 40,
                    text = "If a tissue has a cell cycle duration of 24 hours and mitosis lasts 2 hours, what percentage of cells are expected to be in mitosis at any given moment? Express your answer as a percent with two decimal places.",
                    options = emptyList(),
                    correctOptionId = "8.33%",
                    explanation = "Mitotic index ≈ M duration / total cycle duration = 2 / 24 = 0.0833 = 8.33%.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20610,
                    questionNumber = 11,
                    totalQuestions = 40,
                    text = "During the cell cycle modeling activity, which event marks the onset of mitosis?",
                    options = listOf(
                        QuestionOption("a", "Prophase: chromosomes condense and become visible"),
                        QuestionOption("b", "DNA replication occurs during metaphase"),
                        QuestionOption("c", "Cytokinesis begins after telophase"),
                        QuestionOption("d", "Interphase ends with cell growth only")
                    ),
                    correctOptionId = "a",
                    explanation = "Mitosis begins with prophase when chromosomes condense and become visible, signaling the transition from interphase to mitotic stages."
                ),
                Question(
                    id = 20611,
                    questionNumber = 12,
                    totalQuestions = 40,
                    text = "Which process produces two genetically identical daughter cells?",
                    options = listOf(
                        QuestionOption("a", "Meiosis"),
                        QuestionOption("b", "Mitosis"),
                        QuestionOption("c", "Binary fission"),
                        QuestionOption("d", "Budding")
                    ),
                    correctOptionId = "b",
                    explanation = "Mitosis is the nuclear division that produces two genetically identical somatic cells."
                ),
                Question(
                    id = 20612,
                    questionNumber = 13,
                    totalQuestions = 40,
                    text = "Which organelle is primarily responsible for organizing spindle fibers during cell division?",
                    options = listOf(
                        QuestionOption("a", "Golgi apparatus"),
                        QuestionOption("b", "Mitochondrion"),
                        QuestionOption("c", "Centrosome"),
                        QuestionOption("d", "Lysosome")
                    ),
                    correctOptionId = "c",
                    explanation = "Centrosomes organize the microtubules that form the spindle apparatus used during chromosome separation."
                ),
                Question(
                    id = 20613,
                    questionNumber = 14,
                    totalQuestions = 40,
                    text = "During the cell cycle, which phase is when the DNA is replicated?",
                    options = listOf(
                        QuestionOption("a", "G1"),
                        QuestionOption("b", "S"),
                        QuestionOption("c", "G2"),
                        QuestionOption("d", "M")
                    ),
                    correctOptionId = "b",
                    explanation = "S phase stands for synthesis, the period when DNA replication occurs before mitosis."
                ),
                Question(
                    id = 20614,
                    questionNumber = 15,
                    totalQuestions = 40,
                    text = "In a cell cycle model, if G1 lasts 9 h, S lasts 7 h, G2 lasts 4 h, and M lasts 4 h, what is the total cell cycle length in hours?",
                    options = listOf(
                        QuestionOption("a", "20 hours"),
                        QuestionOption("b", "24 hours"),
                        QuestionOption("c", "28 hours"),
                        QuestionOption("d", "32 hours")
                    ),
                    correctOptionId = "b",
                    explanation = "Total cycle length = 9 + 7 + 4 + 4 = 24 hours. Units: hours."
                ),
                Question(
                    id = 20615,
                    questionNumber = 16,
                    totalQuestions = 40,
                    text = "G1 phase of the cell cycle is primarily for cell growth and protein synthesis.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "G1 is dedicated to growth and metabolic activities, including protein synthesis."
                ),
                Question(
                    id = 20616,
                    questionNumber = 17,
                    totalQuestions = 40,
                    text = "List the four main phases of the cell cycle in order.",
                    options = emptyList(),
                    correctOptionId = "G1, S, G2, M",
                    explanation = "The standard sequence of the cell cycle phases is G1 → S → G2 → M.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20617,
                    questionNumber = 18,
                    totalQuestions = 40,
                    text = "Explain why cell size is limited and how this leads to cell division.",
                    options = emptyList(),
                    correctOptionId = "Because as cells grow, their volume increases faster than their surface area, reducing the efficiency of material exchange; to maintain effective transport and metabolism, cells divide.",
                    explanation = "A cell's surface area-to-volume ratio governs exchange with the environment. When growth reduces this ratio, division restores efficiency.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20618,
                    questionNumber = 19,
                    totalQuestions = 40,
                    text = "In metaphase of mitosis, a somatic cell has 2n=8 chromosomes. How many sister chromatids are aligned at the metaphase plate?",
                    options = emptyList(),
                    correctOptionId = "16 chromatids",
                    explanation = "Metaphase aligns all chromosomes, each consisting of two sister chromatids: 8 chromosomes × 2 = 16 chromatids.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20619,
                    questionNumber = 20,
                    totalQuestions = 40,
                    text = "In a mitotic cell with 2n=8 chromosomes, the S phase is extended from 7 hours to 14 hours due to replication stress. If the other phases durations remain G1=9 h, G2=4 h, M=4 h, what is the new total cell cycle length?",
                    options = emptyList(),
                    correctOptionId = "31 hours",
                    explanation = "New total = G1 + S (extended) + G2 + M = 9 + 14 + 4 + 4 = 31 hours.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20620,
                    questionNumber = 21,
                    totalQuestions = 40,
                    text = "What is the main purpose of mitosis in cell reproduction?",
                    options = listOf(
                        QuestionOption("a", "To reduce the chromosome number by half"),
                        QuestionOption("b", "To duplicate the cell's DNA content"),
                        QuestionOption("c", "To distribute identical copies of the genome to two daughter nuclei"),
                        QuestionOption("d", "To synthesize ribosomal RNA")
                    ),
                    correctOptionId = "c",
                    explanation = "Mitosis ensures each daughter nucleus receives an identical set of chromosomes, preserving genetic information."
                ),
                Question(
                    id = 20621,
                    questionNumber = 22,
                    totalQuestions = 40,
                    text = "Which phase of the cell cycle is primarily associated with DNA replication?",
                    options = listOf(
                        QuestionOption("a", "G1"),
                        QuestionOption("b", "S"),
                        QuestionOption("c", "G2"),
                        QuestionOption("d", "M")
                    ),
                    correctOptionId = "b",
                    explanation = "S phase is when DNA replication occurs."
                ),
                Question(
                    id = 20622,
                    questionNumber = 23,
                    totalQuestions = 40,
                    text = "During which event in mitosis do sister chromatids separate and migrate toward opposite poles?",
                    options = listOf(
                        QuestionOption("a", "Prophase"),
                        QuestionOption("b", "Metaphase"),
                        QuestionOption("c", "Anaphase"),
                        QuestionOption("d", "Telophase")
                    ),
                    correctOptionId = "c",
                    explanation = "Anaphase separates sister chromatids to opposite poles."
                ),
                Question(
                    id = 20623,
                    questionNumber = 24,
                    totalQuestions = 40,
                    text = "Which cellular structure is primarily responsible for organizing spindle fibers during animal cell mitosis?",
                    options = listOf(
                        QuestionOption("a", "Nucleolus"),
                        QuestionOption("b", "Centrosomes"),
                        QuestionOption("c", "Ribosomes"),
                        QuestionOption("d", "Golgi apparatus")
                    ),
                    correctOptionId = "b",
                    explanation = "Centrosomes organize spindle fibers; they contain a pair of centrioles in animal cells."
                ),
                Question(
                    id = 20624,
                    questionNumber = 25,
                    totalQuestions = 40,
                    text = "Which protein complex is most directly involved in advancing the cell cycle from G2 into M phase by triggering mitosis?",
                    options = listOf(
                        QuestionOption("a", "DNA polymerase"),
                        QuestionOption("b", "Cyclin-CDK complexes"),
                        QuestionOption("c", "Ribosome"),
                        QuestionOption("d", "ATP synthase")
                    ),
                    correctOptionId = "b",
                    explanation = "Cyclin-CDK complexes drive transitions into mitosis by phosphorylating key proteins."
                ),
                Question(
                    id = 20625,
                    questionNumber = 26,
                    totalQuestions = 40,
                    text = "During prophase, the nuclear envelope breaks down.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "The nuclear envelope breaks down in prophase to allow spindle–chromosome interactions."
                ),
                Question(
                    id = 20626,
                    questionNumber = 27,
                    totalQuestions = 40,
                    text = "List the six stages of mitosis in order.",
                    options = emptyList(),
                    correctOptionId = "Prophase, Prometaphase, Metaphase, Anaphase, Telophase, Cytokinesis",
                    explanation = "Mitosis progresses through these stages in sequence to divide genetic material, followed by cytokinesis for cytoplasm division.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20627,
                    questionNumber = 28,
                    totalQuestions = 40,
                    text = "Describe two potential consequences of loss of cell cycle regulation in a tissue.",
                    options = emptyList(),
                    correctOptionId = "1) Uncontrolled cell division leading to tumor formation; 2) Tissue dysfunction due to overcrowding and resource depletion.",
                    explanation = "Failing cell cycle controls can cause cancerous growth and disrupt normal tissue function due to crowding and competition for nutrients.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20628,
                    questionNumber = 29,
                    totalQuestions = 40,
                    text = "In a diploid human cell with 46 chromosomes, how many chromosomes are present in each daughter cell after mitosis? Provide the answer with units and a brief method.",
                    options = emptyList(),
                    correctOptionId = "46 chromosomes",
                    explanation = "Mitosis preserves the chromosome number; each daughter cell receives a full set of 46 chromosomes.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20629,
                    questionNumber = 30,
                    totalQuestions = 40,
                    text = "If a cell has 46 chromosomes and DNA replication occurs during S phase, how many total chromatids are present immediately after replication and just before mitosis? Provide the answer with units and a brief method.",
                    options = emptyList(),
                    correctOptionId = "92 chromatids",
                    explanation = "DNA replication doubles the chromatid count, so 46 chromosomes become 92 chromatids prior to mitosis.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20630,
                    questionNumber = 31,
                    totalQuestions = 40,
                    text = "What are the two main divisions of the cell cycle?",
                    options = listOf(
                        QuestionOption("a", "Interphase and Mitotic (M) phase"),
                        QuestionOption("b", "Prophase and Metaphase"),
                        QuestionOption("c", "Cytokinesis and Telophase"),
                        QuestionOption("d", "G1 and S phases")
                    ),
                    correctOptionId = "a",
                    explanation = "The cell cycle is commonly described as Interphase (growth and DNA replication) and the Mitotic (M) phase (cell division)."
                ),
                Question(
                    id = 20631,
                    questionNumber = 32,
                    totalQuestions = 40,
                    text = "Which organelle houses most of the cell's genetic material?",
                    options = listOf(
                        QuestionOption("a", "Mitochondrion"),
                        QuestionOption("b", "Nucleus"),
                        QuestionOption("c", "Ribosome"),
                        QuestionOption("d", "Endoplasmic Reticulum")
                    ),
                    correctOptionId = "b",
                    explanation = "DNA is organized inside the nucleus in eukaryotic cells."
                ),
                Question(
                    id = 20632,
                    questionNumber = 33,
                    totalQuestions = 40,
                    text = "DNA replication occurs during S phase of the cell cycle.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "S phase is the part of the cell cycle where DNA replication occurs before mitosis."
                ),
                Question(
                    id = 20633,
                    questionNumber = 34,
                    totalQuestions = 40,
                    text = "Which process ensures genetic material is evenly distributed into two daughter nuclei during cell division?",
                    options = listOf(
                        QuestionOption("a", "Meiosis"),
                        QuestionOption("b", "Mitosis"),
                        QuestionOption("c", "Cytokinesis"),
                        QuestionOption("d", "Apoptosis")
                    ),
                    correctOptionId = "b",
                    explanation = "Karyokinesis during mitosis distributes chromosomes into two nuclei."
                ),
                Question(
                    id = 20634,
                    questionNumber = 35,
                    totalQuestions = 40,
                    text = "Which organelle is primarily involved in energy production and is often called the powerhouse of the cell?",
                    options = listOf(
                        QuestionOption("a", "Golgi apparatus"),
                        QuestionOption("b", "Ribosome"),
                        QuestionOption("c", "Mitochondrion"),
                        QuestionOption("d", "Nucleus")
                    ),
                    correctOptionId = "c",
                    explanation = "Mitochondria generate ATP through cellular respiration."
                ),
                Question(
                    id = 20635,
                    questionNumber = 36,
                    totalQuestions = 40,
                    text = "In a hypothetical cell cycle, G1=8 h, S=6 h, G2=4 h, M=2 h. What is the total cycle duration in hours? Show steps and final unit.",
                    options = emptyList(),
                    correctOptionId = "20 h",
                    explanation = "Total cycle duration = G1 + S + G2 + M = 8 + 6 + 4 + 2 = 20 hours.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20636,
                    questionNumber = 37,
                    totalQuestions = 40,
                    text = "If the cell cycle is not properly regulated, which outcome is most likely?",
                    options = listOf(
                        QuestionOption("a", "Decreased cell production"),
                        QuestionOption("b", "Uncontrolled cell growth leading to cancer"),
                        QuestionOption("c", "Immediate cell death"),
                        QuestionOption("d", "Slower division")
                    ),
                    correctOptionId = "b",
                    explanation = "Loss of regulatory checkpoints can lead to uncontrolled proliferation, potentially forming tumors or cancer."
                ),
                Question(
                    id = 20637,
                    questionNumber = 38,
                    totalQuestions = 40,
                    text = "Explain one cellular consequence of loss of cell cycle control.",
                    options = emptyList(),
                    correctOptionId = "Uncontrolled cell division can lead to tumor formation or cancer due to accumulation of mutations.",
                    explanation = "Checkpoints prevent progression with DNA damage; without control, cells may divide despite problems.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20638,
                    questionNumber = 39,
                    totalQuestions = 40,
                    text = "In a second scenario, G1=6 h, S=10 h, G2=4 h, M=4 h. What is the total cycle duration in hours and what percent of the cycle does each phase occupy? Provide values and final unit.",
                    options = emptyList(),
                    correctOptionId = "Total cycle duration = 24 h; G1=25% (6/24), S=41.7% (10/24), G2=16.7% (4/24), M=16.7% (4/24).",
                    explanation = "Total = 6+10+4+4 = 24 hours. Percentages come from each phase duration divided by total.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20639,
                    questionNumber = 40,
                    totalQuestions = 40,
                    text = "How do cell cycle checkpoints contribute to maintaining genome integrity?",
                    options = emptyList(),
                    correctOptionId = "Checkpoints pause the cycle to allow DNA repair and ensure proper chromosome attachment; they prevent progression with damaged DNA.",
                    explanation = "Checkpoints monitor DNA integrity and spindle attachment, enabling repair before progression.",
                    type = QuestionType.FILL_IN_THE_BLANK
                )
            )
        ),
        "bio_u5" to Quiz(
            id = "quiz_biology_u5_drive",
            title = "Biology — Human Biology Quiz",
            subject = "Biology",
            durationMinutes = 25,
            gradeLevel = "Grade 10",
            iconName = "dna",
            unitId = "bio_u5",
            subjectId = "biology",
            questions = listOf(
                Question(
                    id = 20640,
                    questionNumber = 1,
                    totalQuestions = 40,
                    text = "Which statement best describes the importance of sodium ions in the human body?",
                    options = emptyList(),
                    correctOptionId = "They help regulate body fluid balance and nerve impulse transmission",
                    explanation = "Sodium ions help maintain fluid balance, blood volume, and are essential for transmission of nerve impulses and muscle contraction as described in the section on sodium ions.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20641,
                    questionNumber = 2,
                    totalQuestions = 40,
                    text = "Which statement best describes the role of potassium ions in the body?",
                    options = listOf(
                        QuestionOption("a", "They regulate bone formation"),
                        QuestionOption("b", "They maintain intracellular fluid and support nerve impulses"),
                        QuestionOption("c", "They transport oxygen in the blood"),
                        QuestionOption("d", "They are the main energy source for cells")
                    ),
                    correctOptionId = "b",
                    explanation = "Potassium is the major intracellular cation and is essential for maintaining cell potential and nerve function."
                ),
                Question(
                    id = 20642,
                    questionNumber = 3,
                    totalQuestions = 40,
                    text = "Which function is primarily associated with iron ions in the human body?",
                    options = listOf(
                        QuestionOption("a", "Oxygen transport in hemoglobin"),
                        QuestionOption("b", "Energy storage in liver"),
                        QuestionOption("c", "Structural support in bones"),
                        QuestionOption("d", "Hormone synthesis in endocrine glands")
                    ),
                    correctOptionId = "a",
                    explanation = "Iron is a key component of hemoglobin and myoglobin, enabling oxygen transport and storage."
                ),
                Question(
                    id = 20643,
                    questionNumber = 4,
                    totalQuestions = 40,
                    text = "Copper ions function as a trace element in several enzymes and in iron metabolism. Which statement best reflects this role?",
                    options = listOf(
                        QuestionOption("a", "They are the primary source of energy in cells"),
                        QuestionOption("b", "They act as cofactors for enzymes involved in iron metabolism and antioxidant defense"),
                        QuestionOption("c", "They store calcium in bone tissue"),
                        QuestionOption("d", "They regulate blood glucose directly")
                    ),
                    correctOptionId = "b",
                    explanation = "Copper is a trace element required for several enzymes, including those involved in iron metabolism (ceruloplasmin) and antioxidant enzymes."
                ),
                Question(
                    id = 20644,
                    questionNumber = 5,
                    totalQuestions = 40,
                    text = "Which of the following are common dietary sources of iodide ions and important for thyroid hormone production?",
                    options = listOf(
                        QuestionOption("a", "Iodized salt, fish, and dairy products"),
                        QuestionOption("b", "Butter, sugar, and white bread"),
                        QuestionOption("c", "Red meat only"),
                        QuestionOption("d", "Fruit juice only")
                    ),
                    correctOptionId = "a",
                    explanation = "Iodide is obtained from iodized salt, seafood, and dairy, and is essential for thyroid hormone synthesis."
                ),
                Question(
                    id = 20645,
                    questionNumber = 6,
                    totalQuestions = 40,
                    text = "Potassium ions are the major intracellular cation and are essential for nerve impulse transmission.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Potassium is the main intracellular cation and plays a key role in membrane potential and nerve impulses."
                ),
                Question(
                    id = 20646,
                    questionNumber = 7,
                    totalQuestions = 40,
                    text = "Name two physiological roles of calcium ions in the human body.",
                    options = emptyList(),
                    correctOptionId = "bone formation and muscle contraction",
                    explanation = "Calcium ions are essential for bone mineralization and muscle contraction; they also participate in blood clotting and signaling.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20647,
                    questionNumber = 8,
                    totalQuestions = 40,
                    text = "Explain one major role of chloride ions in the body and a primary dietary source.",
                    options = emptyList(),
                    correctOptionId = "role: maintains electrical neutrality and fluid balance; source: table salt (sodium chloride) in the diet",
                    explanation = "Chloride ions help maintain osmotic balance, contribute to stomach acid formation, and accompany sodium in fluid balance; primary dietary source is table salt.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20648,
                    questionNumber = 9,
                    totalQuestions = 40,
                    text = "Daily calcium requirement is 1000 mg. If a student consumes 600 mg from one meal and 350 mg from a second meal, calculate the total calcium intake and the percentage of the daily requirement met. Show the method and final unit.",
                    options = emptyList(),
                    correctOptionId = "Total intake = 950 mg; Percentage of daily requirement = 95%",
                    explanation = "Sum of intakes: 600 mg + 350 mg = 950 mg. 950/1000 = 0.95 → 95% of daily calcium requirement.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20649,
                    questionNumber = 10,
                    totalQuestions = 40,
                    text = "Daily sodium recommendation is 1500 mg. If a person consumes 3 meals with equal sodium content, how many milligrams of sodium are consumed per meal? Show the method and final unit.",
                    options = emptyList(),
                    correctOptionId = "Per meal: 500 mg",
                    explanation = "1500 mg / 3 meals = 500 mg per meal.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20650,
                    questionNumber = 11,
                    totalQuestions = 40,
                    text = "What is one key importance of sodium ions in the human body?",
                    options = listOf(
                        QuestionOption("a", "Maintain fluid balance and nerve function"),
                        QuestionOption("b", "Aid in oxygen transport"),
                        QuestionOption("c", "Support bone formation"),
                        QuestionOption("d", "Provide energy to cells")
                    ),
                    correctOptionId = "a",
                    explanation = "Sodium ions help regulate fluid balance, enable nerve impulse transmission, and support muscle function."
                ),
                Question(
                    id = 20651,
                    questionNumber = 12,
                    totalQuestions = 40,
                    text = "High sodium intake can contribute to high blood pressure.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Excess sodium can raise blood volume and pressure."
                ),
                Question(
                    id = 20652,
                    questionNumber = 13,
                    totalQuestions = 40,
                    text = "Which ion is most directly involved in maintaining proper nerve impulse transmission and muscle function?",
                    options = listOf(
                        QuestionOption("a", "Sodium ions"),
                        QuestionOption("b", "Potassium ions"),
                        QuestionOption("c", "Calcium ions"),
                        QuestionOption("d", "Chloride ions")
                    ),
                    correctOptionId = "b",
                    explanation = "Potassium ions work with sodium to regulate nerve impulses and muscle contraction."
                ),
                Question(
                    id = 20653,
                    questionNumber = 14,
                    totalQuestions = 40,
                    text = "Chloride ions are primarily obtained from which dietary source?",
                    options = listOf(
                        QuestionOption("a", "Fresh fruit"),
                        QuestionOption("b", "Salt in the diet"),
                        QuestionOption("c", "Water"),
                        QuestionOption("d", "Dairy products")
                    ),
                    correctOptionId = "b",
                    explanation = "Chloride ions come mainly from dietary salt; they help with digestion and fluid balance."
                ),
                Question(
                    id = 20654,
                    questionNumber = 15,
                    totalQuestions = 40,
                    text = "Which ion is essential for oxygen transport in blood?",
                    options = listOf(
                        QuestionOption("a", "Sodium ions"),
                        QuestionOption("b", "Potassium ions"),
                        QuestionOption("c", "Iron ions"),
                        QuestionOption("d", "Calcium ions")
                    ),
                    correctOptionId = "c",
                    explanation = "Iron in hemoglobin binds oxygen and enables transport."
                ),
                Question(
                    id = 20655,
                    questionNumber = 16,
                    totalQuestions = 40,
                    text = "Name one role of calcium ions in the human body.",
                    options = emptyList(),
                    correctOptionId = "Bone formation",
                    explanation = "Calcium ions are essential for bone and teeth structure and function.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20656,
                    questionNumber = 17,
                    totalQuestions = 40,
                    text = "Explain two roles of chloride ions in the body.",
                    options = emptyList(),
                    correctOptionId = "Digestion (as part of hydrochloric acid in the stomach) and fluid/blood volume regulation",
                    explanation = "Chloride ions help form gastric acid for digestion and assist in maintaining fluid balance and blood volume.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20657,
                    questionNumber = 18,
                    totalQuestions = 40,
                    text = "The daily sodium requirement is 1500 mg. A person consumes 600 mg at breakfast and 350 mg at lunch. How many milligrams remain to meet the daily requirement?",
                    options = emptyList(),
                    correctOptionId = "550 mg",
                    explanation = "Remaining sodium needed = 1500 mg − (600 mg + 350 mg) = 550 mg.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20658,
                    questionNumber = 19,
                    totalQuestions = 40,
                    text = "In hemoglobin, which oxidation state of iron is most commonly bound to oxygen?",
                    options = listOf(
                        QuestionOption("a", "Fe3+"),
                        QuestionOption("b", "Fe2+"),
                        QuestionOption("c", "Fe0"),
                        QuestionOption("d", "Fe4+")
                    ),
                    correctOptionId = "b",
                    explanation = "Fe2+ (ferrous) is the state that binds oxygen in hemoglobin."
                ),
                Question(
                    id = 20659,
                    questionNumber = 20,
                    totalQuestions = 40,
                    text = "Calcium daily requirement: 1000 mg. Dairy sources provide 250 mg, leafy greens 120 mg, and fortified foods 50 mg. How much more calcium is needed to reach the daily requirement?",
                    options = emptyList(),
                    correctOptionId = "580 mg",
                    explanation = "Remaining = 1000 mg − (250 mg + 120 mg + 50 mg) = 580 mg.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20660,
                    questionNumber = 21,
                    totalQuestions = 40,
                    text = "What is a primary role of sodium ions in the human body?",
                    options = listOf(
                        QuestionOption("a", "They help transmit nerve impulses"),
                        QuestionOption("b", "They store oxygen in blood"),
                        QuestionOption("c", "They form bone tissue"),
                        QuestionOption("d", "They generate body heat")
                    ),
                    correctOptionId = "a",
                    explanation = "Sodium ions are essential for nerve impulse transmission and maintaining fluid balance. They depolarize nerve membranes to propagate electrical signals."
                ),
                Question(
                    id = 20661,
                    questionNumber = 22,
                    totalQuestions = 40,
                    text = "Which statement best describes the role and source of chloride ions in the body?",
                    options = listOf(
                        QuestionOption("a", "They help form hydrochloric acid in the stomach and help maintain fluid balance; sources include table salt"),
                        QuestionOption("b", "They store energy in adipose tissue; sources are carbohydrates"),
                        QuestionOption("c", "They transport oxygen in blood; sources are meat and dairy"),
                        QuestionOption("d", "They are the primary source of energy; sources are sugars")
                    ),
                    correctOptionId = "a",
                    explanation = "Chloride ions help form hydrochloric acid in the stomach and contribute to fluid and acid-base balance; common dietary source is NaCl (table salt)."
                ),
                Question(
                    id = 20662,
                    questionNumber = 23,
                    totalQuestions = 40,
                    text = "Which function is most closely associated with potassium ions in the body?",
                    options = listOf(
                        QuestionOption("a", "Nerve impulses and muscle function"),
                        QuestionOption("b", "Bone mineralization"),
                        QuestionOption("c", "Oxygen transport"),
                        QuestionOption("d", "Hormone production")
                    ),
                    correctOptionId = "a",
                    explanation = "Potassium ions help regulate nerve signals and muscle contractions, including heart muscle. They help maintain electrochemical gradients."
                ),
                Question(
                    id = 20663,
                    questionNumber = 24,
                    totalQuestions = 40,
                    text = "Which is a common dietary source of iodide ions and why are they needed?",
                    options = listOf(
                        QuestionOption("a", "Iodized salt; for thyroid hormone synthesis"),
                        QuestionOption("b", "Milk; for lactose digestion"),
                        QuestionOption("c", "Leafy greens; to store oxygen"),
                        QuestionOption("d", "Meat; for vitamin C synthesis")
                    ),
                    correctOptionId = "a",
                    explanation = "Iodide is required for thyroid hormones. Iodized salt is a common dietary source to prevent deficiency."
                ),
                Question(
                    id = 20664,
                    questionNumber = 25,
                    totalQuestions = 40,
                    text = "Iron ions are a key component of which molecules in the blood?",
                    options = listOf(
                        QuestionOption("a", "Hemoglobin and myoglobin"),
                        QuestionOption("b", "Cartilage matrix"),
                        QuestionOption("c", "Cholesterol"),
                        QuestionOption("d", "Glucose transporters")
                    ),
                    correctOptionId = "a",
                    explanation = "Iron ions are central to hemoglobin in red blood cells and myoglobin in muscle tissue, aiding oxygen transport and storage."
                ),
                Question(
                    id = 20665,
                    questionNumber = 26,
                    totalQuestions = 40,
                    text = "State two key roles of calcium ions in the human body.",
                    options = emptyList(),
                    correctOptionId = "Calcium is needed for bone and teeth formation; it is essential for blood clotting and muscle function",
                    explanation = "Calcium ions support bone/teeth structure and participate in blood clotting and muscle contraction.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20666,
                    questionNumber = 27,
                    totalQuestions = 40,
                    text = "High sodium intake can lead to increased blood pressure.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Excess sodium intake is associated with higher risk of elevated blood pressure and hypertension."
                ),
                Question(
                    id = 20667,
                    questionNumber = 28,
                    totalQuestions = 40,
                    text = "Name one primary function of chloride ions in the body.",
                    options = emptyList(),
                    correctOptionId = "Chloride ions help form hydrochloric acid in the stomach and help maintain fluid and acid-base balance.",
                    explanation = "Chloride ions participate in digestion (forming stomach acid) and help regulate fluid balance and pH.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20668,
                    questionNumber = 29,
                    totalQuestions = 40,
                    text = "Daily iron requirement for an adult is 18 mg. If a meal provides 7 mg of iron, how many additional mg are needed to reach the daily requirement? Show your method and final unit.",
                    options = emptyList(),
                    correctOptionId = "11 mg",
                    explanation = "18 mg required minus 7 mg obtained equals 11 mg remaining.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20669,
                    questionNumber = 30,
                    totalQuestions = 40,
                    text = "Daily copper requirement is 0.9 mg. If a person consumes 0.45 mg per day, calculate the daily deficit and express the result in mg. Show your method and final unit.",
                    options = emptyList(),
                    correctOptionId = "0.45 mg",
                    explanation = "0.9 mg required minus 0.45 mg intake equals 0.45 mg deficit.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20670,
                    questionNumber = 31,
                    totalQuestions = 40,
                    text = "Which statement best describes the role of sodium (Na+) ions in the human body as discussed in Unit 3: Biochemical Molecules?",
                    options = listOf(
                        QuestionOption("a", "They are primarily responsible for oxygen transport in blood."),
                        QuestionOption("b", "They help regulate fluid balance and nerve impulse transmission."),
                        QuestionOption("c", "They store energy in the form of ATP."),
                        QuestionOption("d", "They catalyze digestion of proteins in the stomach.")
                    ),
                    correctOptionId = "b",
                    explanation = "Sodium ions help maintain extracellular fluid volume and osmotic balance; they also participate in generating nerve impulses and muscle action potentials."
                ),
                Question(
                    id = 20671,
                    questionNumber = 32,
                    totalQuestions = 40,
                    text = "Which function is associated with chloride ions (Cl−) in the human body as described in Unit 3?",
                    options = listOf(
                        QuestionOption("a", "Chloride ions primarily store genetic information."),
                        QuestionOption("b", "Chloride ions help regulate acid-base balance and fluid balance in body fluids."),
                        QuestionOption("c", "Chloride ions act as the main energy currency of cells."),
                        QuestionOption("d", "Chloride ions form the backbone of the body's carbohydrate stores.")
                    ),
                    correctOptionId = "b",
                    explanation = "Chloride ions contribute to maintaining osmotic balance and pH in body fluids and are components of gastric acid (HCl) in digestion."
                ),
                Question(
                    id = 20672,
                    questionNumber = 33,
                    totalQuestions = 40,
                    text = "What is the primary biological role of iron ions (Fe2+/Fe3+) in humans as described in Unit 3?",
                    options = listOf(
                        QuestionOption("a", "They are the main component of collagen in connective tissue."),
                        QuestionOption("b", "They are essential for oxygen transport in hemoglobin and myoglobin."),
                        QuestionOption("c", "They store genetic information in cells."),
                        QuestionOption("d", "They regulate blood glucose by insulin.")
                    ),
                    correctOptionId = "b",
                    explanation = "Iron ions are crucial for binding oxygen in hemoglobin and myoglobin, enabling oxygen transport and storage in muscles; iron is also a cofactor for many enzymes."
                ),
                Question(
                    id = 20673,
                    questionNumber = 34,
                    totalQuestions = 40,
                    text = "Which of the following is a key role of potassium ions (K+) in human physiology as described in Unit 3?",
                    options = listOf(
                        QuestionOption("a", "They are the primary source of energy for cells."),
                        QuestionOption("b", "They regulate muscle and nerve function by maintaining resting potential and fluid balance."),
                        QuestionOption("c", "They form the structural framework of bones."),
                        QuestionOption("d", "They are the main component of gastric acid.")
                    ),
                    correctOptionId = "b",
                    explanation = "Potassium ions are crucial for repolarization during nerve impulses and help maintain cellular resting potential and intracellular fluid balance."
                ),
                Question(
                    id = 20674,
                    questionNumber = 35,
                    totalQuestions = 40,
                    text = "Which role is commonly attributed to calcium ions (Ca2+) in the human body as per Unit 3 discussions?",
                    options = listOf(
                        QuestionOption("a", "They transport oxygen in the blood."),
                        QuestionOption("b", "They enable muscle contraction and bone health; also play a role in blood clotting."),
                        QuestionOption("c", "They store fat in adipose tissue."),
                        QuestionOption("d", "They encode genetic information.")
                    ),
                    correctOptionId = "b",
                    explanation = "Calcium ions are essential for muscle contraction, bone mineralization, and blood clotting processes; they also act as a second messenger in many pathways."
                ),
                Question(
                    id = 20675,
                    questionNumber = 36,
                    totalQuestions = 40,
                    text = "Which statement best reflects the role and requirement of iodide ions (I−) in humans as described in Unit 3?",
                    options = listOf(
                        QuestionOption("a", "Iodide ions are primarily used to store energy."),
                        QuestionOption("b", "Iodide ions are essential for thyroid hormone synthesis and metabolism; maintaining dietary iodine is important."),
                        QuestionOption("c", "Iodide ions are the main component of bone mineral."),
                        QuestionOption("d", "Iodide ions are a primary neurotransmitter in synaptic signaling.")
                    ),
                    correctOptionId = "b",
                    explanation = "Iodide is required for thyroid hormone production (T3/T4). Adequate iodine intake is important for normal thyroid function and metabolism."
                ),
                Question(
                    id = 20676,
                    questionNumber = 37,
                    totalQuestions = 40,
                    text = "Hydrogen ions (H+) influence the pH of body fluids, which affects enzyme activity and metabolism.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Hydrogen ion concentration determines pH; small changes can significantly affect enzyme structure and function."
                ),
                Question(
                    id = 20677,
                    questionNumber = 38,
                    totalQuestions = 40,
                    text = "Briefly describe two essential roles of potassium ions in human physiology.",
                    options = emptyList(),
                    correctOptionId = "Two essential roles: (1) maintaining resting membrane potential and aiding nerve impulse transmission; (2) regulating muscle contractions and fluid balance inside cells.",
                    explanation = "Potassium ions are critical for neuronal signaling and muscular function, including heart muscle activity and intracellular osmotic balance.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20678,
                    questionNumber = 39,
                    totalQuestions = 40,
                    text = "Calculate the number of moles of calcium ions (Ca2+) in 0.5 liters of blood plasma if the Ca2+ concentration is 1.25 millimoles per liter (mM). Show your method and final unit.",
                    options = emptyList(),
                    correctOptionId = "6.25e-4 mol; method: multiply concentration by volume: 1.25e-3 mol/L * 0.5 L = 6.25e-4 mol; final unit: mol.",
                    explanation = "Concentration (C) in mol/L times volume (V) in L gives moles (n). 1.25 mM = 1.25e-3 mol/L; V=0.5 L; n=6.25e-4 mol.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20679,
                    questionNumber = 40,
                    totalQuestions = 40,
                    text = "A person consumes 3500 mg of sodium daily. The recommended daily intake is 1500 mg. Calculate the percentage of the recommended intake that this amount represents and state the reason for any excess.",
                    options = emptyList(),
                    correctOptionId = "233.3% of the recommended daily intake; method: (3500/1500)*100 = 233.3%; excess due to higher intake than recommended.",
                    explanation = "3500 mg is about 2.33 times the 1500 mg daily recommendation; excess sodium intake can be associated with health risks if sustained.",
                    type = QuestionType.FILL_IN_THE_BLANK
                )
            )
        ),
        "bio_u6" to Quiz(
            id = "quiz_biology_u6_drive",
            title = "Biology — Ecological Interactions Quiz",
            subject = "Biology",
            durationMinutes = 25,
            gradeLevel = "Grade 10",
            iconName = "dna",
            unitId = "bio_u6",
            subjectId = "biology",
            questions = listOf(
                Question(
                    id = 20680,
                    questionNumber = 1,
                    totalQuestions = 40,
                    text = "Which is the ultimate source of energy for most organisms in ecosystems?",
                    options = listOf(
                        QuestionOption("a", "The Sun"),
                        QuestionOption("b", "Earth's internal heat"),
                        QuestionOption("c", "Geothermal energy"),
                        QuestionOption("d", "Soil nutrients")
                    ),
                    correctOptionId = "a",
                    explanation = "Producers use sunlight to drive photosynthesis, forming the base of most food chains; energy then flows through the ecosystem."
                ),
                Question(
                    id = 20681,
                    questionNumber = 2,
                    totalQuestions = 40,
                    text = "Which statement best describes energy flow during nutrient recycling in ecosystems?",
                    options = listOf(
                        QuestionOption("a", "Energy is recycled and reused at each trophic step"),
                        QuestionOption("b", "Energy flows in one direction and is lost as heat, while nutrients cycle"),
                        QuestionOption("c", "Energy is created by decomposers to support recycling"),
                        QuestionOption("d", "All energy is stored permanently in biomass")
                    ),
                    correctOptionId = "b",
                    explanation = "Matter cycles (nutrients) while energy is dissipated as heat and cannot be recycled; it continues to move through the system."
                ),
                Question(
                    id = 20682,
                    questionNumber = 3,
                    totalQuestions = 40,
                    text = "In the simple food chain grass → rabbit → fox, which statement best describes energy flow?",
                    options = listOf(
                        QuestionOption("a", "Energy moves from fox to rabbit to grass"),
                        QuestionOption("b", "Energy flows from grass to rabbit to fox"),
                        QuestionOption("c", "Energy is created at each step"),
                        QuestionOption("d", "Energy recycles back to producers")
                    ),
                    correctOptionId = "b",
                    explanation = "Energy enters as sunlight captured by producers, then passes to consumers; it generally moves in one direction through the chain."
                ),
                Question(
                    id = 20683,
                    questionNumber = 4,
                    totalQuestions = 40,
                    text = "What happens to most energy when moving from one trophic level to the next?",
                    options = listOf(
                        QuestionOption("a", "It is stored as chemical energy in biomass"),
                        QuestionOption("b", "It is lost as heat and used for life processes"),
                        QuestionOption("c", "It disappears"),
                        QuestionOption("d", "It increases in quantity")
                    ),
                    correctOptionId = "b",
                    explanation = "Energy transfer is inefficient; most energy is dissipated as heat and used for metabolism, not carried forward."
                ),
                Question(
                    id = 20684,
                    questionNumber = 5,
                    totalQuestions = 40,
                    text = "Is the flow of energy through ecosystems strictly unidirectional?",
                    options = listOf(
                        QuestionOption("a", "Yes, always"),
                        QuestionOption("b", "No, energy cycles completely"),
                        QuestionOption("c", "It is largely unidirectional but some energy is recycled locally within food webs"),
                        QuestionOption("d", "Energy flows only within producers")
                    ),
                    correctOptionId = "c",
                    explanation = "Energy mostly moves from producers to consumers, but detrital pathways and local recycling mean some energy temporarily cycles."
                ),
                Question(
                    id = 20685,
                    questionNumber = 6,
                    totalQuestions = 40,
                    text = "In a simplified energy flow model, producers capture 10,000 kJ/m^2/year. If the transfer efficiency between trophic levels is 10%, calculate the energy available at the primary consumer (herbivore), secondary consumer (first carnivore), and tertiary consumer (second carnivore) per square meter per year. Show your method and final units.",
                    options = emptyList(),
                    correctOptionId = "Primary: 1000 kJ/m^2/year; Secondary: 100 kJ/m^2/year; Tertiary: 10 kJ/m^2/year",
                    explanation = "Energy at each step = 0.10 × energy at previous level. 10,000 -> 1,000 -> 100 -> 10 (kJ/m^2/year).",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20686,
                    questionNumber = 7,
                    totalQuestions = 40,
                    text = "Define trophic level in one or two sentences.",
                    options = emptyList(),
                    correctOptionId = "A trophic level is a position an organism occupies in a food chain based on its main energy source and feeding role (e.g., producers, primary consumers, secondary consumers).",
                    explanation = "Trophic levels categorize organisms by who they eat and who eats them, shaping energy flow.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20687,
                    questionNumber = 8,
                    totalQuestions = 40,
                    text = "True or False: An organism can belong to more than one trophic level depending on its diet.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Many organisms, like omnivores, feed at multiple trophic levels."
                ),
                Question(
                    id = 20688,
                    questionNumber = 9,
                    totalQuestions = 40,
                    text = "Explain the role of decomposers in the flow of energy in ecosystems.",
                    options = emptyList(),
                    correctOptionId = "Decomposers break down detritus, recycle nutrients, and release energy as heat; they connect dead organic matter back into the ecosystem, enabling producers to re-enter the cycle.",
                    explanation = "Decomposers are essential for nutrient recycling and maintaining energy flow through detrital pathways.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20689,
                    questionNumber = 10,
                    totalQuestions = 40,
                    text = "Using the same 24,000 kJ/m^2/year producer energy and 15% transfer efficiency between levels as in Q006, calculate the energy at primary, secondary, and tertiary levels (in kJ/m^2/year). Show your method and final units.",
                    options = emptyList(),
                    correctOptionId = "Primary: 3600 kJ/m^2/year; Secondary: 540 kJ/m^2/year; Tertiary: 81 kJ/m^2/year",
                    explanation = "Energy at each step = 0.15 × energy at previous level: 24,000 -> 3,600 -> 540 -> 81 (kJ/m^2/year).",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20690,
                    questionNumber = 11,
                    totalQuestions = 40,
                    text = "Based on Figure 6.1 Schematic illustrations of the food chain and food web, which statement best describes a food chain?",
                    options = listOf(
                        QuestionOption("a", "A) A linear sequence showing who eats whom"),
                        QuestionOption("b", "B) A network of overlapping feeding relationships"),
                        QuestionOption("c", "C) A diagram of nutrient cycling"),
                        QuestionOption("d", "D) A model of energy production by producers")
                    ),
                    correctOptionId = "a",
                    explanation = "A food chain shows a straight-line sequence of who eats whom; a food web shows multiple, interconnected feeding relationships."
                ),
                Question(
                    id = 20691,
                    questionNumber = 12,
                    totalQuestions = 40,
                    text = "In a food chain, which trophic level is represented by the primary consumer?",
                    options = listOf(
                        QuestionOption("a", "A) Producers"),
                        QuestionOption("b", "B) Primary consumers"),
                        QuestionOption("c", "C) Secondary consumers"),
                        QuestionOption("d", "D) Decomposers")
                    ),
                    correctOptionId = "b",
                    explanation = "Primary consumers are herbivores that feed on producers."
                ),
                Question(
                    id = 20692,
                    questionNumber = 13,
                    totalQuestions = 40,
                    text = "What happens to energy as it moves from a producer to a primary consumer?",
                    options = listOf(
                        QuestionOption("a", "A) It is created anew"),
                        QuestionOption("b", "B) It is destroyed"),
                        QuestionOption("c", "C) It is transferred, with some energy lost as heat"),
                        QuestionOption("d", "D) It increases")
                    ),
                    correctOptionId = "c",
                    explanation = "Energy is transferred between trophic levels, but much is lost as heat during metabolism and other processes."
                ),
                Question(
                    id = 20693,
                    questionNumber = 14,
                    totalQuestions = 40,
                    text = "Which trophic level is a secondary consumer?",
                    options = listOf(
                        QuestionOption("a", "A) Producer"),
                        QuestionOption("b", "B) Primary consumer"),
                        QuestionOption("c", "C) Secondary consumer"),
                        QuestionOption("d", "D) Decomposer")
                    ),
                    correctOptionId = "c",
                    explanation = "Secondary consumers are the organisms that eat primary consumers."
                ),
                Question(
                    id = 20694,
                    questionNumber = 15,
                    totalQuestions = 40,
                    text = "Which statement about energy flow in ecosystems is correct?",
                    options = listOf(
                        QuestionOption("a", "A) Energy flows in a cycle and is reused"),
                        QuestionOption("b", "B) Energy is recycled at every trophic level"),
                        QuestionOption("c", "C) Energy flows unidirectionally and is largely lost as heat"),
                        QuestionOption("d", "D) Energy is produced by consumers at each level")
                    ),
                    correctOptionId = "c",
                    explanation = "Energy flow is unidirectional through the trophic levels and much of it is lost as heat; matter can cycle."
                ),
                Question(
                    id = 20695,
                    questionNumber = 16,
                    totalQuestions = 40,
                    text = "List one key difference between energy flow and matter cycling in ecosystems.",
                    options = emptyList(),
                    correctOptionId = "Energy flows in one direction and is lost as heat; matter cycles within the ecosystem.",
                    explanation = "Energy moves through the ecosystem and is typically lost as heat at each transfer; matter (nutrients) is recycled through cycles such as carbon, nitrogen, and water cycles.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20696,
                    questionNumber = 17,
                    totalQuestions = 40,
                    text = "Explain why the energy transferred to the next trophic level is less than the energy at the previous level.",
                    options = emptyList(),
                    correctOptionId = "Energy is used for metabolism, growth, and daily activities; only a portion is assimilated by the next level, the rest is lost as heat or uneaten.",
                    explanation = "Energy transfers are inefficient; metabolic costs and heat losses mean less energy is available to the next trophic level.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20697,
                    questionNumber = 18,
                    totalQuestions = 40,
                    text = "In a hypothetical ecosystem, producers capture 2000 kJ/m^2/day of solar energy. If energy transfer from producers to primary consumers is 10%, how much energy is available to the primary consumer per square meter per day? Provide the value with units and show your method.",
                    options = emptyList(),
                    correctOptionId = "200 kJ/m^2/day",
                    explanation = "Energy to the primary consumer = 2000 kJ/m^2/day × 0.10 = 200 kJ/m^2/day. Final unit: kJ/m^2/day.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20698,
                    questionNumber = 19,
                    totalQuestions = 40,
                    text = "In a simplified ecosystem, producers store 5000 kJ/m^2/day. If energy transfer to the primary consumer is 10% and from the primary to the secondary consumer is 10% of the energy at the previous level, how much energy is available to the secondary consumer per m^2 per day? Show all steps and give the final unit.",
                    options = emptyList(),
                    correctOptionId = "50 kJ/m^2/day",
                    explanation = "Primary energy = 5000 × 0.10 = 500 kJ/m^2/day. Secondary energy = 500 × 0.10 = 50 kJ/m^2/day.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20699,
                    questionNumber = 20,
                    totalQuestions = 40,
                    text = "Field observations of ecological interactions show that energy flow in ecosystems is strictly linear with no energy losses.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "Energy flows from producers to consumers and is largely lost as heat at each transfer; it is not strictly linear with no losses."
                ),
                Question(
                    id = 20700,
                    questionNumber = 21,
                    totalQuestions = 40,
                    text = "What is a trophic level?",
                    options = listOf(
                        QuestionOption("a", "A) The position an organism occupies in a food chain"),
                        QuestionOption("b", "B) The energy the organism stores"),
                        QuestionOption("c", "C) The habitat in which the organism lives"),
                        QuestionOption("d", "D) The organism's reproductive rate")
                    ),
                    correctOptionId = "a",
                    explanation = "A trophic level is the position an organism occupies in the transfer of energy through feeding relationships."
                ),
                Question(
                    id = 20701,
                    questionNumber = 22,
                    totalQuestions = 40,
                    text = "Energy flow in a food chain typically moves",
                    options = listOf(
                        QuestionOption("a", "A) from producers to consumers"),
                        QuestionOption("b", "B) from consumers to producers"),
                        QuestionOption("c", "C) in one direction from producers to higher-level consumers"),
                        QuestionOption("d", "D) cyclically between organisms")
                    ),
                    correctOptionId = "c",
                    explanation = "Energy flows from producers through successive consumers in a single direction; it is not recycled."
                ),
                Question(
                    id = 20702,
                    questionNumber = 23,
                    totalQuestions = 40,
                    text = "Is it the unidirectional flow of energy that is commonly observed in an ecosystem?",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "a",
                    explanation = "Energy generally flows in one direction from producers to higher trophic levels; it is not recycled in ecosystems."
                ),
                Question(
                    id = 20703,
                    questionNumber = 24,
                    totalQuestions = 40,
                    text = "What happens to most of the energy as it moves from one trophic level to the next?",
                    options = listOf(
                        QuestionOption("a", "A) It is stored in biomass with 90% efficiency"),
                        QuestionOption("b", "B) It is transmitted as heat and only about 10% is transferred"),
                        QuestionOption("c", "C) It disappears completely"),
                        QuestionOption("d", "D) It is recycled back to producers")
                    ),
                    correctOptionId = "b",
                    explanation = "About 90% is lost as heat and used in metabolism; roughly 10% is transferred to the next trophic level."
                ),
                Question(
                    id = 20704,
                    questionNumber = 25,
                    totalQuestions = 40,
                    text = "Which statement best describes energy flow during nutrient recycling in an ecosystem?",
                    options = listOf(
                        QuestionOption("a", "A) Energy is recycled within producers"),
                        QuestionOption("b", "B) Energy is continually reused by decomposers"),
                        QuestionOption("c", "C) Energy flows in one direction and is not recycled"),
                        QuestionOption("d", "D) Energy is created anew by sunlight")
                    ),
                    correctOptionId = "c",
                    explanation = "Energy flows in one direction through the ecosystem and is not recycled; matter is recycled."
                ),
                Question(
                    id = 20705,
                    questionNumber = 26,
                    totalQuestions = 40,
                    text = "Explain the difference between a trophic level and a feeding level, and provide one example.",
                    options = emptyList(),
                    correctOptionId = "A trophic level is the position of an organism in the energy transfer sequence in a food chain (example: producers are the first trophic level). A feeding level is a general description of where an organism feeds; trophic level specifies energy transfer in the chain.",
                    explanation = "Trophic level denotes energy transfer position; feeding level is a functional feeding role. Example: Producers = first trophic level.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20706,
                    questionNumber = 27,
                    totalQuestions = 40,
                    text = "If a producer captures 12,000 kJ of energy from the sun, and only 10% is transferred to the first consumer, how many kJ are available to the primary consumer? Show your calculation and final unit.",
                    options = emptyList(),
                    correctOptionId = "1,200 kJ",
                    explanation = "Energy transfer between trophic levels is about 10%, so 12,000 kJ × 0.10 = 1,200 kJ.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20707,
                    questionNumber = 28,
                    totalQuestions = 40,
                    text = "In a simple food chain, producers receive 50,000 kJ of energy from the sun. If 10% is transferred to the primary consumer and another 10% to the secondary, how much energy is available to the tertiary consumer? Show calculations and final unit.",
                    options = emptyList(),
                    correctOptionId = "50 kJ",
                    explanation = "Apply 10% rule at each transfer: 50,000 × 0.10 = 5,000 to primary; 5,000 × 0.10 = 500 to secondary; 500 × 0.10 = 50 to tertiary.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20708,
                    questionNumber = 29,
                    totalQuestions = 40,
                    text = "What is the ultimate source of energy in life? How is energy transferred from organism to organism?",
                    options = listOf(
                        QuestionOption("a", "A) Water"),
                        QuestionOption("b", "B) The Sun"),
                        QuestionOption("c", "C) Soil nutrients"),
                        QuestionOption("d", "D) Chemoautotrophic bacteria")
                    ),
                    correctOptionId = "b",
                    explanation = "Sunlight captured by producers provides the energy that moves through the food chain."
                ),
                Question(
                    id = 20709,
                    questionNumber = 30,
                    totalQuestions = 40,
                    text = "Explain why energy transfer between trophic levels is inefficient and name two ecological consequences.",
                    options = emptyList(),
                    correctOptionId = "Energy transfer is inefficient because only about 10% of energy is passed to the next trophic level, the rest is lost as heat and used in metabolism; consequences include biomass decline at higher levels and limitation on the number of trophic levels.",
                    explanation = "The 10% rule explains energy loss; biomass decreases at higher trophic levels; ecosystems rely on large energy input at base.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20710,
                    questionNumber = 31,
                    totalQuestions = 40,
                    text = "In a simple ecosystem, which organism most accurately represents the first trophic level?",
                    options = listOf(
                        QuestionOption("a", "A decomposer"),
                        QuestionOption("b", "A producer"),
                        QuestionOption("c", "A primary consumer"),
                        QuestionOption("d", "A secondary consumer")
                    ),
                    correctOptionId = "b",
                    explanation = "Producers form the base of the food chain and occupy the first trophic level."
                ),
                Question(
                    id = 20711,
                    questionNumber = 32,
                    totalQuestions = 40,
                    text = "Which statement about energy flow in ecosystems is generally true?",
                    options = listOf(
                        QuestionOption("a", "Energy cycles within the same ecosystem."),
                        QuestionOption("b", "Energy flows in one direction from producers to higher trophic levels."),
                        QuestionOption("c", "Energy is created at higher trophic levels."),
                        QuestionOption("d", "Energy is lost only at the end of a food chain.")
                    ),
                    correctOptionId = "b",
                    explanation = "Energy enters as sunlight and flows through organisms, with most energy lost as heat at each transfer."
                ),
                Question(
                    id = 20712,
                    questionNumber = 33,
                    totalQuestions = 40,
                    text = "Which of the following best describes a food chain?",
                    options = listOf(
                        QuestionOption("a", "A single path of energy transfer stretching from producers to top-level consumers."),
                        QuestionOption("b", "All possible feeding relationships in an ecosystem."),
                        QuestionOption("c", "A diagram showing energy recycling."),
                        QuestionOption("d", "A representation of only decomposer interactions.")
                    ),
                    correctOptionId = "a",
                    explanation = "A food chain is a linear sequence illustrating energy transfer from producers to higher levels; a food web shows multiple connections."
                ),
                Question(
                    id = 20713,
                    questionNumber = 34,
                    totalQuestions = 40,
                    text = "Approximately what percentage of energy is transferred from one trophic level to the next in most ecosystems?",
                    options = listOf(
                        QuestionOption("a", "1-2%"),
                        QuestionOption("b", "10%"),
                        QuestionOption("c", "50%"),
                        QuestionOption("d", "90%")
                    ),
                    correctOptionId = "b",
                    explanation = "On average about 10% of the energy at one level is passed to the next; the rest is lost as heat and metabolic processes."
                ),
                Question(
                    id = 20714,
                    questionNumber = 35,
                    totalQuestions = 40,
                    text = "What is the primary difference between a food chain and a food web?",
                    options = listOf(
                        QuestionOption("a", "A food chain shows many possible feeding relationships; a food web shows a single path."),
                        QuestionOption("b", "A food chain shows a single linear path; a food web shows multiple interconnected paths."),
                        QuestionOption("c", "A food chain recycles energy; a food web does not."),
                        QuestionOption("d", "A food chain includes only producers.")
                    ),
                    correctOptionId = "b",
                    explanation = "Food webs represent many feeding relationships; a chain is a simplified, linear sequence of feeding relations."
                ),
                Question(
                    id = 20715,
                    questionNumber = 36,
                    totalQuestions = 40,
                    text = "In a two-trophic-level system, if producers receive 7000 kJ/m^2/year of energy and 10% is transferred to primary consumers, how much energy is available to the primary consumer per year? Show calculation and final units.",
                    options = emptyList(),
                    correctOptionId = "700 kJ/m^2/year",
                    explanation = "Energy to Primary Consumer = 0.10 × 7000 kJ/m^2/year = 700 kJ/m^2/year.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20716,
                    questionNumber = 37,
                    totalQuestions = 40,
                    text = "In a four-level food chain with energy transfer efficiency of 10% per level, if producers have 50,000 kJ/m^2/year, compute energy at each level: producers, primary consumer, secondary consumer, and tertiary consumer. Provide step-by-step and final unit.",
                    options = emptyList(),
                    correctOptionId = "Producer: 50,000 kJ/m^2/year; Primary: 5,000 kJ/m^2/year; Secondary: 500 kJ/m^2/year; Tertiary: 50 kJ/m^2/year",
                    explanation = "Each level is 10% of the previous: 50,000 → 5,000 → 500 → 50 kJ/m^2/year.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20717,
                    questionNumber = 38,
                    totalQuestions = 40,
                    text = "Briefly describe the ultimate source of energy in life and how energy is transferred from one organism to another in an ecosystem.",
                    options = emptyList(),
                    correctOptionId = "The sun is the ultimate energy source; energy is transferred through producers to consumers via feeding relationships, with energy lost as heat at each transfer.",
                    explanation = "Energy enters ecosystems as solar radiation, is captured by producers (photosynthesis), and is passed along food chains/webs with substantial losses as heat.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20718,
                    questionNumber = 39,
                    totalQuestions = 40,
                    text = "Define a producer and give one terrestrial example.",
                    options = emptyList(),
                    correctOptionId = "A producer is an organism that makes its own food using photosynthesis; example: grass.",
                    explanation = "Producers form the base of the food chain by converting solar energy into chemical energy.",
                    type = QuestionType.FILL_IN_THE_BLANK
                ),
                Question(
                    id = 20719,
                    questionNumber = 40,
                    totalQuestions = 40,
                    text = "Energy is recycled and reused within an ecosystem.",
                    options = listOf(
                        QuestionOption("a", "True"),
                        QuestionOption("b", "False")
                    ),
                    correctOptionId = "b",
                    explanation = "Energy flows through ecosystems in one direction and is lost as heat at each transfer; it is not recycled."
                )
            )
        )
    )
}
