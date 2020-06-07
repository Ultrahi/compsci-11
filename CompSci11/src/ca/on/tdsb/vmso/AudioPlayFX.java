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

import java.net.URL;
import javafx.application.Application;
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;


public class AudioPlayFX extends Application {
//public class Main extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
      
    // https://www.appsloveworld.com/download-sample-wav-file-for-testing/ file.wav
    // https://file-examples.com/index.php/sample-audio-files/sample-mp3-download/ file.mp3
    final URL resource = getClass().getResource("/ca/on/tdsb/vmso/res/audio/file.mp3");
    
    AudioClip select = new AudioClip(resource.toString());
    select.play();
        
    
    System.out.println(resource.toString());
    final Media media = new Media(resource.toString());
    final MediaPlayer mediaPlayer = new MediaPlayer(media);
    mediaPlayer.play();

    primaryStage.setTitle("AudioPlayFX");
    primaryStage.setWidth(400);
    primaryStage.setHeight(400);
    primaryStage.show();
  }
}