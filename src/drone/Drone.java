package drone;

public class Drone implements StandardDrone{

	private int x;
	private int y;
	private int z;
	FlySpace space;
	
	public Drone(){
		
	}
	public Drone(int x,int y,int z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	public Drone(int x, int y, int z, Cube spoljasnja, Cube unutrasnja) {
		this.x=x;
		this.y=y;
		this.z=z;
		this.space=new FlySpace(spoljasnja,unutrasnja);	
	}
	public String toString(){
		
		return "Drone position: ("+this.x+","+this.y+","+this.z+")";
	}

	@Override
	public String moveUp() {
		
		if(y<space.getUnutrasnjaKocka().getBoundaries()[1]&&y>=space.getSpoljasnjaKocka().getBoundaries()[1]
				&&x>space.getUnutrasnjaKocka().getBoundaries()[0]&&x<(space.getUnutrasnjaKocka().getBoundaries()[0]+space.getUnutrasnjaKocka().getStranica()))
		{
			y++;
		}
		if(y>=(space.getUnutrasnjaKocka().getBoundaries()[1]+space.getUnutrasnjaKocka().getStranica())
				&&y<(space.getSpoljasnjaKocka().getBoundaries()[1]+space.getSpoljasnjaKocka().getStranica())
				&&x>space.getUnutrasnjaKocka().getBoundaries()[0]&&x<(space.getUnutrasnjaKocka().getBoundaries()[0]+space.getUnutrasnjaKocka().getStranica())
				)
		{
			y++;
		}
		
		return this.toString();
		
	}

	@Override
	public String moveDown() {
		
		if(y<=space.getUnutrasnjaKocka().getBoundaries()[1]&&y>space.getSpoljasnjaKocka().getBoundaries()[1])
		{
			y--;
		}
		if(y>(space.getUnutrasnjaKocka().getBoundaries()[1]+space.getUnutrasnjaKocka().getStranica())
				&&y<=(space.getSpoljasnjaKocka().getBoundaries()[1]+space.getSpoljasnjaKocka().getStranica()))
		{
			y--;
		}
		
		
		return this.toString();
	}

	@Override
	public String moveLeft() {
		if(x>space.getSpoljasnjaKocka().getBoundaries()[0]&&x<=(space.getSpoljasnjaKocka().getStranica())
				&&(y<=space.getUnutrasnjaKocka().getBoundaries()[1]||y>=(space.getUnutrasnjaKocka().getStranica())))
		{
			x--;
		}
		
		return this.toString();
	}

	@Override
	public String moveRight() {
		
		if(x>=space.getSpoljasnjaKocka().getBoundaries()[0]&&x<(space.getSpoljasnjaKocka().getStranica())
				&&(y<=space.getUnutrasnjaKocka().getBoundaries()[1]||y>=(space.getUnutrasnjaKocka().getStranica())))
		{
			x++;
		}
		if(((x>=space.getSpoljasnjaKocka().getBoundaries()[0]&&x<space.getSpoljasnjaKocka().getBoundaries()[0]) ||
				(x>=(space.getUnutrasnjaKocka().getStranica())&&x<space.getSpoljasnjaKocka().getStranica()))
				&&( y>=space.getUnutrasnjaKocka().getBoundaries()[1] || ( y<=space.getUnutrasnjaKocka().getStranica())))
		{
			x++;
		}
		
		return this.toString();
	}

	@Override
	public String moveBack() {
		
		if(z<space.getSpoljasnjaKocka().getStranica()&&z>=space.getSpoljasnjaKocka().getBoundaries()[2]){
			z++;
		}
		if((z>=space.getSpoljasnjaKocka().getBoundaries()[2]&&z<space.getUnutrasnjaKocka().getBoundaries()[2] || 
				z>=(space.getUnutrasnjaKocka().getBoundaries()[2]+space.getUnutrasnjaKocka().getStranica())&&z<space.getSpoljasnjaKocka().getStranica()))
		{
			z++;
		}
		
		return this.toString();
	}

	@Override
	public String moveForth() {
		
		if(z<=space.getSpoljasnjaKocka().getStranica()&&z>space.getSpoljasnjaKocka().getBoundaries()[2]){
			z--;
		}
		return this.toString();
	}

	@Override
	public String getFormatedCoordinates() {
		return this.toString();
	}

}