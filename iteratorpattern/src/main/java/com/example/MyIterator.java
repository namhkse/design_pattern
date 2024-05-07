package com.example;

import java.util.Iterator;

/**
 * External and internal iterator
 */
public interface MyIterator extends Iterator {
  public void forEach(Action action);
}