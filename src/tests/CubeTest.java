package tests;

import drone.Cube;

public class CubeTest {

	@Test
	public void test_CubeConstructor() {
		Cube cube = new Cube(new int[] {30,0,30}, 10);
		assertNotNull(cube);
	}
	
}