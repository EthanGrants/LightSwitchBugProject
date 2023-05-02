
/** Bug.java - A bug walking along a wire
 * Author:     Ethan Grant
 * Module:     3
 * Project:    Homework
 *
 * Instance variables:
 *  An integer named position which represents the position of the bug
 *  A string named direction which represents the direction of the bug 
 */
public class Bug
{
    // Instance variables
    private int position = 0;
    private String direction = "";
    
    // Constructor
  public Bug(int initialPosition) {
    position = initialPosition;
    direction = "right";
  } 
  
  //Methods
  // Determine if position increases or decreases depending on right or left
  public void move() {
      if (direction.equals("right")) {
        position++;
      }
      else {
          position--;
      }
  }
  // Set up turns
  public void turn() {
    if (direction.equals("right")) {
        direction = "left";
    }
    else {
        direction = "right";
    }
  }
  
  // Getters
  public int getPosition () {
    return position;
  }
  public String getDirection() {
    return direction;
  } 
  // Prints out info
  public String toString() {
     return "\nPosition  Of Bug:  " + position +
            "\nDirection Of Bug:  " + direction;
  }
  
}
