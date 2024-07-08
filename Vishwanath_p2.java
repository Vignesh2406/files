package vishwanath_p2;
public class Vishwanath_p2 {
	
	static class SavingsAccount{
		 
		  
		private double savingsBalance; // this is the private variable.
		 
		public static double annualInterestRate = 0.0; // this is the static variable.
		
		
		public SavingsAccount(double a){
		this.savingsBalance = a;   // Constructor for the class.
		}
		  
		
		public void calculateMonthlyInterest(){
		double interest = (this.savingsBalance * (annualInterestRate/100))/12; 
		this.savingsBalance += interest; // this is for the monthly interest
		}
		   
		
		public void showBalance(){
		System.out.printf("$%.2f", this.savingsBalance); // this is to to display balance
		}
		  
		
		public static void modifyInterestRate(double b){
		annualInterestRate = b; // this is to set the static variable
		}
		}

		public static class MainClass{
		public static void main(String[] args){
		SavingsAccount saver2 = new SavingsAccount(3000.00); 
		SavingsAccount saver1 = new SavingsAccount(2000.00); 
		SavingsAccount.modifyInterestRate(4.0); // the interest rate is set to 4 percent. 
		
		
		System.out.println("month \t\t saver1 \t saver2");
		  
		for(int c=1; c<=12; ++c){
		saver2.calculateMonthlyInterest(); 
		saver1.calculateMonthlyInterest();
		System.out.print("Month " + c + ": \t");
		saver1.showBalance(); 
		System.out.print("\t"); 
		saver2.showBalance();
		System.out.println();  } 		// Displaying data 
		System.out.println();
		   
		System.out.println("establishing the interest Rate to 5%");
		System.out.println();
		SavingsAccount.modifyInterestRate(5.0); 
		  
		saver2.calculateMonthlyInterest();
		saver1.calculateMonthlyInterest(); 
		  
		System.out.println("next month");
		System.out.print("month 13: \t");
		saver1.showBalance();
		System.out.print("\t");
		saver2.showBalance();
		}
		}

}