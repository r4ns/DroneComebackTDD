package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Cube;

public class CubeTest {

	@Test
	public void testCubeOut(){
		Cube out=new Cube(new int[] {0,0,0},50);
		
		String expected="Cube position: (0,0,0), length: 50";
		
		assertEquals(expected,out.toString());
	}
	
	@Test
	public void testCubesInAndOut(){
		Cube spolj=new Cube(new int[] {0,0,0},50);
		Cube unut=new Cube(new int[] {10,10,10},30);
		assertTrue(unut.isInsideCube(spolj));
	}
}
