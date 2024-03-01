package com.example;
/**
 * Current Conditions
 * Temp: 72
 * Humidity: 50
 * Pressure: 0.2
 */
public class DisplayOne implements Display, Observer {
  private float temperature;
  private float humidity;
  private float pressure;
  private Subject subject;

  public DisplayOne(Subject weatherData) {
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
    System.out.println("Current Conditions: ");
    System.out.println("Temp/Humidity/Pressure = " + temperature +"/" + humidity + "/" + pressure);
  }

}