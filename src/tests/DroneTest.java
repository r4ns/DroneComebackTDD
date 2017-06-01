package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import drone.Cube;
import drone.Drone;
import drone.DroneException;
import drone.FlySpace;


public class DroneTest {
	@Test
	public void testDronInit() throws DroneException{
		int pocetne[] = {30,0,30};
		Drone d = new Drone(pocetne);
		assertEquals(d.getFormatedCoordinates(), "(30,0,30)");
	}
	
	
 	@Test
 	public void testInitialMoveUp() throws DroneException
 	{
 		int pocetne[] = {30,0,30};
 		Cube outerCube = new Cube(new int[] {0,0,0}, 50);
 		Cube innerCube = new Cube(new int[] {10,10,10}, 30);
 		Drone dron = new Drone(pocetne ,new FlySpace(innerCube,outerCube));
 		String ex="(30,1,30)";
 
 		assertEquals(ex, dron.moveUp());
 
 	}
 	@Test
 	public void testBoundariesMoveUp() throws DroneException
 	{
 		int pocetne[] = {30,10,30};
 		Cube outerCube = new Cube(new int[] {0,0,0}, 50);
 		Cube innerCube = new Cube(new int[] {10,10,10}, 30);
 		Drone dron = new Drone(pocetne, new FlySpace(innerCube,outerCube));
 		String ex="(30,10,30)";
 
 		assertEquals(ex, dron.moveUp());
 
 	}
 	@Test
 	public void testInitialMoveDown() throws DroneException
 	{
 		int pocetne[] = {30,1,30};
 		Cube outerCube = new Cube(new int[] {0,0,0}, 50);
 		Cube innerCube = new Cube(new int[] {10,10,10}, 30);
 		Drone dron = new Drone(pocetne,new FlySpace(innerCube,outerCube));
 		String ex="(30,0,30)";
 
 		assertEquals(ex, dron.moveDown());
 
 	}
 	@Test
 	public void testBoundariesMoveDown() throws DroneException
 	{
 		int pocetne[] = {30,0,30};
 		Cube outerCube = new Cube(new int[] {0,0,0}, 50);
 		Cube innerCube = new Cube(new int[] {10,10,10}, 30);
 		Drone dron = new Drone(pocetne,new FlySpace(innerCube,outerCube));
 		String ex="(30,0,30)";
 
 		assertEquals(ex, dron.moveDown());
 
 	}
 	@Test
 	public void testInitialMoveLeft() throws DroneException
 	{
 		int pocetne[] = {8,0,30};
 		Cube outerCube = new Cube(new int[] {0,0,0}, 50);
 		Cube innerCube = new Cube(new int[] {10,10,10}, 30);
 		Drone dron = new Drone(pocetne,new FlySpace(innerCube,outerCube));
 		String ex="(7,0,30)";
 
 		assertEquals(ex, dron.moveLeft());
 
 	}
 	@Test
 	public void testBoundariesMoveLeft() throws DroneException
 	{
 		int pocetne[] = {0,31,30};
 		Cube outerCube = new Cube(new int[] {0,0,0}, 50);
 		Cube innerCube = new Cube(new int[] {10,10,10}, 30);
 		Drone dron = new Drone(pocetne,new FlySpace(innerCube,outerCube));
 		String ex="(0,31,30)";
 
 		assertEquals(ex, dron.moveLeft());
 
 	}
 	@Test
 	public void testInitialMoveRight() throws DroneException
 	{
 		int pocetne[] = {5,1,30};
 		Cube outerCube = new Cube(new int[] {0,0,0}, 50);
 		Cube innerCube = new Cube(new int[] {10,10,10}, 30);
 		Drone dron = new Drone(pocetne,new FlySpace(innerCube,outerCube));
 		String ex="(6,1,30)";
 
 		assertEquals(ex, dron.moveRight());
 
 	}
 	@Test
 	public void testBoundariesMoveRight() throws DroneException
 	{
 		int pocetne[] = {10,30,30};
 		Cube outerCube = new Cube(new int[] {0,0,0}, 50);
 		Cube innerCube = new Cube(new int[] {10,10,10}, 30);
 		Drone dron = new Drone(pocetne,new FlySpace(innerCube,outerCube));
 		String ex="(10,30,30)";
 
 		assertEquals(ex, dron.moveRight());
 
 	}
 	@Test
 	public void testInitialMoveBack() throws DroneException
 	{
 		int pocetne[] = {8,8,8};
 		Cube outerCube = new Cube(new int[] {0,0,0}, 50);
 		Cube innerCube = new Cube(new int[] {10,10,10}, 30);
 		Drone dron = new Drone(pocetne,new FlySpace(innerCube,outerCube));
 		String ex="(8,8,9)";
 
 		assertEquals(ex, dron.moveBack());
 
 	}
 	@Test
 	public void testBoundariesMoveBack() throws DroneException
 	{
 		int pocetne[] = {30,30,10};
 		Cube outerCube = new Cube(new int[] {0,0,0}, 50);
 		Cube innerCube = new Cube(new int[] {10,10,10}, 30);
 		Drone dron = new Drone(pocetne,new FlySpace(innerCube,outerCube));
 		String ex="(30,30,10)";
 
 		assertEquals(ex, dron.moveBack());
 
 	}
 	@Test
 	public void testInitialMoveForth() throws DroneException
 	{
 		int pocetne[] = {6,6,6};
 		Cube outerCube = new Cube(new int[] {0,0,0}, 50);
 		Cube innerCube = new Cube(new int[] {10,10,10}, 30);
 		Drone dron = new Drone(pocetne,new FlySpace(innerCube,outerCube));
 		String ex="(6,6,5)";
 
 		assertEquals(ex, dron.moveForth());
 
 	}
 	@Test
 	public void testBoundariesMoveForth() throws DroneException
 	{
 		int pocetne[] = {6,6,0};
 		Cube outerCube = new Cube(new int[] {0,0,0}, 50);
 		Cube innerCube = new Cube(new int[] {10,10,10}, 30);
 		Drone dron = new Drone(pocetne,new FlySpace(innerCube,outerCube));
 		String ex="(6,6,0)";
 
 		assertEquals(ex, dron.moveForth());
 
 	}
 	@Test(expected=DroneException.class)
 	public void testDroneException1() throws DroneException
 	{
 		int pocetne[] = {77,6,6};
 		Cube outerCube = new Cube(new int[] {0,0,0}, 50);
 		Cube innerCube = new Cube(new int[] {10,10,10}, 30);
 		Drone dron = new Drone(pocetne,new FlySpace(innerCube,outerCube));
 		
 
 	}
	
}
