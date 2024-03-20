package com.example;

public class CeilingFanMediumCommand implements Command {
  CeilingFan fan;
  int prevSpeed;

  public CeilingFanMediumCommand(CeilingFan f) {
    fan = f;
  }

  @Override
  public void execute() {
    prevSpeed = fan.getSpeed();
    fan.medium();
  }

  @Override
  public void undo() {
    if (prevSpeed == CeilingFan.HIGH)
      fan.hight();
    if (prevSpeed == CeilingFan.MEDIUM)
      fan.medium();
    if (prevSpeed == CeilingFan.LOW)
      fan.low();
    if (prevSpeed == CeilingFan.OFF)
      fan.off();
  }
}
