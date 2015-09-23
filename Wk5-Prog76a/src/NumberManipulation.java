/*
    Program 76a Number Manipulation
    Wesley Rogers 
    9/21/15
    Java 1.8u25, using Eclipse Mars
    Windows 7

    Takes a digit you dislike and multiplies it a couple of times so you really dislike it.

    What I learned: Spacing is weird because of backslashes, and adding in a long won't hurt too much assuming time isn't extremely important.
    
    Difficulties: The last multiplication threw me because log2(9*12345679*1000*9) = 39.--- which caused integer overflow and was returning a negative number.
*/
import java.util.*;

public class NumberManipulation {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a digit you dislike: \n           ");
        int disliked = input.nextInt();
        
        System.out.println("         * 9 \n __________");
        System.out.println("         "+ (9l*disliked));
        System.out.println("         * 12345679 \n __________");
        System.out.println("Suprise! " + (9l*12345679*disliked));
        System.out.println("         * 1000 \n __________");
        System.out.println("\"No suprise\"? "+(9*1000*12345679*disliked)); // This line threw me off as it can get larger than 2^32
    }

}
/* Sample Output
Enter a digit you dislike: 
           9
         * 9 
 __________
         81
         * 12345679 
 __________
Suprise! 999999999
         * 1000 
 __________
"No suprise"? 999999999000
*/