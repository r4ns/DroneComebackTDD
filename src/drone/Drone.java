package drone;

public class Drone implements StandardDrone{

	private int x,y,z;
	private FlySpace fs;
	
	public Drone(int x, int y, int z){
		this.x=x;
		this.y=y;
		this.z=z;

	}
	public Drone(int x, int y, int z, FlySpace fs) {
		this.x=x;
		this.y=y;
		this.z=z;
		this.fs=fs;
	}
	
	@Override
	public String moveUp() {
		if(y <= fs.getOuterCube().getMaxCoordinates()[1]&& fs.getOuterCube().getMinCoordinates()[1] >= y)
			y++;
		return getFormatedCoordinates();
	}

	@Override
	public String moveDown() {
		if( (fs.getOuterCube().getMinCoordinates()[1] < y && fs.getInnerCube().getMinCoordinates()[1])>=y )|| (y >=fs.getInnerCube().getMaxCoordinates()[1] && y<=fs.getOuterCube().getMaxCoordinates()[1]))
			y--;

		return getFormatedCoordinates();
	}

	@Override
	public String moveLeft() {
		if((x >= fs.getOuterCube().getMinCoordinates()[0]&& x<=fs.getInnerCube().getMinCoordinates()[0])|| (x >=fs.getInnerCube().getMaxCoordinates()[0] && x<=fs.getOuterCube().getMaxCoordinates()[0]))
			x--;
		return getFormatedCoordinates();
	}

	@Override
	public String moveRight() {
		if((x>= fs.getOuterCube().getMinCoordinates()[0]&& x<=fs.getInnerCube().getMinCoordinates()[0])|| (x >=fs.getInnerCube().getMaxCoordinates()[0]&&x+1<=fs.getOuterCube().getMaxCoordinates()[0]))
			x++;
		return getFormatedCoordinates();
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
		return "("+x+","+y+","+z+")";
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

	public FlySpace getFs() {
		return fs;
	}

	public void setFs(FlySpace fs) {
		this.fs = fs;
	}

}
