package drone;

public class Drone implements StandardDrone{
	private int x;
	private int y;
	private int z;
	FlySpace flySpace;
	
	public Drone(){
		
	}
	
	public Drone(int x,int y,int z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	public Drone(int x, int y, int z, Cube spolj, Cube unut) {
		this.x=x;
 		this.y=y;
 		this.z=z;
 		this.flySpace=new FlySpace(spolj,unut);
	}

	@Override
	public String moveUp() {
		if(y<flySpace.getUnutKocka().getGranice()[1]&&y>=flySpace.getSpoljKocka().getGranice()[1] &&x>flySpace.getUnutKocka().getGranice()[0]&&x<(flySpace.getUnutKocka().getGranice()[0]+flySpace.getUnutKocka().getStranica())){
			y++;
		}
		if(y>=(flySpace.getUnutKocka().getGranice()[1]+flySpace.getUnutKocka().getStranica()) &&y<(flySpace.getSpoljKocka().getGranice()[1]+flySpace.getSpoljKocka().getStranica())
		&&x>flySpace.getUnutKocka().getGranice()[0]&&x<(flySpace.getUnutKocka().getGranice()[0]+flySpace.getUnutKocka().getStranica())){
			y++;
		}
		return this.toString();
	}

	@Override
	public String moveDown() {
		if(y<=flySpace.getUnutKocka().getGranice()[1]&&y>flySpace.getSpoljKocka().getGranice()[1]){
			y--;
		}
		if(y>(flySpace.getUnutKocka().getGranice()[1]+flySpace.getUnutKocka().getStranica()) &&y<=(flySpace.getSpoljKocka().getGranice()[1]+flySpace.getSpoljKocka().getStranica())){
			y--;
		}
		return this.toString();
	}

	@Override
	public String moveLeft() {
		if(x>flySpace.getSpoljKocka().getGranice()[0]&&x<=(flySpace.getSpoljKocka().getStranica()) &&(y<=flySpace.getUnutKocka().getGranice()[1]||y>=(flySpace.getUnutKocka().getStranica()))){
			x--;
		}
		return this.toString();
	}

	@Override
	public String moveRight() {
		if(x>=flySpace.getSpoljKocka().getGranice()[0]&&x<(flySpace.getSpoljKocka().getStranica()) && (y<=flySpace.getUnutKocka().getGranice()[1]||y>=(flySpace.getUnutKocka().getStranica()))){
			x++;
		}
		if(((x>=flySpace.getSpoljKocka().getGranice()[0]&&x<flySpace.getSpoljKocka().getGranice()[0]) || (x>=(flySpace.getUnutKocka().getStranica())&&x<flySpace.getSpoljKocka().getStranica()))
			&&( y>=flySpace.getUnutKocka().getGranice()[1] || ( y<=flySpace.getUnutKocka().getStranica()))){
			x++;
		}		
		return this.toString();
	}

	@Override
	public String moveBack() {
		if(z<flySpace.getSpoljKocka().getStranica()&&z>=flySpace.getSpoljKocka().getGranice()[2]){
			z++;
		}
		if((z>=flySpace.getSpoljKocka().getGranice()[2]&&z<flySpace.getUnutKocka().getGranice()[2] || z>=(flySpace.getUnutKocka().getGranice()[2]+flySpace.getUnutKocka().getStranica())&&z<flySpace.getSpoljKocka().getStranica()))
		{
			z++;
		}
		
		return this.toString();
	}

	@Override
	public String moveForth() {
		if(z<=flySpace.getSpoljKocka().getStranica()&&z>flySpace.getSpoljKocka().getGranice()[2]){
			z--;
		}
		return this.toString();
	}

	@Override
	public String getFormatedCoordinates() {
		return this.toString();
	}

}
