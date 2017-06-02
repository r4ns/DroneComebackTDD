package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Cube;


public class CubeTest {
	@Test
	public void test_CubeA(){
		//
		Cube cube = new Cube(new int [] {0,0,0}, 50);
		String expectedCoordinates = "(0,0,0),(50,50,50)";
		assertEquals(expectedCoordinates, cube.getFormatedCoordinates());
	}
}
