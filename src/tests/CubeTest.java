package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Cube;

public class CubeTest {
	
	@Test
	public void testConstructorEmpty()
	{
		Cube cube = new Cube();
		
		assertNotNull(cube);
	}
	
	@Test
	public void testConstructorWithParameters()
	{
		int x = 0;
		int y = 0;
		int z = 0;
		Cube cube = new Cube(x,y,z);
		assertNotNull(cube);
				
	
	}

}
