package drone;

public class Cube {
	
	private int [] minCoordinates;
	private int [] maxCoordinates;
	private int sideLength;
	
	public Cube(int [] startCoordinates, int side)
	{
		minCoordinates = new int[] {startCoordinates[0], startCoordinates[1], startCoordinates[2]};
		sideLength = side;
		maxCoordinates = new int [] {startCoordinates[0] + side, startCoordinates[1] + side, startCoordinates[2] + side};
	}
}
