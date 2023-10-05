package Coffe;

public class HouseBlend extends Beverage {
    @Override
    public String getDescription() {
        return "HouseBlend ";
    }
    @Override
    public double cost() {
        return .89;
    }
}
