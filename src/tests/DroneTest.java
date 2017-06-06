package tests;

import org.junit.Test;
import drone.DroneException;
import drone.FlySpace;
import drone.Cube;
import drone.Drone;

import static org.junit.Assert.*;


public class DroneTest {
	Drone drone;
	
	@Test
	public void TestWhenDroneIsCreated(){
		drone = new Drone(0,0,0);
		
		assertNotNull(drone);
	}
	
	@Test
	public void TestMoveUp(){
		drone = new Drone(0,0,0);
		assertEquals("Drone: (0,1,0)", drone.moveUp());
	}
	
	@Test
	public void TestMoveUpWhenItsBoundary50(){
		drone = new Drone(50,50,50);
		assertEquals("Drone: (50,50,50)", drone.moveUp());
	}
	
	@Test
	public void TestMoveUpWhenItsBoundary10(){
		drone = new Drone(20,10,20);
		assertEquals("Drone: (20,10,20)", drone.moveUp());
	}
	
	@Test
	public void TestMoveDown(){
		drone = new Drone(0,1,0);
		assertEquals("Drone: (0,0,0)", drone.moveDown());
	}
	
	
	@Test
	public void TestMoveDownWhenItsBoundary0(){
		drone = new Drone(0,0,0);
		assertEquals("Drone: (0,0,0)", drone.moveDown());
	}
	
	@Test
	public void TestMoveDownWhenItsBoundary40(){
		drone = new Drone(20,40,20);
		assertEquals("Drone: (20,40,20)", drone.moveDown());
	}
	
	@Test
	public void TestMoveLeft(){
		drone = new Drone(1,0,0);
		assertEquals("Drone: (0,0,0)", drone.moveLeft());
	}
	
	@Test
	public void TestMoveLeftWhenItsBoundary0(){
		drone = new Drone(0,0,0);
		assertEquals("Drone: (0,0,0)", drone.moveLeft());
	}
	
	@Test
	public void TestMoveLeftWhenItsBoundary40(){
		drone = new Drone(40,30,30);
		assertEquals("Drone: (40,30,30)", drone.moveLeft());
	}
	
	@Test
	public void TestMoveRight(){
		drone = new Drone(0,0,0);
		assertEquals("Drone: (1,0,0)", drone.moveRight());
	}
	
	@Test
	public void TestMoveRightWhenItsBoundary50(){
		drone = new Drone(50,0,0);
		assertEquals("Drone: (50,0,0)", drone.moveRight());
	}
	
	@Test
	public void TestMoveRightWhenItsBoundary10(){
		drone = new Drone(10,30,30);
		assertEquals("Drone: (10,30,30)", drone.moveRight());
	}
	
	@Test
	public void TestMoveBack(){
		drone = new Drone(0,0,0);
		assertEquals("Drone: (0,0,1)", drone.moveBack());
	}
	
	@Test
	public void TestMoveBackWhenItsBoundary10(){
		drone = new Drone(20,20,10);
		assertEquals("Drone: (20,20,10)", drone.moveBack());
	}
	
	@Test
	public void TestMoveBackWhenItsBoundary50(){
		drone = new Drone(50,50,50);
		assertEquals("Drone: (50,50,50)", drone.moveBack());
	}
	
	@Test
	public void TestMoveForth(){
		drone = new Drone(50,50,50);
		assertEquals("Drone: (50,50,49)", drone.moveForth());
	}
	
	@Test
	public void TestMoveForthWhenItsBoundary0(){
		drone = new Drone(0,0,0);
		assertEquals("Drone: (0,0,0)", drone.moveForth());
	}
	
	@Test
	public void TestMoveForthWhenItsBoundary40(){
		drone = new Drone(35,35,40);
		assertEquals("Drone: (35,35,40)", drone.moveForth());
	}
	
	@Test
	public void TestAdvancedPath(){
		drone = new Drone(30,0,30);
		for (int i = 0; i < 10; i++) {
			drone.moveUp();
		}
		
		for (int i = 0; i < 10; i++) {
			drone.moveRight();
		}
		
		for (int i = 0; i < 40; i++) {
			drone.moveForth();
		}
		
		for (int i = 0; i < 40; i++) {
			drone.moveUp();
		}
		
		for (int i = 0; i < 40; i++) {
			drone.moveLeft();
		}
		
		for (int i = 0; i < 10; i++) {
			drone.moveDown();
		}
		
		for (int i = 0; i < 30; i++) {
			drone.moveBack();
		}
		
		assertEquals("Drone: (0,30,30)", drone.getFormatedCoordinates());
	}
	
	@Test
	public void TestCubeDrone() throws DroneException{
		FlySpace space;
		Cube outerCube = new Cube(new int[]{0,0,0},50);
		Cube innerCube = new Cube (new int[]{10,10,10},30);
		space = new FlySpace(outerCube,innerCube);
		drone = new Drone (0,0,0,space);
		
		assertNotNull(drone);
		
	}
	

}
