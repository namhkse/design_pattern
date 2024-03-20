package com.example;

public class GarageDoor {
  private String room;

  public GarageDoor(String r) {
    room = r;
  }
   
  public void up() {
    System.out.println(room + " garage door is open");
  }

  public void down() {
    System.out.println(room + " garage door is close");
  }
  public void stop() {}
  public void lightOn() {}
  public void lightOff() {}
}
