/*
    THIS IS A PLACE TO STORE METHODS AND SOME OTHER STUFF. IGNORE.
*/

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
    
    //I need to redo this.
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
}
