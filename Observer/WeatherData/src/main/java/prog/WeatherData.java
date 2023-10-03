package prog;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    float temperature;
    float humidity;
    float pressure;

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    List<Observer> observerList;

    public WeatherData() {
        observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }

    public void setAll(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}
