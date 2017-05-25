package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;
import drone.DroneException;

public class DroneTest {
	Drone drone;
	private int[] boundaries={50,50,50};
	private int[] coordinates={30,0,30};
	
	@Test
	public void test_Konstruktor(){
		drone=new Drone(coordinates);
		assertNotNull(drone);
	}
	
	@Test
	public void test_Drugi_Konstruktor(){
		drone=new Drone(boundaries,coordinates);
		assertNotNull(drone);
	}
	
	@Test
	public void test_Move_Up(){
		drone= new Drone(boundaries, coordinates);
		String expectedCoordinates="("
		        +Integer.toString(coordinates[0])+","
		        +Integer.toString(coordinates[1]+1)+","
		        +Integer.toString(coordinates[2]) + ")";
		assertEquals(expectedCoordinates,drone.moveUp());	
	}
	
	@Test
	public void test_Move_Down(){
		coordinates[1]=40;
		drone= new Drone(boundaries, coordinates);
		String expectedCoordinates="("
		        +Integer.toString(coordinates[0])+","
		        +Integer.toString(coordinates[1])+","
		        +Integer.toString(coordinates[2]) + ")";
		assertEquals(expectedCoordinates,drone.moveDown());
	}
	
	@Test
	public void test_Move_Left(){
		coordinates[0]=40;
		coordinates[1]=30;
		drone= new Drone(boundaries, coordinates);
		String expectedCoordinates="("
				+Integer.toString(coordinates[0])+","
		        +Integer.toString(coordinates[1])+","
		        +Integer.toString(coordinates[2]) + ")";
		assertEquals(expectedCoordinates,drone.moveLeft());
	}
	
	@Test
	public void test_Move_Right(){
		coordinates[0]=10;
		coordinates[1]=30;
		drone= new Drone(boundaries, coordinates);
		String expectedCoordinates="("
				+Integer.toString(coordinates[0])+","
		        +Integer.toString(coordinates[1])+","
		        +Integer.toString(coordinates[2]) + ")";
		assertEquals(expectedCoordinates,drone.moveRight());
	}
	
	@Test
	public void test_Move_Forth(){
		coordinates[0]=30;
		coordinates[1]=30;
		coordinates[2]=40;
		drone= new Drone(boundaries, coordinates);
		String expectedCoordinates="("
				+Integer.toString(coordinates[0])+","
		        +Integer.toString(coordinates[1])+","
		        +Integer.toString(coordinates[2]) + ")";
		assertEquals(expectedCoordinates,drone.moveForth());
	}
	
	@Test
	public void test_Move_Back(){
		coordinates[0]=30;
		coordinates[1]=30;
		coordinates[2]=10;
		drone=new Drone(boundaries,coordinates);
		String expectedCoordinates="("
				+Integer.toString(coordinates[0])+","
				+Integer.toString(coordinates[1])+","
				+Integer.toString(coordinates[2])+")";
		assertEquals(expectedCoordinates,drone.moveBack());
	}
	
	

}
