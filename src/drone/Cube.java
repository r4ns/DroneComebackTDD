package drone;

public class Cube {
	private Tacka goreLijevo;
	private int duzinaStranice;
	
	public Cube(Tacka goreLijevo, int duzinaStranice)
	{
		this.goreLijevo=goreLijevo;
		this.duzinaStranice=duzinaStranice;
	}

	public Tacka getGoreLijevo() {
		return goreLijevo;
	}

	public int getDuzinaStranice() {
		return duzinaStranice;
	}

	public void setGoreLijevo(Tacka goreLijevo) {
		this.goreLijevo = goreLijevo;
	}

	public void setDuzinaStranice(int duzinaStranice) {
		this.duzinaStranice = duzinaStranice;
	}

		
}
