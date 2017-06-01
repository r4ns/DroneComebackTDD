package drone;

public class Drone implements StandardDrone{
	
	protected int x;
	protected int y;
	protected int z;
	protected int razmakKocki = 10;
	protected int granica = 50;
	
	public Drone () {
		
	}
	
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
		if ((y < razmakKocki || (y >= granica - razmakKocki & y < granica))) {
			y++;
			return getFormatedCoordinates();
		}
		else if(((x >= granica - razmakKocki & x <= granica) || (z >= granica - razmakKocki & z <= granica) || (x >= 0 & x <= razmakKocki) || (z >= 0 & z <= razmakKocki)) & (y < granica & y >= 0)){
			y++;
			return getFormatedCoordinates();
		}
		else{
			return getFormatedCoordinates();
		}
	}

	@Override
	public String moveDown() {
		if((y > 0 & y <= razmakKocki) || (y > granica - razmakKocki & y <= granica)){
			y--;
			return getFormatedCoordinates();
		}
		else if(((x >= granica - razmakKocki & x <= granica) || (z >= granica - razmakKocki & z <= granica) || (x >= 0 & x <= razmakKocki) || (z >= 0 & z <= razmakKocki)) & (y <= granica & y > 0)){
			y--;
			return getFormatedCoordinates();
		}
		else{
			return getFormatedCoordinates();
		}
	}

	@Override
	public String moveLeft() {
		if((x > 0 & x <= razmakKocki) || (x > granica - razmakKocki & x <= granica)){
			x--;
			return getFormatedCoordinates();
		}
		else if(((y >= granica - razmakKocki & y <= granica) || (z >= granica - razmakKocki & z <= granica) || (y >= 0 & y <= razmakKocki) || (z >= 0 & z <= razmakKocki)) & (x <= granica & x > 0)){
			x--;
			return getFormatedCoordinates();
		}
		else{
			return getFormatedCoordinates();
		}
	}

	@Override
	public String moveRight() {
		if ((x < razmakKocki || (x >= granica - razmakKocki & x < granica))) {
			x++;
			return getFormatedCoordinates();
		}
		else if(((y >= granica - razmakKocki & y <= granica) || (z >= granica - razmakKocki & z <= granica) || (y >= 0 & y <= razmakKocki) || (z >= 0 & z <= razmakKocki)) & (x < granica & x >= 0)){
			x++;
			return getFormatedCoordinates();
		}
		else{
			return getFormatedCoordinates();
		}
	}

	@Override
	public String moveBack() {
		if ((z < razmakKocki || (z >= granica - razmakKocki & z < granica))) {
			z++;
			return getFormatedCoordinates();
		}
		else if(((y >= granica - razmakKocki & y <= granica) || (x >= granica - razmakKocki & x <= granica) || (y >= 0 & y <= razmakKocki) || (x >= 0 & x <= razmakKocki)) & (z < granica & z >= 0)){
			z++;
			return getFormatedCoordinates();
		}
		else{
			return getFormatedCoordinates();
		}
	}

	@Override
	public String moveForth() {
		if((z > 0 & z <= razmakKocki) || (z > granica - razmakKocki & z <= granica)){
			z--;
			return getFormatedCoordinates();
		}
		else if(((y >= granica - razmakKocki & y <= granica) || (x >= granica - razmakKocki & x <= granica) || (y >= 0 & y <= razmakKocki) || (x >= 0 & x <= razmakKocki)) & (z < granica & z >= 0)){
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

}
