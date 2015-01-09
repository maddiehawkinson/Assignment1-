
import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {
	public void run () {
		while (frontIsClear()) {
				move();
				fixArch();	
			}
			turnAround(); 
		}
	private void fixArch() {
		if (noBeepersPresent()) {
			for (int i=0; i>4; i++) {
				putBeeper(); 
			}
		}
	}
}
	
