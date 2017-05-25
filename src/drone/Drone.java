package drone;

public class Drone implements StandardDrone{

	int x=30;
	int y=0;
	int z=30;
	
	@Override
	public String moveUp() {
		y++;
		return getFormatedCoordinates();
	}

	@Override
	public String moveDown() {
		y--;
		return getFormatedCoordinates();
	}

	@Override
	public String moveLeft() {
		// TODO Auto-generated method stub
		x--;
		return getFormatedCoordinates();
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
		// TODO Auto-generated method stub
		return "("+x+","+y+","+z+")";
	}

}
