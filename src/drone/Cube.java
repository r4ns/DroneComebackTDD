package drone;

public class Cube {
	private int pocetnaKoordinata[];
	private int duzinaKocke;
	private int dijagonalnaKoordinata[];
	public Cube() {
		this.pocetnaKoordinata[0] = 0;
		this.pocetnaKoordinata[1] = 0;
		this.pocetnaKoordinata[2] = 0;
		this.duzinaKocke = 1;
		this.dijagonalnaKoordinata[0] = pocetnaKoordinata[0] + duzinaKocke;
		this.dijagonalnaKoordinata[1] = pocetnaKoordinata[1] + duzinaKocke;
		this.dijagonalnaKoordinata[2] = pocetnaKoordinata[2] + duzinaKocke;
		
	}
	public Cube(int [] pocetnaKoordinata, int duzinaKocke){
		this.pocetnaKoordinata[0] = pocetnaKoordinata[0];
		this.pocetnaKoordinata[1] = pocetnaKoordinata[1];
		this.pocetnaKoordinata[2] = pocetnaKoordinata[2];
		this.duzinaKocke = duzinaKocke;
		this.dijagonalnaKoordinata[0] = pocetnaKoordinata[0] + duzinaKocke;
		this.dijagonalnaKoordinata[1] = pocetnaKoordinata[1] + duzinaKocke;
		this.dijagonalnaKoordinata[2] = pocetnaKoordinata[2] + duzinaKocke;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("(%d,%d,%d) --> (%d,%d,%d)"
				, pocetnaKoordinata[0], pocetnaKoordinata[1], pocetnaKoordinata[2]
				, dijagonalnaKoordinata[0], dijagonalnaKoordinata[1], dijagonalnaKoordinata[2]);
	}
}
