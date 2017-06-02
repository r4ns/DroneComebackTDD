package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Cube;
import drone.FlySpace;

public class FlySpaceTest {
	
	@Test
	public void testCubes(){
		Cube velikaKocka=new Cube(new int[] {0,0,0},50);
		Cube malaKocka=new Cube(new int[] {10,10,10},30);
		FlySpace space=new FlySpace(velikaKocka,malaKocka);
		String ocekivano="Cube position: (0,0,0), length: 50,Cube position: (10,10,10), length: 30";
		assertEquals(ocekivano,space.toString());
		
	}
	
	@Test
	public void testCubes2(){
		Cube velikaKocka=new Cube(new int[] {15,15,15},10);
		Cube malaKocka=new Cube(new int[] {10,10,10},30);
		FlySpace space=new FlySpace(velikaKocka,malaKocka);
		String ocekivano="Cube position: (15,15,15), length: 10,Cube position: (10,10,10), length: 30";
		assertEquals(ocekivano,space.toString());
		
	}
}