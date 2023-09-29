public class Bus implements MeansOfTransportation
{
    int length;

    public Bus(int length) {
        this.length = length;
    }

    @Override
    public void move() {
        System.out.println(" Bus reamined " + length + "km");
    }

    @Override
    public void price() {
        System.out.println("Bus price");
    }
}
