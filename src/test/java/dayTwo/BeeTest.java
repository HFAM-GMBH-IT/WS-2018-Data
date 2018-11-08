package dayTwo;

import static org.junit.Assert.*;

import org.junit.Test;

public class BeeTest {
	
	Bee theBee = new Bee();

	@Test
	public void test() {
		int beesHight = theBee.getAltitude();
		theBee.fly();
		assertTrue(beesHight < theBee.getAltitude());
	}

}
