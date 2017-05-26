package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import drone.Cube;
import drone.FlySpace;

public class FlySpaceTest {
	FlySpace fs;
	Cube vecaKocka=new Cube(new int [] {0,0,0},50);
	Cube manjaKocka=new Cube(new int [] {10,10,10},30);
	@Test
	public void testCoordinatesFlySpace(){
		fs = new FlySpace(vecaKocka,manjaKocka);
		String ocekivano="(0,0,0),(50,50,50),(10,10,10),(40,40,40)";
		assertEquals(ocekivano,fs.getFormatedCoordinates());
	}
}
