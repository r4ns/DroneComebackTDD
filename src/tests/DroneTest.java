package tests;

import static org.junit.Assert.*;


import org.junit.Test;

import drone.Drone;

public class DroneTest {
	
	private int [] boundaries={50,50,50};
	private int [] startCoordinates = {30,0,30};
	
	@Test 
	public void konstruktorBezParamaterimaTest()
	{
		Drone drone = new Drone();
		assertNotNull(drone);
	}

	@Test
	public void konstruktorSaParametrima()
	{
		int [] boundaries=null;
		int [] startCoordinates=null;
		Drone drone = new Drone (startCoordinates,boundaries);
		assertNotNull(drone);
	}
	
	@Test 
	public void initialMoveUpTest()
	{
		Drone drone = new Drone (startCoordinates, boundaries);
		
		String expectedCoordinates="Dron position:(" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(startCoordinates[1]+1) +
				"," + Integer.toString(startCoordinates[2])+")";
		assertEquals(expectedCoordinates, drone.moveUp());
	}
	
	@Test 
	public void testMoveUpHitBottomInnerSquareBorder()
	{
		Drone drone = new Drone(startCoordinates, boundaries);
		startCoordinates[1]=10;
		String expectedCoordinates="Dron position:(" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(10)+
				"," + Integer.toString(startCoordinates[2])+")";
		assertEquals(expectedCoordinates, drone.moveUp());
	}
	
	@Test 
	public void  testMoveUpHitTopOuter()
	{
		Drone drone = new Drone (startCoordinates, boundaries);
		startCoordinates[1]=50;
		String expectedCoordinates="Dron position:(" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(50) + "," + 
		Integer.toString(startCoordinates[2])+")";
		assertEquals(expectedCoordinates, drone.moveUp());
	}
	@Test 
	public void initialMoveDown()
	{
		Drone drone = new Drone(startCoordinates, boundaries);
		startCoordinates[1]=50;
		
		String expectedCoordinates="Dron position:(" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(startCoordinates[1]-1) +
				"," + Integer.toString(startCoordinates[2])+")";
		
		assertEquals(expectedCoordinates, drone.moveDown());
		
	}
	
	@Test
	public void testMoveDownBreakBottomBorderOuterSquare()
	{
		Drone drone = new Drone(startCoordinates, boundaries);
		String expectedCoordinates="Dron position:(" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(startCoordinates[1]) +
				"," + Integer.toString(startCoordinates[2])+")";
		assertEquals(expectedCoordinates, drone.moveDown());
		
	}
	
	@Test 
	public void  testMoveDownHitTopInner()
	{
		startCoordinates[1]=40;
		Drone drone = new Drone(startCoordinates, boundaries);
		String expectedCoordinates="Dron position:(" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(startCoordinates[1]) +
				"," + Integer.toString(startCoordinates[2])+")";
		assertEquals(expectedCoordinates, drone.moveDown());
		
	}
	
	@Test
	public void testInitialMoveRight()
	{
		
		Drone drone = new Drone(startCoordinates, boundaries);
		String expectedCoordinates= "Dron position:(" + Integer.toString(startCoordinates[0]+1) + "," + Integer.toString(startCoordinates[1]) +
						"," + Integer.toString(startCoordinates[2])+")";
	    assertEquals(expectedCoordinates, drone.moveRight());
	}
	
	@Test
	public void testMoveRightHitRightSideOterSquare()
	{
		startCoordinates[0]=50;
		Drone drone = new Drone(startCoordinates, boundaries);
		String expectedCoordinates= "Dron position:(" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(startCoordinates[1]) +
						"," + Integer.toString(startCoordinates[2])+")";
	    assertEquals(expectedCoordinates, drone.moveRight());
		
	}
	
