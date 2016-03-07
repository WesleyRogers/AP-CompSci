import java.util.ArrayList;
import java.util.Arrays;

/* THIS IS A PLACE TO STORE METHODS AND SOME OTHER STUFF. IGNORE. */

/*
    PROGRAM NAME
    Wesley Rogers 
    DATE
    Java 1.8u25, using Eclipse Mars
    Windows 7

    DESCRIPTION

    What I learned: 
    
    Difficulties:
*/
public class Method_Repo {

    /**
     * Rounds the double num to places decimal places. Does not include trailing zeroes and returns a double.
     * @param num     The number to be rounded.
     * @param places  The number of places to be rounded to.
     * @return        The rounded number.
     */
    public static double round(double num, int places){
        double rounded = Math.round(num * Math.pow(10, places))/Math.pow(10, places); //Rounds number
        return rounded;
    }
    
    /**
     * Formats the String string to have a length of size.
     * @param string        The string to be formatted
     * @param size          The length of the formatted string.
     * @param isRightPadded Determines whether or not to pad the input from the left or the right.
     * @return       The formatted string.
     */
    public static String limitStringSize(String string, int size, boolean isRightPadded){
        String stringOut = string;
        if (isRightPadded == true) {
            stringOut = String.format(("%1$" + size + "s"), string); //Pad it on the right if its short
        } else {
            stringOut = String.format(("%1$-" + size + "s"), string); //Pad it on the left if its short
        }
        stringOut = stringOut.substring(0, size);//Cut it short if its long.
        return stringOut; //Returns the formatted string.
    }
    
    /**
     * Rounds double num to places decimal places, then lengthens it with trailing zeroes if needed.
     * @param num     The number to be rounded.
     * @param places  The number of places to be rounded to.
     * @return        The formatted string.
     */
    public static String roundWithZeroes(double num, int places){
        double rounded = Math.round(num * Math.pow(10, places))/Math.pow(10, places); //Round the number
        String output = String.format(("%."+ places + "f") , rounded); //Format the number to places places
        return output;
    }
    
    /**
     * Takes array a1 and array a2 and merges them together into array a3
     * @param a1  The first Array
     * @param a2  The second Array
     * @return    The sorted and merged array.
     */
    public static int[] mergeArrays(int[] a1, int[] a2){
        int arrayLength = a1.length + a2.length;
        int[] a3 = new int[arrayLength - 1];
        
        //I probably could have done this without an if thinking back.
        if (a1.length > a2.length){ //If the first array is larger than the second.
            
            for(int i=0; i < a1.length; i++){ //a3 = a1 takes its member limit with it, sadly.
                a3[i] = a1[i]; //Take the first array and set its members to a1
            }
            for(int i = a1.length; i < arrayLength - 1; i++){ 
                a3[i] = a2[(i - a1.length)]; //Append a2 to the end
            }
        } else {
            for(int i=0; i < a2.length; i++){ 
                a3[i] = a2[i]; //Take a2's members and put them in a3
            }
            for(int i = a2.length; i < arrayLength - 1; i++){
                a3[i] = a1[(i - a2.length)]; //Append a1 to the end
            }
        }
        
        //Sort, then return.
        Arrays.sort(a3);
        return a3;
        
    }
    
    /**
     * Averages an array of integers.
     * @param array  The array to be averaged.
     * @return       The average of the array.
     */
    public static double averageArray(int[] array){
        int sum = 0;
        for (int num : array){
            sum += num;
        }
        double avg = sum / ((double) array.length);
        return avg;
        
    }
    
    /**
     * Determines whether or not a variable should be set to true using standard input. "y", "yes", or "true" all return true.
     * @param s    The string to check.
     * @return     Boolean to whether or not something should continue.
     */
    public static boolean shouldContinue(String s){
        boolean output; //So it doesn't do funny stuff
        if (s.equals("y") || s.toLowerCase().equals("yes") || s.equals("true")){ //String's equals method checks to see if to strings have the same characters.
            output = true; //if input is y, yes or true, continue.
        } else {
            output = false; //stop if not.
        }
        
        return output;
    }
    
