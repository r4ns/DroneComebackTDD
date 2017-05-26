package tests;

import org.junit.Test;

import drone.Drone;

import static org.junit.Assert.*;


public class DroneTest {
	
	@Test
	public void TestWhenDroneIsCreated(){
		Drone drone = new Drone(0,0,0);
		
		assertNotNull(drone);
	}
	
	@Test
	public void TestMoveUp(){
		Drone drone = new Drone(0,0,0);
		assertEquals("Drone: (0,1,0)", drone.moveUp());
	}
	
	@Test
	public void TestMoveUpWhenItsBoundary50(){
		Drone drone = new Drone(50,50,50);
		assertEquals("Drone: (50,50,50)", drone.moveUp());
	}
	
	@Test
	public void TestMoveUpWhenItsBoundary10(){
		Drone drone = new Drone(20,10,20);
		assertEquals("Drone: (20,10,20)", drone.moveUp());
	}
	
	@Test
	public void TestMoveDownWhenItsBoundary0(){
		Drone drone = new Drone(0,0,0);
		assertEquals("Drone: (0,0,0)", drone.moveDown());
	}
	
	@Test
	public void TestMoveDownWhenItsBoundary40(){
		Drone drone = new Drone(20,40,20);
		assertEquals("Drone: (20,40,20)", drone.moveDown());
	}
	
	@Test
	public void TestMoveDown(){
		Drone drone = new Drone(0,1,0);
		assertEquals("Drone: (0,0,0)", drone.moveDown());
	}
	
	

}
