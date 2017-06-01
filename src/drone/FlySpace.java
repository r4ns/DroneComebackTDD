package drone;

public class FlySpace {
	
	private Cube spoljasnjeGranice;
	private Cube unutrasnjeGranice;
	
	public FlySpace(){
		
	}
	public FlySpace(Cube spoljasnjeGranice,Cube unutrasnjeGranice){
		this.spoljasnjeGranice=spoljasnjeGranice;
		this.unutrasnjeGranice=unutrasnjeGranice;
		
	}
	public String getFormatedCoordinates() {
		return "" + spoljasnjeGranice + " : " + unutrasnjeGranice;
	}
	public Cube getSpoljasnjeGranice() {
		return spoljasnjeGranice;
	}
	public Cube getUnutrasnjeGranice() {
		return unutrasnjeGranice;
	}
	public void setSpoljasnjeGranice(Cube spoljasnjeGranice) {
		this.spoljasnjeGranice = spoljasnjeGranice;
	}
	public void setUnutrasnjeGranice(Cube unutrasnjeGranice) {
		this.unutrasnjeGranice = unutrasnjeGranice;
	}
}
