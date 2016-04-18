import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/*
    Program 465h
    Wesley Rogers 
    4/7/16
    Java 1.8u25, using Eclipse Mars
    Windows 7
    
    Takes a matrix and determines whether or not reduced representation is more efficient.
    
    What I learned: Reduced representation is kinda useful. :D
    
    Difficulties: None.
*/

public class SparseMatrix {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = null;
        try {
            input = new Scanner(new File("prog465h.dat"));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        while(input.hasNextInt()){
            int height = input.nextInt();
            int width = input.nextInt();
            int[][] matrix = new int[height][width];
            
            System.out.println("Original Matrix: ");
            for(int i = 0; i < height; i++){
                for(int k = 0; k < width; k++){
                    matrix[i][k] = input.nextInt();
                }
                System.out.println(Arrays.toString(matrix[i]).replaceAll(",", " "));
            }
            
            if(getNumNonZero(matrix)*3 > (height*width)){ //If there are more non zero elements than zero elements:
                System.out.println("The matrix is abundant.\n");
            } else { //Else print the reduced form for everything in the matrix.
                for(int i = 0; i < matrix.length; i++){
                    for(int k = 0; k < matrix[0].length; k++){
                        if(matrix[i][k] != 0){
                            System.out.println(Arrays.toString(getReducedForm(matrix[i][k], i+1 ,k+1)).replaceAll(",", " ")); //i+1,k+1 because that's what the doc says it should look like.
                        }
                    }
                }
                
                if (getNumNonZero(matrix)*3 == (height*width)){
                    System.out.println("Both are equally efficient.\n");
                } else if (getNumNonZero(matrix)*3 < (height*width)){
                    System.out.println("The original matrix is sparse.\n");
                }
            }
        }
    }
    
    public static int[] getReducedForm(int val, int row, int col){
        int[] a = {row, col, val};
        return a;
    }
    
    public static int getNumNonZero(int[][] matrix){
        int nonzero = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int k = 0; k < matrix[0].length; k++){
                if(matrix[i][k] != 0){
                    nonzero++;
                }
            }
        }
        
        return nonzero;
    }
}
/*
Original Matrix: 
[0  0  7  0  0  0]
[0  0  0  0  -8  0]
[0  0  0  0  0  0]
[2  0  0  0  0  0]
[0  0  0  0  0  0]
[1  3  7]
[2  5  -8]
[4  1  2]
The original matrix is sparse.

Original Matrix: 
[0  2  0  3  0  1]
[8  0  4  0  1  0]
[0  3  0  1  0  -7]
[5  0  9  0  6  0]
[0  2  0  -1  0  7]
The matrix is abundant.

Original Matrix: 
[0  0  1  0  0  2]
[3  0  0  4  0  0]
[0  0  5  0  0  6]
[7  0  0  8  0  0]
[0  0  9  0  0  1]
[1  3  1]
[1  6  2]
[2  1  3]
[2  4  4]
[3  3  5]
[3  6  6]
[4  1  7]
[4  4  8]
[5  3  9]
[5  6  1]
Both are equally efficient.

*/