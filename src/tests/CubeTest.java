package tests;
import static org.junit.Assert.*;

import org.junit.Test;

import drone.Cube;
import drone.Drone;
import drone.FlySpace;


public class CubeTest {
	Drone drone;
	FlySpace space;
	Cube cube;
	
	@Test
	public void testConstructor(){
		Cube cu = new Cube(new int[] {0,0,0}, 50);
		assertNull(cube);
	}
	
	
	/*@Test
	public void testInitialMoveUp(){
		Cube outerCube = new Cube(new int[] {0,0,0}, 50);
		Cube innerCube = new Cube(new int[] {10,10,10}, 30);
		Cube testDrone = new Cube(new int[] {30,1,30}, 1);
		Cube expectedDronePosition = new Cube(new int[] {30,2,30}, 1);
		space  = new FlySpace (outerCube, innerCube);
		String expectedResponse = expectedDronePosition.toString();
		
		assertEquals(expectedResponse, drone.moveUp());
	}*/
	
	/*@Test
	public void testInitialMoveDown(){
		Cube outerCube = new Cube(new int[] {0,0,0}, 50);
		Cube innerCube = new Cube(new int[] {10,10,10}, 30);
		space  = new FlySpace (outerCube, innerCube);
		Cube testDrone = new Cube(new int[] {30,1,30}, 1);
		Cube expectedDronePosition = new Cube(new int[] {30,0,30}, 1);
		String expectedResponse = expectedDronePosition.toString();
		
		assertEquals(expectedResponse, drone.moveDown());
	}*/
	

}
