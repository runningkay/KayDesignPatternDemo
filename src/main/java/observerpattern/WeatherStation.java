package observerpattern;
public class WeatherStation {
    public  static void main(String args[]){
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData );

        weatherData.setMeasuremnts(80,65,30.4f);
        weatherData.setMeasuremnts(82,70,29.2f);
    }
}
