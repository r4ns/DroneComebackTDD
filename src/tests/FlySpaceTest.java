package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Cube;
import drone.FlySpace;

public class FlySpaceTest {
	@Test
	public void TestFlySpaceInstantiated(){
		Cube outerCube = new Cube(new int[]{0,0,0},50);
		Cube innerCube = new Cube(new int[]{10,10,10},30);
		FlySpace space = new FlySpace(outerCube,innerCube);
		
		assertNotNull(space);
	}
	
}
