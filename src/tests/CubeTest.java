package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import drone.Cube;

public class CubeTest {

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
}
