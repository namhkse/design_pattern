package com.example;

public abstract class Beverage {
  protected String description;
  private boolean milk;
  private boolean soy;
  private boolean mocha;
  private boolean whip;

  public String getDescription() {
    return description;
  }

  public double cost() {
    return 0;
  }

  public void setMilk() {

  }

  public void setSoy() {

  }

  public void setMocha() {

  }

  public void setWhip() {

  }

  public boolean hasMilk() {
    return true;
  }

  public boolean hasSoy() {
    return true;
  }

  public boolean hasMochat() {
    return true;
  }

  public boolean hasWhip() {
    return true;
  }
}