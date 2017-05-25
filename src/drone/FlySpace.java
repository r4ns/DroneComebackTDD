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

}
