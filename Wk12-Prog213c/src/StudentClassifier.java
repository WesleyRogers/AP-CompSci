/*
    Program 213c Student Classifier
    Wesley Rogers 
    11/10/15
    Java 1.8u25, using Eclipse Mars
    Windows 7

    Gives the class of a university student

    What I learned: Case statements are a pain if you need to deal with a range of numbers. Like really.
    
    Difficulties: Getting the switch in confused me for a bit as the classes are ranges rather than an individual number. Plus I forgot to reset stop to false so everything was coming out as the same rank.
*/
import java.util.Scanner;

public class StudentClassifier {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        boolean shouldCont = true;
        boolean stop = false;
        int uniClass = 0;
        
        do {
            System.out.print("Enter Student ID: ");
            input.next(); //This does nothing, but its in the suggested output. Okie dokie.
            System.out.print("How many credits does that student have? (As a positive real number) ");
            int credits = (int) input.nextDouble();
            
            while(!stop){
                switch (credits){
                    case 90: {uniClass = 4; stop = true; break;}
                    case 70: {uniClass = 3; stop = true; break;}
                    case 30: {uniClass = 2; stop = true; break;}
                    case 1: {uniClass = 1; stop = true; break;}
                    default: {credits--; break;}
                }
            }
            System.out.println("That student is of class: " + uniClass);
            
            System.out.print("Continue? (y/n) ");
            shouldCont = shouldContinue(input.next());
            
            System.out.println();
            stop = false;
        } while (shouldCont);
        System.out.println("Goodbye.");
    }
    
    
    public static boolean shouldContinue(String s){
        boolean output; //So it doesn't do funny stuff
        if (s.equals("y") | s.toLowerCase().equals("yes") | s.equals("true")){ //String's equals method checks to see if to strings have the same characters.
            output = true; //if input is y, yes or true, continue.
        } else {
            output = false; //stop if not.
        }
        
        return output;
    }
}
/*
Enter Student ID: 2352
How many credits does that student have? (As a positive real number) 30.0
That student is of class: 2
Continue? (y/n) y

Enter Student ID: 3639
How many credits does that student have? (As a positive real number) 29.9
That student is of class: 1
Continue? (y/n) y

Enter Student ID: 4007
How many credits does that student have? (As a positive real number) 70
That student is of class: 3
Continue? (y/n) y

Enter Student ID: 4915
How many credits does that student have? (As a positive real number) 103.7
That student is of class: 4
Continue? (y/n) n

Goodbye.
*/