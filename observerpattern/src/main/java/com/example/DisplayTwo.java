package com.example;

/**
 * Weather Stats
 * Avg Temp: 72
 * Min Temp: 50
 * Max Temp: 0.2
 */
public class DisplayTwo implements Display, Observer {
  private float temperature;
  private float humidity;
  private float pressure;
  private Subject subject;

  public DisplayTwo(Subject weatherData) {
    this.subject = weatherData;
    weatherData.registerObserver(this);
  }
  
  @Override
  public void update(float temp, float humidity, float pressure) {
    this.temperature = temp;
    this.humidity = humidity;
    this.pressure = pressure;
    display();
  }

  @Override
  public void display() {
    System.out.println("Weather Stats");
    float min = temperature - 1;
    float max = temperature + 1;
    float avg = temperature;
    System.out.println("Avg/Min/Max Temperature: " + avg +"/" + min + "/" + max);
  }
  
}
