package prog;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Main main1 = new Main();
        WeatherData subject = new WeatherData();

        Observer observer1 = new CurrentConditionsDisplay(subject);
        Observer observer2 = new StaticsticsDisplay(subject);
        Observer observer3 = new HeatIndexDisplay(subject);

        System.out.println("-----------------------------");
        subject.setAll(15,100,320);
        synchronized (main1) {
            main1.wait(1000);
        }
        System.out.println("-----------------------------");
        subject.setAll(17,80,310);
        synchronized (main1) {
            main1.wait(1000);
        }
        System.out.println("-----------------------------");
        subject.setAll(12,10,370);
        System.out.println("-----------------------------");
        subject.setAll(9,20,308);
        System.out.println("-----------------------------");
        subject.setAll(25,30,360);
        synchronized (main1) {
            main1.wait(1000);
        }
        System.out.println("-----------------------------");
        subject.setAll(15,60,390);
        System.out.println("-----------------------------");
        subject.setAll(11,50,300);

    }
}
