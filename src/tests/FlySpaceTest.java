package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Cube;
import drone.Drone;
import drone.FlySpace;

public class FlySpaceTest {
	
	
	@Test
	public void test_constructorEmpty(){
		FlySpace space = new FlySpace();
		assertNotNull(space);
	}
	
	@Test
	public void test_constructorWithParameters(){
		int granice = 0;
		Cube velikaKocka = null;
		Cube malaKocka = null;
		
		FlySpace space = new FlySpace(velikaKocka,malaKocka,granice);
		assertNotNull(space);
	}

}
