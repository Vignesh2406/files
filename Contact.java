/**
 * @purpose: To satisfy the requirements of the 18.03 assignment.
 * 
 * @author V. Swaminathan
 * @version 4/3/17
 */

public class Contact
{
    private String name, relation, bday, phone, email;

    public Contact(String name, String relation, String bday, String phone, String email)
    {
        this.name = name;
        this.relation = relation;
        this.bday = bday;
        this.phone = phone;
        this.email = email;
    }

    public String getName()
    {
        return name;
    }

    public String getRelation()
    {
        return relation;
    }

    public String getBday()
    {
        return bday;
    }

    public String getPhone()
    {
        return phone;
    }

    public String getEmail()
    {
        return email;
    }

    public String toString()
    {
        return String.format("%12s%4s%8s%4s%8s%4s%14s%2s%20s", name, " ", relation, " ", bday, " ", phone, " ", email);
    }
}