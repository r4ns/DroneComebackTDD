package drone;

public class FlySpace {

	Cube spoljasnjaKocka;
	Cube unutrasnjaKocka;
	
	public FlySpace() {
		
	}
	public FlySpace(Cube velikaKocka, Cube malaKocka) {
		this.spoljasnjaKocka=velikaKocka;
		this.unutrasnjaKocka=malaKocka;
	}
	public String toString(){
		return spoljasnjaKocka.toString()+","+unutrasnjaKocka.toString();
	}
	public Cube getSpoljasnjaKocka() {
		return spoljasnjaKocka;
	}
	public void setSpoljasnjaKocka(Cube spoljasnjaKocka) {
		this.spoljasnjaKocka = spoljasnjaKocka;
	}
	public Cube getUnutrasnjaKocka() {
		return unutrasnjaKocka;
	}
	public void setUnutrasnjaKocka(Cube unutrasnjaKocka) {
		this.unutrasnjaKocka = unutrasnjaKocka;
	}

	
	
}
