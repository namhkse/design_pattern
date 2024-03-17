package com.example;

public class ChocolateBoiler {
  private boolean empty;
  private boolean boiler;

  private volatile static ChocolateBoiler uniqueInstance;

  public static ChocolateBoiler getInstance() {
    if (uniqueInstance == null) {
      synchronized (Singleton.class) {
        if (uniqueInstance == null) {
          try {
            Thread.sleep(100);
          } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          }
          uniqueInstance = new ChocolateBoiler();
        }
      }
    }
    return uniqueInstance;
  }

  public boolean isBoiler() {
    return boiler;
  }

  public boolean isEmpty() {
    return empty;
  }

  private ChocolateBoiler() {
      empty = true;
      boiler = false;
  }

  public void drain() {
    if (!isEmpty() && isBoiler()) {
      // drain
      empty = true;
    }
  }

  public void boild() {
    if (!isEmpty() && !isBoiler()) {
      boiler = true;
    }
  }

  public void fill() throws InterruptedException {
    if (isEmpty()) {
      // Thread.sleep(100);
      empty = false;
      boiler = false;
      System.out.println("Fill chocolate");
    }
  }
}
