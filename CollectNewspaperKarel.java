/*
 * File: CollectNewspaperKarel.java
 * --------------------------------
 * At present, the CollectNewspaperKarel subclass does nothing.
 * Your job in the assignment is to add the necessary code to
 * instruct Karel to walk to the door of its house, pick up the
 * newspaper (represented by a beeper, of course), and then return
 * to its initial position in the upper left corner of the house.
 */

/**CollectNewspaperKarel will pick up the newspaper and bring it back inside, 
 * returning to his initial spot.
 */

import stanford.karel.*;

public class CollectNewspaperKarel extends Karel {	
	public void run() {
	move();
	move();
	turnRight(); 
	move();
	turnLeft();
	move();
	pickBeeper();
	turnAround();
	move();
	turnRight();
	move();
	turnLeft();
	move();
	move();
	turnAround();
	}

/** Defines turnRight for the program.*/
	
private void turnRight() {
	turnLeft();
	turnLeft();
	turnLeft();
	}
	
/** Defines turnAround for the program.*/
	
private void turnAround() {
	turnLeft();
	turnLeft();
	}
}

