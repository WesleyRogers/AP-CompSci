import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/*
    Program 465a Larger Element Matrix
    Wesley Rogers 
    4/6/16
    Java 1.8u25, using Eclipse Mars
    Windows 7
    
    Takes the larger element in each position of the matrix and puts it in the third matrix.
    
    What I learned: Not much.
    
    Difficulties: None.
*/

public class BiggerArray {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = null;
        try {
            input = new Scanner(new File("prog465a.dat"));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        int[][] first = new int[4][4];
        int[][] second = new int[4][4];
        int[][] biggest = new int[4][4];
        
        for(int i = 0; i < 4; i++){ //Import first matrix
            for(int k = 0; k < 4; k++){
                first[i][k] = input.nextInt();
            }
        }
        
        for(int i = 0; i < 4; i++){ //Import second matrix
            for(int k = 0; k < 4; k++){
                second[i][k] = input.nextInt();
            }
        }
        
        
        for(int i = 0; i < 4; i++){ //Find the biggest element and put it in the third matrix.
            for(int k = 0; k < 4; k++){
                biggest[i][k] = first[i][k] > second[i][k] ? first[i][k] : second[i][k];
            }
            
            System.out.println(Arrays.toString(biggest[i]).replaceAll(",", " ")); //Sorry, I hate commas. Print out the matrix.
        }
        
    }

}
/*
[4  7  6  7]
[6  2  3  8]
[9  7  2  6]
[8  3  3  1]

*/