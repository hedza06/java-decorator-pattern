package condiments;

import decorators.CondimentDecorator;
import wrappers.Beverage;

/**
 * Whip Condiment Definition.
 */
public class Whip extends CondimentDecorator {

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with whipped cream.";
    }

    @Override
    public double cost() {
        return 0.30 + beverage.cost();
    }
}
