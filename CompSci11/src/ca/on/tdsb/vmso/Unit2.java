// cd src
// javac --module-path "%PATH_TO_FX%" --add-modules javafx.controls ca/on/tdsb/vmso/Unit2.java
// java --module-path "%PATH_TO_FX%" --add-modules javafx.controls ca.on.tdsb.vmso.Unit2
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
public class Unit2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        ////////////////////////////////////////////////////////////////////////
        // adapted from Ontario Education Resource Bank (OERB)
        // e-Learning Ontario
        // for Computer Technology, 12 and Computer Science, 11
        ////////////////////////////////////////////////////////////////////////
        
        ////////////////////////////////////////////////////////////////////////
        // 2.1 An Introduction to NetBeans
        ////////////////////////////////////////////////////////////////////////
        System.out.println("hello world");
        System.out.println("Hello " + "how are you today");
        System.out.println("Your age is " + 21);
        
        // control codes
        /*
        \n new line
        \r return character
        \t tab
        \b backspace
        \" double quote
        \' single quote
        \\ backslash
        */
        System.out.println("control codes \n \r \t tab \b backspace\b\b\b \" \' \\");
        System.out.println("Go \" LEAFS \" Go");
        System.out.println("Go \n LEAFS \n Go");
        
//        int age;
        int age, studNum, intNum, mark;
        age = 21;
        
        String name, name1, name2;
        name1 = "Toronto ";
        name2 = "Maple Leafs";
        name = name1 + name2;
        System.out.println(name);    // Toronto Maple Leafs
        
        
        // displays interest calculation
        int principal, time;
        double rate, interest;

        principal = 500;
        rate = .09;
        time = 2;

        interest = principal * rate * time;

        System.out.println("the interest earned is " + interest);
        
        ////////////////////////////////////////////////////////////////////////
        // 2.2 Capturing and Displaying String Data
        ////////////////////////////////////////////////////////////////////////
        
        // Swing is deprecated, replaced by Java FX
        
        // Old version:
        // Create a GUIFormExamples project
        /*     
        GUI Form Example Descriptions

        This project contains three visual forms that were designed with the IDE's GUI Builder. 

        To open an example form in the GUI Builder:
        1.In the IDE's Projects window, navigate to the default package node within the 
        Source Packages directory.

        2.Double-click the node of the sample form you want to view. 
        The IDE launches the GUI Builder and displays the chosen form. 



        Contact Editor

        This complex form is similar to Windows dialogs typically used to display and edit database information. The example illustrates the full range of GUI Builder features, including alignment, anchoring, sizing, indentation, and runtime auto-resizing behavior. To view a detailed tutorial including flash demonstrations showing how to build this form, see Designing a Swing GUI in NetBeans IDE.


        Antenna Preferences

        This example illustrates a type of table-based form commonly used to display related information in visually coherent groups. The GUI Builder's advanced alignment features enable you to group and size non-adjacent components (such as labels, textfields, and buttons) consistently without the need to merge cells manually. 


        Find

        This simple form illustrates a straight-forward layout often used in various applications requiring basic search functionality. The GUI Builder's alignment and sizing features enable you to quickly construct such forms while ensuring that they localize predictably. 
        */
        
        // create a die, roll it 4 times
        DieRoll die = new DieRoll();
        die.roll();
        System.out.println(die.getRoll());
        die.roll();
        System.out.println(die.getRoll());
        die.roll();
        System.out.println(die.getRoll());
        die.roll();
        System.out.println(die.getRoll());
        
        
        
        
    }
    
}
