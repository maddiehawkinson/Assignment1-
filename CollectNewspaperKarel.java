import stanford.karel.*;

public class CollectNewspaperKarel extends Karel {
	private void turnRight() {
		turnLeft();
		turnLeft(); 
		turnLeft();
		}
		
	private void turnAround() {
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

