package drone;

public class FlySpace {
	private Cube vecaKocka;
	private Cube manjaKocka;
	public Cube getVecaKocka() {
		return vecaKocka;
	}
	public void setVecaKocka(Cube vecaKocka) {
		this.vecaKocka = vecaKocka;
	}
	public Cube getManjaKocka() {
		return manjaKocka;
	}
	public void setManjaKocka(Cube manjaKocka) {
		this.manjaKocka = manjaKocka;
	}
	public FlySpace(Cube vecaKocka, Cube manjaKocka){
		this.vecaKocka=vecaKocka;
		this.manjaKocka=manjaKocka;
	}
	public String getFormatedCoordinates() {
		return vecaKocka.getFormatedCoordinates()+","+manjaKocka.getFormatedCoordinates();
	}
}
