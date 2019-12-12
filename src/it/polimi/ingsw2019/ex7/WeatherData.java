package it.polimi.ingsw2019.ex7;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Observable {

    List<Observer> observers = new ArrayList<>();
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregisterObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers)
            o.update(temperature, humidity, pressure);
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.humidity = humidity;
        this.pressure = pressure;
        this.temperature = temperature;
        notifyObservers();
    }
}
