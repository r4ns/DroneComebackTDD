package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Cube;
import drone.Drone;
import drone.FlySpace;

public class DroneTest {
	
	@Test
	public void testCoordinatesStart(){
		Drone dron = new Drone(30,0,30);
		String ocekivano="(30,0,30)";
		assertEquals(ocekivano,dron.getFormatedCoordinates());
		
	}
	@Test
	public void testInitialMoveUp()
	{
		Cube outerCube = new Cube(new int[] {0,0,0}, 50);
		Cube innerCube = new Cube(new int[] {10,10,10}, 30);
		Drone dron = new Drone(30,0,30,new FlySpace(outerCube,innerCube));
		String ocekivano="(30,1,30)";

		assertEquals(ocekivano, dron.moveUp());

	}
	@Test
	public void testInitialMoveDown()
	{
		Cube outerCube = new Cube(new int[] {0,0,0}, 50);
		Cube innerCube = new Cube(new int[] {10,10,10}, 30);
		Drone dron = new Drone(30,1,30,new FlySpace(outerCube,innerCube));
		String ocekivano="(30,0,30)";

		assertEquals(ocekivano, dron.moveDown());

	}
	@Test
	public void testInitialMoveLeft()
	{
		Cube outerCube = new Cube(new int[] {0,0,0}, 50);
		Cube innerCube = new Cube(new int[] {10,10,10}, 30);
		Drone dron = new Drone(10,0,30,new FlySpace(outerCube,innerCube));
		String ocekivano="(9,0,30)";

		assertEquals(ocekivano, dron.moveLeft());

	}
	@Test
	public void testInitialMoveRight()
	{
		Cube outerCube = new Cube(new int[] {0,0,0}, 50);
		Cube innerCube = new Cube(new int[] {10,10,10}, 30);
		Drone dron = new Drone(7,0,30,new FlySpace(outerCube,innerCube));
		String ocekivano="(8,0,30)";

		assertEquals(ocekivano, dron.moveRight());

	}
	@Test
	public void testInitialMoveBack()
	{
		Cube outerCube = new Cube(new int[] {0,0,0}, 50);
		Cube innerCube = new Cube(new int[] {10,10,10}, 30);
		Drone dron = new Drone(8,7,30,new FlySpace(outerCube,innerCube));
		String ocekivano="(8,6,30)";

		assertEquals(ocekivano, dron.moveRight());

	}
}
