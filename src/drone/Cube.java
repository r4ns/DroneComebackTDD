package drone;

public class Cube {
	private int [] minCoordinates;
	private int [] maxCoordinates;
	private int length;
	
	public Cube(int [] startCoordinates, int length){
		minCoordinates = new int [] {startCoordinates[0], startCoordinates[1], startCoordinates[2]};
		maxCoordinates = new int [] {startCoordinates[0]+length, startCoordinates[1]+length, startCoordinates[2]+length};
		this.length=length;
	}
	public String getFormatedCoordinates(){
		return "("+minCoordinates[0]+","+minCoordinates[1]+","+minCoordinates[2]+"),("+
				maxCoordinates[0]+","+maxCoordinates[1]+","+maxCoordinates[2]+")";
	}
	public int[] getMinCoordinates() {
		return minCoordinates;
	}
	public int[] getMaxCoordinates() {
		return maxCoordinates;
	}
	
}
