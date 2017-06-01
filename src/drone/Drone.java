package drone;

public class Drone implements StandardDrone{

	private FlySpace space;
	private int koordinateDrona [];
	
	public Drone (Cube spoljasnja, Cube unutrasnja, int [] koordinateDrona) {
		space = new FlySpace(spoljasnja, unutrasnja);
		this.koordinateDrona = koordinateDrona;
	}
	
	@Override
	public String moveUp() {
		koordinateDrona[1] += 1;
		return getFormatedCoordinates();
	}

	@Override
	public String moveDown() {
		koordinateDrona[1] -= 1;
		return getFormatedCoordinates();
	}

	@Override
	public String moveLeft() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String moveRight() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String moveBack() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String moveForth() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getFormatedCoordinates() {
		return "Drone position: (" + Integer.toString(koordinateDrona[0]) + ","
				+ Integer.toString(koordinateDrona[1]) + ","  
				+ Integer.toString(koordinateDrona[2]) + ")";	
		}

}
