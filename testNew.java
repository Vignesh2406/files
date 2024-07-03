 /**
 * @purpose: To satisfy the requirements of the 13.04 assignment.
 * 
 * @author: V. Swaminathan
 * @version: 3/20/17
 * 
 */

public class testNew
{
    testNew()
    {
        //constructor
    }

    public static void showEffectBoth(Rectangle3 r)
    {
        System.out.println(r);
    }

    public static void main(String[] args)
    {
        Rectangle3 rect = new Rectangle3(5, 20);
        Box3 box1 = new Box3(4, 4, 4);
        Box3 box2 = new Box3(4, 10, 5);
        Cube3 cube = new Cube3(4);

        showEffectBoth(rect);
        showEffectBoth(box1);
        showEffectBoth(box2);
        showEffectBoth(cube);

        box1.equals(cube);
        box2.equals(cube);
    }
}

System.out.print(two.toString());
        if (two.equals(four)){
            System.out.print(" is same size as ");
        }
        else{
            System.out.print(" is not the same size as ");
        }
        System.out.print(four.toString());
        
        System.out.println();
        
        System.out.print(three.toString());
        if (three.equals(four)){
            System.out.print(" is same size as ");
        }
        else{
            System.out.print(" is not the same size as ");
        }
        System.out.print(four.toString());