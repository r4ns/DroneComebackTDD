package drone;

public class Cube {

	private int[] minCoordinates;
	private int[] maxCoordinates;
	private int lenghtCube;
	
	public Cube(int[] startCoordinates, int size) {
		minCoordinates = new int[]{startCoordinates[0],startCoordinates[1],startCoordinates[2]};
		lenghtCube = size;
		maxCoordinates = new int[]{startCoordinates[0] + size,startCoordinates[1] + size,startCoordinates[2] + size};
	}

	public int[] getMinCoordinates() {
		return minCoordinates;
	}

	public int[] getMaxCoordinates() {
		return maxCoordinates;
	}

	public int getLenghtCube() {
		return lenghtCube;
	}

	public void setMinCoordinates(int[] minCoordinates) {
		this.minCoordinates = minCoordinates;
	}

	public void setMaxCoordinates(int[] maxCoordinates) {
		this.maxCoordinates = maxCoordinates;
	}

	public void setLenghtCube(int lenghtCube) {
		this.lenghtCube = lenghtCube;
	}
	
	
	
}