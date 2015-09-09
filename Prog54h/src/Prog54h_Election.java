/*
    Wesley Rogers
    Franklinton High School
    Program 54h Election
  
    Gives how many votes each person got

    I didn't really have any issues.

    
*/
public class Prog54h_Election {

    public static void main(String[] args) {
        // I decomposed this into a giant algebra problem then worked back from there.
        //mary+peter+paul+joan = 9485
        //mary+(mary-74)+ (mary-23) + (mary-86) = 9485
        //4mary-183=4985
        //mary=2417
        //I would do this computationally but no algebra
        int mary = 2417; 
        int peter = mary-74;
        int paul = mary-23;
        int joan = mary-86;
        
        System.out.println("Mary won the election with a total of "+ mary+ " votes.");
        System.out.println("Peter got 74 votes less than Mary, with a total of "+ peter+ " votes.");
        System.out.println("Paul got 23 votes less than Mary, with a total of "+paul+" votes.");
        System.out.println("Joan got 86 votes less than Mary, with a total of "+joan+" votes.");
    }

}
/* Sample Output
Mary won the election with a total of 2417 votes.
Peter got 74 votes less than Mary, with a total of 2343 votes.
Paul got 23 votes less than Mary, with a total of 2394 votes.
Joan got 86 votes less than Mary, with a total of 2331 votes.
*/