// TO DO
// please remove dead code, commented
// using Git, viewing project history is possible
// file history is not needed here

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
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import java.util.Random;

// // https://stackoverflow.com/questions/58903060/dice-simulator-using-javafx-images-not-appearing
public class DiceSimulatorFX extends Application
{
     private ImageView viewDie1 = new ImageView();
     private ImageView viewDie2 = new ImageView();
     private Label resultDie;
     private Label message1;
     private Label message2;

     public static void main(String[] args)
       {
          // Launch the application.
          launch(args);
       }

       @Override
       public void start(Stage primaryStage)
       {
           primaryStage.setTitle("DiceSimulatorFX");
           Label message1 = new Label("Welcome to the DiceSimulatorFX!");
           Label message2 = new Label("Please hit start to roll the dice!");

           resultDie = new Label();
           Button startButton = new Button("Start!");

           startButton.setOnAction(new StartButtonHandler()); 

           /*
               DieImageFX image1 = new DieImageFX();
               DieImageFX image2 = new DieImageFX();
               image1.setImage(1);
               image2.setImage(2);
               Image diePic1 = image1.getImage();
               Image diePic2 = image2.getImage();

               viewDie1 = new ImageView(diePic1);
               viewDie2 = new ImageView(diePic2);
           */
           
           HBox hbox = new HBox(10, viewDie1, viewDie2);

           VBox vbox = new VBox(10, message1, message2, startButton, hbox, resultDie);
           vbox.setPadding(new Insets(15));
           vbox.setAlignment(Pos.CENTER);
           vbox.setStyle("-fx-background-color: WHITE;"); 

           Scene simulatorScene = new Scene(vbox, 300, 250);
           primaryStage.setScene(simulatorScene);
           primaryStage.show();


       }
       
       

       class StartButtonHandler implements EventHandler<ActionEvent>
       {
           @Override
           public void handle(ActionEvent event)
           {
               int num1 = 0;
               int num2 = 0;
               Image diePic1; 
               Image diePic2;

               DieRoll die1 = new DieRoll();
               DieRoll die2= new DieRoll();
               die1.roll();
               die2.roll();
               num1 = die1.getRoll();
               num2 = die2.getRoll();

               DieImageFX image1 = new DieImageFX();
               DieImageFX image2 = new DieImageFX();
               image1.setImage(num1);
               image2.setImage(num2);
               diePic1 = image1.getImage();
               diePic2 = image2.getImage();

               
//               viewDie1 = new ImageView(diePic1);
//               viewDie2 = new ImageView(diePic2);
               
               resultDie.setText("You rolled a " + num1 + " and " + num2 + "!");
               viewDie1.setImage(diePic1);
               viewDie2.setImage(diePic2);
               
            }
        }
       
        /*
        public class DicePanel extends JPanel {
        private final Dice dice;

        private JButton rollButton;
        private JLabel displayLabel;

        public DicePanel(Dice dice) {
          this.dice = dice;

          rollButton = new JButton("Roll");
          displayLabel = new JLabel();

          rollButton.addActionListener(e ->
            displayLabel.setText("You rolled a: " + dice.roll())
          );
          // or if you're not using Java 8, you can do the more verbose thing.

          // not specifying a layout defaults to a flow layout.  Set a layout via:
          // setLayout(new BorderLayout()); // or whatever
          add(rollButton);
          add(displayLabel);
        }
      }*/


}
