package drone;

public class Drone implements StandardDrone{
	
	int x, y, z;
	FlySpace flySpace;
	public Drone(int i, int j, int k) {
		this(i,j,k,new FlySpace(new Cube(new int[]{0,0,0}, 50), new Cube(new int[]{10,10,10}, 30)));
	}

	public Drone(int i, int j, int k, FlySpace space) {
		this.x = i;
		this.y = j;
		this.z = k;
		this.flySpace = space;

	}

	@Override
	public String moveUp() {
		if (this.y >= flySpace.outerCube.maxCoordinates[1])
			return "Drone can't move up";
		else if (this.y >= flySpace.innerCube.minCoordinates[1]){
			if(this.x > flySpace.innerCube.minCoordinates[0] && this.x < flySpace.innerCube.maxCoordinates[0]){
				if (this.z > flySpace.innerCube.minCoordinates[2] && this.z < flySpace.innerCube.maxCoordinates[2])
					return "Drone can't move up";
			}
		}
		this.y++;
		return getFormatedCoordinates();
	}

	@Override
	public String moveDown() {
		if (this.y <= flySpace.outerCube.minCoordinates[1])
			return "Drone can't move down";
		else if (this.y <= flySpace.innerCube.maxCoordinates[1]){
			if(this.x > flySpace.innerCube.minCoordinates[0] && this.x < flySpace.innerCube.maxCoordinates[0]){
				if (this.z > flySpace.innerCube.minCoordinates[2] && this.z < flySpace.innerCube.maxCoordinates[2])
					return "Drone can't move down";
			}
		}
		this.y--;
		return getFormatedCoordinates();
	}

	@Override
	public String moveLeft() {
		if (this.x <= flySpace.outerCube.minCoordinates[0])
			return "Drone can't move left";
		else if (this.x <= flySpace.innerCube.maxCoordinates[0]){
			if(this.y > flySpace.innerCube.minCoordinates[1] && this.y < flySpace.innerCube.maxCoordinates[1]){
				if (this.z > flySpace.innerCube.minCoordinates[2] && this.z < flySpace.innerCube.maxCoordinates[2])
					return "Drone can't move left";
			}
		}
		this.x--;
		return getFormatedCoordinates();
	}

	@Override
	public String moveRight() {
		if (this.x >= flySpace.outerCube.maxCoordinates[0])
			return "Drone can't move right";
		else if (this.x >= flySpace.innerCube.minCoordinates[0]){
			if(this.y > flySpace.innerCube.minCoordinates[1] && this.y < flySpace.innerCube.maxCoordinates[1]){
				if (this.z > flySpace.innerCube.minCoordinates[2] && this.z < flySpace.innerCube.maxCoordinates[2])
					return "Drone can't move right";
			}
		}
		this.x++;
		return getFormatedCoordinates();
	}

	@Override
	public String moveBack() {
		if (this.z >= flySpace.outerCube.maxCoordinates[2])
			return "Drone can't move back";
		else if(this.z <= flySpace.innerCube.maxCoordinates[2]){
			if(this.y > flySpace.innerCube.minCoordinates[1] && this.y < flySpace.innerCube.maxCoordinates[1]){
				if (this.x > flySpace.innerCube.minCoordinates[0] && this.x < flySpace.innerCube.maxCoordinates[0])
					return "Drone can't move back";
			}
		}
		this.z++;
		return getFormatedCoordinates();
	}

	@Override
	public String moveForth() {
		if (this.z <= flySpace.outerCube.minCoordinates[2])
			return "Drone can't move forth";
		else if(this.z <= flySpace.innerCube.minCoordinates[2]){
			if(this.y > flySpace.innerCube.minCoordinates[1] && this.y < flySpace.innerCube.maxCoordinates[1]){
				if (this.x > flySpace.innerCube.minCoordinates[0] && this.x < flySpace.innerCube.maxCoordinates[0])
					return "Drone can't move forth";
			}
		}
		this.z--;
		return getFormatedCoordinates();
	}

	@Override
	public String getFormatedCoordinates() {
		// TODO Auto-generated method stub
		return "Drone position: ["+this.x+", "+this.y+", "+this.z+"]";
	}

}
