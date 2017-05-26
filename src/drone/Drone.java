package drone;

public class Drone implements StandardDrone{
		
	private int x;
	private int y;
	private int z;
	
	public Drone(){
		x = 30;
		y = 0;
		z = 30;
	}
	@Override
	public String moveUp() {
		y++;
		return null;
	}

	@Override
	public String moveDown() {
		if(y != 0)
			y--;
		return null;
	}

	@Override
	public String moveLeft() {
		x--;
		return null;
	}

	@Override
	public String moveRight() {
		x++;
		return null;
	}

	@Override
	public String moveBack() {
		z++;
		return null;
	}

	@Override
	public String moveForth() {
		z--;
		return null;
	}

	@Override
	public String getFormatedCoordinates() {
		return "(" + this.x + ", " + this.y + ", " + this.z + ")";
	}

}
