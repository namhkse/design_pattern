package com.example;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Duck> ducks = new LinkedList<Duck>();
        // ducks.add(new RedheadDuck());
        ducks.add(new MallardDuck());
        ducks.add(new RubberDuck());

        TestDuck(ducks);
    }

    static void TestDuck(List<Duck> ducks) {
        for (Duck duck : ducks) {
            duck.display();
            duck.performFly();
            duck.performQuack();
            duck.swim();
            System.out.println();
        }
    }
}