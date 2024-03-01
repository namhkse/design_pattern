package com.example;

public interface Subject {
  void registerObserver(Observer o);
  void removeObsever(Observer o);
  void notifyObserver();
}
