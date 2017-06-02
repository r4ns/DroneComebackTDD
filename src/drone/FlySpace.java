package drone;

public class FlySpace {
	
	private Cube outerCube;
	private Cube innerCube;
	
	
	public FlySpace(Cube a, Cube b)
	{
		outerCube = a;
		innerCube = b;
	}

	public String getFormatedCoordinates() {
		return outerCube.getFormatedCoordinates()+","+innerCube.getFormatedCoordinates();

	}
	public Cube getOuterCube() {
		return outerCube;
	}


	public void setOuterCube(Cube outerCube) {
		this.outerCube = outerCube;
	}


	public Cube getInnerCube() {
		return innerCube;
	}


	public void setInnerCube(Cube innerCube) {
		this.innerCube = innerCube;
	}
}
