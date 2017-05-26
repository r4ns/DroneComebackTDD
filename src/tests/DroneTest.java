package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;

public class DroneTest {

	@Test
	public void test_StartCoordinates() {
		Drone drone = new Drone();
		
		String expectedCoordinates = "(30, 0, 30)";

		assertEquals(expectedCoordinates, drone.getFormatedCoordinates());	
	}
	
	@Test
	public void test_initial_drone_movesUp(){
		Drone drone = new Drone();
		
		drone.moveUp();
		
		String expectedCoordinates = "(30, 1, 30)";
		
		assertEquals(expectedCoordinates, drone.getFormatedCoordinates());	
	}
	
	@Test
	public void test_initial_drone_movesDown(){
		Drone drone = new Drone();
		
		drone.moveDown();
		
		String expectedCoordinates = "(30, 0, 30)";
		
		assertEquals(expectedCoordinates, drone.getFormatedCoordinates());	
	}
	
	@Test
	public void test_initial_drone_movesLeft(){
		Drone drone = new Drone();
		
		drone.moveLeft();
		
		String expectedCoordinates = "(29, 0, 30)";
		
		assertEquals(expectedCoordinates, drone.getFormatedCoordinates());	
	}
	
	@Test
	public void test_initial_drone_movesRight(){
		Drone drone = new Drone();
		
		drone.moveRight();
		
		String expectedCoordinates = "(31, 0, 30)";
		
		assertEquals(expectedCoordinates, drone.getFormatedCoordinates());	
	}
	
	@Test
	public void test_initial_drone_movesForth(){
		Drone drone = new Drone();
		
		drone.moveForth();
		
		String expectedCoordinates = "(30, 0, 29)";
		
		assertEquals(expectedCoordinates, drone.getFormatedCoordinates());	
	}
	
	@Test
	public void test_initial_drone_movesBack(){
		Drone drone = new Drone();
		
		drone.moveBack();
		
		String expectedCoordinates = "(30, 0, 31)";
		
		assertEquals(expectedCoordinates, drone.getFormatedCoordinates());	
	}
}
