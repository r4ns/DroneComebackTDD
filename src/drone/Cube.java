package drone;

public class Cube {
	
	int duzinaStranice;
	Tacka doleLevoNapred;
	Tacka goreDesnoNazad;
	
	public Cube()
	{}
	
	public Cube(int duzinaStranice, Tacka doleLevoNapred, Tacka goreDesnoNazad)
	{
		setDuzinaStranice(duzinaStranice);
		setDoleLevoNapred(doleLevoNapred);
		setGoreDesnoNazad(goreDesnoNazad);
	}
	
	
	
	
	//////////////GETTERS AND SETTERS////////////////////////
	
	
	public int getDuzinaStranice() {
		return duzinaStranice;
	}

	public void setDuzinaStranice(int duzinaStranice) {
		this.duzinaStranice = duzinaStranice;
	}

	public Tacka getDoleLevoNapred() {
		return doleLevoNapred;
	}

	public void setDoleLevoNapred(Tacka doleLevoNapred) {
		this.doleLevoNapred = doleLevoNapred;
	}

	public Tacka getGoreDesnoNazad() {
		return goreDesnoNazad;
	}

	public void setGoreDesnoNazad(Tacka goredesnoNazad) {
		this.goreDesnoNazad = goredesnoNazad;
	}
}
