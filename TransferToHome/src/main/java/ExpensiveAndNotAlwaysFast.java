public class ExpensiveAndNotAlwaysFast extends Route{
    public ExpensiveAndNotAlwaysFast(int length) {
        super(new Taxi(length));
    }
}
