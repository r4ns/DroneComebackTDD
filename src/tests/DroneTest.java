package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;

public class DroneTest {
	Drone drone;
	private int[] boundaries={50,50,50};
	private int[] startCoordinates={30,0,30};
	
	@Test
	public void test_MoveUp(){
		drone= new Drone(boundaries, startCoordinates);
		String expectedCoordinates="("
				+Integer.toString(startCoordinates[0])+","
		+Integer.toString(startCoordinates[1]+1)+","
		+Integer.toString(startCoordinates[2]) + ")";
		assertEquals(expectedCoordinates,drone.moveUp());
		
		
	}

}
