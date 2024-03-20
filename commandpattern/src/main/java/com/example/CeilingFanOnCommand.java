package com.example;

public class CeilingFanOnCommand implements Command {

  CeilingFan fan;

  public CeilingFanOnCommand(CeilingFan f) {
    fan = f;
  }

  @Override
  public void execute() {
    fan.hight();
  }

  @Override
  public void undo() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'undo'");
  }
  
}
