package com.example;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

  @Override
  public Dough createDough() {
    return new ThinCrustDough();
  }

  @Override
  public Sauce createSauce() {
    return new MarinaraSauce();
  }

  @Override
  public Cheese creatCheese() {
    return new ReggianoCheese();
  }

  @Override
  public Veggies[] creatVeggies() {
    Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
    return veggies; 
  }

  @Override
  public Pepperoni creatPepperoni() {
    return null;
  }

  @Override
  public Clams createClams() {
    return new FreshClams();
  }
  
}
