package drone;

public class Cube {
	private int [] minGranice;
	private int [] maxGranice;
	private int duzinaStranice;
	
	public Cube(int [] pocetneKordinate, int duzinaStranice){
		minGranice = new int [] {pocetneKordinate[0], pocetneKordinate[1], pocetneKordinate[2]};
		maxGranice = new int [] {pocetneKordinate[0]+duzinaStranice, pocetneKordinate[1]+duzinaStranice, pocetneKordinate[2]+duzinaStranice};
		this.duzinaStranice=duzinaStranice;
	}
	public String getFormatedCoordinates(){
		return "("+minGranice[0]+","+minGranice[1]+","+minGranice[2]+"),("+
				maxGranice[0]+","+maxGranice[1]+","+maxGranice[2]+")";
	}
	public int[] getMinCoordinates() {
		return minGranice;
	}
	public int[] getMaxCoordinates() {
		return maxGranice;
	}
}