	@Test
	public void testMoveRightBreakLeftSideInnerSquer()
	{
		startCoordinates[0]=10;
		startCoordinates[1]=30;
		Drone drone = new Drone(startCoordinates, boundaries);
		String expectedCoordinates= "Dron position:(" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(startCoordinates[1]) +
						"," + Integer.toString(startCoordinates[2])+")";
	    assertEquals(expectedCoordinates, drone.moveRight());
	}
	
	@Test
	public void testInitialMoveLeft()
	{
		Drone drone = new Drone(startCoordinates, boundaries);
		String expectedCoordinates= "Dron position:(" + Integer.toString(startCoordinates[0]-1) + "," + Integer.toString(startCoordinates[1]) +
				"," + Integer.toString(startCoordinates[2])+")";
		assertEquals(expectedCoordinates, drone.moveLeft());
							
	}
	
	@Test
	public void testMoveLeftHitRightSideInnerSquare()
	{
		startCoordinates[0]=40;
		startCoordinates[1]=30;
		Drone drone = new Drone(startCoordinates, boundaries);
		String expectedCoordinates= "Dron position:(" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(startCoordinates[1]) +
				"," + Integer.toString(startCoordinates[2])+")";
		assertEquals(expectedCoordinates, drone.moveLeft());
	}
	
	@Test
	public void testMoveLeftHitLeftSideOutterSquare()
	{
		startCoordinates[0]=0;
		startCoordinates[1]=30;
		Drone drone = new Drone(startCoordinates, boundaries);
		String expectedCoordinates= "Dron position:(" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(startCoordinates[1]) +
				"," + Integer.toString(startCoordinates[2])+")";
		assertEquals(expectedCoordinates, drone.moveLeft());
	}
	 
	@Test
	public void testInitialMoveBack()
	{
		
		Drone drone = new Drone(startCoordinates, boundaries);
		String expectedCoordinates= "Dron position:(" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(startCoordinates[1]) +
				"," + Integer.toString(startCoordinates[2]-1)+")";
		assertEquals(expectedCoordinates, drone.moveBack());
	}
	
	@Test
	public void  testMoveBackHitBackOuterrSquare()
	{
		startCoordinates[2]=0;
		startCoordinates[1]=30;
		Drone drone = new Drone(startCoordinates, boundaries);
		String expectedCoordinates= "Dron position:(" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(startCoordinates[1]) +
				"," + Integer.toString(startCoordinates[2])+")";
		assertEquals(expectedCoordinates, drone.moveBack());
	}
	
	@Test
	public void testMoveBackHitFrontSideInnerSquare()
	{
		startCoordinates[2]=40;
		startCoordinates[1]=30;
		Drone drone = new Drone(startCoordinates, boundaries);
		String expectedCoordinates= "Dron position:(" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(startCoordinates[1]) +
				"," + Integer.toString(startCoordinates[2])+")";
		assertEquals(expectedCoordinates, drone.moveBack());
	}
	
	@Test
	public void initialMoveForth()
	{
		Drone drone = new Drone(startCoordinates, boundaries);
		String expectedCoordinates= "Dron position:(" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(startCoordinates[1]) +
				"," + Integer.toString(startCoordinates[2]+1)+")";
		assertEquals(expectedCoordinates, drone.moveForth());
	}
	
	@Test
	public void testMoveForthHitFrontSidekOuterrSquare()
	{
		startCoordinates[1]=30;
		startCoordinates[2]=50;
		Drone drone = new Drone(startCoordinates, boundaries);
		String expectedCoordinates= "Dron position:(" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(startCoordinates[1]) +
				"," + Integer.toString(startCoordinates[2])+")";
		assertEquals(expectedCoordinates, drone.moveForth());
	}
	
	@Test
	public void testMoveForthHitBackSideInnerSquare()
	{
		startCoordinates[1]=30;
		startCoordinates[2]=10;
		Drone drone = new Drone(startCoordinates, boundaries);
		String expectedCoordinates= "Dron position:(" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(startCoordinates[1]) +
				"," + Integer.toString(startCoordinates[2])+")";
		assertEquals(expectedCoordinates, drone.moveForth());
	}
}