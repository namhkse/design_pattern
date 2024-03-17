package com.example;

public class ChocolateConputer implements Runnable {

  @Override
  public void run() {
    try {
      ChocolateBoiler.getInstance().fill();
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } 
  }
  
}
