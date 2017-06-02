package drone;

public class Drone implements StandardDrone{

	private int x;
	private int y;
	private int z;
	//private int[] coordinates;
	//private int[] boundaries;
	private int boundaries=50;
	private int r=10;
	
	
	public Drone (int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public String toString() {
		return "Drone: (" + Integer.toString(this.x) + ", " + Integer.toString(this.y) + ", " + Integer.toString(this.z) + ")";
	}
	
	@Override
	public String moveUp() {
		if ((y < r || (y >= boundaries - r & y < boundaries))) {
			y++;
			return getFormatedCoordinates();
		}
		else if(((x >= boundaries - r & x <= boundaries) || (z >= boundaries - r & z <= boundaries) || (x >= 0 & x <= r) || (z >= 0 & z <= r)) & (y < boundaries & y >= 0)){
			y++;
			return getFormatedCoordinates();
		}
		else{
			return getFormatedCoordinates();
		}
	}
		
	

	@Override
	public String moveDown() {
		if ((y < r || (y >= boundaries - r & y < boundaries))) {
			y--;
			return getFormatedCoordinates();
		}
		else if(((x >= boundaries - r & x <= boundaries) || (z >= boundaries - r & z <= boundaries) || (x >= 0 & x <= r) || (z >= 0 & z <= r)) & (y < boundaries & y >= 0)){
			y--;
			return getFormatedCoordinates();
		}
		else{
			return getFormatedCoordinates();
		}
	}

	@Override
	public String moveLeft() {
		if((x > 0 & x <= r) || (x > boundaries - r & x <= boundaries)){
			x--;
			return getFormatedCoordinates();
		}
		else if(((y >= boundaries - r & y <= boundaries) || (z >= boundaries - r & z <= boundaries) || (y >= 0 & y <= r) || (z >= 0 & z <= r)) & (x <= boundaries & x > 0)){
			x--;
			return getFormatedCoordinates();
		}
		else{
			return getFormatedCoordinates();
		}
	}

	@Override
	public String moveRight() {
		if ((x < r || (x >= boundaries - r & x < boundaries))) {
			x++;
			return getFormatedCoordinates();
		}
		else if(((y >= boundaries - r & y <= boundaries) || (z >= boundaries - r & z <= boundaries) || (y >= 0 & y <= r) || (z >= 0 & z <= r)) & (x < boundaries & x >= 0)){
			x++;
			return getFormatedCoordinates();
		}
		else{
			return getFormatedCoordinates();
		}
	}

	@Override
	public String moveBack() {
		if ((z < r || (z >= boundaries - r & z < boundaries))) {
			z++;
			return getFormatedCoordinates();
		}
		else if(((y >= boundaries - r & y <= boundaries) || (x >= boundaries - r & x <= boundaries) || (y >= 0 & y <= r) || (x >= 0 & x <= r)) & (z < boundaries & z >= 0)){
			z++;
			return getFormatedCoordinates();
		}
		else{
			return getFormatedCoordinates();
		}
	}

	@Override
	public String moveForth() {
		if((z > 0 & z <= r) || (z > boundaries - r & z <= boundaries)){
			z--;
			return getFormatedCoordinates();
		}
		else if(((y >= boundaries - r & y <= boundaries) || (x >= boundaries - r & x <= boundaries) || (y >= 0 & y <= r) || (x >= 0 & x <= r)) & (z < boundaries & z >= 0)){
			z--;
			return getFormatedCoordinates();
		}
		else{
			return getFormatedCoordinates();
		}
	}

	@Override
	public String getFormatedCoordinates() {
		return "Drone: (" + Integer.toString(this.x) + ", " + Integer.toString(this.y) + ", " + Integer.toString(this.z) + ")";
	
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}

}
