package com.example;

public class DecoyDuck extends Duck {

    @Override
    public void display() {
        System.out.println("looks like a decoy");
    }

    @Override
    public void performQuack() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'quack'");
    }

    @Override
    public void performFly() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fly'");
    }
    
}
