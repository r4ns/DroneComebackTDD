package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;
import drone.FlySpace;

public class DroneTest {

	Drone drone;
	FlySpace flySpace = new FlySpace();
	
	@Test
	public void testMoveUp()
	{
		drone = new Drone(25,10,25, flySpace);
		drone.moveUp();
		String actual = drone.getFormatedCoordinates();
		String expected = "Drone position: (25,10,25)";
		
		assertEquals(expected,actual);
	}
	
	/*@Test
	public void testMoveDown()
	{
		drone = new Drone(0,0,0, flySpace);
		drone.moveUp();
		String actual = drone.getFormatedCoordinates();
		String expected = "Drone position: (0,1,0)";
		
		assertEquals(expected,actual);
	}*/
}
