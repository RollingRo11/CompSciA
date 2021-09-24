import static java.lang.System.*;
import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        out.println("What is the item purchased:");
        String item = input.nextLine();

        out.println("What is the cost of the " + item + ":");
        double cost = input.nextDouble();

        out.println("How many " + item + "s are purchased:");
        int quantity = input.nextInt();

        out.println("What is the sales tax:");
        double tax = input.nextDouble();
        double realtax = (tax*.01);

        double basePrice = (cost * quantity);
        double salesTax = (realtax * basePrice);
        double total = (salesTax + basePrice);


        out.println(quantity +" " + item + " @ " + cost + " $" + basePrice);
        out.println("Sales Tax @ " + String.format("%.1f",tax) + "%" + "  $" + String.format("%.2f", salesTax));
        out.println("Total                $" + String.format("%.2f", total));
    }
}
