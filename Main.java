/*
 * Created by Matthew on 12/09/2016. assignment 1
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Matthew's Mineral Super Trumps game!");
        System.out.println("Menu options;\n(R)ules\n(P)lay\n(Q)uit");
        Scanner menuInput = new Scanner(System.in);
        String menuOutput = menuInput.nextLine().toLowerCase();
        while (!menuOutput.equalsIgnoreCase("q"))
            if (menuOutput.equalsIgnoreCase("p")) {
                System.out.println("Please enter the number of players in this game (3-5)");
                int playerCountOutput = menuInput.nextInt();
                System.out.println(playerCountOutput);
                if (playerCountOutput >= 3 && playerCountOutput <= 5) {
                    gamePlay(playerCountOutput);
                    System.out.println("Menu options;\n(R)ules\n(P)lay\n(Q)uit");
                    menuOutput = menuInput.nextLine().toLowerCase();
                } else {
                    System.out.println("The number of players in this game must be 3, 4 or 5 only.....");
                }
            }
            else if (menuOutput.equalsIgnoreCase("r")){
                System.out.println("Mineral Supertrumps: Details and rules of the game\n\n" +
                        "Mineral Supertrumps is a game designed to help players learn about the\n" +
                        "properties and uses of economically-significant and common rock-forming\n" +
                        "minerals. The pack consists of 54 mineral cards and 6 “supertrump” cards\n" +
                        "(see the list below of card names). Each mineral card includes information\n" +
                        "about the mineral such as the generic chemical formula, the classification,\n" +
                        "crystal system, the geological environment where the mineral is commonly\n" +
                        "found or formed (igneous, metamorphic, sedimentary, or the mantle), as well\n" +
                        "as information in the five playing categories (or trumps) of Hardness, Specific\n" +
                        "Gravity, Cleavage, Crustal Abundance, and Economic Value. The first three\n" +
                        "trump categories relate to distinct physical properties of the mineral, while last\n" +
                        "two categories rate the importance of the mineral in terms of abundance in the\n" +
                        "Earths crust (continental and oceanic) and value to modern societies.\n" +
                        "The cards are also color-coded by mineral groups: silicates = light green,\n" +
                        "oxides = blue, sulfides = orange, carbonates = light brown, phosphates =\n" +
                        "purple, sulfates = light blue, halides = pink, native elements = white.\n" +
                        "Number of players: 3 to 5\n\n" +
                        "Objective: To be the first player to lose all of your cards\n\n" +
                        "How to play:\n\n" +
                        "1. A dealer (randomly chosen) shuffles the cards and deals each player 8\n" +
                        "cards. Each player can look at their cards, but should not show them to\n" +
                        "other players. The remaining card pack is placed face down on the table.\n\n" +
                        "2. The player to the left of the dealer goes first by placing a mineral card on\n" +
                        "the table. The player must state the mineral name, one of the five trump\n" +
                        "categories (i.e., either Hardness, Specific Gravity, Cleavage, Crustal\n" +
                        "Abundance, or Economic Value), and the top value of that category. For\n" +
                        "example, a player placing the Glaucophane card may state “Glaucophane,\n" +
                        "Specific Gravity, 3.2”\n\n" +
                        "3. The player next to the left takes the next turn. This player must play a\n" +
                        "mineral card that has a higher value in the trump category than the card\n" +
                        "played by the previous player. In the case of the example of the\n" +
                        "Glaucophane card above, the player must place a card that has a value for\n" +
                        "specific gravity above 3.2. The game continues with the next player to the\n" +
                        "left, and so on.\n\n4. If a player does not have any mineral cards that are" +
                        " of higher value for the\n" +
                        "specific trump category being played, then the player must pass and pick up\n" +
                        "one card from the card pack on the table. The player then cannot play again\n" +
                        "until all but one player has passed, or until another player throws a\n" +
                        "supertrump card to change the trump category, as described below. A player\n" +
                        "is allowed to pass even if they still hold cards that could be played. \n\n" +
                        "5. If the player has a supertrump card (The Miner, The Geologist, The\n" +
                        "Geophysicist, The Petrologist, The Mineralogist, The Gemmologist) they\n" +
                        "may play this card at any of their turns. By placing a supertrump card, the\n" +
                        "player changes the trump category according to the instructions on the\n" +
                        "supertrump card. The player then plays a mineral card of their choice to\n" +
                        "resume play. At this stage, any other player who had passed on the previous\n" +
                        "round is now able to play again. If a player happens to hold both The\n" +
                        "Geophysicist card and the Magnetite card in their hand, then that player can\n" +
                        "place both cards together to win the round.\n\n" +
                        "6. The game continues with players taking turns to play cards until all but one\n" +
                        "player has passed. The last player then gets to lead out the next round and\n" +
                        "chooses the trump category to be played.\n\n" +
                        "7. The winner of the game is the first player to lose all of their cards. The\n" +
                        "game continues until all but one player (i.e., the loser) has lost their cards.\n\n" +
                        "Information on trump categories:\n\n" +
                        "Hardness: relates to Moh’s hardness scale of minerals from 1 to 10. Where a\n" +
                        "range of values is presented, the highest value should be used.\n\n" +
                        "Specific Gravity: in grams per cubic centimeter. Where a range of values is\n" +
                        "presented, the highest value should be used.\n\n" +
                        "Cleavage: refers to the number of cleavage planes and how well the planes\n" +
                        "are typically expressed in the crystal. For example, “1 perfect, 2 poor” means\n" +
                        "the mineral has 1 perfect cleavage plane, and 2 poor cleavage planes. The\n" +
                        "order of ranking from lowest to highest is:\n" +
                        "none > poor/none > 1 poor > 2 poor > 1 good > 1 good, 1 poor > 2\n" +
                        "good > 3 good > 1 perfect > 1 perfect, 1 good > 1 perfect, 2 good > 2\n" +
                        "perfect, 1 good > 3 perfect > 4 perfect > 6 perfect.\n\n" +
                        "Crustal abundance: is ranked from lowest to highest as: ultratrace > trace\n" +
                        "> low > moderate > high > very high.\n" +
                        "Economic value: is ranked from lowest to highest as: trivial > low è\n\n" +
                        "moderate > high > very high > I’m rich! ");
                System.out.println("Menu options;\n(R)ules\n(P)lay\n(Q)uit");
                menuOutput = menuInput.nextLine().toLowerCase();
            }
            else {
                System.out.println("Please choose from the following options only;\n(R)ules\n(P)lay\n(Q)uit");
                menuOutput = menuInput.nextLine().toLowerCase();
            }
        System.out.println("Exiting the game.");
    }

    public static void gamePlay(int players) {
//      Total players in a game.
        int TOTALPLAYERS = players;
//      Check to see if all players - 1 have passed.
        int playerPassThreshold = 0;
//      Value to assign decks to players based on number selected.
        int playerDecksCount = players - 1;
//      Selector for each Players given turn.
        int playerTurn = 0;
//      Rounds progressed through.
        int roundNumber = 0;
        String specificationString = "";
        String specificationCategory = "";
        Boolean winnerDeclared = false;
//      Checks if a player has passed their turn during a round.
        Boolean playerOnePass = false;
        Boolean playerTwoPass = false;
        Boolean playerThreePass = false;
        Boolean playerFourPass = false;
        Boolean playerFivePass = false;
//      Creates the array that is used to reference all the cards in the game.
        ArrayList<String> cardListLocal = new ArrayList<String>();
        cardListLocal.add("Quartz");
        cardListLocal.add("Plagioclase");
        cardListLocal.add("Orthoclase");
        cardListLocal.add("Biotite");
        cardListLocal.add("Muscovite");
        cardListLocal.add("Hornblende");
        cardListLocal.add("Actinolite");
        cardListLocal.add("Glaucophane");
        cardListLocal.add("Olivine");
        cardListLocal.add("Garnet");
        cardListLocal.add("Titanite");
        cardListLocal.add("Zircon");
        cardListLocal.add("Augite");
        cardListLocal.add("Orthopyroxene");
        cardListLocal.add("Chlorite");
        cardListLocal.add("Antigorite");
        cardListLocal.add("Talc");
        cardListLocal.add("Kaolinite");
        cardListLocal.add("Andalusite");
        cardListLocal.add("Kyanite");
        cardListLocal.add("Sillimanite");
        cardListLocal.add("Staurolite");
        cardListLocal.add("Epidote");
        cardListLocal.add("Tourmaline");
        cardListLocal.add("Topaz");
        cardListLocal.add("Beryl");
        cardListLocal.add("Pyrite");
        cardListLocal.add("Pyrrhotite");
        cardListLocal.add("Chalcopyrite");
        cardListLocal.add("Galena");
        cardListLocal.add("Sphalerite");
        cardListLocal.add("Molybdenite");
        cardListLocal.add("Gypsum");
        cardListLocal.add("Barite");
        cardListLocal.add("Apatite");
        cardListLocal.add("Monazite");
        cardListLocal.add("Calcite");
        cardListLocal.add("Dolomite");
        cardListLocal.add("Magnesite");
        cardListLocal.add("Siderite");
        cardListLocal.add("Magnetite");
        cardListLocal.add("Hematite");
        cardListLocal.add("Chromite");
        cardListLocal.add("Ilmenite");
        cardListLocal.add("Rutile");
        cardListLocal.add("Corundum");
        cardListLocal.add("Cassiterite");
        cardListLocal.add("Gibbsite");
        cardListLocal.add("Goethite");
        cardListLocal.add("Halite");
        cardListLocal.add("Fluorite");
        cardListLocal.add("Gold");
        cardListLocal.add("Diamond");
        cardListLocal.add("Graphite");
        cardListLocal.add("The Miner");
        cardListLocal.add("The Petrologist");
        cardListLocal.add("The Gemmologist");
        cardListLocal.add("The Mineralogist");
        cardListLocal.add("The Geophysicist");
        cardListLocal.add("The Geologist");

        players = players - 1;
//      Creates an array to generate a range of randomly selected integers.
        ArrayList<Integer> cardsInDeck = new ArrayList<Integer>();
        ArrayList<Integer> cardsPool = new ArrayList<Integer>();
//      Creates a multi-dimensional array to hold each players deck.
        List<List<Integer>> playList = new ArrayList<List<Integer>>(5);
        for (int i = 0; i < 5; ++i) {
            playList.add(new ArrayList<Integer>());
        }
        for (int i = 0; i <60; ++i){
            cardsInDeck.add(i);
        }
//      Integer based list of player cards.
        ArrayList<String> playerOneCards = new ArrayList<String>();
        ArrayList<String> playerTwoCards = new ArrayList<String>();
        ArrayList<String> playerThreeCards = new ArrayList<String>();
        ArrayList<String> playerFourCards = new ArrayList<String>();
        ArrayList<String> playerFiveCards = new ArrayList<String>();


//      Continue drawing numbers to correspond to cards, until eight non-duplicates.
        Random randomNumber = new Random();
        while (players >= 0) {
            int drawTotal = 8;
            while (drawTotal > 0) {
                boolean duplicateFlag = false;
                int randomlyDrawnNumber = randomNumber.nextInt(60);
                for (int cards : cardsPool) {
                    if (randomlyDrawnNumber == cards) {
                        duplicateFlag = true;
                    }
                }
                if (!duplicateFlag) {
                    playList.get(players).add(randomlyDrawnNumber);
                    cardsPool.add(randomlyDrawnNumber);
                    drawTotal--;
                }
            }
            players--;
        }
        /*Takes randomly generated non-duplicate numbers from each players list,
         then references them against cards.*/
        while (playerDecksCount >= 0)
        {
            if (playerDecksCount == 4)
            {
                for (int playingCards : playList.get(playerDecksCount)) {
                    playerFiveCards.add(cardListLocal.subList(playingCards, playingCards + 1).toString());
                    cardsInDeck.remove(cardsInDeck.indexOf(playingCards));
                }
            }
            else if (playerDecksCount == 3)
            {
                for (int playingCards : playList.get(playerDecksCount)) {
                    playerFourCards.add(cardListLocal.subList(playingCards, playingCards + 1).toString());
                    cardsInDeck.remove(cardsInDeck.indexOf(playingCards));
                }
            }
            else if (playerDecksCount == 2){
                for (int playingCards : playList.get(playerDecksCount)) {
                    playerThreeCards.add(cardListLocal.subList(playingCards, playingCards + 1).toString());
                    cardsInDeck.remove(cardsInDeck.indexOf(playingCards));
                }
                }
            else if (playerDecksCount == 1){
                for (int playingCards : playList.get(playerDecksCount)) {
                    playerTwoCards.add(cardListLocal.subList(playingCards, playingCards + 1).toString());
                    cardsInDeck.remove(cardsInDeck.indexOf(playingCards));
                }
                }
            else if (playerDecksCount == 0){
                for (int playingCards : playList.get(playerDecksCount)) {
                    playerOneCards.add(cardListLocal.subList(playingCards, playingCards + 1).toString());
                    cardsInDeck.remove(cardsInDeck.indexOf(playingCards));
                }
            }
            playerDecksCount--;
        }
