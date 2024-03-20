package com.example;

public class CeilingFanOffCommand implements Command {
  CeilingFan fan;

  public CeilingFanOffCommand(CeilingFan f) {
    fan = f;
  }

  @Override
  public void execute() {
    fan.off();
  }

  @Override
  public void undo() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'undo'");
  }
  
}
