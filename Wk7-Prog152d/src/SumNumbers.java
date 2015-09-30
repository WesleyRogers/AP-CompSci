/*
    Program 152d Sum Some Numbers
    Wesley Rogers 
    9/30/15
    Java 1.8u25, using Eclipse Mars
    Windows 7

    Sums and averages integers between the start value and the end value.

    What I learned: I learned that the do while loop 
    
    Difficulties: None, program was simple
*/
import java.util.Scanner;

public class SumNumbers {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        
        //Input
        System.out.print("Enter the number you'd like to start at. ");
        int startVal = input.nextInt();
        
        System.out.print("Enter the number you'd like to end at. ");
        int endVal = input.nextInt();
        
        int i = 0; //The number of numbers
        int sum = 0; //The sum of the numbers
        do { 
            sum += startVal+i; //Take the start value and add the i so that it is the next number up.
            i++; //Push i up to the next number.
        } while (i <= (endVal-startVal)); //If i is less than or equal to the distance between the start and end values, loop.
        
        //Output
        System.out.println("The sum of all integers between " + startVal + " and " + endVal +" is " + sum + ".");
        System.out.println("The average of all integers between " + startVal + " and " + endVal + " is " + ((sum+0.0)/i) + ".");
        
    }

}
/* Sample Output
Enter the number you'd like to start at. 5
Enter the number you'd like to end at. 8
The sum of all integers between 5 and 8 is 26.
The average of all integers between 5 and 8 is 6.5.

Enter the number you'd like to start at. 0
Enter the number you'd like to end at. 5
The sum of all integers between 0 and 5 is 15.
The average of all integers between 0 and 5 is 2.5.

Enter the number you'd like to start at. 1
Enter the number you'd like to end at. 5
The sum of all integers between 1 and 5 is 15.
The average of all integers between 1 and 5 is 3.0.

Enter the number you'd like to start at. 9
Enter the number you'd like to end at. 81
The sum of all integers between 9 and 81 is 3285.
The average of all integers between 9 and 81 is 45.0.

Enter the number you'd like to start at. -21
Enter the number you'd like to end at. 5
The sum of all integers between -21 and 5 is -216.
The average of all integers between -21 and 5 is -8.0.
*/