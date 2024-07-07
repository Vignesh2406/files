/**
 * @purpose: To satisfy the requirements of the 17.02 assignment.
 * 
 * @author V. Swaminathan
 * @version 3/26/17
 */

public class Movie2
{
    private String title, studio;
    private int year;

    public Movie2(String title, String studio, int year)
    {
        this.title = title;
        this.studio = studio;
        this.year = year;
    }

    public String getTitle()
    {
        return title;
    }

    public String getStudio()
    {
        return studio;
    }

    public int getYear()
    {
        return year;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setStudio(String studio)
    {
        this.studio = studio;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public String toString()
    {
        return title + ", " + year + ", " + studio;
    }
}