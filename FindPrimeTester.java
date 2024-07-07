/**
 * @purpose: To satisfy the requirements of the 14.06 Challenge Assignment.
 * 
 * @author V. Swaminathan
 * @version 3/24/17
 */

import java.util.Scanner;
import java.io.IOException;
public class FindPrimeTester
{
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(System.in);
        int upperLimit = 1;

        System.out.println("======================= Prime Number Calculator =======================");
        System.out.println("= How to Use: Select an upper limit for testing. All prime numbers    =");
        System.out.println("=             within the bounds [1, Your Number] will be displayed.   =");
        System.out.println("============================ Enter \'0\' to Quit ======================");
        System.out.println();

        while(upperLimit != 0)
        {
            System.out.print("Select an upper limit: ");
            upperLimit = in.nextInt();

            FindPrime.calcPrimes(upperLimit);
            FindPrime.showPrimes();

            System.out.println();
            System.out.println("================= Termination of Request ==================");
        }
    }
}