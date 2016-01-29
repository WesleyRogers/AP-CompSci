package us.magicalash.apcs.wk20;

/**
 * A simple class to manage Patrons.
 * @author wroge7934
 *
 */
public class Patron {
    private Book book;
    private String name;
    
    /**
     * Creates a Patron object
     * @param book  The book to be used.
     * @param name  The Name of the patron.
     */
    public Patron(Book book, String name){
        this.book = book;
        this.name = name;
    }
    
    /**
     * Creates an empty patron object. Use at your own risk.
     */
    @Deprecated
    public Patron(){ //May return null if not properly set
        this.book = null;
        this.name = null;
    }
    
    /**
     * Creates a Patron object with no name. Use at your own risk.
     * @param book  The book to be used.
     */
    @Deprecated //May return null if not properly set
    public Patron(Book book){
        this.book = book;
        this.name = null;
    }
    
    /**
     * Creates a Patron object with no book. Use at your own risk.
     * @param name
     */
    @Deprecated //May return null if not properly set
    public Patron(String name){
        this.name = name;
        this.book = null;
    }
    
    /**
     * Sets the name of a Patron Object
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }
    
    /**
     * Sets the Book of a Patron Object
     * @param book
     */
    public void setBook(Book book){
        this.book = book;
    }
    
    /**
     * Gets the name of the patron.
     * @return
     */
    public String getName(){
        return this.name;
    }
    
    /**
     * Gets the Book of the patron.
     * @return
     */
    public Book getBook(){
        return this.book;
    }
    
    /**
     * Turns the object into a string.
     */
    @Override
    public String toString(){
        return this.name + " has taken out the book \"" + this.book.getTitle() + "\" by " + this.book.getAuthor() + ".";
    }
    
}
