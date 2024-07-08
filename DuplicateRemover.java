package vishwanath_p1;

// importing all the functions from the libraries 
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Set;
import java.io.FileWriter;


import java.io.IOException;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;



public class DuplicateRemover {
	
	
   private Set<String> uniqueWords;
   
   
   public void remove(String dataFile) throws FileNotFoundException // removes duplicate words
   {
       uniqueWords = new HashSet<String>(); 
       Scanner a = new Scanner(new File(dataFile));
       String word;
       
       
       
       while(a.hasNext())
       {
    	   
    	   
           word=a.next();
           uniqueWords.add(word);
           
           
           
       }
       a.close();
      
      
   }
  
   
   public void write(String outputFile) throws IOException
   {
	   
	   // writing it to the output file
	   
	  
FileWriter b = null;
File c;


c = new File(outputFile);

if(c.exists()) {
b=new FileWriter(c,true);

Iterator e=uniqueWords.iterator(); 

while(e.hasNext())
	
	
	
{
   String str=(String)e.next();
   b.write(str+"\n");     
   
   
} 
b.close();
System.out.println("The data is written");
  



} 


else
{


Iterator kl=uniqueWords.iterator();
// create a new file if it does not exist. 

c.createNewFile();
b=new FileWriter(c);


while(kl.hasNext())
{
	
	
   String i=(String)kl.next();
   
   
   b.write(i+"\n");     
}


b.close();


System.out.println("Data Written to File");


}

   }

}
