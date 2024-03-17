package com.example;

public class Singleton {
  private static Singleton uniqueInstance;

  private Singleton() {
  }

  private static Singleton getInstance() {
    if (uniqueInstance == null)
      uniqueInstance = new Singleton();
    return uniqueInstance;
  }
}
