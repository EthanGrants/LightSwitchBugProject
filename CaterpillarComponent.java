/**
 * CaterpillarComponent.java - Contains 3 Caterpillar objects
 * Author:     Ethan Grant
 * Module:     4
 * Project:    Homework, Project 3 + 4
 * Description: Draw 3 Caterpillars of different sizes that can be resized with the Jframe
 */
import java.awt.Graphics ;
import java.awt.Graphics2D ;
import javax.swing.JComponent ;

public class CaterpillarComponent extends JComponent {
    // Paints picture on Canvas
   public void paint(Graphics g) {
       // Extend using the Graphics2D library so we can add objects to the canvas
       Graphics2D g2 = (Graphics2D) g;
       
       // Create one Caterpillar object and draw
       Caterpillar figure1 = new Caterpillar(100,100,1.0);
       figure1.paint(g2);
       
       // Create the x and y coordinate for figure2 so it can be moveable
       // when the Jframe is resized
       int x = (int) (this.getWidth() * 2.0/4.5);
       int y = (int) (this.getHeight() * 2.0/5.0);
       Caterpillar figure2 = new Caterpillar(x,y,1.0/3.0);
       figure2.paint(g2);
       
    // Create the x and y coordinate for figure3 so it can be moveable
    // when the Jframe is resized
       x = (int) (this.getWidth() * 2.0/3.5);
       y = (int) (this.getHeight() * 2.0/10.0);
       Caterpillar figure3 = new Caterpillar(x,y,1.5);
       figure3.paint(g2);
   }

}
    
