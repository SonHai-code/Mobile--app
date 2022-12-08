package com.example.quizapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Constants {
    final static String USER_NAME = "user_name";
    final static String TOTAL_QUESTIONS = "total_questions";
    final static String CORRECT_ANSWER = "correct_answer";
    final static String CATEGORY = "category";
    final static String DIFFICULTY = "difficulty";
    final static String NUM_OF_HISTORIES = "numberOfHistories";


    public static ArrayList<Question> getQuestions(String difficulty, String category) {

        ArrayList<Question> filteredQuestionsList = new ArrayList<Question>();

        // GEOGRAPHY - EASY
        Question q1_geo_easy = new Question(
                1, "What country does this flag belong to?",
                R.drawable.ic_flag_of_argentina, "EASY", "GEOGRAPHY",
                "Argentina", "Australia",
                "Armenia", "Austria", 1
        );
        Question q2_geo_easy = new Question(
                2, "What country does this flag belong to?",
                R.drawable.ic_flag_of_australia,"EASY", "GEOGRAPHY",
                "Angola", "Austria",
                "Australia", "Armenia", 3
        );
        Question q3_geo_easy = new Question(
                3, "What country does this flag belong to?",
                R.drawable.ic_flag_of_brazil,"EASY", "GEOGRAPHY",
                "Belarus", "Belize",
                "Brunei", "Brazil", 4
        );
        Question q4_geo_easy = new Question(
                4, "What country does this flag belong to?",
                R.drawable.ic_flag_of_belgium, "EASY", "GEOGRAPHY",
                "Bahamas", "Belgium",
                "Barbados", "Belize", 2
        );
        Question q5_geo_easy = new Question(
                5, "What country does this flag belong to?",
                R.drawable.ic_flag_of_fiji, "EASY", "GEOGRAPHY",
                "Gabon", "France",
                "Fiji", "Finland", 3
        );
        Question q6_geo_easy = new Question(
                6, "What country does this flag belong to?",
                R.drawable.ic_flag_of_germany, "EASY", "GEOGRAPHY",
                "Germany", "Georgia",
                "Greece", "none of these", 1
        );
        Question q7_geo_easy = new Question(
                7, "What country does this flag belong to?",
                R.drawable.ic_flag_of_denmark, "EASY", "GEOGRAPHY",
                "Dominica", "Egypt",
                "Denmark", "Ethiopia", 3
        );
        Question q8_geo_easy = new Question(
                8, "What country does this flag belong to?",
                R.drawable.ic_flag_of_india, "EASY", "GEOGRAPHY",
                "Ireland", "Iran",
                "Hungary", "India", 4
        );
        Question q9_geo_easy = new Question(
                9, "What country does this flag belong to?",
                R.drawable.ic_flag_of_new_zealand, "EASY", "GEOGRAPHY",
                "Australia", "New Zealand",
                "Tuvalu", "United States of America", 2
        );
        Question q10_geo_easy = new Question(
                10, "What country does this flag belong to?",
                R.drawable.ic_flag_of_kuwait, "EASY", "GEOGRAPHY",
                "Kuwait", "Jordan",
                "Sudan", "Palestine", 1
        );

        // GEOGRAPHY - MEDIUM
        Question q1_geo_medium = new Question(11,"What is the largest canyon in the world?",
                0, "MEDIUM", "GEOGRAPHY",
                "Verdon Groge", "Fish River Canyon",
                "Colca Canyon", "Grand Canyon",4);

        Question q2_geo_medium = new Question(12,"How many countries are there in the world?",
                0, "MEDIUM", "GEOGRAPHY",
                "105", "145",
                "195", "245",3);

        Question q3_geo_medium = new Question(13,"Which one of the following countries is further North?",
                0, "MEDIUM", "GEOGRAPHY",
                "Scotland", "The Netherlands",
                "Belgium", "Poland",1);

        Question q4_geo_medium = new Question(14,"In which Mountain range can you find the Mont Blanc?",
                0, "MEDIUM", "GEOGRAPHY",
                "The Pyrenees", "Carpathian Mountains",
                "Caucasus Mountains", "The Alps",4);

        Question q5_geo_medium = new Question(15,"What is the longest river in the world?",
                0, "MEDIUM", "GEOGRAPHY",
                "Amazon River", "Yangtze River",
                "The Nile", "Yellow River",3);

        Question q6_geo_medium = new Question(16,"Which country is not located on the Golden Triangle?",
                0, "MEDIUM", "GEOGRAPHY",
                "Thailand", "Laos",
                "Myanmar", "China",4);

        Question q7_geo_medium = new Question(17,"What is the highest mountain in Japan?",
                0, "MEDIUM", "GEOGRAPHY",
                "Mount Kita", "Mount Fuji",
                "Mount Okuhotaka", "Mount Aino",2);

        Question q8_geo_medium = new Question(18,"In which country is Mount Kilimanjaro?",
                0, "MEDIUM", "GEOGRAPHY",
                "Kenya", "Congo",
                "Nigeria", "Tanzania",4);

        Question q9_geo_medium = new Question(19,"Which European city is not located on the Danube?",
                0, "MEDIUM", "GEOGRAPHY",
                "Budapest", "Vienna",
                "Belgrade", "Prague",4);

        Question q10_geo_medium = new Question(20,"What type of geographical landmark is K2?",
                0, "MEDIUM", "GEOGRAPHY",
                "A waterfall", "A river",
                "A mountain", "A beach",3);

        // GEOGRAPHY - HARD
        Question q1_geo_hard = new Question(21,"How long is the border between Canada and the USA?",
                0, "HARD", "GEOGRAPHY",
                "5,891 km", "6,891 km",
                "7,891 km", "8,891 km",4);

        Question q2_geo_hard = new Question(22,"What percentage of the world population lives in the Northern Hemisphere?",
                0, "HARD", "GEOGRAPHY",
                "57%", "67%",
                "77%", "87%",4);

        Question q3_geo_hard = new Question(23,"Which one of the following countries is not an enclave?",
                0, "HARD", "GEOGRAPHY",
                "Vatican", "Italy",
                "San Marino", "Lesotho",2);

        Question q4_geo_hard = new Question(24,"What percentage of the world population lives in the Northern Hemisphere?",
                0, "HARD", "GEOGRAPHY",
                "Whitsunday Islands", "Lamy Islands",
                "Buccaneer Islands", "Bonaparte Islands",1);

        Question q5_geo_hard = new Question(25,"What is the distance from London to Los Angeles?",
                0, "HARD", "GEOGRAPHY",
                "4,437 miles", "5,437 miles",
                "6,437 miles", "7,437 miles",2);

        Question q6_geo_hard = new Question(26,"How many countries does China share a border with?",
                0, "HARD", "GEOGRAPHY",
                "7", "10",
                "14", "19",3);

        Question q7_geo_hard = new Question(27,"How many islands are there in Sweden?",
                0, "HARD", "GEOGRAPHY",
                "7,570", "67,570",
                "167,570", "267,570",4);

        Question q8_geo_hard = new Question(28,"What was the lowest temperature ever recorded on the Earth?",
                0, "HARD", "GEOGRAPHY",
                "-59.2°C", "-69.2°C",
                "-79.2°C", "-89.2°C",4);

        Question q9_geo_hard = new Question(29,"How many time zones have France?",
                0, "HARD", "GEOGRAPHY",
                "1", "2",
                "6", "12",4);

        Question q10_geo_hard = new Question(30,"Which country is not home to Lake Victoria?",
                0, "HARD", "GEOGRAPHY",
                "Uganda", "Tanzania",
                "Rwanda", "Kenya",3);

        // MATH - EASY
        Question q1_math_easy = new Question(31,"19 + ... = 42",
                0, "EASY", "MATH",
                "23", "61",
                "0", "42",1);

        Question q2_math_easy = new Question(32,"What is the symbol of pi?",
                0, "EASY", "MATH",
                "€", "π",
                "Ω", "∞",2);

        Question q3_math_easy = new Question(33,"Arrange the numbers in ascending order: 36, 12, 29, 21, 7.",
                0, "EASY", "MATH",
                "36, 29, 21, 12, 7", "36, 29, 7, 21, 12",
                "7, 12, 21, 29, 36", " None of these",3);

        Question q4_math_easy = new Question(34,"What is the greatest two digit number?",
                0, "EASY", "MATH",
                "10", "90",
                "11", "99",4);

        Question q5_math_easy = new Question(35,"How much is 90 – 19?",
                0, "EASY", "MATH",
                "71", "109",
                "89", "None of these",1);

        Question q6_math_easy = new Question(36,"20 is divisible by ...",
                0, "EASY", "MATH",
                "1", "3",
                "7", "None of these",1);

        Question q7_math_easy = new Question(37,"Find the value of x; if x = (2 × 3) + 11.",
                0, "EASY", "MATH",
                "55", "192",
                "17", "66",3);

        Question q8_math_easy = new Question(38,"How much is 190 – 87 + 16?",
                0, "EASY", "MATH",
                "103", "261",
                "87", "119",4);

        Question q9_math_easy = new Question(39," What is the smallest three digit number?",
                0, "EASY", "MATH",
                "100", "999",
                "111", "101",1);

        Question q10_math_easy = new Question(40,"What is 1000 × 1 equal to?",
                0, "EASY", "MATH",
                "1", "1000",
                "0", " None of these",2);

        // MATH - MEDIUM
        Question q1_math_medium = new Question(41,"A line which cuts a pair of parallel lines is called",
                0, "MEDIUM", "MATH",
                "tangent", "chord",
                "traversal", "intersector",3);

        Question q2_math_medium = new Question(42,"An angle whose value is ____, is called complete angle.",
                0, "MEDIUM", "MATH",
                "180°", "240°",
                " 360°", "none of the above",3);

        Question q3_math_medium = new Question(43,"The areas of two similar triangles are 81 sq. cm and 49 sq. cm. Find the ratio of their corresponding heights.",
                0, "MEDIUM", "MATH",
                "9:7", "7:9",
                "6:5", "81:49",1);

        Question q4_math_medium = new Question(44,"Consider ΔABD such that angle ADB = 20° and C is a point on BD such that AB=AC and CD=CA. Then the measure of angle ABC is",
                0, "MEDIUM", "MATH",
                "30°", "40°",
                "45°", "60°",2);

        Question q5_math_medium = new Question(45,"If the length and breadth of a rectangle are increased by a% and b% respectively, then the area will be increased by",
                0, "MEDIUM", "MATH",
                "(a-b+2ab/100)%", "(a+b+2ab/100)%",
                "(a+b+ab/100)%", "(a-b+ab/100)%",3);

        Question q6_math_medium = new Question(46,"A, B and C can complete a piece of work in 14, 6 and 12 days respectively. Working together, they will complete the work in",
                0, "MEDIUM", "MATH",
                "19/9 days", "27 days",
                "28/9 days", "25/8 days",3);

        Question q7_math_medium = new Question(47,"If Px = Qy = Rz  and Q/P = R/Q, then 2z/(x+z) = ?",
                0, "MEDIUM", "MATH",
                "y/z", "y/x",
                "x/y", "z/y",2);

        Question q8_math_medium = new Question(48,"A shopkeeper purchases 15 mangoes for Rs. 10 and sells them at 10 mangoes for Rs. 15. Thus, he earns a profit of",
                0, "MEDIUM", "MATH",
                "50%", "75%",
                "80%", "125%",4);

        Question q9_math_medium = new Question(49,"4950/6 + 112 x 1.75 = ? x 2",
                0, "MEDIUM", "MATH",
                "510.5", "505.2",
                "515.5", "none of the above",1);

        Question q10_math_medium = new Question(50,"If a certain sum of money can become 5 times of its principal in 10 years, then the rate of interest is",
                0, "MEDIUM", "MATH",
                "20%", "30%",
                "40%", "50%",3);

        // MATH - HARD
        Question q1_math_hard = new Question(51,"A long rope has to be cut to make 23 small pieces. If it is double folded to start with how many times does it need to be cut?",
                0, "HARD", "MATH",
                "9", "23",
                "11", "12",3);

        Question q2_math_hard = new Question(52,"Ruby’s height is 5’2”. Ana is taller than Ruby but she is not taller than Pamela. Pamela is shorter than her cousin Ron but she is not shorter than Ruby. Who is the tallest in the group?",
                0, "HARD", "MATH",
                "Ana", "Ron",
                "Pamela", "Ruby",2);

        Question q3_math_hard = new Question(53,"A river flows west to east and on the way turns left and go in a semi-circle round a hillock, and then turns left at right-angles. In what direction is the river finally flowing?",
                0, "HARD", "MATH",
                "North", "South",
                "East", "West",3);

        Question q4_math_hard = new Question(54,"A clock seen through a mirror, shows quarter past three. What is the correct time shown by the clock?",
                0, "HARD", "MATH",
                "3.15", "8.45",
                "9.15", "9.45",2);

        Question q5_math_hard = new Question(55,"A clock seen through a mirror shows 8 o’clock. What is the correct time?",
                0, "HARD", "MATH",
                "8.00", "4.00",
                "12.20", "12.40",2);

        Question q6_math_hard = new Question(56,"Tom was not at school on Saturday last. He was first absent for four days before that. Today is Monday, the 31st of October. When was Tom first absent? Give the day and date.",
                0, "HARD", "MATH",
                "Monday, Oct. 24", "Tuesday, Oct. 25",
                "Wednesday, Oct. 26", "Thursday, Oct. 27",2);

        Question q7_math_hard = new Question(57,"If the day tomorrow is Sunday, what was it yesterday?",
                0, "HARD", "MATH",
                "Wednesday", "Thursday",
                "Friday", "Saturday",3);

        Question q8_math_hard = new Question(58,"A clock shows the time as 12.20. What is the angle the hour hand makes with the minutes hand?",
                0, "HARD", "MATH",
                "100", "110",
                "120", "130",2);

        Question q9_math_hard = new Question(59," What is the angle the hour hand of a clock makes with the minute hand when the time is 15.40?",
                0, "HARD", "MATH",
                "110", "120",
                "125", "130 and 75",4);

        Question q10_math_hard = new Question(60,"78 ÷ 5 ÷ 0.5 = ?",
                0, "HARD", "MATH",
                "15.6", "31.2 km",
                "7.8 km", "20.4 km",2);

        // HISTORY - EASY
        Question q1_history_easy = new Question(61,"Which famous world leader was accused at the Rivonia Trial?",
                0, "EASY", "HISTORY",
                "Martin Luther King", "Subhas Chandra Bose",
                "Nelson Mandela", "None of the above",3);

        Question q2_history_easy = new Question(62,"Who among the following wrote the 16th-century political treatise “The Prince”?",
                0, "EASY", "HISTORY",
                "Emile Zola", "Niccolo Machiavell",
                "V.S. Naipaul", "George Bernard Shaw",2);

        Question q3_history_easy = new Question(63,"Great Pyramid of Giza’s is located in which country?",
                0, "EASY", "HISTORY",
                "Iraq", "Egypt",
                "Lebanon", "Israel",2);

        Question q4_history_easy = new Question(64,"The Babylonian Empire was founded by which of the following king?",
                0, "EASY", "HISTORY",
                "Hammurabi", "Herodotus",
                "Marduk", "Shalmaneser IV",1);

        Question q5_history_easy = new Question(65,"Which of the following was founded in the province of Attica?",
                0, "EASY", "HISTORY",
                "Thiva", "Athens",
                "Patras", "Eritrea",2);

        Question q6_history_easy = new Question(66,"Age of Pericles is regarded as the ‘Golden Age’ in the history of which of the following?",
                0, "EASY", "HISTORY",
                " Chinese", " Greeks",
                "Mesopotamians", "Romans",2);

        Question q7_history_easy = new Question(67,"Which of the following society was divided into two segments- Patrician or the upper Class and Plebian or the poor commoners?",
                0, "EASY", "HISTORY",
                "Greek society", "Roman society",
                "Babylonian society", "None of the above",1);

        Question q8_history_easy = new Question(68,"Which of the following were sent to preach Christianity to the world?",
                0, "EASY", "HISTORY",
                "Disciples", "Priests",
                "Bishops", "Apostles",4);

        Question q9_history_easy = new Question(69,"Which of the following awarded capital punishment to the Jesus?",
                0, "EASY", "HISTORY",
                "Marullus", "Agrippa I",
                "Marcellus", "Pontius Pilate",4);

        Question q10_history_easy = new Question(70,"Which of the following periods is known as the Feudal Age??",
                0, "EASY", "HISTORY",
                "9th to 14th century A.D.", "7th to 10th century A.D.",
                "4th to 7th century A.D. Mandela", "None of the above",1);

        // HISTORY - MEDIUM
        Question q1_history_medium = new Question(71,"Whose death sparked World War I?",
                0, "MEDIUM", "HISTORY",
                "Kaiser Wilhelm", "Archbishop Ussher",
                "Queen Victoria", "Archduke Franz Ferdinand",4);

        Question q2_history_medium = new Question(72,"Which of these nations was neutral in World War I?",
                0, "MEDIUM", "HISTORY",
                "Germany", "Norway",
                "Italy", "England",2);

        Question q3_history_medium = new Question(73,"Which of these ships was sunk by a German submarine?",
                0, "MEDIUM", "HISTORY",
                "Arizona", "Lusitania",
                "Titanic", "Andrea Doria",2);

        Question q4_history_medium = new Question(74,"Which weapon was first used at the Battle of the Somme in World War I?",
                0, "MEDIUM", "HISTORY",
                "Submarine", "Tank",
                "Jet fighter", "Chariot",2);

        Question q5_history_medium = new Question(75,"World War I ended in:",
                0, "MEDIUM", "HISTORY",
                "1925", "1918",
                "1920", "1915",2);

        Question q6_history_medium = new Question(76,"Which of these people was a spy in World War I?",
                0, "MEDIUM", "HISTORY",
                "James Bond", "Mata Hari",
                "Benedict Arnold", "Serge Plekhanov",2);

        Question q7_history_medium = new Question(77,"How many republics made up the former Soviet Union?",
                0, "MEDIUM", "HISTORY",
                "15", "12",
                "20", "10",1);

        Question q8_history_medium = new Question(78,"When was the first Nobel Prize in economics awarded?",
                0, "MEDIUM", "HISTORY",
                "1969", "1949",
                "1909", "1929",1);

        Question q9_history_medium = new Question(79,"Which book was written by Niccolò Machiavelli?",
                0, "MEDIUM", "HISTORY",
                "The Once and Future King", "The Prince",
                "The Good Earth", "War and Peace",2);

        Question q10_history_medium = new Question(80," Of what country was Simón Bolívar president?",
                0, "MEDIUM", "HISTORY",
                "Bolivia", "Peru",
                "Argentina", "Chile",2);

        // HISTORY - HARD
        Question q1_history_hard = new Question(81,"Which Indian president was involved in the struggle for Irish independence?",
                0, "HARD", "HISTORY",
                "V.V. Giri", "Neelam Sanjiva Reddy",
                "Gulzarilal Nanda", "S. Radhakrishnan",1);

        Question q2_history_hard = new Question(82,"Who was Karl Marx’s associate and fellow political theoretician?",
                0, "HARD", "HISTORY",
                "Friedrich Nietzsche", "Friedrich II",
                "Friedrich Engels", "Friedrich Reich",3);

        Question q3_history_hard = new Question(83,"Where were the Aegean Bronze Age civilizations located?",
                0, "HARD", "HISTORY",
                "Algeria", "India",
                "Greece", "Spain",3);

        Question q4_history_hard = new Question(84,"Which of these battles did not involve Roman soldiers?",
                0, "HARD", "HISTORY",
                "Arretium", "Chalons",
                "Cannae", "Thermopylae",4);

        Question q5_history_hard = new Question(85,"Through which national park does the Continental Divide not pass?",
                0, "HARD", "HISTORY",
                "Yellowstone", "Rocky Mountain",
                "Glacier", "Yosemite",4);

        Question q6_history_hard = new Question(86,"On what peninsula in Washington would you find the Olympic Mountains?",
                0, "HARD", "HISTORY",
                "Seattle Peninsula", "Puget Peninsula",
                "Washington Peninsula", "Olympic Peninsula",4);

        Question q7_history_hard = new Question(87,"Who was the first U.S. president to appear on television?",
                0, "HARD", "HISTORY",
                "Richard Nixon", "Ronald Reagan",
                "Abraham Lincoln", "Franklin Delano Roosevelt",4);

        Question q8_history_hard = new Question(88,"What automobile was named after Henry Ford’s only son?",
                0, "HARD", "HISTORY",
                "Buick", "Oldsmobile",
                "Isuzu", "Edsel",4);

        Question q9_history_hard = new Question(89,"In what American state would you find Denali?",
                0, "HARD", "HISTORY",
                "the District of Columbia", "North Carolina",
                "West Virginia", "Maryland",3);

        Question q10_history_hard = new Question(90,"Which modern states does the Natchez Trace join?",
                0, "HARD", "HISTORY",
                "Mississippi and Alabama", "Mississippi and Arkansas",
                "Mississippi and Louisiana", "Mississippi and Tennessee",4);


        // SCIENCE - EASY
        Question q1_science_easy = new Question(91,"Brass gets discoloured in air because of the presence of which of the following gases in air?",
                0, "EASY", "SCIENCE",
                "Oxygen", "Hydrogen sulphide",
                "Carbon dioxide", "Nitrogen",2);

        Question q2_science_easy = new Question(92,"Which of the following is a non metal that remains liquid at room temperature?",
                0, "EASY", "SCIENCE",
                "Phosphorous", "Bromine",
                "Chlorine", "Helium",2);

        Question q3_science_easy = new Question(93,"Chlorophyll is a naturally occurring chelate compound in which central metal is",
                0, "EASY", "SCIENCE",
                "copper", "magnesium",
                "iron", "calcium",2);

        Question q4_science_easy = new Question(94,
                "Which of the following is used in pencils?",
                0, "EASY", "SCIENCE",
                "Graphite", "Silicon",
                "Charcoal", "Phosphorous",1);

        Question q5_science_easy = new Question(95,"Which of the following metals forms an amalgam with other metals?",
                0, "EASY", "SCIENCE",
                "Tin", "Mercury",
                "Lead", "Zinc",2);

        Question q6_science_easy = new Question(96,"Chemical formula for water is",
                0, "EASY", "SCIENCE",
                "NaAlO2", "H2O",
                "Al2O3", "CaSiO3",2);

        Question q7_science_easy = new Question(97,
                "Washing soda is the common name for",
                0, "EASY", "SCIENCE",
                "Sodium carbonate", "Calcium bicarbonate",
                "Sodium bicarbonate", "Calcium carbonate",1);

        Question q8_science_easy = new Question(98,"\t\n" +
                "The gas usually filled in the electric bulb is",
                0, "EASY", "SCIENCE",
                "nitrogen", "hydrogen",
                "carbon dioxide", "oxygen",1);

        Question q9_science_easy = new Question(99,"Quartz crystals normally used in quartz clocks etc. is chemically",
                0, "EASY", "SCIENCE",
                "silicon dioxide", "germanium oxide",
                "a mixture of germanium oxide and silicon dioxide", "sodium silicate",1);

        Question q10_science_easy = new Question(100,"Which of the gas is not known as green house gas?",
                0, "EASY", "SCIENCE",
                "Methane", "Nitrous oxide",
                "Carbon dioxide", "Hydrogen",4);

        // SCIENCE - MEDIUM
        Question q1_science_medium = new Question(101,"Human teeth and elephant’s tusk are",
                0, "MEDIUM", "SCIENCE",
                "Analogous organs", "Vestigeal organs",
                "Homologous organs", "Rudimentary organs",3);

        Question q2_science_medium = new Question(102,"Independent inheritance of two separate traits, shape and colour of seeds in Mendel’s cross on pea plants resulted in a observable ratio of:\n",
                0, "MEDIUM", "SCIENCE",
                "3 : 1", " 9 : 3 : 3 : 1",
                "1 : 1", " 9 : 4 : 2 : 1",2);

        Question q3_science_medium = new Question(103,"Which of these is not a vestigial organ in human beings?",
                0, "MEDIUM", "SCIENCE",
                "Appendix", "Wisdom tooth",
                "Nictitating membrane", " Gall bladder",4);

        Question q4_science_medium = new Question(104,"Evolution of wild cabbage is an example of:",
                0, "MEDIUM", "SCIENCE",
                "Artificial selection", "Natural selection",
                "Mutation", "Genetic drift",1);

        Question q5_science_medium = new Question(105,"The modern day Human species has evolved from its earliest ancestors who lived in:",
                0, "MEDIUM", "SCIENCE",
                "Asia", "Australia",
                "Africa", "China",3);

        Question q6_science_medium = new Question(106,"Two pink coloured flowers on crossing resulted in 1 red, 2 pink and 1 white flower progeny. The nature of the cross will be",
                0, "MEDIUM", "SCIENCE",
                "double fertilisation", "self pollination",
                "cross fertilisation", "no fertilisation",2);

        Question q7_science_medium = new Question(107,"Which of the following statement is incorrect?\n",
                0, "MEDIUM", "SCIENCE",
                "For every hormone there is a gene", "For every protein there is a gene.",
                "For production of every enzyme there is a gene.", "For every molecule of fat there is a gene",4);

        Question q8_science_medium = new Question(108,"If a round, green seeded pea plant (RR yy) is crossed with wrinkled, yellow seeded pea plant (rr YY), the seeds produced in F1 generation are",
                0, "MEDIUM", "SCIENCE",
                "Oxygen", "Hydrogen",
                "Carbon", "Nitrogen",2);

        Question q9_science_medium = new Question(109,"xx",
                0, "MEDIUM", "SCIENCE",
                "round and yellow", "round and green",
                "wrinkled and green", "wrinkled and yellow",1);

        Question q10_science_medium = new Question(110,"A zygote which has an X-chromosome inherited from the father will develop into a",
                0, "MEDIUM", "SCIENCE",
                "boy", "girl",
                "X- chromosome does not determine the sex of a child", "either boy or girl",2);

        // SCIENCE - HARD
        Question q1_science_hard = new Question(111,"Which among the following is the most common method of pollination in flowers without petals?",
                0, "HARD", "SCIENCE",
                "Wind", "Water",
                "Insects", "All of above",1);

        Question q2_science_hard = new Question(112,"The name of Karl Landsteiner is associated with the discovery of which of the following ?",
                0, "HARD", "SCIENCE",
                "Human Endocrine System", "Human Blood Groups",
                "Vitamin B Group", "Proteins",2);

        Question q3_science_hard = new Question(113,"What is the slope of the velocity-time graph when an object moves with constant negative acceleration, having positive initial velocity?",
                0, "HARD", "SCIENCE",
                "90°", "more than 90°",
                "less than 90°", "0°",2);

        Question q4_science_hard = new Question(114,"What is the name of the Information and Communication technology based multi-modal platform for governance, chaired by the Prime Minister?",
                0, "HARD", "SCIENCE",
                "PRATAP", "PRAGATI",
                "PRANAT", "PAWAN",2);

        Question q5_science_hard = new Question(115,"Magnetic Effect of Electric Current Class 10 MCQ Question 1. Magnetic effect of current was discovered by",
                0, "HARD", "SCIENCE",
                "Oersted", "Faraday",
                "Bohr", "Ampere",1);

        Question q6_science_hard = new Question(116,"A current through a horizontal power line flows from south to North direction. The direction of magnetic field line 0.5m above it is",
                0, "HARD", "SCIENCE",
                "North", "South",
                "West", "East",1);

        Question q7_science_hard = new Question(117,"MCQ Questions for Class 10 Magnetic Effect of Electric Current Question 10. The strength of each of magnet reduces to half when it cut along its length into the equal parts magnetic field strength of a solenoid. Polarity of solenoid can be determined by",
                0, "HARD", "SCIENCE",
                "boy", "girl",
                "X", "either",2);

        Question q8_science_hard = new Question(118,"MCQ Questions for Class 10 Magnetic Effect of Electric Current Question 10",
                0, "HARD", "SCIENCE",
                "use of compass needle", "Right hand thumb rule",
                "fleming left hand rule", "either (a) or (b)",4);

        Question q9_science_hard = new Question(119,"A soft iron bar is introduced inside the current carrying solenoid. The magnetic field inside the solenoid",
                0, "HARD", "SCIENCE",
                "will decrease", "will remains same",
                "will increase", "will become zero",3);

        Question q10_science_hard = new Question(120,"The magnetic field lines always begin from",
                0, "HARD", "SCIENCE",
                "N-pole and end on S-pole.", "S-pole and end on N-pole.",
                "start from the middle and end at N-pole.", "start from the middle and end at S-pole.",1);


        List<Question> questions = List.of(q1_geo_easy,q2_geo_easy,q3_geo_easy,q4_geo_easy,q5_geo_easy,
                                           q6_geo_easy,q7_geo_easy,q8_geo_easy,q9_geo_easy,q10_geo_easy,

                                           q1_geo_medium,q2_geo_medium,q3_geo_medium,q4_geo_medium,q5_geo_medium,
                                           q6_geo_medium,q7_geo_medium, q8_geo_medium, q9_geo_medium, q10_geo_medium,

                                           q1_geo_hard, q2_geo_hard, q3_geo_hard, q4_geo_hard, q5_geo_hard,
                                           q6_geo_hard, q7_geo_hard, q8_geo_hard, q9_geo_hard, q10_geo_hard,

                                           q1_math_easy, q2_math_easy, q3_math_easy, q4_math_easy,q5_math_easy,
                                           q6_math_easy, q7_math_easy, q8_math_easy, q9_math_easy, q10_math_easy,

                                           q1_math_medium, q2_math_medium, q3_math_medium, q4_math_medium, q5_math_medium,
                                           q6_math_medium, q7_math_medium, q8_math_medium, q9_math_medium, q10_math_medium,

                                           q1_math_hard, q2_math_hard,q3_math_hard, q4_math_hard, q5_math_hard,
                                           q6_math_hard, q7_math_hard, q8_math_hard, q9_math_hard, q10_math_hard,

                                           q1_history_easy,q2_history_easy,q3_history_easy,q4_history_easy,q5_history_easy,
                                           q6_history_easy,q7_history_easy,q8_history_easy,q9_history_easy,q10_history_easy,

                                           q1_history_medium,q2_history_medium,q3_history_medium,q4_history_medium,q5_history_medium,
                                           q6_history_medium,q7_history_medium,q8_history_medium,q9_history_medium,q10_history_medium,

                                           q1_history_hard,q2_history_hard,q3_history_hard,q4_history_hard,q5_history_hard,
                                           q6_history_hard,q7_history_hard,q8_history_hard,q9_history_hard,q10_history_hard,

                                           q1_science_easy, q2_science_easy, q3_science_easy, q4_science_easy, q5_science_easy,
                                           q6_science_easy, q7_science_easy, q8_science_easy, q9_science_easy, q10_science_easy,

                                           q1_science_medium, q2_science_medium, q3_science_medium, q4_science_medium, q5_science_medium,
                                           q6_science_medium, q7_science_medium, q8_science_medium, q9_science_medium, q10_science_medium,

                                           q1_science_hard, q2_science_hard, q3_science_hard, q4_science_hard, q5_science_hard,
                                           q6_science_hard, q7_science_hard, q8_science_hard, q9_science_hard, q10_science_hard
                                            );


        // Adding single question to result questions list
        // Condition (category & difficulty)
        for (Question question : questions) {
            if(question.getDifficulty().toString().equals(difficulty) && question.getCategory().toString().equals(category) ) {
                filteredQuestionsList.add(question);
            }
        }

        return filteredQuestionsList;
    }
}
