package drone;

public class FlySpace {
	private Cube velikaKocka;
	private Cube malaKocka;
	private int razmak;
	private Tacka dronic;
	
	public FlySpace(Cube velikaKocka, Cube malaKocka, int razmak)
	{
		this.velikaKocka=velikaKocka;
		this.malaKocka.getGoreLijevo().setX(this.velikaKocka.getGoreLijevo().getX()+razmak);
		this.malaKocka.getGoreLijevo().setY(this.velikaKocka.getGoreLijevo().getY()-razmak);
		this.malaKocka.getGoreLijevo().setZ(this.velikaKocka.getGoreLijevo().getZ()-razmak);
		this.malaKocka.setDuzinaStranice(this.velikaKocka.getDuzinaStranice()-2*razmak);
		this.razmak=razmak;
	}
	public FlySpace(Tacka dron)
	{
		this.dronic=dron;
	}
	
	public boolean provjera(int x,int y,int z)
	{
		if ((x< velikaKocka.getGoreLijevo().getX() && x > velikaKocka.getGoreLijevo().getX()+razmak &&
				y < velikaKocka.getGoreLijevo().getY() && y > velikaKocka.getGoreLijevo().getY()-razmak &&
				z < velikaKocka.getGoreLijevo().getZ() && z >velikaKocka.getGoreLijevo().getZ()-razmak) 
			&& (x> malaKocka.getGoreLijevo().getX() && x < malaKocka.getGoreLijevo().getX()+razmak &&
					y > malaKocka.getGoreLijevo().getY() && y< malaKocka.getGoreLijevo().getY()-razmak &&
					z > malaKocka.getGoreLijevo().getZ() && z< malaKocka.getGoreLijevo().getZ()-razmak))
			{
				return true;
			}
			else
			{
				return false;
			}		
		
	}

	public Cube getVelikaKocka() {
		return velikaKocka;
	}

	public Cube getMalaKocka() {
		return malaKocka;
	}

	public int getRazmak() {
		return razmak;
	}

	public void setVelikaKocka(Cube velikaKocka) {
		this.velikaKocka = velikaKocka;
	}

	public void setMalaKocka(Cube malaKocka) {
		this.malaKocka = malaKocka;
	}

	public void setRazmak(int razmak) {
		this.razmak = razmak;
	}
	
	
	

}
