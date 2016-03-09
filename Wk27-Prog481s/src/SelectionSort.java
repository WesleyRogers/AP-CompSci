import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/*
    Program 481s Selection Sort
    Wesley Rogers 
    3/9/16
    Java 1.8u25, using Eclipse Mars
    Windows 7
    
    Sorts an array using selection sort.
    
    What I learned: I learned how to usse selection sort! 
    
    Difficulties: None.
*/
public class SelectionSort {

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
        
        selectionSort(nums);
        printArrayAsBox(nums, 8, 4);
    }
    
    //Holy crap this is compact.
    public static void selectionSort(int[] list){
        for(int i = 0; i < list.length; i++){
            int min = i;
            for(int k = i+1; k < list.length;k++){
                if(list[k]  < list[min]){ //Find the lowest element in the array, move it to it's position.
                    min = k;
                }
            }
            swapArrayElements(list, min, i);
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
