/**
 * @purpose: To satisfy the requirements of the 14.03 assignment.
 * 
 * @author V. Swaminathan
 * @version 3/23/17
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
public class CaesarShiftDecryption
{
    private static final List<Character> alphabet = new ArrayList<Character>();
    private static List<Character> newAlphabet = new ArrayList<Character>();

    public CaesarShiftDecryption()
    {
        //
    }

    public static void makeCipherAlphabet(int shift)
    {
        alphabet.add('A');
        alphabet.add('B');
        alphabet.add('C');
        alphabet.add('D');
        alphabet.add('E');
        alphabet.add('F');
        alphabet.add('G');
        alphabet.add('H');
        alphabet.add('I');
        alphabet.add('J');
        alphabet.add('K');
        alphabet.add('L');
        alphabet.add('M');
        alphabet.add('N');
        alphabet.add('O');
        alphabet.add('P');
        alphabet.add('Q');
        alphabet.add('R');
        alphabet.add('S');
        alphabet.add('T');
        alphabet.add('U');
        alphabet.add('V');
        alphabet.add('W');
        alphabet.add('X');
        alphabet.add('Y');
        alphabet.add('Z');
        alphabet.add('A');
        alphabet.add('B');
        alphabet.add('C');
        alphabet.add('D');
        alphabet.add('E');
        alphabet.add('F');
        alphabet.add('G');
        alphabet.add('H');
        alphabet.add('I');
        alphabet.add('J');
        alphabet.add('K');
        alphabet.add('L');
        alphabet.add('M');
        alphabet.add('N');
        alphabet.add('O');
        alphabet.add('P');
        alphabet.add('Q');
        alphabet.add('R');
        alphabet.add('S');
        alphabet.add('T');
        alphabet.add('U');
        alphabet.add('V');
        alphabet.add('W');
        alphabet.add('X');
        alphabet.add('Y');
        alphabet.add('Z');
        
        for(int i = 0; i < 26; i++)
        {
            char temp = alphabet.get(i + shift);
            newAlphabet.add(temp);
        }
    }

     public static String makeDecryptedMessage(String message) throws IOException
    {
        String newMessage = " ";
        Scanner text = new Scanner(message.toUpperCase());
        
        while(text.hasNext())
        {
            String temp = text.next();
            for(int i = 0; i < temp.length(); i++)
            {
                newMessage += alphabet.get(newAlphabet.indexOf(temp.charAt(i)));
            }
            newMessage += " ";
        }
        
        return newMessage;
    }
}