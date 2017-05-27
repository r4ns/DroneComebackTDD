package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import drone.Cube;
import drone.Drone;

public class CubeTest {
	Cube kocka;
	@Test
	public void testCoordinatesFlySpace(){
		kocka = new Cube(new int [] {0,0,0},50);
		String ocekivano="(0,0,0),(50,50,50)";
		assertEquals(ocekivano,kocka.getFormatedCoordinates());
	}
	
}
