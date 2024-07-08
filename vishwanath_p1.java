package vishwanath_p1;

import java.util.Scanner; 


public class firstquestion {
	
	public static void main(String args[]) 
    { 
		System.out.println("First type the number to encrypt and then type the number to decrypt ");
		
		System.out.println("Enter number to encrypt: ");
		Scanner a = new Scanner(System.in); 
 
        	int c= a.nextInt(); 
        	int d = c / 1000;
        	int e = (c % 1000) / 100;
        	int f = (c % 100) / 10;
        	int g = c % 10;
        	
        	d = (d + 7) % 10;
        	e = (e + 7) % 10;
        	f = (f + 7) % 10;
        	g = (g + 7) % 10;
        	
        	int finalvalue= (f * 1000 + g * 100 + d * 10 + e); 
        	System.out.println(finalvalue);
        
    		System.out.println("Enter number to decrypt: ");
        	int l= a.nextInt(); 
        	int h = l / 1000;
        	int i = (l % 1000) / 100;
        	int j = (l % 100) / 10;
        	int k = l % 10;
        	
        	h = (h + 3) % 10;
        	i = (i + 3) % 10;
        	j = (j + 3) % 10;
        	k = (k + 3) % 10;
        	
        	int realvalue= (j * 1000 + k * 100 + h * 10 + i); 
        	System.out.println(realvalue);
        }
        
        

    } 


