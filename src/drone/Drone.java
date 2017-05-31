package drone;

public class Drone implements StandardDrone{
	
	private int [] startCoordinates={30,0,30};
	private int [] boundaries;
	public Drone()
	{
		
	}
	
	public Drone(int [] startCoordinates, int [] boundaries )
	{
		this.startCoordinates=startCoordinates;
		this.boundaries=boundaries;
	}

	@Override
	public String moveUp() {
		
		if (startCoordinates[1]>=50  || (startCoordinates[0]>=10 && startCoordinates[0]<=40 && startCoordinates[1]>=10 && startCoordinates[1]<=40 && startCoordinates[2]>=10 && startCoordinates[2]<=40))
		{
			
		}else 
		{
			startCoordinates[1]++;
		}
		return getFormatedCoordinates();
	}

	@Override
	public String moveDown() {
		
		if (startCoordinates[1]<=0  || (startCoordinates[0]>=10 && startCoordinates[0]<=40 && startCoordinates[1]>=10 && startCoordinates[1]<=40 && startCoordinates[2]>=10 && startCoordinates[2]<=40))
		{
			
		}
		else
		{
			startCoordinates[1]--;
		}
		return getFormatedCoordinates();
	}

	@Override
	public String moveLeft() {
		
		if (startCoordinates[0]<=0  || (startCoordinates[0]>=10 && startCoordinates[0]<=40 && startCoordinates[1]>=10 && startCoordinates[1]<=40 && startCoordinates[2]>=10 && startCoordinates[2]<=40))
		{
			
		}
		else
		{
			startCoordinates[0]--;
		}
		return getFormatedCoordinates();
	}

	@Override
	public String moveRight() {
		
		if (startCoordinates[0]>=50  || (startCoordinates[0]>=10 && startCoordinates[0]<40 && startCoordinates[1]>10 && startCoordinates[1]<40 && startCoordinates[2]>10 && startCoordinates[2]<40))
		{
			
		}
		else 
		{
			startCoordinates[0]++;
		}
		return getFormatedCoordinates();
	}

	@Override
	public String moveBack() {
		
		if (startCoordinates[2]<=0  || (startCoordinates[0]>=10 && startCoordinates[0]<40 && startCoordinates[1]>=10 && startCoordinates[1]<=40 && startCoordinates[2]>=10 && startCoordinates[2]<=40))
		{
			
		}
		else
		{
			startCoordinates[2]--;
		}
		return getFormatedCoordinates();
	}

	@Override
	public String moveForth() {
		if (startCoordinates[2]>=50  || (startCoordinates[0]>=10 && startCoordinates[0]<=40 && startCoordinates[1]>=10 && startCoordinates[1]<=40 && startCoordinates[2]>=10 && startCoordinates[2]<=40))
		{
			
		} 
		else
		{
			startCoordinates[2]++;
		}
		
		return getFormatedCoordinates();
	}

	@Override
	public String getFormatedCoordinates() {
	
		return "Dron position:"  + "(" + Integer.toString(startCoordinates[0]) + "," + Integer.toString(startCoordinates[1])  +  "," + Integer.toString(startCoordinates[2]) + ")";
	}

	public int[] getStartCoordinates() {
		return startCoordinates;
	}

	public int[] getBoundaries() {
		return boundaries;
	}

	public void setStartCoordinates(int[] startCoordinates) {
		this.startCoordinates = startCoordinates;
	}

	public void setBoundaries(int[] boundaries) {
		this.boundaries = boundaries;
	}

}
