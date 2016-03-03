import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/*
    Program 408a Sorting Scores
    Wesley Rogers 
    2/22/16
    Java 1.8u25, using Eclipse Mars
    Windows 7
    
    Sorts scores and the attached id.
    
    What I learned: I learned to use quicksort! It's not too complicated, but it did take me a bit to get it working.
    
    Difficulties: I have no idea what you were trying to say in the doc, so I used Quicksort.
*/

public class SortingScores {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = null;
        try {
            input = new Scanner(new File("prog408a.dat"));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        int i = 0;
        int[] ids = new int[25];
        int[] scores = new int[25];
        while(input.hasNextInt()){
            ids[i] = input.nextInt();
            scores[i] = input.nextInt();
            i++;
        }
        
        sortInPairs(scores, ids, 0, scores.length-1);
        
        System.out.println("Id  Score");
        for(i=0; i < scores.length; i++){
            System.out.print(ids[i] + " ");
            System.out.println(scores[i]);
        }
        
        System.out.println("Good job to " + ids[24] + " for scoring the highest!");
    }
    
    
    //This is quicksort, modified to work in pairs.
    public static void sortInPairs(int[] sort, int[] ids, int start, int end){
        int low = start;
        int high = end;
        
        //This is the pivot. I use the middle of the array, although I've heard the last element in an array is also common.
        int mid = sort[((low+high)/2)];

        while (low <= high) {
            //If sort's element low index is below the pivot, move it there.
            while (sort[low] < mid) {
                low++;
            }
            //If sort's element high is above the pivot, move it there.
            while (sort[high] > mid) {
                high--;
            }
            
            //Swap elements that need to be on the other side of the pivot.
            if (low <= high) {
                swapArrayElements(sort, low, high);
                swapArrayElements(ids, low, high);
                low++;
                high--;
            }
        }
        
        //Sort the bottom half of the array recursively.
        if (start < high){
            sortInPairs(sort, ids, start, high);
        }
        //Sort the top half of the array recursively.
        if (low < end){
            sortInPairs(sort, ids, low, end);
        }
    }
    
    //Swaps two elements in a array.
    public static void swapArrayElements(int[] array, int i, int k){
        int temp = array[i];
        array[i] = array[k];
        array[k] = temp;
    }
}
/*
Id  Score
222 223
203 224
207 228
213 229
223 230
110 238
112 239
104 239
302 242
208 242
218 243
113 243
323 245
321 245
116 246
325 246
123 253
311 256
115 257
306 262
365 265
2 513
3 559
4 560
1 599
Good job to 1 for scoring the highest!
*/