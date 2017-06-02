package drone;

public class FlySpace {
	Cube velikaKocka;
	Cube malaKocka;
	
	
	public FlySpace(Cube spoljasnjaK, Cube unutrasnjaK) {
		this.velikaKocka = spoljasnjaK;
		this.malaKocka = unutrasnjaK;
	}
	
	public String getFormatedCoordinates() {
		return "" + velikaKocka + " : " + malaKocka;
	}
}
