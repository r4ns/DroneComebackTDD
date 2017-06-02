package drone;

public class Cube {
	private int[] granice;
	private int stranica;
	
	public Cube(){
		
	}
	
	public Cube (int[] boundaries,int stranica){
		this.stranica=stranica;
		this.granice=boundaries;
	}
	
	public String getStartCoordinates() {
		return "("+granice[0]+","+granice[1]+","+granice[2]+")";
	}
	
	public boolean isInsideCube(Cube cube) {
		if(this.granice[0]>cube.getGranice()[0] && this.granice[1]>cube.getGranice()[1] && this.granice[2]>cube.getGranice()[2]){
			return true;
		}else{
			return false;
		}
			
	}
	
	public String toString(){
		return "Cube position: "+this.getStartCoordinates()+", length: "+this.stranica;
	}
	
	public void setStranica(int stranica) {
		this.stranica = stranica;
	}
	
	public int getStranica() {
		return stranica;
	}
	
	public void setGranice(int[] granice) {
		this.granice = granice;
	}
	
	public int[] getGranice() {
		return granice;
	}
	
	
}
