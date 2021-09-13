import static java.lang.System.*;
import java.util.Scanner;
public class rankedVoting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        out.println("Enter candidates name ");

        //ask for the candidates name
        //create doubles for each amount of votes, and then subsquently ask the user for that amount
        String candidateName = input.next();
        out.println("Enter " + candidateName + " first place votes");
        double canFirstPlace = input.nextInt();
        out.println("Enter " + candidateName + " second place votes");
        double canSecondPlace = input.nextInt();
        out.println("Enter " + candidateName + " third place votes");
        double canThirdPlace = input.nextInt();
        double totalvotes = (canThirdPlace + canSecondPlace + canFirstPlace);



        //create the percentage value for the current over total
        double firstPercent;
        firstPercent = (canThirdPlace/totalvotes);
        out.println(firstPercent);
        String.format("(%.3f)", firstPercent);

        out.println(canFirstPlace);
        out.println(canSecondPlace);
        out.println(canThirdPlace);

    }
}