/**
 * @purpose: To satisfy the requirements of the 18.03 assignment.
 * 
 * @author V. Swaminathan
 * @version 4/3/17
 */

public class TestContact
{
    public static void printContacts(Contact[] myContacts)
    {
        System.out.println("\nContact List:\n");
        System.out.printf("%12s%4s%8s%4s%8s%4s%10s%2s%18s\n", "Name", " ", "Relation", " ", "Birthday", " ", "Phone", " ", "Email");
        System.out.println("----------------------------------------------------------------------------");
        
        for(Contact c : myContacts)
        {
            System.out.println(c.toString());
        }

        System.out.println();
    }

    public static Contact[] sortByName(Contact[] myContacts)
    {
        int out = 0;
        int in = 0;
        int posmax = 0;
        Contact temp = new Contact(" ", " ", " ", " ", " ");
        Contact[] contacts = myContacts;

        for(out = contacts.length-1; out >= 0; out--)
        {
            posmax = 0;
            for(in = 0; in <= out; in++)
            {
                if(contacts[in].getName().compareTo(contacts[posmax].getName()) > 0)
                {
                    posmax = in;
                }

                temp = contacts[out];
                contacts[out] = contacts[posmax];
                contacts[posmax] = temp;
            }
        }

        return contacts;
    }

    public static Contact[] sortByEmail(Contact[] myContacts)
    {
        int out = 0;
        int in = 0;
        int posmax = 0;
        Contact temp = new Contact(" ", " ", " ", " ", " ");
        Contact[] contacts = myContacts;

        for(out = contacts.length-1; out >= 0; out--)
        {
            posmax = 0;
            for(in = 0; in <= out; in++)
            {
                if(contacts[in].getEmail().compareTo(contacts[posmax].getEmail()) > 0)
                {
                    posmax = in;
                }

                temp = contacts[out];
                contacts[out] = contacts[posmax];
                contacts[posmax] = temp;
            }
        }

        return contacts;
    }

    public static void findByName(Contact[] myContacts, String toFind)
    {
        int high = myContacts.length;
        int low = -1;
        int probe = 0;

        System.out.println("Find Name - " + toFind);
        while(high - low > 1)
        {
            probe = (high+low)/2;
            
            if(myContacts[probe].getName().compareTo(toFind) > 0)
            {
                high = probe;
            }
            else
            {
                low = probe;
            }
        }

        if((low >= 0) && (myContacts[low].getName().compareTo(toFind) == 0))
        {
            System.out.println("Found: " + myContacts[low].toString() + "\n");
        }
        else
        {
            System.out.println("Not Found: " + toFind + "\n");
        }
    }

    public static void findByEmail(Contact[] myContacts, String toFind)
    {
        int high = myContacts.length;
        int low = -1;
        int probe = 0;

        System.out.println("Find Email - " + toFind);
        while(high - low > 1)
        {
            probe = (high+low)/2;
            
            if(myContacts[probe].getEmail().compareTo(toFind) > 0)
            {
                high = probe;
            }
            else
            {
                low = probe;
            }
        }

        if((low >= 0) && (myContacts[low].getEmail().compareTo(toFind) == 0))
        {
            System.out.println("Found: " + myContacts[low].toString() + "\n");
        }
        else
        {
            System.out.println("Not Found: " + toFind + "\n");
        }
    }

    public static void findByRelation(Contact[] myContacts, String toFind)
    {
        int found = 0;

        System.out.println("Find Relation - " + toFind);

        for(int i = 0; i < myContacts.length; i++)
        {
            if(myContacts[i].getRelation().equals(toFind))
            {
                found++;
                System.out.println("Found: " + myContacts[i].toString());
            }
        }

        if(found != 0)
        {
            System.out.println();
        }
        else
        {
            System.out.println("Not Found.\n");
        }
    }

    public static void findByMonth(Contact[] myContacts, String toFind)
    {
        int found = 0;

        System.out.println("Find Bday - " + toFind);

        for(int i = 0; i < myContacts.length; i++)
        {
            if(myContacts[i].getBday().substring(0, 3).equals(toFind))
            {
                found++;
                System.out.println("Found: " + myContacts[i].toString());
            }
        }

        if(found != 0)
        {
            System.out.println();
        }
        else
        {
            System.out.println("Not Found.\n");
        }
    }

    public static void findByPhone(Contact[] myContacts, String toFind)
    {
        int found = 0;

        System.out.println("Find Phone - " + toFind);

        for(int i = 0; i < myContacts.length; i++)
        {
            if(myContacts[i].getPhone().equals(toFind))
            {
                found++;
                System.out.println("Found: " + myContacts[i].toString());
            }
        }

        if(found != 0)
        {
            System.out.println();
        }
        else
        {
            System.out.println("Not Found.\n");
        }
    }
    public static void main(String[] args)
    {
        Contact[] myContacts = new Contact[6];

        myContacts[0] = new Contact("John Carter", "brother", "Mar 3", "(342) 555-7069", "jcarter@carter.com");
        myContacts[1] = new Contact("Elise Carter", "mom", "Apr 19", "(342) 555-7011", "carterMom@carter.com");
        myContacts[2] = new Contact("Ellie Carter", "me", "Jun 10", "(342) 555-8102", "ecarter@carter.com");
        myContacts[3] = new Contact("Sue Ellen", "friend", "Mar 9", "(341) 555-9182", "susieE@hotmail.com");
        myContacts[4] = new Contact("Frank Carter", "dad", "Dec 1", "(342) 555-7011", "carterDad@carter.com");
        myContacts[5] = new Contact("Johnnie", "friend", "Jan 21", "(341) 555-7789", "jDawg5555@yahoo.com");

        printContacts(myContacts);

        myContacts = sortByName(myContacts);
        findByName(myContacts, "Johnnie");
        findByName(myContacts, "Sam Parker");

        findByRelation(myContacts, "friend");
        findByRelation(myContacts, "Aunt");

        findByPhone(myContacts, "(333) 555-8989");
        findByPhone(myContacts, "(342) 555-7011");

        findByMonth(myContacts, "May");
        findByMonth(myContacts, "Mar");

        myContacts = sortByEmail(myContacts);
        findByEmail(myContacts, "rgoodman@hotmail.com");
        findByEmail(myContacts, "susieE@hotmail.com");
    }
}