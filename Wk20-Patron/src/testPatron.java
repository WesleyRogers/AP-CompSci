import us.magicalash.apcs.wk20.Book;
import us.magicalash.apcs.wk20.Patron;

public class testPatron {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Patron pat1 = new Patron(new Book("John Steinbeck", "Of Mice and Men"), "Bobby Tables"); //This may or may not be an XKCD reference
        
        //This is a test to see what the compiler does, and it does infact warn me about the deprecated-ness of the constructor
        Patron pat2 = new Patron(new Book("Random author", "Random title")); 
        pat2.setName("Random Name");
    
        System.out.println(pat1);
        System.out.println(pat2);
    }

}
/*
Bobby Tables has taken out the book "Of Mice and Men" by John Steinbeck.
Random Name has taken out the book "Random title" by Random author.
*/