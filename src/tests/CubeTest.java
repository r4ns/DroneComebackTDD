package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Cube;

public class CubeTest {

	/*
	@Test
	public void test_konstruktor_cube(){
		Cube cube = new Cube();
		boolean postoji;
		if (cube == null){
			postoji = false;
		}else{
			postoji = true;
		}
		
		assertTrue(postoji);
	}
	*/
	
	@Test
	public void test_konstruktor_cube()
  	{
  		Cube cube = new Cube();
  		
  		assertNotNull(cube);
  	}
	
	public void test_konstruktor_cube_sa_parametrima()
  	{
		int [] cubeStartCoordinates = null; 
		int side = 0;
  		Cube cube = new Cube(cubeStartCoordinates, side);
  		assertNotNull(cube);
  	}
	
	
}
	
	
