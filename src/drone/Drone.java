package drone;

public class Drone implements StandardDrone{
	int x = 30;
	int y = 0;
	int z = 30;
	public int[] droneCoordinates = {x,y,z};
	public Drone(){
		this.droneCoordinates = droneCoordinates;
	}
	
	@Override
	public String getFormatedCoordinates() {
		return "("+droneCoordinates[0] +", "+ droneCoordinates[1] +", "+ droneCoordinates[2] + ")";
	}
	
	@Override
	public String moveUp() {
		droneCoordinates[1]++;
		return getFormatedCoordinates();
	}

	@Override
	public String moveDown() {
		droneCoordinates[1]--;
		return getFormatedCoordinates();
	}

	@Override
	public String moveLeft() {
		droneCoordinates[0]--;
		return getFormatedCoordinates();
	}

	@Override
	public String moveRight() {
		droneCoordinates[0]++;
		return getFormatedCoordinates();
	}

	@Override
	public String moveBack() {
		droneCoordinates[2]++;
		return getFormatedCoordinates();
	}

	@Override
	public String moveForth() {
		droneCoordinates[2]--;
		return getFormatedCoordinates();
	}

	

}
