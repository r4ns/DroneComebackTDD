package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Cube;

public class CubeTest {
	
	@Test
	public void boundariesTest(){
		
		Cube cube = new Cube(new int[] {0,0,0},50);
		String startCoordinates = "Cube position: " + "(0,0,0)" + " length: 50";
		assertEquals(startCoordinates,cube.toString());
		
	}
	
	@Test
	public void allBoundaries(){
		
		Cube cubeOut = new Cube(new int[] {0,0,0},50);
		Cube cubeIn = new Cube(new int[] {10,10,10},30);
		assertTrue(cubeOut.checkIn(cubeIn));
	}
	
	
	
	

}
