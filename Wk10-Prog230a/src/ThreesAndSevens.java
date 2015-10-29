/*
    Program 230a Threes and Sevens
    Wesley Rogers 
    10/29/15
    Java 1.8u25, using Eclipse Mars
    Windows 7

    Gives all of the multiples of three and seven that are under 100.

    What I learned: Arrays are weird, and there doesn't appear to be a way to easily merge them in default java.
    
    Difficulties: The method was throwing an out of bounds error if I don't subtract 1 from the smaller array's size because arrays start at 0, and If I move the - 1 in the array declaration anywhere else the array magically starts with a zero.
*/
import java.util.Arrays;

public class ThreesAndSevens {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //If I was calculating a varying number I'd use lists here, but arrays are faster because I know the numbers.
        int[] sevens = new int[14]; //There are 14 multiples of 7 less than 100
        int[] threes = new int[33]; //There are 33 multiples of 7 less than 100
        
        for (int i = 1; i < 34; i++){ //34, because its 33+1 so the array fills.
            if (7*i < 100){ //Iff 7*i is less than 100, add to the array.
                sevens[i-1] = 7*i;
            }
            
            if (3*i < 100){ //If 3*i is less than 100, add to the array.
                threes[i-1] = 3*i;
            }
        }
        System.out.println("The multiples of 3 or 7 that are under 100 are: " + Arrays.toString(mergeArrays(threes, sevens)));
    }
    
    //Merges and sorts arrays a1 and a2
    public static int[] mergeArrays(int[] a1, int[] a2){
        int arrayLength = a1.length + a2.length;
        int[] a3 = new int[arrayLength - 1];
        
        //I probably could have done this without an if thinking back.
        if (a1.length > a2.length){ //If the first array is larger than the second.
            
            for(int i=0; i < a1.length; i++){ //a3 = a1 takes its member limit with it, sadly.
                a3[i] = a1[i]; //Take the first array and set its members to a1
            }
            for(int i = a1.length; i < arrayLength - 1; i++){ 
                a3[i] = a2[i - a1.length]; //Append a2 to the end
            }
        } else {
            for(int i=0; i < a2.length; i++){ 
                a3[i] = a2[i]; //Take a2's members and put them in a3
            }
            for(int i = a2.length; i < arrayLength - 1; i++){
                a3[i] = a1[i - a2.length]; //Append a1 to the end
            }
        }
        
        //Sort, then return.
        Arrays.sort(a3);
        return a3;
        
    }
}
/*
The multiples of 3 or 7 that are under 100 are: [3, 6, 7, 9, 12, 14, 15, 18, 21, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 84, 87, 90, 91, 93, 96, 99]
*/
