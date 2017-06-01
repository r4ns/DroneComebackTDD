package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import drone.Cube;
import drone.FlySpace;

public class FlySpaceTest {
	
	@Test
	public void testFlySpaceInit(){
		int koorA[] = {0,0,0};
		Cube c1 = new Cube(koorA, 50);
		int koorB[] = {20,20,20};
		Cube c2 = new Cube(koorB, 10);
		FlySpace fc = new FlySpace(c1, c2);
		assertEquals(fc.getFlySpaceString(), "s:(0,0,0)(50,50,50), u:(20,20,20)(30,30,30)");
	}
}
