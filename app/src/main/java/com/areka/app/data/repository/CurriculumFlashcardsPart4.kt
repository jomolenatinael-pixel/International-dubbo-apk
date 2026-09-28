package com.areka.app.data.repository

import com.areka.app.data.model.Flashcard

/**
 * High-quality Grade 10 Ethiopian New Curriculum Flashcards (Part 4).
 * Economics (8 units), History (9 units), Health & PE (8 units) - 7 to 8 cards per unit.
 */
object CurriculumFlashcardsPart4 {

    val cards: List<Flashcard> = listOf(
        // ==========================================
        // 7. ECONOMICS (economics) — 8 units
        // ==========================================
        // Unit 1: Theory of Consumer Behaviour
        Flashcard("fc_ec1_1", "economics", "econ_u1", "Utility", "The measure of subjective satisfaction or pleasure a consumer derives from consuming a good or service."),
        Flashcard("fc_ec1_2", "economics", "econ_u1", "Law of Diminishing Marginal Utility", "As consumption of a given good increases, the additional utility gained from each extra unit consumed decreases."),
        Flashcard("fc_ec1_3", "economics", "econ_u1", "Indifference Curve", "A curve depicting all combinations of two goods that give the consumer equal total satisfaction (equal utility)."),
        Flashcard("fc_ec1_4", "economics", "econ_u1", "Marginal Rate of Substitution (MRS)", "The rate at which a consumer is willing to give up some of good Y in exchange for an extra unit of good X while maintaining utility."),
        Flashcard("fc_ec1_5", "economics", "econ_u1", "Budget Line", "A graphical line representing all combinations of two goods a consumer can purchase given current market prices and fixed income."),
        Flashcard("fc_ec1_6", "economics", "econ_u1", "Consumer Equilibrium", "The point where the budget line is tangent to the highest possible indifference curve (MRS_xy = P_x / P_y)."),
        Flashcard("fc_ec1_7", "economics", "econ_u1", "Income Effect vs Substitution Effect", "Income effect reflects change in purchasing power; substitution effect reflects shifting toward relatively cheaper alternatives."),

        // Unit 2: Theories of Demand and Supply
        Flashcard("fc_ec2_1", "economics", "econ_u2", "Law of Demand", "Ceteris paribus, as the market price of a good rises, the quantity demanded falls; price and quantity demanded are inversely related."),
        Flashcard("fc_ec2_2", "economics", "econ_u2", "Law of Supply", "Ceteris paribus, as market price rises, producers offer a greater quantity for sale; price and quantity supplied are directly related."),
        Flashcard("fc_ec2_3", "economics", "econ_u2", "Market Equilibrium", "The price point where quantity demanded equals quantity supplied (Q_d = Q_s), leaving no shortage or surplus."),
        Flashcard("fc_ec2_4", "economics", "econ_u2", "Price Elasticity of Demand (PED)", "A measure of responsiveness of quantity demanded to a change in price: PED = (%ΔQ_d) / (%ΔP)."),
        Flashcard("fc_ec2_5", "economics", "econ_u2", "Shift vs Movement along Curve", "Price change causes movement along the curve; changes in consumer tastes, income, or input costs shift the entire curve."),
        Flashcard("fc_ec2_6", "economics", "econ_u2", "Price Ceiling and Floor", "A ceiling is a legal maximum price set below equilibrium (causes shortage); a floor is a legal minimum set above equilibrium (causes surplus)."),
        Flashcard("fc_ec2_7", "economics", "econ_u2", "Cross-Price Elasticity", "Measures responsiveness of demand for good X when price of good Y changes; positive for substitutes, negative for complements."),

        // Unit 3: Theories of Production and Cost
        Flashcard("fc_ec3_1", "economics", "econ_u3", "Short Run vs Long Run", "Short run has at least one fixed factor of production (e.g., factory size); long run is a timeframe where all input factors are variable."),
        Flashcard("fc_ec3_2", "economics", "econ_u3", "Law of Diminishing Marginal Returns", "In the short run, adding successive units of a variable input (labor) to fixed capital eventually yields smaller additions to total output."),
        Flashcard("fc_ec3_3", "economics", "econ_u3", "Fixed Costs vs Variable Costs", "Fixed costs do not change with output volume (e.g., factory rent); variable costs vary directly with units produced (e.g., raw materials)."),
        Flashcard("fc_ec3_4", "economics", "econ_u3", "Marginal Cost (MC)", "The extra cost incurred by manufacturing one additional unit of output: MC = ΔTotal Cost / ΔQuantity."),
        Flashcard("fc_ec3_5", "economics", "econ_u3", "Average Total Cost (ATC)", "Total production cost per unit of output produced: ATC = Total Cost / Quantity = AFC + AVC."),
        Flashcard("fc_ec3_6", "economics", "econ_u3", "Economies of Scale", "Reductions in long-run average total cost as plant scale and production volume expand."),
        Flashcard("fc_ec3_7", "economics", "econ_u3", "Isoquant and Isocost", "An isoquant shows all input combinations producing a given output; an isocost shows all combinations costing the same total budget."),

        // Unit 4: Market Structure
        Flashcard("fc_ec4_1", "economics", "econ_u4", "Perfect Competition", "Market with numerous small buyers and sellers trading identical products, with free entry and exit; firms are price-takers."),
        Flashcard("fc_ec4_2", "economics", "econ_u4", "Monopoly", "A market with a single producer/seller controlling total supply of a good lacking close substitutes, protected by high barriers to entry."),
        Flashcard("fc_ec4_3", "economics", "econ_u4", "Monopolistic Competition", "Market with many sellers offering differentiated products with non-price advertising competition and relatively free entry."),
        Flashcard("fc_ec4_4", "economics", "econ_u4", "Oligopoly", "Market dominated by a small number of large, mutually interdependent firms (e.g., telecom providers), susceptible to collusion."),
        Flashcard("fc_ec4_5", "economics", "econ_u4", "Profit Maximization Rule", "For any firm seeking maximum profit, produce at the output level where Marginal Revenue equals Marginal Cost (MR = MC)."),
        Flashcard("fc_ec4_6", "economics", "econ_u4", "Natural Monopoly", "An industry where a single firm can supply the entire market at lower average cost than two or more firms (e.g., water utility grids)."),
        Flashcard("fc_ec4_7", "economics", "econ_u4", "Barriers to Entry", "Obstacles preventing new rivals from entering a market: legal patents, economies of scale, resource control, or massive startup capital."),

        // Unit 5: Banking and Finance
        Flashcard("fc_ec5_1", "economics", "econ_u5", "Functions of Money", "Serves as a medium of exchange, a unit of account, and a store of value."),
        Flashcard("fc_ec5_2", "economics", "econ_u5", "Central Bank (National Bank of Ethiopia)", "Formulates monetary policy, manages foreign exchange reserves, regulates commercial lenders, and issues national currency."),
        Flashcard("fc_ec5_3", "economics", "econ_u5", "Commercial Banks", "Financial intermediaries that accept deposits from savers and extend credit loans to consumers and businesses for interest."),
        Flashcard("fc_ec5_4", "economics", "econ_u5", "Fractional Reserve Banking", "Banking mechanism where institutions hold only a fraction of customer deposits in vault reserves and lend out the remainder."),
        Flashcard("fc_ec5_5", "economics", "econ_u5", "Money Multiplier", "The maximum amount of broad commercial credit created per unit of reserves: Multiplier = 1 / Reserve Requirement Ratio."),
        Flashcard("fc_ec5_6", "economics", "econ_u5", "Monetary Policy Tools", "Reserve requirements, central bank discount lending rates, open market operations, and quantitative credit guidelines."),
        Flashcard("fc_ec5_7", "economics", "econ_u5", "Inflation & Purchasing Power", "Persistent rise in the general price level of goods; erodes the real purchasing power of a unit of currency over time."),

        // Unit 6: Economic Growth
        Flashcard("fc_ec6_1", "economics", "econ_u6", "Gross Domestic Product (GDP)", "The total market value of all final goods and services produced within a country's domestic borders in a given year."),
        Flashcard("fc_ec6_2", "economics", "econ_u6", "Nominal vs Real GDP", "Nominal GDP measures output at current market prices; Real GDP is adjusted for inflation using constant base-year prices."),
        Flashcard("fc_ec6_3", "economics", "econ_u6", "GDP Per Capita", "Total real national economic output divided by total population, serving as an indicator of average living standards."),
        Flashcard("fc_ec6_4", "economics", "econ_u6", "Growth vs Development", "Economic growth is quantitative expansion in GDP; economic development encompasses qualitative improvements in health, education, and equality."),
        Flashcard("fc_ec6_5", "economics", "econ_u6", "Human Development Index (HDI)", "Composite UN metric combining life expectancy, adult education attainment, and per capita gross national income."),
        Flashcard("fc_ec6_6", "economics", "econ_u6", "Determinants of Growth", "Capital accumulation, infrastructure investments, human capital development (education), and technological innovation."),
        Flashcard("fc_ec6_7", "economics", "econ_u6", "Structural Transformation", "The progressive transition of an economy from agrarian subsistence toward high-productivity manufacturing and services."),

        // Unit 7: The Ethiopian Economy
        Flashcard("fc_ec7_1", "economics", "econ_u7", "Agricultural Dominance", "Agriculture employs over 60% of the Ethiopian workforce and supplies vital raw export commodities like Arabica coffee, oilseeds, and pulses."),
        Flashcard("fc_ec7_2", "economics", "econ_u7", "Homegrown Economic Reform", "National strategic blueprint focused on addressing macroeconomic imbalances, expanding private sector investments, and creating jobs."),
        Flashcard("fc_ec7_3", "economics", "econ_u7", "Trade Deficit", "Ethiopia's merchandise imports (fuel, capital machinery, fertilizers) substantially exceed its commodity export earnings."),
        Flashcard("fc_ec7_4", "economics", "econ_u7", "Industrial Parks Initiative", "Specialized state-of-the-art manufacturing zones (e.g., Hawassa, Bole Lemi) built to attract foreign direct investment and boost exports."),
        Flashcard("fc_ec7_5", "economics", "econ_u7", "Service Sector Expansion", "Fastest growing GDP component, propelled by Ethiopian Airlines aviation, telecommunications modernization, and digital fintech (Telebirr)."),
        Flashcard("fc_ec7_6", "economics", "econ_u7", "Fiscal Policy in Ethiopia", "Ministry of Finance taxation policies, government infrastructure spending, and public budget administration."),
        Flashcard("fc_ec7_7", "economics", "econ_u7", "Regional Integration (IGAD & AfCFTA)", "Expanding cross-border trade, energy grid interconnections, and trade pacts with neighboring Horn of Africa states."),

        // Unit 8: Business Startups and Innovation
        Flashcard("fc_ec8_1", "economics", "econ_u8", "Entrepreneurship", "The initiative to identify unmet market needs, assemble productive resources, accept commercial risks, and build an enterprise."),
        Flashcard("fc_ec8_2", "economics", "econ_u8", "Business Plan", "A comprehensive written roadmap detailing a venture's market opportunity, competitive strategy, operations, and financial forecasts."),
        Flashcard("fc_ec8_3", "economics", "econ_u8", "Minimum Viable Product (MVP)", "An initial, simplified version of a product released with core features to test customer acceptance and gather early feedback."),
        Flashcard("fc_ec8_4", "economics", "econ_u8", "Startup Incubator vs Accelerator", "Incubators nurture early-stage ideas over years; accelerators provide intense, cohort-based mentorship and seed capital over months."),
        Flashcard("fc_ec8_5", "economics", "econ_u8", "Intellectual Property (IP)", "Legal protections granted to creations of the human mind: Patents (inventions), Trademarks (brand marks), and Copyrights (creative works)."),
        Flashcard("fc_ec8_6", "economics", "econ_u8", "Venture Capital & Angel Investors", "Private equity funding supplied by investors to early-stage, high-growth-potential startups in exchange for company equity."),
        Flashcard("fc_ec8_7", "economics", "econ_u8", "Social Entrepreneurship", "Developing innovative commercial ventures whose primary objective is solving pressing social, environmental, or community challenges."),

        // ==========================================
        // 8. HISTORY (history) — 9 units
        // ==========================================
        // Unit 1: Development of Capitalism and Nationalism 1815–1914
        Flashcard("fc_h1_1", "history", "hist_u1", "Congress of Vienna (1815)", "European peace conference restoring conservative monarchies and balance of power after the Napoleonic Wars."),
        Flashcard("fc_h1_2", "history", "hist_u1", "Unification of Germany (1871)", "Orchestrated by Prussian Prime Minister Otto von Bismarck using military victories and his pragmatic 'Blood and Iron' strategy."),
        Flashcard("fc_h1_3", "history", "hist_u1", "Unification of Italy (Risorgimento)", "19th-century political movement unifying Italian states into one kingdom under King Victor Emmanuel II, Cavour, and Garibaldi."),
        Flashcard("fc_h1_4", "history", "hist_u1", "Industrial Capitalism", "Economic system driven by private ownership of factory machinery, division of labor, urbanization, and market competition."),
        Flashcard("fc_h1_5", "history", "hist_u1", "New Imperialism Drivers", "Industrial European nations conquered overseas territories to secure raw materials (rubber, oil, minerals) and captive export markets."),
        Flashcard("fc_h1_6", "history", "hist_u1", "Socialism and Karl Marx", "Political theory formulated in 'The Communist Manifesto' advocating working-class proletarian revolution against capitalist bourgeoisie."),
        Flashcard("fc_h1_7", "history", "hist_u1", "Triple Alliance & Triple Entente", "Pre-WWI European alliance blocs: Germany/Austria-Hungary/Italy vs Britain/France/Russia, heightening continental tensions."),

        // Unit 2: Africa & the Colonial Experience (1880s–1960s)
        Flashcard("fc_h2_1", "history", "hist_u2", "Berlin Conference (1884–1885)", "European gathering convened by Bismarck setting rules for the 'Scramble for Africa', requiring 'effective occupation' of territories."),
        Flashcard("fc_h2_2", "history", "hist_u2", "Direct Rule System", "Colonial strategy employed by France, Portugal, and Belgium replacing indigenous leaders with European administrators."),
        Flashcard("fc_h2_3", "history", "hist_u2", "Indirect Rule System", "British administrative policy codified by Lord Lugard governing colonized subjects through traditional indigenous chiefs and councils."),
        Flashcard("fc_h2_4", "history", "hist_u2", "French Assimilation Policy", "Colonial indoctrination aiming to convert African subjects into French citizens through language, law, and cultural adoption."),
        Flashcard("fc_h2_5", "history", "hist_u2", "Maji Maji Rebellion (1905–1907)", "Armed uprising in German East Africa (Tanzania) uniting diverse ethnic groups against brutal forced cotton production and taxes."),
        Flashcard("fc_h2_6", "history", "hist_u2", "Colonial Economic Extraction", "Restructuring African economies around single-crop exports, forced labor, head taxes, and infrastructure built solely to move minerals to ports."),
        Flashcard("fc_h2_7", "history", "hist_u2", "African Anti-Colonial Resistance", "Early resistance led by monarchs (e.g., Samori Toure, Queen Yaa Asantewaa, Menelik II) defending sovereignty against imperial invasion."),

        // Unit 3: Social, Economic & Political Developments in Ethiopia mid-19th C. to 1941
        Flashcard("fc_h3_1", "history", "hist_u3", "Emperor Tewodros II (r. 1855–1868)", "Initiated modern Ethiopian reunification, ending the Zemene Mesafint (Era of Princes), centralizing army and royal administration."),
        Flashcard("fc_h3_2", "history", "hist_u3", "Emperor Yohannes IV (r. 1872–1889)", "Defended Ethiopian sovereignty against foreign invasions, defeating Egyptian armies at Gundet and Gura, and dying at Metemma."),
        Flashcard("fc_h3_3", "history", "hist_u3", "The Battle of Adwa (March 1, 1896)", "Decisive victory of Ethiopian patriotic forces under Emperor Menelik II and Empress Taytu over Italian invaders, preserving independence."),
        Flashcard("fc_h3_4", "history", "hist_u3", "Treaty of Wuchale (1889)", "Disputed treaty between Menelik and Italy; deceptive Article XVII Italian text claimed an Italian protectorate, sparking war."),
        Flashcard("fc_h3_5", "history", "hist_u3", "Menelik II's Modernization", "Founded Addis Ababa (1886), introduced modern schools, telecommunications, postal system, banks, and the Franco-Ethiopian railway."),
        Flashcard("fc_h3_6", "history", "hist_u3", "Italian Fascist Invasion (1935–1936)", "Mussolini's unprovoked invasion using banned mustard poison gas, culminating in brief occupation of major urban centers (1936–1941)."),
        Flashcard("fc_h3_7", "history", "hist_u3", "The Arbegnoch (Patriots Resistance)", "Ethiopian patriotic resistance fighters who waged relentless rural guerrilla warfare against fascist occupation until liberation in 1941."),

        // Unit 4: Society and Politics in the Age of World Wars 1914–1945
        Flashcard("fc_h4_1", "history", "hist_u4", "Outbreak of World War I (1914)", "Triggered in June 1914 by the assassination of Archduke Franz Ferdinand of Austria-Hungary by Gavrilo Princip in Sarajevo."),
        Flashcard("fc_h4_2", "history", "hist_u4", "Trench Warfare", "Defensive combat along the Western Front where opposing armies occupied fortified trenches separated by barbed wire 'No Man's Land'."),
        Flashcard("fc_h4_3", "history", "hist_u4", "Treaty of Versailles (1919)", "Post-WWI peace treaty punishing Germany with war guilt clause 231, territory loss, disarming, and colossal financial reparations."),
        Flashcard("fc_h4_4", "history", "hist_u4", "League of Nations", "International diplomatic body formed in 1919 to maintain collective security; failed due to lack of military power and appeasement."),
        Flashcard("fc_h4_5", "history", "hist_u4", "Rise of Fascism and Nazism", "Authoritarian totalitarian movements under Benito Mussolini (Italy) and Adolf Hitler (Germany) combining militarism and extreme nationalism."),
        Flashcard("fc_h4_6", "history", "hist_u4", "Outbreak of World War II (1939)", "Began on September 1, 1939, when Nazi Germany launched Blitzkrieg invasion of Poland, prompting Britain and France to declare war."),
        Flashcard("fc_h4_7", "history", "hist_u4", "Haile Selassie at the League (1936)", "Emperor Haile Selassie's historic address at Geneva warning that international abandonment of Ethiopia would invite global catastrophe."),

        // Unit 5: Global and Regional Developments Since 1945
        Flashcard("fc_h5_1", "history", "hist_u5", "The Cold War", "Decades-long geopolitical and ideological confrontation between the capitalist USA and communist USSR (1945–1991)."),
        Flashcard("fc_h5_2", "history", "hist_u5", "United Nations (UN) Founding (1945)", "Established in San Francisco post-WWII with 51 charter member states (including sovereign Ethiopia) to safeguard global peace."),
        Flashcard("fc_h5_3", "history", "hist_u5", "Non-Aligned Movement (NAM)", "Forum formed in Belgrade in 1961 by developing states refusing military alignment with either superpower Cold War bloc."),
        Flashcard("fc_h5_4", "history", "hist_u5", "Founding of the OAU (May 25, 1963)", "32 independent African states established the Organization of African Unity in Addis Ababa to eradicate colonialism and unite Africa."),
        Flashcard("fc_h5_5", "history", "hist_u5", "Decolonization of Asia and Africa", "Rapid collapse of European empires following WWII as nationalist liberation movements achieved sovereign independence across continents."),
        Flashcard("fc_h5_6", "history", "hist_u5", "The Marshall Plan", "US financial aid initiative providing over $12 billion to rebuild war-shattered Western European industrial economies after 1947."),
        Flashcard("fc_h5_7", "history", "hist_u5", "NATO vs Warsaw Pact", "Opposing Cold War military defense alliances: North Atlantic Treaty Organization (1949) vs the Soviet Warsaw Pact (1955)."),

        // Unit 6: Ethiopia: Internal Developments and External Influences from 1941 to 1991
        Flashcard("fc_h6_1", "history", "hist_u6", "Post-1941 Restoration", "Emperor Haile Selassie returned to Addis Ababa on May 5, 1941, restoring imperial administration with initial British military assistance."),
        Flashcard("fc_h6_2", "history", "hist_u6", "Ethiopian Student Movement (ESM)", "University students mobilized in the 1960s challenging imperial autocracy and feudal tenancy under the slogan 'Land to the Tiller!'."),
        Flashcard("fc_h6_3", "history", "hist_u6", "The 1974 Ethiopian Revolution", "Mass protests, urban strikes, and military mutinies culminated in the Derg deposing Emperor Haile Selassie on September 12, 1974."),
        Flashcard("fc_h6_4", "history", "hist_u6", "Proclamation 31/1975 (Land Reform)", "The Derg nationalized all rural land without compensation, abolishing feudal landlordism and redistributing plots to peasant associations."),
        Flashcard("fc_h6_5", "history", "hist_u6", "Red Terror (Qey Shibir)", "Brutal state-sponsored violent campaign waged by the Derg regime (1976–1978) against urban political opposition groups like the EPRP."),
        Flashcard("fc_h6_6", "history", "hist_u6", "The Ethio-Somali War (1977–1978)", "Invasion of eastern Ethiopia by Siad Barre's Somali army, repelled by Ethiopian armed forces with Soviet and Cuban military logistics."),
        Flashcard("fc_h6_7", "history", "hist_u6", "Fall of the Derg (May 28, 1991)", "After protracted civil war, insurgent coalition forces of the EPRDF captured Addis Ababa, ending Colonel Mengistu Hailemariam's regime."),

        // Unit 7: Africa Since 1960
        Flashcard("fc_h7_1", "history", "hist_u7", "1960: 'Year of Africa'", "Historic milestone when seventeen African nations achieved formal political independence from British, French, and Belgian colonial rule."),
        Flashcard("fc_h7_2", "history", "hist_u7", "Apartheid in South Africa", "Institutionalized racist system of white minority supremacy and racial segregation dismantled through ANC resistance and global boycotts."),
        Flashcard("fc_h7_3", "history", "hist_u7", "Nelson Mandela", "Anti-apartheid revolutionary imprisoned for 27 years who was elected South Africa's first democratic multi-racial President in 1994."),
        Flashcard("fc_h7_4", "history", "hist_u7", "Pan-Africanism Champions", "Philosophical movement fostering continental solidarity led by visionary figures like Kwame Nkrumah, Julius Nyerere, and Jomo Kenyatta."),
        Flashcard("fc_h7_5", "history", "hist_u7", "African Union Launch (2002)", "The OAU transformed into the African Union in Durban, South Africa, prioritizing economic integration, peace operations, and good governance."),
        Flashcard("fc_h7_6", "history", "hist_u7", "Agenda 2063", "The African Union's 50-year strategic framework for inclusive sustainable development, continental integration, and economic renaissance."),
        Flashcard("fc_h7_7", "history", "hist_u7", "Post-Colonial Governance Challenges", "Coups d'état, external debt burdens, border disputes, and structural adjustment programs navigated by newly sovereign states."),

        // Unit 8: Post-1991 Developments in Ethiopia
        Flashcard("fc_h8_1", "history", "hist_u8", "The 1995 FDRE Constitution", "Ratified in December 1994, established a federal democratic republic recognizing the unconditional self-determination of Ethiopian nationalities."),
        Flashcard("fc_h8_2", "history", "hist_u8", "Eritrean Independence (1993)", "Following a UN-supervised referendum in April 1993, Eritrea formally declared sovereign independence from Ethiopia."),
        Flashcard("fc_h8_3", "history", "hist_u8", "Ethio-Eritrean Border War (1998–2000)", "Devastating border conflict centered on Badme, culminating in the Algiers Peace Agreement signed in December 2000."),
        Flashcard("fc_h8_4", "history", "hist_u8", "Infrastructure Modernization", "Massive expansion of national highways, hydroelectric dams, rural electrification, and higher education universities across all regions."),
        Flashcard("fc_h8_5", "history", "hist_u8", "The 2018 Political Transition", "Leadership transition bringing release of political prisoners, peace rapprochement with Eritrea, and economic liberalization measures."),
        Flashcard("fc_h8_6", "history", "hist_u8", "Multinational Federal Structure", "Administrative organization of Ethiopia into regional states based on settlement patterns, language, and consent of peoples."),
        Flashcard("fc_h8_7", "history", "hist_u8", "National Dialogue and Reconciliation", "Establishment of national commissions to foster inclusive political consensus and sustainable peaceful coexistence across communities."),

        // Unit 9: Indigenous Knowledge and Heritages of Ethiopia
        Flashcard("fc_h9_1", "history", "hist_u9", "Aksumite Obelisks (Stelae)", "Enormous monolithic granite stelae carved and erected in Aksum during the 3rd–4th centuries CE marking underground royal tombs."),
        Flashcard("fc_h9_2", "history", "hist_u9", "Rock-Hewn Churches of Lalibela", "Eleven UNESCO World Heritage monolithic churches chiseled out of solid volcanic rock in the 12th–13th century under King Lalibela."),
        Flashcard("fc_h9_3", "history", "hist_u9", "Gadaa Democratic System", "Indigenous socio-political generation-class system of the Oromo people inscribed on UNESCO's Intangible Cultural Heritage list."),
        Flashcard("fc_h9_4", "history", "hist_u9", "Fasil Ghebbi (Gondar Castles)", "Fortified imperial compound in Gondar built by Emperor Fasilides and successors in the 17th century combining European, Arab, and Axumite styles."),
        Flashcard("fc_h9_5", "history", "hist_u9", "Harar Jugol (Fortified Historic Town)", "Historic walled Islamic center with 82 mosques and 102 shrines, recognized by UNESCO as the fourth holiest city of Islam."),
        Flashcard("fc_h9_6", "history", "hist_u9", "Tiya Megalithic Site", "Archaeological site in central Ethiopia containing 36 carved anthropomorphic stone megaliths dating back to the 12th–14th century."),
        Flashcard("fc_h9_7", "history", "hist_u9", "Traditional Medicinal Knowledge", "Centuries-old botanical pharmacopeia utilized by indigenous healers to treat human and livestock ailments using indigenous herbs."),

        // ==========================================
        // 9. HEALTH & PHYSICAL EDUCATION (health_pe) — 8 units
        // ==========================================
        // Unit 1: Sport and Society
        Flashcard("fc_hp1_1", "health_pe", "health_u1", "Sociological Function of Sport", "Sport fosters social integration, community solidarity, interpersonal communication, civic discipline, and stress reduction."),
        Flashcard("fc_hp1_2", "health_pe", "health_u1", "Abebe Bikila's Olympic Legacy", "Won the 1960 Rome Olympic marathon running barefoot, becoming the first black African to win an Olympic gold medal."),
        Flashcard("fc_hp1_3", "health_pe", "health_u1", "Traditional Ethiopian Sports", "Cultural heritage games such as Genna (traditional field hockey), Gugs (horseback spear tournament), and Qille."),
        Flashcard("fc_hp1_4", "health_pe", "health_u1", "Gender Equity in Physical Activity", "Promoting equal athletic opportunities, facilities, and leadership roles for girls and women, eradicating cultural barriers."),
        Flashcard("fc_hp1_5", "health_pe", "health_u1", "Sport for Peace & Diplomacy", "Utilizing athletic tournaments to bring divided communities together, fostering mutual empathy and peaceful coexistence."),
        Flashcard("fc_hp1_6", "health_pe", "health_u1", "Economic Dimension of Sport", "Sports industry generates employment for coaches, athletes, equipment manufacturers, and promotes national tourism."),
        Flashcard("fc_hp1_7", "health_pe", "health_u1", "Inclusion of Persons with Disabilities", "Adapted physical education and Paralympic sports ensuring athletic access and dignity for individuals of all abilities."),

        // Unit 2: Health and Physical Fitness
        Flashcard("fc_hp2_1", "health_pe", "health_u2", "Cardiorespiratory Endurance", "The capacity of the heart and lungs to deliver oxygen-rich blood to working muscles during sustained physical exertion."),
        Flashcard("fc_hp2_2", "health_pe", "health_u2", "Muscular Strength vs Endurance", "Strength is the maximal force a muscle can generate in a single effort; endurance is the ability to sustain repeated contractions."),
        Flashcard("fc_hp2_3", "health_pe", "health_u2", "Flexibility", "The anatomical range of motion available at a joint or group of joints without experiencing pain or tissue injury."),
        Flashcard("fc_hp2_4", "health_pe", "health_u2", "F.I.T.T. Training Principle", "Framework for exercise prescription: Frequency (how often), Intensity (how hard), Time (how long), and Type (exercise mode)."),
        Flashcard("fc_hp2_5", "health_pe", "health_u2", "Target Heart Rate Zone", "Optimal aerobic exercise intensity zone, generally between 60% and 85% of estimated maximum heart rate (220 - age)."),
        Flashcard("fc_hp2_6", "health_pe", "health_u2", "Body Composition", "The relative proportion of fat mass to lean tissue (muscle, bone, water) in the human body, assessed via BMI or skinfolds."),
        Flashcard("fc_hp2_7", "health_pe", "health_u2", "Warm-Up and Cool-Down", "Warm-up prepares muscles and elevates heart rate to prevent injury; cool-down restores resting circulatory homeostasis."),

        // Unit 3: Athletics
        Flashcard("fc_hp3_1", "health_pe", "health_u3", "Sprint Events", "Short-distance maximum velocity races (100m, 200m, 400m) run in assigned lanes utilizing starting blocks."),
        Flashcard("fc_hp3_2", "health_pe", "health_u3", "Middle & Long-Distance Running", "Middle distance (800m, 1,500m) and long distance (5,000m, 10,000m, Marathon), where Ethiopia holds legendary world dominance."),
        Flashcard("fc_hp3_3", "health_pe", "health_u3", "Relay Exchange Technique", "Passing the baton between teammates inside the designated 20m takeover box using blind/non-visual exchanges in 4×100m."),
        Flashcard("fc_hp3_4", "health_pe", "health_u3", "Jumping Field Disciplines", "Horizontal jumps (Long Jump and Triple Jump) and vertical jumps (High Jump using Fosbury Flop, and Pole Vault)."),
        Flashcard("fc_hp3_5", "health_pe", "health_u3", "Throwing Field Disciplines", "Shot Put (glide or rotational technique), Discus Throw, Javelin Throw, and Hammer Throw from circular circles or runways."),
        Flashcard("fc_hp3_6", "health_pe", "health_u3", "Hurdle Races", "Sprint hurdles (110m hurdles for men, 100m for women, and 400m hurdles) demanding sprint speed and rhythmic obstacle clearance."),
        Flashcard("fc_hp3_7", "health_pe", "health_u3", "Aerobic Energy Systems in Running", "Oxidative phosphorylation utilizing glycogen and fats to produce cellular ATP during sustained endurance races."),

        // Unit 4: Football
        Flashcard("fc_hp4_1", "health_pe", "health_u4", "Dimensions & Players", "Played on a rectangular pitch (100–110m length) by two competing teams of 11 players each, including one designated goalkeeper."),
        Flashcard("fc_hp4_2", "health_pe", "health_u4", "Offside Rule (Law 11)", "A player is offside if closer to opponent's goal line than both ball and second-last opponent when ball is played to them."),
        Flashcard("fc_hp4_3", "health_pe", "health_u4", "Direct vs Indirect Free Kick", "Direct free kick can score a goal immediately without another touch; indirect free kick must touch another player first."),
        Flashcard("fc_hp4_4", "health_pe", "health_u4", "Penalty Kick Award", "Awarded when a defending player commits a direct free kick offense inside their own penalty area; taken from 11 meters."),
        Flashcard("fc_hp4_5", "health_pe", "health_u4", "Passing Techniques", "Push pass (inside of foot for short accuracy), instep driven pass (long balls), and lofted chip passes."),
        Flashcard("fc_hp4_6", "health_pe", "health_u4", "Dribbling and Ball Control", "Using various foot surfaces to maneuver past defenders while maintaining close peripheral ball control and vision."),
        Flashcard("fc_hp4_7", "health_pe", "health_u4", "Role of the Match Referee", "Enforces the 17 Laws of the Game, issues cautionary yellow or red cards, and maintains control of player safety."),

        // Unit 5: Volleyball
        Flashcard("fc_hp5_1", "health_pe", "health_u5", "Court Dimensions and Net", "18m × 9m court divided by a center net (height: 2.43m for men, 2.24m for women) with an attack line 3 meters from net."),
        Flashcard("fc_hp5_2", "health_pe", "health_u5", "Three-Hit Sequence", "Teams are allowed up to 3 consecutive ball touches before sending over the net, typically: Pass/Bump → Set → Spike."),
        Flashcard("fc_hp5_3", "health_pe", "health_u5", "Clockwise Rotation", "Players rotate clockwise through positions 1 through 6 each time their team wins back the right to serve (side-out)."),
        Flashcard("fc_hp5_4", "health_pe", "health_u5", "Forearm Pass (Bump)", "Joining hands and extending forearms to create a flat rebound platform for controlling incoming serves and hard spikes."),
        Flashcard("fc_hp5_5", "health_pe", "health_u5", "Overhead Set", "Using soft finger pads above the forehead to deliver a high, accurate ball for an attacking teammate to spike."),
        Flashcard("fc_hp5_6", "health_pe", "health_u5", "The Libero Specialist", "Defensive back-row specialist wearing a contrasting jersey who cannot serve, block, or attack above net height."),
        Flashcard("fc_hp5_7", "health_pe", "health_u5", "Rally Scoring System", "A point is scored on every single rally regardless of which team served; sets are won at 25 points (win by 2)."),

        // Unit 6: Basketball
        Flashcard("fc_hp6_1", "health_pe", "health_u6", "Team Size & Objective", "Played by two teams of 5 court players aiming to score by shooting the ball through a hoop elevated 3.05 meters (10 feet)."),
        Flashcard("fc_hp6_2", "health_pe", "health_u6", "Scoring Values", "Field goals inside arc = 2 points; shots behind perimeter arc = 3 points; uncontested foul free throws = 1 point each."),
        Flashcard("fc_hp6_3", "health_pe", "health_u6", "Traveling Violation", "Taking more than two steps without dribbling the ball, resulting in immediate turnover of possession."),
        Flashcard("fc_hp6_4", "health_pe", "health_u6", "Double Dribble", "Dribbling with both hands at once, or restarting a dribble after coming to a complete stop."),
        Flashcard("fc_hp6_5", "health_pe", "health_u6", "24-Second Shot Clock", "FIBA rule requiring the offensive team to attempt a field goal hitting the rim within 24 seconds of possessing the ball."),
        Flashcard("fc_hp6_6", "health_pe", "health_u6", "Zone Defense vs Man-to-Man", "Zone defense assigns players to guard specific floor areas; man-to-man assigns each defender to guard a specific opponent."),
        Flashcard("fc_hp6_7", "health_pe", "health_u6", "Personal and Team Fouls", "Illegal physical contact (holding, pushing, charging); a player with 5 fouls (FIBA) is disqualified from the game."),

        // Unit 7: Handball
        Flashcard("fc_hp7_1", "health_pe", "health_u7", "Court and Team Size", "40m × 20m court contested by 7 active players per team (6 outfield players plus 1 goalkeeper) with 3m × 2m goals."),
        Flashcard("fc_hp7_2", "health_pe", "health_u7", "Three-Step and Three-Second Rule", "Players may hold the ball for a maximum of 3 seconds and take up to 3 steps before passing, bouncing, or shooting."),
        Flashcard("fc_hp7_3", "health_pe", "health_u7", "6-Meter Goal Area (Crease)", "Only the goalkeeper is permitted inside the 6m D-zone; outfield attackers can jump and shoot before landing inside."),
        Flashcard("fc_hp7_4", "health_pe", "health_u7", "Jump Shot Technique", "Taking off from one foot outside the 6-meter line, releasing the ball at peak jump height before contacting the floor."),
        Flashcard("fc_hp7_5", "health_pe", "health_u7", "Two-Minute Suspension", "Penalty for serious fouls or unsportsmanlike conduct; the penalized team must play with one fewer player for 2 minutes."),
        Flashcard("fc_hp7_6", "health_pe", "health_u7", "Passive Play Warning", "Referees raise a hand to warn against delaying an attack without attempting to score; ball must be shot within limited passes."),
        Flashcard("fc_hp7_7", "health_pe", "health_u7", "7-Meter Penalty Throw", "Awarded when a clear scoring chance is illegally destroyed by a defender anywhere on the court."),

        // Unit 8: Self-Defense and Sport Ethics
        Flashcard("fc_hp8_1", "health_pe", "health_u8", "Core Goal of Self-Defense", "To preserve personal safety, cultivate situational awareness, avoid dangerous situations, and de-escalate confrontations."),
        Flashcard("fc_hp8_2", "health_pe", "health_u8", "Fair Play Ethics", "Playing within established rules, honoring match officials, treating competitors with dignity, and valuing integrity above victory."),
        Flashcard("fc_hp8_3", "health_pe", "health_u8", "Anti-Doping Regulations", "Strict prohibition of performance-enhancing drugs (anabolic steroids, EPO) to safeguard athlete health and equal competition."),
        Flashcard("fc_hp8_4", "health_pe", "health_u8", "R.I.C.E. Injury Protocol", "Immediate acute sprain/strain first aid: Rest, Ice (15-20 min), Compression bandage, Elevation above heart level."),
        Flashcard("fc_hp8_5", "health_pe", "health_u8", "Sportsmanship", "Gracious conduct in winning and losing, acknowledging great play by opponents, and fostering positive camaraderie."),
        Flashcard("fc_hp8_6", "health_pe", "health_u8", "De-escalation Strategies", "Using calm, confident body language, neutral voice tone, and active listening to defuse verbal conflicts before physical violence."),
        Flashcard("fc_hp8_7", "health_pe", "health_u8", "Concussion Awareness", "Recognizing traumatic brain injury signs (dizziness, nausea, photophobia, confusion); immediate removal from play is mandatory.")
    )
}
