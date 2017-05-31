package drone;

public class Drone implements StandardDrone{
	
	private int x=0;
	private int y=0;
	private int z=0;
	private int razmak = 10;
	private int granica = 50;
	private FlySpace space;

	public Drone(int x, int y, int z, FlySpace space) throws DroneException {
		if(space.getOuterCube().getMaxCoordinates()[0]<x ||space.getOuterCube().getMaxCoordinates()[1]<y||space.getOuterCube().getMaxCoordinates()[2]<z ||space.getOuterCube().getMinCoordinates()[1]>y)
				throw new DroneException();
			else if((space.getInnerCube().getMinCoordinates()[1]<y && space.getInnerCube().getMaxCoordinates()[1]>y))
				throw new DroneException();
		this.x=x;
		this.y=y;
		this.z=z;
		this.space=space;
	}
	
	public Drone(int x, int y, int z){
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
		if(y>0 & y<=razmak || (y>granica-razmak && y<=granica)){
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
		if(x>0 & x<=razmak || (x>granica-razmak && x<=granica)){
			this.x--;
			return getFormatedCoordinates();
		}
		else if (((y>=granica-razmak & y<=granica) 
				|| (z>=granica-razmak & z<=granica)
				|| (y>=0 & y<=razmak)|| (z>=0 && z<=razmak)) & (x<=granica & x>0)){
			this.x--;
			return getFormatedCoordinates();
		}
		else
			return getFormatedCoordinates();
	}

	@Override
	public String moveRight() {
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
	public String moveBack() {
			if(z>0 & z< razmak || (z>=granica-razmak && z<granica)){
				this.z++;
				return getFormatedCoordinates();
			}
			else if (((y>=granica-razmak & y<=granica) 
					|| (x>=granica-razmak & x<=granica)
					|| (y>=0 & y<=razmak)|| (x>=0 && x<=razmak)) & (z<granica & z>=0)){
				this.z++;
				return getFormatedCoordinates();
			}
			else
				return getFormatedCoordinates();
	}

	@Override
	public String moveForth() {
		if(z>0 & z<=razmak || (z>granica-razmak && z<=granica)){
			this.z--;
			return getFormatedCoordinates();
		}
		else if (((y>=granica-razmak & y<=granica) 
				|| (x>=granica-razmak & x<=granica)
				|| (y>=0 & y<=razmak)|| (x>=0 && x<=razmak)) & (z<=granica & z>0)){
			this.z--;
			return getFormatedCoordinates();
		}
		else
			return getFormatedCoordinates();
	}

	@Override
	public String getFormatedCoordinates() {
		return "Drone: ("+this.x+","+this.y+","+this.z+")";
	}

}
