package us.magicalash.apcs.wk20;
/**
 * A simple class to help manage books. 
 * @author Wesley Rogers
 *
 */
public class Book {
    
    private String author;
    private String title;
    
    /**
     * Creates a book object, and sets both fields to null.
     */
    public Book(){ //They both start as null, is this actually neccesarry?
        this.author = null;
        this.title = null;
    }
    
    /**
     * Creates a Book object and sets it's author and title.
     * @param author  The Author of the book.
     * @param title   The Title of the book.
     */
    public Book(String author, String title){
        this.author = author;
        this.title = title;
    }
    
    /**
     * Clones another Book object.
     * @param b  The book to be cloned.
     */
    public Book(Book b){
        setAuthor(b.getAuthor());
        setTitle(b.getTitle());
    }
    
    /**
     * Gets the author of the book.
     * @return the author of the book.
     */
    public String getAuthor(){
        return author;
    }
    
    /**
     * Gets the title of the book.
     * @return the title of the book.
     */
    public String getTitle(){
        return title;
    }
    
    /**
     * Sets the author of the book.
     * @param author The name of the new author.
     */
    public void setAuthor(String author){
        this.author = author;
    }
    
    /**
     * Sets the title of the book.
     * @param title The new title of the book.
     */
    public void setTitle(String title){
        this.title = title;
    }
    
    /**
     * Returns a human-readable version of the Book object.
     * @return a human-readable version of the object.
     */
    @Override //Not required since it overrides a java.lang.Object method, but I still prefer to do this as it makes sense.
    public String toString(){
        return "The title of the book is: " + this.title + " and the author of the book is: " + this.author;
    }
    
}
