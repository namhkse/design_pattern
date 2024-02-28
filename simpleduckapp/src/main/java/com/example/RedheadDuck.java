package com.example;

public class RedheadDuck extends Duck implements Flyable, Quackable{

    public RedheadDuck() {
        super();
        name = "Redhead Duck";
    }

    @Override
    public void display() {
        System.out.println("looks like a redhead");
    }

    @Override
    public void performQuack() {
        System.out.println(name + " says quack");
    }

    @Override
    public void performFly() {
        System.out.println(name + " is flying");
    }

}
