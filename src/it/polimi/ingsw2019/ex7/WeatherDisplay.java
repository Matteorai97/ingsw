package it.polimi.ingsw2019.ex7;

public class WeatherDisplay implements Observer {

    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println(temp + ", "+ humidity+", "+pressure);
    }
}
