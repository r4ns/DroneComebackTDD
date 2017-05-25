package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;

public class DroneTest {
	
	@Test
	public void test_ConstructorWithParameters()
	{
		int[] boundaries = null;
		int[] startCoordinates = null;
		Drone drone = new Drone(boundaries, startCoordinates);
		
		assertNotNull(drone);
	}
	
	@Test
	public void test_ConstructorEmpty()
	{
		Drone drone = new Drone();
		assertNotNull(drone);
	}
	
	@Test
	public void test_initialMoveUp(){
		int[] startCoordinates={50,50};
		int[] boundaries={30,0,30};
		Drone drone = new Drone(boundaries, startCoordinates);
		
		String expectedCoordinates= getFormatedCoordinates()
		assertEquals(expectedCoordinates, drone.moveUp());
	}

}
