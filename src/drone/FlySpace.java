package drone;

public class FlySpace {

	private Cube outerCube;
	private Cube innerCube;
	
	public FlySpace(Cube outer, Cube inner) {
		outerCube = outer;
		innerCube = inner;
	}

	public Cube getOuterCube() {
		return outerCube;
	}

	public Cube getInnerCube() {
		return innerCube;
	}

	public void setOuterCube(Cube outerCube) {
		this.outerCube = outerCube;
	}

	public void setInnerCube(Cube innerCube) {
		this.innerCube = innerCube;
	}
	
}
