import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
    Program 410t Household Income
    Wesley Rogers 
    3/3/16
    Java 1.8u25, using Eclipse Mars
    Windows 7
    
    Takes the ID, income, and amount of people living in said house and returns some statistics.
    
    What I learned: I learned how to use the ... thing for methods, which is very useful.
    
    Difficulties: None.
*/

public class IncomeReport {

    static int ignoredElements = 0;
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = null;
        try {
            input = new Scanner(new File("survey2.dat"));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        double averageInc = 0;
        int i = 0;
        int[] ids = new int[25];
        int[] income = new int[25];
        int[] members = new int[25];
        boolean[] isBelowPoverty = new boolean[25];
        int numPoverty = 0;
        
        System.out.println("ID      Income  Household Members");
        while(input.hasNextLine()){
            ids[i] = input.nextInt();
            income[i] = input.nextInt();
            members[i] = input.nextInt();
            isBelowPoverty[i] = (3750 + 750*(members[i]-2)) > income[i];

            System.out.println(lss(8, false, ids[i]+"", income[i]+"", members[i]+""));
            i++;
        }
        
        averageInc = averageArrayExcludeZero(income);
        System.out.println("\nHouseholds exceeding the average of $" + round(averageInc, 2) + " in income: ");
        for(i = 0; i < (25-ignoredElements); i++){
            if (income[i] > averageInc){
                System.out.println(lss(8, false, ids[i]+"", income[i]+"", members[i]+""));
            }
            
            if(isBelowPoverty[i]){
                numPoverty++;
            }
        }
        
        System.out.println("\n" + (100*numPoverty/(double) (25-ignoredElements)) + "% of the area is below the poverty line.");
        
        
    }

    
    public static String lss(int size, boolean isRightPadded, String... string){
        String finalString = "";
        for(int i = 0; i < string.length; i++){
            String stringOut = string[i];
            if (isRightPadded == true) {
                stringOut = String.format(("%1$" + size + "s"), string[i]); //Pad it on the right if its short
            } else {
                stringOut = String.format(("%1$-" + size + "s"), string[i]); //Pad it on the left if its short
            }
            stringOut = stringOut.substring(0, size);//Cut it short if its long.
            finalString += stringOut;
        }
        return finalString; //Returns the formatted string.
    }
    
    //Averages an array.
    public static double averageArrayExcludeZero(int[] array){
        int sum = 0;
        for (int num : array){
            if (num == 0){
                ignoredElements++;
            } else {
                sum += num;
            }
        }
        double avg = sum / ((double) array.length - ignoredElements);
        return avg;
        
    }
    
    
    public static double round(double num, int places){
        double rounded = Math.round(num * Math.pow(10, places))/Math.pow(10, places); //Rounds number
        return rounded;
    }
    
}
/*
ID      Income  Household Members
1242    12180   4       
1763    13240   3       
1324    19800   2       
1483    22458   8       
1900    17000   2       
2112    18125   7       
2345    15623   2       
3210    3200    6       
3600    6500    5       
3601    11970   2       
4725    8900    3       
6217    10000   2       
9280    6200    1       

Households exceeding the average of $12707.38 in income: 
1763    13240   3       
1324    19800   2       
1483    22458   8       
1900    17000   2       
2112    18125   7       
2345    15623   2       

7.6923076923076925% of the area is below the poverty line.



ID      Income  Household Members
1041    19180   4       
3062    10230   3       
1327    10810   2       
2483    5300    12      
1900    17000   9       
1112    15125   7       
2395    15623   2       
3280    1900    1       
6600    6000    5       
3601    10970   2       
5725    7900    3       
6217    5000    2       
9280    6800    1       

Households exceeding the average of $10141.38 in income: 
1041    19180   4       
3062    10230   3       
1327    10810   2       
1900    17000   9       
1112    15125   7       
2395    15623   2       
3601    10970   2       

15.384615384615385% of the area is below the poverty line.
*/