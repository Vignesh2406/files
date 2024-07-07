/**
 * @purpose: To satisfy the requirements of the 16.01 assignment.
 * 
 * @author V. Swaminathan
 * @version 3/25/17
 */

import java.util.List;
import java.util.ArrayList;
public class TestCandidate
{
    private static List<Candidate> election = new ArrayList<Candidate>();
    private static int totalVotes = 0;
    public static void printVotes()
    {
        System.out.println("Results per Candidate:");
        System.out.println("======================");

        for(Candidate c : election)
        {
            System.out.println(c.toString());
        }
    }

    public static void getTotal()
    {
        for(Candidate c : election)
        {
            totalVotes += c.getVotes();
        }
    }

    public static void printResults()
    {
        System.out.println();
        System.out.printf("%14s%10s%12s%8s%14s\n", "Candidate", " ", "Votes Received", " ", "% of Total Votes");
        
        for(Candidate c : election)
        {
            System.out.printf("%14s%12s%12s%19s%5.5s\n", c.getName(), " ", c.getVotes(), " ", ((((double)(c.getVotes())/(double)totalVotes))*100));
        }

        System.out.println();
        System.out.println("Total Number of Votes in this Election: " + totalVotes);
    }
    public static void main(String[] args)
    {
        //List<Candidate> election = new ArrayList<Candidate>();
        election.add(new Candidate("John Smith", 5000));
        election.add(new Candidate("Mary Miller", 4000));
        election.add(new Candidate("Michael Duffy", 6000));
        election.add(new Candidate("Tim Robinson", 2500));
        election.add(new Candidate("Joe Ashtony", 1800));

        printVotes();
        getTotal();
        printResults();
    }
}