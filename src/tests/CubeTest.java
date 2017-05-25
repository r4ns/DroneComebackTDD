package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import drone.Cube;
import drone.Drone;

public class CubeTest {
	
	@Test
	public void testPocetni() {
		Cube cub = new Cube(new int[]{0,1,0}, 6);
		String ocekivani = "(0,1,0) --> (6,7,6)";
		assertEquals(ocekivani, "" + cub);
	}
}
