package drone;

public class Drone implements StandardDrone{

	int x=30;
	int y=0;
	int z=30;
	
	public Drone(int x, int y, int z) {
		this.x=x;
		this.y=y;
		this.z=z;
		// TODO Auto-generated constructor stub
	}

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
		 if ((x>10 &&x<40) && (z>10 &&z<40) && y>0 && y<=10){
				y--;
				 			return getFormatedCoordinates();
				 		} else if ((x>10 &&x<40) && (z>10 && z<40) && (y<=50 && y>40)){
				 			y--;
				 			return getFormatedCoordinates();
				 		} else if (((x>=40 || x<= 10) || (z>=40 || z<= 10))  && y>0){
				 			y--;
				 			return getFormatedCoordinates();
				 			
				 		} else {
				 			
				 			return getFormatedCoordinates();
				 		}
	}

	@Override
	public String moveLeft() {
		// TODO Auto-generated method stub
		if ((y>10 &&y<40) && (z>10 &&z<40) && (x<=10 && x>0)){
 			x--;
 			 			return getFormatedCoordinates();
 			 		} else if ((y>10 &&y<40) && (z>10 && z<40) && (x>40 && x<=50)){
 			 			x--;
 			 			return getFormatedCoordinates();
 			 		} else if (((y>=40 || y<= 10) || (z>=40 || z<= 10))  && x>0){
 			 			x--;
 			 			return getFormatedCoordinates();
 			 		} else {
 			 			return getFormatedCoordinates();
 			 		}
	}

	@Override
	public String moveRight() {
		// TODO Auto-generated method stub
		if ((y>10 &&y<40) && (z>10 &&z<40) && x<10){
			x++;
			 			return getFormatedCoordinates();
			 		} else if ((y>10 &&y<40) && (z>10 &&z<40) && (x>=40 && x<50)){
			 			x++;
			 			return getFormatedCoordinates();
			 		} else if (((y>=40 || y<= 10) || (z>=40 || z<= 10))  && x<50){
			 			x++;
			 			return getFormatedCoordinates();
			 		} else {
			 			return getFormatedCoordinates();
			 		}
		
	}
	

	@Override
	public String moveBack() {
		
	 		// TODO Auto-generated method stub
	 		 if ((x>10 &&x<40) && (y>10 &&y<40) && z<10){
	 			z++;
	 			 			return getFormatedCoordinates();
	 			 		} else if ((x>10 &&x<40) && (y>10 &&y<40) && (z>=40 && z<50)){
	 			 			z++;
	 			 			return getFormatedCoordinates();
	 			 		} else if (((x>=40 || x<= 10) || (y>=40 || y<= 10))  && z<50){
	 			 			z++;
	 			 			return getFormatedCoordinates();
	 			 		} else {
	 			 			return getFormatedCoordinates();
	 			 		}
	 	
	 	}
	@Override
	public String moveForth() {
 		if ((x>10 &&x<40) && (y>10 &&y<40) && (z>0 && z<=10)){
 			z--;
 			 			return getFormatedCoordinates();
 			 		} else if ((x>10 &&x<40) && (y>10 && y<40) && z>40){
 			 			z--;
 			 			return getFormatedCoordinates();
 			 		} else if (((x>=40 || x<= 10) || (y>=40 || y<= 10))  && z>0){
 			 			z--;
 			 			return getFormatedCoordinates();
 			 		} else {
 			 			return getFormatedCoordinates();
 			 		}
 	}
 

	@Override
	public String getFormatedCoordinates() {
		// TODO Auto-generated method stub
		return "("+x+","+y+","+z+")";
	}

}
