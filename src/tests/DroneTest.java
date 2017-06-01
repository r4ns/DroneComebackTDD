package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Cube;
import drone.Drone;
import drone.DroneException;

public class DroneTest {
	@Test 
	public void test_initialMoveUp() throws DroneException {
		Drone dr = new Drone(new Cube(new int[]{0,0,0}, 50), new Cube(new int[]{10,10,10}, 30), new int[]{0,0,0});
		dr.moveUp();
		String expected = "Drone position is: (0, 1, 0)";
		assertEquals(expected, dr.getFormatedCoordinates());
	}
	
	@Test 
	public void test_initialMoveDown() throws DroneException {
		Drone dr = new Drone(new Cube(new int[]{0,0,0}, 50), new Cube(new int[]{10,10,10}, 30), new int[]{0,1,0});
		dr.moveDown();
		String expected = "Drone position is: (0, 0, 0)";
		assertEquals(expected, dr.getFormatedCoordinates());
	}
}
