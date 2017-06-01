package drone;

public class FlySpace {
	
	private Cube innerCube;
	private Cube outerCube;
	
	public FlySpace(Cube iner, Cube outer) {
		innerCube=iner;
		outerCube=outer;
	}
	
	public Cube getInnerCube() {
		return innerCube;
	}

	public void setInnerCube(Cube innerCube) {
		this.innerCube = innerCube;
	}

	public Cube getOuterCube() {
		return outerCube;
	}

	public void setOuterCube(Cube outerCube) {
		this.outerCube = outerCube;
	}
	
	
}
