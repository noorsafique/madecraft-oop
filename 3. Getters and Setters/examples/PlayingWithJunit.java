package examples;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PlayingWithJunit {

	@Test
	void testName() throws Exception {

		assertEquals(4, Calculator.add(2,2));
	}
}
