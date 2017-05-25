package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import drone.Cube;
import drone.Drone;


public class DroneTest {
	@Test
	public void testDronInit(){
		int a[] = {0,0,0};
		Drone d = new Drone(a);
		assertEquals("", "");
	}
}
