package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Cube;
import drone.FlySpace;

public class FlySpaceTest {
		 
		 
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