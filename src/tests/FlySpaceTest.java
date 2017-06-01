package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Cube;
import drone.Drone;
import drone.FlySpace;

public class FlySpaceTest {

	@Test
	public void Create_FlySpace_Test(){
		
		int[] pocetneKoordinate=new int[]{50,50,50};
		int duzinaStranice=50;
		Cube spoljasnjeGranice=new Cube(pocetneKoordinate, duzinaStranice);
		int[] pocetneKoordinate2=new int[]{30,30,30};
		int duzinaStranice2=30;
		Cube unutrasnjeGranice=new Cube(pocetneKoordinate2, duzinaStranice2);
		FlySpace prostor=new FlySpace(spoljasnjeGranice,unutrasnjeGranice);
		assertNotNull(prostor);
	}
	
}
