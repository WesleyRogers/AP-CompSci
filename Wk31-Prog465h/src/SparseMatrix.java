import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class SparseMatrix {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = null;
        try {
            input = new Scanner(new File("prog456h.dat"));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
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
        
        if(getNumNonZero(matrix) > height*width){
            System.out.println("The matrix is abundant.");
        } else if(getNumNonZero(matrix) == height*width){
            for(int i = 0; i < matrix.length; i++){
                for(int k = 0; k < matrix[0].length; k++){
                    if(matrix[i][k] != 0){
                        System.out.println(Arrays.toString(getReducedForm(matrix[i][k], i ,k)).replaceAll(",", " "));
                    }
                }
            }
            System.out.println("Both are equally efficient.");
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