//      Checks if a winner has been declared, if not, continues to loop.
        while (!winnerDeclared) {
//      **** Prompt the player to pick a card from their hand. Match it against an XML file with stored elements / info.
//          A flag to indicate that a player given specification is allowed in the game.
            Boolean isCardSpecificationAllowed = false;
//          A flag to check if a player given card is in a players hand.
            Boolean isCardInHand = false;
//          A flag to indicate a cards specification and value are greater than the previously played card.
            Boolean isCardMorePowerful = false;
//          A flag to denote that a turn is finished.
            Boolean turnComplete = false;
            int deckDrawsRemaining = cardsInDeck.size();
            String playMineral = "";
            String playSpecification = "";
            String playAttribute = "";
            Scanner playCardInput = new Scanner(System.in);
            cardSelector readXML = new cardSelector();
            strengthEvaluator attributeCheck = new strengthEvaluator();
            Collections.shuffle(cardsInDeck);
            System.out.println(deckDrawsRemaining + " Deck draws remaining");
//          The starting point of each round.
            while (!turnComplete) {
//                Player one Turn start.
                if (playerTurn == 0 && !playerOnePass) {
                    if (playerOnePass) {
                        System.out.println(playerTurn + 1 + " Has passed their turn.");
                    }
                    else {
                        System.out.println("Currently Player " + (playerTurn + 1) + "'s turn." +
                                "\nSelect a mineral card from your hand." + "\nPlay a card by typing its name below or pass"
                                + " by typing in 'pass'. If you would like to see your deck, press enter.");
                    }
                    while (!isCardInHand && !playerOnePass) {
                        playMineral = playCardInput.nextLine();
                        for (String cardsInPlay : playerOneCards) {
                            if (cardsInPlay.replace("[", "").replace("]", "").equalsIgnoreCase(playMineral)) {
                                isCardInHand = true;
                            }
                        }
                        if (playMineral.equalsIgnoreCase("pass")){
                            playerOnePass = true;
                            playerPassThreshold++;
                            turnComplete = true;
                            if (deckDrawsRemaining > 0){
                                String deckDrawnCard = cardListLocal.subList
                                        (cardsInDeck.get(0), cardsInDeck.get(0)+1).toString();
                                playerOneCards.add(deckDrawnCard);
                                --deckDrawsRemaining;
                                cardsInDeck.remove(0);
                                System.out.println(deckDrawnCard + " was drawn from the remaining deck.");
                            }
                            else {
                                System.out.println("Every card is now in play.");
                            }
                        }
                        else if (!isCardInHand) {
                            System.out.println("Please select a mineral card from one of the following cards : "
                                    + playerOneCards);
                        }
                        else if (playMineral.equalsIgnoreCase("The Miner")){
                            specificationString = "";
                            specificationCategory = "value";
                            System.out.println("The Miner card was played. Specification changed to "
                                    + specificationCategory);
                            playerOneCards.remove("[The Miner]");
                            turnComplete = true;

                        }
                        else if (playMineral.equalsIgnoreCase("The Petrologist")){
                            specificationString = "";
                            specificationCategory = "abundance";
                            System.out.println("The Petrologist card was played. Specification changed to "
                                    + specificationCategory);
                            playerOneCards.remove("[The Petrologist]");
                            turnComplete = true;

                        }
                        else if (playMineral.equalsIgnoreCase("The Gemmologist")){
                            specificationString = "";
                            specificationCategory = "hardness";
                            System.out.println("The Gemmologist card was played. Specification changed to "
                                    + specificationCategory);
                            playerOneCards.remove("[The Gemmologist]");
                            turnComplete = true;

                        }
                        else if (playMineral.equalsIgnoreCase("The Mineralogist")){
                            specificationString = "";
                            specificationCategory = "cleavage";
                            System.out.println("The Mineralogist card was played. Specification changed to "
                                    + specificationCategory);
                            playerOneCards.remove("The [Mineralogist]");
                            turnComplete = true;

                        }
                        else if (playMineral.equalsIgnoreCase("The Geophysicist")){
                            specificationString = "";
                            specificationCategory = "gravity";
                            System.out.println("The Geophysicist card was played. Specification changed to "
                                    + specificationCategory);
                            playerOneCards.remove("[The Geophysicist]");
                            turnComplete = true;
                        }
                        if (playMineral.equalsIgnoreCase("The Geologist")){
                            specificationString = "";
                            specificationCategory = "";
                            while (!specificationCategory.equalsIgnoreCase("hardness") &&
                                    !specificationCategory.equalsIgnoreCase("gravity") &&
                                    !specificationCategory.equalsIgnoreCase("cleavage") &&
                                    !specificationCategory.equalsIgnoreCase("value") &&
                                    !specificationCategory.equalsIgnoreCase("abundance")) {
                                System.out.println("You have played the Geologist card. Please set the " +
                                        "specification category.");
                                specificationCategory = playCardInput.nextLine();
                            }
                            System.out.println("The Geologist card was played. Specification changed to "
                                    + specificationCategory);
                            playerOneCards.remove("[The Geologist]");
                            turnComplete = true;
                        }
                    }
                    if (!playerOnePass && !turnComplete) {
                        System.out.println("Select the category you would like to play for card : " + playMineral);
                        while (!isCardSpecificationAllowed) {
                            playSpecification = playCardInput.nextLine();
                            if (specificationCategory.equalsIgnoreCase("")) {
                                if (playSpecification.equalsIgnoreCase("hardness")
                                        || playSpecification.equalsIgnoreCase("gravity")
                                        || playSpecification.equalsIgnoreCase("cleavage")
                                        || playSpecification.equalsIgnoreCase("abundance")
                                        || playSpecification.equalsIgnoreCase("value")) {
                                    isCardSpecificationAllowed = true;
                                    System.out.println("Specification category is now set as : " + playSpecification);
                                    specificationCategory = playSpecification;
                                    specificationString = "";
                                } else {
                                    System.out.println("Incorrect specification. If no specification has been set, " +
                                            "you must play hardness, gravity, value, abundance or cleavage.");
                                }
                            } else if (playSpecification.equalsIgnoreCase(specificationCategory)) {
                                isCardSpecificationAllowed = true;
                            } else {
                                System.out.println("The current specification category is " + specificationCategory +
                                        ". Please play a specification from the current category only.");
                            }
                        }
                        while (!isCardMorePowerful && !playerOnePass) {
                            System.out.println("Select the value of " + playSpecification);
                            playAttribute = playCardInput.nextLine();
                            if (specificationString.equalsIgnoreCase("")){
                                specificationString = readXML.xmlRead(playMineral, playSpecification, playAttribute);
                                playerOneCards.remove("[" + playMineral + "]");
                                isCardMorePowerful = true;


                            }
                            else if (specificationCategory.equalsIgnoreCase("hardness")){
                                String storedAttributeValue =
                                        readXML.xmlRead(playMineral, playSpecification, playAttribute);
                                double specificationStringToInt = Double.parseDouble(specificationString);
                                double playAttributeToInt = Double.parseDouble(storedAttributeValue);
                                if (attributeCheck.doubleStrengthEvaluator(playAttributeToInt,
                                        specificationStringToInt)){
                                    System.out.println(playAttributeToInt + " greater than " + specificationStringToInt);
                                    specificationString = storedAttributeValue;
                                    playerOneCards.remove("[" + playMineral + "]");
                                    isCardMorePowerful = true;

                                }
                            }
                            else if (specificationCategory.equalsIgnoreCase("gravity")){
                                String storedAttributeValue =
                                        readXML.xmlRead(playMineral, playSpecification, playAttribute);
                                double specificationStringToInt = Double.parseDouble(specificationString);
                                double playAttributeToInt = Double.parseDouble(storedAttributeValue);
                                if (attributeCheck.doubleStrengthEvaluator(playAttributeToInt,
                                        specificationStringToInt)){
                                    System.out.println(playAttributeToInt + " greater than " + specificationStringToInt);
                                    specificationString = storedAttributeValue;
                                    playerOneCards.remove("[" + playMineral + "]");
                                    isCardMorePowerful = true;

                                }
                            }
                            else if (specificationCategory.equalsIgnoreCase("cleavage")){
                                String storedAttributeValue =
                                        readXML.xmlRead(playMineral, playSpecification, playAttribute);
                                if (attributeCheck.cleavageStrengthEvaluator(storedAttributeValue, specificationString )){
                                    System.out.println( storedAttributeValue + " greater than " + specificationString );
                                    specificationString = storedAttributeValue;
                                    playerOneCards.remove("[" + playMineral + "]");
                                    isCardMorePowerful = true;

                                }
                            }
                            else if (specificationCategory.equalsIgnoreCase("abundance")){
                                String storedAttributeValue =
                                        readXML.xmlRead(playMineral, playSpecification, playAttribute);
                                if (attributeCheck.abundanceStrengthEvaluator(storedAttributeValue, specificationString )){
                                    System.out.println( storedAttributeValue + " greater than " + specificationString );
                                    specificationString = storedAttributeValue;
                                    playerOneCards.remove("[" + playMineral + "]");
                                    isCardMorePowerful = true;

                                }
                            }
                            else if (specificationCategory.equalsIgnoreCase("value")){
                                String storedAttributeValue =
                                        readXML.xmlRead(playMineral, playSpecification, playAttribute);
                                if (attributeCheck.valueStrengthEvaluator(storedAttributeValue, specificationString )){
                                    System.out.println( storedAttributeValue + " greater than " + specificationString );
                                    specificationString = storedAttributeValue;
                                    playerOneCards.remove("[" + playMineral + "]");
                                    isCardMorePowerful = true;

                                }
                            }

                            else if (!isCardMorePowerful){
                                playerOnePass = true;
                                playerPassThreshold++;
                                System.out.println("Automatically passing this turn. The value given for category "
                                        + specificationCategory + " is lower than the last played card...\n" +
                                        "Next turn, use a card with a higher value OR pass to play no card.");
                                if (deckDrawsRemaining > 0){
                                    String deckDrawnCard = cardListLocal.subList
                                            (cardsInDeck.get(0), cardsInDeck.get(0)+1).toString();
                                    playerOneCards.add(deckDrawnCard);
                                    --deckDrawsRemaining;
                                    cardsInDeck.remove(0);
                                    System.out.println(deckDrawnCard + " was drawn from the remaining deck.");
                                }
                            }


                        }
                        turnComplete = true;
                    }
                    if (playerOneCards.size() <= 0){
                        winnerDeclared = true;
                        System.out.println("Congratulations to Player " + (playerTurn + 1) + " you are the winner!!!.");
                    }
                    else if (TOTALPLAYERS == 5 && playerFivePass && playerFourPass && playerThreePass && playerTwoPass){
                        playerOnePass = false;
                        playerTwoPass = false;
                        playerThreePass = false;
                        playerFourPass = false;
                        playerFivePass = false;

                    }
                    else if (TOTALPLAYERS == 4 && playerFourPass && playerThreePass && playerTwoPass){
                        playerOnePass = false;
                        playerTwoPass = false;
                        playerThreePass = false;
                        playerFourPass = false;

                    }
                    else if (TOTALPLAYERS == 3 && playerThreePass && playerTwoPass){
                        playerOnePass = false;
                        playerTwoPass = false;
                        playerThreePass = false;

                    }
                    playerTurn++;
                    if (playerPassThreshold - TOTALPLAYERS == -1){
                        specificationCategory = "";
                        System.out.println("All other players have passed. Specification category reset.");
                        playerPassThreshold = 0;
                    }



                }
                //                Player two Turn start.

                else if (playerTurn == 1) {
                    if (playerTwoPass) {
                        System.out.println(playerTurn + 1 + " Has passed their turn.");
                    }
                    else {
                        System.out.println("Currently Player " + (playerTurn + 1) + "'s turn." +
                                "\nSelect a mineral card from your hand." + "\nPlay a card by typing its name below or pass"
                                +
                                " by typing in 'pass'. If you would like to see your deck, press enter.");
                    }
                    while (!isCardInHand && !playerTwoPass) {
                        playMineral = playCardInput.nextLine();
                        for (String cardsInPlay : playerTwoCards) {
                            if (cardsInPlay.replace("[", "").replace("]", "").equalsIgnoreCase(playMineral)
                                    && !cardsInPlay.replace("[", "").replace("]", "").equalsIgnoreCase("")) {
                                isCardInHand = true;
                            }
                        }
                        if (playMineral.equalsIgnoreCase("pass")){
                            turnComplete = true;
                            playerTwoPass = true;
                            playerPassThreshold++;
                            if (deckDrawsRemaining > 0){
                                String deckDrawnCard = cardListLocal.subList
                                        (cardsInDeck.get(0), cardsInDeck.get(0)+1).toString();
                                playerTwoCards.add(deckDrawnCard);
                                --deckDrawsRemaining;
                                cardsInDeck.remove(0);
                                System.out.println(deckDrawnCard + " was drawn from the remaining deck.");
                            }
                            else {
                                System.out.println("Every card is now in play.");
                            }
                        }
                        else if (!isCardInHand) {
                            System.out.println("Please select a mineral card from one of the following cards : "
                                    + playerTwoCards);
                        }
                        else if (playMineral.equalsIgnoreCase("The Miner")){
                            specificationCategory = "value";
                            specificationString = "";

                            System.out.println("The Miner card was played. Specification changed to "
                                    + specificationCategory);
                            playerTwoCards.remove("[The Miner]");
                            turnComplete = true;

                        }
                        else if (playMineral.equalsIgnoreCase("The Petrologist")){
                            specificationCategory = "abundance";
                            specificationString = "";

                            System.out.println("The Petrologist card was played. Specification changed to "
                                    + specificationCategory);
                            playerTwoCards.remove("[The Petrologist]");
                            turnComplete = true;

                        }
                        else if (playMineral.equalsIgnoreCase("The Gemmologist")){
                            specificationCategory = "hardness";
                            specificationString = "";

                            System.out.println("The Gemmologist card was played. Specification changed to "
                                    + specificationCategory);
                            playerTwoCards.remove("[The Gemmologist]");
                            turnComplete = true;

                        }
                        else if (playMineral.equalsIgnoreCase("The Mineralogist")){
                            specificationCategory = "cleavage";
                            specificationString = "";

                            System.out.println("The Mineralogist card was played. Specification changed to "
                                    + specificationCategory);
                            playerTwoCards.remove("[The Mineralogist]");
                            turnComplete = true;

                        }
                        else if (playMineral.equalsIgnoreCase("The Geophysicist")){
                            specificationCategory = "gravity";
                            specificationString = "";

                            System.out.println("The Geophysicist card was played. Specification changed to "
                                    + specificationCategory);
                            playerTwoCards.remove("[The Geophysicist]");
                            turnComplete = true;
                        }
                        else if (playMineral.equalsIgnoreCase("The Geologist")){
                            specificationCategory = "";
                            specificationString = "";

                            while (!specificationCategory.equalsIgnoreCase("hardness") &&
                                    !specificationCategory.equalsIgnoreCase("gravity") &&
                                    !specificationCategory.equalsIgnoreCase("cleavage") &&
                                    !specificationCategory.equalsIgnoreCase("value") &&
                                    !specificationCategory.equalsIgnoreCase("abundance")) {
                                System.out.println("You have played the Geologist card. Please set the " +
                                        "specification category.");
                                specificationCategory = playCardInput.nextLine();
                            }
                            System.out.println("The Geologist card was played. Specification changed to "
                                    + specificationCategory);
                            playerTwoCards.remove("[The Geologist]");
                            turnComplete = true;
                        }
                    }
                    if (!playerTwoPass && !turnComplete) {
                        System.out.println("Select the category you would like to play for card : " + playMineral);
                        while (!isCardSpecificationAllowed) {
                            playSpecification = playCardInput.nextLine();
                            if (specificationCategory.equalsIgnoreCase("")) {
                                if (playSpecification.equalsIgnoreCase("hardness")
                                        || playSpecification.equalsIgnoreCase("gravity")
                                        || playSpecification.equalsIgnoreCase("cleavage")
                                        || playSpecification.equalsIgnoreCase("abundance")
                                        || playSpecification.equalsIgnoreCase("value")) {
                                    isCardSpecificationAllowed = true;
                                    System.out.println("Specification category is now set as : " + playSpecification);
                                    specificationCategory = playSpecification;
                                } else {
                                    System.out.println("Incorrect specification. If no specification has been set, " +
                                            "you must play hardness, gravity, value, abundance or cleavage.");
                                }
                            } else if (playSpecification.equalsIgnoreCase(specificationCategory)) {
                                isCardSpecificationAllowed = true;
                            } else {
                                System.out.println("The current specification category is " + specificationCategory +
                                        " Please play a specification from the current category only.");
                            }
                        }
                        while (!isCardMorePowerful && !playerTwoPass) {
                            System.out.println("Select the value of " + playSpecification);
                            playAttribute = playCardInput.nextLine();
                            if (specificationString.equalsIgnoreCase("")){
                                specificationString = readXML.xmlRead(playMineral, playSpecification, playAttribute);
                                playerTwoCards.remove("[" + playMineral + "]");
                                isCardMorePowerful = true;


                            }
                            else if (specificationCategory.equalsIgnoreCase("hardness")){
                                String storedAttributeValue =
                                        readXML.xmlRead(playMineral, playSpecification, playAttribute);
                                double specificationStringToInt = Double.parseDouble(specificationString);
                                double playAttributeToInt = Double.parseDouble(storedAttributeValue);
                                if (attributeCheck.doubleStrengthEvaluator(playAttributeToInt,
                                        specificationStringToInt)){
                                    System.out.println(playAttributeToInt + " greater than " + specificationStringToInt);
                                    specificationString = storedAttributeValue;
                                    playerTwoCards.remove("[" + playMineral + "]");
                                    isCardMorePowerful = true;


                                }
                            }
                            else if (specificationCategory.equalsIgnoreCase("gravity")){
                                String storedAttributeValue =
                                        readXML.xmlRead(playMineral, playSpecification, playAttribute);
                                double specificationStringToInt = Double.parseDouble(specificationString);
                                double playAttributeToInt = Double.parseDouble(storedAttributeValue);
                                if (attributeCheck.doubleStrengthEvaluator(playAttributeToInt,
                                        specificationStringToInt)){
                                    System.out.println(playAttributeToInt + " greater than " + specificationStringToInt);
                                    specificationString = storedAttributeValue;
                                    playerTwoCards.remove("[" + playMineral + "]");
                                    isCardMorePowerful = true;

                                }
                            }
                            else if (specificationCategory.equalsIgnoreCase("cleavage")){
                                String storedAttributeValue =
                                        readXML.xmlRead(playMineral, playSpecification, playAttribute);
                                if (attributeCheck.cleavageStrengthEvaluator(storedAttributeValue, specificationString )){
                                    System.out.println( storedAttributeValue + " greater than " + specificationString );
                                    specificationString = storedAttributeValue;
                                    playerTwoCards.remove("[" + playMineral + "]");
                                    isCardMorePowerful = true;

                                }
                            }
                            else if (specificationCategory.equalsIgnoreCase("abundance")){
                                String storedAttributeValue =
                                        readXML.xmlRead(playMineral, playSpecification, playAttribute);
                                if (attributeCheck.abundanceStrengthEvaluator(storedAttributeValue, specificationString )){
                                    System.out.println( storedAttributeValue + " greater than " + specificationString );
                                    specificationString = storedAttributeValue;
                                    playerTwoCards.remove("[" + playMineral + "]");
                                    isCardMorePowerful = true;

                                }
                            }
                            else if (specificationCategory.equalsIgnoreCase("value")){
                                String storedAttributeValue =
                                        readXML.xmlRead(playMineral, playSpecification, playAttribute);
                                if (attributeCheck.valueStrengthEvaluator(storedAttributeValue, specificationString )){
                                    System.out.println( storedAttributeValue + " greater than " + specificationString );
                                    specificationString = storedAttributeValue;
                                    playerTwoCards.remove("[" + playMineral + "]");
                                    isCardMorePowerful = true;

                                }
                            }

                            if (!isCardMorePowerful){
                                playerTwoPass = true;
                                playerPassThreshold++;
                                System.out.println("Automatically passing this turn. The value given for category "
                                        + specificationCategory + " is lower than the last played card...\n" +
                                        "Next turn, use a card with a higher value OR pass to play no card.");
                                if (deckDrawsRemaining > 0){
                                    String deckDrawnCard = cardListLocal.subList
                                            (cardsInDeck.get(0), cardsInDeck.get(0)+1).toString();
                                    playerTwoCards.add(deckDrawnCard);
                                    --deckDrawsRemaining;
                                    cardsInDeck.remove(0);
                                    System.out.println(deckDrawnCard + " was drawn from the remaining deck.");
                                }
                            }


                        }
                        turnComplete = true;
                    }
                    if (playerTwoCards.size() <= 0){
                        winnerDeclared = true;
                        System.out.println("Congratulations to Player " + (playerTurn + 1)  + " you are the winner!!!.");
                    }
                    else if (TOTALPLAYERS == 5 && playerFivePass && playerFourPass && playerThreePass && playerOnePass){
                        playerOnePass = false;
                        playerTwoPass = false;
                        playerThreePass = false;
                        playerFourPass = false;
                        playerFivePass = false;
                    }
                    else if (TOTALPLAYERS == 4 && playerFourPass && playerThreePass && playerOnePass){
                        playerOnePass = false;
                        playerTwoPass = false;
                        playerThreePass = false;
                        playerFourPass = false;
                    }
                    else if (TOTALPLAYERS == 3 && playerThreePass && playerOnePass){
                        playerOnePass = false;
                        playerTwoPass = false;
                        playerThreePass = false;
                    }
                    playerTurn++;
                    if (playerPassThreshold - TOTALPLAYERS == -1){
                        specificationCategory = "";
                        System.out.println("All other players have passed. Specification category reset.");
                        playerPassThreshold = 0;
                    }
                }
                //                Player three Turn start.

                else if (playerTurn == 2) {
                    if (playerThreePass) {
                        System.out.println(playerTurn + 1 + " Has passed their turn.");
                    }
                    else {
                        System.out.println("Currently Player " + (playerTurn + 1) + "'s turn." +
                                "\nSelect a mineral card from your hand." + "\nPlay a card by typing its name below or pass"
                                +
                                " by typing in 'pass'. If you would like to see your deck, press enter.");
                    }
                    while (!isCardInHand && !playerThreePass) {
                        playMineral = playCardInput.nextLine();
                        for (String cardsInPlay : playerThreeCards) {
                            if (cardsInPlay.replace("[", "").replace("]", "").equalsIgnoreCase(playMineral)
                                    && !cardsInPlay.replace("[", "").replace("]", "").equalsIgnoreCase("")) {
                                isCardInHand = true;
                            }
                        }

                        if (playMineral.equalsIgnoreCase("pass")){
                            playerThreePass = true;
                            turnComplete = true;
                            playerPassThreshold++;
                            if (deckDrawsRemaining > 0){
                                String deckDrawnCard = cardListLocal.subList
                                        (cardsInDeck.get(0), cardsInDeck.get(0)+1).toString();
                                playerThreeCards.add(deckDrawnCard);
                                --deckDrawsRemaining;
                                cardsInDeck.remove(0);
                                System.out.println(deckDrawnCard + " was drawn from the remaining deck.");
                            }
                            else {
                                System.out.println("Every card is now in play.");
                            }
                        }
                       else if (!isCardInHand) {
                            System.out.println("Please select a mineral card from one of the following cards : "
                                    + playerThreeCards);

                        }
                        else if (playMineral.equalsIgnoreCase("The Miner")){
                            specificationCategory = "value";
                            specificationString = "";

                            System.out.println("The Miner card was played. Specification changed to "
                                    + specificationCategory);
                            playerThreeCards.remove("[The Miner]");
                            turnComplete = true;

                        }
                        else if (playMineral.equalsIgnoreCase("The Petrologist")){
                            specificationCategory = "abundance";
                            specificationString = "";

                            System.out.println("The Petrologist card was played. Specification changed to "
                                    + specificationCategory);
                            playerThreeCards.remove("[The Petrologist]");
                            turnComplete = true;

                        }
                        else if (playMineral.equalsIgnoreCase("The Gemmologist")){
                            specificationCategory = "hardness";
                            specificationString = "";

                            System.out.println("The Gemmologist card was played. Specification changed to "
                                    + specificationCategory);
                            playerThreeCards.remove("[The Gemmologist]");
                            turnComplete = true;

                        }
                        else if (playMineral.equalsIgnoreCase("The Mineralogist")){
                            specificationCategory = "cleavage";
                            specificationString = "";

                            System.out.println("The Mineralogist card was played. Specification changed to "
                                    + specificationCategory);
                            playerThreeCards.remove("[The Mineralogist]");
                            turnComplete = true;

                        }
                        else if (playMineral.equalsIgnoreCase("The Geophysicist")){
                            specificationCategory = "gravity";
                            specificationString = "";

                            System.out.println("The Geophysicist card was played. Specification changed to "
                                    + specificationCategory);
                            playerThreeCards.remove("[The Geophysicist]");
                            turnComplete = true;
                        }
                        else if (playMineral.equalsIgnoreCase("The Geologist")){
                            specificationCategory = "";
                            specificationString = "";

                            while (!specificationCategory.equalsIgnoreCase("hardness") &&
                                    !specificationCategory.equalsIgnoreCase("gravity") &&
                                    !specificationCategory.equalsIgnoreCase("cleavage") &&
                                    !specificationCategory.equalsIgnoreCase("value") &&
                                    !specificationCategory.equalsIgnoreCase("abundance")) {
                                System.out.println("You have played the Geologist card. Please set the " +
                                        "specification category.");
                                specificationCategory = playCardInput.nextLine();
                            }
                            System.out.println("The Geologist card was played. Specification changed to "
                                    + specificationCategory);
                            playerThreeCards.remove("[The Geologist]");
                            turnComplete = true;
                        }
                    }
                    if (!playerThreePass && !turnComplete) {
                        System.out.println("Select the category you would like to play for card : " + playMineral);
                        while (!isCardSpecificationAllowed) {
                            playSpecification = playCardInput.nextLine();
                            if (specificationCategory.equalsIgnoreCase("")) {
                                if (playSpecification.equalsIgnoreCase("hardness")
                                        || playSpecification.equalsIgnoreCase("gravity")
                                        || playSpecification.equalsIgnoreCase("cleavage")
                                        || playSpecification.equalsIgnoreCase("abundance")
                                        || playSpecification.equalsIgnoreCase("value")) {
                                    isCardSpecificationAllowed = true;
                                    System.out.println("Specification category is now set as : " + playSpecification);
                                    specificationCategory = playSpecification;
                                } else {
                                    System.out.println("Incorrect specification. If no specification has been set, " +
                                            "you must play hardness, gravity, value, abundance or cleavage.");
                                }
                            } else if (playSpecification.equalsIgnoreCase(specificationCategory)) {
                                isCardSpecificationAllowed = true;
                            } else {
                                System.out.println("The current specification category is " + specificationCategory +
                                        " Please play a specification from the current category only.");
                            }
                        }
                        while (!isCardMorePowerful && !playerThreePass) {
                            System.out.println("Select the value of " + playSpecification);
                            playAttribute = playCardInput.nextLine();
                            if (specificationString.equalsIgnoreCase("")){
                                specificationString = readXML.xmlRead(playMineral, playSpecification, playAttribute);
                                playerThreeCards.remove("[" + playMineral + "]");
                                isCardMorePowerful = true;

                            }
                            else if (specificationCategory.equalsIgnoreCase("hardness")){
                                String storedAttributeValue =
                                        readXML.xmlRead(playMineral, playSpecification, playAttribute);
                                double specificationStringToInt = Double.parseDouble(specificationString);
                                double playAttributeToInt = Double.parseDouble(storedAttributeValue);
                                if (attributeCheck.doubleStrengthEvaluator(playAttributeToInt,
                                        specificationStringToInt)){
                                    System.out.println(playAttributeToInt + " greater than " + specificationStringToInt);
                                    specificationString = storedAttributeValue;
                                    playerThreeCards.remove("[" + playMineral + "]");
                                    isCardMorePowerful = true;

                                }
                            }
                            else if (specificationCategory.equalsIgnoreCase("gravity")){
                                String storedAttributeValue =
                                        readXML.xmlRead(playMineral, playSpecification, playAttribute);
                                double specificationStringToInt = Double.parseDouble(specificationString);
                                double playAttributeToInt = Double.parseDouble(storedAttributeValue);
                                if (attributeCheck.doubleStrengthEvaluator(playAttributeToInt,
                                        specificationStringToInt)){
                                    System.out.println(playAttributeToInt + " greater than " + specificationStringToInt);
                                    specificationString = storedAttributeValue;
                                    playerThreeCards.remove("[" + playMineral + "]");
                                    isCardMorePowerful = true;

                                }
                            }
                            else if (specificationCategory.equalsIgnoreCase("cleavage")){
                                String storedAttributeValue =
                                        readXML.xmlRead(playMineral, playSpecification, playAttribute);
                                if (attributeCheck.cleavageStrengthEvaluator(storedAttributeValue, specificationString )){
                                    System.out.println( storedAttributeValue + " greater than " + specificationString );
                                    specificationString = storedAttributeValue;
                                    playerThreeCards.remove("[" + playMineral + "]");
                                    isCardMorePowerful = true;

                                }
                            }
                            else if (specificationCategory.equalsIgnoreCase("abundance")){
                                String storedAttributeValue =
                                        readXML.xmlRead(playMineral, playSpecification, playAttribute);
                                if (attributeCheck.abundanceStrengthEvaluator(storedAttributeValue, specificationString )){
                                    System.out.println( storedAttributeValue + " greater than " + specificationString );
                                    specificationString = storedAttributeValue;
                                    playerThreeCards.remove("[" + playMineral + "]");
                                    isCardMorePowerful = true;

                                }
                            }
                            else if (specificationCategory.equalsIgnoreCase("value")){
                                String storedAttributeValue =
                                        readXML.xmlRead(playMineral, playSpecification, playAttribute);
                                if (attributeCheck.valueStrengthEvaluator(storedAttributeValue, specificationString )){
                                    System.out.println( storedAttributeValue + " greater than " + specificationString );
                                    specificationString = storedAttributeValue;
                                    playerThreeCards.remove("[" + playMineral + "]");
                                    isCardMorePowerful = true;

                                }
                            }

                            if (!isCardMorePowerful){
                                playerThreePass = true;
                                playerPassThreshold++;
                                System.out.println("Automatically passing this turn. The value given for category "
                                        + specificationCategory + " is lower than the last played card...\n" +
                                        "Next turn, use a card with a higher value OR pass to play no card.");
                                if (deckDrawsRemaining > 0){
                                    String deckDrawnCard = cardListLocal.subList
                                            (cardsInDeck.get(0), cardsInDeck.get(0)+1).toString();
                                    playerThreeCards.add(deckDrawnCard);
                                    --deckDrawsRemaining;
                                    cardsInDeck.remove(0);
                                    System.out.println(deckDrawnCard + " was drawn from the remaining deck.");
                                }
                            }
                        }
                        turnComplete = true;
                    }
                    if (playerThreeCards.size() <= 0){
                        winnerDeclared = true;
                        System.out.println("Congratulations to Player " + playerTurn + 1 + " you are the winner!!!.");
                    }
                    else if (TOTALPLAYERS == 5 && playerFivePass && playerFourPass && playerOnePass && playerTwoPass){
                        playerOnePass = false;
                        playerTwoPass = false;
                        playerThreePass = false;
                        playerFourPass = false;
                        playerFivePass = false;
                    }
                    else if (TOTALPLAYERS == 4 && playerFourPass && playerOnePass && playerTwoPass){
                        playerOnePass = false;
                        playerTwoPass = false;
                        playerThreePass = false;
                        playerFourPass = false;
                    }
                    else if (TOTALPLAYERS == 3 && playerOnePass && playerTwoPass){
                        playerOnePass = false;
                        playerTwoPass = false;
                        playerThreePass = false;
                    }

                    if (TOTALPLAYERS > 3){
                        playerTurn++;
                    }
                    else {
                        playerTurn = 0;
                    }
                    if (playerPassThreshold - TOTALPLAYERS == -1){
                        specificationCategory = "";
                        System.out.println("All other players have passed. Specification category reset.");
                        playerPassThreshold = 0;
                    }

                }
                //                Player four Turn start.

                else if (playerTurn == 3) {
                    if (playerFourPass) {
                        System.out.println(playerTurn + 1 + " Has passed their turn.");
                    }
                    else {
                        System.out.println("Currently Player " + (playerTurn + 1) + "'s turn." +
                                "\nSelect a mineral card from your hand." + "\nPlay a card by typing its name below or pass"
                                +
                                " by typing in 'pass'. If you would like to see your deck, press enter.");
                    }
                    while (!isCardInHand && !playerFourPass) {
                        playMineral = playCardInput.nextLine();
                        for (String cardsInPlay : playerFourCards) {
                            if (cardsInPlay.replace("[", "").replace("]", "").equalsIgnoreCase(playMineral)
                                    && !cardsInPlay.replace("[", "").replace("]", "").equalsIgnoreCase("")) {
                                isCardInHand = true;
                            }
                        }
                        if (playMineral.equalsIgnoreCase("pass")){
                            playerFourPass = true;
                            playerPassThreshold++;
                            turnComplete = true;
                            if (deckDrawsRemaining > 0){
                                String deckDrawnCard = cardListLocal.subList
                                        (cardsInDeck.get(0), cardsInDeck.get(0)+1).toString();
                                playerFourCards.add(deckDrawnCard);
                                --deckDrawsRemaining;
                                cardsInDeck.remove(0);
                                System.out.println(deckDrawnCard + " was drawn from the remaining deck.");
                            }
                            else {
                                System.out.println("Every card is now in play.");
                            }
                        }
                        else if (!isCardInHand) {
                            System.out.println("Please select a mineral card from one of the following cards : "
                                    + playerFourCards);
                        }
                        else if (playMineral.equalsIgnoreCase("The Miner")){
                            specificationCategory = "value";
                            specificationString = "";

                            System.out.println("The Miner card was played. Specification changed to "
                                    + specificationCategory);
                            playerFourCards.remove("[The Miner]");
                            turnComplete = true;

                        }
                        else if (playMineral.equalsIgnoreCase("The Petrologist")){
                            specificationCategory = "abundance";
                            specificationString = "";

                            System.out.println("The Petrologist card was played. Specification changed to "
                                    + specificationCategory);
                            playerFourCards.remove("[The Petrologist]");
                            turnComplete = true;

                        }
                        else if (playMineral.equalsIgnoreCase("The Gemmologist")){
                            specificationCategory = "hardness";
                            specificationString = "";

                            System.out.println("The Gemmologist card was played. Specification changed to "
                                    + specificationCategory);
                            playerFourCards.remove("[The Gemmologist]");
                            turnComplete = true;

                        }
                        else if (playMineral.equalsIgnoreCase("The Mineralogist")){
                            specificationCategory = "cleavage";
                            specificationString = "";

                            System.out.println("The Mineralogist card was played. Specification changed to "
                                    + specificationCategory);
                            playerFourCards.remove("[The Mineralogist]");
                            turnComplete = true;

                        }
                        else if (playMineral.equalsIgnoreCase("The Geophysicist")){
                            specificationCategory = "gravity";
                            specificationString = "";

                            System.out.println("The Geophysicist card was played. Specification changed to "
                                    + specificationCategory);
                            playerFourCards.remove("[The Geophysicist]");
                            turnComplete = true;
                        }
                        else if (playMineral.equalsIgnoreCase("The Geologist")){
                            specificationCategory = "";
                            specificationString = "";

                            while (!specificationCategory.equalsIgnoreCase("hardness") &&
                                    !specificationCategory.equalsIgnoreCase("gravity") &&
                                    !specificationCategory.equalsIgnoreCase("cleavage") &&
                                    !specificationCategory.equalsIgnoreCase("value") &&
                                    !specificationCategory.equalsIgnoreCase("abundance")) {
                                System.out.println("You have played the Geologist card. Please set the " +
                                        "specification category.");
                                specificationCategory = playCardInput.nextLine();
                            }
                            System.out.println("The Geologist card was played. Specification changed to "
                                    + specificationCategory);
                            playerFourCards.remove("[The Geologist]");
                            turnComplete = true;
                        }
                    }
                    if (!playerFourPass && !turnComplete) {
                        System.out.println("Select the category you would like to play for card : " + playMineral);
                        while (!isCardSpecificationAllowed) {
                            playSpecification = playCardInput.nextLine();
                            if (specificationCategory.equalsIgnoreCase("")) {
                                if (playSpecification.equalsIgnoreCase("hardness")
                                        || playSpecification.equalsIgnoreCase("gravity")
                                        || playSpecification.equalsIgnoreCase("cleavage")
                                        || playSpecification.equalsIgnoreCase("abundance")
                                        || playSpecification.equalsIgnoreCase("value")) {
                                    isCardSpecificationAllowed = true;
                                    System.out.println("Specification category is now set as : " + playSpecification);
                                    specificationCategory = playSpecification;
                                }
                                else {
                                    System.out.println("Incorrect specification. If no specification has been set, " +
                                            "you must play hardness, gravity, value, abundance or cleavage.");
                                }
                            } else if (playSpecification.equalsIgnoreCase(specificationCategory)) {
                                isCardSpecificationAllowed = true;
                            } else {
                                System.out.println("The current specification category is " + specificationCategory +
                                        " Please play a specification from the current category only.");
                            }
                        }
                        while (!isCardMorePowerful && !playerFourPass) {
                            System.out.println("Select the value of " + playSpecification);
                            playAttribute = playCardInput.nextLine();
                            if (specificationString.equalsIgnoreCase("")){
                                specificationString = readXML.xmlRead(playMineral, playSpecification, playAttribute);
                                playerFourCards.remove("[" + playMineral + "]");
                                isCardMorePowerful = true;

                            }
                            else if (specificationCategory.equalsIgnoreCase("hardness")){
                                String storedAttributeValue =
                                        readXML.xmlRead(playMineral, playSpecification, playAttribute);
                                double specificationStringToInt = Double.parseDouble(specificationString);
                                double playAttributeToInt = Double.parseDouble(storedAttributeValue);
                                if (attributeCheck.doubleStrengthEvaluator(playAttributeToInt,
                                        specificationStringToInt)){
                                    System.out.println(playAttributeToInt + " greater than " + specificationStringToInt);
                                    specificationString = storedAttributeValue;
                                    playerFourCards.remove("[" + playMineral + "]");
                                    isCardMorePowerful = true;

                                }
                            }
                            else if (specificationCategory.equalsIgnoreCase("gravity")){
                                String storedAttributeValue =
                                        readXML.xmlRead(playMineral, playSpecification, playAttribute);
                                double specificationStringToInt = Double.parseDouble(specificationString);
                                double playAttributeToInt = Double.parseDouble(storedAttributeValue);
                                if (attributeCheck.doubleStrengthEvaluator(playAttributeToInt,
                                        specificationStringToInt)){
                                    System.out.println(playAttributeToInt + " greater than " + specificationStringToInt);
                                    specificationString = storedAttributeValue;
                                    playerFourCards.remove("[" + playMineral + "]");
                                    isCardMorePowerful = true;

                                }
                            }
                            else if (specificationCategory.equalsIgnoreCase("cleavage")){
                                String storedAttributeValue =
                                        readXML.xmlRead(playMineral, playSpecification, playAttribute);
                                if (attributeCheck.cleavageStrengthEvaluator(storedAttributeValue, specificationString )){
                                    System.out.println( storedAttributeValue + " greater than " + specificationString );
                                    specificationString = storedAttributeValue;
                                    playerFourCards.remove("[" + playMineral + "]");
                                    isCardMorePowerful = true;

                                }
                            }
                            else if (specificationCategory.equalsIgnoreCase("abundance")){
                                String storedAttributeValue =
                                        readXML.xmlRead(playMineral, playSpecification, playAttribute);
                                if (attributeCheck.abundanceStrengthEvaluator(storedAttributeValue, specificationString )){
                                    System.out.println( storedAttributeValue + " greater than " + specificationString );
                                    specificationString = storedAttributeValue;
                                    playerFourCards.remove("[" + playMineral + "]");
                                    isCardMorePowerful = true;

                                }
                            }
                            else if (specificationCategory.equalsIgnoreCase("value")){
                                String storedAttributeValue =
                                        readXML.xmlRead(playMineral, playSpecification, playAttribute);
                                if (attributeCheck.valueStrengthEvaluator(storedAttributeValue, specificationString )){
                                    System.out.println( storedAttributeValue + " greater than " + specificationString );
                                    specificationString = storedAttributeValue;
                                    playerFourCards.remove("[" + playMineral + "]");
                                    isCardMorePowerful = true;

                                }
                            }
                            if (!isCardMorePowerful){
                                playerFourPass = true;
                                playerPassThreshold++;
                                System.out.println("Automatically passing this turn. The value given for category "
                                        + specificationCategory + " is lower than the last played card...\n" +
                                        "Next turn, use a card with a higher value OR pass to play no card.");
                                if (deckDrawsRemaining > 0){
                                    String deckDrawnCard = cardListLocal.subList
                                            (cardsInDeck.get(0), cardsInDeck.get(0)+1).toString();
                                    playerFourCards.add(deckDrawnCard);
                                    --deckDrawsRemaining;
                                    cardsInDeck.remove(0);
                                    System.out.println(deckDrawnCard + " was drawn from the remaining deck.");
                                }
                            }
                        }
                        turnComplete = true;
                    }
                    if (playerFourCards.size() <= 0){
                        winnerDeclared = true;
                        System.out.println("Congratulations to Player " + (playerTurn + 1) + " you are the winner!!!.");
                    }
                    else if (TOTALPLAYERS == 5 && playerFivePass && playerOnePass && playerThreePass && playerTwoPass){
                        playerOnePass = false;
                        playerTwoPass = false;
                        playerThreePass = false;
                        playerFourPass = false;
                        playerFivePass = false;

                    }
                    else if (TOTALPLAYERS == 4 && playerOnePass && playerThreePass && playerTwoPass){
                        playerOnePass = false;
                        playerTwoPass = false;
                        playerThreePass = false;
                        playerFourPass = false;

                    }

                    if (TOTALPLAYERS > 4){
                        playerTurn++;
                    }
                    else {
                        playerTurn = 0;
                    }
                    if (playerPassThreshold - TOTALPLAYERS == -1){
                        specificationCategory = "";
                        System.out.println("All other players have passed. Specification category reset.");
                        playerPassThreshold = 0;
                    }


                }
                //                Player five Turn Start.

                else if (playerTurn == 4) {
                    if (playerFivePass) {
                        System.out.println(playerTurn + 1 + " Has passed their turn.");
                    }
                    else {
                        System.out.println("Currently Player " + (playerTurn + 1) + "'s turn." +
                                "\nSelect a mineral card from your hand." + "\nPlay a card by typing its name below or pass"
                                +
                                " by typing in 'pass'. If you would like to see your deck, press enter.");
                    }
                    while (!isCardInHand && !playerFivePass) {
                        playMineral = playCardInput.nextLine();
                        for (String cardsInPlay : playerFourCards) {
                            if (cardsInPlay.replace("[", "").replace("]", "").equalsIgnoreCase(playMineral)
                                    && !cardsInPlay.replace("[", "").replace("]", "").equalsIgnoreCase("")) {
                                isCardInHand = true;
                            }
                        }
                        if (playMineral.equalsIgnoreCase("pass")){
                            turnComplete = true;
                            playerFivePass = true;
                            playerPassThreshold++;
                            if (deckDrawsRemaining > 0){
                                String deckDrawnCard = cardListLocal.subList
                                        (cardsInDeck.get(0), cardsInDeck.get(0)+1).toString();
                                playerFiveCards.add(deckDrawnCard);
                                --deckDrawsRemaining;
                                cardsInDeck.remove(0);
                                System.out.println(deckDrawnCard + " was drawn from the remaining deck.");
                            }
                            else {
                                System.out.println("Every card is now in play.");
                            }
                        }
                        else if (!isCardInHand) {
                            System.out.println("Please select a mineral card from one of the following cards : "
                                    + playerFiveCards);
                        }
                        else if (playMineral.equalsIgnoreCase("The Miner")){
                            specificationCategory = "value";
                            specificationString = "";

                            System.out.println("The Miner card was played. Specification changed to "
                                    + specificationCategory);
                            playerFiveCards.remove("[The Miner]");
                            turnComplete = true;

                        }
                        else if (playMineral.equalsIgnoreCase("The Petrologist")){
                            specificationCategory = "abundance";
                            specificationString = "";

                            System.out.println("The Petrologist card was played. Specification changed to "
                                    + specificationCategory);
                            playerFiveCards.remove("[The Petrologist]");
                            turnComplete = true;

                        }
                        else if (playMineral.equalsIgnoreCase("The Gemmologist")){
                            specificationCategory = "hardness";
                            specificationString = "";

                            System.out.println("The Gemmologist card was played. Specification changed to "
                                    + specificationCategory);
                            playerFiveCards.remove("[The Gemmologist]");
                            turnComplete = true;

                        }
                        else if (playMineral.equalsIgnoreCase("The Mineralogist")){
                            specificationCategory = "cleavage";
                            specificationString = "";

                            System.out.println("The Mineralogist card was played. Specification changed to "
                                    + specificationCategory);
                            playerFiveCards.remove("[The Mineralogist]");
                            turnComplete = true;

                        }
                        else if (playMineral.equalsIgnoreCase("The Geophysicist")){
                            specificationCategory = "gravity";
                            specificationString = "";

                            System.out.println("The Geophysicist card was played. Specification changed to "
                                    + specificationCategory);
                            playerFiveCards.remove("[The Geophysicist]");
                            turnComplete = true;
                        }
                        else if (playMineral.equalsIgnoreCase("The Geologist")){
                            specificationCategory = "";
                            specificationString = "";

                            while (!specificationCategory.equalsIgnoreCase("hardness") &&
                                    !specificationCategory.equalsIgnoreCase("gravity") &&
                                    !specificationCategory.equalsIgnoreCase("cleavage") &&
                                    !specificationCategory.equalsIgnoreCase("value") &&
                                    !specificationCategory.equalsIgnoreCase("abundance")) {
                                System.out.println("You have played the Geologist card. Please set the " +
                                        "specification category.");
                                specificationCategory = playCardInput.nextLine();
                            }
                            System.out.println("The Geologist card was played. Specification changed to "
                                    + specificationCategory);
                            playerFiveCards.remove("[The Geologist]");
                            turnComplete = true;
                        }
                    }
                    if (!playerFivePass && !turnComplete) {
                        System.out.println("Select the category you would like to play for card : " + playMineral);
                        while (!isCardSpecificationAllowed) {
                            playSpecification = playCardInput.nextLine();
                            if (specificationCategory.equalsIgnoreCase("")) {
                                if (playSpecification.equalsIgnoreCase("hardness")
                                        || playSpecification.equalsIgnoreCase("gravity")
                                        || playSpecification.equalsIgnoreCase("cleavage")
                                        || playSpecification.equalsIgnoreCase("abundance")
                                        || playSpecification.equalsIgnoreCase("value")) {
                                    isCardSpecificationAllowed = true;
                                    System.out.println("Specification category is now set as : " + playSpecification);
                                    specificationCategory = playSpecification;
                                } else {
                                    System.out.println("Incorrect specification. If no specification has been set, " +
                                            "you must play hardness, gravity, value, abundance or cleavage.");
                                }
                            } else if (playSpecification.equalsIgnoreCase(specificationCategory)) {
                                isCardSpecificationAllowed = true;
                            } else {
                                System.out.println("The current specification category is " + specificationCategory +
                                        " Please play a specification from the current category only.");
                            }
                        }
                        while (!isCardMorePowerful && !playerFivePass) {
                            System.out.println("Select the value of " + playSpecification);
                            playAttribute = playCardInput.nextLine();
                            if (specificationString.equalsIgnoreCase("")){
                                specificationString = readXML.xmlRead(playMineral, playSpecification, playAttribute);
                                playerFiveCards.remove("[" + playMineral + "]");
                                isCardMorePowerful = true;

                            }
                            else if (specificationCategory.equalsIgnoreCase("hardness")){
                                String storedAttributeValue =
                                        readXML.xmlRead(playMineral, playSpecification, playAttribute);
                                double specificationStringToInt = Double.parseDouble(specificationString);
                                double playAttributeToInt = Double.parseDouble(storedAttributeValue);
                                if (attributeCheck.doubleStrengthEvaluator(playAttributeToInt,
                                        specificationStringToInt)){
                                    System.out.println(playAttributeToInt + " greater than " + specificationStringToInt);
                                    specificationString = storedAttributeValue;
                                    playerFiveCards.remove("[" + playMineral + "]");
                                    isCardMorePowerful = true;

                                }
                            }
                            else if (specificationCategory.equalsIgnoreCase("gravity")){
                                String storedAttributeValue =
                                        readXML.xmlRead(playMineral, playSpecification, playAttribute);
                                double specificationStringToInt = Double.parseDouble(specificationString);
                                double playAttributeToInt = Double.parseDouble(storedAttributeValue);
                                if (attributeCheck.doubleStrengthEvaluator(playAttributeToInt,
                                        specificationStringToInt)){
                                    System.out.println(playAttributeToInt + " greater than " + specificationStringToInt);
                                    specificationString = storedAttributeValue;
                                    playerFiveCards.remove("[" + playMineral + "]");
                                    isCardMorePowerful = true;

                                }
                            }
                            else if (specificationCategory.equalsIgnoreCase("cleavage")){
                                String storedAttributeValue =
                                        readXML.xmlRead(playMineral, playSpecification, playAttribute);
                                if (attributeCheck.cleavageStrengthEvaluator(storedAttributeValue, specificationString )){
                                    System.out.println( storedAttributeValue + " greater than " + specificationString );
                                    specificationString = storedAttributeValue;
                                    playerFiveCards.remove("[" + playMineral + "]");
                                    isCardMorePowerful = true;

                                }
                            }
                            else if (specificationCategory.equalsIgnoreCase("abundance")){
                                String storedAttributeValue =
                                        readXML.xmlRead(playMineral, playSpecification, playAttribute);
                                if (attributeCheck.abundanceStrengthEvaluator(storedAttributeValue, specificationString )){
                                    System.out.println( storedAttributeValue + " greater than " + specificationString );
                                    specificationString = storedAttributeValue;
                                    playerFiveCards.remove("[" + playMineral + "]");
                                    isCardMorePowerful = true;

                                }
                            }
                            else if (specificationCategory.equalsIgnoreCase("value")){
                                String storedAttributeValue =
                                        readXML.xmlRead(playMineral, playSpecification, playAttribute);
                                if (attributeCheck.valueStrengthEvaluator(storedAttributeValue, specificationString )){
                                    System.out.println( storedAttributeValue + " greater than " + specificationString );
                                    specificationString = storedAttributeValue;
                                    playerFiveCards.remove("[" + playMineral + "]");
                                    isCardMorePowerful = true;

                                }
                            }
//                            When player missplays a card,
//                             grab a card from remaining reference numbers stored in cardsInDeck arr
                            if (!isCardMorePowerful){
                                playerFivePass = true;
                                playerPassThreshold++;
                                System.out.println("Automatically passing this turn. The value given for category "
                                        + specificationCategory + " is lower than the last played card...\n" +
                                        "Next turn, use a card with a higher value OR pass to play no card.");
                                if (deckDrawsRemaining > 0){
                                    String deckDrawnCard = cardListLocal.subList
                                            (cardsInDeck.get(0), cardsInDeck.get(0)+1).toString();
                                    playerFiveCards.add(deckDrawnCard);
                                    --deckDrawsRemaining;
                                    cardsInDeck.remove(0);
                                    System.out.println(deckDrawnCard + " was drawn from the remaining deck.");
                                }
//                                End of redraw.
                            }
                        }
                        turnComplete = true;
                    }
                    if (playerFourCards.size() <= 0){
                        winnerDeclared = true;
                        System.out.println("Congratulations to Player " + (playerTurn + 1) + " you are the winner!!!.");
                    }
                    else if (playerOnePass && playerFourPass && playerThreePass && playerTwoPass){
                        playerOnePass = false;
                        playerTwoPass = false;
                        playerThreePass = false;
                        playerFourPass = false;
                        playerFivePass = false;

                    }


                    playerTurn = 0;

                    if (playerPassThreshold - TOTALPLAYERS == -1){
                        specificationCategory = "";
                        System.out.println("All other players have passed. Specification category reset.");
                        playerPassThreshold = 0;
                    }

                }
                else {
                    playerTurn++;
                }

            }


        }
    }
}
