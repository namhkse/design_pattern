package com.example;

public class Coffee extends CaffeineBeverage {

  @Override
  public void brew() {
    System.out.println("Dripping Coffe through filter");
  }

  @Override
  public void addCondiments() {
    System.out.println("Adding Sugar and Milk");
  }

}
