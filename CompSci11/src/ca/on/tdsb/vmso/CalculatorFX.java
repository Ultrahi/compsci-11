// TO DO 
// add this calculator, https://zatackcoder.com/creating-calculator-javafx/,
// to this project

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.on.tdsb.vmso;
// package calculatorfx;
// http://www.discoversdk.com/blog/javafx-calculator-with-java-code
// https://github.com/sbmaggarwal/CalculatorFX
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author shubham
 */
public class CalculatorFX extends Application {
    
    TextField tfNum1;
    TextField tfNum2;
    Button btnDivide;
    Button btnMultiply;
    Button btnAddition;
    Button btnSubtraction;
    Button btnClear;
    Label lblAnswer;
    
    @Override
    public void start(Stage primaryStage) {
        
        // TO DO
        // conver GUI to fxml
        // https://docs.oracle.com/javafx/2/get_started/fxml_tutorial.htm
        tfNum1 = new TextField();
        tfNum2 = new TextField();
        btnDivide = new Button("/");
        btnMultiply = new Button("*");
        btnAddition = new Button("+");
        btnSubtraction = new Button("-");
        btnClear = new Button("Clear");
        lblAnswer = new Label("?");
        
        lblAnswer.setAlignment(Pos.CENTER);
        lblAnswer.setStyle("-fx-border-color: #000; -fx-padding: 5px;");
        
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        
        root.setHgap(10);
        root.setVgap(10);
        
        root.add(btnDivide, 0, 0);
        root.add(btnMultiply, 1, 0);
        root.add(btnAddition, 0, 1);
        root.add(btnSubtraction, 1, 1);
        root.add(btnClear, 0, 4, 2, 1);
        
        root.add(tfNum1, 0, 2);
        root.add(tfNum2, 1, 2);
        root.add(lblAnswer, 0, 3, 2, 1);
        
        tfNum1.setPrefWidth(70);
        tfNum2.setPrefWidth(70);
        btnDivide.setPrefWidth(70);
        btnMultiply.setPrefWidth(70);
        btnAddition.setPrefWidth(70);
        btnSubtraction.setPrefWidth(70);
        btnClear.setPrefWidth(150);
        lblAnswer.setPrefWidth(150);
        
        //have each button run BTNCODE when clicked
        btnAddition.setOnAction(e -> btncode(e));
        btnSubtraction.setOnAction(e -> btncode(e));
        btnMultiply.setOnAction(e -> btncode(e));
        btnDivide.setOnAction(e -> btncode(e));
        btnClear.setOnAction(e -> btncode(e));
        
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("CalculatorFX 1.0 - Integers");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void btncode(ActionEvent e) {
        
        int num1, num2, answer;
        char symbol;
        
        // e tells us which button was clicked
        if (e.getSource() == btnClear) {
            tfNum1.setText("");
            tfNum2.setText("");
            lblAnswer.setText("?");
            tfNum1.requestFocus();
            return;
        }
        
        // TO DO
        // input validation, another common task
        // usually the validation is on the input side,
        // before data processing is reached
        
        // read numbers in from textfields
        // can you fix this? 
        // what if a non-integer is entered?
        num1 = Integer.parseInt(tfNum1.getText());
        num2 = Integer.parseInt(tfNum2.getText());
        if (e.getSource() == btnAddition) {
            symbol = '+';
            answer = num1 + num2;
        } else if (e.getSource() == btnSubtraction) {
            symbol = '-';
            answer = num1 - num2;
        } else if (e.getSource() == btnMultiply) {
            symbol = 'x';
            answer = num1 * num2;
        } else {
            symbol = '/';
            answer = num1 / num2;
        }
        
        //display answer
        lblAnswer.setText("" + num1 + symbol + num2 + "=" + answer);
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}