package tests;

import org.junit.Test;

import drone.Drone;
import drone.DroneException;

import static org.junit.Assert.*;

public class DroneTest {
	
	//Exception nije testiran jer u ovom slucaju ne moze dron da ode izvan prostora za letenje
	
	@Test
	public void drone_constructor(){
		
		Drone dorn = new Drone(30,0,30);
		
		assertNotNull(dorn);
	}
	
	@Test
	public void drone_moveUp_1(){
		Drone dron = new Drone(30,0,30);
		
		String actual = dron.moveUp();
		
		String expected = "(30,1,30)";
		assertEquals(expected, actual);
	}
	@Test
	public void drone_moveDown_1(){
		Drone dron = new Drone(30,1,30);
		
		String actual= dron.moveDown();
		String expected="(30,0,30)";
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void drone_moveLeft_1(){
		Drone dron = new Drone(30,1,30);
		
		String actual = dron.moveLeft();
		String expected = "(29,1,30)";
		
		assertEquals(expected, actual);
	}
	@Test
	public void drone_moveRight_1(){
		Drone dron = new Drone(30,1,30);
		
		String actual = dron.moveRight();
		String expected = "(31,1,30)";
		
		assertEquals(expected, actual);
	}
	@Test
	public void drone_moveBack_1(){
		Drone dron = new Drone(30,1,30);
		
		String actual = dron.moveBack();
		String expected = "(30,1,29)";
		
		assertEquals(expected, actual);
	}
	@Test
	public void drone_moveForth_1(){
		Drone dron = new Drone(30,1,30);
		
		String actual = dron.moveForth();
		String expected = "(30,1,31)";
		
		assertEquals(expected, actual);
	}
	@Test
	public void test_drone_moveUp_30_10_30(){
		Drone dron = new Drone(30,0,30);
		
		String expected = "(30,10,30)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveUp", 15));
	}
	@Test
	public void test_drone_moveUp_30_50_30(){
		Drone dron = new Drone(30,40,30);
		
		String expected = "(30,50,30)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveUp", 15));
	}
	
	@Test
	public void test_drone_moveUp_0_50_0(){
		Drone dron = new Drone(0,0,0);
		
		String expected = "(0,50,0)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveUp", 60));
	}
	
	@Test
	public void test_drone_moveUp_25_50_10(){
		Drone dron = new Drone(25,0,10);
		
		String expected = "(25,50,10)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveUp", 60));
	}
	
	@Test
	public void test_drone_moveUp_50_50_10(){
		Drone dron = new Drone(50,0,10);
		
		String expected = "(50,50,10)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveUp", 60));
	}
	
	@Test
	public void test_drone_moveUp_10_50_40(){
		Drone dron = new Drone(10,0,40);
		
		String expected = "(10,50,40)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveUp", 60));
	}
	
	@Test
	public void test_drone_moveUp_10_50_10(){
		Drone dron = new Drone(10,0,10);
		
		String expected = "(10,50,10)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveUp", 60));
	}
	
	@Test
	public void test_drone_moveUp_40_50_40(){
		Drone dron = new Drone(40,0,40);
		
		String expected = "(40,50,40)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveUp", 60));
	}
	
	@Test
	public void test_drone_moveUp_40_50_25(){
		Drone dron = new Drone(40,0,25);
		
		String expected = "(40,50,25)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveUp", 60));
	}
	@Test
	public void test_drone_moveUp_10_50_25(){
		Drone dron = new Drone(10,0,25);
		
		String expected = "(10,50,25)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveUp", 60));
	}
	@Test
	public void test_drone_moveUp_25_50_40(){
		Drone dron = new Drone(25,0,40);
		
		String expected = "(25,50,40)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveUp", 60));
	}
	
	@Test
	public void test_drone_moveUp_0_50_50(){
		Drone dron = new Drone(0,0,50);
		
		String expected = "(0,50,50)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveUp", 60));
	}
	
	@Test
	public void test_drone_moveUp_50_50_50(){
		Drone dron = new Drone(50,0,50);
		
		String expected = "(50,50,50)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveUp", 60));
	}
	
	@Test
	public void test_drone_moveDown_30_0_30(){
		Drone dron = new Drone(30,10,30);
		
		String expected = "(30,0,30)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveDown", 60));
	}
	

	@Test
	public void test_drone_moveDown_30_40_30(){
		Drone dron = new Drone(30,50,30);
		
		String expected = "(30,40,30)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveDown", 60));
	}
	
	@Test
	public void test_drone_moveDown_0_0_0(){
		Drone dron = new Drone(0,50,0);
		
		String expected = "(0,0,0)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveDown", 60));
	}
	
	@Test
	public void test_drone_moveDown_10_0_10(){
		Drone dron = new Drone(10,50,10);
		
		String expected = "(10,0,10)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveDown", 60));
	}
	
	@Test
	public void test_drone_moveDown_40_0_10(){
		Drone dron = new Drone(40,50,10);
		
		String expected = "(40,0,10)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveDown", 60));
	}
	
	@Test
	public void test_drone_moveDown_50_0_0(){
		Drone dron = new Drone(50,50,0);
		
		String expected = "(50,0,0)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveDown", 60));
	}
	
	@Test
	public void test_drone_moveDown_25_0_0(){
		Drone dron = new Drone(25,50,0);
		
		String expected = "(25,0,0)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveDown", 60));
	}
	
	@Test
	public void test_drone_moveDown_25_0_10(){
		Drone dron = new Drone(25,50,10);
		
		String expected = "(25,0,10)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveDown", 60));
	}
	
	@Test
	public void test_drone_moveDown_50_0_50(){
		Drone dron = new Drone(50,50,50);
		
		String expected = "(50,0,50)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveDown", 60));
	}
	
	@Test
	public void test_drone_moveDown_0_0_50(){
		Drone dron = new Drone(0,50,50);
		
		String expected = "(0,0,50)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveDown", 60));
	}
	
	@Test
	public void test_drone_moveDown_10_0_40(){
		Drone dron = new Drone(10,50,40);
		
		String expected = "(10,0,40)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveDown", 60));
	}
	
	@Test
	public void test_drone_moveDown_40_0_40(){
		Drone dron = new Drone(40,50,40);
		
		String expected = "(40,0,40)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveDown", 60));
	}
	
	@Test
	public void test_drone_moveDown_40_0_25(){
		Drone dron = new Drone(40,50,25);
		
		String expected = "(40,0,25)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveDown", 60));
	}
	
	@Test
	public void test_drone_moveDown_10_0_25(){
		Drone dron = new Drone(10,50,25);
		
		String expected = "(10,0,25)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveDown", 60));
	}
	
	@Test
	public void test_drone_moveDown_25_0_40(){
		Drone dron = new Drone(25,50,40);
		
		String expected = "(25,0,40)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveDown", 60));
	}
	
	@Test
	public void test_drone_moveRight_10_30_30(){
		Drone dron = new Drone(0,30,30);
		
		String expected = "(10,30,30)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveRight", 60));
	}
	
	@Test
	public void test_drone_moveRight_50_30_30(){
		Drone dron = new Drone(40,30,30);
		
		String expected = "(50,30,30)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveRight", 60));
	}
	
	@Test
	public void test_drone_moveRight_50_0_50(){
		Drone dron = new Drone(0,0,50);
		
		String expected = "(50,0,50)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveRight", 60));
	}
	
	@Test
	public void test_drone_moveRight_50_0_0(){
		Drone dron = new Drone(0,0,0);
		
		String expected = "(50,0,0)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveRight", 60));
	}
	
	@Test
	public void test_drone_moveRight_50_50_0(){
		Drone dron = new Drone(0,50,0);
		
		String expected = "(50,50,0)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveRight", 60));
	}
	
	@Test
	public void test_drone_moveRight_50_50_50(){
		Drone dron = new Drone(0,50,50);
		
		String expected = "(50,50,50)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveRight", 60));
	}
	
	@Test
	public void test_drone_moveRight_50_10_10(){
		Drone dron = new Drone(0,10,10);
		
		String expected = "(50,10,10)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveRight", 60));
	}
	
	@Test
	public void test_drone_moveRight_50_40_10(){
		Drone dron = new Drone(0,40,10);
		
		String expected = "(50,40,10)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveRight", 60));
	}
	
	@Test
	public void test_drone_moveRight_50_40_40(){
		Drone dron = new Drone(0,40,40);
		
		String expected = "(50,40,40)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveRight", 60));
	}
	
	@Test
	public void test_drone_moveRight_50_10_40(){
		Drone dron = new Drone(0,10,40);
		
		String expected = "(50,10,40)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveRight", 60));
	}
	
	@Test
	public void test_drone_moveRight_50_25_10(){
		Drone dron = new Drone(0,25,10);
		
		String expected = "(50,25,10)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveRight", 60));
	}
	
	@Test
	public void test_drone_moveRight_50_10_25(){
		Drone dron = new Drone(0,10,25);
		
		String expected = "(50,10,25)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveRight", 60));
	}
	
	@Test
	public void test_drone_moveRight_50_25_40(){
		Drone dron = new Drone(0,25,40);
		
		String expected = "(50,25,40)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveRight", 60));
	}
	
	@Test
	public void test_drone_moveRight_50_40_25(){
		Drone dron = new Drone(0,40,25);
		
		String expected = "(50,40,25)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveRight", 60));
	}
	
	@Test
	public void test_drone_moveLeft_40_30_30(){
		Drone dron = new Drone(50,30,30);
		
		String expected = "(40,30,30)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveLeft", 60));
	}
	
	@Test
	public void test_drone_moveLeft_0_30_30(){
		Drone dron = new Drone(10,30,30);
		
		String expected = "(0,30,30)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveLeft", 60));
	}
	
	@Test
	public void test_drone_moveLeft_0_0_0(){
		Drone dron = new Drone(50,0,0);
		
		String expected = "(0,0,0)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveLeft", 60));
	}
	
	@Test
	public void test_drone_moveLeft_0_50_0(){
		Drone dron = new Drone(50,50,0);
		
		String expected = "(0,50,0)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveLeft", 60));
	}
	
	@Test
	public void test_drone_moveLeft_0_10_10(){
		Drone dron = new Drone(50,10,10);
		
		String expected = "(0,10,10)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveLeft", 60));
	}
	
	@Test
	public void test_drone_moveLeft_0_40_10(){
		Drone dron = new Drone(50,40,10);
		
		String expected = "(0,40,10)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveLeft", 60));
	}
	
	@Test
	public void test_drone_moveLeft_0_40_40(){
		Drone dron = new Drone(50,40,40);
		
		String expected = "(0,40,40)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveLeft", 60));
	}
	
	@Test
	public void test_drone_moveLeft_0_10_40(){
		Drone dron = new Drone(50,10,40);
		
		String expected = "(0,10,40)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveLeft", 60));
	}
	
	@Test
	public void test_drone_moveLeft_0_0_50(){
		Drone dron = new Drone(50,0,50);
		
		String expected = "(0,0,50)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveLeft", 60));
	}
	
	@Test
	public void test_drone_moveLeft_0_50_50(){
		Drone dron = new Drone(50,50,50);
		
		String expected = "(0,50,50)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveLeft", 60));
	}
	
	@Test
	public void test_drone_moveLeft_0_25_10(){
		Drone dron = new Drone(50,25,10);
		
		String expected = "(0,25,10)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveLeft", 60));
	}
	
	@Test
	public void test_drone_moveLeft_0_40_25(){
		Drone dron = new Drone(50,40,25);
		
		String expected = "(0,40,25)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveLeft", 60));
	}
	
	@Test
	public void test_drone_moveLeft_0_10_25(){
		Drone dron = new Drone(50,10,25);
		
		String expected = "(0,10,25)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveLeft", 60));
	}
	
	@Test
	public void test_drone_moveLeft_0_25_40(){
		Drone dron = new Drone(50,25,40);
		
		String expected = "(0,25,40)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveLeft", 60));
	}
	
	@Test
	public void test_drone_move_Forth_30_30_10(){
		Drone dron = new Drone(30,30,0);
		
		String expected = "(30,30,10)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveForth", 60));
	}
	
	@Test
	public void test_drone_move_Forth_30_30_50(){
		Drone dron = new Drone(30,30,40);
		
		String expected = "(30,30,50)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveForth", 60));
	}
	
	@Test
	public void test_drone_move_Forth_0_0_50(){
		Drone dron = new Drone(0,0,0);
		
		String expected = "(0,0,50)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveForth", 60));
	}
	
	@Test
	public void test_drone_move_Forth_0_50_50(){
		Drone dron = new Drone(0,50,0);
		
		String expected = "(0,50,50)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveForth", 60));
	}
	
	@Test
	public void test_drone_move_Forth_50_50_50(){
		Drone dron = new Drone(50,50,0);
		
		String expected = "(50,50,50)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveForth", 60));
	}
	
	@Test
	public void test_drone_move_Forth_50_0_50(){
		Drone dron = new Drone(50,0,0);
		
		String expected = "(50,0,50)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveForth", 60));
	}
	
	@Test
	public void test_drone_move_Forth_10_10_50(){
		Drone dron = new Drone(10,10,0);
		
		String expected = "(10,10,50)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveForth", 60));
	}
	
	@Test
	public void test_drone_move_Forth_10_40_50(){
		Drone dron = new Drone(10,40,0);
		
		String expected = "(10,40,50)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveForth", 60));
	}
	
	@Test
	public void test_drone_move_Forth_40_10_50(){
		Drone dron = new Drone(40,10,0);
		
		String expected = "(40,10,50)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveForth", 60));
	}
	
	@Test
	public void test_drone_move_Forth_40_40_50(){
		Drone dron = new Drone(40,40,0);
		
		String expected = "(40,40,50)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveForth", 60));
	}
	
	@Test
	public void test_drone_move_Forth_10_25_50(){
		Drone dron = new Drone(10,25,0);
		
		String expected = "(10,25,50)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveForth", 60));
	}
	
	@Test
	public void test_drone_move_Forth_25_10_50(){
		Drone dron = new Drone(25,10,0);
		
		String expected = "(25,10,50)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveForth", 60));
	}
	
	@Test
	public void test_drone_move_Forth_40_25_50(){
		Drone dron = new Drone(40,25,0);
		
		String expected = "(40,25,50)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveForth", 60));
	}
	
	@Test
	public void test_drone_move_Forth_25_40_50(){
		Drone dron = new Drone(25,40,0);
		
		String expected = "(25,40,50)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveForth", 60));
	}
	
	@Test
	public void test_drone_move_Back_30_30_0(){
		Drone dron = new Drone(30,30,10);
		
		String expected = "(30,30,0)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveBack", 60));
	}
	
	@Test
	public void test_drone_move_Back_30_30_40(){
		Drone dron = new Drone(30,30,50);
		
		String expected = "(30,30,40)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveBack", 60));
	}
	
	@Test
	public void test_drone_move_Back_10_10_0(){
		Drone dron = new Drone(10,10,50);
		
		String expected = "(10,10,0)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveBack", 60));
	}
	
	@Test
	public void test_drone_move_Back_0_0_0(){
		Drone dron = new Drone(0,0,50);
		
		String expected = "(0,0,0)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveBack", 60));
	}
	
	@Test
	public void test_drone_move_Back_0_50_0(){
		Drone dron = new Drone(0,50,50);
		
		String expected = "(0,50,0)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveBack", 60));
	}
	
	@Test
	public void test_drone_move_Back_10_40_0(){
		Drone dron = new Drone(10,40,50);
		
		String expected = "(10,40,0)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveBack", 60));
	}
	
	@Test
	public void test_drone_move_Back_40_10_0(){
		Drone dron = new Drone(40,10,50);
		
		String expected = "(40,10,0)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveBack", 60));
	}
	
	@Test
	public void test_drone_move_Back_40_40_0(){
		Drone dron = new Drone(40,40,50);
		
		String expected = "(40,40,0)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveBack", 60));
	}
	
	@Test
	public void test_drone_move_Back_10_25_0(){
		Drone dron = new Drone(10,25,50);
		
		String expected = "(10,25,0)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveBack", 60));
	}
	
	@Test
	public void test_drone_move_Back_25_10_0(){
		Drone dron = new Drone(25,10,50);
		
		String expected = "(25,10,0)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveBack", 60));
	}
	
	@Test
	public void test_drone_move_Back_25_40_0(){
		Drone dron = new Drone(25,40,50);
		
		String expected = "(25,40,0)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveBack", 60));
	}
	
	@Test
	public void test_drone_move_Back_40_25_0(){
		Drone dron = new Drone(40,25,50);
		
		String expected = "(40,25,0)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveBack", 60));
	}
	
	@Test
	public void test_drone_move_Back_50_0_0(){
		Drone dron = new Drone(50,0,50);
		
		String expected = "(50,0,0)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveBack", 60));
	}
	
	@Test
	public void test_drone_move_Back_50_50_0(){
		Drone dron = new Drone(50,50,50);
		
		String expected = "(50,50,0)";
		
		assertEquals(expected, test_boundries_cube_with_drone(dron,"moveBack", 60));
	}
	
	
	@Test
	public void test_drone_path_1_start_30_0_30_end_0_30_30(){
		Drone dron = new Drone(30,0,30);
		
		String expected = "(0,30,30)";
		
		test_boundries_cube_with_drone(dron,"moveUp", 12);
		test_boundries_cube_with_drone(dron,"moveRight", 21);
		test_boundries_cube_with_drone(dron,"moveUp", 23);
		test_boundries_cube_with_drone(dron,"moveBack", 16);
		test_boundries_cube_with_drone(dron,"moveLeft", 12);
		test_boundries_cube_with_drone(dron,"moveBack", 5);
		test_boundries_cube_with_drone(dron,"moveLeft", 18);
		test_boundries_cube_with_drone(dron,"moveUp", 17);
		test_boundries_cube_with_drone(dron,"moveForth", 21);
		test_boundries_cube_with_drone(dron,"moveLeft", 22);
		test_boundries_cube_with_drone(dron,"moveDown", 20);
		
		String actual = dron.getFormatedCoordinates();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_drone_path_2_start_30_0_30_end_0_30_30(){
		Drone dron = new Drone(30,0,30);
		
		String expected = "(0,30,30)";
		
		test_boundries_cube_with_drone(dron,"moveUp", 12);
		test_boundries_cube_with_drone(dron,"moveForth", 21);
		test_boundries_cube_with_drone(dron,"moveUp", 23);
		test_boundries_cube_with_drone(dron,"moveRight", 32);
		test_boundries_cube_with_drone(dron,"moveBack", 18);
		test_boundries_cube_with_drone(dron,"moveUp", 25);
		test_boundries_cube_with_drone(dron,"moveLeft", 18);
		test_boundries_cube_with_drone(dron,"movedo2n", 17);
		test_boundries_cube_with_drone(dron,"moveBack", 41);
		test_boundries_cube_with_drone(dron,"moveDown", 20);
		test_boundries_cube_with_drone(dron,"moveLeft", 35);
		test_boundries_cube_with_drone(dron,"moveForth", 30);
		
		String actual = dron.getFormatedCoordinates();
		
		assertEquals(expected, actual);
	}
	
	
	
	public String test_boundries_cube_with_drone(Drone drone,String command, int steps){
		String move=command;
		if(move=="moveUp"){
			for(int i =0;i<steps;i++)
				drone.moveUp();
		}
		else if(move=="moveDown"){
			for(int i =0;i<steps;i++)
				drone.moveDown();
		}
		else if(move=="moveLeft"){
			for(int i =0;i<steps;i++)
				drone.moveLeft();
		}
		else if(move=="moveRight"){
			for(int i =0;i<steps;i++)
				drone.moveRight();
		}
		else if(move=="moveForth"){
			for(int i =0;i<steps;i++)
				drone.moveForth();
		}
		else if(move=="moveBack"){
			for(int i =0;i<steps;i++)
				drone.moveBack();
		}
		return drone.getFormatedCoordinates();
			
	}
	
}
