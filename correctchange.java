import java.util.Scanner;
public class CorrectChange{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int cents=sc.nextInt();

        int dollars=cents/100;
        int remainder0=cents%100;
        int quarters=remainder0/25;
        int remainder1=remainder0%25;
        int dime=remainder1/10;
        int remainder2=remainder1%10;
        int nickel=remainder2/5;
        int penny=remainder2%5;
        System.out.println("How many cents is due:Your change is "+dollars+" dollar, "+quarters+" quarter, "+dime+" dime, "+nickel+" nickel, and "+penny+" penny.");


    }
}
