package drone;

public class Drone implements StandardDrone{

	int x=30;
	int y=0;
	int z=30;
	
	@Override
	public String moveUp() {
		if ((x>10 &&x<40) && (z>10 &&z<40) && y<10){
 			y++;
 			 			return getFormatedCoordinates();
 			 		} else if ((x>10 &&x<40) && (z>10 &&z<40) && y>=40){
 			 			y++;
 			 			return getFormatedCoordinates();
 			 		} else if (((x>=40 || x<= 10) || (z>=40 || z<= 10))  && y< 50){
 			 			y++;
 			 			return getFormatedCoordinates();
 			 		} else {
 			 			
 			 			return getFormatedCoordinates();
 			 		}
	}

	@Override
	public String moveDown() {
		y--;
		return getFormatedCoordinates();
	}

	@Override
	public String moveLeft() {
		// TODO Auto-generated method stub
		x--;
		return getFormatedCoordinates();
	}

	@Override
	public String moveRight() {
		// TODO Auto-generated method stub
		x++;
		return getFormatedCoordinates();
	}

	@Override
	public String moveBack() {
		// TODO Auto-generated method stub
		z++;
		return getFormatedCoordinates();
	}

	@Override
	public String moveForth() {
		// TODO Auto-generated method stub
		z--;
		return getFormatedCoordinates();
	}

	@Override
	public String getFormatedCoordinates() {
		// TODO Auto-generated method stub
		return "("+x+","+y+","+z+")";
	}

}
