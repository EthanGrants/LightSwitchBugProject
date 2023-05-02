/**
 * ThreeWayLight.java - 3-way light switch
 * Author:     Ethan Grant
 * Module:     4
 * Project:    Homework
 *
 * Instance variables:
 * 1. an int named firstSwitch which represents a switch
 * 2. an int named SecondSwitch which represents a switch 
 */

    public class ThreeWayLight
    {
       // Instance variables
       private int firstSwitch = 0,
                   secondSwitch = 0;
                   
        // Constructor
       public ThreeWayLight(int initialFirstSwitch,
                            int initialSecondSwitch) {
           firstSwitch = initialFirstSwitch;
           secondSwitch = initialSecondSwitch;
       }
        
       // Getters
       public int getFirstSwitch() {
         return firstSwitch;  
       }// 0 = down, 1 = up
       public int getSecondSwitch() {
         return secondSwitch;
       }// 0 = down, 1 = up
       public int getLight() {
           return(firstSwitch + secondSwitch) % 2;
       }// 0 = off,  1 = on
       public void toggleFirstSwitch() {
           firstSwitch = (firstSwitch + 1) % 2;
       }
       public void toggleSecondSwitch()  {
           secondSwitch = (secondSwitch + 1) % 2;
       }
       public String toString() {
           return "First Switch:  " + (firstSwitch == 1 ? "up" : "down") +
                  "\nSecond Switch: " + (secondSwitch == 1 ? "up" : "down") +
                  "\nLight:         " + (getLight() == 1 ? "on\n\n" : "off\n\n");
       }
    }


