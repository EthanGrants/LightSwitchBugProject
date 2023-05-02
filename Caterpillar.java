/**
 * Caterpillar.java - Draw a nice Rectangle2D and an overlapping Ellipse2D object
 * Author:     Ethan Grant
 * Module:     4
 * Project:    Homework, Project 3 + 4
 * Description: Draw 3 Caterpillars of different sizes that can be resized with the Jframe
 *
 * Instance variables:
 * xLeft (int) x-coordinate 
 * ytop (int) y-coordinate
 * scale (double) scales the image
 */
import java.awt.Graphics2D ;
import java.awt.Graphics ;
import java.awt.geom.Ellipse2D ;
import java.awt.Rectangle ;
import java.awt.Color ;
import javax.swing.JFrame;
import java.awt.geom.AffineTransform;


public class Caterpillar {
    
    // Instance variables
    private int xLeft = 0;
    private int yTop = 0;
    private double scale = 1.0;
    // Constructor which updates instance variables
    public Caterpillar(int xLeft, int yTop, double scale) {
        this.xLeft = xLeft;
        this.yTop = yTop;
        this.scale = scale;
    }
     
    // Draw Caterpillar with parameters being taken
    public void paint(Graphics2D canvas) {
        // Used to resize the objects
        AffineTransform transform = new AffineTransform();
        // Scales in both x and y
        transform.scale(scale, scale);
        // Apply the scaling to the images
        canvas.transform(transform);
         //Caterpillar Body
        canvas.setColor(Color.GREEN);
        canvas.fillOval(xLeft + 240,yTop+260,100,100);  
        
        canvas.setColor(Color.RED);
        canvas.fillOval(xLeft+180,yTop+240,100,100); 
        
        canvas.setColor(Color.YELLOW);
        canvas.fillOval(xLeft+110,yTop+210,100,100);  
        
        canvas.setColor(Color.MAGENTA);
        canvas.fillOval(xLeft+60,yTop+180,100,100);  
        
        canvas.setColor(Color.BLUE);
        canvas.fillOval(xLeft+30,yTop+130,100,100);  
        
        canvas.setColor(Color.CYAN);
        canvas.fillOval(xLeft+30,yTop+90,90,90);  
        
        // Eyes
        canvas.setColor(Color.BLACK);
        canvas.fillOval(xLeft+40,yTop+110,15,15);  
        canvas.fillOval(xLeft+60,yTop+110,15,15);  
        
        // Mouth
        canvas.drawArc(xLeft+30,yTop+130,50,15,180,180);
        
        // Green Legs
        canvas.fillRect(xLeft+280,yTop+350,5,20);
        canvas.fillRect(xLeft+300,yTop+350,5,20);
        
        // Red Legs
        canvas.fillRect(xLeft+240,yTop+335,5,20);
        canvas.fillRect(xLeft+220,yTop+335,5,20);
        
        // Yellow Legs
        canvas.fillRect(xLeft+140,yTop+300,5,20);
        canvas.fillRect(xLeft+160,yTop+300,5,20);
        
        // Magenta Legs
        canvas.fillRect(xLeft+110,yTop+270,5,20);
        canvas.fillRect(xLeft+90,yTop+270,5,20);
        
        // Blue Legs
        canvas.fillRect(xLeft+70,yTop+215,5,20);
        canvas.fillRect(xLeft+50,yTop+215,5,20);
        
        // Hat
        canvas.fillRect(xLeft+50,yTop+225,10,50);
        canvas.fillRect(xLeft+40,yTop+235,10,25);
        canvas.setColor(new Color(102,51,0));
        canvas.fillRect(xLeft+55,yTop+225,3,50);
        
        // Head hair
        canvas.drawArc(xLeft+55,yTop+80,5,15,90,180);
        canvas.drawArc(xLeft+57,yTop+80,5,15,90,190);
        canvas.drawArc(xLeft+59,yTop+80,5,15,90,180);
        canvas.drawArc(xLeft+61,yTop+80,5,15,80,180);
        canvas.drawArc(xLeft+63,yTop+80,5,15,90,180);
        canvas.drawArc(xLeft+65,yTop+80,5,15,90,180);
        canvas.drawArc(xLeft+67,yTop+80,5,15,90,180);
        canvas.drawArc(xLeft+69,yTop+81,5,15,70,170);
        canvas.drawArc(xLeft+71,yTop+81,5,15,85,190);
        canvas.drawArc(xLeft+73,yTop+81,5,15,95,170); 
        
        
    }
    
}