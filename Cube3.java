/**
 * @purpose: To satisfy the requirements of the 13.04 assignment.
 * 
 * @author: V. Swaminathan
 * @version: 3/20/17
 * 
 */

public class Cube3 extends Box3
{
    Cube3(int side)
    {
        super(side, side, side);
    }
    
    public String toString()
    {
         return "Cube - " + getLength() + " X " + getWidth() + " X " + getHeight();
    }
}