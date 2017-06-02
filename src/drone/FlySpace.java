package drone;

public class FlySpace {
	Cube outCube;
	Cube inCube;
	
	public FlySpace () {
		
	}
	
	public FlySpace (Cube outCube, Cube inCube) {
		this.outCube = outCube;
		this.inCube = inCube;
	}
	
	public String toString() {
		return this.outCube.toString() + ", " + this.inCube.toString();
	}

	public Cube getOutCube() {
		return outCube;
	}


	public void setOutCube(Cube outCube) {
		this.outCube = outCube;
	}

	
	
}