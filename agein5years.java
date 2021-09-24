import java.util.Scanner;

public class AgeInFiveYears {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Hello. What is your name?");
        String name = input.nextLine();

        System.out.println("Hi, " + name + "! How old are you?");
        int age = input.nextInt();

        int agePlusFive = (age + 5);
        int ageMinFive = (age - 5);
        System.out.println("Did you know that in five years you will be " + agePlusFive + " years old?");
        System.out.println("And five years ago you were " + ageMinFive + "! Imagine that!");
    }
}
