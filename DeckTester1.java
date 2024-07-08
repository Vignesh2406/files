package vign;

/*
**
 * This is a class that tests the Deck class.
 *
 *  < Vignesh Vishwanath >
 *  < 04/11/2018 >
 */

public class DeckTester1  
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
       
          //int[] myPointValues = {12,11,13};
          //String[] myRanks = {"queen","jack","king"};
         // String[] mySuits = {"blue","red"}; 
      
      //Deck1 myDeck = new Deck1(myRanks,mySuits,myPointValues); 

      //System.out.println("**** Original Deck Methods ****");
      //ystem.out.println("  toString: \n" + myDeck.toString());
     // System.out.println("  isEmpty: " + myDeck.isEmpty());
     // System.out.println("  size: " + myDeck.size());
     // System.out.println();
      //System.out.println();

      //System.out.println("**** Deal a Card ****");
      //System.out.println("  deal: " + myDeck.deal());
      //System.out.println();
      //System.out.println();

   /*System.out.println("**** Deck Methods After 1 Card Dealt ****");
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
      */ 

      //* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** *

	   int[] myPointValues = {1,2,3,4,5,6,7,8,9,10,11,12,13};
	     String[] myRanks = {"ace","2","3","4","5","6","7","8","9", "10","jack","queen","king"};
	      String[] mySuits = {"hearts","clubs","diamonds","spades"};

		Deck1 myDeck = new Deck1();

		System.out.println("**** Deal a Card From Empty Deck ****");
		System.out.println("  deal: " + myDeck.deal());

		myDeck = new Deck1(myRanks, mySuits, myPointValues);

		System.out.println("\n**** 52 Card Deck shuffle Tests ****");
		System.out.println(" After Creation:  ");

		System.out.println(myDeck.toString());
		System.out.println("  isEmpty: " + myDeck.isEmpty());
		System.out.println("  size: " + myDeck.size());
		System.out.println();
		System.out.println();

		System.out.println("**** Deal a Card ****");
		System.out.println("  deal: " + myDeck.deal());


   }
}