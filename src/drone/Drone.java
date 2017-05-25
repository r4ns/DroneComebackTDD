package drone;

public class Drone implements StandardDrone{
	
	public int[]coordinates={30,0,30};
	public int[]boundaries;
	
	public Drone(int[]coordinates){
		this.coordinates=coordinates;
	}
	
	public Drone(int[]boundaries,int[]coordinates){
		this.boundaries=boundaries;
		this.coordinates=coordinates;
	}

	@Override
	public String moveUp() {
		
		return null;
	}

	@Override
	public String moveDown() {
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		return null;
	}

}
