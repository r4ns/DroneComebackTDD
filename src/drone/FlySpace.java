package drone;

public class FlySpace {
	Cube spoljasnjaKocka;
	Cube unutrasnjaKocka;
	
	
	public FlySpace(Cube spoljasnjaK, Cube unutrasnjaK) {
		this.spoljasnjaKocka = spoljasnjaK;
		this.unutrasnjaKocka = unutrasnjaK;
	}
	
	public String getFormatedCoordinates() {
		return "" + spoljasnjaKocka + " : " + unutrasnjaKocka;
	}
}
