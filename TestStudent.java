/**
 * @purpose: To create a gradebook for a teacher that can satisfy the requirements of the 16.05 challenge assignment.
 * 
 * @author V. Swaminathan
 * @version 3/25/17
 */

import java.util.List;
import java.util.ArrayList;
public class TestStudent
{
    private static List<Student> myClass = new ArrayList<Student>(); //creates single array of objects

    /**
     * @method: printBook = outputs data to console in user-friendly format
     * 
     * @param none
     */
    public static void printBook()
    {
        //Header
        System.out.println();
        System.out.printf("%15s%2s%3.3s%6s%3.3s%6s%3.3s%6s%3.3s%6s%3.3s\n", "Student Name", " ", "Q1", " ", "Q2", " ", "Q3", " ", "Q4", " ", "Q5");
        System.out.println("==========================================================");

        //Entries
        for(Student s : myClass)
        {
            System.out.printf("%15s%2s%3.3s%6s%3.3s%6s%3.3s%6s%3.3s%6s%3.3s\n", s.getName(), " ", s.getQuiz(1), " ", s.getQuiz(2), " ", s.getQuiz(3), " ", s.getQuiz(4), " ", s.getQuiz(5));

        }

        //Break
        System.out.println();
    }

    /**
     * @method: replaceName = replaces a name in the array with another name entered by the user
     * 
     * @param newName = name that will replace existing student name
     * @param oldName = name that will be replaced (pre-condition: String oldName must exist in List<Student> myClass)
     */
    public static void replaceName(String newName, String oldName)
    {
        for(Student s : myClass)
        {
            if(s.getName().equals(oldName))
                s.setName(newName);
        }
    }

    /**
     * @method: replaceQuiz = replaces a quiz grade in the array with another grade entered by the user
     * 
     * @param student = student whose quiz grades are being altered
     * @param quiz = which quiz is being modified (pre-condition: int quiz must be in range [1, 5])
     * @param newGrade = grade that will replace existing grade
     */
    public static void replaceQuiz(String student, int quiz, int newGrade)
    {
        for(Student s : myClass)
        {
            if(s.getName().equals(student))
                s.setQuiz(quiz, newGrade);
        }
    }

    /**
     * @method: replaceStudent = replaces a student object with another student
     * 
     * @param oldStudent = name of student being replaced (pre-condition: oldStudent must be within myClass)
     * @param newStudent = initialized student object that will replace the old student
     */
    public static void replaceStudent(String oldStudent, Student newStudent)
    {
        int index = 0;
        int location = 0;

        for(index = 0; index < myClass.size(); index++)
        {
            if(myClass.get(index).getName().equals(oldStudent))
            {
                location = index;
                break;
            }
        }

        if(location != myClass.size())
        {
            myClass.remove(location);
            myClass.add(location, newStudent);
        }
    }

    /**
     * @method: insertStudent = inserts new student object in myClass
     * 
     * @param newStudent = Student object that will be entered (all constructor vars initialized by user in main())
     * @param beforeName = name of student that the new student object will be placed before in myClass (pre-condition: beforeName must be a name of a student in the myClass array)
     */
    public static void insertStudent(Student newStudent, String beforeName)
    {
        int index = 0;
        int location = 0;
        for(Student s : myClass)
        {
            if(s.getName().equals(beforeName))
                location = index;
            
            index++;
        }

        myClass.add(location, newStudent);
    }

    /**
     * @method: deleteStudent = deletes a student object in myClass
     * 
     * @param deleteStudent = name of student who will be deleted (pre-condition: deleteStudent must be a name within myClass)
     */
    public static void deleteStudent(String deleteStudent)
    {
        int location = 0;
        int index = 0;

        for(index = 0; index < myClass.size(); index++)
        {
            if(myClass.get(index).getName().equals(deleteStudent))
            {
                location = index;
                break;
            }
        }

        if(location != myClass.size()) //ensures that location is not larger than the array myClass
            myClass.remove(location);
    }

    public static void main(String[] args)
    {
        //First Output to Console
        System.out.println("Starting Gradebook: \n");

        //initialized students
        myClass.add(new Student("Mark Kennedy", 70, 80, 90, 100, 90));
        myClass.add(new Student("Max Gerard", 80, 85, 90, 85, 80));
        myClass.add(new Student("Jean Smith", 50, 79, 89, 99, 100));
        myClass.add(new Student("Betty Farm", 85, 80, 85, 88, 89));
        myClass.add(new Student("Dilbert Gamma", 70, 70, 90, 70, 80));

        //Original Book
        printBook();

        //First Change
        System.out.println("\nChanging Betty\'s name to Betty Boop: \n");
        replaceName("Betty Boop", "Betty Farm");
        printBook();

        //Second Change
        System.out.println("\nChanging Jean\'s quiz 1 score to 80: \n");
        replaceQuiz("Jean Smith", 1, 80);
        printBook();

        //Third Change
        System.out.println("\nReplacing Dilbert with Mike Kappa: 80, 80, 80, 90, 90: \n");
        replaceStudent("Dilbert Gamma", new Student("Mike Kappa", 80, 80, 80, 90, 90));
        printBook();

        //Fourth Change
        System.out.println("\nInserting Lily Mu: 85, 95, 70, 0, 100 before Betty: \n");
        insertStudent(new Student("Lily Mu", 85, 95, 70, 0, 100), "Betty Boop");
        printBook();

        //Fifth and Last Change
        System.out.println("\nDeleting Max Gerard: \n");
        deleteStudent("Max Gerard");
        printBook();

        //end program
    }
}