/**
 * Box3 demo.
 * 
 * FLVS 2007
 * @author R. Enger 
 * @version 5/5/2007
 */
public class Box3 extends Rectangle3
{
	// instance variables 
	private int height;

	/**
	 * Constructor for objects of class box
	 */
	public Box3(int l, int w, int h)
	{
		// call superclass
		super(l, w);
	    // initialise instance variables
		height = h;
	}

	// return the height
	public int getHeight()
	{
		return height;
	}
	
	public String toString()
	{
	    return "Box - " + getLength() + " X " + getWidth() + " X " + height;
	}

	public void equals(Box3 a)
	{
		if((getLength() == a.getLength()) && (getWidth() == a.getWidth()) && (getHeight() == a.getHeight()))
		{
			System.out.println(a.toString() + " is the same size as " + toString());
		}
		else
		{
			System.out.println(a.toString() + " is not the same size as " + toString());
		}
	}

}
