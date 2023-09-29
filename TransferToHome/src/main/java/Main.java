public class Main {
    public static void main(String[] args) {
        Route r1 = new Route(new Metro(15));
        r1.routePrice();
        r1.routeMove();

        r1.setMeansOfTransportation(new Taxi(15));
        r1.routeMove();
        r1.routePrice();
    }
}
