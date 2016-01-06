package us.magicalash.apcs.prog310a2;

public class HistogramBar {
    private double value;

    /**
     * Class Constructor
     * @param value    The value of the Histogram Bar
     */
    public HistogramBar(double value){
        this.value = value;
    }
    
    /**
     * @return     Returns a bar with the proper number of Asterisks
     */
    public String getBar(){
        return getBar('*');
    }
    
    /**
     * Produces a histogram bar.
     * @param character    The symbol to use instead of an askerisk
     * @return             A historgram bar using 
     */
    public String getBar(char character){
        String out = limitStringSize(String.valueOf(this.value) + " ", 8, true);
        for(int i =0; i<round(this.value/1000d,0); i++){
            out += character;
        }
        return out + " ";
    }
    
    /**
     * Prints a histogram bar to the System Output.
     */
    public void printBar(){
        System.out.println(this.getBar());
    }
    
    /**
     * Prints a histogram bar to the System Output using character as a character.
     * @param character    The character to use for the bar.
     */
    public void printBar(char character){
        System.out.println(this.getBar(character));
    }
    
    //This is used locally only. Rounds to places places.
    private static double round(double num, int places){
        double rounded = Math.round(num * Math.pow(10, places))/Math.pow(10, places); //Rounds number
        return rounded;
    }
    
    //Used locally only
    private static String limitStringSize(String string, int size, boolean isRightPadded){
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
