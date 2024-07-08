package vishwanath_p1;

import java.io.IOException;
import java.io.FileNotFoundException;
// importing file packages.
 

public class Application {
	

   public static void main(String[] args) throws IOException {
	   
       DuplicateRemover abc=new DuplicateRemover(); //creating an object
       
       abc.remove("problem1.txt"); 
       
     //removing and writing new files. 
       
       abc.write("unique_words.txt");
       
       
      

   }

}