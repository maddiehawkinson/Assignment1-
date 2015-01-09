
import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {
		private void fixStreetArch() {
			while (frontIsClear()) {
				if (noBeepersPresent())
					putBeeper();
						for (int i=0; i<4; i++) {
							move(); }
			turnLeft(); 
			move();
			turnLeft(); }
			}
	
		public void run () {
			fixStreetArch(); 
		}
			
	}
	
