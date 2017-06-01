package drone;

public class Cube {
	
	int tackaA [] = new int[3];
	int tackaB [] = new int[3];
	public Cube(int[] koor){
		tackaA = koor;
	}
	
	public Cube(int[] koor, int stranica){
		tackaA = koor;
		for(int i = 0; i < 3; i++)
			tackaB[i] = tackaA[i] + stranica;
	}
	
	public int[] getTackaA() {
		return tackaA;
	}

	public String getTackaAStr(){
		return "(" + tackaA[0] + "," + tackaA[1] + "," + tackaA[2] + ")";
		
	}

	public int[] getTackaB() {
		return tackaB;
	}
	
	public String getTackaBStr(){
		return "(" + tackaB[0] + "," + tackaB[1] + "," + tackaB[2] + ")";
		
	}

	public String getCubeStr() {
		return getTackaAStr() + getTackaBStr();
	}
}
