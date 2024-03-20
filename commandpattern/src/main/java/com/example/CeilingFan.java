package com.example;

public class CeilingFan {
  private String room;
  int speed;

  public static final int HIGH = 3;
  public static final int MEDIUM = 2;
  public static final int LOW = 1;
  public static final int OFF = 0;

  public CeilingFan(String room) {
    this.room = room;
    speed = OFF;
  }

  public void hight() {
    speed = HIGH;
    System.out.println(room + " ceiling fan is " + HIGH);
  }

  public void medium() {
    speed = MEDIUM;
    System.out.println(room + " ceiling fan is " + MEDIUM);
  }

  public void low() {
    speed = LOW;
    System.out.println(room + " ceiling fan is " + LOW);
  }

  public void off() {
    speed = OFF;
    System.out.println(room + " ceiling fan is off");
  }

  public int getSpeed() {
    return speed;
  }
}
