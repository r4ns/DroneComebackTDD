package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Cube;
import drone.Drone;

public class DroneTest {
	
	@Test
	public void test_konstruktor_dron(){
		Drone dron = new Drone(new Cube(new int[]{0, 0, 0}, 50), new Cube(new int[]{10, 10, 10}, 30), new int[]{30, 0, 30});
		boolean postoji;
		if (dron == null){
			postoji = false;
		}else{
			postoji = true;
		}
		
		assertTrue(postoji);
	}
	
	
	 @Test
	 public void test_moveUp(){
		 Drone drone = new Drone(new Cube(new int[]{0, 0, 0}, 50), new Cube(new int[]{10, 10, 10}, 30), new int[]{30, 0, 30});
		 assertEquals("Failed", "Drone position: (30, 1, 30)", drone.moveUp());
	 }
	 
	 @Test
	 public void test_moveDown(){
		 Drone drone = new Drone(new Cube(new int[]{0, 0, 0}, 50), new Cube(new int[]{10, 10, 10}, 30), new int[]{30, 0, 30});
		 assertEquals("Failed", "Drone position: (30, 0, 30)", drone.moveDown());
	 }
	 
	 @Test
	 public void test_moveLeft(){
		 Drone drone = new Drone(new Cube(new int[]{0, 0, 0}, 50), new Cube(new int[]{10, 10, 10}, 30), new int[]{30, 0, 30});
		 assertEquals("Failed", "Drone position: (29, 0, 30)", drone.moveLeft());
	 }
	 
	 @Test
	 public void test_moveRight(){
		 Drone drone = new Drone(new Cube(new int[]{0, 0, 0}, 50), new Cube(new int[]{10, 10, 10}, 30), new int[]{30, 0, 30});
		 assertEquals("Failed", "Drone position: (31, 0, 30)", drone.moveRight());
	 }
	 
	 @Test
	 public void test_moveBack(){
		 Drone drone = new Drone(new Cube(new int[]{0, 0, 0}, 50), new Cube(new int[]{10, 10, 10}, 30), new int[]{30, 0, 30});
		 assertEquals("Failed", "Drone position: (30, 0, 31)", drone.moveBack());
	 }
	 
	 @Test
	 public void test_moveForth(){
		 Drone drone = new Drone(new Cube(new int[]{0, 0, 0}, 50), new Cube(new int[]{10, 10, 10}, 30), new int[]{30, 0, 30});
		 assertEquals("Failed", "Drone position: (30, 0, 29)", drone.moveForth());
	 }
}
