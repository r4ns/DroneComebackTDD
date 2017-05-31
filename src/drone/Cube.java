package drone;

public class Cube {
	private int [] minCoordinates;
	private int [] maxCoordinates;
	private int duzinaStranice;
	
	public Cube(int [] startCoordinates, int duzinaStranice){
		this.minCoordinates= new int []{startCoordinates[0],startCoordinates[1],startCoordinates[2]};
		this.duzinaStranice=duzinaStranice;
		this.maxCoordinates= new int []{startCoordinates[0]+duzinaStranice,startCoordinates[1]+duzinaStranice,startCoordinates[2]+duzinaStranice};
	}
	
	public String toString(){
		return "("+this.minCoordinates[0]+", "+
				this.minCoordinates[1]+", "+
				this.minCoordinates[2]+"), "
				+this.duzinaStranice;
	}

	public int[] getMinCoordinates() {
		return minCoordinates;
	}

	public void setMinCoordinates(int[] minCoordinates) {
		this.minCoordinates =minCoordinates;
	}

	public int getDuzinaStranice() {
		return duzinaStranice;
	}

	public void setDuzinaStranice(int duzinaStranice) {
		this.duzinaStranice = duzinaStranice;
	}

	public int[] getMaxCoordinates() {
		return maxCoordinates;
	}

	public void setMaxCoordinates(int[] maxCoordinates) {
		this.maxCoordinates = maxCoordinates;
	}
	
	
}
