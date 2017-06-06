package drone;

public class FlySpace {
	Cube outerCube;
	Cube innerCube;
	
	public FlySpace(){
		
	}
	
	public FlySpace(Cube outerCube,Cube innerCube){
		this.outerCube=outerCube;
		this.innerCube=innerCube;
	}
	
	public String toString(){
		return "FlySpace: "+ this.getOuterCube().toString()+", "+this.getInnerCube().toString();
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
