package drone;
 
public class FlySpace {
   
    protected Cube outerBoundaries;
    protected Cube innerBoundaries;
    
    public FlySpace()
    {
    	
    }
   
    public FlySpace(Cube outerCube, Cube innerCube)
    {
        outerBoundaries = outerCube;
        innerBoundaries = innerCube;
    }
 
    public Cube getOuterBoundaries() {
        return outerBoundaries;
    }
 
    public void setOuterBoundaries(Cube outerBoundaries) {
        this.outerBoundaries = outerBoundaries;
    }
 
    public Cube getInnerBoundaries() {
        return innerBoundaries;
    }
 
    public void setInnerBoundaries(Cube innerBoundaries) {
        this.innerBoundaries = innerBoundaries;
    }
}