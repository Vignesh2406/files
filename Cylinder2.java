
/**
 * Cylinder2 class that extends Circle2
 * 
 * FLVS 2007
 * @author R. Enger 
 * @version 5/5/2007
 */
public class Cylinder2 extends Circle2
{
	// instance variables 
	private int height;

	/**
	 * Constructor for objects of class Cylinder2
	 */
	public Cylinder2(int x, int y, int rad, int h)
	{
		super(x, y, rad);
	    // initialise instance variables
		height = h;
	}

	public int getHeight()
	{
		
		return height;
	}
}
