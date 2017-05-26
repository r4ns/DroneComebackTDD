package drone;

public class Drone implements StandardDrone{
	
	private int x=0;
	private int y=0;
	private int z=0;
	private int razmak = 10;
	private int granica = 50;

	public Drone(int x, int y, int z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}

	@Override
	public String moveUp() {
		if(y>0 & y< razmak || (y>=granica-razmak && y<granica)){
			this.y++;
			return getFormatedCoordinates();
		}
		else if (((x>=granica-razmak & x<=granica) 
				|| (z>=granica-razmak & z<=granica)
				|| (x>=0 & x<=razmak)|| (z>=0 && z<=razmak)) & (y<granica & y>=0)){
			this.y++;
			return getFormatedCoordinates();
		}
		else
			return getFormatedCoordinates();
	}

	@Override
	public String moveDown() {
		if(y>0 & y< razmak || (y>granica-razmak && y<=granica)){
			this.y--;
			return getFormatedCoordinates();
		}
		else if (((x>=granica-razmak & x<=granica) 
				|| (z>=granica-razmak & z<=granica)
				|| (x>=0 & x<=razmak)|| (z>=0 && z<=razmak)) & (y<=granica & y>0)){
			this.y--;
			return getFormatedCoordinates();
		}
		else
			return getFormatedCoordinates();
	}

	@Override
	public String moveLeft() {
		if(x>0 & x< razmak || (x>=granica-razmak && x<granica)){
			this.x++;
			return getFormatedCoordinates();
		}
		else if (((y>=granica-razmak & y<=granica) 
				|| (z>=granica-razmak & z<=granica)
				|| (y>=0 & y<=razmak)|| (z>=0 && z<=razmak)) & (x<granica & x>=0)){
			this.x++;
			return getFormatedCoordinates();
		}
		else
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
		return "Drone: ("+this.x+","+this.y+","+this.z+")";
	}

}
