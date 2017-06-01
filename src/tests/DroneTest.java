package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;

public class DroneTest {

	@Test
	public void test_DroneStartPosition() {
		int[] startCoordinates = new int[] {30,0,30};
		Drone drone = new Drone(startCoordinates);
		String coordinates = drone.getFormatedCoordinates();
		assertEquals("(30,0,30)", coordinates);
	}
	
	@Test
	public void test_DroneInitialMoveUp() {
		int[] startCoordinates = new int[] {30,0,30};
		Drone drone = new Drone(startCoordinates);
		drone.moveUp();
		String coordinates = drone.getFormatedCoordinates();
		assertEquals("(30,1,30)", coordinates);
	}
	
	@Test
	public void test_DroneInitialMoveDown() {
		int[] startCoordinates = new int[] {30,5,30};
		Drone drone = new Drone(startCoordinates);
		drone.moveDown();
		String coordinates = drone.getFormatedCoordinates();
		assertEquals("(30,4,30)", coordinates);
	}
	
	@Test
	public void test_DroneInitialMoveLeft() {
		int[] startCoordinates = new int[] {30,0,30};
		Drone drone = new Drone(startCoordinates);
		drone.moveLeft();
		String coordinates = drone.getFormatedCoordinates();
		assertEquals("(29,0,30)", coordinates);
	}
	
	@Test
	public void test_DroneInitialMoveRight() {
		int[] startCoordinates = new int[] {26,0,30};
		Drone drone = new Drone(startCoordinates);
		drone.moveRight();
		String coordinates = drone.getFormatedCoordinates();
		assertEquals("(27,0,30)", coordinates);
	}
	
	@Test
	public void test_DroneInitialMoveBack() {
		int[] startCoordinates = new int[] {30,0,5};
		Drone drone = new Drone(startCoordinates);
		drone.moveBack();
		String coordinates = drone.getFormatedCoordinates();
		assertEquals("(30,0,6)", coordinates);
	}
	
	@Test
	public void test_DroneInitialMoveForth() {
		int[] startCoordinates = new int[] {30,0,5};
		Drone drone = new Drone(startCoordinates);
		drone.moveForth();
		String coordinates = drone.getFormatedCoordinates();
		assertEquals("(30,0,4)", coordinates);
	}
	
}
