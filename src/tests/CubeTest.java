package tests;
import static org.junit.Assert.*;

import org.junit.Test;
import drone.Cube;

public class CubeTest {
	
	@Test
	public void testCubeTackaA(){
		int koor[] = {0,0,0};
		Cube c = new Cube(koor);
		assertEquals(c.getTackaA(),koor);
	}
	
	@Test
	public void testCubeTackaAStr(){
		int koor[] = {0,0,0};
		Cube c = new Cube(koor);
		assertEquals(c.getTackaAStr(),"(0,0,0)");
	}
	
	@Test
	public void testCubeTackaB(){
		int koorA[] = {0,0,0};
		Cube c = new Cube(koorA, 10);
		assertEquals(c.getTackaBStr(),"(10,10,10)");
	}
	
	@Test
	public void testGetCubeStr(){
		int koorA[] = {0,0,0};
		Cube c = new Cube(koorA, 10);
		assertEquals(c.getCubeStr(),"(0,0,0)(10,10,10)");
	}
}
