import java.util.Calendar;

/**
 * A class for an audiobook, without the audiobook. Holds information about the audiobook though.
 * @author wroge7934
 *
 */
public class AudioBook extends Media {

    private String narr;
    private int year;
    
    
    /* Constructors */
    
    
    /**
     * Creates an empty AudioBook object.
     */
    public AudioBook() {
        // TODO Auto-generated constructor stub
        super();
    }
    
    /**
     * Creates a AudioBook object.
     * @param title Title of the AudioBook.
     * @param c     Date of checkout.
     */
    public AudioBook(String title, Calendar c) {
        super(title, c);
        // TODO Auto-generated constructor stub
    }
    
    /**
     * Creates a AudioBook object.
     * @param title The title of the AudioBook.
     * @param c     The date of checkout.
     * @param year  The year th AudioBook was released.
     */
    public AudioBook(String title, Calendar c, int year, String narr){
        super(title, c);
        this.year = year;
        this.narr = narr;
    }
    
    /**
     * Clones audiobook a.
     * @param a The audiobook to be cloned.
     */
    public AudioBook(AudioBook a){
        super(a.getTitle(), a.getToday());
        this.year = a.getYear();
    }
    
    
    /* Getters */
    
    /**
     * Gets the year the audiobook was released.
     * @return They year of release.
     */
    public int getYear(){
        return year;
    }
    
    /**
     * Gets the narrator of the audiobook.
     * @return The narrator.
     */
    public String getNarrator(){
        return narr;
    }
    
    /**
     * Gets the return date for the book.
     */
    @Override
    public Calendar getReturnDate(){
        Calendar due = Calendar.getInstance();
        due.set(Calendar.MONTH, super.getToday().get(Calendar.MONTH));
        due.set(Calendar.YEAR, super.getToday().get(Calendar.YEAR));
        due.add(Calendar.DATE, 14);
        return due;
    }

    
    /* Setters */
    
    
    public void setNarrator(String s){
        this.narr = s;
    }
    
    public void setYear(int y){
        this.year = y;
    }
    
    
    /* Other Methods */
    
    @Override //Not required since it overrides a java.lang.Object method, but I still prefer to do this as it makes sense.
    public String toString(){
        return "The title of the audiobook is: " + super.getTitle() + " and the audiobook is from " + year + " with " + narr + " narrating.";
    }
}
