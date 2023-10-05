package Coffe;

public abstract class Beverage {
    String description = "Coffe.Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
