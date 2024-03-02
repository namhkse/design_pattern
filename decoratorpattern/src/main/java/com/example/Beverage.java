package com.example;

import java.util.Hashtable;

public abstract class Beverage {
  protected String description;
  
  public abstract double cost();
  
  public String getDescription() {
    return description;
  }
}