
/**
 * This is a class that tests the Deck class.
 *
 *  < Your Name >
 *  < Today's Date >
 */

public class DeckTester 
{
   /**
    * The main method in this class checks the Deck operations for consistency.
    * @param args is not usemyDeck.
    */
   public static void main(String[] args)
   {
      /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
      /* Uncomment blocks of code to test the Deck class */
     // int[] myPointValues = {1,2,3,4,5,6,7,8,9,10,11,12,13};
     // String[] myRanks = {"2","3","4","5","6","7","8","9","10","jack","queen","king", "ace"};
     // String[] mySuits = {"club","diamond","heart","spade"};
      
   /*   int[] myPointValues = {2,1,6};
      String[] myRanks = {"A","B","C"};
      String[] mySuits = {"Giraffes","Lions"}; */
	   
	   	  int[] myPointValues = {12,11,13};
	      String[] myRanks = {"queen","jack","king"};
	      String[] mySuits = {"blue","red"}; 
      
      Deck myDeck = new Deck(myRanks,mySuits,myPointValues); 

      System.out.println("**** Original Deck Methods ****");
      System.out.println("  toString: \n" + myDeck.toString());
      System.out.println("  isEmpty: " + myDeck.isEmpty());
      System.out.println("  size: " + myDeck.size());
      System.out.println();
      System.out.println();

      System.out.println("**** Deal a Card ****");
      System.out.println("  deal: " + myDeck.deal());
      System.out.println();
      System.out.println();

   /*   System.out.println("**** Deck Methods After 1 Card Dealt ****");
      System.out.println("  toString:\n" );
      System.out.println("  isEmpty: " );
      System.out.println("  size: " );
      System.out.println();
      System.out.println();

      System.out.println("**** Deal Remaining 5 Cards ****");

      System.out.println();
      System.out.println();

      System.out.println("**** Deck Methods After All Cards Dealt ****");
      System.out.println("  toString:\n" );
      System.out.println("  isEmpty: " );
      System.out.println("  size: "  );
      System.out.println();
      System.out.println();

      System.out.println("**** Deal a Card From Empty Deck ****");
      System.out.println("  deal: " );
      System.out.println();
      System.out.println();


      /* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */

      // System.out.println("\n**** 52 Card Deck shuffle Tests ****");
      // String[] ranks52 = {"ace"};
      // String[] suits52 = {"spades"};
      // int[] pointValues52 = {1};

      // System.out.println("  The Starting Deck ");

      // System.out.println("  The Deck After Dealing a Card" );

      // System.out.println("  Shuffleing the Deck ");*/


   }
}