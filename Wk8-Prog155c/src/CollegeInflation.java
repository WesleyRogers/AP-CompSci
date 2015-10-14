/*
    Program 155c College Inflation
    Wesley Rogers 
    DATE
    Java 1.8u25, using Eclipse Mars
    Windows 7

    Gives the room and board costs, tuition, total cost, yearly salary, and the amount left over/short for that year.

    What I learned: I had to remember how to do exponents, not much else
    
    Difficulties: None.
*/
public class CollegeInflation {

    //Rate of change of things, expressed as amount relative to previous year.
    public static double tuitionRate = 1.15;
    public static double roomRate = 1.1;
    public static double wageRate = 1.04;
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        //i is the year
        System.out.println("Year        Tuition     Rm&Bd       Total Cost  Salary      Remainder");
        for(int i = 1; i <= 4; i++){
            double tuitionCost = Math.pow(tuitionRate,i-1)*4000;
            double roomCost = Math.pow(roomRate, i-1) * 9500;
            double totalCost = tuitionCost + roomCost;
            
            double salary = Math.pow(wageRate,i-1)*14000;
            double remainder = salary - totalCost;
            
            System.out.print(limitStringSize(i+"",12,true));
            System.out.print(limitStringSize(roundWithZeroes(tuitionCost,2),12,true));
            System.out.print(limitStringSize(roundWithZeroes(roomCost,2),12,true));
            System.out.print(limitStringSize(roundWithZeroes(totalCost,2),12,true));
            System.out.print(limitStringSize(roundWithZeroes(salary,2),12,true));
            System.out.println(limitStringSize(roundWithZeroes(remainder,2),12,true));
            
            
            
        }
    }
    
    //Pads a string to the proper size.
    public static String limitStringSize(String string, int size, boolean isLeftBound){
        String stringOut = string;
        if (isLeftBound == false) {
            stringOut = String.format(("%1$" + size + "s"), string); //Pad it on the left if its short
        } else {
            stringOut = String.format(("%1$-" + size + "s"), string); //Pad it on the right if its short
        }
        stringOut = stringOut.substring(0, size);//Cut it short if its long.
        return stringOut; //Returns the formatted string.
    }
    
    //Rounds a number, then pads the end  with zeroes if needed.
    public static String roundWithZeroes(double num, int places){
        double rounded = Math.round(num * Math.pow(10, places))/Math.pow(10, places); //Round the number
        String output = String.format(("%."+ places + "f") , rounded); //Format the number to places places
        return output;
    }
}
/*
Year        Tuition     Rm&Bd       Total Cost  Salary      Remainder
1           4000.00     9500.00     13500.00    14000.00    500.00      
2           4600.00     10450.00    15050.00    14560.00    -490.00     
3           5290.00     11495.00    16785.00    15142.40    -1642.60    
4           6083.50     12644.50    18728.00    15748.10    -2979.90    
*/