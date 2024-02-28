package com.example;

public class Duck {

    protected String name;
    protected QuackBehavior quackBehavior;
    protected FlyBehavior flyBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void display() {
        System.out.println("I'm a real " + name);
    }

    public void performQuack() {
        if (quackBehavior != null)
            quackBehavior.quack();
    }

    public void performFly() {
        if (flyBehavior != null)
            flyBehavior.fly();
    }

    public void swim() {
        System.out.println(name + " is swimming 🌊");
    }

}