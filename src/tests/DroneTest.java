package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import drone.Cube;
import drone.Drone;
import drone.FlySpace;

public class DroneTest {
	Drone drone;
	@Test
	public void TestWhenDroneIsCreated(){
		drone = new Drone(0,0,0);
		
		assertNotNull(drone);
	}
	
	@Test
	public void TestWhenDroneIsCreated2(){
		FlySpace space = new FlySpace(new Cube(new int[]{0,0,0}, 50), new Cube(new int[]{10,10,10}, 30));
		drone = new Drone(0,0,0);
		
		assertNotNull(drone);
	}
	@Test
	public void TestDroneMoveUp(){
		drone = new Drone(0,0,0);
		
		String expectedResult = "Drone position: [0, 1, 0]"; 
		assertEquals(expectedResult, drone.moveUp());
	}
	
	@Test
	public void TestDroneMoveDown(){
		drone = new Drone(0,1,0);
		
		String expectedResult = "Drone position: [0, 0, 0]"; 
		assertEquals(expectedResult, drone.moveDown());
	}
	
	@Test
	public void TestDroneMoveLeft(){
		drone = new Drone(1,1,0);
		
		String expectedResult = "Drone position: [0, 1, 0]"; 
		assertEquals(expectedResult, drone.moveLeft());
	}
	
	@Test
	public void TestDroneMoveRight(){
		drone = new Drone(1,1,0);
		
		String expectedResult = "Drone position: [2, 1, 0]"; 
		assertEquals(expectedResult, drone.moveRight());
	}
	
	@Test
	public void TestDroneMoveBack(){
		drone = new Drone(2,1,0);
		
		String expectedResult = "Drone position: [2, 1, 1]"; 
		assertEquals(expectedResult, drone.moveBack());
	}
	
	@Test
	public void TestDroneMoveForth(){
		drone = new Drone(2,1,1);
		
		String expectedResult = "Drone position: [2, 1, 0]"; 
		assertEquals(expectedResult, drone.moveForth());
	}
	
	@Test
	public void TestDroneMoveUpOuterBoundary(){
		drone = new Drone(0,50,1);
		
		String expectedResult = "Drone can't move up"; 
		assertEquals(expectedResult, drone.moveUp());
	}
	@Test
	public void TestDroneMoveDownOuterBoundary(){
		drone = new Drone(0,0,1);
		
		String expectedResult = "Drone can't move down"; 
		assertEquals(expectedResult, drone.moveDown());
	}
	@Test
	public void TestDroneMoveLeftOuterBoundary(){
		drone = new Drone(0,0,1);
		
		String expectedResult = "Drone can't move left"; 
		assertEquals(expectedResult, drone.moveLeft());
	}
	@Test
	public void TestDroneMoveRightOuterBoundary(){
		drone = new Drone(50,0,50);
		
		String expectedResult = "Drone can't move right"; 
		assertEquals(expectedResult, drone.moveRight());
	}
	
	@Test
	public void TestDroneMoveBackOuterBoundary(){
		drone = new Drone(50,50,50);
		
		String expectedResult = "Drone can't move back"; 
		assertEquals(expectedResult, drone.moveBack());
	}
	
	@Test
	public void TestDroneMoveForthOuterBoundary(){
		drone = new Drone(50,50,0);
		
		String expectedResult = "Drone can't move forth"; 
		assertEquals(expectedResult, drone.moveForth());
	}
	
	@Test 
	public void TestDroneMoveUpInnerBoundary(){
		drone = new Drone(11, 10, 11);
		
		String expectedResult = "Drone can't move up";
		assertEquals(expectedResult, drone.moveUp());
	}
	
	@Test 
	public void TestDroneMoveDownInnerBoundary(){
		drone = new Drone(11, 40, 11);
		
		String expectedResult = "Drone can't move down";
		assertEquals(expectedResult, drone.moveDown());
	}
	
	@Test 
	public void TestDroneMoveLeftInnerBoundary(){
		drone = new Drone(40, 11, 11);
		
		String expectedResult = "Drone can't move left";
		assertEquals(expectedResult, drone.moveLeft());
	}
	
	@Test 
	public void TestDroneMoveRightInnerBoundary(){
		drone = new Drone(10, 11, 11);
		
		String expectedResult = "Drone can't move right";
		assertEquals(expectedResult, drone.moveRight());
	}
	@Test 
	public void TestDroneMoveBackInnerBoundary(){
		drone = new Drone(11,20, 40);
		
		String expectedResult = "Drone can't move back";
		assertEquals(expectedResult, drone.moveBack());
	}
	@Test 
	public void TestDroneMoveForthInnerBoundary(){
		drone = new Drone(11,20, 10);
		
		String expectedResult = "Drone can't move forth";
		assertEquals(expectedResult, drone.moveForth());
	}
	
	@Test 
	public void TestDroneAdvancedPath(){
		drone = new Drone(30,0,30);
		advancedHelper(drone);
		String expectedResult = "Drone position: [0, 30, 30]";
		assertEquals(expectedResult, drone.getFormatedCoordinates());
	}
	
	private void advancedHelper(Drone drone){
		for (int i = 0; i < 12; i++)
			drone.moveUp();
		for (int i = 0; i < 21; i++)
			drone.moveRight();
		for (int i = 0; i < 23; i++)
			drone.moveRight();
		for (int i = 0; i < 16; i++)
			drone.moveForth();
		for (int i = 0; i < 12; i++)
			drone.moveLeft();
		for (int i = 0; i < 5; i++)
			drone.moveForth();
		for (int i = 0; i < 18; i++)
			drone.moveLeft();
		for (int i = 0; i < 17; i++)
			drone.moveUp();
		for (int i = 0; i < 21; i++)
			drone.moveBack();
		for (int i = 0; i < 22; i++)
			drone.moveLeft();
		for (int i = 0; i < 20; i++)
			drone.moveDown();
	}
}
