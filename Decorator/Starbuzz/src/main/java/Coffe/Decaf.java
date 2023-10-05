package Coffe;

public class Decaf extends Beverage {
    @Override
    public String getDescription() {
        return "DarkRoast ";
    }
    @Override
    public double cost() {
        return 1.05;
    }
}
