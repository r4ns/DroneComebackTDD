package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;


public class DroneTest {

	Drone drone;
	int x=30, y=0, z=30;
	

	@Test
	public void testConstructor1(){
		drone=new Drone(x,y,z);
		assertNotNull(drone);
	}
	
	@Test
public void testInitialMoveUp(){
		
		drone= new Drone(x,y,z);
		String expectedCoordinates="("
				+Integer.toString(x)+","
		+Integer.toString(y+1)+","
		+Integer.toString(z) + ")";
		assertEquals(expectedCoordinates,drone.moveUp());
		
	}
	
	@Test
	public void testInitialMoveDown(){
			
			drone= new Drone(30,1,30);
			String expectedCoordinates="("
					+Integer.toString(x)+","
			+Integer.toString(y)+","
			+Integer.toString(z) + ")";
			assertEquals(expectedCoordinates,drone.moveDown());
			
		}
	
	@Test
	public void testInitialMoveLeft(){
			
		drone= new Drone(30,0,30);
			String expectedCoordinates="("
					+Integer.toString(x-1)+","
			+Integer.toString(y)+","
			+Integer.toString(z) + ")";
			assertEquals(expectedCoordinates,drone.moveLeft());
			
		}
	
	@Test
	public void testInitialMoveRight(){
			
		drone= new Drone(30,0,30);
			String expectedCoordinates="("
					+Integer.toString(x+1)+","
			+Integer.toString(y)+","
			+Integer.toString(z) + ")";
			assertEquals(expectedCoordinates,drone.moveRight());
			
		}
	@Test
	public void testInitialMoveBack(){
			
		drone= new Drone(30,0,30);
			String expectedCoordinates="("
					+Integer.toString(x)+","
			+Integer.toString(y)+","
			+Integer.toString(z+1) + ")";
			assertEquals(expectedCoordinates,drone.moveBack());
			
		}
	@Test
	public void testInitialMoveForth(){
			
		drone= new Drone(30,0,30);
			String expectedCoordinates="("
					+Integer.toString(x)+","
			+Integer.toString(y)+","
			+Integer.toString(z-1) + ")";
			assertEquals(expectedCoordinates,drone.moveForth());
			
		}
	
}
