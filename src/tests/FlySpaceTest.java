package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Cube;
import drone.FlySpace;

public class FlySpaceTest {

	@Test
	public void testCubes1(){
		Cube velika=new Cube(new int[] {0,0,0},50);
		Cube mala=new Cube(new int[] {10,10,10},30);
		FlySpace flySpace=new FlySpace(velika,mala);
		String expected="Cube position: (0,0,0), length: 50,Cube position: (10,10,10), length: 30";
		assertEquals(expected,flySpace.toString());
	}
	
	@Test
	public void testCubes2(){
		Cube velika=new Cube(new int[] {15,15,15},10);
		Cube mala=new Cube(new int[] {10,10,10},30);
		FlySpace flySpace=new FlySpace(velika,mala);
		String expected="Cube position: (15,15,15), length: 10,Cube position: (10,10,10), length: 30";
		assertEquals(expected,flySpace.toString());
	}
}
