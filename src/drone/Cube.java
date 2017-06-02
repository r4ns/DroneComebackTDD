package drone;

public class Cube {

	private int [] minCoordinates;
	private int cubeSideLength;
	private int [] maxCoordinates;
	
	
	public Cube(int [] startCoordinates, int side)
	{

		minCoordinates = startCoordinates;
		cubeSideLength = side;
		maxCoordinates = new int [] {startCoordinates[0] + side, startCoordinates[1] + side,startCoordinates[2] + side};

	}
	
	public String getFormatedCoordinates() {
		return "("+minCoordinates[0]+","+minCoordinates[1]+","+minCoordinates[2]+")"
				+","+"("+maxCoordinates[0]+","+maxCoordinates[1]+","+maxCoordinates[2]+")";
		
	}

	public int[] getMinCoordinates() {
		return minCoordinates;
	}

	public void setMinCoordinates(int[] minCoordinates) {
		this.minCoordinates = minCoordinates;
	}

	public int getCubeSideLength() {
		return cubeSideLength;
	}

	public void setCubeSideLength(int cubeSideLength) {
		this.cubeSideLength = cubeSideLength;
	}

	public int[] getMaxCoordinates() {
		return maxCoordinates;
	}

	public void setMaxCoordinates(int[] maxCoordinates) {
		this.maxCoordinates = maxCoordinates;
	}
	
}
