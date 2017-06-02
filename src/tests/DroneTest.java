package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Cube;
import drone.Drone;

public class DroneTest {

	@Test
	public void testStartPosition(){
		Drone drone=new Drone(30,0,30);
		String expected="Drone position: (30,0,30)";
		assertEquals(expected,drone.toString());
	}

	@Test
 	public void testMoveUp1(){
 		Cube spolj=new Cube(new int[]{0,0,0},50);
 		Cube unut=new Cube(new int[]{10,10,10},30);
 		Drone drone=new Drone(30,0,30,spolj,unut);
 		helperMethod(drone,"moveUp",15);
 		String expected="Drone position: (30,10,30)";
 		assertEquals(expected,drone.toString());		
 	}
 	
 	@Test
 	public void testMoveUp2(){		
 		Cube spolj=new Cube(new int[]{0,0,0},50);
 		Cube unut=new Cube(new int[]{10,10,10},30);
 		Drone drone=new Drone(30,40,30,spolj,unut);
 		helperMethod(drone,"moveUp",15);
 		String expected="Drone position: (30,50,30)";
 		assertEquals(expected,drone.toString()); 		
 	}
 	
 	@Test
 	public void testMoveDown1(){
 		Cube spolj=new Cube(new int[]{0,0,0},50);
 		Cube unut=new Cube(new int[]{10,10,10},30);
 		Drone drone=new Drone(30,0,30,spolj,unut);
 		helperMethod(drone,"moveDown",15);
 		String expected="Drone position: (30,0,30)";
 		assertEquals(expected,drone.toString()); 		
 	}
 	
 	@Test
 	public void testMoveDown2(){
 		Cube spolj=new Cube(new int[]{0,0,0},50);
 		Cube unut=new Cube(new int[]{10,10,10},30);
 		Drone drone=new Drone(30,40,30,spolj,unut);
 		helperMethod(drone,"moveDown",15);
 		String expected="Drone position: (30,40,30)";
 		assertEquals(expected,drone.toString());
 	}
 	
 	@Test
 	public void testMoveLeft1(){
 		Cube spolj=new Cube(new int[]{0,0,0},50);
 		Cube unut=new Cube(new int[]{10,10,10},30);
 		Drone drone=new Drone(30,0,30,spolj,unut);
 		helperMethod(drone,"moveLeft",32);
 		String expected="Drone position: (0,0,30)";
 		assertEquals(expected,drone.toString());
 	}
 	
 	@Test
 	public void testMoveRight1(){
 		Cube spolj=new Cube(new int[]{0,0,0},50);
 		Cube unut=new Cube(new int[]{10,10,10},30);
 		Drone drone=new Drone(30,0,30,spolj,unut);
 		helperMethod(drone,"moveRight",32);
 		String expected="Drone position: (50,0,30)";
 		assertEquals(expected,drone.toString());
 	}
 	
 	@Test
 	public void testMoveBack(){
 		Cube spolj=new Cube(new int[]{0,0,0},50);
 		Cube unut=new Cube(new int[]{10,10,10},30);
 		Drone drone=new Drone(30,0,30,spolj,unut);
 		helperMethod(drone,"moveBack",32);
 		String expected="Drone position: (30,0,50)";
 		assertEquals(expected,drone.toString());		
 	}
 	
	@Test
	public void testMoveForth(){	
		Cube spolj=new Cube(new int[]{0,0,0},50);
		Cube unut=new Cube(new int[]{10,10,10},30);
		Drone drone=new Drone(30,0,0,spolj,unut);
		helperMethod(drone,"moveForth",32);
		String expected="Drone position: (30,0,0)";
		assertEquals(expected,drone.toString());		
 	}
	
 	@Test
 	public void testMoveBack2(){
	 	Cube spolj=new Cube(new int[]{0,0,0},50);
	 	Cube unut=new Cube(new int[]{10,10,10},30);
		Drone drone=new Drone(30,0,0,spolj,unut);
		helperMethod(drone,"moveBack",32);
		String expected="Drone position: (30,0,10)";
		assertEquals(expected,drone.toString());
 	}

	private void helperMethod(Drone drone, String command, int k) {
		if(command=="moveUp"){
	 		for(int i=0;i<k;i++){
	 			drone.moveUp();
	 		}
	 	}
 		if(command=="moveDown"){
 			for(int i=0;i<k;i++){
 				drone.moveDown();
 			}
 		}
 		if(command=="moveForth"){
 			for(int i=0;i<k;i++){
 				drone.moveForth();
 			}
 		}
 		if(command=="moveBack"){
 			for(int i=0;i<k;i++)
 			{
				drone.moveBack();
 			}
 		}
 		if(command=="moveRight"){
			for(int i=0;i<k;i++){
 				drone.moveRight();
 			}
 		}
 		if(command=="moveLeft"){
 			for(int i=0;i<k;i++){
 				drone.moveLeft();
 			}
 		}
	}
}
