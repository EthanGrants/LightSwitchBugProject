/**
 * CaterpillarComponent.java - Contains 3 Caterpillar objects
 * Author:     Ethan Grant
 * Module:     4
 * Project:    Homework, Project 3 + 4
 * Description: Draw 3 Caterpillars of different sizes that can be resized with the Jframe
 * 
 * Problem Statement:
 * Create new Graphic classes and add the ability to scale the figure that you created in 
 * Project 3 so that it can be drawn to any size.
 * 
 * Algorithm: 
 * 1. Create a Caterpillar class which will draw the resemblance of a Caterpillar
 * 2. Create instance variables, a constructor to update it, and a method to draw
 * the caterpillar.
 * 3. Use AffineTransform to scale the objects, plug in xLeft and YTop into each
 * individual coordinate.
 * 4. Create CaterpillarComponent Class
 * 5. Use it to paint the picture on Canvas and extend to the Graphics2D library
 * 6. Create 3 caterpillar objects, and x and y ints for the last two to make it
 *    moveable
 * 7. Reference the Graphic2D library for each object
 * 8. Create constants for the Title, Width, and height.
 * 9. Create a Jframe, and set its size, title and exit operation.
 * 10. Open it at the center of the screen, and instantitate a new
 *     Jcomponent object and then make the Jframe visible.
 * 11. Compile and test.
 */

import javax.swing.JFrame;

public class CaterpillarViewer {
    public static final String TITLE = "Three Scaled Figures"; // Jframe title
    public static final int WIDTH = 1000; // Jframe width (in pixels)
    public static final int HEIGHT = 1000; // Jfram height (in pixels)
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame();
        // Set the size, title, and exit operationframe.  
        //Open at the center of the screen
        frame.setTitle(TITLE);
        frame.setSize(WIDTH, HEIGHT) ;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null) ;
        // Instantiate a new JComponent object, then make the JFrame visible
        frame.add(new CaterpillarComponent());  // anonymous (no variable name)
        frame.setVisible(true);
    }
}