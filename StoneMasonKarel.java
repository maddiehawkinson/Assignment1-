
import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {
	public void run () {
		while (frontIsClear()) {
			putBeeper();
			move();
				for (int i=0; i<4; i++) {
					putBeeper();
				}
		}
			turnLeft(); 
			move();
			turnLeft(); }
}
	
