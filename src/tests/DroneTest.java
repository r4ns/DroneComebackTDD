package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;

public class DroneTest {
	@Test
	public void test_CreatingDrone() {
		Drone drone = new Drone(0, 0, 0);
		
		String expected = "Drone: (0, 0, 0)";
		
		assertEquals(expected, drone.getFormatedCoordinates());
	}
	
	@Test
	public void test_InitialMoveUp() {
		Drone drone = new Drone(0, 0, 0);
		
		String expected = "Drone: (0, 1, 0)";
		
		assertEquals(expected, drone.moveUp());
	}
	
	@Test
	public void test_BoundariesMoveUp_One() {
		Drone drone = new Drone(20, 10, 20);
		
		String expected = "Drone: (20, 10, 20)";
		
		assertEquals(expected, drone.moveUp());
	}
	
	@Test
	public void test_BoundariesMoveUp_Two() {
		Drone drone = new Drone(20, 50, 20);
		
		String expected = "Drone: (20, 50, 20)";
		
		assertEquals(expected, drone.moveUp());
	}
	
	@Test
	public void test_InitialMoveDown() {
		Drone drone = new Drone(0, 1, 0);
		
		String expected = "Drone: (0, 0, 0)";
		
		assertEquals(expected, drone.moveDown());
	}
	
	@Test
	public void test_BoundariesMoveDown_One() {
		Drone drone = new Drone(0, 0, 0);
		
		String expected = "Drone: (0, 0, 0)";
		
		assertEquals(expected, drone.moveDown());
	}
	
	@Test
	public void test_BoundariesMoveDown_Two() {
		Drone drone = new Drone(20, 40, 20);
		
		String expected = "Drone: (20, 40, 20)";
		
		assertEquals(expected, drone.moveDown());
	}
	
	@Test
	public void test_InitialMoveLeft() {
		Drone drone = new Drone(1, 0, 0);
		
		String expected = "Drone: (0, 0, 0)";
		
		assertEquals(expected, drone.moveLeft());
	}
	
	@Test
	public void test_BoundariesMoveLeft_One() {
		Drone drone = new Drone(0, 0, 0);
		
		String expected = "Drone: (0, 0, 0)";
		
		assertEquals(expected, drone.moveLeft());
	}
	
	@Test
	public void test_BoundariesMoveLeft_Two() {
		Drone drone = new Drone(40, 20, 20);
		
		String expected = "Drone: (40, 20, 20)";
		
		assertEquals(expected, drone.moveLeft());
	}
	
	@Test
	public void test_InitialMoveRight() {
		Drone drone = new Drone(1, 0, 0);
		
		String expected = "Drone: (2, 0, 0)";
		
		assertEquals(expected, drone.moveRight());
	}
	
	@Test
	public void test_BoundariesMoveRight_One() {
		Drone drone = new Drone(10, 20, 20);
		
		String expected = "Drone: (10, 20, 20)";
		
		assertEquals(expected, drone.moveRight());
	}
	
	@Test
	public void test_BoundariesMoveRight_Two() {
		Drone drone = new Drone(50, 20, 20);
		
		String expected = "Drone: (50, 20, 20)";
		
		assertEquals(expected, drone.moveRight());
	}
	
	@Test
	public void test_InitialMoveBack() {
		Drone drone = new Drone(0, 0, 1);
		
		String expected = "Drone: (0, 0, 2)";
		
		assertEquals(expected, drone.moveBack());
	}
	
	@Test
	public void test_BoundariesMoveBack_One() {
		Drone drone = new Drone(20, 20, 10);
		
		String expected = "Drone: (20, 20, 10)";
		
		assertEquals(expected, drone.moveBack());
	}
	
	@Test
	public void test_BoundariesMoveBack_Two() {
		Drone drone = new Drone(20, 20, 50);
		
		String expected = "Drone: (20, 20, 50)";
		
		assertEquals(expected, drone.moveBack());
	}
	
	@Test
	public void test_InitialMoveForth() {
		Drone drone = new Drone(0, 0, 1);
		
		String expected = "Drone: (0, 0, 0)";
		
		assertEquals(expected, drone.moveForth());
	}
	
	@Test
	public void test_BoundariesMoveForth_One() {
		Drone drone = new Drone(20, 20, 0);
		
		String expected = "Drone: (20, 20, 0)";
		
		assertEquals(expected, drone.moveForth());
	}
	
	@Test
	public void test_BoundariesMoveForth_Two() {
		Drone drone = new Drone(20, 20, 40);
		
		String expected = "Drone: (20, 20, 40)";
		
		assertEquals(expected, drone.moveForth());
	}
}
