package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Cube;
import drone.FlySpace;

public class FlySpaceTest {
	
	@Test
	public void test_CreatingFlySpace() {
		FlySpace space = new FlySpace(new Cube(new int[] {0, 0, 0}, 50), new Cube(new int[] {10, 10, 10}, 30));
		
		String expected = "startCoordinates: {0, 0, 0}, length: 50, startCoordinates: {10, 10, 10}, length: 30";
		
		assertEquals(expected, space.toString());
	}
}