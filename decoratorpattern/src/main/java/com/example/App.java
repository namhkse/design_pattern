package com.example;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Test();
        System.out.println();
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + ": " + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + ": " + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + ": " + beverage3.cost());
    }

    static void Test() {
        int c;
        try {
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream("test.txt")));

            while ((c = in.read()) >= 0)
                System.out.print((char) c);

            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
