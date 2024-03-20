package com.example;

public class GarageDoorOpenCommand implements Command {
  GarageDoor door;

  public GarageDoorOpenCommand(GarageDoor door) {
    this.door = door;
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
