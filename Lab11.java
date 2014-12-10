/**
 * An algorithm helps an Athlete solve a maze, perhaps by keeping one hand against a wall.
 * 
 * @author <...>
 * @version <...>
 *
 */

import edu.fcps.karel2.Display; 
import edu.fcps.Digit;
public class Lab11 {
	 
	
	  public static void main(String[] args) {
    Display.openWorld("maps/.map");
	 Display.setSize(36, 32);
	 Display.setSpeed(10);
    Digit first = new Zero(1,9);
    Digit second = new Five(7,9);
    Digit third = new Six(13,9);
    Digit fourth = new Seven(19,9);
    Digit fifth = new Three(25,9);
    Digit sixth = new Eight(31,9);
    
     first.display();
    second.display();
    third.display();
    fourth.display();
    fifth.display();
    sixth.display();
	 }
	 
 
 }