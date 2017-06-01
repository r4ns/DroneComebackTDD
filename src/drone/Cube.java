package drone;

public class Cube {
	private int [] minCoordinates;
	private int [] maxCoordinates;
	private int lenghtCube;
	
	public Cube(int [] startCoordinate, int size){
		minCoordinates = new int[]{startCoordinate[0],startCoordinate[1],startCoordinate[2]};
		lenghtCube=size;
		maxCoordinates = new int[]{startCoordinate[0]+lenghtCube,startCoordinate[1]+lenghtCube,startCoordinate[2]+lenghtCube};
	}

	
	public int[] getMinCoordinates() {
		return minCoordinates;
	}

	public void setMinCoordinates(int[] minCoordinates) {
		this.minCoordinates = minCoordinates;
	}

	public int[] getMaxCoordinates() {
		return maxCoordinates;
	}

	public void setMaxCoordinates(int[] maxCoordinates) {
		this.maxCoordinates = maxCoordinates;
	}

	public int getLenghtCube() {
		return lenghtCube;
	}

	public void setLenghtCube(int lenghtCube) {
		this.lenghtCube = lenghtCube;
	}
	
	
}
