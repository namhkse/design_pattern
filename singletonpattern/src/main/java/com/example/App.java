package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Thread t1 = new Thread(new ChocolateConputer());
        Thread t2 = new Thread(new ChocolateConputer());

        t1.start();
        t2.start();
    }
}