    /**
     * A version of quicksort modified to keep two arrays' members paired.
     * @param sort  The array to be sorted.
     * @param ids   The array to be paired.
     * @param start Where to start.
     * @param end   Where to end.
     */
    public static void sortInPairs(int[] sort, int[] ids, int start, int end){
        int low = start;
        int high = end;
        
        //This is the pivot, I use the middle of the array, although I've heard the last element in an array is also common.
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
    
    /**
     * Swaps two members of an array.
     * @param array The Array to have members swaped.
     * @param i     An index being swapped.
     * @param k     An index being swapped.
     */
    public static void swapArrayElements(int[] array, int i, int k){
        int temp = array[i];
        array[i] = array[k];
        array[k] = temp;
    }
    
    /**
     * Determines if an element is already within an array
     * @param array The array to be searched.
     * @param e     Teh element to be looked for.
     * @return      True if the element is found, false otherwise.
     */
    public static boolean isMemberInArray(int[] array, int e){
        for(int i = 0; i<array.length-1; i++){
            if (array[i] == e){
                return true;
            }
        }
        return false;
    }
    
    /**
     * Gets all of the prime numbers under max
     * @param max The maximum number to return.
     * @return An array of prime numbers under max.
     */
    public static Integer[] seive(int max){
        ArrayList<Integer> out = new ArrayList<Integer>();
        boolean[] primes = new boolean[max+1]; //For simplicities sake I'm ignoring the first and second indices.
        
        for(int i = 2; i*i<=max; i+=0){ //Don't increase i automagically, it must be done manually
            for(int k = 0; (i*(k+i)) <= max; k++){
                primes[i*(k+i)] = true; //Mark i^2 + k*i out because it's composite.
            }
            
            //Now to find the next i.
            boolean notFoundI = true;
            for(int l = i + 1; notFoundI; l++){
                if(!primes[l]){
                    i = l;
                    notFoundI=false;
                }
            }
            
        }
        
        //Add every instance of 'false' to the arraylist, as 'false''s are prime.
        for(int i=2; i<primes.length; i++){
            if(!primes[i]){
                out.add(new Integer(i));
            }
        }
        return out.toArray(new Integer[out.size()]);
    }
    
    /**
     * Determines where a number appears in an array.
     * @param array
     * @param e
     * @return
     */
    public static int whereMemberInArray(int[] array, int e){
        for(int i = 0; i<array.length-1; i++){
            if (array[i] == e){
                return i;
            }
        }
        return -1;
    }
    
    /**
     * Formats strings provided to all fit to a length, then are appended together.
     * @param size          The length to force all strings to.
     * @param isRightPadded Right padded?
     * @param string        The string(s) to be formatted.
     * @return              All string(s) formatted.
     */
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
    
    /**
     * Averages an array, ignoring zero elements.
     * @param array The array to average.
     * @return      The average of the array.
     */
    public static double averageArrayExcludeZero(int[] array){
        int ignoredElements = 0;
        int sum = 0;
        for (int num : array){
            if (num == 0){
                ignoredElements++;
            } else {
                sum += num;
            }
        }
        double avg = sum / ((double) array.length - ignoredElements);
        return avg;
        
    }
    
    /**
     * Creates an int[] array out of the ArrayList integers
     * @param integers The arraylist<Integer> to be converted to an int[] array.
     * @return         An array of int[]s created from integers.
     */
    public static int[] toIntArray(ArrayList<Integer> integers){
        int[] out = new int[integers.size()];
        for(int i = 0; i < out.length; i++){
            out[i] = integers.get(i);
        }
        
        return out;
    }
    
    /**
     * Prints an array out as a box.
     * @param list          The array to be printed.
     * @param width         How many elements wide the array should be.
     * @param elementLength 
     */
    public static void printArrayAsBox(int[] list, int width, int elementLength){
        for (int i=0; i < list.length; i++){
            //Print an integer, then add some spaces so its a string with length 4
            System.out.print(lss(elementLength, true, list[i]+""));
            
            if (i%width==width-1){ //If the number is a multiple of width, newline
                System.out.print("\n");
            }
        }
    }
    
    /**
     * Sorts an array list using bubble sort.
     * @param list The array to be sorted.
     */
    public static void bubbleSort(int[] list){
        boolean hasSwapped = true; //So it runs at least once.
        while(hasSwapped){
            hasSwapped = false;
            for(int i = 1; i < list.length; i++){
                if(list[i] < list[i-1]){
                    swapArrayElements(list, i, i-1);
                    hasSwapped = true;
                }
            }
        }
    }
}
