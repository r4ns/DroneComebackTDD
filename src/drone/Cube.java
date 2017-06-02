package drone;
 
 public class Cube {
	protected int[] startCoordinates;
	protected int length;
	
	public Cube() {
		
	}
	
	public Cube (int[] startCoordinates, int length) {
		this.startCoordinates = startCoordinates;
		this.length = length;
	}
	
	public String toString() {
		return "startCoordinates: {" + Integer.toString(this.startCoordinates[0]) +
				", " + Integer.toString(this.startCoordinates[1]) + 
				", " + Integer.toString(this.startCoordinates[2]) +
				"}, length: " + Integer.toString(this.length);
	}
 
	public int[] getStartCoordinates() {
		return startCoordinates;
	}

	public void setStartCoordinates(int[] startCoordinates) {
		this.startCoordinates = startCoordinates;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
 }