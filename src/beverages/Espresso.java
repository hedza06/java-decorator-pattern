package beverages;

import wrappers.Beverage;

/**
 * Espresso Definition
 */
public class Espresso extends Beverage {

    public Espresso() {
        super.description = "Espresso";
    }

    @Override
    public double cost() {
        return 0.80;
    }
}
