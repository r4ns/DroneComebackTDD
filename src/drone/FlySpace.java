package drone;

public class FlySpace {
	
	Cube spoljKocka;
	Cube unutKocka;
	
	public FlySpace() {
		
	}
	
	public FlySpace(Cube velika, Cube mala) {
		this.spoljKocka=velika;
		this.unutKocka=mala;
	}
	
	public String toString(){
		return spoljKocka.toString()+","+unutKocka.toString();
	}
	
	public Cube getSpoljKocka() {
		return spoljKocka;
	}
	
	public void setSpoljKocka(Cube spoljKocka) {
		this.spoljKocka = spoljKocka;
	}
	
	public Cube getUnutKocka() {
		return unutKocka;
	}
	
	public void setUnutKocka(Cube unutKocka) {
		this.unutKocka = unutKocka;
	}
}

