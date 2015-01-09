*File: CollectNewspaperKarel.java 

import stanford.karel.*;

public class CollectNewspaperKarel extends Karel {
	public void turnRight() {
		turnLeft();
		turnLeft(); 
		turnLeft();
		}
		
	public void turnAround() {
		turnLeft();
		turnLeft();
		}
	
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
}

