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
        String out = "";
        for(int i =0; i<round(this.value, 0); i++){
            out += "*";
        }
        out += " " + value;
        return out;
    }
    
    /**
     * Produces a histogram bar.
     * @param character    The symbol to use instead of an askerisk
     * @return             A historgram bar using 
     */
    public String getBar(char character){
        String out = "";
        for(int i =0; i<round(this.value,0); i++){
            out += character;
        }
        out += " " + value;
        return out;
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
}
