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
import java.util.Random;

// https://stackoverflow.com/questions/58903060/dice-simulator-using-javafx-images-not-appearing
public class DieRoll 
{
    int rollNum;
    int sides = 6;

    public void roll()
    {
        Random rand = new Random();
        rollNum = rand.nextInt(sides) + 1;
    }

    public int getRoll()
    {
        return rollNum;
    }
}

// TO DO
// can we write a main that tests this function out?