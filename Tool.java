/**
 * @purpose: To satisfy the requirements of the 15.05 Challenge Program.
 * 
 * @author: V.Swaminathan
 * @version: 3/21/17
 */

public class Tool implements Product, Comparable<Tool>
{
    private String name;
    private double cost;

    public Tool(String p, double c)
    {
        name = p;
        cost = c;
    }
    
    public String getName()
    {
        return name;
    }

    public double getCost()
    {
        return cost;
    }


    public int compareTo(Tool a)
    {
        if(a.getCost() == getCost())
        {
            return 0;
        }
        else if(a.getCost() > getCost())
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}