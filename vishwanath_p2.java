import java.util.Scanner; 

public class secondquestion {
	public static void main(String args[]) {
		System.out.println("If you want to enter in pounds and inches, press 1.");
		System.out.println("If you want to enter in kilograms and meters, press 2.");
		Scanner a = new Scanner(System.in); 
		int b= a.nextInt();
		if(b==1) {
			System.out.println("Enter your height in inches");
			float c = a.nextFloat();
			System.out.println("Enter your weight in pounds");    
			float d = a.nextFloat();
			float BMI1=(float) (703*d);
			float BMI11= c*c;
			float h= (BMI1/BMI11);
			System.out.println(h);			
			
		}
		else if(b==2) {
			System.out.println("Enter your height in meters");
			float p = a.nextFloat();
			System.out.println("Enter your weight in kilograms");
			float f = a.nextFloat();
			float BMI2=(f/(p*p));
			System.out.println(BMI2);			
			 
		}
		else {
			System.out.println(); 
			System.out.println("please run again"); 
		}
		System.out.println(); 
		System.out.println("BMI Categories:\n");
		System.out.println("Underweight = <18.5\n");
		System.out.println("Overweight = 25–29.9\n");
		System.out.println("Obesity = BMI of 30 or greater\n"); 
	}

}
