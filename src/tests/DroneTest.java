package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Cube;
import drone.Drone;
import drone.DroneException;
import drone.FlySpace;

public class DroneTest {
	
	@Test
	public void testCoordinatesStart(){
		Drone dron = new Drone(30,0,30);
		String ocekivano="(30,0,30)";
		assertEquals(ocekivano,dron.getFormatedCoordinates());
		
	}
	@Test
	public void testInitialMoveUp() throws DroneException
	{
		Cube outerCube = new Cube(new int[] {0,0,0}, 50);
		Cube innerCube = new Cube(new int[] {10,10,10}, 30);
		Drone dron = new Drone(30,0,30,new FlySpace(outerCube,innerCube));
		String ocekivano="(30,1,30)";

		assertEquals(ocekivano, dron.moveUp());

	}
	@Test
	public void testBoundariesMoveUp() throws DroneException
	{
		Cube outerCube = new Cube(new int[] {0,0,0}, 50);
		Cube innerCube = new Cube(new int[] {10,10,10}, 30);
		Drone dron = new Drone(30,10,30,new FlySpace(outerCube,innerCube));
		String ocekivano="(30,10,30)";

		assertEquals(ocekivano, dron.moveUp());

	}
	@Test
	public void testInitialMoveDown() throws DroneException
	{
		Cube outerCube = new Cube(new int[] {0,0,0}, 50);
		Cube innerCube = new Cube(new int[] {10,10,10}, 30);
		Drone dron = new Drone(30,1,30,new FlySpace(outerCube,innerCube));
		String ocekivano="(30,0,30)";

		assertEquals(ocekivano, dron.moveDown());

	}
	@Test
	public void testBoundariesMoveDown() throws DroneException
	{
		Cube outerCube = new Cube(new int[] {0,0,0}, 50);
		Cube innerCube = new Cube(new int[] {10,10,10}, 30);
		Drone dron = new Drone(30,0,30,new FlySpace(outerCube,innerCube));
		String ocekivano="(30,0,30)";

		assertEquals(ocekivano, dron.moveDown());

	}
	@Test
	public void testInitialMoveLeft() throws DroneException
	{
		Cube outerCube = new Cube(new int[] {0,0,0}, 50);
		Cube innerCube = new Cube(new int[] {10,10,10}, 30);
		Drone dron = new Drone(10,0,30,new FlySpace(outerCube,innerCube));
		String ocekivano="(9,0,30)";

		assertEquals(ocekivano, dron.moveLeft());

	}
	@Test
	public void testBoundariesMoveLeft() throws DroneException
	{
		Cube outerCube = new Cube(new int[] {0,0,0}, 50);
		Cube innerCube = new Cube(new int[] {10,10,10}, 30);
		Drone dron = new Drone(0,0,30,new FlySpace(outerCube,innerCube));
		String ocekivano="(0,0,30)";

		assertEquals(ocekivano, dron.moveLeft());

	}
	@Test
	public void testInitialMoveRight() throws DroneException
	{
		Cube outerCube = new Cube(new int[] {0,0,0}, 50);
		Cube innerCube = new Cube(new int[] {10,10,10}, 30);
		Drone dron = new Drone(7,0,30,new FlySpace(outerCube,innerCube));
		String ocekivano="(8,0,30)";

		assertEquals(ocekivano, dron.moveRight());

	}
	@Test
	public void testBoundariesMoveRight() throws DroneException
	{
		Cube outerCube = new Cube(new int[] {0,0,0}, 50);
		Cube innerCube = new Cube(new int[] {10,10,10}, 30);
		Drone dron = new Drone(10,9,30,new FlySpace(outerCube,innerCube));
		String ocekivano="(10,9,30)";

		assertEquals(ocekivano, dron.moveRight());

	}
	@Test
	public void testInitialMoveBack() throws DroneException
	{
		Cube outerCube = new Cube(new int[] {0,0,0}, 50);
		Cube innerCube = new Cube(new int[] {10,10,10}, 30);
		Drone dron = new Drone(8,7,10,new FlySpace(outerCube,innerCube));
		String ocekivano="(8,7,9)";

		assertEquals(ocekivano, dron.moveBack());

	}
	@Test
	public void testBoundariesMoveBack() throws DroneException
	{
		Cube outerCube = new Cube(new int[] {0,0,0}, 50);
		Cube innerCube = new Cube(new int[] {10,10,10}, 30);
		Drone dron = new Drone(8,7,0,new FlySpace(outerCube,innerCube));
		String ocekivano="(8,7,0)";

		assertEquals(ocekivano, dron.moveBack());

	}
	@Test
	public void testInitialMoveForth() throws DroneException
	{
		Cube outerCube = new Cube(new int[] {0,0,0}, 50);
		Cube innerCube = new Cube(new int[] {10,10,10}, 30);
		Drone dron = new Drone(8,7,9,new FlySpace(outerCube,innerCube));
		String ocekivano="(8,7,10)";

		assertEquals(ocekivano, dron.moveForth());

	}
	@Test
	public void testBoundariesMoveForth() throws DroneException
	{
		Cube outerCube = new Cube(new int[] {0,0,0}, 50);
		Cube innerCube = new Cube(new int[] {10,10,10}, 30);
		Drone dron = new Drone(8,7,50,new FlySpace(outerCube,innerCube));
		String ocekivano="(8,7,50)";

		assertEquals(ocekivano, dron.moveForth());

	}
	@Test(expected=DroneException.class)
	public void testDroneException1() throws DroneException
	{
		Cube outerCube = new Cube(new int[] {0,0,0}, 50);
		Cube innerCube = new Cube(new int[] {10,10,10}, 30);
		Drone dron = new Drone(50,50,55,new FlySpace(outerCube,innerCube));
		

	}
	@Test(expected=DroneException.class)
	public void testDroneException2() throws DroneException
	{
		Cube outerCube = new Cube(new int[] {0,0,0}, 50);
		Cube innerCube = new Cube(new int[] {10,10,10}, 30);
		Drone dron = new Drone(66,50,50,new FlySpace(outerCube,innerCube));
		

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
