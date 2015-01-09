
import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {
		private void putBeepersDownWhenNonePresent() {
			if (noBeepersPresent())
				putBeeper();
					for (int i=0; i<4; i++) {
						move(); }
		}
		private void fixRightStreet() {
			while (frontIsClear()) {
				putBeepersDownWhenNonePresent(); 
				turnLeft();
				move();
				turnLeft();
			}
		}
		private void fixLeftStreet() {
			while (frontIsClear()) {
				putBeepersDownWhenNonePresent();
				turnRight();
				move();
				turnRight();
			}
		}
		public void run () {
			fixRightStreet();
			fixLeftStreet();
		}	
	}
	
