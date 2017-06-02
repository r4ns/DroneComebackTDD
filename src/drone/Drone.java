package drone;


public class Drone implements StandardDrone{

	private int droneCoordinates[];
	protected FlySpace flySpace;
	
	public Drone(Cube outerBoundaries, Cube innerBoundaries, int[] droneStartCoordinates)
	{
		flySpace = new FlySpace(outerBoundaries, innerBoundaries);
		droneCoordinates = droneStartCoordinates;
	}
	
	@Override
	public String moveUp() {
		if (droneCoordinates[0] < flySpace.getInnerBoundaries().getMaxCoordinates()[0] && droneCoordinates[0] > flySpace.getInnerBoundaries().getMinCoordinates()[0] && droneCoordinates[2] < flySpace.getInnerBoundaries().getMaxCoordinates()[2] && droneCoordinates[2] > flySpace.getInnerBoundaries().getMinCoordinates()[2] && droneCoordinates[1] < flySpace.getInnerBoundaries().getMinCoordinates()[1]){
			droneCoordinates[1]++;
			return getFormatedCoordinates();
		} else if (droneCoordinates[0] < flySpace.getInnerBoundaries().getMaxCoordinates()[0] && droneCoordinates[0] > flySpace.getInnerBoundaries().getMinCoordinates()[0] && droneCoordinates[2] < flySpace.getInnerBoundaries().getMaxCoordinates()[2] && droneCoordinates[2] > flySpace.getInnerBoundaries().getMinCoordinates()[2] && droneCoordinates[1] < flySpace.getOuterBoundaries().getMaxCoordinates()[1] && droneCoordinates[1] >= flySpace.getInnerBoundaries().getMaxCoordinates()[1]){
			droneCoordinates[1]++;;
			return getFormatedCoordinates();
		} else if (((droneCoordinates[0] >= flySpace.getInnerBoundaries().getMaxCoordinates()[0] || droneCoordinates[0] <= flySpace.getInnerBoundaries().getMinCoordinates()[0]) || (droneCoordinates[2] >= flySpace.getInnerBoundaries().getMaxCoordinates()[2] || droneCoordinates[2] <= flySpace.getInnerBoundaries().getMinCoordinates()[2]))  && droneCoordinates[1] < flySpace.getOuterBoundaries().getMaxCoordinates()[1]){
			droneCoordinates[1]++;;
			return getFormatedCoordinates();
		} else {
			return getFormatedCoordinates();
		}
	}

	@Override
	public String moveDown() {
		if (droneCoordinates[0] < flySpace.getInnerBoundaries().getMaxCoordinates()[0] && droneCoordinates[0] > flySpace.getInnerBoundaries().getMinCoordinates()[0] && droneCoordinates[2] < 40 && droneCoordinates[2] > flySpace.getInnerBoundaries().getMinCoordinates()[0] && droneCoordinates[1] > flySpace.getOuterBoundaries().getMinCoordinates()[0]){
			droneCoordinates[1]--;
			return getFormatedCoordinates();
		} else if (droneCoordinates[0] < flySpace.getInnerBoundaries().getMaxCoordinates()[0] && droneCoordinates[0] > flySpace.getInnerBoundaries().getMinCoordinates()[0] && droneCoordinates[2] < flySpace.getInnerBoundaries().getMaxCoordinates()[0] && droneCoordinates[2] > flySpace.getInnerBoundaries().getMinCoordinates()[0] && droneCoordinates[1] <= flySpace.getOuterBoundaries().getMaxCoordinates()[0] && droneCoordinates[1] > flySpace.getInnerBoundaries().getMaxCoordinates()[0]){
			droneCoordinates[1]--;
			return getFormatedCoordinates();
		} else if (((droneCoordinates[0] >=flySpace.getInnerBoundaries().getMaxCoordinates()[0] || droneCoordinates[0] <= flySpace.getInnerBoundaries().getMinCoordinates()[0]) || (droneCoordinates[2] >=flySpace.getInnerBoundaries().getMaxCoordinates()[0] || droneCoordinates[2] <= flySpace.getInnerBoundaries().getMinCoordinates()[0])) && droneCoordinates[1] > flySpace.getOuterBoundaries().getMinCoordinates()[0]){
			droneCoordinates[1]--;
			return getFormatedCoordinates();
		} else {
			return getFormatedCoordinates();
}
	}

