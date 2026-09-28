package com.areka.app.data.repository

import com.areka.app.data.model.Flashcard

/**
 * High-quality Grade 10 Ethiopian New Curriculum Flashcards (Part 2).
 * Chemistry (6 units) & Biology (6 units) - 7 to 8 cards per unit.
 */
object CurriculumFlashcardsPart2 {

    val cards: List<Flashcard> = listOf(
        // ==========================================
        // 3. CHEMISTRY (chemistry) — 6 units
        // ==========================================
        // Unit 1: Chemical Reactions and Stoichiometry
        Flashcard("fc_c1_1", "chemistry", "chem_u1", "The Mole Concept", "The SI unit for amount of substance; one mole contains exactly 6.022 × 10²³ elementary entities (Avogadro's number)."),
        Flashcard("fc_c1_2", "chemistry", "chem_u1", "Molar Mass", "The mass of one mole of a substance expressed in grams per mole (g/mol), numerically equal to relative atomic/molecular mass."),
        Flashcard("fc_c1_3", "chemistry", "chem_u1", "Limiting Reactant", "The reactant consumed completely first in a chemical reaction, which caps the maximum theoretical yield of product."),
        Flashcard("fc_c1_4", "chemistry", "chem_u1", "Theoretical vs Actual Yield", "Theoretical yield is the calculated maximum product mass; actual yield is the measured experimental output."),
        Flashcard("fc_c1_5", "chemistry", "chem_u1", "Percentage Yield", "Efficiency metric: (Actual Yield / Theoretical Yield) × 100%."),
        Flashcard("fc_c1_6", "chemistry", "chem_u1", "Empirical vs Molecular Formula", "Empirical formula gives the simplest whole-number atom ratio; molecular formula gives actual atom counts."),
        Flashcard("fc_c1_7", "chemistry", "chem_u1", "Law of Conservation of Mass", "Mass is neither created nor destroyed in a chemical reaction; total reactant mass equals total product mass."),

        // Unit 2: Solutions
        Flashcard("fc_c2_1", "chemistry", "chem_u2", "Solute and Solvent", "Solute is the substance dissolved in lesser quantity; solvent is the dissolving medium (often water in aqueous solutions)."),
        Flashcard("fc_c2_2", "chemistry", "chem_u2", "Molarity (M)", "Concentration measured as moles of solute per liter of total solution: M = mol / L."),
        Flashcard("fc_c2_3", "chemistry", "chem_u2", "Saturated Solution", "A solution containing the maximum amount of dissolved solute at a specified temperature in dynamic equilibrium."),
        Flashcard("fc_c2_4", "chemistry", "chem_u2", "Colligative Properties", "Solution properties that depend solely on the ratio of solute particle count to solvent (e.g., boiling point elevation, freezing point depression)."),
        Flashcard("fc_c2_5", "chemistry", "chem_u2", "Tyndall Effect", "The visible scattering of light beams passing through a colloidal dispersion, absent in true molecular solutions."),
        Flashcard("fc_c2_6", "chemistry", "chem_u2", "Henry's Law", "The solubility of a gas in a liquid is directly proportional to the partial pressure of that gas above the liquid."),
        Flashcard("fc_c2_7", "chemistry", "chem_u2", "Electrolyte Solutions", "Aqueous solutions containing dissolved ions capable of conducting electric current (strong, weak, or non-electrolyte)."),

        // Unit 3: Important Inorganic Compounds
        Flashcard("fc_c3_1", "chemistry", "chem_u3", "Arrhenius Acid & Base", "An acid dissociates in water to produce H⁺ (H₃O⁺) ions; a base dissociates to yield OH⁻ hydroxide ions."),
        Flashcard("fc_c3_2", "chemistry", "chem_u3", "Bronsted-Lowry Definition", "An acid is a proton (H⁺) donor; a base is a proton (H⁺) acceptor."),
        Flashcard("fc_c3_3", "chemistry", "chem_u3", "pH Scale", "A logarithmic scale measuring hydrogen ion concentration: pH = -log₁₀[H⁺]; < 7 is acidic, 7 is neutral, > 7 is basic at 25°C."),
        Flashcard("fc_c3_4", "chemistry", "chem_u3", "Neutralization Reaction", "Reaction between an acid and a base yielding an ionic salt and water: Acid + Base → Salt + H₂O."),
        Flashcard("fc_c3_5", "chemistry", "chem_u3", "Oxides Classification", "Basic oxides (metal oxides like CaO), Acidic oxides (non-metal oxides like SO₂), and Amphoteric oxides (Al₂O₃, ZnO)."),
        Flashcard("fc_c3_6", "chemistry", "chem_u3", "Haber Process", "Industrial catalytic synthesis of ammonia from nitrogen and hydrogen gases: N₂ + 3H₂ ⇌ 2NH₃ (iron catalyst, high pressure)."),
        Flashcard("fc_c3_7", "chemistry", "chem_u3", "Contact Process", "Industrial manufacture of sulfuric acid (H₂SO₄) through catalytic oxidation of SO₂ to SO₃ using V₂O₅."),

        // Unit 4: Energy Changes and Electro-Chemistry
        Flashcard("fc_c4_1", "chemistry", "chem_u4", "Exothermic Reaction", "Releases heat energy to surrounding environment, producing a negative enthalpy change (ΔH < 0)."),
        Flashcard("fc_c4_2", "chemistry", "chem_u4", "Endothermic Reaction", "Absorbs heat energy from surrounding environment, resulting in a positive enthalpy change (ΔH > 0)."),
        Flashcard("fc_c4_3", "chemistry", "chem_u4", "Activation Energy (E_a)", "The minimum kinetic energy threshold required for colliding reactant particles to initiate a chemical transformation."),
        Flashcard("fc_c4_4", "chemistry", "chem_u4", "Galvanic (Voltaic) Cell", "An electrochemical cell that harnesses spontaneous redox reactions to produce electric current."),
        Flashcard("fc_c4_5", "chemistry", "chem_u4", "Anode and Cathode", "Anode is the electrode where oxidation (loss of electrons) occurs; Cathode is where reduction (gain of electrons) takes place."),
        Flashcard("fc_c4_6", "chemistry", "chem_u4", "Salt Bridge", "Maintains electrical neutrality in galvanic cells by permitting ion migration between half-cell compartments."),
        Flashcard("fc_c4_7", "chemistry", "chem_u4", "Electrolytic Cell", "Uses external electrical energy from a power source to drive a non-spontaneous chemical redox process."),

        // Unit 5: Metals and Non Metals
        Flashcard("fc_c5_1", "chemistry", "chem_u5", "Metallic Bonding", "Lattice of positive metal cations surrounded by a shared 'sea' of delocalized, freely mobile valence electrons."),
        Flashcard("fc_c5_2", "chemistry", "chem_u5", "Reactivity (Activity) Series", "Arrangement of metals in descending order of chemical reactivity (K > Na > Ca > Mg > Al > Zn > Fe > Cu > Ag > Au)."),
        Flashcard("fc_c5_3", "chemistry", "chem_u5", "Malleability and Ductility", "Malleability allows metals to be hammered into thin sheets; ductility allows them to be drawn into wires."),
        Flashcard("fc_c5_4", "chemistry", "chem_u5", "Alloy Composition", "Homogeneous solid mixture of a metal with other elements (e.g., Bronze = Cu + Sn; Brass = Cu + Zn; Steel = Fe + C)."),
        Flashcard("fc_c5_5", "chemistry", "chem_u5", "Blast Furnace Iron Extraction", "Reduction of hematite ore (Fe₂O₃) with carbon monoxide (CO) generated from coke to produce pig iron."),
        Flashcard("fc_c5_6", "chemistry", "chem_u5", "Allotropes of Carbon", "Different physical structural forms of pure carbon: Diamond (sp³ tetrahedral network) and Graphite (sp² planar sheets)."),
        Flashcard("fc_c5_7", "chemistry", "chem_u5", "Corrosion Prevention", "Protection of metals through galvanization (zinc coating), sacrificial anodes, painting, and cathodic protection."),

        // Unit 6: Hydrocarbons and Their Natural Sources
        Flashcard("fc_c6_1", "chemistry", "chem_u6", "Hydrocarbons", "Organic chemical compounds composed exclusively of carbon and hydrogen atoms."),
        Flashcard("fc_c6_2", "chemistry", "chem_u6", "Alkanes (Saturated)", "Hydrocarbons with single C-C covalent bonds; general formula C_n H_(2n+2); relatively unreactive except combustion and substitution."),
        Flashcard("fc_c6_3", "chemistry", "chem_u6", "Alkenes (Unsaturated)", "Hydrocarbons containing at least one carbon-carbon double bond (C=C); general formula C_n H_(2n); undergo addition reactions."),
        Flashcard("fc_c6_4", "chemistry", "chem_u6", "Alkynes (Unsaturated)", "Hydrocarbons with at least one carbon-carbon triple bond (C≡C); general formula C_n H_(2n-2)."),
        Flashcard("fc_c6_5", "chemistry", "chem_u6", "Fractional Distillation of Petroleum", "Separation of crude oil into fractions (refinery gas, gasoline, kerosene, diesel, bitumen) based on differing boiling points."),
        Flashcard("fc_c6_6", "chemistry", "chem_u6", "Cracking", "Thermal or catalytic process that breaks long-chain, heavy alkane fractions into more valuable short-chain alkanes and alkenes."),
        Flashcard("fc_c6_7", "chemistry", "chem_u6", "Complete vs Incomplete Combustion", "Complete combustion yields CO₂ and H₂O; incomplete combustion in limited oxygen yields poisonous carbon monoxide (CO) or soot."),

        // ==========================================
        // 4. BIOLOGY (biology) — 6 units
        // ==========================================
        // Unit 1: Sub-fields of Biology
        Flashcard("fc_b1_1", "biology", "bio_u1", "Microbiology", "The study of microscopic organisms including bacteria, viruses, archaea, microscopic fungi, and protozoa."),
        Flashcard("fc_b1_2", "biology", "bio_u1", "Cytology", "Cell biology: the scientific branch investigating cellular structures, organelles, physiological properties, and signaling."),
        Flashcard("fc_b1_3", "biology", "bio_u1", "Genetics", "The study of heredity, genetic variation, genes, and DNA transmission across generations."),
        Flashcard("fc_b1_4", "biology", "bio_u1", "Ecology", "The study of relationships and interactions between living organisms (biotic) and their physical environment (abiotic)."),
        Flashcard("fc_b1_5", "biology", "bio_u1", "Taxonomy & Systematics", "The scientific discipline of naming, describing, and classifying organisms into hierarchical groups."),
        Flashcard("fc_b1_6", "biology", "bio_u1", "Physiology", "The study of internal biological mechanisms, organ functions, and biochemical processes maintaining life."),
        Flashcard("fc_b1_7", "biology", "bio_u1", "Biotechnology", "Application of biological systems and living organisms to create industrial, agricultural, and medical products."),

        // Unit 2: Plants
        Flashcard("fc_b2_1", "biology", "bio_u2", "Xylem Vascular Tissue", "Specialized plant tissue that conducts water and dissolved mineral ions upward from roots to stems and leaves."),
        Flashcard("fc_b2_2", "biology", "bio_u2", "Phloem Vascular Tissue", "Transports organic sucrose and photosynthetic nutrients from source leaves to sink tissues (translocation)."),
        Flashcard("fc_b2_3", "biology", "bio_u2", "Chloroplasts & Chlorophyll", "Plastid organelle containing green chlorophyll pigments where solar radiation is harnessed for photosynthesis."),
        Flashcard("fc_b2_4", "biology", "bio_u2", "Stomata & Guard Cells", "Microscopic leaf pores regulated by turgid guard cells to control CO₂ entry and transpirational water loss."),
        Flashcard("fc_b2_5", "biology", "bio_u2", "Plant Hormones (Auxin)", "Plant growth regulator produced in apical shoots that stimulates cell elongation and causes phototropic bending."),
        Flashcard("fc_b2_6", "biology", "bio_u2", "Transpiration Pull", "Evaporation of water vapor from leaf stomata generates negative pressure pulling water columns through xylem vessels."),
        Flashcard("fc_b2_7", "biology", "bio_u2", "Angiosperms vs Gymnosperms", "Angiosperms produce enclosed seeds within flowers and fruits; gymnosperms produce naked seeds on cones."),

        // Unit 3: Biochemical Molecules
        Flashcard("fc_b3_1", "biology", "bio_u3", "Carbohydrates", "Biomolecules consisting of carbon, hydrogen, and oxygen (1:2:1 ratio); primary energy source (glucose, starch, glycogen)."),
        Flashcard("fc_b3_2", "biology", "bio_u3", "Proteins and Amino Acids", "Polypeptides built from 20 standard amino acid monomers linked by peptide bonds, serving structural and enzymatic roles."),
        Flashcard("fc_b3_3", "biology", "bio_u3", "Lipids", "Hydrophobic organic molecules (fats, oils, phospholipids, steroids) utilized for cellular membranes and long-term energy storage."),
        Flashcard("fc_b3_4", "biology", "bio_u3", "Nucleic Acids (DNA & RNA)", "Polymers of nucleotides (nitrogenous base, pentose sugar, phosphate) encoding genetic instructions for protein synthesis."),
        Flashcard("fc_b3_5", "biology", "bio_u3", "Enzyme Specificity (Lock and Key)", "Enzymes possess a uniquely shaped active site that binds specifically to their complementary substrate molecule."),
        Flashcard("fc_b3_6", "biology", "bio_u3", "Adenosine Triphosphate (ATP)", "The universal cellular energy currency that releases usable energy when its terminal phosphate bond is cleaved into ADP."),
        Flashcard("fc_b3_7", "biology", "bio_u3", "Enzyme Denaturation", "Permanent structural disruption of an enzyme's tertiary active site caused by extreme temperature or pH shifts."),

        // Unit 4: Cell Reproduction
        Flashcard("fc_b4_1", "biology", "bio_u4", "Mitosis", "Equational cell division producing two genetically identical diploid (2n) daughter somatic cells for growth and repair."),
        Flashcard("fc_b4_2", "biology", "bio_u4", "Meiosis", "Reductional division yielding four genetically diverse haploid (n) gametes, halving chromosome count for sexual reproduction."),
        Flashcard("fc_b4_3", "biology", "bio_u4", "Interphase S Phase", "The metabolic stage of the cell cycle where chromatin nuclear DNA is duplicated prior to division."),
        Flashcard("fc_b4_4", "biology", "bio_u4", "Crossing Over (Recombination)", "Exchange of homologous non-sister chromatid segments in Prophase I of meiosis, creating new genetic combinations."),
        Flashcard("fc_b4_5", "biology", "bio_u4", "Stages of Mitosis (PMAT)", "Prophase (condensation), Metaphase (equatorial alignment), Anaphase (chromatid separation), Telophase (nuclear reformation)."),
        Flashcard("fc_b4_6", "biology", "bio_u4", "Cytokinesis", "Physical division of the cytoplasm: cleavage furrow in animal cells versus cell plate formation in plant cells."),
        Flashcard("fc_b4_7", "biology", "bio_u4", "Centromere & Spindle Fibers", "Centromere anchors sister chromatids; microtubule spindle fibers attach to kinetochores to pull chromosomes."),

        // Unit 5: Human Biology
        Flashcard("fc_b5_1", "biology", "bio_u5", "Human Circulatory System", "Double circulation system with a four-chambered heart pumping oxygenated blood to systemic tissues and deoxygenated blood to lungs."),
        Flashcard("fc_b5_2", "biology", "bio_u5", "Nephron Filtration Unit", "Microscopic functional filtering unit in kidneys comprising Bowman's capsule, glomerulus, and renal tubules for urine formation."),
        Flashcard("fc_b5_3", "biology", "bio_u5", "Digestive Enzymes", "Salivary/pancreatic amylase (carbohydrates), pepsin/trypsin (proteins), and pancreatic lipase (fats)."),
        Flashcard("fc_b5_4", "biology", "bio_u5", "Endocrine Regulation (Insulin/Glucagon)", "Pancreatic hormones: insulin lowers blood glucose by promoting glycogen storage; glucagon raises glucose by breaking down glycogen."),
        Flashcard("fc_b5_5", "biology", "bio_u5", "Gas Exchange in Alveoli", "Passive diffusion of oxygen into pulmonary capillary blood and carbon dioxide into alveolar air spaces."),
        Flashcard("fc_b5_6", "biology", "bio_u5", "Neuron Action Potential", "Electrochemical nerve impulse propagated along axons by rapid sodium (Na⁺) influx and potassium (K⁺) efflux."),
        Flashcard("fc_b5_7", "biology", "bio_u5", "Human Immune Defense", "Innate non-specific physical/chemical barriers and adaptive antibody-mediated (B-cells) and cell-mediated (T-cells) immunity."),

        // Unit 6: Ecological Interaction
        Flashcard("fc_b6_1", "biology", "bio_u6", "Symbiosis", "Close, persistent ecological relationships: Mutualism (+/+), Commensalism (+/0), and Parasitism (+/-)."),
        Flashcard("fc_b6_2", "biology", "bio_u6", "Trophic Levels", "Feeding positions in a food web: Primary Producers (autotrophs), Primary Consumers (herbivores), Secondary & Tertiary Consumers."),
        Flashcard("fc_b6_3", "biology", "bio_u6", "10% Energy Transfer Law", "Only ~10% of chemical energy transfers between adjacent trophic levels; 90% is dissipated as metabolic heat."),
        Flashcard("fc_b6_4", "biology", "bio_u6", "Nitrogen Cycle", "Fixation of atmospheric N₂ by Rhizobium bacteria into ammonium (NH₄⁺), nitrification to nitrates (NO₃⁻), and denitrification back to N₂."),
        Flashcard("fc_b6_5", "biology", "bio_u6", "Ecological Succession", "Predictable replacement of community species over time: Primary (bare rock without soil) vs Secondary (disturbed existing soil)."),
        Flashcard("fc_b6_6", "biology", "bio_u6", "Carrying Capacity (K)", "The maximum population size of a species that a particular ecosystem can sustainably support given available resources."),
        Flashcard("fc_b6_7", "biology", "bio_u6", "Biomagnification", "Progressive concentration increase of non-biodegradable toxins (e.g., DDT, heavy metals) at successively higher trophic levels.")
    )
}
