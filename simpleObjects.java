/*
Object Oriented Programming is when the main method can call on other
Instance:
    - In scanner, scanner is the class and input is the instance, or more
      specifically, an object.
 */




public class simpleObjects {
    //attributes
    private String name;
    private double cost;
    private int sales;

    //behaviors
    //constructors
    public simpleObjects (int s, double c, String n)
    {
        name = n;
        cost = c;
        sales = s;
    }
    //modifier
    public void changeCost (double val)
    {
        cost = val;
    }

    //accessor
    public double getCost()
    {
        return cost;
    }

    public static void main(String[] args) {
        simpleObjects x = new simpleObjects(5, 9.99, "In Absentia");
        simpleObjects y = new simpleObjects(28, 1.99, "Party in the USA");
        System.out.println((x.name + " " + x.getCost()+ " " + x.sales));

        x.sales = 15;
        x.name = "Bonus Dad";
        x.changeCost(7.99);

        System.out.println(x.name + " " + x.getCost() + " " + x.sales);
        System.out.println(y.name + " " + y.getCost() + " " + y.sales);

    }
}
