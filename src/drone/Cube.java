package drone;

public class Cube {
	private int [] minCoordinates;
	private int cubeSideLength;
	private int [] maxCoordinates;
	
	public Cube(int [] cubeStartCoordinates, int side)
	{
		minCoordinates = new int[] {cubeStartCoordinates[0], cubeStartCoordinates[1], cubeStartCoordinates[2]};
		cubeSideLength = side;
		maxCoordinates = new int [] {cubeStartCoordinates[0] + side, cubeStartCoordinates[1] + side, cubeStartCoordinates[2] + side};
	}
	
	public String getFormatedCoordinates() {
		return "("+minCoordinates[0]+","+minCoordinates[1]+","+minCoordinates[2]+")"+","+"("+maxCoordinates[0]+","+maxCoordinates[1]+","+maxCoordinates[2]+")";
	}

	public int[] getMinCoordinates() {
		return minCoordinates;
	}

	public int getCubeSideLength() {
		return cubeSideLength;
	}

	public int[] getMaxCoordinates() {
		return maxCoordinates;
	}

	public void setMinCoordinates(int[] minCoordinates) {
		this.minCoordinates = minCoordinates;
	}

	public void setCubeSideLength(int cubeSideLength) {
		this.cubeSideLength = cubeSideLength;
	}

	public void setMaxCoordinates(int[] maxCoordinates) {
		this.maxCoordinates = maxCoordinates;
	}
}
