package com.example;

public class Stereo {
  private String room;
  
  public Stereo(String room) {
    this.room = room;
  }

  public void on() {
    System.out.println(room + " stereo is on");
  }

  public void off() {
    System.out.println(room + " stereo is off");
  }

  public void setCd() {
    System.out.println(room + " stereo sets CD");
  }

  public void setDvd() {}
  public void setRadio() {}
  public void setVolume() {
    System.out.println("Stereo sets volume");
  }
}
