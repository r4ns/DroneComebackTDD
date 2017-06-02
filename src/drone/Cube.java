 package drone;
  
  public class Cube {
 
 	
 	private int[] boundaries;
 	private int stranica;
 	
 	
 	public Cube(){
 		
 	}
 	public Cube (int[] boundaries,int stranica){
 		
 		this.boundaries=boundaries;
 		this.stranica=stranica;
 		
 	}
 	public String getStartCoordinates() {
 		
 		return "(" + boundaries[0] + "," + boundaries[1] + "," + boundaries[2] + ")";
 	}
 	public String toString(){
 		
 		return "Cube position: " + this.getStartCoordinates() + ", length: " + this.stranica;
 	}
 	public boolean isInsideCube(Cube cube) {
 		
 		if(this.boundaries[0]>cube.getBoundaries()[0] && this.boundaries[1]>cube.getBoundaries()[1] && this.boundaries[2]>cube.getBoundaries()[2])
 		{
 			return true;
 			
 		}else
 			return false;
 		
 	}
 	
 	public int[] getBoundaries() {
 		return boundaries;
 	}
 	public void setBoundaries(int[] boundaries) {
 		this.boundaries = boundaries;
 	}
 	public int getStranica() {
 		return stranica;
 	}
 	public void setStranica(int stranica) {
 		this.stranica = stranica;
 	}
 	
 	
 	
  }