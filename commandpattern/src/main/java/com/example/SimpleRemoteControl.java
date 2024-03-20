package com.example;

import java.util.ArrayList;

public class SimpleRemoteControl {
  Command[] onCommands;
  Command[] offCommands;
  Command undoCommand;

  public SimpleRemoteControl() {
    onCommands = new Command[7];
    offCommands = new Command[7];

    NoCommand noCommand = new NoCommand();
    undoCommand = noCommand;
    for (int i = 0; i < offCommands.length; i++) {
      onCommands[i] = noCommand;
      offCommands[i] = noCommand;
    }
  }

  public void setCommand(int slot, Command onCommand, Command offCommand) {
    onCommands[slot] = onCommand;
    offCommands[slot] = offCommand;
  }

  public void onButtonWasPushed(int slot) {
    undoCommand = onCommands[slot];
    onCommands[slot].execute();
  }

  public void offButtonWasPushed(int slot) {
    offCommands[slot].execute();
    undoCommand = offCommands[slot];
  }

  public void undoButtonWasPushed() {
    undoCommand.undo();
  }

  public String toString() {
    StringBuffer stringBuff = new StringBuffer();
    stringBuff.append("\n------ Remote Control -------\n");
    for (int i = 0; i < onCommands.length; i++) {
      stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
          + "       " + offCommands[i].getClass().getName() + "\n");
    }
    return stringBuff.toString();
  }
}
