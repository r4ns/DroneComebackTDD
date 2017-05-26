package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Cube;
import drone.Drone;
import drone.FlySpace;

public class DroneTest {
	Drone drone;
	FlySpace space;
	Cube cube;
	
	@Test
	public void testStringMoveUp(){
		Drone dron = new Drone(new int[] {0,2,0});
		dron.moveUp();
		assertNotNull(dron);
	}
	
	@Test
	public void testStringMoveDown(){
		Drone dron = new Drone(new int[] {0,2,0});
		dron.moveDown();
		assertNotNull(dron);
	}
	
	@Test
	public void testStringMoveLeft(){
		Drone dron = new Drone(new int[] {2,0,0});
		dron.moveLeft();
		assertNotNull(dron);
	}
	
	@Test
	public void testStringMoveRight(){
		Drone dron = new Drone(new int[] {2,0,0});
		dron.moveRight();
		assertNotNull(dron);
	}
	@Test
	public void testStringMoveForth(){
		Drone dron = new Drone(new int[] {0,0,2});
		dron.moveForth();
		assertNotNull(dron);
	}
	@Test
	public void testStringMoveBack(){
		Drone dron = new Drone(new int[] {0,0,2});
		dron.moveBack();
		assertNotNull(dron);
	}
	@Test 
	public void testingFlyingUp(){
		Drone dron = new Drone(new int[] {30,0,30});
		
	}
	
}
