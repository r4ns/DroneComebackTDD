package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;

public class DroneTest {
	
	@Test
	public void testConstructor(){
		
		Drone dron = new Drone(10,20,30);
		String expected = "Drone position: (10,20,30)";
		assertEquals(expected, dron.getFormatedCoordinates());
	}
	
	@Test 
	public void testMoveUp(){
		
		Drone dron = new Drone(30,0,30);
		
		String expected = "Drone position: (30,1,30)";
		assertEquals(expected, dron.moveUp());
		
		
	}
	
	@Test 
	public void testMoveDown(){
		
		Drone dron = new Drone(30,1,30);
		
		String expected = "Drone position: (30,0,30)";
		assertEquals(expected, dron.moveDown());
	}
	
	@Test 
	public void testMoveRight(){
		
		Drone dron = new Drone(30,0,30);
		
		String expected = "Drone position: (31,0,30)";
		assertEquals(expected, dron.moveRight());
	}
	
	@Test 
	public void testMoveLeft(){
		
		Drone dron = new Drone(30,0,30);
		
		String expected = "Drone position: (29,0,30)";
		assertEquals(expected, dron.moveLeft());
	}
	
	@Test 
	public void testMoveBack(){
		
		Drone dron = new Drone(30,0,30);
		
		String expected = "Drone position: (30,0,29)";
		assertEquals(expected, dron.moveBack());
	}
	
	@Test 
	public void testMoveForth(){
		
		Drone dron = new Drone(30,0,30);
		
		String expected = "Drone position: (30,0,31)";
		assertEquals(expected, dron.moveForth());
	}
	
	
	
	
	
	
	

}
