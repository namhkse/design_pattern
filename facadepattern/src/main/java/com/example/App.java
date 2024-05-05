package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        PopcornPopper popper = new PopcornPopper();
        TheaterLight light = new TheaterLight();
        Screen screen = new Screen();
        Projector projector = new Projector();
        Amplifier amp = new Amplifier();
        DvdPlayer dvd = new DvdPlayer();
        CdPlayer cd = new CdPlayer();
        Tuner tuner = new Tuner();
        
        HomeTheaterFacade homeTheaterFacade = 
            new HomeTheaterFacade(amp, tuner, dvd, cd, projector, light, screen, popper);
        
            homeTheaterFacade.watchMovie("Raiders of the Lost Ark");
            homeTheaterFacade.endMovie();
    }
}
