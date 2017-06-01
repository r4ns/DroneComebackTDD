package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Cube;
import drone.FlySpace;

public class FlySpaceTest {
	@Test
	public void test_FlySpace(){
		Cube big = new Cube(new int [] {0,0,0}, 50);
		Cube small = new Cube(new int [] {10,10,10}, 30);
		FlySpace fs = new FlySpace(big, small);
		String expectedOutput = "(0,0,0),(50,50,50);(10,10,10),(40,40,40)";
		assertEquals(expectedOutput, fs.getFormatedCoordinates());
	}
}
