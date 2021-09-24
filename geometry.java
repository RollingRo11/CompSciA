import java.util.Scanner;
import static java.lang.System.*;

public class Geometry {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        double radius;


        System.out.println("Please enter in the radius of a circle:");
        radius = input.nextDouble();
        double circumference = 2*(radius* Math.PI);
        System.out.println("Circumference of a circle is " + String.format("%.3f",circumference) + ".");
        double area = (radius*radius)*Math.PI;
        System.out.println("Area of a circle is " +  String.format("%.3f",area) + ".");
        double volume = (4*Math.PI*(radius*radius*radius))/3;
        System.out.println("Volume of a sphere is " +  String.format("%.3f",volume) + ".");
    }
}
