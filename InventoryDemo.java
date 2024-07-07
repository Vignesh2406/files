/**
 * @purpose: To satisfy the requirements of the 15.05 Challenge Program.
 * 
 * @author: V. Swaminathan
 * @version: 3/21/17
 */

import java.util.List;
import java.util.ArrayList;

public class InventoryDemo
{

    public static String takeInventory(String nm, List<Vehicle> c, List<Tool> t)
    {

        String product = nm;
        int quantity = 0;
        double totalCost = 0;

        for(Vehicle prod : c) //checks vehicles
        {
            if(product == prod.getName())
            {
                quantity++;
                totalCost += prod.getCost();
            }
        }

        for(Tool prod : t) //checks tools
        {
            if(product == prod.getName())
            {
                quantity++;
                totalCost += prod.getCost();
            }
        }

        return product + ": Quantity = " + quantity + ", Total Cost = " + totalCost;
    }

    public static void main(String[] args)
    {
        List<Vehicle> products = new ArrayList<Vehicle>(); //this gave me so many problems, so I just made this workaround - two different ArrayLists of different object types
        List<Tool> products2 = new ArrayList<Tool>();

        products.add(new Car("Jaguar", 1000000.00));
        products.add(new Car("Neon", 17000.00));
        products2.add(new Tool("JigSaw", 149.18));
        products.add(new Car("Jaguar", 1100000.00));
        products.add(new Car("Neon", 17500.00));
        products.add(new Car("Neon", 17875.32));
        products.add(new Truck("RAM", 35700.00));
        products2.add(new Tool("CircularSaw", 200.00));
        products2.add(new Tool("CircularSaw", 150.00));

        System.out.println(takeInventory("JigSaw", products, products2));
        System.out.println(takeInventory("Neon", products, products2));
        System.out.println(takeInventory("Jaguar", products, products2));
        System.out.println(takeInventory("RAM", products, products2));
        System.out.println(takeInventory("CircularSaw", products, products2));

        //Testing compareTo() method
        Tool saw1 = new Tool("saw1", 200);
        Tool saw2 = new Tool("saw2", 1500);

        if(saw1.compareTo(saw2) == 0)
            System.out.println("The saws cost the same.");
        else if(saw1.compareTo(saw2) > 1)
            System.out.println("The second saw is more expensive.");
        else
            System.out.println("The first saw is more expensive.");
    }
}