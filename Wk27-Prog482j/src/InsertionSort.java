import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = null;
        ArrayList<Integer> list = new ArrayList<Integer>();
        try {
            input = new Scanner(new File("numsort.dat"));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        while(input.hasNextInt()){
            list.add(input.nextInt());
        }
        
        int[] nums = toIntArray(list);
        insertionSort(nums);
        
        printArrayAsBox(nums, 8, 4);
    }

    public static void insertionSort(int[] list){
        for(int i = 1; i<list.length; i++){ //For every element in the array, sort.
            int k = i;
            while(k > 0 && list[k] < list[k-1]){ //As many times as it takes, move the element at k to a point where it is sorted between the two elements.
                swapArrayElements(list, k, k-1); //Move it to the left, until it's in place.
                k = k - 1; 
            }
            
        }
        
        
    }
    
    public static void swapArrayElements(int[] array, int i, int k){
        int temp = array[i];
        array[i] = array[k];
        array[k] = temp;
    }
    
    public static int[] toIntArray(ArrayList<Integer> integers){
        int[] out = new int[integers.size()];
        for(int i = 0; i < out.length; i++){
            out[i] = integers.get(i);
        }
        
        return out;
    }
    
    public static void printArrayAsBox(int[] list, int width, int elementLength){
        for (int i=0; i < list.length; i++){
            //Print an integer, then add some spaces so its a string with length 4
            System.out.print(lss(elementLength, true, list[i]+""));
            
            if (i%width==width-1){ //If the number is a multiple of width, newline
                System.out.print("\n");
            }
        }
    }
    
    public static String lss(int size, boolean isRightPadded, String... string){
        String finalString = "";
        for(int i = 0; i < string.length; i++){
            String stringOut = string[i];
            if (isRightPadded == true) {
                stringOut = String.format(("%1$" + size + "s"), string[i]); //Pad it on the right if its short
            } else {
                stringOut = String.format(("%1$-" + size + "s"), string[i]); //Pad it on the left if its short
            }
            stringOut = stringOut.substring(0, size);//Cut it short if its long.
            finalString += stringOut;
        }
        return finalString; //Returns the formatted string.
    }
}
