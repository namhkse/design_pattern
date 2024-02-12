package com.example;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // List<Duck> ducks = new LinkedList<Duck>();
        // ducks.add(new RedheadDuck());
        // ducks.add(new MallardDuck());
        // ducks.add(new RubberDuck());

        // TestDuck(ducks);
    }

    static void TestDuck(List<Duck> ducks) {
        for (Duck duck : ducks) {
            duck.display();
            if (duck instanceof Quackable)
                ((Quackable) duck).quack();
            if (duck instanceof Flyable)
                ((Flyable) duck).fly();
            System.out.println();
        }
    }
}