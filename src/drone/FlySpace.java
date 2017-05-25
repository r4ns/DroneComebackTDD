package drone;

public class FlySpace {
	
	private Cube velikaKocka;
	private Cube malaKocka;
	public int granica=0;

	public FlySpace(){
		
	}

	public FlySpace(Cube velikaKocka, Cube malaKocka, int granica) {
		
		this.velikaKocka = velikaKocka;
		this.malaKocka = malaKocka;
		this.granica = granica;
	}
	
	

}
