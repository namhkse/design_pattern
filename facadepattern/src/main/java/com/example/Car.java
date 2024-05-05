package com.example;

public class Car {
  Engine engine;

  public Car() {
  }

  public void start(Key key) {
    Doors doors = new Doors();

    boolean authorized = key.turns();

    if (authorized) {
      engine.start();
      updateDashboardDisplay();
      doors.lock();
    }
  }

  public void updateDashboardDisplay() {
    // update display
  }
}
