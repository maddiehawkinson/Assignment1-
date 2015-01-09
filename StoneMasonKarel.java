
import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {
	public void run () {
		while (frontIsClear()) {
				move();
				fixArch();	
			}
			turnLeft(); 
			move();
			turnLeft();
		}
	private void fixArch() {
		if (noBeepersPresent()) {
			for (int i=0; i>4; i++) {
				putBeeper(); 
			}
		}
	}
}
	
