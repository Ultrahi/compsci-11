// cd src
// javac --module-path "%PATH_TO_FX%" --add-modules javafx.controls ca/on/tdsb/vmso/Unit2FX.java
// java --module-path "%PATH_TO_FX%" --add-modules javafx.controls ca.on.tdsb.vmso.Unit2FX
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
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Unit2FX extends Application {

    @Override
    public void start(Stage stage) {
        
        // https://www.tutorialspoint.com/javafx/javafx_quick_guide.htm
        // ex 1 from tutorials point
        /*
        //creating a Group object 
        Group group = new Group(); 

        //Creating a Scene by passing the group object, height and width   
        Scene scene = new Scene(group ,600, 300); 

        //setting color to the scene 
        scene.setFill(Color.BROWN);  

        //Setting the title to Stage. 
        stage.setTitle("Sample Application"); 

        //Adding the scene to Stage 
        stage.setScene(scene); 

        //Displaying the contents of the stage 
        stage.show(); 
        */
        
        /*
        // ex 2 from tutorials point
        //Creating a line object 
        Line line = new Line(); 

        //Setting the properties to a line 
        line.setStartX(100.0); 
        line.setStartY(150.0); 
        line.setEndX(500.0); 
        line.setEndY(150.0);   

        //creating a Group object 
        Group group = new Group(line); 

        //Creating a Scene by passing the group object, height and width   
        Scene scene = new Scene(group ,600, 300); 

        //setting color to the scene 
        scene.setFill(Color.BROWN);  

        //Setting the title to Stage. 
        stage.setTitle("Sample Application"); 

        //Adding the scene to Stage 
        stage.setScene(scene); 

        //Displaying the contents of the stage 
        stage.show(); 
        */
      
        /*
        // ex 3 from tutorials point
        */
        /*
        //Creating a Text object 
        Text text = new Text(); 

        //Setting font to the text 
        text.setFont(new Font(45)); 

        //setting the position of the text 
        text.setX(50); 
        text.setY(150);          

        //Setting the text to be added. 
        text.setText("Welcome to Tutorialspoint"); 

        //Creating a Group object  
        Group root = new Group(); 

        //Retrieving the observable list object 
        ObservableList list = root.getChildren(); 

        //Setting the text object as a node to the group object 
        list.add(text);       

        //Creating a scene object 
        Scene scene = new Scene(root, 600, 300); 

        //Setting title to the Stage 
        stage.setTitle("Sample Application"); 

        //Adding scene to the stage 
        stage.setScene(scene); 

        //Displaying the contents of the stage 
        stage.show(); 
        */
        
        
        // ex from tutorials point
        // draw a star
        /*
        //Creating a Path 
        Path path = new Path(); 

        //Moving to the starting point 
        MoveTo moveTo = new MoveTo(108, 71); 

        //Creating 1st line 
        LineTo line1 = new LineTo(321, 161);  

        //Creating 2nd line 
        LineTo line2 = new LineTo(126,232);       

        //Creating 3rd line 
        LineTo line3 = new LineTo(232,52);  

        //Creating 4th line 
        LineTo line4 = new LineTo(269, 250);   

        //Creating 4th line 
        LineTo line5 = new LineTo(108, 71);  

        //Adding all the elements to the path 
        path.getElements().add(moveTo); 
        path.getElements().addAll(line1, line2, line3, line4, line5);        

        //Creating a Group object  
        Group root = new Group(path); 

        //Creating a scene object 
        Scene scene = new Scene(root, 600, 300);  

        //Setting title to the Stage 
        stage.setTitle("Drawing an arc through a path");

        //Adding scene to the stage 
        stage.setScene(scene);

        //Displaying the contents of the stage 
        stage.show(); 
        */
        
        // ex from tutorials point
        /*
        //Drawing a Box 
        Box box = new Box(); 

        //Setting the properties of the Box 
        box.setWidth(150.0); 
        box.setHeight(150.0);   
        box.setDepth(100.0); 

        //Setting the position of the box 
        box.setTranslateX(350);  
        box.setTranslateY(150); 
        box.setTranslateZ(50); 

        //Setting the text 
        Text text = new Text("Type in the TextField to rotate the box, and click on the box to stop the rotation"); 

        //Setting the font of the text 
        text.setFont(Font.font(null, FontWeight.BOLD, 15));     

        //Setting the color of the text 
        text.setFill(Color.CRIMSON); 

        //setting the position of the text 
        text.setX(20); 
        text.setY(50); 

        //Setting the material of the box 
        PhongMaterial material = new PhongMaterial();  
        material.setDiffuseColor(Color.DARKSLATEBLUE);  

        //Setting the diffuse color material to box 
        box.setMaterial(material);       

        //Setting the rotation animation to the box    
        RotateTransition rotateTransition = new RotateTransition(); 

        //Setting the duration for the transition 
        rotateTransition.setDuration(Duration.millis(1000)); 

        //Setting the node for the transition 
        rotateTransition.setNode(box);       

        //Setting the axis of the rotation 
        rotateTransition.setAxis(Rotate.Y_AXIS); 

        //Setting the angle of the rotation
        rotateTransition.setByAngle(360); 

        //Setting the cycle count for the transition 
        rotateTransition.setCycleCount(50); 

        //Setting auto reverse value to false 
        rotateTransition.setAutoReverse(false);  

        //Creating a text filed 
        TextField textField = new TextField();   

        //Setting the position of the text field 
        textField.setLayoutX(50); 
        textField.setLayoutY(100); 

        //Handling the key typed event 
        EventHandler<KeyEvent> eventHandlerTextField = new EventHandler<KeyEvent>() { 
           @Override 
           public void handle(KeyEvent event) { 
              //Playing the animation 
              rotateTransition.play(); 
           }           
        };              
        //Adding an event handler to the text feld 
        textField.addEventHandler(KeyEvent.KEY_TYPED, eventHandlerTextField); 

        //Handling the mouse clicked event(on box) 
        EventHandler<javafx.scene.input.MouseEvent> eventHandlerBox = 
           new EventHandler<javafx.scene.input.MouseEvent>() { 

           @Override 
           public void handle(javafx.scene.input.MouseEvent e) { 
              rotateTransition.stop();  
           } 
        }; 
        //Adding the event handler to the box  
        box.addEventHandler(javafx.scene.input.MouseEvent.MOUSE_CLICKED, eventHandlerBox);

        //Creating a Group object
        Group root = new Group(box, textField, text); 

        //Creating a scene object 
        Scene scene = new Scene(root, 600, 300);      

        //Setting camera 
        PerspectiveCamera camera = new PerspectiveCamera(false); 
        camera.setTranslateX(0); 
        camera.setTranslateY(0); 
        camera.setTranslateZ(0); 
        scene.setCamera(camera);  

        //Setting title to the Stage 
        stage.setTitle("Event Handlers Example"); 

        //Adding scene to the stage 
        stage.setScene(scene); 

        //Displaying the contents of the stage 
        stage.show(); 
        */
        
        
        // JavaFX HelloWorld demo on GitHub
        /*      
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        Label l = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        Scene scene = new Scene(new StackPane(l), 640, 480);
        stage.setScene(scene);
        stage.show();
        */
        
        // ex from tutorials point
        //creating label email 
        Text text1 = new Text("Email");       

        //creating label password 
        Text text2 = new Text("Password"); 

        //Creating Text Filed for email        
        TextField textField1 = new TextField();       

        //Creating Text Filed for password        
        PasswordField textField2 = new PasswordField();  

        //Creating Buttons 
        Button button1 = new Button("Submit"); 
        Button button2 = new Button("Clear");  

        //Creating a Grid Pane 
        GridPane gridPane = new GridPane();    

        //Setting size for the pane 
        gridPane.setMinSize(400, 200); 

        //Setting the padding  
        gridPane.setPadding(new Insets(10, 10, 10, 10)); 

        //Setting the vertical and horizontal gaps between the columns 
        gridPane.setVgap(5); 
        gridPane.setHgap(5);       

        //Setting the Grid alignment 
        gridPane.setAlignment(Pos.CENTER); 

        //Arranging all the nodes in the grid 
        gridPane.add(text1, 0, 0); 
        gridPane.add(textField1, 1, 0); 
        gridPane.add(text2, 0, 1);       
        gridPane.add(textField2, 1, 1); 
        gridPane.add(button1, 0, 2); 
        gridPane.add(button2, 1, 2); 

        //Styling nodes  
        button1.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;"); 
        button2.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;"); 

        text1.setStyle("-fx-font: normal bold 20px 'serif' "); 
        text2.setStyle("-fx-font: normal bold 20px 'serif' ");  
        gridPane.setStyle("-fx-background-color: BEIGE;"); 

        //Creating a scene object 
        Scene scene = new Scene(gridPane); 

        //Setting title to the Stage 
        stage.setTitle("CSS Example"); 

        //Adding scene to the stage 
        stage.setScene(scene);

        //Displaying the contents of the stage 
        stage.show(); 
        
//        Unit2 unit2 = new Unit2();
//        unit2.main(null);
    }

    public static void main(String[] args) {
        
        
        Unit2 unit2 = new Unit2();
        unit2.main(null); // console
        
        launch();         // JavaFX GUI
        
        // TO DO:
        // Units 3 and 4 code here
    }

}