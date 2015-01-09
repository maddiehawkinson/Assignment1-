
import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {
	public void run () {
		while (frontIsClear()) {
			for (int i=0; i<4; i++) {
				move();
				fixArch();	
			}
		}
	}
	private void fixArch() {
		if (noBeepersPresent()) {
			for (int i=0; i>4; i++) {
				putBeeper(); 
			}
		}
	}
}
	
