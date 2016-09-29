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

    public static String cardPool(int card, String category)
    {
        category = category.toLowerCase();
        int type = 0;

        String[][] mineralCards = new String[54][6];

        mineralCards[0][0] = "Quartz";
        mineralCards[0][1] = "7";
        mineralCards[0][2] = "2.65";
        mineralCards[0][3] = "none";
        mineralCards[0][4] = "high";
        mineralCards[0][5] = "moderate";

        mineralCards[1][0] = "Plagioclase";
        mineralCards[1][1] = "6.5";
        mineralCards[1][2] = "2.8";
        mineralCards[1][3] = "perfect";
        mineralCards[1][4] = "Plagioclase";
        mineralCards[1][5] = "Plagioclase";

        mineralCards[2][0] = "Orthoclase";
        mineralCards[2][1] = "Orthoclase";
        mineralCards[2][2] = "Orthoclase";
        mineralCards[2][3] = "Orthoclase";
        mineralCards[2][4] = "Orthoclase";
        mineralCards[2][5] = "Orthoclase";

        mineralCards[3][0] = "Biotite";
        mineralCards[3][1] = "Biotite";
        mineralCards[3][2] = "Biotite";
        mineralCards[3][3] = "Biotite";
        mineralCards[3][4] = "Biotite";
        mineralCards[3][5] = "Biotite";

        mineralCards[4][0] = "Muscovite";
        mineralCards[4][1] = "Muscovite";
        mineralCards[4][2] = "Muscovite";
        mineralCards[4][3] = "Muscovite";
        mineralCards[4][4] = "Muscovite";
        mineralCards[4][5] = "Muscovite";

        mineralCards[5][0] = "Hornblende";
        mineralCards[5][0] = "Hornblende";
        mineralCards[5][0] = "Hornblende";
        mineralCards[5][0] = "Hornblende";
        mineralCards[5][0] = "Hornblende";
        mineralCards[5][0] = "Hornblende";

        mineralCards[6][0] = "Actinolite";
        mineralCards[6][0] = "Actinolite";
        mineralCards[6][0] = "Actinolite";
        mineralCards[6][0] = "Actinolite";
        mineralCards[6][0] = "Actinolite";
        mineralCards[6][0] = "Actinolite";

        mineralCards[7][0] = "Glaucophane";
        mineralCards[7][1] = "Glaucophane";
        mineralCards[7][2] = "Glaucophane";
        mineralCards[7][3] = "Glaucophane";
        mineralCards[7][4] = "Glaucophane";
        mineralCards[7][5] = "Glaucophane";

        mineralCards[8][0] = "Olivine";
        mineralCards[8][0] = "Olivine";
        mineralCards[8][0] = "Olivine";
        mineralCards[8][0] = "Olivine";
        mineralCards[8][0] = "Olivine";
        mineralCards[8][0] = "Olivine";

        mineralCards[9][0] = "Garnet";
        mineralCards[9][0] = "Garnet";
        mineralCards[9][0] = "Garnet";
        mineralCards[9][0] = "Garnet";
        mineralCards[9][0] = "Garnet";
        mineralCards[9][0] = "Garnet";

        mineralCards[10][0] = "Titanite";
        mineralCards[10][0] = "Titanite";
        mineralCards[10][0] = "Titanite";
        mineralCards[10][0] = "Titanite";
        mineralCards[10][0] = "Titanite";
        mineralCards[10][0] = "Titanite";

        mineralCards[11][0] = "Zircon";
        mineralCards[11][0] = "Zircon";
        mineralCards[11][0] = "Zircon";
        mineralCards[11][0] = "Zircon";
        mineralCards[11][0] = "Zircon";
        mineralCards[11][0] = "Zircon";

        mineralCards[12][0] = "Augite";
        mineralCards[12][0] = "Augite";
        mineralCards[12][0] = "Augite";
        mineralCards[12][0] = "Augite";
        mineralCards[12][0] = "Augite";
        mineralCards[12][0] = "Augite";

        mineralCards[13][0] = "Orthopyroxene";
        mineralCards[13][0] = "Orthopyroxene";
        mineralCards[13][0] = "Orthopyroxene";
        mineralCards[13][0] = "Orthopyroxene";
        mineralCards[13][0] = "Orthopyroxene";
        mineralCards[13][0] = "Orthopyroxene";

        mineralCards[14][0] = "Chlorite";
        mineralCards[14][0] = "Chlorite";
        mineralCards[14][0] = "Chlorite";
        mineralCards[14][0] = "Chlorite";
        mineralCards[14][0] = "Chlorite";
        mineralCards[14][0] = "Chlorite";

        mineralCards[15][0] = "Antigorite";
        mineralCards[15][0] = "Antigorite";
        mineralCards[15][0] = "Antigorite";
        mineralCards[15][0] = "Antigorite";
        mineralCards[15][0] = "Antigorite";
        mineralCards[15][0] = "Antigorite";

        mineralCards[16][0] = "Talc";
        mineralCards[16][0] = "Talc";
        mineralCards[16][0] = "Talc";
        mineralCards[16][0] = "Talc";
        mineralCards[16][0] = "Talc";
        mineralCards[16][0] = "Talc";

        mineralCards[17][0] = "Kaolinite";
        mineralCards[17][0] = "Kaolinite";
        mineralCards[17][0] = "Kaolinite";
        mineralCards[17][0] = "Kaolinite";
        mineralCards[17][0] = "Kaolinite";
        mineralCards[17][0] = "Kaolinite";

        mineralCards[18][0] = "Andalusite";
        mineralCards[18][0] = "Andalusite";
        mineralCards[18][0] = "Andalusite";
        mineralCards[18][0] = "Andalusite";
        mineralCards[18][0] = "Andalusite";
        mineralCards[18][0] = "Andalusite";

        mineralCards[19][0] = "Kyanite";
        mineralCards[19][0] = "Kyanite";
        mineralCards[19][0] = "Kyanite";
        mineralCards[19][0] = "Kyanite";
        mineralCards[19][0] = "Kyanite";
        mineralCards[19][0] = "Kyanite";

        mineralCards[20][0] = "Sillimanite";
        mineralCards[20][0] = "Sillimanite";
        mineralCards[20][0] = "Sillimanite";
        mineralCards[20][0] = "Sillimanite";
        mineralCards[20][0] = "Sillimanite";
        mineralCards[20][0] = "Sillimanite";

        mineralCards[21][0] = "Staurolite";
        mineralCards[21][0] = "Staurolite";
        mineralCards[21][0] = "Staurolite";
        mineralCards[21][0] = "Staurolite";
        mineralCards[21][0] = "Staurolite";
        mineralCards[21][0] = "Staurolite";

        mineralCards[22][0] = "Epidote";
        mineralCards[22][0] = "Epidote";
        mineralCards[22][0] = "Epidote";
        mineralCards[22][0] = "Epidote";
        mineralCards[22][0] = "Epidote";
        mineralCards[22][0] = "Epidote";

        mineralCards[23][0] = "Tourmaline";
        mineralCards[23][0] = "Tourmaline";
        mineralCards[23][0] = "Tourmaline";
        mineralCards[23][0] = "Tourmaline";
        mineralCards[23][0] = "Tourmaline";
        mineralCards[23][0] = "Tourmaline";

        mineralCards[24][0] = "Topaz";
        mineralCards[24][0] = "Topaz";
        mineralCards[24][0] = "Topaz";
        mineralCards[24][0] = "Topaz";
        mineralCards[24][0] = "Topaz";
        mineralCards[24][0] = "Topaz";

        mineralCards[25][0] = "Beryl";
        mineralCards[25][0] = "Beryl";
        mineralCards[25][0] = "Beryl";
        mineralCards[25][0] = "Beryl";
        mineralCards[25][0] = "Beryl";
        mineralCards[25][0] = "Beryl";
//        ^Silicate
        mineralCards[26][0] = "Pyrite";
        mineralCards[27][0] = "Pyrrhotite";
        mineralCards[28][0] = "Chalcopyrite";
        mineralCards[29][0] = "Galena";
        mineralCards[30][0] = "Sphalerite";
        mineralCards[31][0] = "Molybdenite";
//        ^Sulfide
        mineralCards[32][0] = "Gypsum";
        mineralCards[33][0] = "Barite";
//        ^Sulfate
        mineralCards[34][0] = "Apatite";
        mineralCards[35][0] = "Monazite";
//        ^Phosphate
        mineralCards[36][0] = "Calcite";
        mineralCards[37][0] = "Dolomite";
        mineralCards[38][0] = "Magnesite";
        mineralCards[39][0] = "Siderite";
//         ^Carbonate minerals:
        mineralCards[40][0] = "Magnetite";
        mineralCards[41][0] = "Hematite";
        mineralCards[42][0] = "Chromite";
        mineralCards[43][0] = "Ilmenite";
        mineralCards[44][0] = "Rutile";
        mineralCards[45][0] = "Corundum";
        mineralCards[46][0] = "Cassiterite";
//         ^Oxide minerals:
        mineralCards[47][0] = "Gibbsite";
        mineralCards[48][0] = "Goethite";
//        ^Hydroxide minerals
        mineralCards[49][0] = "Halite";
        mineralCards[50][0] = "Fluorite";
//        ^Halide
        mineralCards[51][0] = "Gold";
        mineralCards[52][0] = "Diamond";
        mineralCards[53][0] = "Graphite";
//        end of the minerals array
        if (category.contains("hardness")){
            type = 1;
        }
        else if (category.contains("specific gravity")){
            type = 2;
        }
        else if (category.contains("cleavage")){
            type = 3;
        }
        else if (category.contains("crystal abundance")){
            type = 4;
        }
        else if (category.contains("economic value")){
            type = 5;
        }
        else{
            System.out.println("Invalid value detected.");
        }
        System.out.println(type + category);
        return mineralCards[card][type];
    }
}