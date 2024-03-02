package com.example;

public class Milk extends CondimentDecorator {
  private Beverage beverage;

  public Milk(Beverage b) {
    this.beverage = b;
  }

  @Override
  public double cost() {
    return 0.10 + beverage.cost();
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Milk";
  }
}
