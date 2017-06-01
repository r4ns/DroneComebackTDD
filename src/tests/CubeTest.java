package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Cube;
import drone.DroneException;

public class CubeTest {
	
	@Test
	public void test_konstruktor_cube(){
  		Cube cube = new Cube();
  		
  		assertNotNull(cube);
  	}
	
	@Test
	public void test_konstruktor_cube_sa_parametrima()
  	{
		int [] cubeStartCoordinates = null; 
		int side = 0;
  		Cube cube = new Cube(cubeStartCoordinates, side);
  		assertNotNull(cube);
  	}

}
