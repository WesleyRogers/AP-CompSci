/*
    Program 215h Athletic Averaging
    Wesley Rogers 
    12/16/15
    Java 1.8u25, using Eclipse Mars
    Windows 7

    Gives the athletic style average for contestants.

    What I learned: Not much, although I did leary Arrays.copyOfRange
    
    Difficulties: None.
*/

import java.util.Arrays;
import java.util.Scanner;

public class AthleticAveraging {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double[] scores = new double[8];
        double[] adjustedScores = new double[6];
        Scanner input = new Scanner(System.in);
        double average;
        
        System.out.print("Enter the number of contestants: ");
        int contestants = input.nextInt();
        
        for (int k = 1; k<contestants + 1; k++){ //This was a bit of an afterthought, allows you to enter multiple contestants.
            System.out.println("Enter contestant #" + k + "\'s scores, followed by a space.");
            
            for(int i = 0; i<8; i++){ //Get 8 scores as doubles
                scores[i] = input.nextDouble();
            }
            
            Arrays.sort(scores); //sort them
            adjustedScores = Arrays.copyOfRange(scores, 1, 7); // Take indexes 1-6 inclusive
            System.out.print("The average of contestant #" + k + " is: ");
            average = averageArray(adjustedScores);
            System.out.println(average + "\n");
        }
    }
    
    //Adjusted to be for doubles
    public static double averageArray(double[] array){
        double sum = 0;
        for (double num : array){
            sum += num;
        }
        double avg = sum / array.length;
        return avg;
        
    }
}
/*
Enter the number of contestants: 3
Enter contestant #1's scores, followed by a space.
8.4  9.1  8.5  8.4  9.1  8.7  8.8  9.1 
The average of contestant #1 is: 8.766666666666667

Enter contestant #2's scores, followed by a space.
7.0  7.0  7.0  7.0  7.0  7.0  7.0  7.0 
The average of contestant #2 is: 7.0

Enter contestant #3's scores, followed by a space.
8.0  7.9  8.0  8.0  8.0  8.0  8.0  8.1 
The average of contestant #3 is: 8.0
*/