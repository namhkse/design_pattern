package com.example;

import java.util.Iterator;

@SuppressWarnings("rawtypes")
public class DinerMenuIterator implements MyIterator {
  MenuItem[] items;
  int position = 0;

  public DinerMenuIterator(MenuItem[] items) {
    this.items = items;
  }

  @Override
  public boolean hasNext() {
    if (position >= items.length || items[position] == null)
      return false;
    else
      return true;
  }

  @Override
  public Object next() {
    MenuItem menuItem = items[position];
    position++;
    return menuItem;
  }

  @Override
  public void remove() {
    if (position <= 0)
      throw new IllegalStateException("You can't remove an item until you have done at least one next()");
    if (items[position - 1] != null) {
      for (int i = position - 1; i < (items.length - 1); i++) {
        items[i] = items[i + 1];
      }
      items[items.length - 1] = null;
    }
  }

  @Override
  public void forEach(Action action) {
    for (int i = 0; i < items.length; i++) {
      if (items[i] != null)
        action.handle(items[i]); 
    }  
  }

}
