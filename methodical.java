public class methodical {

    public static void main(String[] args) {

        int x, y, z;

        x = 9;

        y = 3;

        z = 2;

        x = alpha(x);

        y = alpha(y);

        z = beta(z);

        omega(x,y,z);

        kappa(x);

        kappa(z);

        omega(x,y,z);

        y = beta(x);

        z = alpha(y);

        kappa(y);

        omega(x,y,z);

        omega(y,x,z);

    }

    public static int alpha(int x) {

        return 2 * x;

    }

    public static int beta(int x) {

        return x + 4;

    }

    public static void kappa(int x) {

        x = x - 6;

    }

    public static void omega(int a, int b, int c) {

        System.out.println(a + ":" + b + ":" + c);

    }

}
