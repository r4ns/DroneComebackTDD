package drone;

public class FlySpace {
	Cube cubeUnutrasnja, cubeSpoljasnja;
	public FlySpace(Cube a, Cube b){
		cubeSpoljasnja = a;
		cubeUnutrasnja = b;
	}
	
	public String getFlySpaceString(){
		return "s:"+ cubeSpoljasnja.getCubeStr() + ", u:" + cubeUnutrasnja.getCubeStr();
	}

	public Cube getCubeUnutrasnja() {
		return cubeUnutrasnja;
	}

	public void setCubeUnutrasnja(Cube cubeUnutrasnja) {
		this.cubeUnutrasnja = cubeUnutrasnja;
	}

	public Cube getCubeSpoljasnja() {
		return cubeSpoljasnja;
	}

	public void setCubeSpoljasnja(Cube cubeSpoljasnja) {
		this.cubeSpoljasnja = cubeSpoljasnja;
	}
}
