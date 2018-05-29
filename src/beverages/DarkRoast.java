package beverages;

import wrappers.Beverage;

/**
 * Dark Roast Definition
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        super.description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return 1.20;
    }
}
