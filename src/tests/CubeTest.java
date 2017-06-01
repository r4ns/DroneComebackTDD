package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import drone.Cube;
import drone.Drone;
import drone.DroneException;

public class CubeTest {
	
	@Test
	public void testPocetniGore() throws DroneException {
		Cube cub = new Cube(new int[]{0,1,0}, 6);
		String ocekivani = "(0,1,0) --> (6,7,6)";
		assertEquals(ocekivani, "" + cub);
	}
	
	@Test
	public void testPocetniDesno() throws DroneException {
		Cube cub = new Cube(new int[]{1,0,0}, 6);
		String ocekivani = "(0,1,0) --> (6,7,6)";
		assertEquals(ocekivani, "" + cub);
	}
	
	
	@Test (expected = DroneException.class) 
	public void testPogresnoUnetaKocka() throws DroneException {
		Cube cub = new Cube(new int[]{0,1,0, 0}, 6);
	}
}
