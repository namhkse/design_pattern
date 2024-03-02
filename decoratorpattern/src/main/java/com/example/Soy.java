package com.example;

public class Soy extends CondimentDecorator {
    private Beverage beverage;

  public Soy(Beverage b) {
    this.beverage = b;
  }

  @Override
  public double cost() {
    return 0.15 + beverage.cost();
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Soy";
  }
}
