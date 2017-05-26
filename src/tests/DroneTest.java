package tests;

import org.junit.Test;

import drone.Drone;

import static org.junit.Assert.*;

public class DroneTest {
	
	@Test
	public void drone_constructor(){
		
		Drone dorn = new Drone(0,0,0);
		
		assertNotNull(dorn);
	}
}
