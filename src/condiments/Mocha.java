package condiments;

import decorators.CondimentDecorator;
import wrappers.Beverage;

/**
 * Mocha Condiment Definition
 */
public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with Mocha.";
    }

    @Override
    public double cost() {
        return 0.30 + beverage.cost();
    }
}
