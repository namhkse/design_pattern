package com.example;

public abstract class CaffeineBeverage {

  public final void prepareRecipe() {
    boildWater();
    brew();
    pourInCup();
    addCondiments();
  };

  public abstract void brew();
  public abstract void addCondiments();  

  public void boildWater() {
    System.out.println("Boil water");
  }

  public void pourInCup() {
    System.out.println("Pour in cup");
  }  
}