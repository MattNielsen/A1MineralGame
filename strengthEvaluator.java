import java.util.ArrayList;

/**
 * Created by Matthew on 5/10/2016.
 */
public class strengthEvaluator {
    public Boolean cleavageStrengthEvaluator(String challengeValue, String standingValue){
        ArrayList<String> cleavageRankings = new ArrayList<String>();
        cleavageRankings.add("none");
        cleavageRankings.add("poor/none");
        cleavageRankings.add("1 poor");
        cleavageRankings.add("2 poor");
        cleavageRankings.add("1 good");
        cleavageRankings.add("1 good/1 poor");
        cleavageRankings.add("2 good");
        cleavageRankings.add("3 good");
        cleavageRankings.add("1 perfect");
        cleavageRankings.add("1 perfect/1 good");
        cleavageRankings.add("1 perfect/2 good");
        cleavageRankings.add("2 perfect/1 good");
        cleavageRankings.add("3 perfect");
        cleavageRankings.add("4 perfect");
        cleavageRankings.add("6 perfect");
        if (cleavageRankings.indexOf(challengeValue) > cleavageRankings.indexOf(standingValue)){
            return true;
        }
        else {
            return false;
        }
    }
    public Boolean abundanceStrengthEvaluator(String challengeValue, String standingValue){
        ArrayList<String> abundanceRankings = new ArrayList<String>();
        abundanceRankings.add("ultratrace");
        abundanceRankings.add("trace");
        abundanceRankings.add("low");
        abundanceRankings.add("moderate");
        abundanceRankings.add("high");
        abundanceRankings.add("very high");
        if (abundanceRankings.indexOf(challengeValue) > abundanceRankings.indexOf(standingValue)){
            return true;
        }
        else {
            return false;
        }
    }
    public Boolean valueStrengthEvaluator(String challengeValue, String standingValue){
        ArrayList<String> valueRankings = new ArrayList<String>();
        valueRankings.add("trivial");
        valueRankings.add("low");
        valueRankings.add("moderate");
        valueRankings.add("high");
        valueRankings.add("very high");
        valueRankings.add("im rich");
        if (valueRankings.indexOf(challengeValue) > valueRankings.indexOf(standingValue)){
            return true;
        }
        else {
            return false;
        }
    }
    public Boolean doubleStrengthEvaluator(double challengeValue, double standingValue){
        if (challengeValue > standingValue){
            return true;
        }
        else {
            return false;
        }
    }

}
