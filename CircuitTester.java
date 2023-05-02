
/**
 * CircuitTester.java - 3-way light switch
 * Author:     Ethan Grant
 * Module:     4
 * Project:    Hw
 * Problem Statement: Create a Java class which describes a 3-way light switch. 
 * Each object of this class will have two switches (up or down), then calculate 
 * the state of the light they control (on or off).
 * 
 * Algorithm / Overall Plan:
 * 1 Create classes
 * 2. Create instance variables in ThreeWayLight for the two switches in the hallway
 * 3. Create a constructor
 * 4. Create get methods
 * 5. Create toggle methods
 * 6. Create a toString
 * 7. Use (1 + 1) % 2 = 0 as the algorthim for the toggle methods, and the 
 * get light method
 * 8. Fill in toString with information to set the print 
 * 9. Go to CircuitTester and create a single object, no arg constructor
 * 10. Print out the statements, and use the toggles to enact the lights
 * 11. Compile and test. 
 */

    public class CircuitTester {
        public static void main(String[] args)
        {
         // No arg constructor
         //Create a single object ThreeWayLight, set it to default order
          ThreeWayLight light = new ThreeWayLight(0,0);
          
          // No arg constructor print out
          // Prints status of switches and light
          System.out.printf(light.toString());
          
          // Accesses toggle switch and inputs a number to configure,
          // turning it up or down
          light.toggleFirstSwitch();
          System.out.printf(light.toString());
          light.toggleSecondSwitch();
          System.out.printf(light.toString());
          light.toggleFirstSwitch();
          System.out.printf(light.toString());
          light.toggleSecondSwitch();
        }
}
