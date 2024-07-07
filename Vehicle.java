/**
 * @purpose: To satisfy the requirements of the 15.05 Challenge Program.
 * 
 * @author: V. Swaminathan
 * @version: 3/21/17
 */

public abstract class Vehicle
{
    private String name;
    private double cost;

    public Vehicle(String p, double c)
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


}