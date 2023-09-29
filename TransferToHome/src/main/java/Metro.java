public class Metro implements MeansOfTransportation
{
    int length;

    public Metro(int length) {
        this.length = length;
    }

    @Override
    public void move() {
        System.out.println(" Metro reamined " + length + "km");
    }

    @Override
    public void price() {
        System.out.println("Metro price");
    }
}
