package drone;

public class FlySpace {
	Cube outCube;
	
	public FlySpace(){
		
	}
	
	public FlySpace(Cube outCube){
		this.outCube=outCube;
	}
	
	public String toString(){
		return this.getOutCube().toString();
	}

	public Cube getOutCube() {
		return outCube;
	}

	public void setOutCube(Cube outCube) {
		this.outCube = outCube;
	}
	
	
}
