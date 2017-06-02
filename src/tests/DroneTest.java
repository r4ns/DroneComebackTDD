package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Cube;
import drone.Drone;
import drone.FlySpace;

public class DroneTest {
	Drone drone;
	FlySpace space;
	Cube cube;
	
	@Test
	public void testStringMoveUp(){
		Drone dron = new Drone(new int[] {0,2,0});
		dron.moveUp();
		assertNotNull(dron);
	}
	
	@Test
	public void testStringMoveDown(){
		Drone dron = new Drone(new int[] {0,2,0});
		dron.moveDown();
		assertNotNull(dron);
	}
	
	@Test
	public void testStringMoveLeft(){
		Drone dron = new Drone(new int[] {2,0,0});
		dron.moveLeft();
		assertNotNull(dron);
	}
	
	@Test
	public void testStringMoveRight(){
		Drone dron = new Drone(new int[] {2,0,0});
		dron.moveRight();
		assertNotNull(dron);
	}
	@Test
	public void testStringMoveForth(){
		Drone dron = new Drone(new int[] {0,0,2});
		dron.moveForth();
		assertNotNull(dron);
	}
	@Test
	public void testStringMoveBack(){
		Drone dron = new Drone(new int[] {0,0,2});
		dron.moveBack();
		assertNotNull(dron);
	}
	@Test 
	public void testingFlyingUp(){
		Drone dron = new Drone(new int[] {30,0,30});
		dron.moveUp();
		assertNotNull(dron);
	}
	
	@Test
	public void testingfirstMove(){
		Drone dron = new Drone(new int[] {30,0,30});
		Drone exp = new Drone(new int[] {30,10,30});
		for(int i=0;i<10;i++){
			dron.moveUp();
		}
		String expected = exp.toString();
		assertEquals(expected, dron.getFormatedCoordinates());
	}
	@Test
	public void testingSecondMove(){
		Drone dron = new Drone(new int[] {30,10,30});
		Drone exp = new Drone(new int[] {50,10,30});
		for(int i=0;i<20;i++){
			dron.moveRight();
		}
		String expected = exp.toString();
		assertEquals(expected, dron.getFormatedCoordinates());
	}
	@Test
	public void testingThirdMove(){
		Drone dron = new Drone(new int[] {50,10,30});
		Drone exp = new Drone(new int[] {50,30,30});
		for(int i=0;i<20;i++){
			dron.moveUp();
		}
		String expected = exp.toString();
		assertEquals(expected, dron.getFormatedCoordinates());
	}
	@Test
	public void testingFourthMove(){
		Drone dron = new Drone(new int[] {50,30,30});
		Drone exp = new Drone(new int[] {50,30,15});
		for(int i=0;i<15;i++){
			dron.moveForth();
		}
		String expected = exp.toString();
		assertEquals(expected, dron.getFormatedCoordinates());
	}
	@Test
	public void testingFifthMove(){
		Drone dron = new Drone(new int[] {50,30,15});
		Drone exp = new Drone(new int[] {40,30,15});
		for(int i=0;i<15;i++){
			dron.moveLeft();
		}
		String expected = exp.toString();
		assertEquals(expected, dron.getFormatedCoordinates());
	}
	@Test
	public void testingSixthMove(){
		Drone dron = new Drone(new int[] {40,30,15});
		Drone exp = new Drone(new int[] {40,30,10});
		for(int i=0;i<5;i++){
			dron.moveForth();
		}
		String expected = exp.toString();
		assertEquals(expected, dron.getFormatedCoordinates());
	}
	@Test
	public void testingSeventhMove(){
		Drone dron = new Drone(new int[] {40,30,10});
		Drone exp = new Drone(new int[] {22,30,10});
		for(int i=0;i<18;i++){
			dron.moveLeft();
		}
		String expected = exp.toString();
		assertEquals(expected, dron.getFormatedCoordinates());
	}
	@Test
	public void testingEigthMove(){
		Drone dron = new Drone(new int[] {22,30,10});
		Drone exp = new Drone(new int[] {22,50,10});
		for(int i=0;i<20;i++){
			dron.moveUp();
		}
		String expected = exp.toString();
		assertEquals(expected, dron.getFormatedCoordinates());
	}
	@Test
	public void testingNinthMove(){
		Drone dron = new Drone(new int[] {22,50,10});
		Drone exp = new Drone(new int[] {22,50,30});
		for(int i=0;i<20;i++){
			dron.moveBack();
		}
		String expected = exp.toString();
		assertEquals(expected, dron.getFormatedCoordinates());
	}
	@Test
	public void testingTenthMove(){
		Drone dron = new Drone(new int[] {22,50,30});
		Drone exp = new Drone(new int[] {0,50,30});
		for(int i=0;i<22;i++){
			dron.moveLeft();
		}
		String expected = exp.toString();
		assertEquals(expected, dron.getFormatedCoordinates());
	}
	@Test
	public void testingEleventhMove(){
		Drone dron = new Drone(new int[] {22,50,30});
		Drone exp = new Drone(new int[] {0,30,30});
		for(int i=0;i<20;i++){
			dron.moveDown();
		}
		String expected = exp.toString();
		assertEquals(expected, dron.getFormatedCoordinates());
	}
	
	
	
}
