package decorators;

import wrappers.Beverage;

/**
 * Condiment decorator
 */
public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();

}
