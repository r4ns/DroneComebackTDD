package drone;

public class Tacka {

	int x;
	int y;
	int z;
	
	public Tacka()
	{}
	
	public Tacka(int x, int y, int z)
	{
		setX(x);
		setY(y);
		setZ(z);
	}

	
	
	
	///////////////////////GETTERS AND SETTERS//////////////////
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
