/*
    Program 72a Identity Theft
    Wesley Rogers 
    9/21/2015
    Java 1.8u25, using Eclipse Mars
    Windows 7

    Gives the attached letter of a fake CC number given the number.

    What I learned: ASCII Capital letters start at 65
    
    Difficulties: Nothing really.
*/

import java.util.Scanner;

public class IdentityTheft {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the CC Number: ");
        int numOne = input.nextInt();
        int numTwo = input.nextInt();
        int numThree = input.nextInt();
        int numFour = input.nextInt();
        String ccNumber = numOne + " " +numTwo + " " +numThree + " " +numFour + " "; //I chose this over just getting the entire line because you could enter numbers on more than one line.
        
        //The actual letter part. This was suprisingly simple.
        int letterNum = ((numOne+numTwo+numThree+numFour)% 26)+65;//Getting the letter, 65 is so that the numbers star at A
        char letter = (char) letterNum; // Turning the number into a letter
        System.out.println("The correct number and code is "+ccNumber+letter);
    }

}
/* Sample Output
Enter the CC Number: 16 26 26 26
The correct number and code is 16 26 26 26 Q

Enter the CC Number: 26 54 74 56
The correct number and code is 26 54 74 56 C

Enter the CC Number: 26 26 26 26
The correct number and code is 26 26 26 26 A

Enter the CC Number: 26 54 74 55
The correct number and code is 26 54 74 55 B
*/