import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/*
    Program 404a Name not found
    Wesley Rogers 
    2/19/16
    Java 1.8u25, using Eclipse Mars
    Windows 7

    Sorts numbers from an input file into an array where they're sorted.

    What I learned: Not much, number sorting is easy. Technically this only works on this specific set of inputs since we're working with arrays rather than array lists.
    
    Difficulties: None.
*/
public class SortingNumbers {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = null;
        try {
            //input = new Scanner(new File("prog404a1.dat"));
            input = new Scanner(new File("prog404a2.dat"));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        int[] nums = new int[24];
        int i;
        
        for(i = 0; i<24; i++){
            if(input.hasNextInt()){
                nums[i] = input.nextInt();
            }
        }
        
        i=0;
        Arrays.sort(nums);
        
        while(nums[i] < 0 && nums[i]!= 0){
            i++;
        }
        
        int[] negatives = Arrays.copyOfRange(nums, 0, i);
        int[] positives = Arrays.copyOfRange(nums, i, nums.length);
        i=0;
        System.out.println("Positive Negative");
        
        while(i<negatives.length || i<positives.length){
            System.out.print(lss((i<positives.length ? ""+positives[i] : ""), 8, false));
            System.out.print(lss((i<negatives.length ? ""+negatives[i] : ""), 8, false));
            System.out.println();
            i++;
        }
    }
    
    
    public static String lss(String string, int size, boolean isRightPadded){
        String stringOut = string;
        if (isRightPadded == true) {
            stringOut = String.format(("%1$" + size + "s"), string); //Pad it on the right if its short
        } else {
            stringOut = String.format(("%1$-" + size + "s"), string); //Pad it on the left if its short
        }
        stringOut = stringOut.substring(0, size);//Cut it short if its long.
        return stringOut; //Returns the formatted string.
    }
}
/*
Positive Negative
0       -76     
3       -56     
9       -55     
19      -55     
21      -45     
22      -34     
33      -22     
34      -16     
39      -8      
54      -3      
54              
55              
64              
66        

Positive Negative
3       -89     
8       -66     
10      -64     
22      -55     
34      -54     
45      -54     
55      -34     
55      -25     
56      -22     
76      -21     
        -19     
        -9      
        -3      
        -3      

*/