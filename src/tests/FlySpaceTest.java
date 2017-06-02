package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Cube;
import drone.FlySpace;

public class FlySpaceTest {
	public FlySpaceTest(int[] maxCoordinates, int[] maxCoordinates2) {
		// TODO Auto-generated constructor stub
	}
		 
		 
	@Test
	public void test_konstruktor_flyspace(){
		FlySpace fs = new FlySpace();
		assertNotNull(fs);
	}
	
	@Test 
	public void test_konstruktor_sa_parametrima()
	{
		Cube outerBoundaries = new Cube();
		Cube innerBoundaries = new Cube();
		FlySpace fs= new FlySpace(outerBoundaries, innerBoundaries);
		assertNotNull(fs);
	}
}
