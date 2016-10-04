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
        while (!menuOutput.equals("q"))
            if (menuOutput.equals("p")) {
                System.out.println("Please enter the number of players in this game (3-5)");
                int playerCountOutput = menuInput.nextInt();
                System.out.println(playerCountOutput);
                if (playerCountOutput >= 3 && playerCountOutput <= 5) {
                    gamePlay(playerCountOutput);
                    System.out.println("Menu options;\n(R)ules\n(P)lay\n(Q)uit");
                    menuOutput = menuInput.next().toLowerCase();
                } else {
                    System.out.println("Please enter the number of players in this game. Must be 3, 4 or 5.....");
                }
            }
        System.out.println("NO Q FOUND ");
    }

    public static void gamePlay(int players) {
        int TOTALPLAYERS = players;
        int playerDecksCount = players - 1;
        int playerTurn = 0;
        String specificationCategory = "";
        Boolean winnerDeclared = false;

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
        System.out.println(cardListLocal.subList(1, 1));
        System.out.println(cardListLocal.subList(10, 12));
        System.out.println(cardListLocal.subList(2, 6));
        System.out.println(cardListLocal.subList(53, 54));
        players = players - 1;
        ArrayList<Integer> cardsPool = new ArrayList<Integer>();
        List<List<Integer>> playList = new ArrayList<List<Integer>>(5);
        for (int i = 0; i < 5; ++i) {
            playList.add(new ArrayList<Integer>());
        }
        ArrayList<String> playerOneCards = new ArrayList<String>();
        ArrayList<String> playerTwoCards = new ArrayList<String>();
        ArrayList<String> playerThreeCards = new ArrayList<String>();
        ArrayList<String> playerFourCards = new ArrayList<String>();
        ArrayList<String> playerFiveCards = new ArrayList<String>();


//        Continue drawing numbers to correspond to cards, until eight non-duplicates.
        Random randomNumber = new Random();
        while (players >= 0) {
            int drawTotal = 8;
            while (drawTotal > 0) {
                boolean duplicateFlag = false;
                int randomlyDrawnNumber = randomNumber.nextInt(53);
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

        while (playerDecksCount >= 0)
        {
            if (playerDecksCount == 4)
            {
                for (int playingCards : playList.get(playerDecksCount)) {
                    playerFiveCards.add(cardListLocal.subList(playingCards, playingCards + 1).toString());
                }
            }
            else if (playerDecksCount == 3)
            {
                for (int playingCards : playList.get(playerDecksCount)) {
                    playerFourCards.add(cardListLocal.subList(playingCards, playingCards + 1).toString());
                }
            }
            else if (playerDecksCount == 2){
                for (int playingCards : playList.get(playerDecksCount)) {
                    playerThreeCards.add(cardListLocal.subList(playingCards, playingCards + 1).toString());
                }
                }
            else if (playerDecksCount == 1){
                for (int playingCards : playList.get(playerDecksCount)) {
                    playerTwoCards.add(cardListLocal.subList(playingCards, playingCards + 1).toString());
                }
                }
            else if (playerDecksCount == 0){
                for (int playingCards : playList.get(playerDecksCount)) {
                    playerOneCards.add(cardListLocal.subList(playingCards, playingCards + 1).toString());

                }
            }
            playerDecksCount--;
        }
        while (!winnerDeclared) {

//      **** Show the cards in each players hand.
            System.out.println("Player one : Which card would you like to play? " + playerOneCards + "\n"
                    + "You have " + playerOneCards.size() + "cards remaining...");
            System.out.println(playerTwoCards);
            System.out.println(playerThreeCards);
            System.out.println(playerFourCards);
            System.out.println(playerFiveCards);
//        System.out.println(playList);
//        Collections.sort(cardsPool);
//        System.out.println(cardsPool);
//      **** Prompt the player to pick a card from their hand. Match it against an XML file with stored elements / info.
            Boolean isCardSpecificationAllowed = false;
            Boolean isCardInHand = false;
            Boolean turnComplete = false;
            Scanner playCardInput = new Scanner(System.in);
            String playMineral = "";
            String playSpecification = "";
            String playAttribute = "";
            while (!turnComplete) {
                if (playerTurn == 0) {
                    System.out.println("Currently Player" + playerTurn + " 's turn." +
                            "\nSelect a mineral card from your hand." +"\nPlay a card by typing its name below.");
                    while (!isCardInHand) {
                        playMineral = playCardInput.nextLine();
                        for (String cardsInPlay : playerOneCards) {
                            if (cardsInPlay.replace("[", "").replace("]", "").equalsIgnoreCase(playMineral)) {
                                isCardInHand = true;
                            }
                        }
                        if (!isCardInHand) {
                            System.out.println("Please select a mineral card from one of the following cards : "
                                    + playerOneCards);
                        }

                    }

                    System.out.println("Select the category you would like to play for card : " + playMineral);
                    while (!isCardSpecificationAllowed){
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
                        }
                        else if (playSpecification.equalsIgnoreCase(specificationCategory)){
                            isCardSpecificationAllowed = true;
                        }
                        else {
                            System.out.println( "The current specification category is " + specificationCategory +
                                    "Please play a specification from the current category only.");
                        }
                    }
                    System.out.println("Select the value of " + playSpecification);
                    playAttribute = playCardInput.nextLine();
                    cardSelector readXML = new cardSelector();
                    System.out.println(readXML.xmlRead(playMineral, playSpecification, playAttribute));
                    turnComplete = true;
                    playerOneCards.remove("["+playMineral+"]");
                    if (playerOneCards.size() <= 0){
                        winnerDeclared = true;
                        System.out.println("Congratulations to Player " + playerTurn + " you are the winner!!!.");
                    }
                    else {
                        playerTurn++;
                    }


                }
                else if (playerTurn == 1) {
                    System.out.println("Currently Player" + playerTurn + " 's turn." +
                            "\nSelect a mineral card from your hand." +"\nPlay a card by typing its name below.");
                    while (!isCardInHand) {
                        playMineral = playCardInput.nextLine();
                        for (String cardsInPlay : playerTwoCards) {
                            if (cardsInPlay.replace("[", "").replace("]", "").equalsIgnoreCase(playMineral)) {
                                isCardInHand = true;
                            }
                        }
                        if (!isCardInHand) {
                            System.out.println("Please select a mineral card from one of the following cards : "
                                    + playerTwoCards);
                        }

                    }

                    System.out.println("Select the category you would like to play for card : " + playMineral);
                    while (!isCardSpecificationAllowed){
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
                        }
                        else if (playSpecification.equalsIgnoreCase(specificationCategory)){
                            isCardSpecificationAllowed = true;
                        }
                        else {
                            System.out.println( "The current specification category is " + specificationCategory +
                                    "Please play a specification from the current category only.");
                        }
                    }
                    System.out.println("Select the value of " + playSpecification);
                    playAttribute = playCardInput.nextLine();
                    cardSelector readXML = new cardSelector();
                    System.out.println(readXML.xmlRead(playMineral, playSpecification, playAttribute));
                    turnComplete = true;
                    playerTwoCards.remove("["+playMineral+"]");
                    if (playerTwoCards.size() <= 0){
                        winnerDeclared = true;
                        System.out.println("Congratulations to Player " + playerTurn + " you are the winner!!!.");
                    }
                    else {
                        playerTurn++;
                    }
                }
                else if (playerTurn == 2) {
                    System.out.println("Currently Player" + playerTurn + " 's turn." +
                            "\nSelect a mineral card from your hand." +"\nPlay a card by typing its name below.");
                    while (!isCardInHand) {
                        playMineral = playCardInput.nextLine();
                        for (String cardsInPlay : playerThreeCards) {
                            if (cardsInPlay.replace("[", "").replace("]", "").equalsIgnoreCase(playMineral)) {
                                isCardInHand = true;
                            }
                        }
                        if (!isCardInHand) {
                            System.out.println("Please select a mineral card from one of the following cards : "
                                    + playerThreeCards);
                        }

                    }

                    System.out.println("Select the category you would like to play for card : " + playMineral);
                    while (!isCardSpecificationAllowed){
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
                        }
                        else if (playSpecification.equalsIgnoreCase(specificationCategory)){
                            isCardSpecificationAllowed = true;
                        }
                        else {
                            System.out.println( "The current specification category is " + specificationCategory +
                                    "Please play a specification from the current category only.");
                        }
                    }
                    System.out.println("Select the value of " + playSpecification);
                    playAttribute = playCardInput.nextLine();
                    cardSelector readXML = new cardSelector();
                    System.out.println(readXML.xmlRead(playMineral, playSpecification, playAttribute));
                    turnComplete = true;
                    playerThreeCards.remove("["+playMineral+"]");
                    if (playerThreeCards.size() <= 0){
                        winnerDeclared = true;
                        System.out.println("Congratulations to Player " + playerTurn + " you are the winner!!!.");
                    }
                    else if (TOTALPLAYERS > 3){
                        playerTurn++;
                    }
                    else {
                        playerTurn = 0;
                    }
                }
                else if (playerTurn == 3) {
                    System.out.println("Currently Player" + playerTurn + " 's turn." +
                            "\nSelect a mineral card from your hand." +"\nPlay a card by typing its name below.");
                    while (!isCardInHand) {
                        playMineral = playCardInput.nextLine();
                        for (String cardsInPlay : playerFourCards) {
                            if (cardsInPlay.replace("[", "").replace("]", "").equalsIgnoreCase(playMineral)) {
                                isCardInHand = true;
                            }
                        }
                        if (!isCardInHand) {
                            System.out.println("Please select a mineral card from one of the following cards : "
                                    + playerFourCards);
                        }

                    }

                    System.out.println("Select the category you would like to play for card : " + playMineral);
                    while (!isCardSpecificationAllowed){
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
                        }
                        else if (playSpecification.equalsIgnoreCase(specificationCategory)){
                            isCardSpecificationAllowed = true;
                        }
                        else {
                            System.out.println( "The current specification category is " + specificationCategory +
                                    "Please play a specification from the current category only.");
                        }
                    }
                    System.out.println("Select the value of " + playSpecification);
                    playAttribute = playCardInput.nextLine();
                    cardSelector readXML = new cardSelector();
                    System.out.println(readXML.xmlRead(playMineral, playSpecification, playAttribute));
                    turnComplete = true;
                    playerFourCards.remove("["+playMineral+"]");
                    if (playerFourCards.size() <= 0){
                        winnerDeclared = true;
                        System.out.println("Congratulations to Player " + playerTurn + " you are the winner!!!.");
                    }
                    else if (TOTALPLAYERS > 4){
                        playerTurn++;
                    }
                    else {
                        playerTurn = 0;
                    }

                }
                else if (playerTurn == 4) {
                    System.out.println("Currently Player" + playerTurn + " 's turn." +
                            "\nSelect a mineral card from your hand." +"\nPlay a card by typing its name below.");
                    while (!isCardInHand) {
                        playMineral = playCardInput.nextLine();
                        for (String cardsInPlay : playerFourCards) {
                            if (cardsInPlay.replace("[", "").replace("]", "").equalsIgnoreCase(playMineral)) {
                                isCardInHand = true;
                            }
                        }
                        if (!isCardInHand) {
                            System.out.println("Please select a mineral card from one of the following cards : "
                                    + playerFourCards);
                        }

                    }
                    System.out.println("Select the category you would like to play for card : " + playMineral);
                    while (!isCardSpecificationAllowed){
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
                        }
                        else if (playSpecification.equalsIgnoreCase(specificationCategory)){
                            isCardSpecificationAllowed = true;
                        }
                        else {
                            System.out.println( "The current specification category is " + specificationCategory +
                                    "Please play a specification from the current category only.");
                        }
                    }
                    System.out.println("Select the value of " + playSpecification);
                    playAttribute = playCardInput.nextLine();
                    cardSelector readXML = new cardSelector();
                    System.out.println(readXML.xmlRead(playMineral, playSpecification, playAttribute));
                    turnComplete = true;
                    playerFourCards.remove("["+playMineral+"]");
                    if (playerFourCards.size() <= 0){
                        winnerDeclared = true;
                        System.out.println("Congratulations to Player " + playerTurn + " you are the winner!!!.");
                    }
                    else {
                        playerTurn = 0;
                    }
                }
                }


        }
    }
}
//    public static void drawCards(int drawCount, int drawMax)
//    {
//        ArrayList<Integer> draw = new ArrayList<Integer>();
//        Random randomNumbers = new Random();
//        for (int idx = 1; idx <= drawCount; ++idx)
//        {
//            int randomDraw = randomNumbers.nextInt(drawMax);
//            System.out.println(randomDraw);
//            draw.add(randomDraw);
//        }
//        System.out.println(draw);
//    }
//    }

//    public static String cardPool(int card, String category)
//    {
//
//        if (category.contains("hardness")){
//            type = 1;
//        }
//        else if (category.contains("specific gravity")){
//            type = 2;
//        }
//        else if (category.contains("cleavage")){
//            type = 3;
//        }
//        else if (category.contains("crystal abundance")){
//            type = 4;
//        }
//        else if (category.contains("economic value")){
//            type = 5;
//        }
//        else{
//            System.out.println("Invalid value detected.");
//        }
//        System.out.println(type + category);
//        return mineralCards[card][type];
//    }
//}