package drone;

public class Drone implements StandardDrone{
	
	private int position[];
	

	@Override
	public String moveUp() {
		position[1] += 1;
		return getFormatedCoordinates();
	}

	@Override
	public String moveDown() {
		position[1] -= 1;
		return getFormatedCoordinates();
	}

	@Override
	public String moveLeft() {
		position[0] -= 1;
		return getFormatedCoordinates();
	}

	@Override
	public String moveRight() {
		position[0] += 1;
		return getFormatedCoordinates();
	}

	@Override
	public String moveBack() {
		position[2] += 1;
		return getFormatedCoordinates();
	}

	@Override
	public String moveForth() {
		position[2] -= 1;
		return getFormatedCoordinates();
	}

	@Override
	public String getFormatedCoordinates() {
		return "Drone position: (" + Integer.toString(position[0]) + ","
				+ Integer.toString(position[1]) + ","  
				+ Integer.toString(position[2]) + ")";	
		}

}
