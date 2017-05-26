package drone;

public class FlySpace {

	Cube outterCube;
	Cube innerCube; 
	
	public FlySpace()
	{
		
	}
	
	public FlySpace(Cube outterCube, Cube innerCube)
	{
		setOutterCube(outterCube);
		setInnerCube(innerCube);
	}

	//////////////////GETTERS AND SETTERS////////////////////
	
	public Cube getOutterCube() {
		return outterCube;
	}


	public void setOutterCube(Cube outterCube) {
		this.outterCube = outterCube;
	}


	public Cube getInnerCube() {
		return innerCube;
	}


	public void setInnerCube(Cube innerCube) {
		this.innerCube = innerCube;
	}
}
