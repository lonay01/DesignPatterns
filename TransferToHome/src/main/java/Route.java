public class Route {
    public MeansOfTransportation meansOfTransportation;

    public Route(MeansOfTransportation meansOfTransportation) {
        this.meansOfTransportation = meansOfTransportation;
    }

    public void setMeansOfTransportation(MeansOfTransportation meansOfTransportation) {
        this.meansOfTransportation = meansOfTransportation;
    }

    public MeansOfTransportation getMeansOfTransportation() {
        return meansOfTransportation;
    }

    public void routePrice() {
        meansOfTransportation.price();
    }

    public void routeMove() {
        meansOfTransportation.move();
    }
}
