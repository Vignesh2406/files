
/**
 * @purpose: To satisfy the requirements of the 14.06 Challenge Assignment.
 * 
 * @author V. Swaminathan
 * @version 3/24/17
 */

import java.util.List;
import java.util.ArrayList;
public class FindPrime
{
    private static List<Integer> primes = new ArrayList<Integer>();
    private static int myUpperLimit;
    public FindPrime()
    {
        //
    }

    public static void calcPrimes(int upperLimit)
    {
        int temp = 0;
        myUpperLimit = upperLimit;
        primes = new ArrayList<Integer>(); //resets array after each run

        for(int i = 0; i <= myUpperLimit; i++)
        {
            if(i == 2 || i == 3 || i == 5)
            {
                primes.add(i);
            }
            if(i % 2 != 0)
            {
                if(i % 3 != 0)
                {
                    if(i % 4 != 0)
                    {
                        if(i % 5 != 0)
                        {
                            primes.add(i);
                        }
                    }
                }
            }
        }
    }

    public static void showPrimes()
    {
        System.out.println("Primes between 1 and " + myUpperLimit + ": ");
        System.out.println("===============================================");

        for(int i : primes)
        {
            System.out.println(i);
        }
    }
}