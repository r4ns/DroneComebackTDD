package drone;

public class Cube {
	
	public int[] minCoordinates;
	public int[] maxCoordinates;
	int side;
	public Cube(int[] array, int side) {
		// TODO Auto-generated constructor stub
		minCoordinates = array;
		maxCoordinates = new int[minCoordinates.length];
		for (int i = 0; i < minCoordinates.length; i++)
			maxCoordinates[i] = minCoordinates[i] + side;
		this.side = side;
		
	}
	public String toString(){
		return "Start coordinates:({"+ minCoordinates[0] +", "+ minCoordinates[1] +", "+ minCoordinates[2] +"}, "+ side + ")";
	}

}
