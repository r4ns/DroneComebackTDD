package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Cube;
import drone.Drone;
import drone.DroneException;
import drone.FlySpace;

public class DroneTest {
	
	Cube big = new Cube(new int[]{0,0,0}, 50);
	Cube small = new Cube(new int[]{10,10,10},30);
	
	@Test
	public void test_Initialization(){
		
		Drone drone = new Drone(30,0,30);
		
		String expectedCoordinates = "(30,0,30)";
		
		assertEquals(expectedCoordinates, drone.getFormatedCoordinates());
	}
	@Test(expected=DroneException.class)
	public void testDroneException1() throws DroneException
	{
		Drone drone = new Drone(50,50,60,new FlySpace(big, small));
	}
	@Test(expected=DroneException.class)
	public void testDroneException2() throws DroneException
	{
		Drone drone = new Drone(60,50,50,new FlySpace(big, small));
	}
	@Test(expected=DroneException.class)
	public void testDroneException3() throws DroneException
	{
		Drone drone = new Drone(50,60,50,new FlySpace(big, small));
	}
	@Test(expected=DroneException.class)
	public void testDroneException4() throws DroneException
	{
		Drone drone = new Drone(-2,20,10,new FlySpace(big, small));
	}
	@Test(expected=DroneException.class)
	public void testDroneException5() throws DroneException
	{
		Drone drone = new Drone(35,35,35,new FlySpace(big, small));
	}
	@Test
	public void test_Initial_MoveUp() throws DroneException{

		Drone drone = new Drone(30,0,30, new FlySpace(big, small));
		
		String expectedCoordinates = "(30,1,30)";
		
		assertEquals(expectedCoordinates, drone.moveUp());
	}
	@Test
	public void test_DroneHitsTheCube_MoveUp() throws DroneException{
		
		Drone drone = new Drone(30,10,30, new FlySpace(big, small));
		String expectedCoordinates = "(30,10,30)";
		assertEquals(expectedCoordinates, drone.moveUp());
	}
	@Test
	public void test_Initial_MoveDown() throws DroneException{
		Drone drone = new Drone(30,1,30, new FlySpace(big, small));
		String expectedCoordinates = "(30,0,30)";
		assertEquals(expectedCoordinates, drone.moveDown());
	}
	@Test
	public void test_DroneHitsTheCube_MoveDown() throws DroneException{
		Drone drone = new Drone(30,0,30, new FlySpace(big, small));
		String expectedCoordinates = "(30,0,30)";
		assertEquals(expectedCoordinates, drone.moveDown());
	}
	@Test
	public void test_Initial_MoveRight() throws DroneException{
		Drone drone = new Drone(0,0,0, new FlySpace(big, small));
		String expectedCoordinates = "(1,0,0)";
		assertEquals(expectedCoordinates, drone.moveRight());
	}
	@Test
	public void test_DroneHitsTheCUbe_MoveRight() throws DroneException{
		Drone drone = new Drone(50,40,20,new FlySpace(big, small));
		String expectedCoordinates = "(50,40,20)";
		assertEquals(expectedCoordinates, drone.moveRight());
	}
	@Test
	public void test_Initial_MoveLeft() throws DroneException{
		Drone drone = new Drone(1,0,0, new FlySpace(big, small));
		String expectedCoordinates = "(0,0,0)";
		assertEquals(expectedCoordinates, drone.moveLeft());
	}
	@Test
	public void test_DroneHitsTheCUbe_MoveLeft() throws DroneException{
		Drone drone = new Drone(0,40,20,new FlySpace(big, small));
		String expectedCoordinates = "(0,40,20)";
		assertEquals(expectedCoordinates, drone.moveLeft());
	}
	@Test
	public void test_Initial_MoveBack() throws DroneException{
		Drone drone = new Drone(1,0,1, new FlySpace(big, small));
		String expectedCoordinates = "(1,0,0)";
		assertEquals(expectedCoordinates, drone.moveBack());
	}
	@Test
	public void test_DroneHitsTheCUbe_MoveBack() throws DroneException{
		Drone drone = new Drone(0,40,0,new FlySpace(big, small));
		String expectedCoordinates = "(0,40,0)";
		assertEquals(expectedCoordinates, drone.moveBack());
	}
	@Test
	public void test_Initial_MoveForth() throws DroneException{
		Drone drone = new Drone(1,0,1, new FlySpace(big, small));
		String expectedCoordinates = "(1,0,2)";
		assertEquals(expectedCoordinates, drone.moveForth());
	}
	@Test
	public void test_DroneHitsTheCUbe_MoveForth() throws DroneException{
		Drone drone = new Drone(0,40,50,new FlySpace(big, small));
		String expectedCoordinates = "(0,40,50)";
		assertEquals(expectedCoordinates, drone.moveForth());
	}
	
}
