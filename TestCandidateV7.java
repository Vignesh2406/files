/**
 * @purpose: To satisfy the requirements of the 16.04 assignment.
 * 
 * @author V. Swaminathan
 * @version 3/25/17
 */

public class TestCandidateV7
{
    private static Candidate[] election = new Candidate[10];
    private static int totalVotes = 0;
    public static void printVotes()
    {
        System.out.println("Results per Candidate:");
        System.out.println("======================");

        int index = 0;
        for(Candidate c : election)
        {
            if(election[index] != null)
                System.out.println(c.toString());
            
            index++;
        }
    }

    public static void getTotal()
    {
        totalVotes = 0;
        int index = 0;
        for(Candidate c : election)
        {
            if(election[index] != null)
                totalVotes += c.getVotes();
            
            index++;
        }
    }

    public static void printResults()
    {
        System.out.println();
        System.out.printf("%15s%10s%12s%8s%14s\n", "Candidate", " ", "Votes Received", " ", "% of Total Votes");
        
        int index = 0;
        for(Candidate c : election)
        {
            if(election[index] != null)
                System.out.printf("%15s%12s%12s%19s%5.5s\n", c.getName(), " ", c.getVotes(), " ", ((((double)(c.getVotes())/(double)totalVotes))*100));
            
            index++;
        }

        System.out.println();
        System.out.println("Total Number of Votes in this Election: " + totalVotes);
    }

    public static void replaceName(String original, String newName)
    {
        int index = 0;
        for(Candidate c : election)
        {
            if(c.getName().equals(original) && (election[index] != null))
            {
                c.setName(newName);
            }
            index++;
        }
    }

    public static void replaceVotes(String name, int newVotes)
    {
        int index = 0;
        for(Candidate c : election)
        {
            if(c.getName().equals(name) && (election[index] != null))
            {
                c.setVotes(newVotes);
            }
            index++;
        }
    }

    public static void replaceCandidate(String original, String newName, int newVotes)
    {
        int index = 0;
        for(Candidate c : election)
        {
            if(c.getName().equals(original) && (election[index] != null))
            {
                c.setName(newName);
                c.setVotes(newVotes);
            }
            index++;
        }
    }

    public static void insertCandidate(String insertBefore, String newName, int newVotes)
    {
        int location = 0;
        for(int index = election.length-1; index>0; index--)
        {
            if(election[index].getName().equals(insertBefore) && (election[index] != null))
            {
                location = index;
                break;
            }
            else if(election[index] == null)
            {
                location = index;
                break;
            }
        }

        for(int index = election.length-1; index>location; index--)
        {
            election[index] = election[index-1];
        }

        election[location] = new Candidate(newName, newVotes);
    }

    public static void insertPosition(int insertBefore, String newName, int newVotes)
    {
        int location = insertBefore;

        for(int index = election.length-1; index>location; index--)
        {
            election[index] = election[index-1];
        }

        election[location] = new Candidate(newName, newVotes);
    }

    public static void deleteByLoc(int deletePosition)
    {
        if((deletePosition > 0) && (deletePosition < election.length-1))
        {
            for(int index = deletePosition; index < election.length-1; index++)
            {
                election[index] = election[index + 1];
            }
            election[election.length-1] = null;
        }
    }

    public static void deleteByName(String deleteName)
    {
        int location = 0;
        int index = 0;

        for(index = 0; index < election.length; index++)
        {
            if(election[index].getName().equals(deleteName))
            {
                location = index;
                break;
            }
            else if (election[index] == null)
            {
                location = -1;
                break;
            }
        }

        if((index != election.length) && (location >= 0))
        {
            for(index = location; index < election.length-1; index++)
            {
                election[index] = election[index + 1];
            }

            election[election.length-1] = null;
        }
    }
    public static void main(String[] args)
    {
        election[0] = new Candidate("John Smith", 5000);
        election[1] = new Candidate("Mary Miller", 4000);
        election[2] = new Candidate("Michael Duffy", 6000);
        election[3] = new Candidate("Tim Robinson", 2500);
        election[4] = new Candidate("Joe Ashtony", 1800);
        election[5] = new Candidate("Mickey Jones", 3000);
        election[6] = new Candidate("Rebecca Morgan", 2000);
        election[7] = new Candidate("Kathleen Turner", 8000);
        election[8] = new Candidate("Tory Parker", 500);
        election[9] = new Candidate("Ashton Davis", 10000);

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