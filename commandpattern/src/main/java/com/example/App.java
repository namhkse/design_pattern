package com.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        // Devices
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living Room");
        TV tv = new TV("Living Room");
        Hottub hottub = new Hottub();
        // Commands
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        Command ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        Command ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        GarageDoorUpCommand garageDoorOpen = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        TVOnCommand tvOn = new TVOnCommand(tv);
        TVOffCommand tvOff = new TVOffCommand(tv);
        
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);
        // Macro
        Command[] partyOn = { livingRoomLightOn, stereoOnWithCD, tvOn, hottubOn };
        Command[] partyOff = { livingRoomLightOff, stereoOff, tvOff, hottubOff };
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanHigh, ceilingFanOff);
        remoteControl.setCommand(3, stereoOnWithCD, stereoOff);
        remoteControl.setCommand(4, garageDoorOpen, garageDoorDown);
        remoteControl.setCommand(5, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(5);
        remoteControl.undoButtonWasPushed();
        // remoteControl.onButtonWasPushed(2);
        // remoteControl.onButtonWasPushed(0);
        // remoteControl.offButtonWasPushed(0);
        // remoteControl.undoButtonWasPushed();
        // remoteControl.onButtonWasPushed(1);
        // remoteControl.offButtonWasPushed(1);
        // remoteControl.onButtonWasPushed(2);
        // remoteControl.offButtonWasPushed(2);
        // remoteControl.onButtonWasPushed(3);
        // remoteControl.offButtonWasPushed(3);
    }
}
