import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/*
    Week 31 Matrices
    Wesley Rogers 
    4/6/16
    Java 1.8u25, using Eclipse Mars
    Windows 7
    
    Drives a matrix class and tests several methods.
    
    What I learned: I learned how to transpose a matrix, I've never done matrices before.
    
    Difficulties: None.
*/

public class MatrixDriver {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = null;
        try {
            input = new Scanner(new File("prog464a.dat"));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        int[][] matrix = new int[5][5];
        
        for(int i = 0; i < matrix.length; i++){
            for(int k=0; k < matrix[0].length; k++){ //We ignore the last element, because that's where we put the max.
                matrix[i][k] = input.nextInt();
            }
        }
        
        Matrix m = new Matrix(matrix);
        
        System.out.println("Original matrix\n" + m);
        System.out.println("Diagonal Sum: " + m.diagonalSum());
        System.out.println("Anti-Diagonal Sum: " + m.antiDiagonalSum());
        System.out.println("Sum Matrix: \n" + m.sumMatrix());
        
        
        System.out.println();
        m.transpose();
                
        System.out.println("Transposed matrix\n" + m);
        System.out.println("Diagonal Sum: " + m.diagonalSum());
        System.out.println("Anti-Diagonal Sum: " + m.antiDiagonalSum());
        System.out.println("Sum Matrix: \n" + m.sumMatrix());
        
    }

}
/*
Original matrix
[45  67  89  12  -3]
[-3  -6  -7  -4  -9]
[96  81  -8  52  12]
[14  -7  72  29  -1]
[19  43  28  63  87]

Diagonal Sum: 147
Anti-Diagonal Sum: 69
Sum Matrix: 
[45  67  89  12  -3  210]
[-3  -6  -7  -4  -9  -29]
[96  81  -8  52  12  233]
[14  -7  72  29  -1  107]
[19  43  28  63  87  240]
[171  178  174  152  86  761]


Transposed matrix
[45  -3  96  14  19]
[67  -6  81  -7  43]
[89  -7  -8  72  28]
[12  -4  52  29  63]
[-3  -9  12  -1  87]

Diagonal Sum: 147
Anti-Diagonal Sum: 69
Sum Matrix: 
[45  -3  96  14  19  171]
[67  -6  81  -7  43  178]
[89  -7  -8  72  28  174]
[12  -4  52  29  63  152]
[-3  -9  12  -1  87  86]
[210  -29  233  107  240  761]
*/