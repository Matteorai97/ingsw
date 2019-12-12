package it.polimi.ingsw2019.ex7;

public class WeatherStation {

    public WeatherStation(){

        WeatherData data = new WeatherData();
        WeatherDisplay display = new WeatherDisplay();
        WeatherDisplay display1 = new WeatherDisplay();

        data.registerObserver(display);
        data.registerObserver(display1);


        data.setMeasurements(10, 65, 4.5f);
        data.setMeasurements(20, 75, 5.5f);
        data.setMeasurements(30, 85, 6.5f);

    }


    public static void main(String[] args){
        WeatherStation a = new WeatherStation();
    }
}
