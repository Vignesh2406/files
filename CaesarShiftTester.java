/**
 * @purpose: To satisfy the requirements of the 14.03 assignment.
 * 
 * @author V. Swaminathan
 * @version 3/23/17
 */

import java.util.Scanner;
import java.io.IOException;
public class CaesarShiftTester
{
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(System.in);
        String message = " ";
        int selector = 0;
        int shift = 0;

        System.out.println("----------------------- Caesar Shift Encrypter/Decrypter -----------------------");
        System.out.println("       Type \'1\' to encrypt or \'2\' to decrypt (enter \'3\' to quit)          ");
        System.out.println("--------------------------------------------------------------------------------");

        while(selector != 3)
        {
            System.out.print("Select option: ");
            selector = in.nextInt();
            System.out.println();

            if(selector == 1)
            {
                System.out.print("Type in the message for encryption: ");
                message = in.next();
                message += in.nextLine();
                System.out.println();
                
                System.out.print("Type in the shift: ");
                shift = in.nextInt();
                System.out.println();

                CaesarShiftEncryption.makeCipherAlphabet(shift);
                System.out.println("Encrytped message: " + CaesarShiftEncryption.makeEncryptedMessage(message));
                System.out.println();
            }
            if(selector == 2)
            {
                System.out.print("Type in the message for decryption: ");
                message = in.next();
                message += in.nextLine();
                System.out.println();

                System.out.print("Type in the shift: ");
                shift = in.nextInt();
                System.out.println();

                CaesarShiftDecryption.makeCipherAlphabet(shift);
                System.out.println("Decrypted message: " + CaesarShiftDecryption.makeDecryptedMessage(message));
                System.out.println();
            }


        }
    }
}