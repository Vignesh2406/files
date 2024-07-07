/**
 * @purpose: To satisfy the requirements of the 17.03 assignment.
 * 
 * @author V. Swaminathan
 * @version 3/26/17
 */

public class TestMovie3
{
    private static Movie[] myMovies = new Movie[10];

    /**
     * @method: printMovies = prints out the toString() info for each element in myMovies
     * 
     * @param null
     */
    public static void printMovies()
    {
        for(Movie m : myMovies)
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
        int posmax = 0;
        Movie temp = new Movie("", "", 0);

        for(out = myMovies.length-1; out >= 0; out--)
        {
            posmax = 0;
            for(in = 0; in <= out; in++)
            {
                if(ordering == 1)
                {
                    if(myMovies[in].getTitle().compareTo(myMovies[posmax].getTitle()) > 0)
                    {
                        posmax = in;
                    }
                }
                else
                {
                    if(myMovies[in].getTitle().compareTo(myMovies[posmax].getTitle()) < 0)
                    {
                        posmax = in;
                    }
                }

                temp = myMovies[out];
                myMovies[out] = myMovies[posmax];
                myMovies[posmax] = temp;
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
        int posmax = 0;
        Movie temp = new Movie("", "", 0);

        for(out = myMovies.length-1; out >= 0; out--)
        {
            posmax = 0;
            for(in = 0; in <= out; in++)
            {
                if(ordering == 1)
                {
                    if(myMovies[in].getYear() > myMovies[posmax].getYear())
                    {
                        posmax = in;
                    }
                }
                else
                {
                    if(myMovies[in].getYear() < myMovies[posmax].getYear())
                    {
                        posmax = in;
                    }
                }
            }

            temp = myMovies[out];
            myMovies[out] = myMovies[posmax];
            myMovies[posmax] = temp;
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
        int posmax = 0;
        Movie temp = new Movie("", "", 0);

        for(out = myMovies.length-1; out >= 0; out--)
        {
            posmax = 0;
            for(in = 0; in <= out; in++)
            {
                if(ordering == 1)
                {
                    if(myMovies[in].getStudio().compareTo(myMovies[posmax].getStudio()) > 0)
                    {
                        posmax = in;
                    }
                }
                else
                {
                    if(myMovies[in].getStudio().compareTo(myMovies[posmax].getStudio()) < 0)
                    {
                        posmax = in;
                    }
                }
            }

            temp = myMovies[out];
            myMovies[out] = myMovies[posmax];
            myMovies[posmax] = temp;
        }
    }
    public static void main(String[] args)
    {
        myMovies[0] = new Movie("The Muppets Take Manhattan", "Columbia Tristar", 2001);
        myMovies[1] = new Movie("Mulan Special Edition", "Disney", 2004);
        myMovies[2] = new Movie("Shrek 2", "Dreamworks", 2004);
        myMovies[3] = new Movie("The Incredibles", "Pixar", 2004);
        myMovies[4] = new Movie("Nanny McPhee", "Universal", 2006);
        myMovies[5] = new Movie("The Curse of the Were-Rabbit", "Aardman", 2006);
        myMovies[6] = new Movie("Ice Age", "20th Century Fox", 2002);
        myMovies[7] = new Movie("Lilo & Stitch", "Disney", 2002);
        myMovies[8] = new Movie("Robots", "20th Century Fox", 2005);
        myMovies[9] = new Movie("Monsters Inc.", "Pixar", 2001);

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