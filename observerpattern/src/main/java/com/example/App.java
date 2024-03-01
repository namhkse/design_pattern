package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        WeatherData weatherData = new WeatherData();
        DisplayOne displayOne = new DisplayOne(weatherData);
        DisplayTwo displayTwo = new DisplayTwo(weatherData);
        DisplayThree displayThree = new DisplayThree(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
