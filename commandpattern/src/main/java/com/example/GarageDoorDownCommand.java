package com.example;

public class GarageDoorDownCommand implements Command {
  GarageDoor door;

  public GarageDoorDownCommand(GarageDoor d) {
    door = d;
  }

  @Override
  public void execute() {
    door.down();
  }

  @Override
  public void undo() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'undo'");
  }
  
}
