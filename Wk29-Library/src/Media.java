import java.util.Calendar;

/**
 * A class to handle media from a library.
 * @author wroge7934
 *
 */
public abstract class Media {

    private String title;
    private Calendar checkOut;
    
    /**
     * Sets the title to null, and sets the calendar to today.
     */
    public Media() {
        title = null;
        checkOut = Calendar.getInstance();
    }
    
    /**
     * Creates a media object.
     * @param title The title of the media object.
     * @param c     The check out date of the media object.
     */
    public Media(String title, Calendar c){
        this.title = title;
        checkOut = c;
    }

    /**
     * Clones a media object.
     * @param m The media object to be cloned.
     */
    public Media(Media m){
        
    }
    
    /* Getters */
    
    /**
     * Gets the title of the media.
     * @return the title of the media object.
     */
    public String getTitle() {
        return title;
    }
    
    /**
     * Gets the checkout date.
     * @return The check out date.
     */
    public Calendar getToday(){
        return checkOut;
    }
    
    /* Setters */
    
    /**
     * Sets the title of the media.
     * @param title The new title of the media.
     */
    public void setTitle(String title){
        this.title = title;
    }
    
    /**
     * Sets the check out date.
     * @param c The new check out date.
     */
    public void setToday(Calendar c){
        checkOut = c;
    }
    
    @Override
    public String toString(){
        return "This media has title: " + title + " and checkout date: " + checkOut;
    }
    
    /**
     * Returns the return date for the media object.
     * @return The return date for the media.
     */
    public abstract Calendar getReturnDate();
}
