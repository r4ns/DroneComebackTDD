package drone;

public class FlySpace {
	
	private Cube velikaKocka;
	private Cube malaKocka;
	
	public FlySpace(Cube bigger, Cube smaller){
		velikaKocka=bigger;
		malaKocka=smaller;
	}
	public String getFormatedCoordinates(){
		return velikaKocka.getFormatedCoordinates() + ";" + malaKocka.getFormatedCoordinates();
	}
	public Cube getVelikaKocka() {
		return velikaKocka;
	}
	public Cube getMalaKocka() {
		return malaKocka;
	}
	
}
