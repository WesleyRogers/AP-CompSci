import java.util.Calendar;

/**
 * A simple class to help manage books. 
 * @author Wesley Rogers
 *
 */
public class Book extends Media{
    
    private String author;
    
    
    /* Constructors */
    
    
    /**
     * Creates a book object, and sets both fields to null.
     */
    public Book(){ //They both start as null, is this actually neccesarry?
        super();
        this.author = null;
    }
    
    /**
     * Creates a book object.
     * @param author The author of the book.
     * @param title  The title of the book.
     * @param c      The date the book was checked out.
     */
    public Book(String author, String title, Calendar c){
        super(title, c);
        this.author = author;
    }
    
    
    /**
     * Clones another Book object.
     * @param b  The book to be cloned.
     */
    public Book(Book b){
        super(b.getTitle(), b.getToday());
        this.author = b.getAuthor();
    }
    
    
    /*  Getters  */
    
    
    /**
     * Gets the author of the book.
     * @return the author of the book.
     */
    public String getAuthor(){
        return author;
    }
    
    /**
     * Gets the return date of the book.
     */
    public Calendar getReturnDate(){
        Calendar due = Calendar.getInstance();
        due.set(Calendar.MONTH, super.getToday().get(Calendar.MONTH));
        due.set(Calendar.YEAR, super.getToday().get(Calendar.YEAR));
        due.add(Calendar.DATE, 21);
        return due;
    }
    
    
    /* Setters */
    
    
    /**
     * Sets the author of the book.
     * @param author The name of the new author.
     */
    public void setAuthor(String author){
        this.author = author;
    }
    
    
    /* Other Methods */
    
    
    /**
     * Returns a human-readable version of the Book object.
     * @return a human-readable version of the object.
     */
    @Override //Not required since it overrides a java.lang.Object method, but I still prefer to do this as it makes sense.
    public String toString(){
        return "The title of the book is: " + super.getTitle() + " and the author of the book is: " + this.author;
    }
    

}
