import java.util.Calendar;

/*
    Week 29 Library
    Wesley Rogers 
    3/24/16
    Java 1.8u25, using Eclipse Mars
    Windows 7
    
    Runs an example of a library.
        
    What I learned: Inheritance is pretty cool, but I already knew about it.
    
    Difficulties: None.
*/

public class testPatron {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Patron e = new Patron("Emily");
        Media book = new Book();
        Media movie = new Movie();
        Media audio = new AudioBook();
        
        Book b = new Book("GLaDOS", "Paradoxes", Calendar.getInstance());
        Movie m = new Movie("Portal: The Movie", Calendar.getInstance(), 3000); //This movie time travels.
        AudioBook audiobook = new AudioBook("Portal Physics", Calendar.getInstance(), 2011, "Cave Johnson");
        
        movie.setTitle("The help");
        ((Movie) movie).setYear(2011);
        
        book.setTitle("Moby Dick");
        ((Book) book).setAuthor("L");
        
        audio.setTitle("I like Turtles.");
        ((AudioBook) audio).setYear(2015);
        ((AudioBook) audio).setNarrator("Zombie Turtle Dude");
        
        System.out.println(movie);
        System.out.println(book);
        System.out.println(audio);
        
        System.out.println(b);
        System.out.println(m);
        System.out.println(audiobook);
        
        e.setMedia(audiobook);
        System.out.println("\n" + e);
        System.out.println("Emily's media is due back by: " + e.getMedia().getReturnDate().getTime());
        
    }

}
/*
The title of the movie is: The help and the movie is from 2011
The title of the book is: Moby Dick and the author of the book is: L
The title of the audiobook is: I like Turtles. and the audiobook is from 2015 with Zombie Turtle Dude narrating.
The title of the book is: Paradoxes and the author of the book is: GLaDOS
The title of the movie is: Portal: The Movie and the movie is from 3000
The title of the audiobook is: Portal Physics and the audiobook is from 2011 with Cave Johnson narrating.

Emily has taken out the media Portal Physics.
Emily's media is due back by: Thu Apr 07 08:27:50 EDT 2016
*/