package drone;

public class Drone implements StandardDrone{
	
	private int x=30;
	private int y=0;
	private int z=30;
	
	public Drone(){
		
	}
	public Drone(int x, int y, int z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	@Override
	public String moveUp() {
		if(checkPositionMoveUp())
			y+=1;
		return getFormatedCoordinates();
	}

	@Override
	public String moveDown() {
		if(checkPositionMoveDown())
			y-=1;
		return getFormatedCoordinates();
	}

	@Override
	public String moveLeft() {
		if(checkPositionMoveLeft())
			x-=1;
		return getFormatedCoordinates();
	}

	@Override
	public String moveRight() {
		if(checkPositionMoveRight())
			x+=1;
		return getFormatedCoordinates();
	}

	@Override
	public String moveBack() {
		if(checkPositionMoveBack())
		z-=1;
		return getFormatedCoordinates();
	}

	@Override
	public String moveForth() {
		if(checkPositionMoveForth())
			z+=1;
		return getFormatedCoordinates();
	}

	@Override
	public String getFormatedCoordinates() {
		// TODO Auto-generated method stub
		return "("+x+","+y+","+z+")";
	}
	
	FlySpace space = new FlySpace(new Cube(new int[]{10,10,10},30),new Cube(new int[]{0,0,0},50));
	public boolean checkPositionMoveUp(){
		if(
		   y<space.getInnerCube().getMinCoordinates()[1]||
		   (y>=space.getInnerCube().getMaxCoordinates()[1] && y<space.getOuterCube().getMaxCoordinates()[1])||	
		   (x<=space.getInnerCube().getMinCoordinates()[0] && y>=space.getInnerCube().getMinCoordinates()[1] && y<space.getOuterCube().getMaxCoordinates()[1] && z<=space.getOuterCube().getMaxCoordinates()[2])||
		   (x<=space.getOuterCube().getMaxCoordinates()[0] && y>=space.getInnerCube().getMinCoordinates()[1] && y<space.getOuterCube().getMaxCoordinates()[1] && z<=space.getInnerCube().getMinCoordinates()[2])||
	       (x>=space.getInnerCube().getMaxCoordinates()[0] && x<=space.getOuterCube().getMaxCoordinates()[0] && y>=space.getInnerCube().getMinCoordinates()[1] && y<space.getOuterCube().getMaxCoordinates()[1] &&z<=space.getOuterCube().getMaxCoordinates()[2])||
	       (x<=space.getOuterCube().getMaxCoordinates()[0] && y>=space.getInnerCube().getMinCoordinates()[1] && y<space.getOuterCube().getMaxCoordinates()[1] && z>=space.getInnerCube().getMaxCoordinates()[2] && z<=space.getOuterCube().getMaxCoordinates()[2])
			)
			return true;
		else
			return false;
	}
	public boolean checkPositionMoveDown(){
		if(
		   (y>space.getOuterCube().getMinCoordinates()[1] && y<=space.getInnerCube().getMinCoordinates()[1])||
		    y>space.getInnerCube().getMaxCoordinates()[1] ||	
		   (x<=space.getInnerCube().getMinCoordinates()[0] && y<=space.getInnerCube().getMaxCoordinates()[1] && y>space.getOuterCube().getMinCoordinates()[1] && z<=space.getOuterCube().getMaxCoordinates()[2])||
		   (x<=space.getOuterCube().getMaxCoordinates()[0] && y<=space.getInnerCube().getMaxCoordinates()[1] && y>space.getOuterCube().getMinCoordinates()[1] && z<=space.getInnerCube().getMinCoordinates()[2])||
		   (x>=space.getInnerCube().getMaxCoordinates()[0] && x<=space.getOuterCube().getMaxCoordinates()[0] && y<=space.getInnerCube().getMaxCoordinates()[1] && y>space.getOuterCube().getMinCoordinates()[1] &&z<=space.getOuterCube().getMaxCoordinates()[2])||
		   (x<=space.getOuterCube().getMaxCoordinates()[0] && y<=space.getInnerCube().getMaxCoordinates()[1] && y>space.getOuterCube().getMinCoordinates()[1] && z>=space.getInnerCube().getMaxCoordinates()[2] && z<=space.getOuterCube().getMaxCoordinates()[2])
			)
					return true;
				else
					return false;
	}
	
	public boolean checkPositionMoveRight(){
		if(
				x<space.getInnerCube().getMinCoordinates()[0]||
				(x<space.getOuterCube().getMaxCoordinates()[0] && x>=space.getInnerCube().getMaxCoordinates()[0])||
				(y<=space.getInnerCube().getMinCoordinates()[1] && x>=space.getInnerCube().getMinCoordinates()[0] && x<space.getOuterCube().getMaxCoordinates()[0] && z<=space.getOuterCube().getMaxCoordinates()[2])||
				(y<=space.getOuterCube().getMaxCoordinates()[1] && x>=space.getInnerCube().getMinCoordinates()[0] && x<space.getOuterCube().getMaxCoordinates()[0] && z<=space.getInnerCube().getMinCoordinates()[2])||
			    (y>=space.getInnerCube().getMaxCoordinates()[1] && y<=space.getOuterCube().getMaxCoordinates()[1] && x>=space.getInnerCube().getMinCoordinates()[0] && x<space.getOuterCube().getMaxCoordinates()[0] && z<=space.getOuterCube().getMaxCoordinates()[2])||
			    (y<=space.getOuterCube().getMaxCoordinates()[1] && x>=space.getInnerCube().getMinCoordinates()[0] && x<space.getOuterCube().getMaxCoordinates()[0] && z>=space.getInnerCube().getMaxCoordinates()[2] && z<=space.getOuterCube().getMaxCoordinates()[2])
				)
			return true;
		else
			return false;
	}
	
	public boolean checkPositionMoveLeft(){
		if(
				x>space.getInnerCube().getMaxCoordinates()[0]||
				(x>space.getOuterCube().getMinCoordinates()[0] && x<=space.getInnerCube().getMinCoordinates()[0])||
				(y<=space.getInnerCube().getMinCoordinates()[1] && x>=space.getInnerCube().getMinCoordinates()[0] && x<=space.getOuterCube().getMaxCoordinates()[0] && z<=space.getOuterCube().getMaxCoordinates()[2])||
				(y<=space.getOuterCube().getMaxCoordinates()[1] && x>=space.getInnerCube().getMinCoordinates()[0] && x<=space.getOuterCube().getMaxCoordinates()[0] && z<=space.getInnerCube().getMinCoordinates()[2])||
			    (y>=space.getInnerCube().getMaxCoordinates()[1] && y<=space.getOuterCube().getMaxCoordinates()[1] && x>=space.getInnerCube().getMinCoordinates()[0] && x<=space.getOuterCube().getMaxCoordinates()[0] && z<=space.getOuterCube().getMaxCoordinates()[2])||
			    (y<=space.getOuterCube().getMaxCoordinates()[1] && x>=space.getInnerCube().getMinCoordinates()[0] && x<=space.getOuterCube().getMaxCoordinates()[0] && z>=space.getInnerCube().getMaxCoordinates()[2] && z<=space.getOuterCube().getMaxCoordinates()[2])
				)
			return true;
		else
			return false;
	}
	
	public boolean checkPositionMoveForth(){
		if(
			z<space.getInnerCube().getMinCoordinates()[2]||
			(z>=space.getInnerCube().getMaxCoordinates()[2] && z<space.getOuterCube().getMaxCoordinates()[2])||	
			(x<=space.getInnerCube().getMinCoordinates()[0] && z>=space.getInnerCube().getMinCoordinates()[2] && z<space.getOuterCube().getMaxCoordinates()[2] && y<=space.getOuterCube().getMaxCoordinates()[1])||
			(x<=space.getOuterCube().getMaxCoordinates()[0] && z>=space.getInnerCube().getMinCoordinates()[2] && z<space.getOuterCube().getMaxCoordinates()[2] && y<=space.getInnerCube().getMinCoordinates()[1])||
			(x>=space.getInnerCube().getMaxCoordinates()[0] && x<=space.getOuterCube().getMaxCoordinates()[0] && z>=space.getInnerCube().getMinCoordinates()[2] && z<space.getOuterCube().getMaxCoordinates()[2] &&y<=space.getOuterCube().getMaxCoordinates()[1])||
			(x<=space.getOuterCube().getMaxCoordinates()[0] && z>=space.getInnerCube().getMinCoordinates()[2] && z<space.getOuterCube().getMaxCoordinates()[2] && y>=space.getInnerCube().getMaxCoordinates()[1] && y<=space.getOuterCube().getMaxCoordinates()[1])
			)
			return true;
		else
			return false;
	}
	
	public boolean checkPositionMoveBack(){
		if(
		   (z>space.getOuterCube().getMinCoordinates()[2] && z<=space.getInnerCube().getMinCoordinates()[2])||
			z>space.getInnerCube().getMaxCoordinates()[2] ||	
		   (x<=space.getInnerCube().getMinCoordinates()[0] && z<=space.getInnerCube().getMaxCoordinates()[2] && z>space.getOuterCube().getMinCoordinates()[2] && y<=space.getOuterCube().getMaxCoordinates()[1])||
		   (x<=space.getOuterCube().getMaxCoordinates()[0] && z<=space.getInnerCube().getMaxCoordinates()[2] && z>space.getOuterCube().getMinCoordinates()[2] && y<=space.getInnerCube().getMinCoordinates()[1])||
		   (x>=space.getInnerCube().getMaxCoordinates()[0] && x<=space.getOuterCube().getMaxCoordinates()[0] && z<=space.getInnerCube().getMaxCoordinates()[2] && z>space.getOuterCube().getMinCoordinates()[2] && y<=space.getOuterCube().getMaxCoordinates()[1])||
		   (x<=space.getOuterCube().getMaxCoordinates()[0] && z<=space.getInnerCube().getMaxCoordinates()[2] && z>space.getOuterCube().getMinCoordinates()[2] && y>=space.getInnerCube().getMaxCoordinates()[1] && y<=space.getOuterCube().getMaxCoordinates()[1])
		   )
			  return true;
		else
			  return false;
		
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
