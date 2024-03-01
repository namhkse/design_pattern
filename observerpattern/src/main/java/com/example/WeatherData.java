package com.example;

import java.util.ArrayList;

public class WeatherData implements Subject {

  private float temperature;
  private float humidity;
  private float pressure;
  private ArrayList<Observer> observers;

  public WeatherData() {
    observers = new ArrayList<>();
  }

  public void setMeasurements(float temp, float humidity, float pressure) {
    this.temperature = temp;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
  }

  public void measurementsChanged() {
    notifyObserver();
  }

  public float getTemperature() {
    return temperature;
  }

  public float getHumidity() {
    return humidity;
  }

  public float getPressure() {
    return pressure;
  }

  @Override
  public void registerObserver(Observer o) {
    observers.add(o);
  }

  @Override
  public void removeObsever(Observer o) {
    int i = observers.indexOf(o);
    if (i >= 0)
      observers.remove(i);
  }

  @Override
  public void notifyObserver() {
    for(int i = 0; i < observers.size(); i++) {
      Observer observer = (Observer) observers.get(i);
      observer.update(temperature, humidity, pressure);
    }
  }

}
