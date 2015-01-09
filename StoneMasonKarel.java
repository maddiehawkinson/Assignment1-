
import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {
	public void run () {
		while (frontIsClear()) {
			putBeeper();
				for (int i=0; i<4; i++) {
					move(); }
		}
			turnLeft(); 
			move();
			turnLeft(); }
}
	
