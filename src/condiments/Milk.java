package condiments;

import decorators.CondimentDecorator;
import wrappers.Beverage;

public class Milk extends CondimentDecorator {

    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with Milk.";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
