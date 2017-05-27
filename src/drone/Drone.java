package drone;

public class Drone implements StandardDrone{
	private int x;
	private int y;
	private int z;
	private FlySpace fs;
	
	
	public Drone(int x, int y, int z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	public Drone(int x, int y, int z, FlySpace fs) throws DroneException{
		if(fs.getVecaKocka().getMaxCoordinates()[0]<x ||fs.getVecaKocka().getMaxCoordinates()[1]<y||fs.getVecaKocka().getMaxCoordinates()[2]<z ||fs.getVecaKocka().getMinCoordinates()[1]>y)
			throw new DroneException();
		else if((fs.getManjaKocka().getMinCoordinates()[1]<y && fs.getManjaKocka().getMaxCoordinates()[1]>y))
			throw new DroneException();
		this.x=x;
		this.y=y;
		this.z=z;
		this.fs=fs;
	}
	

	@Override
	public String moveUp() {
		if(y + 1 <= fs.getVecaKocka().getMaxCoordinates()[1]&& y+1 <=fs.getManjaKocka().getMinCoordinates()[1])
		{
			y += 1;			
		}
		return getFormatedCoordinates();
		
	}

	@Override
	public String moveDown() {
		if((y - 1 >= fs.getVecaKocka().getMinCoordinates()[1]&& y-1<=fs.getManjaKocka().getMinCoordinates()[1])|| (y-1 >=fs.getManjaKocka().getMaxCoordinates()[1]&&y-1<=fs.getVecaKocka().getMaxCoordinates()[1]))
		{
			y -= 1;			
		}
		return getFormatedCoordinates();
	}

	@Override
	public String moveLeft() {
		if((x - 1 >= fs.getVecaKocka().getMinCoordinates()[0]&& x-1<=fs.getManjaKocka().getMinCoordinates()[0])|| (x-1 >=fs.getManjaKocka().getMaxCoordinates()[0]&&x-1<=fs.getVecaKocka().getMaxCoordinates()[0]))
		{
			x -= 1;			
		}
		return getFormatedCoordinates();
	}

	@Override
	public String moveRight() {
		if((x + 1 >= fs.getVecaKocka().getMinCoordinates()[0]&& x+1<=fs.getManjaKocka().getMinCoordinates()[0])|| (x+1 >=fs.getManjaKocka().getMaxCoordinates()[0]&&x+1<=fs.getVecaKocka().getMaxCoordinates()[0]))
		{
			x += 1;			
		}
		return getFormatedCoordinates();
	}

	@Override
	public String moveBack() {
		if((z - 1 >= fs.getVecaKocka().getMinCoordinates()[2]&& z-1<=fs.getManjaKocka().getMinCoordinates()[2])|| (z-1 >=fs.getManjaKocka().getMaxCoordinates()[2]&&z-1<=fs.getVecaKocka().getMaxCoordinates()[2]))
		{
			z -= 1;			
		}
		return getFormatedCoordinates();
	}

	@Override
	public String moveForth() {
		if((z + 1 >= fs.getVecaKocka().getMinCoordinates()[2]&& z+1<=fs.getManjaKocka().getMinCoordinates()[2])|| (z+1 >=fs.getManjaKocka().getMaxCoordinates()[2]&&z+1<=fs.getVecaKocka().getMaxCoordinates()[2]))
		{
			z += 1;			
		}
		return getFormatedCoordinates();
	}

	@Override
	public String getFormatedCoordinates() {
		return "("+x+","+y+","+z+")";
	}

}
