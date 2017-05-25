package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;


public class DroneTest {

	Drone drone;
	int x=30, y=0, z=30;
	
	@Test
public void testInitialMoveUp(){
		
		drone= new Drone();
		String expectedCoordinates="("
				+Integer.toString(x)+","
		+Integer.toString(y+1)+","
		+Integer.toString(z) + ")";
		assertEquals(expectedCoordinates,drone.moveUp());
		
	}
	
	@Test
	public void testInitialMoveDown(){
			
			drone= new Drone();
			String expectedCoordinates="("
					+Integer.toString(x)+","
			+Integer.toString(y-1)+","
			+Integer.toString(z) + ")";
			assertEquals(expectedCoordinates,drone.moveDown());
			
		}
	
	@Test
	public void testInitialMoveLeft(){
			
			drone= new Drone();
			String expectedCoordinates="("
					+Integer.toString(x-1)+","
			+Integer.toString(y)+","
			+Integer.toString(z) + ")";
			assertEquals(expectedCoordinates,drone.moveLeft());
			
		}
	
}
