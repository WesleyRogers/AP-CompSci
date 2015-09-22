/*
    Program 65a International Date
    Wesley Rogers 
    9-22-15
    Java 1.8u25, using Eclipse Mars
    Windows 7

    Gives you the date in international standard date format. Works for years between 1970 and 2069.

    What I learned: Setting a variable is extremely weird if you want to do it within an if statement, and I can't find anything on StackExchange thats less weird.
    
    Difficulties: I was originally trying to use an if statement within the Main method to set the century, but nope. I tried using a field and still nope. I gave up and moved getting the century to its own method.
*/
import java.util.Scanner;

public class InternationalDate {
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the Month, followed by the day, followed by the last two digits of the year. ");
        int month = input.nextInt();
        int day = input.nextInt();
        int year = input.nextInt();
        int fullYear = getYear(year);

        System.out.println("The international form date is: " + fullYear + "-" + month + "-" + day);
        
    }
    public static int getYear(int year){
        int century = getCentury(year);
        if (year < 10){
            return Integer.parseInt(century + "0" + year);
        }else{
            return Integer.parseInt(century + "" + year);
        }
        //This was way too hard, but whatever I had nothing else to do.
    }
    public static int getCentury(int year){
        if (year >= 70){
            return 19;
        }else{
            return 20;
        }
    }
}
/*Sample Output
Enter the Month, followed by the day, followed by the last two digits of the year. 12 11 97
The international form date is: 1997-12-11

Enter the Month, followed by the day, followed by the last two digits of the year. 1 1 70
The international form date is: 1970-1-1

Enter the Month, followed by the day, followed by the last two digits of the year. 12 31 69
The international form date is: 2069-12-31
*/