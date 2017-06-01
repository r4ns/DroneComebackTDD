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
	
	public Cube(int [] pocetnaKoordinata1, int duzinaKocke) throws DroneException {
		if (pocetnaKoordinata1.length == 3) {
			this.pocetnaKoordinata = new int [] { pocetnaKoordinata1[0], pocetnaKoordinata1[1], pocetnaKoordinata1[2]};
			this.duzinaKocke = duzinaKocke;
			this.dijagonalnaKoordinata = new int [] { pocetnaKoordinata[0] + duzinaKocke, pocetnaKoordinata[1] + duzinaKocke, pocetnaKoordinata[2] + duzinaKocke};
		} else {
			throw new DroneException();
		}
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("(%d,%d,%d) --> (%d,%d,%d)"
				, pocetnaKoordinata[0], pocetnaKoordinata[1], pocetnaKoordinata[2]
				, dijagonalnaKoordinata[0], dijagonalnaKoordinata[1], dijagonalnaKoordinata[2]);
	}
}
