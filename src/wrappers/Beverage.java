package wrappers;

/**
 * Beverage definition
 */
public abstract class Beverage {

    public String description = "Unknown Beverage";

    public String getDescription() {
        return this.description;
    }

    public abstract double cost();
}
