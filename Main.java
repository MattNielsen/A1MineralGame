/*
 * Created by Matthew on 12/09/2016. assignment 1
 */

import java.util.*;

public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to Matthew's Mineral Super Trumps game!");
        System.out.println("Menu options;\n(R)ules\n(P)lay\n(Q)uit");
        Scanner menuInput = new Scanner(System.in);
        String menuOutput = menuInput.nextLine().toLowerCase();
        while (!menuOutput.equals("q"))
            if (menuOutput.equals("p")){
                System.out.println("Please enter the number of players in this game (3-5)");
                int playerCountOutput = menuInput.nextInt();
                System.out.println(playerCountOutput);
                if (playerCountOutput >= 3 && playerCountOutput <=5){
                    gamePlay(playerCountOutput);
                    System.out.println("Menu options;\n(R)ules\n(P)lay\n(Q)uit");
                    menuOutput = menuInput.next().toLowerCase();
               }
                else {
                    System.out.println("Please enter the number of players in this game. Must be 3, 4 or 5.....");
                }
            }
            System.out.println("NO Q FOUND ");
    }
    public static void gamePlay(int players) {

        players = players - 1;
        ArrayList<Integer> cardsPool = new ArrayList<Integer>();
        List<List<Integer>> playList = new ArrayList<List<Integer>>(5);
        for (int i = 0; i < 5; ++i){
            playList.add(new ArrayList<Integer>());
        }
        ArrayList playerTwoCards = new ArrayList();
        ArrayList playerThreeCards = new ArrayList();
        ArrayList playerFourCards = new ArrayList();
        ArrayList playerFiveCards = new ArrayList();



//        Continue drawing numbers to correspond to cards, until eight non-duplicates.
        Random randomNumber = new Random();
        while (players >= 0){
            int drawTotal = 8;
            while (drawTotal > 0){
                boolean duplicateFlag = false;
                int randomlyDrawnNumber = randomNumber.nextInt(53);
                for (int cards : cardsPool){
                    if (randomlyDrawnNumber == cards){
                        duplicateFlag = true;
                    }
                }
                if (!duplicateFlag){
                    playList.get(players).add(randomlyDrawnNumber);
                    cardsPool.add(randomlyDrawnNumber);
                    drawTotal --;
                }
            }
            players --;
        }


        System.out.println(playList);
        Collections.sort(cardsPool);
        System.out.println(cardsPool);

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
    }

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