package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Cube;
import drone.Drone;
import drone.FlySpace;

public class FlySpaceTest {
	Drone drone;
	FlySpace space;
	Cube cube;
	
	@Test
	public void testForConstructor(){
		Cube oc = new Cube(new int[] {0,0,0}, 50);
		Cube ic = new Cube(new int[] {10,10,10}, 30);
		FlySpace fs = new FlySpace(oc, ic);
		assertNotNull(fs);
	}

}
