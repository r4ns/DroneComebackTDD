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
}
