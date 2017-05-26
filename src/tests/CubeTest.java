package tests;

import org.junit.Test;
import static org.junit.Assert.*;
import drone.Cube;
import drone.FlySpace;

public class CubeTest {

	@Test
	public void CubeConstructor(){
		Cube cube = new Cube(new int[] {10,10,10},10);
		
		assertNotNull(cube);
	}
	
	
}
