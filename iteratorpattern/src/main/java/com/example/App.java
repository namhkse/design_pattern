package com.example;

import java.util.*;

/**
 * Waitress code
 *
 */
public class App {
    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;

    public App() {
        pancakeHouseMenu = new PancakeHouseMenu();
        dinerMenu = new DinerMenu();
    }

    public static void main(String[] args) {
        App app = new App();
        app.printMenu();
    }

    /**
     * prints every item on the menu
     */
    void printMenu() {
        MyIterator pancakeIterator = pancakeHouseMenu.createIterator();
        MyIterator dinnerIterator = dinerMenu.createIterator();
        System.out.println("MENU\n----\nBREAKFAST");
        // printMenu(pancakeIterator);
        pancakeIterator.forEach((e) -> printMenuItem(e));
        System.out.println("\nLUNCH");
        // Print menu use internal iterator with lamda
        dinnerIterator.forEach((e) -> printMenuItem(e));
        // Or use external with next()
        // printMenu(dinnerIterator);
    }

    void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            printMenuItem(menuItem);
        }
    }

    static void printMenuItem(MenuItem menuItem) {
        System.out.print(menuItem.getName() + " ");
        System.out.println(menuItem.getPrice() + " ");
        System.out.println("   -" + menuItem.getDescription());
    }

    static void printMenuItem(Object o) {
        MenuItem menuItem = (MenuItem) o;
        System.out.print(menuItem.getName() + " ");
        System.out.println(menuItem.getPrice() + " ");
        System.out.println("   -" + menuItem.getDescription());
    }

    /**
     * prints just breakfast items
     */
    void printBreakfastMenu() {
    }

    /**
     * pritns just lunch items
     */
    void printLuchMenu() {
    }

    /**
     * prints all vegetarian menu items
     */
    void printVegetarianMenu() {
    }

    /**
     * given the name of an item, returns true if the items is vvegetarian,
     * otherwise, return false
     * 
     * @param name
     */
    void isItemVegetarian(String name) {
    }
}
