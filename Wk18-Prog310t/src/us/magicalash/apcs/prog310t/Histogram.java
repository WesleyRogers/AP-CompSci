package us.magicalash.apcs.prog310t;

import java.util.ArrayList;
import us.magicalash.apcs.prog310a2.HistogramBar;


//There is probably a better way to do this using the collections framework, but I'm not very familiar with it.
public class Histogram {
    private ArrayList<HistogramBar> list = new ArrayList<HistogramBar>(); //This should not be touchable from the outside, because reasons.

    /**
     * Adds a HistogramBar to the Histogram.
     * @param hBar   The HistogramBar to be added.
     */
    public void add(HistogramBar hBar){
        list.add(hBar);
    }
    
    /**
     * Adds HistogramBar hBar at index.
     * @param hBar    The HistogramBar to be added.
     * @param index   The index to add hBar at.
     */
    public void add(HistogramBar hBar, int index){
        list.add(index, hBar);
    }
    
    /**
     * Sets the HistogramBar at index to the HistogramBar hBar.
     * @param hBar    The HistogramBar to be set within the list.
     * @param index   The index to change.
     */
    public void set(HistogramBar hBar, int index){
        list.set(index, hBar);
    }
    
    /**
     * Removes the object at the index.
     * @param index Index to remove.
     */
    public void delete(int index){
        list.remove(index);
    }
    
    /**
     * Removes the HistogramBar hBar.
     * @param hBar The HistogramBar to be removed.
     */
    public void delete(HistogramBar hBar){
        list.remove(hBar);
    }
    
    /**
     * Gets the HistogramBar at index index.
     * @param index The index to get 
     * @return
     */
    public HistogramBar get(int index){
        return list.get(index);
    }
    
    /**
     * Returns a string representation of the Histogram.
     * @return Returns a string representation of the Histogram.
     */
    public String getGraph(){
        return getGraph('*');
    }
    
    /**
     * Returns a string reprensation of the graph, using the character provided for the bars.
     * @param character The character to use as the bars for the graph.
     * @return A string reprensation of the Histogram.
     */
    public String getGraph(char character){
        String out = "";
        for (int k = 0; k<list.size(); k++){
            Object member = list.get(k);
            if (member != null){ // Skip any line that isn't a bar.
                out += limitStringSize(String.valueOf(k+1), 3, false) + " " + ((HistogramBar)member).getBar(character); //Add the index shortened or lengthened to 3 characters, then the histogrambar's string.
            }
            out += '\n';
        }
        return out;
    }
    
    /**
     * Prints getGraph();
     */
    public void printGraph(){
        printGraph('*');
    }
    
    /**
     * Prints getGraph(character);
     * @param character Character to use for the histogram's bars.
     */
    public void printGraph(char character){
        System.out.println(getGraph(character));
    }
    
    //Used locally only.
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
