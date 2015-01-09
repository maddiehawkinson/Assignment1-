
import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {
		private void checkForBeeper() {
			while (noBeepersPresent()) {
				putBeeper();
					for (int i=0; i<4; i++) {
						move(); }
			}
		}
		private void fixRightStreet() {
			if (frontIsClear()) {
				checkForBeeper(); 
			}
			turnLeft();
			move();
			turnLeft(); 
			}
		private void fixLeftStreet() {
			if (frontIsClear()) {
				checkForBeeper();
			}
			turnRight();
			move();
			turnRight();
			}
		public void run() {
				fixRightStreet();
				fixLeftStreet();
		}	
	}
	
