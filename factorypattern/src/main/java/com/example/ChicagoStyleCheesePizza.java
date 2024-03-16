package com.example;

public class ChicagoStyleCheesePizza extends Pizza {
 public ChicagoStyleCheesePizza() {
  name = "Chicago Style Deep Dish Cheese Pizza";
 } 

 @Override
 public void cut() {
   System.out.println("Cutting the pizza into square slices");
 }
}
