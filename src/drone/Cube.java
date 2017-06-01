package drone;

public class Cube {
	
	private int[] maxKoordinate;
	private int stranica;
	private int[] minKoordinate;
	
	public Cube(){
		
	}
	public Cube(int[] pocetneKoordinate,int stranica){
		
		this.minKoordinate=new int[]{pocetneKoordinate[0],pocetneKoordinate[1],pocetneKoordinate[2]};
		this.stranica=stranica;
		this.maxKoordinate=new int[]{pocetneKoordinate[0]+stranica,pocetneKoordinate[1]+stranica,pocetneKoordinate[2]+stranica};
	}
	
	public int[] getMaxKoordinate() {
		return maxKoordinate;
	}
	public int getStranica() {
		return stranica;
	}
	public int[] getMinKoordinate() {
		return minKoordinate;
	}
	public void setMaxKoordinate(int[] maxKoordinate) {
		this.maxKoordinate = maxKoordinate;
	}
	public void setStranica(int stranica) {
		this.stranica = stranica;
	}
	public void setMinKoordinate(int[] minKoordinate) {
		this.minKoordinate = minKoordinate;
	}
}