	@Override
	public String moveLeft() {
		if (droneCoordinates[1] < flySpace.getInnerBoundaries().getMaxCoordinates()[0] && droneCoordinates[1] > flySpace.getInnerBoundaries().getMinCoordinates()[0] && droneCoordinates[2] < flySpace.getInnerBoundaries().getMaxCoordinates()[0] && droneCoordinates[2] > flySpace.getInnerBoundaries().getMinCoordinates()[0] && droneCoordinates[0] > flySpace.getInnerBoundaries().getMaxCoordinates()[0]){
			droneCoordinates[0]--;
			return getFormatedCoordinates();
		} else if (droneCoordinates[1] < flySpace.getInnerBoundaries().getMaxCoordinates()[0] && droneCoordinates[1] > flySpace.getInnerBoundaries().getMinCoordinates()[0] && droneCoordinates[2] < flySpace.getInnerBoundaries().getMaxCoordinates()[0] && droneCoordinates[2] > flySpace.getInnerBoundaries().getMinCoordinates()[0] && droneCoordinates[0] > flySpace.getOuterBoundaries().getMinCoordinates()[0] && droneCoordinates[0] <= flySpace.getInnerBoundaries().getMinCoordinates()[0]){
			droneCoordinates[0]--;
			return getFormatedCoordinates();
		} else if (((droneCoordinates[1] >= flySpace.getInnerBoundaries().getMaxCoordinates()[0] || droneCoordinates[1] <= flySpace.getInnerBoundaries().getMinCoordinates()[0]) || (droneCoordinates[2] >= flySpace.getInnerBoundaries().getMaxCoordinates()[0] || droneCoordinates[2] <= flySpace.getInnerBoundaries().getMinCoordinates()[0])) && droneCoordinates[0] > flySpace.getOuterBoundaries().getMinCoordinates()[0]) {
			droneCoordinates[0]--;
			return getFormatedCoordinates();
		} else {
			return getFormatedCoordinates();
}
	}

	@Override
	public String moveRight() {
		if (droneCoordinates[1] < flySpace.getInnerBoundaries().getMaxCoordinates()[0] && droneCoordinates[1] > flySpace.getInnerBoundaries().getMinCoordinates()[0] && droneCoordinates[2] < flySpace.getInnerBoundaries().getMaxCoordinates()[0] && droneCoordinates[2] > flySpace.getInnerBoundaries().getMinCoordinates()[0] && droneCoordinates[0] >= flySpace.getInnerBoundaries().getMaxCoordinates()[0] && droneCoordinates[0] < flySpace.getOuterBoundaries().getMaxCoordinates()[0]){
			droneCoordinates[0]++;
			return getFormatedCoordinates();
		} else if (droneCoordinates[1] < flySpace.getInnerBoundaries().getMaxCoordinates()[0] && droneCoordinates[1] > flySpace.getInnerBoundaries().getMinCoordinates()[0] && droneCoordinates[2] < flySpace.getInnerBoundaries().getMaxCoordinates()[0] && droneCoordinates[2] > flySpace.getInnerBoundaries().getMinCoordinates()[0] && droneCoordinates[1] < flySpace.getInnerBoundaries().getMinCoordinates()[0]){
			droneCoordinates[0]++;
			return getFormatedCoordinates();
		} else if (((droneCoordinates[1] >= flySpace.getInnerBoundaries().getMaxCoordinates()[0] || droneCoordinates[1] <= flySpace.getInnerBoundaries().getMinCoordinates()[0]) || (droneCoordinates[2] >= flySpace.getInnerBoundaries().getMaxCoordinates()[0] || droneCoordinates[2] <= flySpace.getInnerBoundaries().getMinCoordinates()[0])) && droneCoordinates[1] < flySpace.getOuterBoundaries().getMaxCoordinates()[0]) {
			droneCoordinates[0]++;
			return getFormatedCoordinates();
		} else {
			return getFormatedCoordinates();
}
	}

