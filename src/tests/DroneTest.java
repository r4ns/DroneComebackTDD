package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Cube;
import drone.Drone;

public class DroneTest {
	
	@Test
	public void test_konstruktor_dron(){
		Drone dron = new Drone();
		boolean postoji;
		if (dron == null){
			postoji = false;
		}else{
			postoji = true;
		}
		
		assertTrue(postoji);
	}
	
	
	@Test
	public void test_move_up(){
		Drone dron = new Drone();
		dron.getFormatedCoordinates();
		dron.moveUp();
		assertEquals("Error!","(30, 1, 30)", dron.getFormatedCoordinates());
	}
	
	@Test
	public void test_move_down(){
		Drone dron = new Drone();
		dron.getFormatedCoordinates();
		dron.moveDown();
		assertEquals("Error!","(30, -1, 30)", dron.getFormatedCoordinates());

	}
	
	@Test
	public void test_move_left(){
		Drone dron = new Drone();
		dron.getFormatedCoordinates();
		dron.moveLeft();
		assertEquals("Error!","(29, 0, 30)", dron.getFormatedCoordinates());

	}
	
	@Test
	public void test_move_right(){
		Drone dron = new Drone();
		dron.getFormatedCoordinates();
		dron.moveRight();
		assertEquals("Error!","(31, 0, 30)", dron.getFormatedCoordinates());

	}
	
	@Test
	public void test_move_forth(){
		Drone dron = new Drone();
		dron.getFormatedCoordinates();
		dron.moveForth();
		assertEquals("Error!","(30, 0, 29)", dron.getFormatedCoordinates());

	}
	
	@Test
	public void test_move_back(){
		Drone dron = new Drone();
		dron.getFormatedCoordinates();
		dron.moveBack();
		assertEquals("Error!","(30, 0, 31)", dron.getFormatedCoordinates());

	}
	
}
