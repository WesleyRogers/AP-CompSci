/*
    Program 162a Factorials
    Wesley Rogers 
    9/30/15
    Java 1.8u25, using Eclipse Mars
    Windows 7

    Gives the factorial of a number inputted and continues until you tell it to stop

    What I learned: Sometimes its cleaner to just shove some code into a method than it is to try and write it in the main method.
    
    Difficulties:
*/
import java.util.Scanner;

public class Factorials {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        boolean doAgain = true; //So it runs once.
        while (doAgain){
            System.out.print("Enter a number to get the factorial of: ");
            int factorialNum = input.nextInt();
            System.out.println("The factorial of " + factorialNum + " is " + factorial(factorialNum));
            
            System.out.print("Would you like to continue? (y/n) ");
            doAgain = shouldContinue(input.next().trim());
            System.out.print("\n");
        }
        System.out.println("\"End factorial processing\"");
    }
    
    //Gives the factorial of num
    public static long factorial(int num){
        int i = 1;
        long product = 1; //Long because factorials get VERY big VERY fast
        
        do {
            product = product * i; //Multiply the product by the next number up that is less than or equal to itself
            i++; //Increment i
        } while(i <= num);
        
        return product;
    }
    
    //Returns a boolean if s is either y, yes, Yes, or the string true.
    public static boolean shouldContinue(String s){
        boolean output; //So it doesn't do funny stuff
        if (s.equals("y") | s.toLowerCase().equals("yes") | s.equals("true")){ //String's equals method checks to see if to strings have the same characters.
            output = true; //if input is y, yes or true, continue.
        } else {
            output = false; //stop if not.
        }
        
        return output;
    }
}
/*
Enter a number to get the factorial of: 1
The factorial of 1 is 1
Would you like to continue? (y/n) y

Enter a number to get the factorial of: 2
The factorial of 2 is 2
Would you like to continue? (y/n) y

Enter a number to get the factorial of: 3
The factorial of 3 is 6
Would you like to continue? (y/n) y

Enter a number to get the factorial of: 6
The factorial of 6 is 720
Would you like to continue? (y/n) y

Enter a number to get the factorial of: 9
The factorial of 9 is 362880
Would you like to continue? (y/n) y

Enter a number to get the factorial of: 12
The factorial of 12 is 479001600
Would you like to continue? (y/n) n

"End factorial processing"
*/