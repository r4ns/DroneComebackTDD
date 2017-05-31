package drone;

public class Cube {
	
	public int startCoordinates[];
	private int length;
	
	
	
	public Cube(int[] startCoordinates, int length){
		
		this.startCoordinates=startCoordinates;
		this.length=length;
		
	}
	
	public String toString(){
		
		return "Cube position: " + getStringStartCoordiantes() + " length: " + length;
	}


	
	
	public String getStringStartCoordiantes(){
		
		return "(" + startCoordinates[0] + "," + startCoordinates[1] + "," + startCoordinates[2] + ")";
		
		
	}
	
	public boolean checkIn(Cube cube){
		
		if(cube.getStartCoordinates()[0] > this.startCoordinates[0] && cube.getStartCoordinates()[1] > this.startCoordinates[1] && cube.getStartCoordinates()[2] > this.startCoordinates[2]){
			
			return true; 
		}
		
		return false;
	}


	public void setStartCoordiantes(int[] startCoordiantes) {
		this.startCoordinates = startCoordiantes;
	}


	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}

	public int[] getStartCoordinates() {
		return startCoordinates;
	}

	public void setStartCoordinates(int[] startCoordinates) {
		this.startCoordinates = startCoordinates;
	}
	
	

}
