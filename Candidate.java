/**
 * @purpose: To satisfy the requirements of the 16.04 assignment.
 * 
 * @author V. Swaminathan
 * @version 3/25/17
 */

public class Candidate
{
    private String name;
    private int numVotes;

    public Candidate(String name, int numVotes)
    {
        this.name = name;
        this.numVotes = numVotes;
    }

    public String toString()
    {
        return name + " received " + numVotes + " votes.";
    }

    public int getVotes()
    {
        return numVotes;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setVotes(int votes)
    {
        numVotes = votes;
    }
}