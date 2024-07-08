package vishwanath_p1;
import java.security.SecureRandom;
import java.util.Scanner;

public class Vishwanath_p1 {

    public static int result;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();
        
        String question = "";
        int response = -1;
        int counter = 0;
        int correct = 0;
        int wrong = 0;
        int level = 0;
        int problemType = 0;
        while(true){
            while(true){
                System.out.print("Enter Difficulty Level (1-4): ");
                level = in.nextInt();
                if(level >= 1 && level <= 4){
                    break;
                }
            }
            while(true){
                System.out.print("Enter Problem Type (1-5): ");
                problemType = in.nextInt();
                if(problemType >= 1 && problemType <= 5){
                    break;
                }
            }
            while (counter < 10) {
                question = generateQuestion(level,problemType);
                System.out.print(question);
                int input = in.nextInt();

                if(result != input) {
                    response = rand.nextInt(4);
                    switch(response){
                        case 0:
                            System.out.println("No. Please try again.");
                        break;
                        case 1:
                            System.out.println("Wrong. Try once more");
                        break;
                        case 2:
                            System.out.println("Don't give up!");
                        break;
                        case 3:
                            System.out.println("No. Keep trying.");
                        break;
                    }
                    wrong++;
                }
                else{
                    response = rand.nextInt(4);
                    switch(response){
                        case 0:
                            System.out.println("Very good!");
                        break;
                        case 1:
                            System.out.println("Excellent!");
                        break;
                        case 2:
                            System.out.println("Nice Work!");
                        break;
                        case 3:
                            System.out.println("Keep up the good work!");
                        break;
                    }
                    correct++;
                }
                counter++;
            }
            double percentage = (((double)correct/(double)counter)*100.0);
            System.out.println("Correct Percentage: "+percentage);
            if(percentage < 75){
                System.out.println("Please ask your teacher for extra help");
            }
            else{
                System.out.println("Congratulations, you are ready to go to next level!");
            }
            counter = 0;
            correct = 0;
            wrong = 0;
            System.out.println("");
        }
    }
    public static String generateQuestion(int level, int problemType){
        SecureRandom rand = new SecureRandom();
        int num1 = 0;
        int num2 = 0;
        if(level == 1){
            num1 = rand.nextInt(10);
            num2 = rand.nextInt(10);
        }
        else if(level == 2){
            num1 = rand.nextInt(100);
            num2 = rand.nextInt(100);
        }
        else if(level == 3){
            num1 = rand.nextInt(1000);
            num2 = rand.nextInt(1000);
        }
        else if(level == 4){
            num1 = rand.nextInt(10000);
            num2 = rand.nextInt(10000);
        }
        
        if(problemType == 1){
            result = num1 + num2;
            return "How much is " + num1 + " + " + num2 + "? ";
        }
        else if(problemType == 2){
            result = num1 * num2;
            return "How much is " + num1 + " times " + num2 + "? ";
        }
        else if(problemType == 3){
            result = num1 - num2;
            return "How much is " + num1 + " - " + num2 + "? ";
        }
        else if(problemType == 4){
            result = num1 / num2;
            return "How much is " + num1 + " / " + num2 + "? ";
        }
        else if(problemType == 5){
            int temp = rand.nextInt(4);
            if(temp == 0){
                result = num1 + num2;
                return "How much is " + num1 + " + " + num2 + "? ";
            }
            else if(temp == 1){
                result = num1 * num2;
                return "How much is " + num1 + " times " + num2 + "? ";
            }
            else if(temp == 2){
                result = num1 - num2;
                return "How much is " + num1 + " - " + num2 + "? ";
            }
            if(temp == 3){
                result = num1 / num2;
                return "How much is " + num1 + " / " + num2 + "? ";
            }
        }
        return "";
    }
}