/**
 * @purpose: To satisfy the requirements of the 13.03 assignment.
 * 
 * @author: V. Swaminathan
 * @version: 3/20/17
 */

public class TestPoly2
{
    TestPoly2()
    {
        //constructor
    }

    public static void showCenter(Circle2 c)
    {
        System.out.println("For " + c.toString() + " " + c.getCenter());
    }

    public static void main(String[] args)
    {
        Circle2 circle = new Circle2(2, 4, 6);
        Cylinder2 cylinder = new Cylinder2(10, 15, 3, 10);
        Oval2 oval = new Oval2(25, 10, 3, 6);
        OvalCylinder2 ovalCylinder = new OvalCylinder2(40, 10, 2, 10, 14);

        showCenter(circle);
        System.out.println();
        showCenter(cylinder);
        System.out.println();
        showCenter(oval);
        System.out.println();
        showCenter(ovalCylinder);
        System.out.println();
    }
}