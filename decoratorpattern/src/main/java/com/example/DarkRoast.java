package com.example;

public class DarkRoast extends Beverage {

  public DarkRoast() {
    description = "Most Excellent Dark Roast";
  }

  @Override
  public double cost() {
    return super.cost();
    // Or
    // return 100;
  }
}