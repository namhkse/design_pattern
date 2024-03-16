package com.example;

public interface PizzaIngredientFactory {

  // For each ingredient we define a create method in our interface
  public Dough createDough();
  public Sauce createSauce();
  public Cheese creatCheese();
  public Veggies[] creatVeggies();
  public Pepperoni creatPepperoni();
  public Clams createClams();
  
}
