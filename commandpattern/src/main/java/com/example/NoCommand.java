package com.example;

public class NoCommand implements Command {

  @Override
  public void execute() {
  }

  @Override
  public void undo() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'undo'");
  }
  
}
