package drone;

public class Drone implements StandardDrone{

	private int x;
	private int y;
	private int z;
	private int[]boundaries;
	private int[]startCoordinates;
	
	public Drone()
	{
		
	}
	
	public Drone(int[] boundaries, int[] startCoordinates) {
		
		this.boundaries = boundaries;
		this.startCoordinates = startCoordinates;
	}

	@Override
	
		public String moveUp(int up)
		{
			if(y + up <= boundaries[1])
			{
				y += up;			
			}
			
			return getFormatedCoordinates();
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

	@Override
	public String moveUp() {
		// TODO Auto-generated method stub
		return null;
	}

}
