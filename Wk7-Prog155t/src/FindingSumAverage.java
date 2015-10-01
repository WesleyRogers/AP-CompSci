import java.io.*;
import java.util.Scanner;

public class FindingSumAverage {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = null;
        int[] fileData = new int[17]; //I happen to know there are 17 elements.
        int sum = 0;
        int numNumbers = 0;
        
        try {
            input = new Scanner(new File("ints.dat"));
        } catch (FileNotFoundException e) {
            // If things explode, print the stack trace and close. Never let the null reach the print!
            e.printStackTrace();
            System.exit(0);
        }
        
        System.out.println("Scores");
        
        
        
        
        //Take the entire file and put it into an array.
        for(int i = 0; input.hasNextInt(); i++){ //If there's another input and its not zero, add a member to the array
            fileData[i] = input.nextInt();
        }
        
        for(int i=0; fileData[i] != 0; i++){ //If the element is not zero, go on
            sum += fileData[i];
            numNumbers++;
            System.out.println(fileData[i]);
        }
        
        double average = (sum+0.0)/numNumbers; //That the lord its actually a nice outcome.
        System.out.println("\nThere are " + numNumbers + " numbers in the scores set.");
        System.out.println("The average of the scores was " + average + ".");
        System.out.println("The suum of the scores was " + sum + ".");
    }

}
