package com.example;

import java.io.File;
import javax.sound.sampled.*;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        try {
            // Specify the sound file path
            String soundFilePath = "./src/main/resources/squeak.wav";

            // Open the audio input stream
            AudioInputStream audioInputStream = AudioSystem
                    .getAudioInputStream(new File(soundFilePath));

            // Get the format of the audio file
            AudioFormat format = audioInputStream.getFormat();

            // Open a line to play the sound
            DataLine.Info info = new DataLine.Info(Clip.class, format);
            Clip clip = (Clip) AudioSystem.getLine(info);

            // Open the clip
            clip.open(audioInputStream);

            // Start playing the sound
            clip.start();

            // Wait for the sound to finish playing
            Thread.sleep(clip.getMicrosecondLength() / 1000);

            // Close the clip and audio input stream
            clip.stop();
            clip.close();
            audioInputStream.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
