package drone;

public class Drone implements StandardDrone{
	
	private Tacka dron;
	protected FlySpace flySpace;

	public Drone(Cube unutrasnjaKocka, Cube spoljasnjaKocka, int razmak)
	{
		flySpace = new FlySpace(unutrasnjaKocka, spoljasnjaKocka, razmak);
	}
	public Drone(Tacka dron)
	{
		this.dron=dron;
	}
	
	public Drone()
	{
		
	}
	
	public boolean provjera(String komanda)
	{
		switch(komanda){
			case "up":
				
				flySpace.provjera(dron.getX(),dron.getY()+1,dron.getZ());
			
				
		}
		return true;
	}
	
	

	@Override
	public String moveUp() {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public String moveDown() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String moveLeft() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String moveRight() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String moveBack() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String moveForth() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getFormatedCoordinates() {
		// TODO Auto-generated method stub
		return null;
	}

}
