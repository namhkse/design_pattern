package com.example;

public abstract class Pizza {
  String name;
  Dough dough;
  Sauce sauce;
  Veggies veggies[];
  Cheese cheese;
  Pepperoni pepperoni;
  Clams clams;

  public void prepare() {
    System.out.println("Preparing " + name);
    System.out.println("Tossing dough... ");
    System.out.println("Adding sauce...");
    System.out.println("Adding toppings: ");
  }

  public void bake() {
    System.out.println("🔥 Bake for 25 minutes at 350");
  }

  public void cut() {
    System.out.println("✂️ Cutting the pizza into diagonal slices");
  }

  public void box() {
    System.out.println("📦 Place pizza in official PizzaStore box");
  }

  public String getName() {
    return name;
  }
}
