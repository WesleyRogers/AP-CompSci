import us.magicalash.apcs.wk20.Book;
/*
    Week 20's Book Program
    Wesley Rogers 
    1/19/16
    Java 1.8u25, using Eclipse Mars
    Windows 7
    
    Creates 4 instances of a Book class.
    
    What I learned: Not much, I've done this all before. Documenting actually took longer than writing code, which I guess is good.
    
    Difficulties: None.
*/
public class testBook {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Book myBook1 = new Book("Carrol Lewis", "Alice in Wonderland");
        Book myBook2 = new Book();
        Book myBook3 = new Book("Jen Jones", "On the highway");
        Book myBook4 = new Book(myBook3);
        
        System.out.println("Book Tests.");
        System.out.println("\ntoString() Test:"); //Making sure the toString Method works properly, as it is rather important.
        System.out.println("" + myBook1);
        System.out.println("" + myBook3);
        
        System.out.println("\nGetter/Setter Check:"); //Make sure the getter and setter methods work properly
        myBook2.setAuthor("Samantha Bobbit");
        myBook2.setTitle("Alphabet 123");
        System.out.println(myBook2);
        myBook3.setAuthor("Jenny Jones");
        System.out.println(myBook3);
        System.out.println(myBook1.getAuthor() + " " + myBook1.getTitle());
        System.out.println(myBook4);
    }

}
