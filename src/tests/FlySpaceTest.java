package tests;

import org.junit.Test;
import org.junit.validator.ValidateWith;

import static org.junit.Assert.*;

import drone.Cube;
import drone.FlySpace;

public class FlySpaceTest {
	
	@Test
	public void FlySpace_constructor(){
		Cube innerCube = new Cube(new int[]{10,10,10},30);
		Cube outerCube = new Cube(new int[]{0,0,0},50);
		
		FlySpace space = new FlySpace(innerCube,outerCube);
		
		assertNotNull(space);
		
	}
	
	@Test 
	public void FlySpace_InnerCube(){
		Cube innerCube = new Cube(new int[]{10,10,10},30);
		Cube outerCube = new Cube(new int[]{0,0,0},50);
		
		FlySpace space = new FlySpace(innerCube,outerCube);
		
		String expected = "(10,10,10)---->(40,40,40)";
		assertEquals(expected, "("+String.valueOf(space.getInnerCube().getMinCoordinates()[0])+","+String.valueOf(space.getInnerCube().getMinCoordinates()[1])+","+String.valueOf(space.getInnerCube().getMinCoordinates()[2])+")---->"+
		"("+String.valueOf(space.getInnerCube().getMaxCoordinates()[0])+","+String.valueOf(space.getInnerCube().getMaxCoordinates()[1])+","+String.valueOf(space.getInnerCube().getMaxCoordinates()[2])+")");
	}
	
	@Test
	public void FlySpace_OuterCube(){
		Cube innerCube = new Cube(new int[]{10,10,10},30);
		Cube outerCube = new Cube(new int[]{0,0,0},50);
		
		FlySpace space = new FlySpace(innerCube,outerCube);
		
		String expected = "(0,0,0)---->(50,50,50)";
		assertEquals(expected, "("+String.valueOf(space.getOuterCube().getMinCoordinates()[0])+","+String.valueOf(space.getOuterCube().getMinCoordinates()[1])+","+String.valueOf(space.getOuterCube().getMinCoordinates()[2])+")---->"+
		"("+String.valueOf(space.getOuterCube().getMaxCoordinates()[0])+","+String.valueOf(space.getOuterCube().getMaxCoordinates()[1])+","+String.valueOf(space.getOuterCube().getMaxCoordinates()[2])+")");
	}
}
