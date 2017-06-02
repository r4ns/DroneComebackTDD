package drone;

public class FlySpace {
	Cube velikaKocka;
	Cube malaKocka;
	private int granica;
	public FlySpace()
	{

	}

	public FlySpace(Cube velikaKocka, Cube malaKocka, int granica)
	{
		this.velikaKocka=velikaKocka;
		this.malaKocka=malaKocka;
		this.granica=granica;
	}

	public Cube getVelikaKocka() {
		return velikaKocka;
	}

	public Cube getMalaKocka() {
		return malaKocka;
	}

	public int getGranica() {
		return granica;
	}

	public void setVelikaKocka(Cube velikaKocka) {
		this.velikaKocka = velikaKocka;
	}

	public void setMalaKocka(Cube malaKocka) {
		this.malaKocka = malaKocka;
	}

	public void setGranica(int granica) {
		this.granica = granica;
	}
}
