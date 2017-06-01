package drone;

public class FlySpace {
	private Cube big;
	private Cube small;
	
	public FlySpace(Cube bigger, Cube smaller){
		big=bigger;
		small=smaller;
	}
	public String getFormatedCoordinates(){
		return big.getFormatedCoordinates() + ";" + small.getFormatedCoordinates();
	}
	public Cube getBig() {
		return big;
	}
	public Cube getSmall() {
		return small;
	}
	
}
