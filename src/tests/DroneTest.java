package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Drone;


public class DroneTest {

	Drone drone;
	int x=30, y=0, z=30;
	public int[] boundaries={50,50,50};
	public int[] coordinates={30,0,30};

	@Test
	public void testConstructor1(){
		drone=new Drone(x,y,z);
		assertNotNull(drone);
	}
	@Test
	 	public void test_Drugi_Konstruktor(){
	 		drone=new Drone(boundaries,coordinates);
	 		assertNotNull(drone);
	 	}
	 	
	 	@Test
	 	public void test_Move_Up(){
	 		drone= new Drone(boundaries, coordinates);
	 		String expectedCoordinates="("
	 		        +Integer.toString(coordinates[0])+","
	 		        +Integer.toString(coordinates[1]+1)+","
	 		        +Integer.toString(coordinates[2]) + ")";
	 		assertEquals(expectedCoordinates,drone.moveUp());	
	 	}
	 	
	 	@Test
	 	public void test_Move_Down(){
	 		coordinates[1]=40;
	 		drone= new Drone(boundaries, coordinates);
	 		String expectedCoordinates="("
	 		        +Integer.toString(coordinates[0])+","
	 		        +Integer.toString(coordinates[1])+","
	 		        +Integer.toString(coordinates[2]) + ")";
	 		assertEquals(expectedCoordinates,drone.moveDown());
	 	}
	 	
	 	@Test
	 	public void test_Move_Left(){
	 		coordinates[0]=40;
	 		coordinates[1]=30;
	 		drone= new Drone(boundaries, coordinates);
	 		String expectedCoordinates="("
	 			+Integer.toString(coordinates[0])+","
	 		        +Integer.toString(coordinates[1])+","
	 		        +Integer.toString(coordinates[2]) + ")";
	 		assertEquals(expectedCoordinates,drone.moveLeft());
	 	}
	 	
	 	@Test
	 	public void test_Move_Right(){
	 		coordinates[0]=10;
	 		coordinates[1]=30;
	 		drone= new Drone(boundaries, coordinates);
	 		String expectedCoordinates="("
	 				+Integer.toString(coordinates[0])+","
	 		        +Integer.toString(coordinates[1])+","
	 		        +Integer.toString(coordinates[2]) + ")";
	 		assertEquals(expectedCoordinates,drone.moveRight());
	 	}
	 	@Test
	 	 	public void test_Move_Back(){
	 	 		coordinates[0]=30;
	 	 		coordinates[1]=30;
	 	 		coordinates[2]=10;
	 	 		drone=new Drone(boundaries,coordinates);
	 	 		String expectedCoordinates="("
	 	 				+Integer.toString(coordinates[0])+","
	 	 				+Integer.toString(coordinates[1])+","
	 	 				+Integer.toString(coordinates[2])+")";
	 			assertEquals(expectedCoordinates,drone.moveBack());
	 	 	}
	 	 	
	 	 	 	public void testConstructor(){
	 	 	 		
	 	 	 		Drone dron = new Drone(10,20,30);
	 	 	 		String expected = "Drone position: (10,20,30)";
	 	 	 		assertEquals(expected, dron.getFormatedCoordinates());
	 	 		}
	 	 	 	
	 	 	 	@Test 
	 	 	 	public void testMoveUp(){
	 	 			
	 	 	 		Drone dron = new Drone(30,0,30);
	 	 	 		
	 	 			String expected = "Drone position: (30,1,30)";
	 	 	 		assertEquals(expected, dron.moveUp());
	 	 	 		
	 	 	 		
	 	 	 	}
	 	 	 	
	 	 	 	@Test 
	 	 	 	public void testMoveDown(){
	 	 	 		
	 	 	 		Drone dron = new Drone(30,1,30);
	 	 	 		
	 	 	 		String expected = "Drone position: (30,0,30)";
	 	 	 		assertEquals(expected, dron.moveDown());
	 	 	 	}
	 		 	
	 	 	 	@Test 
	 	 	 	public void testMoveRight(){
	 	 	 		
	 	 	 		Drone dron = new Drone(30,0,30);
	 	 	 		
	 	 	 		String expected = "Drone position: (31,0,30)";
	 	 	 		assertEquals(expected, dron.moveRight());
	 	 	 	}
	 	 	 	
	 	 	 	@Test 
	 	 	 	public void testMoveLeft(){
	 	 	 		
	 	 	 		Drone dron = new Drone(30,0,30);
	 	 	 		
	 	 	 		String expected = "Drone position: (29,0,30)";
	 	 	 		assertEquals(expected, dron.moveLeft());
	 	 	 	}
	 	 	 	
	 	 	 	@Test 
	 	 	 	public void testMoveBack(){
	 	 	 		
	 	 	 		Drone dron = new Drone(30,0,30);
	 	 	 		
	 	 	 		String expected = "Drone position: (30,0,29)";
	 	 	 		assertEquals(expected, dron.moveBack());
	 	 	 	}
	 	 	 	
	 	 	 	@Test 
	 	 	 	public void testMoveForth(){
	 	 	 		
	 	 	 		Drone dron = new Drone(30,0,30);
	 	 	 		
	 	 	 		String expected = "Drone position: (30,0,31)";
	 	 	 		assertEquals(expected, dron.moveForth());
	 	  	}
	 	  	
	 	  
	 	  }