/**
 * Created by Matthew on 4/10/2016.
 */
import java.util.*;

public class evaluationsTest {
    public static void main(String[] args){
        int testVar;
        Scanner scanner = new Scanner(System.in);
        testVar = scanner.nextInt();
        if (testVar > 0 && testVar > 5){
            System.out.println("Values below 0 should short circut");
        }
        else if (testVar > 10 && testVar < 15 || testVar == 1){
            System.out.println("Values above 10 should short circut");
        }
    }
}
