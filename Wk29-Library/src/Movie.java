import java.util.Calendar;
/**
 * A movie class, but without the actual movie stuff.
 * @author wroge7934
 *
 */
public class Movie extends Media {

    private int year;
    
    /**
     * Creates an empty movie object.
     */
    public Movie() {
        // TODO Auto-generated constructor stub
        super();
    }
    
    /**
     * Creates a movie object.
     * @param title Title of the movie.
     * @param c     Date of checkout.
     */
    public Movie(String title, Calendar c) {
        super(title, c);
        // TODO Auto-generated constructor stub
    }
    
    /**
     * Creates a movie object.
     * @param title The title of the movie.
     * @param c     The date of checkout.
     * @param year  The year th movie was released.
     */
    public Movie(String title, Calendar c, int year){
        super(title, c);
        this.year = year;
    }
    
    /**
     * Clone constructor.
     * @param m Clones movie m.
     */
    public Movie(Movie m){
        super(m.getTitle(), m.getToday());
        this.year = m.getYear();
    }
    
    /* Getter */
    
    /**
     * Gets the year the movie was released.
     * @return
     */
    public int getYear(){
        return year;
    }
    
    /**
     * Gets the return date of the movie, which is a week after checkout.
     */
    @Override
    public Calendar getReturnDate(){
        Calendar due = Calendar.getInstance();
        due.set(Calendar.MONTH, super.getToday().get(Calendar.MONTH));
        due.set(Calendar.YEAR, super.getToday().get(Calendar.YEAR));
        due.add(Calendar.DATE, 7);
        return due;
    }

    /* Setter */
    
    /**
     * Sets the year of release.
     * @param year The new release year.
     */
    public void setYear(int year){
        this.year = year;
    }
    
    /* Other Methods */
    
    @Override //Not required since it overrides a java.lang.Object method, but I still prefer to do this as it makes sense.
    public String toString(){
        return "The title of the movie is: " + super.getTitle() + " and the movie is from " + year;
    }
}
