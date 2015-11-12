/*
    Program 209a Counting Numbers
    Wesley Rogers 
    11/12/15
    Java 1.8u25, using Eclipse Mars
    Windows 7

    Counts the number of numbers in file p209a.dat, and counts how many are above or equal to 500 and below 500.

    What I learned: Not much aside from a Try...Catch is required in eclipse
    
    Difficulties: The external file forced me to look back at 155t and see what I did. Apparently eclipse requires a try catch even if the file is present on compile. A good thing I guess.
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountingNumbers {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = null;
        try {
            input = new Scanner(new File("p209a.dat"));
        } catch (FileNotFoundException e) {
            //Something went very wrong!
            e.printStackTrace();
            System.exit(1);
        }
        int numUnder = 0;
        int numOver = 0;
        int totalNum = 0;
        while (input.hasNextInt()){
            if (input.nextInt() < 500){
                numUnder++;
            } else {
                numOver++;
            }
            totalNum++;
        }
        System.out.println("Total number of numbers: " + totalNum);
        System.out.println("Total number of numbers below 500: " + numUnder);
        System.out.println("Total number of numbers greater than or equal to 500: " + numOver);
    }

}
/*
Total number of numbers: 500
Total number of numbers below 500: 263
Total number of numbers greater than or equal to 500: 237
*/