public class Taxi implements MeansOfTransportation{
    int length;

    public Taxi(int length) {
        this.length = length;
    }

    @Override
    public void move() {
        System.out.println(" Taxi reamined " + length + "km");
    }

    @Override
    public void price() {
        System.out.println("taxi price");
    }
}
