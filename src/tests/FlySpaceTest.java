package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Cube;
import drone.FlySpace;

public class FlySpaceTest {
	@Test
	public void test_initialFlySpace() {
		FlySpace fly = new FlySpace(new Cube(new int []{0,0,0}, 50), new Cube(new int []{10,10,10}, 30));
		String ex= "(0,0,0) --> (50,50,50) : (10,10,10) --> (40,40,40)";
		assertEquals(ex, "" + fly.getFormatedCoordinates());
		
	}
	
}
