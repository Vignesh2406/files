/**
 * @purpose: To satisfy the requirements of the 16.04 assignment.
 * 
 * @author V. Swaminathan
 * @version 3/25/17
 */

import java.util.List;
import java.util.ArrayList;
public class TestCandidateV8
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

    public static void insertCandidate(String insertBefore, String newName, int newVotes)
    {
        int location = 0;
        
        for(Candidate c : election)
        {
            if(c.getName().equals(insertBefore))
            {
                location = election.indexOf(c);
            }
        }

        election.add(location, new Candidate(newName, newVotes));
    }

    public static void insertPosition(int insertBefore, String newName, int newVotes)
    {
        int location = insertBefore;

        election.add(location, new Candidate(newName, newVotes));
    }

    public static void deleteByName(String deleteName)
    {
        int location = 0;
        int index = 0;

        for(index = 0; index < election.size(); index++)
        {
            if(election.get(index).getName().equals(deleteName))
            {
                location = index;
                break;
            }
        }

        if(index != election.size())
        {
            election.remove(location);
        }
    }

    public static void deleteByLoc(int deletePosition)
    {
        election.remove(deletePosition);
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
        deleteByLoc(6);

        System.out.println("\nAfter Changes: Deleted Location 6\n");
        printVotes();
        getTotal();
        printResults();

        //Changes
        deleteByName("Kathleen Turner");

        System.out.println("\nAfter Changes: Deleted Kathleen Turner\n");
        printVotes();
        getTotal();
        printResults();

    }
}