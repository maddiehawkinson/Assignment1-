
import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {
	public void run () {
		while (frontIsClear()) {
			move();
			putBeeper();	
		}
			turnLeft(); 
			move();
			turnLeft(); }
}
	
