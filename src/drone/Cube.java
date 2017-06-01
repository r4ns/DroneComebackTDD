package drone;



public class Cube {
	
	private int x;
	private int y;
	private int z;
	
	public Cube ()
	{
		this.x=0;
		this.y=0;
		this.z=0;
	}
	
	public Cube(int x, int y, int z)
	{
		this.x=x;
		this.y=y;
		this.z=z;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getZ() {
		return z;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setZ(int z) {
		this.z = z;
	}

}