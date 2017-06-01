package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import drone.Drone;

public class DroneTest {

	@Test 
	public void Drone_StartPosition(){
		
		int[] pocetnaPozicija=new int[]{30,0,30};
		Drone dron=new Drone(pocetnaPozicija);
		String pozicija=dron.getFormatedCoordinates();
		assertEquals("(30,0,30)",pozicija);
	}
	
	@Test
	public void Drone_InitialMoveUp(){
		
		int[] pocetnaPozicija=new int[]{30,0,30};
		Drone dron=new Drone(pocetnaPozicija);
		dron.moveUp();
		String pozicija=dron.getFormatedCoordinates();
		assertEquals("(30,1,30)",pozicija);
	}
	
	@Test
	public void Drone_InitialMoveDown(){
		
		int[] pocetnaPozicija=new int[]{30,1,30};
		Drone dron=new Drone(pocetnaPozicija);
		dron.moveDown();
		String pozicija=dron.getFormatedCoordinates();
		assertEquals("(30,0,30)",pozicija);
	}
	@Test
	public void Drone_InitialMoveBack(){
		
		int[] pocetnaPozicija=new int[]{30,1,30};
		Drone dron=new Drone(pocetnaPozicija);
		dron.moveBack();
		String pozicija=dron.getFormatedCoordinates();
		assertEquals("(30,1,31)",pozicija);
	}
	
}
