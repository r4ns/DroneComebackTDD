package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import drone.Cube;
import drone.FlySpace;


public class FlySpaceTest {

	@Test 
	public void prazanKonstruktorTest()
	 	 	{
	 	 		FlySpace fs = new FlySpace();
	 	 		assertNotNull(fs);
	 	 	}
	@Test 
	  	public void konsruktorTest()
	  	{
	 	 	Cube velikaKocka = new Cube();
	 		Cube malaKocka = new Cube();
	 		int granica=0;
	  		FlySpace fs= new FlySpace(velikaKocka, malaKocka, granica);
	  		
	 		assertNotNull(fs);
	 		
	 	}
}
