package drone;

public class Drone implements StandardDrone{

	int koordinate[] = new int[3];
	FlySpace fs;
	int x,y,z;
	
	private int uGranica1 = 0;
	private int uGranica2 = 0;
	private int sGranica1 = 0;
	private int sGranica2 = 0;
	
	private int[] cilj = {0, 30, 30};
	public Drone(int[] koor) throws DroneException{
		if(koor.length != 3)
			throw new DroneException();	
		koordinate = koor;
		x = koor[0];
		y = koor[1];
		z = koor[2];
	}
	
	public Drone(int[] koor, FlySpace fs) throws DroneException{
		
		
		if(koor.length != 3)
			throw new DroneException();
		
		for(int i = 0; i < 3; i++){
			if(fs.getCubeSpoljasnja().getTackaB()[i] < koor[i] || fs.getCubeUnutrasnja().getTackaA()[i] > koor[i])
				throw new DroneException();
		}
		
		koordinate = koor;
		this.fs = fs;
		x = koor[0];
		y = koor[1];
		z = koor[2];
		
		sGranica1 = fs.getCubeUnutrasnja().getTackaA()[0];
		sGranica2 = fs.getCubeUnutrasnja().getTackaB()[0];
		uGranica1 = fs.getCubeSpoljasnja().getTackaA()[0];
		uGranica2 = fs.getCubeSpoljasnja().getTackaB()[0];
		
	}
	
	
	
	
	private boolean uIvici(int k){
		if(k>= sGranica1 && k <=uGranica1 || k>=uGranica2 && k <= sGranica2){
			return true;
		}
		return false;
	}
	
private int pomeri(int k, int i){
		
		
		if(k + i == sGranica1 || k + i == sGranica2){

			return k + i;
		}
		if(k == sGranica1 && i == -1 || k == sGranica2  && i == 1){
			return k;
		}
		return k + i;
	}
	
	private int pomeriSigurno(int k, int i){
		
		
		if(k + i == sGranica1 || k + i == uGranica1 || k + i == uGranica2 || k + i == sGranica2){
			return k + i;
		}
		if(k == sGranica1 && i == -1 || k == uGranica1  && i == 1|| k == uGranica2  && i == -1|| k == sGranica2  && i == 1){
			
			return k;
		}
		return k + i;
	}
	
	public boolean stigaoNaCilj(){
		if(x == cilj[0] && y == cilj[1] && z == cilj[2])
			return true;
		else
			return false;
	}
	
	@Override
	public String moveUp() {
		if(uIvici(x) || uIvici(z)){
			y = pomeri(y,1);
		}else if(uIvici(y)){
			y = pomeriSigurno(y,1);
		}
		
		return getFormatedCoordinates();
	}

	@Override
	public String moveDown() {
		if(uIvici(x) || uIvici(z)){
			y = pomeri(y,-1);
		}else if(uIvici(y)){
			y = pomeriSigurno(y,-1);
		}
		return getFormatedCoordinates();
	}

	@Override
	public String moveLeft() {
		if(uIvici(y) || uIvici(z)){
			x = pomeri(x,-1);
		}else if(uIvici(x)){
			x = pomeriSigurno(x,-1);
		}
		return getFormatedCoordinates();

	}

	@Override
	public String moveRight() {
		if(uIvici(y) || uIvici(z)){
			x = pomeri(x,1);
		}else if(uIvici(x)){
			x = pomeriSigurno(x,1);
		}
		return getFormatedCoordinates();

	}

	@Override
	public String moveBack() {
		if(uIvici(y) || uIvici(x)){
			z = pomeri(z,1);
		}else if(uIvici(z)){
			z = pomeriSigurno(z,1);
		}
		return getFormatedCoordinates();
	}

	@Override
	public String moveForth() {
		if(uIvici(y) || uIvici(x)){
			z = pomeri(z,-1);
		}else if(uIvici(z)){
			z = pomeriSigurno(z,-1);
		}
		return getFormatedCoordinates();
	}

	@Override
	public String getFormatedCoordinates() {
		
		return "(" + Integer.toString(getX()) + ","
				+ Integer.toString(getY()) + ","  
				+ Integer.toString(getZ()) + ")";
	}
	
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