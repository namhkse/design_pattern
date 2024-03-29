package com.example;

public class Whip extends CondimentDecorator {
  private Beverage beverage;

  public Whip(Beverage b) {
    this.beverage = b;
  }

  @Override
  public double cost() {
    return 0.10 + beverage.cost();
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Whip";
  }
}
