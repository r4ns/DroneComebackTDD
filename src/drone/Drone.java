package drone;

public class Drone implements StandardDrone{

	int x;
	int y;
	int z;
	FlySpace flySpace;
	
	public Drone()
	{
		
	}
	
	public Drone (int x, int y, int z, FlySpace flySpaceNew)
	{
		setX(x);
		setY(y);
		setZ(z);
		
		Cube outter = new Cube(50, new Tacka(0,0,0), new Tacka(50,50,50));
		Cube inner = new Cube(30, new Tacka(10,10,10), new Tacka (40,40,40));
		
		flySpaceNew.setOutterCube(outter);
		flySpaceNew.setInnerCube(inner);
		
		setFlySpace(flySpaceNew);
	}
	
	@Override
	public String moveUp() {

		// Proveravamo da li je ispod/iznad unutrasnje kocke
		if ((x >= flySpace.innerCube.getDoleLevoNapred().getX() && x <= flySpace.innerCube.getGoreDesnoNazad().getX())
				&& (z >= flySpace.innerCube.getDoleLevoNapred().getZ()
						&& z <= flySpace.innerCube.getGoreDesnoNazad().getZ()))
		{
			// Proveravamo da li je ispod unutrasnje kocke
			if(y < flySpace.innerCube.getDoleLevoNapred().getY())
			{
				setY(getY()+1);
			}
			// Proveravamo da li je iznad unutrasnje kocke
			else if (y >= flySpace.innerCube.getGoreDesnoNazad().getY() && y < flySpace.outterCube.getGoreDesnoNazad().getY())
			{
				setY(getY()+1);
			}
		}
		return "Drone position: (" + getX() + "," + getY() + "," + getZ() + ")";
	}

	@Override
	public String moveDown() {
		// TODO Auto-generated method stub
		return "Drone position: (" + getX() + "," + getY() + "," + getZ() + ")";
	}

	@Override
	public String moveLeft() {
		// TODO Auto-generated method stub
		return "Drone position: (" + getX() + "," + getY() + "," + getZ() + ")";
	}

	@Override
	public String moveRight() {
		// TODO Auto-generated method stub
		return "Drone position: (" + getX() + "," + getY() + "," + getZ() + ")";
	}

	@Override
	public String moveBack() {
		// TODO Auto-generated method stub
		return "Drone position: (" + getX() + "," + getY() + "," + getZ() + ")";
	}

	@Override
	public String moveForth() {
		// TODO Auto-generated method stub
		return "Drone position: (" + getX() + "," + getY() + "," + getZ() + ")";
	}

	@Override
	public String getFormatedCoordinates() {
		// TODO Auto-generated method stub
		return "Drone position: (" + getX() + "," + getY() + "," + getZ() + ")";
	}

	
	
	/////////////////////////////GETTERS AND SETTERS/////////////////////
	
	
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

	public FlySpace getFlySpace() {
		return flySpace;
	}

	public void setFlySpace(FlySpace flySpace) {
		this.flySpace = flySpace;
	}

}
