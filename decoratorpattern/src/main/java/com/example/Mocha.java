package com.example;

public class Mocha extends CondimentDecorator {
  private Beverage beverage;

  public Mocha(Beverage b) {
    this.beverage = b;
  }

  @Override
  public double cost() {
    return 0.20 + beverage.cost();
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Mocha";
  }
}
