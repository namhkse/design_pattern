package com.example;

public class GarageDoorUpCommand implements Command {
  GarageDoor door;

  public GarageDoorUpCommand(GarageDoor d) {
    door = d;
  }

  @Override
  public void execute() {
    door.up();
  }

  @Override
  public void undo() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'undo'");
  }
  
}
