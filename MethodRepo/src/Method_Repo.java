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
        int avg = sum / array.length;
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
    
    
}
