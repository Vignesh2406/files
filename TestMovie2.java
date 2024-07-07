/**
 * @purpose: To satisfy the requirements of the 17.02 assignment.
 * 
 * @author V. Swaminathan
 * @version 3/26/17
 */

import java.util.List;
import java.util.ArrayList;
public class TestMovie2
{
    //ArrayList used for holding objects - I know it might be overkill, but I just prefer working with them
    private static List<Movie2> myMovies = new ArrayList<Movie2>();

    /**
     * @method: printMovies = prints out the toString() info for each element in myMovies
     * 
     * @param null
     */
    public static void printMovies()
    {
        for(Movie2 m : myMovies)
        {
            System.out.println(m.toString());
        }
    }

    /**
     * @method: sortTitles = sorts elements in myMovies by title, order determined by user
     * 
     * @param ordering = selector for order of sort (ascending = 1, descending = 2)
     */
    public static void sortTitles(int ordering)
    {
        int out = 0;
        int in = 0;
        Movie2 temp = new Movie2("", "", 0);

        for(out = myMovies.size()-1; out > 0; out--)
        {
            for(in = 0; in < out; in++)
            {
                if(ordering == 1)
                {
                    if(myMovies.get(in).getTitle().compareTo(myMovies.get(in+1).getTitle()) > 0)
                    {
                        temp = myMovies.get(in + 1);
                        myMovies.set(in + 1, myMovies.get(in));
                        myMovies.set(in, temp);
                    }
                }
                else
                {
                    if(myMovies.get(in).getTitle().compareTo(myMovies.get(in+1).getTitle()) < 0)
                    {
                        temp = myMovies.get(in + 1);
                        myMovies.set(in + 1, myMovies.get(in));
                        myMovies.set(in, temp);
                    }
                }
            }
        }
    }

    /**
     * @method: sortYears = sorts elements in myMovies by year, order determined by user
     * 
     * @param ordering = selector for order of sort (ascending = 1, descending = 2)
     */
    public static void sortYears(int ordering)
    {
        int out = 0;
        int in = 0;
        Movie2 temp = new Movie2("", "", 0);

        for(out = myMovies.size()-1; out > 0; out--)
        {
            for(in = 0; in < out; in++)
            {
                if(ordering == 1)
                {
                    if(myMovies.get(in).getYear() > myMovies.get(in+1).getYear())
                    {
                        temp = myMovies.get(in + 1);
                        myMovies.set(in + 1, myMovies.get(in));
                        myMovies.set(in, temp);
                    }
                }
                else
                {
                    if(myMovies.get(in).getYear() < myMovies.get(in+1).getYear())
                    {
                        temp = myMovies.get(in + 1);
                        myMovies.set(in + 1, myMovies.get(in));
                        myMovies.set(in, temp);
                    }
                }
            }
        }
    }

    /**
     * @method: sortStudios = sorts elements in myMovies by studio, order determined by user
     * 
     * @param ordering = selector for order of sort (ascending = 1, descending = 2)
     */
    public static void sortStudios(int ordering)
    {
        int out = 0;
        int in = 0;
        Movie2 temp = new Movie2("", "", 0);

        for(out = myMovies.size()-1; out > 0; out--)
        {
            for(in = 0; in < out; in++)
            {
                if(ordering == 1)
                {
                    if(myMovies.get(in).getStudio().compareTo(myMovies.get(in+1).getStudio()) > 0)
                    {
                        temp = myMovies.get(in + 1);
                        myMovies.set(in + 1, myMovies.get(in));
                        myMovies.set(in, temp);
                    }
                }
                else
                {
                    if(myMovies.get(in).getStudio().compareTo(myMovies.get(in+1).getStudio()) < 0)
                    {
                        temp = myMovies.get(in + 1);
                        myMovies.set(in + 1, myMovies.get(in));
                        myMovies.set(in, temp);
                    }
                }
            }
        }
    }
    public static void main(String[] args)
    {
        myMovies.add(new Movie2("The Muppets Take Manhattan", "Columbia Tristar", 2001));
        myMovies.add(new Movie2("Mulan Special Edition", "Disney", 2004));
        myMovies.add(new Movie2("Shrek 2", "Dreamworks", 2004));
        myMovies.add(new Movie2("The Incredibles", "Pixar", 2004));
        myMovies.add(new Movie2("Nanny McPhee", "Universal", 2006));
        myMovies.add(new Movie2("The Curse of the Were-Rabbit", "Aardman", 2006));
        myMovies.add(new Movie2("Ice Age", "20th Century Fox", 2002));
        myMovies.add(new Movie2("Lilo & Stitch", "Disney", 2002));
        myMovies.add(new Movie2("Robots", "20th Century Fox", 2005));
        myMovies.add(new Movie2("Monsters Inc.", "Pixar", 2001));

        //First print
        System.out.println("\nBefore Sorting: ");
        printMovies();
        System.out.println();

        //Sorted by Title - ascending
        System.out.println("\nSorted by Title - ascending: ");
        sortTitles(1);
        printMovies();
        System.out.println();

        //Sorted by Year - descending
        System.out.println("\nSorted by Year - descending: ");
        sortYears(2);
        printMovies();
        System.out.println();

        //Sorted by Studio - ascending
        System.out.println("\nSorted by Studio - ascending: ");
        sortStudios(1);
        printMovies();
        System.out.println();

    }
}