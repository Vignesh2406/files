/**
 * @purpose: To create a gradebook for a teacher that can satisfy the requirements of the 16.05 challenge assignment.
 * 
 * @author V. Swaminathan
 * @version 3/25/17
 */

public class Student
{
    private String name; //name of student
    private int qz1, qz2, qz3, qz4, qz5; //integer vars for containing quiz grades

    /**
     * @constructor: Student = object constructor
     * 
     * @param name = student name
     * @param qz1 = first quiz grade
     * @param qz2 = second quiz grade
     * @param qz3 = third quiz grade
     * @param qz4 = fourth quiz grade
     * @param qz5 = fifth quiz grade
     */
    public Student(String name, int qz1, int qz2, int qz3, int qz4, int qz5)
    {
        this.name = name;
        this.qz1 = qz1;
        this.qz2 = qz2;
        this.qz3 = qz3;
        this.qz4 = qz4;
        this.qz5 = qz5;
    }

    /**
     * @method: getQuiz = returns quiz grade for selected quiz
     * 
     * @param qz = number of quiz to return a value for (pre-condition: must be within range [1, 5])
     */
    public int getQuiz(int qz)
    {
        if(qz == 1)
            return qz1;
        else if(qz == 2)
            return qz2;
        else if(qz == 3)
            return qz3;
        else if(qz == 4)
            return qz4;
        else
            return qz5;
    }

    /**
     * @method: getName = returns the name of the student
     * 
     * @param none
     */
    public String getName()
    {
        return name;
    }

    /**
     * @method: setQuiz = replaces a quiz grade based on input
     * 
     * @param qz = number of quiz to be modified
     * @param score = new quiz score
     */
    public void setQuiz(int qz, int score)
    {
        if(qz == 1)
            qz1 = score;
        else if(qz == 2)
            qz2 = score;
        else if(qz == 3)
            qz3 = score;
        else if(qz == 4)
            qz4 = score;
        else
            qz5 = score;
    }

    /**
     * @method: setName = replaces a name based on input
     * 
     * @param name = new name of student
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * @method: toString = displays a student and all corresponding quiz scores
     * 
     * @param none
     * @notes not used, more structured form achieved in TestStudent.java using System.out.printf() and getter methods of this class
     */
    public String toString()
    {
        return name + ": " + qz1 + " " + qz2 + " " + qz3 + " " + qz4 + " " + qz5;
    }
}