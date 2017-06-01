package drone;
 
public class Cube {
    private int [] minCoordinates;
    private int cubeSideLength;
    private int [] maxCoordinates;
   
    public Cube(int [] cubeStartCoordinates, int side)
    {
        minCoordinates = new int[] {cubeStartCoordinates[0], cubeStartCoordinates[1], cubeStartCoordinates[2]};
        cubeSideLength = side;
        maxCoordinates = new int [] {cubeStartCoordinates[0] + side, cubeStartCoordinates[1] + side, cubeStartCoordinates[2] + side};
    }
   
    public Cube(Cube cube)
    {
        setMinCoordinates(cube.getMinCoordinates());
        setCubeSideLength(cube.getCubeSideLength());       
        setMaxCoordinates(cube.getMaxCoordinates());
    }
   
    public Cube()
    {
       
    }
   
    @Override
    public String toString()
    {
        return "Drone position: (" + Integer.toString(minCoordinates[0]) + ","
                + Integer.toString(minCoordinates[1]) + ","  
                + Integer.toString(minCoordinates[2]) + "), ("
                + Integer.toString(maxCoordinates[0]) + ","
                + Integer.toString(maxCoordinates[1]) + ","  
                + Integer.toString(maxCoordinates[2]) + ")";   
    }
 
    public int[] getMinCoordinates() {
        return minCoordinates;
    }
 
    public void setMinCoordinates(int[] minCoordinates) {
        this.minCoordinates = minCoordinates;
    }
 
    public int getCubeSideLength() {
        return cubeSideLength;
    }
 
    public void setCubeSideLength(int cubeSideLength) {
        this.cubeSideLength = cubeSideLength;
    }
 
    public void setMaxCoordinates(int[] maxCoordinates) {
        this.maxCoordinates = maxCoordinates;
    }
 
    public int[] getMaxCoordinates() {
        return maxCoordinates;
    }
}