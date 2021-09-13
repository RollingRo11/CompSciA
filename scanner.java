import java.util.Scanner;
import static java.lang.System.*;

public class scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x;
        double y;
        String str;

        out.print("Please enter an integer: ");
        x = input.nextInt();

        out.print("Please enter a double: ");
        y = input.nextDouble();

        out.print("Please enter some words: ");
        str = input.next();

        out.println(y);
        out.println(x);
        out.println(str);
        out.print("memes");
    }
}
