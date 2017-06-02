package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Cube;
import drone.Drone;
import drone.DroneException;
import drone.FlySpace;

public class DroneTest {
	
	@Test
	public void test_startCoordinates(){
		Drone dron = new Drone(30,30,30);
		String expected = "(30,30,30)";
		
		assertEquals(expected, dron.getFormatedCoordinates());
		
	}
	
	
	@Test
	public void testInitialMoveUp() throws DroneException
	{
		Cube outerCube = new Cube(new int[] {0,0,0}, 50);
		Cube innerCube = new Cube(new int[] {10,10,10}, 30);
		Drone dron = new Drone(30,0,30,new FlySpace(outerCube,innerCube));
		String expected="(30,1,30)";
		assertEquals(expected, dron.moveUp());

	}
	@Test
	public void testInitialMoveDown() throws DroneException
	{
		Cube outerCube = new Cube(new int[] {0,0,0}, 50);
		Cube innerCube = new Cube(new int[] {10,10,10}, 30);
		Drone dron = new Drone(30,1,30,new FlySpace(outerCube,innerCube));
		String expected="(30,0,30)";
		assertEquals(expected, dron.moveDown());

	}
	@Test
	public void testInitialMoveLeft() throws DroneException
	{
		Cube outerCube = new Cube(new int[] {0,0,0}, 50);
		Cube innerCube = new Cube(new int[] {10,10,10}, 30);
		Drone dron = new Drone(10,0,30,new FlySpace(outerCube,innerCube));
		String expected="(9,0,30)";

		assertEquals(expected, dron.moveLeft());


	}
	@Test(expected=DroneException.class)
	public void testDroneException3() throws DroneException
	{
		Cube outerCube = new Cube(new int[] {0,0,0}, 50);
		Cube innerCube = new Cube(new int[] {10,10,10}, 30);
		Drone dron = new Drone(30,30,30,new FlySpace(outerCube,innerCube));

	}
	@Test(expected=DroneException.class)
	public void testDroneException4() throws DroneException
	{
		Cube outerCube = new Cube(new int[] {0,0,0}, 50);
		Cube innerCube = new Cube(new int[] {10,10,10}, 30);
		Drone dron = new Drone(-1,-1,-1,new FlySpace(outerCube,innerCube));

	
	}

}
