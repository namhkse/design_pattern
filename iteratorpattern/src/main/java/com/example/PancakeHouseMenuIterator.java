package com.example;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements MyIterator {
  ArrayList items;
  int position = 0;

  public PancakeHouseMenuIterator(ArrayList items) {
    this.items = items;
  }

  @Override
  public boolean hasNext() {
    if (position >= items.size())
      return false;
    else
      return true;
  }

  @Override
  public Object next() {
    Object item = items.get(position);
    position++;
    return item;
  }

  @Override
  public void forEach(Action action) {
    for (int i = 0; i < items.size(); i++) {
      action.handle(items.get(i)); 
    }     
  }
}
