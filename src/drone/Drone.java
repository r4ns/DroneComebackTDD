package drone;

public class Drone implements StandardDrone{

	private FlySpace space;
	private int[] coordinates;
	
	public Drone(int[] coordinates) {
		this.coordinates = coordinates;
	}
	
	public Drone(FlySpace space, int[] coordinates) {
		this.space = space;
		this.coordinates = new int[] {coordinates[0],coordinates[1],coordinates[2]};
	}
	
	public Drone(Cube outer, Cube inner, int[] coordinates) {
		space = new FlySpace(outer, inner);
		this.coordinates = coordinates;
	}	
	
	@Override
	public String moveUp() {
		coordinates[1]++;
		return getFormatedCoordinates();
	}

	@Override
	public String moveDown() {
		coordinates[1]--;
		return getFormatedCoordinates();
	}

	@Override
	public String moveLeft() {
		coordinates[0]--;
		return getFormatedCoordinates();
	}

	@Override
	public String moveRight() {
		coordinates[0]++;
		return getFormatedCoordinates();
	}

	@Override
	public String moveBack() {
		coordinates[2]++;
		return getFormatedCoordinates();
	}

	@Override
	public String moveForth() {
		coordinates[2]--;
		return getFormatedCoordinates();
	}

	@Override
	public String getFormatedCoordinates() {
		return "(" + Integer.toString(coordinates[0]) + "," + Integer.toString(coordinates[1]) + "," + Integer.toString(coordinates[2]) + ")";
	}

}