/**
 * @purpose: To satisfy the requirements of the 16.01 assignment.
 * 
 * @author V. Swaminathan
 * @version 3/25/17
 */

import java.util.List;
import java.util.ArrayList;
public class TestCandidateV4
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
        totalVotes = 0;
        for(Candidate c : election)
        {
            totalVotes += c.getVotes();
        }
    }

    public static void printResults()
    {
        System.out.println();
        System.out.printf("%15s%10s%12s%8s%14s\n", "Candidate", " ", "Votes Received", " ", "% of Total Votes");
        
        for(Candidate c : election)
        {
            System.out.printf("%15s%12s%12s%19s%5.5s\n", c.getName(), " ", c.getVotes(), " ", ((((double)(c.getVotes())/(double)totalVotes))*100));
        }

        System.out.println();
        System.out.println("Total Number of Votes in this Election: " + totalVotes);
    }

     public static void replaceName(String original, String newName)
    {
        for(Candidate c : election)
        {
            if(c.getName().equals(original))
            {
                c.setName(newName);
            }
        }
    }

    public static void replaceVotes(String name, int newVotes)
    {
        for(Candidate c : election)
        {
            if(c.getName().equals(name))
            {
                c.setVotes(newVotes);
            }
        }
    }

    public static void replaceCandidate(String original, String newName, int newVotes)
    {
        for(Candidate c : election)
        {
            if(c.getName().equals(original))
            {
                c.setName(newName);
                c.setVotes(newVotes);
            }
        }
    }
    public static void main(String[] args)
    {
        //List<Candidate> election = new ArrayList<Candidate>();
        election.add(new Candidate("John Smith", 5000));
        election.add(new Candidate("Mary Miller", 4000));
        election.add(new Candidate("Michael Duffy", 6000));
        election.add(new Candidate("Tim Robinson", 2500));
        election.add(new Candidate("Joe Ashtony", 1800));
        election.add(new Candidate("Mickey Jones", 3000));
        election.add(new Candidate("Rebecca Morgan", 2000));
        election.add(new Candidate("Kathleen Turner", 8000));
        election.add(new Candidate("Tory Parker", 500));
        election.add(new Candidate("Ashton Davis", 10000));

        System.out.println("Before Changes: \n");
        printVotes();
        getTotal();
        printResults();

        //Changes
        replaceName("Michael Duffy", "John Elmos");
        replaceVotes("Mickey Jones", 2500);
        replaceCandidate("Kathleen Turner", "John Kennedy", 8500);

        System.out.println("\nAfter Changes: \n");
        printVotes();
        getTotal();
        printResults();

    }
}