package drone;

public class Drone implements StandardDrone{

	private FlySpace prostor;
	private int[] pozicija;
	
	public Drone(int[] pozicija){
		
		this.pozicija=pozicija;
		
	}
	public Drone(FlySpace prostor,int[] pozicija){
		this.prostor=prostor;
		this.pozicija=new int[]{pozicija[0],pozicija[1],pozicija[2]};
	}
	public Drone (Cube spoljasnja, Cube unutrasnja, int [] koordinateDrona) {
		prostor = new FlySpace(spoljasnja, unutrasnja);
		pozicija = koordinateDrona;
	}
	
	@Override
	public String moveUp() {
		pozicija[1]++;
		return getFormatedCoordinates();
	}

	@Override
	public String moveDown() {
		// TODO Auto-generated method stub
		pozicija[1]--;
		return getFormatedCoordinates();
	}

	@Override
	public String moveLeft() {
		pozicija[0]--;
		return getFormatedCoordinates();
	}

	@Override
	public String moveRight() {
		pozicija[0]++;
		return getFormatedCoordinates();
	}

	@Override
	public String moveBack() {
		pozicija[2]++;
		return getFormatedCoordinates();
	}

	@Override
	public String moveForth() {
		pozicija[2]--;
		return getFormatedCoordinates();
	}

	@Override
	public String getFormatedCoordinates() {
		// TODO Auto-generated method stub
		return "("+Integer.toString(pozicija[0])+","+Integer.toString(pozicija[1])+","+
				Integer.toString(pozicija[2])+")";
	}
	

}
