package condiments;

import decorators.CondimentDecorator;
import wrappers.Beverage;

/**
 * IceCream Definition
 */
public class IceCream extends CondimentDecorator {

    private Beverage beverage;

    public IceCream(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with Ice Cream.";
    }

    @Override
    public double cost() {
        return 0.60 + beverage.cost();
    }
}
