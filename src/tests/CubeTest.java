package tests;

import org.junit.Test;
import static org.junit.Assert.*;

import drone.Cube;

public class CubeTest {
	
	@Test
	public void TestWhenCubeIsCreated(){
		Cube cube = new Cube(new int[]{0,0,0},50);
		
		assertNotNull(cube);
	}
	
	@Test
	public void TestToString(){
		Cube cube = new Cube(new int[]{0,0,0},50);
		
		assertEquals("Start coordinates:({0, 0, 0}, 50)", cube.toString());
	}

}
