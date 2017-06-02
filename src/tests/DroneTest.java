package tests;
import static org.junit.Assert.*;
import org.junit.Test;
import drone.Cube;
import drone.Drone;
import drone.DroneException;

	public class DroneTest {
		
		@Test 
		public void test_MoveUp() throws DroneException {
			Drone drone = new Drone(new Cube(new int[]{0,0,0}, 50), new Cube(new int[]{10,10,10}, 30), new int[]{0,0,0});
			drone.moveUp();
			String expected = "Drone position: (0,1,0)";
			assertEquals(expected, drone.getFormatedCoordinates());
		}
		
		@Test 
		public void test_MoveDown() throws DroneException {
			Drone drone = new Drone(new Cube(new int[]{0,0,0}, 50), new Cube(new int[]{10,10,10}, 30), new int[]{0,1,0});
			drone.moveDown();
			String expected = "Drone position: (0,0,0)";
			assertEquals(expected, drone.getFormatedCoordinates());
		}
		
		@Test 
		public void test_MoveLeft() throws DroneException {
			Drone drone = new Drone(new Cube(new int[]{0,0,0}, 50), new Cube(new int[]{10,10,10}, 30), new int[]{1,0,0});
			drone.moveLeft();
			String expected = "Drone position: (0,0,0)";
			assertEquals(expected, drone.getFormatedCoordinates());
		}
		
		@Test 
		public void test_MoveRight() throws DroneException {
			Drone drone = new Drone(new Cube(new int[]{0,0,0}, 50), new Cube(new int[]{10,10,10}, 30), new int[]{0,0,0});
			drone.moveRight();
			String expected = "Drone position: (1,0,0)";
			assertEquals(expected, drone.getFormatedCoordinates());
		}
		
		@Test 
		public void test_MoveBack() throws DroneException {
			Drone drone = new Drone(new Cube(new int[]{0,0,0}, 50), new Cube(new int[]{10,10,10}, 30), new int[]{0,0,0});
			drone.moveBack();
			String expected = "Drone position: (0,0,1)";
			assertEquals(expected, drone.getFormatedCoordinates());
		}
		
		@Test 
		public void test_MoveForth() throws DroneException {
			Drone drone = new Drone(new Cube(new int[]{0,0,0}, 50), new Cube(new int[]{10,10,10}, 30), new int[]{0,0,1});
			drone.moveForth();
			String expected = "Drone position: (0,0,0)";
			assertEquals(expected, drone.getFormatedCoordinates());
		}
	}
}
