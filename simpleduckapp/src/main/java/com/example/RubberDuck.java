package com.example;

public class RubberDuck extends Duck implements Quackable {

    public RubberDuck() {
        super();
        name = "Rubber Duck";
    }

    @Override
    public void display() {
        System.out.println("look like a " + name);
    }

    @Override
    public void quack() {
        System.out.println(name + " says chip chip");
    }

}
