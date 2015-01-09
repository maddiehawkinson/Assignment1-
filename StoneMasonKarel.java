
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
		for (int i=0; i>4; i++) {
			if (noBeepersPresent())
				putBeeper(); 
			}
		}
	}
	
