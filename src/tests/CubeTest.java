package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import drone.Cube;
import drone.Drone;

public class CubeTest {
	
	@Test
	public void Create_Cube_Test(){
		
		int[] goreLevo=new int[]{50,50,50};
		int duzinaStranice=50;
		Cube kocka=new Cube(goreLevo,duzinaStranice);
		assertNotNull(kocka);
	}
	

}
