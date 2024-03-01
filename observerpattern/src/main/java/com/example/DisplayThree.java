package com.example;

/**
 * Forecast
 * 🌤️, ⛈️, 🌧️
 */
public class DisplayThree implements Display, Observer {

  private float temperature;
  private float humidity;
  private float pressure;
  private Subject subject;

  public DisplayThree(Subject weatherData) {
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
    System.out.println("Forecast");
    System.out.println("🌡️: " + temperature + " 💧: " + humidity + " 🕑: " + pressure);
  }

}
