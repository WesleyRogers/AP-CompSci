/*
    Wesley Rogers
    Franklinton High School
    Program 54a Miles Per Gallon
    
    Figures out the MPG of several hard coded cars.
    
    Integer division threw me off... again. I also mixed up a few variables due to slightly similar namings.
    
    I learned that I really need to remember that integer division is a thing, and that I need to type better.
*/

public class Prog54a_MPG {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double vwBugUnrounded = (double) 286/9;
        double fireBirdUnrounded = (double) 412/40;
        double subaruUnrounded = (double) 361/18;
        double cutlassUnrounded = (double) 161/11;
        
        double vwRounded = round(vwBugUnrounded);
        double fireBirdRounded = round(fireBirdUnrounded);
        double subaruRounded = round(subaruUnrounded);
        double cutlassRounded = round(cutlassUnrounded);
        
        //Now for print statements!
        System.out.println("Kansas City Grand Prix Gas Mileages");
        System.out.println("The VW Bug averaged " + vwRounded + "MPG!");
        System.out.println("The Firebird averaged " + fireBirdRounded + "MPG!");
        System.out.println("The Subaru averaged " + subaruRounded + "MPG!");
        System.out.println("The Cutlass averaged " + cutlassRounded + "MPG!");
        
    }
    /*
      Rounds a number, I added this as I didn't want to write the same thing 4 times.
    */
    private static double round(double round) {
        double partRounded = (round*10) + 0.5;
        double rounded = ((int) partRounded)/(double) 10; //I knew integer division would throw me off atleast once.
        return rounded;
    }
}
/* Sample Output
Kansas City Grand Prix Gas Mileages
The VW Bug averaged 31.8MPG!
The Firebird averaged 10.3MPG!
The Subaru averaged 20.1MPG!
The Cutlass averaged 14.6MPG!
*/
