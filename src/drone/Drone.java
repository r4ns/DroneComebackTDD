package drone;

public class Drone implements StandardDrone{
	private int x, y, z;
	private FlySpace fs;
	public Drone(int x, int y, int z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	public Drone(int x, int y, int z, FlySpace fs)throws DroneException{
		if(fs.getBig().getMaxCoordinates()[0]<x || fs.getBig().getMaxCoordinates()[1]<y || fs.getBig().getMinCoordinates()[1]>y || fs.getBig().getMaxCoordinates()[2]<z)
			throw new DroneException();
		else if(fs.getSmall().getMaxCoordinates()[1]>y && fs.getSmall().getMinCoordinates()[1]<y)
			throw new DroneException();
		this.x=x;
		this.y=y;
		this.z=z;
		this.fs=fs;
	}
	@Override
	public String moveUp() {
		if(y+1<=fs.getBig().getMaxCoordinates()[1] && y+1<=fs.getSmall().getMinCoordinates()[1])
			y++;
		
		return getFormatedCoordinates();
	}

	@Override
	public String moveDown() {
		if((y-1>=fs.getBig().getMinCoordinates()[1] && y-1<=fs.getSmall().getMinCoordinates()[1]) ||
			y-1>=fs.getBig().getMaxCoordinates()[1] && y-1<=fs.getSmall().getMaxCoordinates()[1])
			y--;
		return getFormatedCoordinates();
	}

	@Override
	public String moveLeft() {
		if(x-1>=fs.getBig().getMinCoordinates()[0] && (x-1<=fs.getSmall().getMinCoordinates()[0] || x-1>=fs.getSmall().getMaxCoordinates()[0]))
			x--;
		return getFormatedCoordinates();

	}

	@Override
	public String moveRight() {
		if(x+1<=fs.getBig().getMaxCoordinates()[0] && (x+1<=fs.getSmall().getMinCoordinates()[0] || x+1>=fs.getSmall().getMaxCoordinates()[0]))
			x++;
				return getFormatedCoordinates();
	}

	@Override
	public String moveBack() {
		if(z-1>=fs.getBig().getMinCoordinates()[2] && (z-1<=fs.getSmall().getMinCoordinates()[2] || z-1>=fs.getSmall().getMaxCoordinates()[2]))
			z--;
		return getFormatedCoordinates();
	}

	@Override
	public String moveForth() {
		if(z+1<=fs.getBig().getMaxCoordinates()[2] && (z+1<=fs.getSmall().getMinCoordinates()[2] || z+1>=fs.getSmall().getMaxCoordinates()[2]))
			z++;
				return getFormatedCoordinates();
	}

	@Override
	public String getFormatedCoordinates() {
		return "("+x+","+y+","+z+")";
	}

}
