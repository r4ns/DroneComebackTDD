package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Cube;
import drone.Drone;

public class DroneTest {
	
	@Test
	public void testFirstPosition(){
		
		Drone drone=new Drone(30,0,30);
		String excpected="Drone position: (30,0,30)";
		assertEquals(excpected,drone.toString());
		
	}
	
	@Test
	public void testMoveUp1(){
		
		Cube spoljasnja=new Cube(new int[]{0,0,0},50);
		Cube unutrasnja=new Cube(new int[]{10,10,10},30);
		Drone drone=new Drone(30,0,30,spoljasnja,unutrasnja);
		helper(drone,"moveUp",15);
		String excpected="Drone position: (30,10,30)";
		assertEquals(excpected,drone.toString());
		
	}
	
	@Test
	public void testMoveUp2(){
		
		Cube spoljasnja=new Cube(new int[]{0,0,0},50);
		Cube unutrasnja=new Cube(new int[]{10,10,10},30);
		Drone drone=new Drone(30,40,30,spoljasnja,unutrasnja);
		helper(drone,"moveUp",15);
		String excpected="Drone position: (30,50,30)";
		assertEquals(excpected,drone.toString());
		
	}
	
	@Test
	public void testMoveDown1(){
		
		Cube spoljasnja=new Cube(new int[]{0,0,0},50);
		Cube unutrasnja=new Cube(new int[]{10,10,10},30);
		Drone drone=new Drone(30,0,30,spoljasnja,unutrasnja);
		helper(drone,"moveDown",15);
		String excpected="Drone position: (30,0,30)";
		assertEquals(excpected,drone.toString());
		
	}
	@Test
	public void testMoveDown2(){
		
		Cube spoljasnja=new Cube(new int[]{0,0,0},50);
		Cube unutrasnja=new Cube(new int[]{10,10,10},30);
		Drone drone=new Drone(30,40,30,spoljasnja,unutrasnja);
		helper(drone,"moveDown",15);
		String excpected="Drone position: (30,40,30)";
		assertEquals(excpected,drone.toString());
		
	}
	@Test
	public void testMoveLeft1(){
		
		Cube spoljasnja=new Cube(new int[]{0,0,0},50);
		Cube unutrasnja=new Cube(new int[]{10,10,10},30);
		Drone drone=new Drone(30,0,30,spoljasnja,unutrasnja);
		helper(drone,"moveLeft",32);
		String excpected="Drone position: (0,0,30)";
		assertEquals(excpected,drone.toString());
		
	}
	
	@Test
	public void testMoveRight1(){
		
		Cube spoljasnja=new Cube(new int[]{0,0,0},50);
		Cube unutrasnja=new Cube(new int[]{10,10,10},30);
		Drone drone=new Drone(30,0,30,spoljasnja,unutrasnja);
		helper(drone,"moveRight",32);
		String excpected="Drone position: (50,0,30)";
	
		assertEquals(excpected,drone.toString());
		
	}
	
	@Test
	public void testMoveBack(){
		
		Cube spoljasnja=new Cube(new int[]{0,0,0},50);
		Cube unutrasnja=new Cube(new int[]{10,10,10},30);
		Drone drone=new Drone(30,0,30,spoljasnja,unutrasnja);
		helper(drone,"moveBack",32);
		String excpected="Drone position: (30,0,50)";
		assertEquals(excpected,drone.toString());
		
	}
	@Test
	public void testMoveForth(){
		
		Cube spoljasnja=new Cube(new int[]{0,0,0},50);
		Cube unutrasnja=new Cube(new int[]{10,10,10},30);
		Drone drone=new Drone(30,0,0,spoljasnja,unutrasnja);
		helper(drone,"moveForth",32);
		String excpected="Drone position: (30,0,0)";
		assertEquals(excpected,drone.toString());
		
	}
	@Test
	public void testMoveBack2(){
		
		Cube spoljasnja=new Cube(new int[]{0,0,0},50);
		Cube unutrasnja=new Cube(new int[]{10,10,10},30);
		Drone drone=new Drone(30,0,0,spoljasnja,unutrasnja);
		helper(drone,"moveBack",32);
		String excpected="Drone position: (30,0,10)";
		assertEquals(excpected,drone.toString());
		
	}
	
	
	public void helper(Drone drone,String komanda,int n){
		
		if(komanda=="moveUp"){
			for(int i=0;i<n;i++)
			{
				drone.moveUp();
			}
		}
		if(komanda=="moveDown"){
			for(int i=0;i<n;i++)
			{
				drone.moveDown();
			}
		}
		if(komanda=="moveForth"){
			for(int i=0;i<n;i++)
			{
				drone.moveForth();
			}
		}
		if(komanda=="moveBack"){
			for(int i=0;i<n;i++)
			{
				drone.moveBack();
			}
		}
		if(komanda=="moveRight"){
			for(int i=0;i<n;i++)
			{
				drone.moveRight();
			}
		}
		if(komanda=="moveLeft"){
			for(int i=0;i<n;i++)
			{
				drone.moveLeft();
			}
		}
		
	}
	
}