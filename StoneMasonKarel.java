
import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {
		private void putBeepersDownWhenNonePresent() {
			if (noBeepersPresent())
				putBeeper();
					for (int i=0; i<4; i++) {
						move(); }
		}
		private void fixStreetArch() {
			while (frontIsClear()) {
				putBeepersDownWhenNonePresent(); 
			}
		}
		public void run () {
			fixStreetArch(); 
			turnLeft();	
			move();
			turnLeft();
			putBeepersDownWhenNonePresent();
		}	
	}
	
