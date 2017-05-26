package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Cube;
import drone.FlySpace;


public class FlySpaceTest {
	
	@Test
	public void TestWhenFlySpaceIsCreated(){
		FlySpace space = new FlySpace(new Cube(new int[] {0,0,0},50));
		
		assertNotNull(space);
	}
	
	@Test
	public void TestToString(){
		FlySpace space = new FlySpace(new Cube(new int[]{0,0,0},50)) ;
		
		assertEquals("Start coordinates:({0, 0, 0}, 50)", space.toString());
	}
	
}
