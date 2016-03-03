import java.util.Scanner;

import us.magicalash.apcs.wk22.Mathey;

/*
    Progeram 355t Prime Numbers Revisited
    Wesley Rogers 
    2/3/16
    Java 1.8u25, using Eclipse Mars
    Windows 7
    
    Gives the closest prime above and below a number.
        
    What I learned: Nothing, although I thought it was kinda cool to go back and revisit this.
    
    Difficulties: None.
*/
public class PrimeNumbers {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        String in;
        do{
            System.out.print("Enter an integer greater than 2 to see if it is prime. ");
            int num = input.nextInt();
            System.out.println("The closest prime below " + num + " is " + closestPrimeDown(num));
            System.out.println("The closest prime above " + num + " is " + closestPrimeUp(num));
            System.out.print("\nWould you like to try another number? ");
            in = input.next();
            
        } while (shouldContinue(in));
    }

    public static boolean shouldContinue(String s){
        boolean output; //So it doesn't do funny stuff
        if (s.equals("y") || s.toLowerCase().equals("yes") || s.equals("true")){ //String's equals method checks to see if to strings have the same characters.
            output = true; //if input is y, yes or true, continue.
        } else {
            output = false; //stop if not.
        }
        
        return output;
    }
    
    public static int closestPrimeDown(int num){
        int i = num;
        
        while (i > 0 && !Mathey.isPrime(i)){
            i--;
        }
        
        return i;
    }
    
    public static int closestPrimeUp(int num){
        int i = num;
        
        while (!Mathey.isPrime(i)){ //There is always another prime up, so no need for the extra check.
            i++;
        }
        
        return i;
    }

}
/*
Enter an integer greater than 2 to see if it is prime. 123
The closest prime below 123 is 113
The closest prime above 123 is 127

Would you like to try another number? y
Enter an integer greater than 2 to see if it is prime. 3
The closest prime below 3 is 3
The closest prime above 3 is 3

Would you like to try another number? n
*/