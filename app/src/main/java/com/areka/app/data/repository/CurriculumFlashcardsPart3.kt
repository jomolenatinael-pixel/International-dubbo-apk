package com.areka.app.data.repository

import com.areka.app.data.model.Flashcard

/**
 * High-quality Grade 10 Ethiopian New Curriculum Flashcards (Part 3).
 * Geography (8 units) & Citizenship/Civics (8 units) - 7 to 8 cards per unit.
 */
object CurriculumFlashcardsPart3 {

    val cards: List<Flashcard> = listOf(
        // ==========================================
        // 5. GEOGRAPHY (geography) — 8 units
        // ==========================================
        // Unit 1: Land-forms of Africa
        Flashcard("fc_g1_1", "geography", "geo_u1", "East African Rift System", "A major geological divergent boundary stretching over 6,000 km from the Red Sea southward across East Africa."),
        Flashcard("fc_g1_2", "geography", "geo_u1", "Mount Kilimanjaro", "Africa's highest volcanic mountain peak (5,895 meters above sea level) located in northeastern Tanzania."),
        Flashcard("fc_g1_3", "geography", "geo_u1", "Ethiopian Plateau (Highlands)", "Known as the 'Roof of Africa'; constitutes the largest contiguous elevated land area above 2,000 m on the continent."),
        Flashcard("fc_g1_4", "geography", "geo_u1", "Atlas Mountains", "A young fold mountain system situated in northwestern Africa (Morocco, Algeria, Tunisia) formed by Alpine orogeny."),
        Flashcard("fc_g1_5", "geography", "geo_u1", "Drakensberg Escarpment", "The eastern, elevated mountainous portion of the Great Escarpment enclosing the central Southern African plateau."),
        Flashcard("fc_g1_6", "geography", "geo_u1", "Congo Basin", "A massive sedimentary drainage basin in Central Africa covering 3.7 million km², dominated by equatorial rainforests."),
        Flashcard("fc_g1_7", "geography", "geo_u1", "Danakil (Afar) Depression", "One of the hottest and lowest geological depressions on Earth, formed at the junction of three tectonic rift plates."),

        // Unit 2: Climate of Africa
        Flashcard("fc_g2_1", "geography", "geo_u2", "ITCZ (Inter-Tropical Convergence Zone)", "Equatorial low-pressure belt where northeast and southeast trade winds converge, dictating seasonal African rainfall."),
        Flashcard("fc_g2_2", "geography", "geo_u2", "Equatorial Climate", "Characterized by hot temperatures year-round (26-28°C), high humidity, and heavy convectional rainfall without a true dry season."),
        Flashcard("fc_g2_3", "geography", "geo_u2", "Savanna (Tropical Wet-and-Dry)", "Features distinct alternating wet rainy summers and dry winter seasons, supporting grassland and acacia woodlands."),
        Flashcard("fc_g2_4", "geography", "geo_u2", "Mediterranean Climate in Africa", "Occurs at northern and southwestern continental extremities; features hot dry summers and mild, rainy winter periods."),
        Flashcard("fc_g2_5", "geography", "geo_u2", "Benguela Cold Current", "Cold ocean current along southwest Africa that cools onshore air, suppressing rain and causing the hyper-arid Namib Desert."),
        Flashcard("fc_g2_6", "geography", "geo_u2", "Environmental Lapse Rate", "Decrease in atmospheric temperature with height (approx. 6.5°C per 1,000 m), creating temperate highland zones in Ethiopia."),
        Flashcard("fc_g2_7", "geography", "geo_u2", "Sahelian Semi-Arid Belt", "Ecoclimatic transition zone south of the Sahara receiving precarious, highly variable summer monsoonal precipitation."),

        // Unit 3: Natural Resource Base of Africa
        Flashcard("fc_g3_1", "geography", "geo_u3", "Congo Basin Rainforest", "The second largest contiguous tropical rainforest on Earth, containing immense biodiversity, hardwoods, and carbon sinks."),
        Flashcard("fc_g3_2", "geography", "geo_u3", "Grand Ethiopian Renaissance Dam (GERD)", "A flagship hydroelectric power project on the Blue Nile (Abbay) generating 5,000+ MW to power regional industrial growth."),
        Flashcard("fc_g3_3", "geography", "geo_u3", "Central African Copperbelt", "A premier stratiform sediment-hosted copper and cobalt mining belt traversing northern Zambia and southern DR Congo."),
        Flashcard("fc_g3_4", "geography", "geo_u3", "Renewable vs Non-renewable", "Renewables (solar, wind, water, timber) naturally replenish; non-renewables (petroleum, coal, gold) exist in finite deposits."),
        Flashcard("fc_g3_5", "geography", "geo_u3", "African Petroleum Reserves", "Substantial crude oil basins situated primarily in Nigeria (Niger Delta), Angola, Algeria, Libya, and Egypt."),
        Flashcard("fc_g3_6", "geography", "geo_u3", "Soil Degradation & Leaching", "Loss of agricultural topsoil fertility caused by excessive tropical rainfall leaching soluble nutrients down beyond root depth."),
        Flashcard("fc_g3_7", "geography", "geo_u3", "Wildlife Protected Areas", "National parks (e.g., Serengeti, Simien Mountains, Kruger) conserving megafauna biodiversity and generating ecotourism revenue."),

        // Unit 4: Population of Africa
        Flashcard("fc_g4_1", "geography", "geo_u4", "Africa's Population Size", "Africa's population exceeds 1.4 billion people, with Nigeria and Ethiopia ranking as the two most populous nations."),
        Flashcard("fc_g4_2", "geography", "geo_u4", "Youthful Age Structure", "Over 60% of Africa's population is under 25 years old, creating a wide-based expansive demographic population pyramid."),
        Flashcard("fc_g4_3", "geography", "geo_u4", "Arithmetic Population Density", "The number of inhabitants living per square kilometer of land area: Density = Total Population / Total Land Area."),
        Flashcard("fc_g4_4", "geography", "geo_u4", "Rural-to-Urban Migration", "The large-scale movement of people from countryside agricultural villages to urban centers in search of jobs and education."),
        Flashcard("fc_g4_5", "geography", "geo_u4", "Total Fertility Rate (TFR)", "The average number of children a woman is projected to bear during her reproductive years in a given society."),
        Flashcard("fc_g4_6", "geography", "geo_u4", "Demographic Dividend", "Economic growth potential realized when a country's working-age population expands relative to the dependent child and elderly population."),
        Flashcard("fc_g4_7", "geography", "geo_u4", "Uneven Population Distribution", "High densities cluster in fertile highlands, river valleys (Nile), and coastal zones; sparse densities in deserts and dense swamps."),

        // Unit 5: Major Economic and Cultural Activities of Africa
        Flashcard("fc_g5_1", "geography", "geo_u5", "Primary Economic Sector", "Economic activities involving direct extraction of natural resources, including subsistence farming, livestock pastoralism, and mining."),
        Flashcard("fc_g5_2", "geography", "geo_u5", "Shifting Cultivation", "Traditional agricultural system where forested land is cleared and farmed for several seasons before being left fallow to recover fertility."),
        Flashcard("fc_g5_3", "geography", "geo_u5", "Nomadic Pastoralism", "Livelihood practice centered on herding cattle, camels, sheep, or goats across semi-arid rangelands following seasonal forage."),
        Flashcard("fc_g5_4", "geography", "geo_u5", "Commercial Plantation Agriculture", "Large-scale agricultural estates cultivating export monoculture cash crops (e.g., coffee, tea, cocoa, oil palm, sugarcane)."),
        Flashcard("fc_g5_5", "geography", "geo_u5", "Ethiopian Coffee Heritage", "Coffee Arabica originated in southwestern Ethiopia and remains the nation's premier agricultural export commodity."),
        Flashcard("fc_g5_6", "geography", "geo_u5", "Informal Economic Sector", "Unregistered, untaxed economic activities providing livelihood for millions in petty trade, artisanal services, and market stalls."),
        Flashcard("fc_g5_7", "geography", "geo_u5", "AfCFTA (African Continental Free Trade Area)", "Pan-African trade pact aimed at creating a single unified continental market with free movement of goods, services, and capital."),

        // Unit 6: Human – Natural Environment Interactions
        Flashcard("fc_g6_1", "geography", "geo_u6", "Desertification", "The persistent degradation of dryland ecosystems caused by climate variations and unsustainable human practices (deforestation, overgrazing)."),
        Flashcard("fc_g6_2", "geography", "geo_u6", "Deforestation", "The permanent clearing of native forest cover for agriculture, firewood, or timber, triggering accelerated topsoil erosion."),
        Flashcard("fc_g6_3", "geography", "geo_u6", "Contour Terracing", "Agricultural engineering practice building horizontal stepped terraces across steep hillsides to slow water runoff and retain soil."),
        Flashcard("fc_g6_4", "geography", "geo_u6", "Environmental Determinism vs Possibilism", "Determinism claims physical environment limits human culture; Possibilism argues humans possess technological choices to overcome constraints."),
        Flashcard("fc_g6_5", "geography", "geo_u6", "Overgrazing", "Exposing rangeland vegetation to intensive livestock feeding over prolonged periods without adequate recovery intervals."),
        Flashcard("fc_g6_6", "geography", "geo_u6", "Watershed Degradation", "Destruction of upland vegetation leading to severe flash floods, sedimentation in reservoirs, and dried lowland riverbeds."),
        Flashcard("fc_g6_7", "geography", "geo_u6", "Agroforestry", "Integrated land-use management combining deliberate cultivation of trees and shrubs alongside traditional agricultural crops."),

        // Unit 7: Geographic Issues and Public Concerns in Africa
        Flashcard("fc_g7_1", "geography", "geo_u7", "The Great Green Wall", "An ambitious African Union initiative restoring 100 million hectares of degraded land across the Sahel from Senegal to Djibouti."),
        Flashcard("fc_g7_2", "geography", "geo_u7", "Climate Change Vulnerability", "Africa contributes under 4% of global greenhouse emissions but suffers disproportionately from erratic rainfall, droughts, and heatwaves."),
        Flashcard("fc_g7_3", "geography", "geo_u7", "Rapid Urbanization Challenges", "Growth of urban populations outstripping municipal housing, piped water supply, sanitation networks, and waste management."),
        Flashcard("fc_g7_4", "geography", "geo_u7", "Food Insecurity Causes", "Drought cycles, conflict, soil erosion, supply chain bottlenecks, and post-harvest grain losses threatening nutritional security."),
        Flashcard("fc_g7_5", "geography", "geo_u7", "Sustainable Development Goals (SDGs)", "17 global United Nations targets addressing poverty eradication, zero hunger, climate action, clean water, and quality education."),
        Flashcard("fc_g7_6", "geography", "geo_u7", "Water Scarcity & Transboundary Basins", "Competition over international river systems requiring cooperative riparian treaties (e.g., Nile Basin Initiative)."),
        Flashcard("fc_g7_7", "geography", "geo_u7", "Biodiversity Loss", "Extinction threats faced by indigenous fauna and flora due to habitat fragmentation, illegal wildlife poaching, and climate stresses."),

        // Unit 8: Geospatial Information and Data Processing
        Flashcard("fc_g8_1", "geography", "geo_u8", "Geographic Information System (GIS)", "A computer hardware and software system used for capturing, storing, analyzing, modeling, and mapping spatial geographic data."),
        Flashcard("fc_g8_2", "geography", "geo_u8", "Remote Sensing (RS)", "The acquisition of physical data about the Earth's surface from aircraft sensors or orbiting satellites without physical contact."),
        Flashcard("fc_g8_3", "geography", "geo_u8", "Global Positioning System (GPS)", "Satellite-based navigation system calculating exact latitude, longitude, and elevation coordinates anywhere on Earth."),
        Flashcard("fc_g8_4", "geography", "geo_u8", "Vector Data Model", "Spatial data format using discrete coordinate geometry: Points (e.g., wells), Lines (e.g., roads), and Polygons (e.g., lakes)."),
        Flashcard("fc_g8_5", "geography", "geo_u8", "Raster Data Model", "Spatial data representation consisting of a regular grid matrix of square pixels, each containing an attribute value (e.g., satellite imagery)."),
        Flashcard("fc_g8_6", "geography", "geo_u8", "Map Projections", "Mathematical methods used to transfer Earth's 3D curved spherical surface onto a 2D flat planar map (inevitably introducing distortion)."),
        Flashcard("fc_g8_7", "geography", "geo_u8", "Spatial Overlay Analysis", "GIS analytical operation combining multiple thematic data layers (e.g., soil type + slope + rainfall) to determine suitable land sites."),

        // ==========================================
        // 6. CITIZENSHIP / CIVICS (civics) — 8 units
        // ==========================================
        // Unit 1: Democracy and Democratization
        Flashcard("fc_cv1_1", "civics", "civics_u1", "Democracy", "A system of government where supreme political authority is vested in and exercised by the people through popular sovereignty."),
        Flashcard("fc_cv1_2", "civics", "civics_u1", "Direct vs Representative Democracy", "Direct democracy involves citizens voting directly on laws; representative democracy involves electing officials to govern."),
        Flashcard("fc_cv1_3", "civics", "civics_u1", "Rule of Law", "The constitutional principle that all persons, institutions, and government authorities are equally accountable under the law."),
        Flashcard("fc_cv1_4", "civics", "civics_u1", "Separation of Powers", "Division of governmental responsibilities among distinct Legislative, Executive, and Judicial branches to prevent tyranny."),
        Flashcard("fc_cv1_5", "civics", "civics_u1", "Checks and Balances", "Institutional mechanisms allowing each governmental branch to monitor, limit, and balance the actions of other branches."),
        Flashcard("fc_cv1_6", "civics", "civics_u1", "Democratization", "The institutional transition toward democratic norms, protecting civil liberties, fostering political pluralism, and free elections."),
        Flashcard("fc_cv1_7", "civics", "civics_u1", "Majority Rule & Minority Rights", "Democratic decisions reflect majority votes while constitutionally safeguarding the fundamental rights of numerical minorities."),

        // Unit 2: Citizens in the Digital Technology Age
        Flashcard("fc_cv2_1", "civics", "civics_u2", "Digital Citizenship", "The norms of appropriate, responsible, ethical, and safe behavior regarding technology, internet, and social media usage."),
        Flashcard("fc_cv2_2", "civics", "civics_u2", "Digital Literacy", "The cognitive ability to navigate, evaluate, synthesize, and create information using digital platforms and devices safely."),
        Flashcard("fc_cv2_3", "civics", "civics_u2", "Misinformation vs Disinformation", "Misinformation is false information shared without harmful intent; disinformation is deliberately fabricated content designed to mislead."),
        Flashcard("fc_cv2_4", "civics", "civics_u2", "Cyberbullying", "Using digital communication tools to intimidate, harass, defame, or humiliate individuals, violating digital human dignity."),
        Flashcard("fc_cv2_5", "civics", "civics_u2", "Digital Footprint", "The permanent trail of personal data, records, posts, and activities left behind when using digital devices and web services."),
        Flashcard("fc_cv2_6", "civics", "civics_u2", "E-Governance", "The application of ICT by public institutions to deliver government services, enhance transparency, and foster civic feedback."),
        Flashcard("fc_cv2_7", "civics", "civics_u2", "Cybersecurity Hygiene", "Practices protecting data security: using multi-factor authentication, strong passwords, updating software, and avoiding phishing scams."),

        // Unit 3: Understanding Good Governance
        Flashcard("fc_cv3_1", "civics", "civics_u3", "Good Governance", "The transparent, accountable, equitable, responsive, and effective exercise of political and administrative authority."),
        Flashcard("fc_cv3_2", "civics", "civics_u3", "Transparency", "Decisions taken and enforcement carried out in a manner that follows open rules, with information freely and directly accessible to the public."),
        Flashcard("fc_cv3_3", "civics", "civics_u3", "Public Accountability", "The legal and ethical obligation of public officials to answer for, explain, and take responsibility for their public actions and expenditures."),
        Flashcard("fc_cv3_4", "civics", "civics_u3", "Anti-Corruption Measures", "Legal frameworks and investigative commissions (like ethics bodies) working to prevent bribery, graft, nepotism, and embezzlement."),
        Flashcard("fc_cv3_5", "civics", "civics_u3", "Responsiveness", "Institutions and public processes serving all legitimate societal stakeholders within a reasonable, timely timeframe."),
        Flashcard("fc_cv3_6", "civics", "civics_u3", "Equity and Inclusiveness", "Ensuring that all members of society, especially vulnerable and marginalized groups, have equal opportunities to improve their wellbeing."),
        Flashcard("fc_cv3_7", "civics", "civics_u3", "Civil Society Organizations (CSOs)", "Non-governmental voluntary associations that monitor governance, advocate for rights, and deliver community services."),

        // Unit 4: Peace and Indigenous Conflict Resolution Mechanisms
        Flashcard("fc_cv4_1", "civics", "civics_u4", "Positive vs Negative Peace", "Negative peace is merely the absence of direct physical fighting; positive peace is the presence of justice, equity, and harmony."),
        Flashcard("fc_cv4_2", "civics", "civics_u4", "Jaarsummaa Institution", "Traditional Oromo dispute mediation conducted by respected elders (Jaarsoli) to reconcile feuding parties and restore social cohesion."),
        Flashcard("fc_cv4_3", "civics", "civics_u4", "Shimagile Customary Mediation", "Respected community elders acting as neutral mediators to resolve interpersonal, marital, and land disputes peacefully across Ethiopia."),
        Flashcard("fc_cv4_4", "civics", "civics_u4", "Abo Gereb", "Traditional customary conflict resolution mechanism practiced in northern Ethiopian communities to peacefully settle communal tensions."),
        Flashcard("fc_cv4_5", "civics", "civics_u4", "Restorative Justice", "Justice philosophy focused on rehabilitating relationships, repairing communal harm, and consensus-building rather than purely punitive jail."),
        Flashcard("fc_cv4_6", "civics", "civics_u4", "Root Causes of Conflict", "Underlying drivers of tension including resource scarcity, perceived marginalization, biased governance, and historical grievances."),
        Flashcard("fc_cv4_7", "civics", "civics_u4", "Conflict Transformation", "Long-term constructive process turning destructive adversarial relationships into cooperative, harmonious social dynamics."),

        // Unit 5: Federalism in Ethiopia
        Flashcard("fc_cv5_1", "civics", "civics_u5", "Federal System", "A constitutional political structure sharing power between a central national government and self-governing regional member states."),
        Flashcard("fc_cv5_2", "civics", "civics_u5", "House of Federation (HoF)", "Upper parliamentary house in Ethiopia representing Nations, Nationalities, and Peoples, tasked with constitutional interpretation."),
        Flashcard("fc_cv5_3", "civics", "civics_u5", "House of Peoples' Representatives (HoPR)", "Highest federal legislative authority in Ethiopia, whose members are directly elected by popular vote across constituencies."),
        Flashcard("fc_cv5_4", "civics", "civics_u5", "Unity in Diversity", "Core principle of Ethiopian federalism respecting linguistic, cultural, and regional autonomy while maintaining a unified sovereign country."),
        Flashcard("fc_cv5_5", "civics", "civics_u5", "Concurrent Powers", "Jurisdictional powers exercised jointly by both federal and regional governments (e.g., levying certain taxes, public health)."),
        Flashcard("fc_cv5_6", "civics", "civics_u5", "Fiscal Federalism", "The constitutional division of tax revenues, budget subsidies, and resource allocations between federal and regional governments."),
        Flashcard("fc_cv5_7", "civics", "civics_u5", "Constitutional Supremacy", "Article 9 of the 1995 FDRE Constitution: the Constitution is the supreme law of the land; any conflicting law is null and void."),

        // Unit 6: Human Rights
        Flashcard("fc_cv6_1", "civics", "civics_u6", "Universal Declaration of Human Rights (UDHR)", "Landmark UN declaration adopted in 1948 proclaiming universal, fundamental human rights entitled to all human beings everywhere."),
        Flashcard("fc_cv6_2", "civics", "civics_u6", "Universality and Inalienability", "Human rights belong to all individuals without distinction and cannot be stripped away except under lawful due process."),
        Flashcard("fc_cv6_3", "civics", "civics_u6", "First-Generation (Civil & Political) Rights", "Liberty-oriented rights including the right to life, freedom of speech, assembly, fair trial, and protection against torture."),
        Flashcard("fc_cv6_4", "civics", "civics_u6", "Second-Generation (Economic & Social) Rights", "Security-oriented rights ensuring adequate standard of living, right to education, healthcare, work, and housing."),
        Flashcard("fc_cv6_5", "civics", "civics_u6", "Third-Generation (Solidarity) Rights", "Collective rights belonging to communities, including right to peace, clean environment, and sustainable development."),
        Flashcard("fc_cv6_6", "civics", "civics_u6", "Ethiopian Human Rights Commission (EHRC)", "Independent constitutional national institution established to promote, monitor, investigate, and advocate for human rights compliance."),
        Flashcard("fc_cv6_7", "civics", "civics_u6", "Rights and Responsibilities Link", "Every constitutional right entails a corresponding civic responsibility to respect the rights and freedoms of fellow citizens."),

        // Unit 7: Patriotism
        Flashcard("fc_cv7_1", "civics", "civics_u7", "Democratic Patriotism", "Devotion to one's nation grounded in constitutional values, human rights, civic duty, and public welfare without xenophobia."),
        Flashcard("fc_cv7_2", "civics", "civics_u7", "Chauvinism vs Patriotism", "Chauvinism is blind, aggressive national superiority that demeans others; true patriotism seeks internal justice and peaceful coexistence."),
        Flashcard("fc_cv7_3", "civics", "civics_u7", "The Victory of Adwa (1896)", "A proud symbol of Ethiopian and Pan-African patriotic triumph, defeating Italian colonial invaders and safeguarding sovereignty."),
        Flashcard("fc_cv7_4", "civics", "civics_u7", "Civic Volunteering", "Active patriotic engagement through community development, environmental tree-planting, literacy drives, and helping vulnerable citizens."),
        Flashcard("fc_cv7_5", "civics", "civics_u7", "Preservation of Heritage", "Protecting archaeological, historical, and cultural monuments as irreplaceable collective treasures for present and future generations."),
        Flashcard("fc_cv7_6", "civics", "civics_u7", "National Symbols Respect", "Honoring the national flag, national anthem, and constitution as unifying expressions of sovereign statehood and shared destiny."),
        Flashcard("fc_cv7_7", "civics", "civics_u7", "Defending the Public Interest", "Prioritizing common societal wellbeing over selfish narrow interests, safeguarding public infrastructure against vandalism and corruption."),

        // Unit 8: Globalization and Global Issues
        Flashcard("fc_cv8_1", "civics", "civics_u8", "Globalization Concept", "The worldwide interconnectedness and interdependence of markets, communication technologies, cultural ideas, and human populations."),
        Flashcard("fc_cv8_2", "civics", "civics_u8", "Multilateralism", "Cooperative alliances among multiple sovereign nations to address shared global challenges through international law and dialogue."),
        Flashcard("fc_cv8_3", "civics", "civics_u8", "The African Union (AU)", "Continental body headquartered in Addis Ababa, Ethiopia, driving Africa's socio-economic integration, peace, and Agenda 2063 vision."),
        Flashcard("fc_cv8_4", "civics", "civics_u8", "Transnational Public Challenges", "Global problems that transcend sovereign borders (e.g., climate change, epidemics, human trafficking) requiring international action."),
        Flashcard("fc_cv8_5", "civics", "civics_u8", "Cultural Homogenization vs Diversity", "The risk that global mass media replaces local traditions, contrasted with the opportunity to share indigenous heritage globally."),
        Flashcard("fc_cv8_6", "civics", "civics_u8", "Digital Divide", "The unequal gap in access to modern information and communication technology between advanced and developing regions."),
        Flashcard("fc_cv8_7", "civics", "civics_u8", "Global Citizenship", "Recognizing that one's civic responsibilities extend to humanity as a whole, promoting planetary peace, human dignity, and ecology.")
    )
}
