/**
 * CircuitTester.java - 3-way light switch
 * Author:     Chris Merrill
 * Module:     4
 * Project:    Hw
 * Problem Statement: Implement a class named Bug that models a bug walking
 * along a wire. From our view, the bug can move either left or right. 
 * Initially a bug moves to the right (in the positive direction), 
 * but it can turn and move in the opposite direction 
 * (in the negative direction). When the bug moves, it moves one unit in 
 * the direction it is currently facing.
 * 
 * Algorithm / Overall Plan:
 * 1. Create a constructor
 * 2. Create a move and turn method
 * 3. Create a get method
 * 4. Create a to string method
 * 5. Create two  Bug  objects, the first starting at position 3, and 
 *    the second at position 7. Both bugs should be facing right 
 *   (in the positive direction (the default starting direction).
 * 6. Move the first bug once, then turn, then move two times, and finally 
 *    turn once.
 * 7. Print the position of the first bug and the direction it is facing (left 
 *    or right) using the  toString  method.
 * 8. Turn the second bug, then move, then turn twice, and finally move once
 *    more.
 * 9. Print the position of the second bug and the direction it is facing 
 *    using the  toString  method.
 * 10. Compile and Test
 * 
*/ 
    public class BugMover {
        public static void main(String[] args)
        {
            // Constructor
            // Bug One
         Bug bugsy = new Bug(3); // at 3 facing right
         bugsy.move();           // now at 4
         bugsy.turn();           // facing left
         bugsy.move();           // now at 3
         bugsy.move();           // now at 2
         bugsy.turn();           // facing right
         System.out.printf(bugsy.toString());
         
         // Bug Two
         Bug bugsytwo = new Bug(7); // at 7 facing right 
         bugsytwo.turn();          // Facing left
         bugsytwo.move();           // now at 6
         bugsytwo.turn();           // facing right
         bugsytwo.turn();          // facing left
         bugsytwo.move();           // now at 5
         System.out.printf(bugsytwo.toString());
        }
}

