package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import drone.Cube;

public class CubeTest {
	@Test
	public void test_CreatingCube() {
		Cube cube = new Cube(new int[] {0, 0, 0}, 50);
		
		String expected = "startCoordinates: {0, 0, 0}, length: 50";
		
		assertEquals(expected, cube.toString());
	}
}
