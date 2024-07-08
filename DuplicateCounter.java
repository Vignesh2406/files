package vishwanath_p2;

import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

import java.util.Map;
import java.util.HashMap;
import java.io.PrintWriter;

// importing libraries 


public class DuplicateCounter
{
   private Map<String, Integer> wordCounter;
  
   
   public DuplicateCounter(){
       wordCounter = new HashMap<String,Integer>();
   }
  
   
   public void count(String name_offile){
       
       Scanner a = null;
       try {
    	   //reading input files. 
    	   
           a = new Scanner(new File(name_offile));
           
           
       } catch (FileNotFoundException j) {
    	   
    	   
           System.out.println(j.getMessage()); 
           
           
           return;
           
       }
       a.useDelimiter("([0-9]|[.,!?:;'\"-]|\\s)+"); //extracting 
       
       
       
       
       while(a.hasNext()) { 
    	   
    	   
           String aword = a.next().toLowerCase();
           Integer count = wordCounter.get(aword); 
           
           
           if(count == null)
               count = 1;
           
           
           else
               count = count + 1;
           wordCounter.put(aword, count);
           
           
       }
       a.close();
   }
  
   public void write(String name_offile){ //writing files
       
	   
	   
       try {
           PrintWriter outputFile = new PrintWriter(new File(name_offile));
           
           
           for(String f : wordCounter.keySet()) {
        	   outputFile.println(f + " " + wordCounter.get(f));
        	   
           } 
           outputFile.close(); 
           
           
           
       } catch (FileNotFoundException i) {//catching exceptions
    	   
    	   
           System.out.println(i.getMessage()); 
           
           
       }
   }
  
}