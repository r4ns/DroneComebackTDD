package drone;

public class Drone implements StandardDrone{

	private int xKoordinata;
	private int yKoordinata;
	private int zKoordinata;
	private FlySpace fs;
	
	public Drone(){
		
	}
	
	public Drone(int x, int y, int z){
		this.xKoordinata=x;
		this.yKoordinata=y;
		this.zKoordinata=z;
	}
	public Drone(int x, int y, int z, FlySpace fs)throws DroneException{
		if(fs.getVelikaKocka().getMaxCoordinates()[0]<x || fs.getVelikaKocka().getMaxCoordinates()[1]<y || fs.getVelikaKocka().getMinCoordinates()[1]>y || fs.getVelikaKocka().getMaxCoordinates()[2]<z)
			throw new DroneException("Greska");
		else if(fs.getMalaKocka().getMaxCoordinates()[1]>y && fs.getMalaKocka().getMinCoordinates()[1]<y)
			throw new DroneException("Greska");
		this.xKoordinata=x;
		this.yKoordinata=y;
		this.zKoordinata=z;
		this.fs=fs;
	}
	@Override
	public String moveUp() {
		if(yKoordinata+1<=fs.getVelikaKocka().getMaxCoordinates()[1] && yKoordinata+1<=fs.getMalaKocka().getMinCoordinates()[1])
			yKoordinata++;
		
		return getFormatedCoordinates();
	}

	@Override
	public String moveDown() {
		if((yKoordinata-1>=fs.getVelikaKocka().getMinCoordinates()[1] && yKoordinata-1<=fs.getMalaKocka().getMinCoordinates()[1]) ||
			yKoordinata-1>=fs.getVelikaKocka().getMaxCoordinates()[1] && yKoordinata-1<=fs.getMalaKocka().getMaxCoordinates()[1])
			yKoordinata--;
		return getFormatedCoordinates();
	}

	@Override
	public String moveLeft() {
		if(xKoordinata-1>=fs.getVelikaKocka().getMinCoordinates()[0] && (xKoordinata-1<=fs.getMalaKocka().getMinCoordinates()[0] || xKoordinata-1>=fs.getMalaKocka().getMaxCoordinates()[0]))
			xKoordinata--;
		return getFormatedCoordinates();

	}

	@Override
	public String moveRight() {
		if(xKoordinata+1<=fs.getVelikaKocka().getMaxCoordinates()[0] && (xKoordinata+1<=fs.getMalaKocka().getMinCoordinates()[0] || xKoordinata+1>=fs.getMalaKocka().getMaxCoordinates()[0]))
			xKoordinata++;
				return getFormatedCoordinates();
	}

	@Override
	public String moveBack() {
		if(zKoordinata-1>=fs.getVelikaKocka().getMinCoordinates()[2] && (zKoordinata-1<=fs.getMalaKocka().getMinCoordinates()[2] || zKoordinata-1>=fs.getMalaKocka().getMaxCoordinates()[2]))
			zKoordinata--;
		return getFormatedCoordinates();
	}

	@Override
	public String moveForth() {
		if(zKoordinata+1<=fs.getVelikaKocka().getMaxCoordinates()[2] && (zKoordinata+1<=fs.getMalaKocka().getMinCoordinates()[2] || zKoordinata+1>=fs.getMalaKocka().getMaxCoordinates()[2]))
			zKoordinata++;
				return getFormatedCoordinates();
	}

	@Override
	public String getFormatedCoordinates() {
		return "("+xKoordinata+","+yKoordinata+","+zKoordinata+")";
	}

}
