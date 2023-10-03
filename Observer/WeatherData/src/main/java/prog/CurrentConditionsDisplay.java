package prog;


public class CurrentConditionsDisplay implements Observer, DisplayElement {
    float temperature;
    float humidity;
    float pressure;
    WeatherData subject;

    public CurrentConditionsDisplay(WeatherData subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }


    @Override
    public void display() {
        System.out.println("CurrentConditionsDisplay{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}');
    }

    @Override
    public void update() {
        this.temperature = subject.getTemperature();
        this.humidity = subject.getHumidity();
        this.pressure = subject.getPressure();
        display();
    }
}
