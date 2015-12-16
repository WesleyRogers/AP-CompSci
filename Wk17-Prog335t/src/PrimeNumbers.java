/*
    Program 335t Prime Numbers
    Wesley Rogers 
    12/15/15
    Java 1.8u25, using Eclipse Mars
    Windows 7

    Gives the nearest primes to a number that is input.

    What I learned: Not much, although I did find several prime numbers unintentionally.
    
    Difficulties: None.
*/
import java.util.Scanner;

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

    public static boolean isPrime(int num){ //This is extremely inefficient. Good lordy.
        if(num % 2 == 0){ //If num is a multiple of 2, go away.
            return false;
        }
        
        for(int i = 3; i < num; i+=2){ //Check every other number less than num to see if it is a divisor, because we already got rid of even numbers.
            if (isDivisor(num, i)){
                return false;
            }
        }
        
        return true;
    }
    
    public static boolean isDivisor(int a, int b){ //This just makes things easier to read.
        return (a+0.0)/b == Math.floor((a+0.0)/b);
    }
    
    public static boolean shouldContinue(String s){
        boolean output; //So it doesn't do funny stuff
        if (s.equals("y") | s.toLowerCase().equals("yes") | s.equals("true")){ //String's equals method checks to see if to strings have the same characters.
            output = true; //if input is y, yes or true, continue.
        } else {
            output = false; //stop if not.
        }
        
        return output;
    }
    
    //Closest prime below num
    public static int closestPrimeDown(int num){ // This is only to make it easier to read
        int out = num;
        while(!isPrime(out)){
            out--;
        }
        
        return out;
    }
    
    //Closest prime above num
    public static int closestPrimeUp(int num){
        int out = num;
        while(!isPrime(out)){
            out++;
        }
        
        return out;
    }
}
/*
Enter an integer greater than 2 to see if it is prime. 14
The closest prime below 14 is 13
The closest prime above 14 is 17

Would you like to try another number? y
Enter an integer greater than 2 to see if it is prime. 37
The closest prime below 37 is 37
The closest prime above 37 is 37

Would you like to try another number? yes
Enter an integer greater than 2 to see if it is prime. 2147483647
The closest prime below 2147483647 is 2147483647
The closest prime above 2147483647 is 2147483647

Would you like to try another number? true
Enter an integer greater than 2 to see if it is prime. 100
The closest prime below 100 is 97
The closest prime above 100 is 101

Would you like to try another number? no
*/