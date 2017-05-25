package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;

public class DroneTest {
	
	@Test 
	public void konstruktorBezParamaterimaTest()
	{
		Drone drone = new Drone();
		assertNotNull(drone);
	}

	@Test
	public void konstruktorSaParametrima()
	{
		int [] boundaries=null;
		int [] startCoordinates=null;
		Drone drone = new Drone (startCoordinates,boundaries);
		assertNotNull(drone);
	}
	
	@Test 
	public void initialMoveUpTest()
	{
		Drone drone = new Drone ();
		
	}
	
	

}
