package drone;

public class Drone implements StandardDrone{

	int[] coordinates;
	
	public Drone(int[] coordinates) {
		// TODO Auto-generated constructor stub
		this.coordinates[0] = coordinates[0];
		this.coordinates[1] = coordinates[1];
		this.coordinates[2] = coordinates[2];
	}

	@Override
	public String moveUp() {
		// TODO Auto-generated method stub
		this.coordinates[1] += 1;
		return null;
	}

	@Override
	public String moveDown() {
		// TODO Auto-generated method stub
		this.coordinates[1] -= 1;
		return null;
	}

	@Override
	public String moveLeft() {
		// TODO Auto-generated method stub
		this.coordinates[0] += 1;
		return null;
	}

	@Override
	public String moveRight() {
		// TODO Auto-generated method stub
		this.coordinates[0] -= 1;
		return null;
	}

	@Override
	public String moveBack() {
		// TODO Auto-generated method stub
		this.coordinates[2] += 1;
		return null;
	}

	@Override
	public String moveForth() {
		// TODO Auto-generated method stub
		this.coordinates[2] -= 1;
		return null;
	}

	@Override
	public String getFormatedCoordinates() {
		// TODO Auto-generated method stub
		return null;
	}

}
