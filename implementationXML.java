/**
 * Created by Matthew on 29/09/2016.
 */
//
//    public class implementationXML {
//        public static void main(String args[]){
//            cardSelector readXml = new cardSelector();
//            readXml.getXml("Quartz", "7");
//        }
//    }
//

public class implementationXML {
    public static void main(String args[]){
        strengthEvaluator x = new strengthEvaluator();
        cardSelector readXML = new cardSelector();
        System.out.println(readXML.xmlRead("quartz", "hardness", "78966"));
        System.out.println(readXML.xmlRead("quartz", "abundance", "78966"));
        System.out.println(readXML.xmlRead("quartz", "gravity", "78966"));
        System.out.println(readXML.xmlRead("moonrocks", "hardness", "78966"));
        System.out.println(readXML.xmlRead("moonrocks", "gravity", "78966"));
        System.out.println(readXML.xmlRead("oi", "abundance", "high"));
        System.out.println(x.cleavageStrengthEvaluator("poor/none", "1 perfect"));
        System.out.println(x.cleavageStrengthEvaluator("poor/none", "1 perfect"));
        System.out.println(x.cleavageStrengthEvaluator("3 perfect", "1 perfect"));

    }
}