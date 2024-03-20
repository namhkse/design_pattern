package com.example;

public class Light {
  private String room;

  public Light(String room) {
    this.room = room;
  }

  public void off() {
    System.out.println(room + "light is off");
  }
  
  public void on() {
    System.out.println(room + "light is On");
  } 
}
