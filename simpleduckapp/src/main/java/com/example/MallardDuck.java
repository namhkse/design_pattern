package com.example;

public class MallardDuck extends Duck implements Flyable, Quackable{

    public MallardDuck() {
        name = "Mallard Duck";
    }

    @Override
    public void display() {
        System.out.println("looks like a mallard");
    }

    @Override
    public void quack() {
        System.out.println(name + "says quack");
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying");
    }
    
}
