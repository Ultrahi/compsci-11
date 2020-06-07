// cd src
// javac --module-path "%PATH_TO_FX%" --add-modules javafx.controls,javafx.fxml,javafx.media ca/on/tdsb/vmso/AudioPlayerFX.java
// java --module-path "%PATH_TO_FX%" --add-modules javafx.controls,javafx.fxml,javafx.media ca.on.tdsb.vmso.AudioPlayerFX
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.on.tdsb.vmso;

/**
 *
 * @author Owner
 */
// Java program to play an Audio 
// file using Clip Object 
// https://www.geeksforgeeks.org/play-audio-file-using-java/

import java.io.File; 
import java.io.IOException; 
import java.util.Scanner; 
  
import javax.sound.sampled.AudioInputStream; 
import javax.sound.sampled.AudioSystem; 
import javax.sound.sampled.Clip; 
import javax.sound.sampled.LineUnavailableException; 
import javax.sound.sampled.UnsupportedAudioFileException; 
  
public class AudioPlayerFX  
{ 
  
    // to store current position 
    Long currentFrame; 
    Clip clip; 
      
    // current status of clip 
    String status; 
      
    AudioInputStream audioInputStream; 
    // audio resource files, relative paths differ in NetBeans vs. CLI
    static String filePath = "./src/ca/on/tdsb/vmso/res/audio/file.wav";
    
    // https://www.appsloveworld.com/download-sample-wav-file-for-testing/ file.wav
    // https://file-examples.com/index.php/sample-audio-files/sample-mp3-download/ file.mp3
    
    // constructor to initialize streams and clip 
//    public SimpleAudioPlayer() 
    public AudioPlayerFX() 
        throws UnsupportedAudioFileException, 
        IOException, LineUnavailableException  
    { 
        // create AudioInputStream object 
        audioInputStream =  
                AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile()); 
          
        // create clip reference 
        clip = AudioSystem.getClip(); 
          
        // open audioInputStream to the clip 
        clip.open(audioInputStream); 
          
        clip.loop(Clip.LOOP_CONTINUOUSLY); 
    } 
  
    public static void main(String[] args)  
    { 
        try
        { 
            // TO DO
            // fix filepath
            // relative path errors, in the release build are a common issue
            // also, think about access permissions, the build cannot access all
            filePath = "./file.wav";
//            SimpleAudioPlayer audioPlayer =  
//                            new SimpleAudioPlayer(); 
//          
            AudioPlayerFX audioPlayer =  
                            new AudioPlayerFX(); 
            
            audioPlayer.play(); 
            Scanner sc = new Scanner(System.in); 
              
            while (true) 
            { 
                System.out.println("1. pause"); 
                System.out.println("2. resume"); 
                System.out.println("3. restart"); 
                System.out.println("4. stop"); 
                System.out.println("5. Jump to specific time"); 
                int c = sc.nextInt(); 
                audioPlayer.gotoChoice(c); 
                if (c == 4) 
                break; 
            } 
            sc.close(); 
        }  
          
        catch (Exception ex)  
        { 
            System.out.println("Error with playing sound."); 
            ex.printStackTrace(); 
          
          } 
    } 
      
    // Work as the user enters his choice 
      
    private void gotoChoice(int c) 
            throws IOException, LineUnavailableException, UnsupportedAudioFileException  
    { 
        switch (c)  
        { 
            case 1: 
                pause(); 
                break; 
            case 2: 
                resumeAudio(); 
                break; 
            case 3: 
                restart(); 
                break; 
            case 4: 
                stop(); 
                break; 
            case 5: 
                System.out.println("Enter time (" + 0 +  
                ", " + clip.getMicrosecondLength() + ")"); 
                Scanner sc = new Scanner(System.in); 
                long c1 = sc.nextLong(); 
                jump(c1); 
                break; 
      
        } 
      
    } 
      
    // Method to play the audio 
    public void play()  
    { 
        //start the clip 
        clip.start(); 
          
        status = "play"; 
    } 
      
    // Method to pause the audio 
    public void pause()  
    { 
        if (status.equals("paused"))  
        { 
            System.out.println("audio is already paused"); 
            return; 
        } 
        this.currentFrame =  
        this.clip.getMicrosecondPosition(); 
        clip.stop(); 
        status = "paused"; 
    } 
      
    // Method to resume the audio 
    public void resumeAudio() throws UnsupportedAudioFileException, 
                                IOException, LineUnavailableException  
    { 
        if (status.equals("play"))  
        { 
            System.out.println("Audio is already "+ 
            "being played"); 
            return; 
        } 
        clip.close(); 
        resetAudioStream(); 
        clip.setMicrosecondPosition(currentFrame); 
        this.play(); 
    } 
      
    // Method to restart the audio 
    public void restart() throws IOException, LineUnavailableException, 
                                            UnsupportedAudioFileException  
    { 
        clip.stop(); 
        clip.close(); 
        resetAudioStream(); 
        currentFrame = 0L; 
        clip.setMicrosecondPosition(0); 
        this.play(); 
    } 
      
    // Method to stop the audio 
    public void stop() throws UnsupportedAudioFileException, 
    IOException, LineUnavailableException  
    { 
        currentFrame = 0L; 
        clip.stop(); 
        clip.close(); 
    } 
      
    // Method to jump over a specific part 
    public void jump(long c) throws UnsupportedAudioFileException, IOException, 
                                                        LineUnavailableException  
    { 
        if (c > 0 && c < clip.getMicrosecondLength())  
        { 
            clip.stop(); 
            clip.close(); 
            resetAudioStream(); 
            currentFrame = c; 
            clip.setMicrosecondPosition(c); 
            this.play(); 
        } 
    } 
      
    // Method to reset audio stream 
    public void resetAudioStream() throws UnsupportedAudioFileException, IOException, 
                                            LineUnavailableException  
    { 
        audioInputStream = AudioSystem.getAudioInputStream( 
        new File(filePath).getAbsoluteFile()); 
        clip.open(audioInputStream); 
        clip.loop(Clip.LOOP_CONTINUOUSLY); 
    } 
  
} 