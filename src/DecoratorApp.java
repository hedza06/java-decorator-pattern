import beverages.DarkRoast;
import beverages.Espresso;
import condiments.Mocha;
import condiments.Whip;
import wrappers.Beverage;

public class DecoratorApp {

    public static void main(String[] args)
    {
        // ordering espresso with mocha...
        System.out.println("Order 1 processing...");
        Beverage esspresso = new Espresso();
        esspresso = new Mocha(esspresso);
        System.out.println(esspresso.getDescription() + " " + esspresso.cost() + " EUR");

        System.out.println("------------------------------------");

        // ordering dark roast
        System.out.println("Order 2 processing...");
        Beverage darkRoast = new DarkRoast();
        darkRoast = new Whip(darkRoast);
        System.out.println(darkRoast.getDescription() + " " + darkRoast.cost() + " EUR");

        System.out.println("------------------------------------");

        // ordering espresso
        System.out.println("Order 3 processing...");
        Beverage onlyEspresso = new Espresso();
        System.out.println(onlyEspresso.getDescription() + " " + onlyEspresso.cost() + " EUR");
    }

}
