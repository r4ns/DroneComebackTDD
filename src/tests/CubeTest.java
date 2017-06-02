package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Cube;

public class CubeTest {

	@Test
	public void testOutCube(){
		
		Cube out=new Cube(new int[] {0,0,0},50);
		String excpected="Cube position: (0,0,0), length: 50";
		assertEquals(excpected,out.toString());
		
	}
	
	
	@Test
	public void testCubes(){
		
		Cube spoljasnja=new Cube(new int[] {0,0,0},50);
		Cube unutrasnja=new Cube(new int[] {10,10,10},30);
		assertTrue(unutrasnja.isInsideCube(spoljasnja));
		
	}
}