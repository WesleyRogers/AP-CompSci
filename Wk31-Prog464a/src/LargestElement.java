import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/*
    Program 464a Largest Element
    Wesley Rogers 
    4/5/16
    Java 1.8u25, using Eclipse Mars
    Windows 7
    
    Finds the largest element in a 5x5 matrix, and shoves the largest value int each row at the end of the row.
    
    What I learned: I had forgotten about Integer.MIN_VALUE, so remembering it here was handy. Not much else though.
    
    Difficulties: None.
*/

public class LargestElement {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = null;
        try {
            input = new Scanner(new File("prog464a.dat"));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        int[][] matrix = new int[5][6];
        
        for(int i = 0; i < matrix.length; i++){
            for(int k=0; k < matrix[0].length-1; k++){ //We ignore the last element, because that's where we put the max.
                matrix[i][k] = input.nextInt();
            }
        }
        
        for(int i = 0; i < matrix.length; i++){
            int max = Integer.MIN_VALUE; //I can't actually use zero here, this'll work better.
            for(int k=0; k < matrix[0].length-1; k++){ //We ignore the last element, because that's where we put the max.
                if(matrix[i][k] > max){
                    max = matrix[i][k];
                }
            }
            
            matrix[i][5] = max;
            System.out.println(Arrays.toString(matrix[i]).replaceAll(",", " ")); //Replacing comas with spaces makes it look better and it actually looks like a matrix.
        }
    }

}
/*
[45  67  89  12  -3  89]
[-3  -6  -7  -4  -9  -3]
[96  81  -8  52  12  96]
[14  -7  72  29  -1  72]
[19  43  28  63  87  87]
*/