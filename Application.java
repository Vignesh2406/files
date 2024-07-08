package vishwanath_p2;

public class Application {
	
	
   public static void main(String[] args) {
	   
	   
       String inFilename = "problem2.txt";
       String outFilename = "unique_word_counts.txt";
       
       
       DuplicateCounter dc = new DuplicateCounter(); //creating a new object
       
       
       dc.count(inFilename); //counting 	
       dc.write(outFilename); //writing 
   }
}

