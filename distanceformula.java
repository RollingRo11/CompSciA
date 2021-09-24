import java.util.Scanner;
import static java.lang.System.*;

public class DistanceFormula {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int x;
        int y;
        int xTwo;
        int yTwo;

        System.out.println("Enter x1:");
        x = input.nextInt();
        System.out.println("Enter y1:");
        y = input.nextInt();
        System.out.println("Enter x2:");
        xTwo = input.nextInt();
        System.out.println("Enter y2:");
        yTwo = input.nextInt();
        System.out.println("(x1,y1) is (" + x + "," + y + ")");
        System.out.println("(x2,y2) is (" + xTwo + "," + yTwo + ")");
        double df1 = ((xTwo-x)*(xTwo-x) + (yTwo-y)*(yTwo-y));
        double df2 = Math.sqrt(df1);
        System.out.println("The distance between the two points are " + String.format("%.3f",df2));
    }
}