	@Override
	public String moveBack() {
		if (droneCoordinates[1] < flySpace.getInnerBoundaries().getMaxCoordinates()[0] && droneCoordinates[1] > flySpace.getInnerBoundaries().getMinCoordinates()[0] && droneCoordinates[0] < flySpace.getInnerBoundaries().getMaxCoordinates()[0] && droneCoordinates[0] > flySpace.getInnerBoundaries().getMinCoordinates()[0] && droneCoordinates[2] < flySpace.getInnerBoundaries().getMinCoordinates()[0]){
			droneCoordinates[2]++;
			return getFormatedCoordinates();
		} else if (droneCoordinates[1] < flySpace.getInnerBoundaries().getMaxCoordinates()[0] && droneCoordinates[1] > flySpace.getInnerBoundaries().getMinCoordinates()[0] && droneCoordinates[0] < flySpace.getInnerBoundaries().getMaxCoordinates()[0] && droneCoordinates[0] > flySpace.getInnerBoundaries().getMinCoordinates()[0] && droneCoordinates[2] >= flySpace.getInnerBoundaries().getMaxCoordinates()[0] && droneCoordinates[2] < flySpace.getOuterBoundaries().getMaxCoordinates()[0]) {
			droneCoordinates[2]++;
			return getFormatedCoordinates();
		} else if (((droneCoordinates[1] >= flySpace.getInnerBoundaries().getMaxCoordinates()[0] || droneCoordinates[1] <= flySpace.getInnerBoundaries().getMinCoordinates()[0]) || (droneCoordinates[0] >= flySpace.getInnerBoundaries().getMaxCoordinates()[0] || droneCoordinates[0] <= flySpace.getInnerBoundaries().getMinCoordinates()[0])) && droneCoordinates[2] < flySpace.getOuterBoundaries().getMaxCoordinates()[0]) {
			droneCoordinates[2]++;
			return getFormatedCoordinates();
		} else {
			return getFormatedCoordinates();
}
	}

	@Override
	public String moveForth() {
		if (droneCoordinates[1] < flySpace.getInnerBoundaries().getMaxCoordinates()[0] && droneCoordinates[1] > flySpace.getInnerBoundaries().getMinCoordinates()[0] && droneCoordinates[0] < flySpace.getInnerBoundaries().getMaxCoordinates()[0] && droneCoordinates[0] > flySpace.getInnerBoundaries().getMinCoordinates()[0] && droneCoordinates[2] > flySpace.getOuterBoundaries().getMinCoordinates()[0] && droneCoordinates[2] <= flySpace.getInnerBoundaries().getMinCoordinates()[0]){
			droneCoordinates[2]--;
			return getFormatedCoordinates();
		} else if (droneCoordinates[1] < flySpace.getInnerBoundaries().getMaxCoordinates()[0] && droneCoordinates[1] > flySpace.getInnerBoundaries().getMinCoordinates()[0] && droneCoordinates[0] < flySpace.getInnerBoundaries().getMaxCoordinates()[0] && droneCoordinates[0] > flySpace.getInnerBoundaries().getMinCoordinates()[0] && droneCoordinates[2] > flySpace.getInnerBoundaries().getMaxCoordinates()[0]) {
			droneCoordinates[2]--;
			return getFormatedCoordinates();
		} else if (((droneCoordinates[1] >= flySpace.getInnerBoundaries().getMaxCoordinates()[0] || droneCoordinates[1] <= flySpace.getInnerBoundaries().getMinCoordinates()[0]) || (droneCoordinates[0] >= flySpace.getInnerBoundaries().getMaxCoordinates()[0] || droneCoordinates[0] <= flySpace.getInnerBoundaries().getMinCoordinates()[0])) && droneCoordinates[2] > flySpace.getOuterBoundaries().getMinCoordinates()[0]) {
			droneCoordinates[2]--;
			return getFormatedCoordinates();
		} else {
			return getFormatedCoordinates();
}
	}

	@Override
	public String getFormatedCoordinates() {
		return "Drone position: (" + Integer.toString(droneCoordinates[0]) + ", "
				+ Integer.toString(droneCoordinates[1]) + ", "  
				+ Integer.toString(droneCoordinates[2]) + ")"; 
	}

}
