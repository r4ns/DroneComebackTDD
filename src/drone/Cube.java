package drone;

public class Cube {
	private int [] startCoordinates;
	private int duzinaStranice;
	
	public Cube(int [] startCoordinates, int duzinaStranice){
		this.startCoordinates=startCoordinates;
		this.duzinaStranice=duzinaStranice;
	}
	
	public String toString(){
		return "Start coordinates:({"+this.startCoordinates[0]+", "+
				this.startCoordinates[1]+", "+
				this.startCoordinates[2]+"}, "
				+this.duzinaStranice+")";
	}

	public int[] getStartCoordinates() {
		return startCoordinates;
	}

	public void setStartCoordinates(int[] startCoordinates) {
		this.startCoordinates = startCoordinates;
	}

	public int getDuzinaStranice() {
		return duzinaStranice;
	}

	public void setDuzinaStranice(int duzinaStranice) {
		this.duzinaStranice = duzinaStranice;
	}
	
	
}
