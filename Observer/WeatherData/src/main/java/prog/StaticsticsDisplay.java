package prog;

import java.util.ArrayList;
import java.util.List;

public class StaticsticsDisplay implements Observer, DisplayElement{

    float avgTemperature;
    float avgHumidity;
    float avgPressure;
    WeatherData subject;

    List<Float> listTemperature;
    List<Float> listHumidity;
    List<Float> listPressure;

    public StaticsticsDisplay(WeatherData subject) {
        this.subject = subject;
        subject.registerObserver(this);
        listHumidity = new ArrayList<>();
        listTemperature = new ArrayList<>();
        listPressure = new ArrayList<>();
    }


    @Override
    public void display() {
        System.out.println("CurrentConditionsDisplay{" +
                "avgTemperature=" + listTemperature.stream().mapToDouble(a -> a).average().getAsDouble() +
                ", AvgHumidity=" + listHumidity.stream().mapToDouble(a -> a).average().getAsDouble() +
                ", avgPressure=" + listPressure.stream().mapToDouble(a -> a).average().getAsDouble() +
                '}');
    }

    @Override
    public void update() {
        listHumidity.add(subject.getHumidity());
        listPressure.add(subject.getPressure());
        listTemperature.add(subject.getTemperature());

        display();
    }
}
