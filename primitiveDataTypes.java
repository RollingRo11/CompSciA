/*data types
Integer:
    - Whole numbers
    - takes 4 bytes to store
    - range of -2^32 through 2^51 -1 (-2B to 2B)
    - default value of 0

Double:
    - real numbers
    - takes 8 bytes to store
    - more precise than floats
    - default value of 0.0

boolean:
    - true or false
    - takes 1 byte to store
    - default value of false

char:
    - characters
    - takes 2 bytes to store
    - ranges for 255 bytes
    - no default value

numbers needed for ascii chart:
    'A' - 65
    'a' - 97
    '0' - 48
 */
import static java.lang.System.*;
public class primitiveDataTypes {
    public static void main(String[] args) {
        //we create a single and a double value respectively
        int x;
        double y;
        boolean z;
        final double pi;
        char k;

        x = 5;
        y = 5.5;
        z = true;
        pi = 3.14;
        k = 't';

        //int x = 7;
        int num7 = 7;
        //double public = 99.99;
        double $money = 32.45;
        //boolean is Red = true;
        boolean is_Red = true;
        //char 1st, 2nd, 3rd = 'B'
        char first,second,third = 'B';
        final int PLACES = 3;
        first = 'G';
        second = 'S';
        x = 14;
        y = 1.6;

        out.println("X equals " + x);
        out.println("Y equals " + y);
        out.println("Z equals " + z);
        out.println("pi equals " + pi);
        out.println("k equals " + k);
        out.println("k equals " + k);
        out.println("k equals " + k);
        out.println("k equals " + k);
        out.println("k equals " + k);



        int num1 = 25;
        int num2 = 31;

        out.println("num1: " + num1);
        out.println("num2: " + num2);

        int temp = num1;
        num1 = num2;
        num2 = temp;

        out.println("num1: " + num1);
        out.println("num2: " + num2);

    }
}
