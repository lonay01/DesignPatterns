import Coffe.Beverage;
import Coffe.Espresso;
import Decorator.Milk;
import Decorator.Mocha;
import Decorator.Soy;
import Decorator.Whip;

public class Main {
    public static void main(String[] args) {

        Beverage beverage = new Espresso();

        beverage = new Milk(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);

        System.out.println(beverage.getDescription() + "  " + beverage.cost());

    }
}
