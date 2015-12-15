/*
    Program 671a Time Counter
    Wesley Rogers 
    12/14/15
    Java 1.8u25, using Eclipse Mars
    Windows 7

    Gives time conversions and gives the time between two times.

    What I learned: Not much, easy stuff.
    
    Difficulties: None.
*/
import java.util.Scanner;

public class TimeCounter {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.println("Conversion Tasks:");
        System.out.println("1. Hours -> Minutes");
        System.out.println("2. Days -> Hours");
        System.out.println("3. Minutes -> Hours");
        System.out.println("4. Hours -> Days");
        System.out.println("5. Time Difference");
        System.out.print("Enter an option. ");
        int choice = input.nextInt();
        switch (choice) {//Switch the choice because this is way easier than a giant if
            case 1: {
                hoursToMin(input); //Pass the imput object to save some cpu time, yay!
                break;
            }
            case 2: {
                daysToHours(input);
                break;
            }
            case 3: {
                minutesToHours(input);
                break;
            }
            case 4: {
                hoursToDays(input);
                break;
            }
            case 5: {
                timeDifference(input);
                break;
            }
        }
        
    }
    public static void hoursToMin(Scanner in){
        System.out.print("How many hours would you like to convert? ");
        int hours = in.nextInt();
        System.out.println("There are " + hours*60 + " minutes in " + hours + " hours.");
    }

    public static void daysToHours(Scanner in){
        System.out.print("Hour many days would you like to convert? ");
        int days = in.nextInt();
        System.out.println("There are " + days*24 + " hours in " + days + " days.");
    }
    
    public static void minutesToHours(Scanner in){
        System.out.print("How many minutes would you like to convert? ");
        int minutes = in.nextInt();
        System.out.println("There are " + minutes/60.0 + " hours in " + minutes + " minutes.");
    }
    
    public static void hoursToDays(Scanner in){
        System.out.print("How many hours would you like to convert? ");
        int hours = in.nextInt();
        System.out.println("There are " + hours/24.0 + " days in " + hours + " hours.");
    }
    
    public static void timeDifference(Scanner in){
        System.out.print("Enter the first hour: ");
        int hours1 = in.nextInt();
        System.out.print("Enter the first set of minutes: ");
        int minutes1 = in.nextInt();
        System.out.print("Is this in the am? (true/false) ");
        boolean am1 = in.nextBoolean();
        
        System.out.print("Enter the second hour: ");
        int hours2 = in.nextInt();
        System.out.print("Enter the second set of minutes: ");
        int minutes2 = in.nextInt();
        System.out.print("Is this in the am? (true/false) ");
        boolean am2 = in.nextBoolean();
        
        hours1 = am1? hours1 : (hours1 + 12); //If hours1 is int the pm, add 12 hours to make military time
        hours2 = am2? hours2 : (hours2 + 12); //Same with hours2
        int dTime = Math.abs(((60*hours2)+minutes2) - ((60*hours1)+minutes1)); //Difference in minutes. Abs so it works backwards too!
        
        //Integer divide to get the hours, the modulo to get the remaining minutes.
        System.out.println("The difference between those times is " + dTime/60 + " hours and " + dTime % 60 + " minutes.");
        
    }
}
/*
Conversion Tasks:
1. Hours -> Minutes
2. Days -> Hours
3. Minutes -> Hours
4. Hours -> Days
5. Time Difference
Enter an option. 1
How many hours would you like to convert? 15
There are 900 minutes in 15 hours.

Conversion Tasks:
1. Hours -> Minutes
2. Days -> Hours
3. Minutes -> Hours
4. Hours -> Days
5. Time Difference
Enter an option. 2
Hour many days would you like to convert? 4
There are 96 hours in 4 days.

Conversion Tasks:
1. Hours -> Minutes
2. Days -> Hours
3. Minutes -> Hours
4. Hours -> Days
5. Time Difference
Enter an option. 3
How many minutes would you like to convert? 900
There are 15.0 hours in 900 minutes.

Conversion Tasks:
1. Hours -> Minutes
2. Days -> Hours
3. Minutes -> Hours
4. Hours -> Days
5. Time Difference
Enter an option. 4
How many hours would you like to convert? 27
There are 1.125 days in 27 hours.

Conversion Tasks:
1. Hours -> Minutes
2. Days -> Hours
3. Minutes -> Hours
4. Hours -> Days
5. Time Difference
Enter an option. 5
Enter the first hour: 8
Enter the first set of minutes: 14
Is this in the am? (true/false) true
Enter the second hour: 2
Enter the second set of minutes: 47
Is this in the am? (true/false) false
The difference between those times is 6 hours and 33 minutes.

Conversion Tasks:
1. Hours -> Minutes
2. Days -> Hours
3. Minutes -> Hours
4. Hours -> Days
5. Time Difference
Enter an option. 5
Enter the first hour: 1
Enter the first set of minutes: 23
Is this in the am? (true/false) true
Enter the second hour: 2
Enter the second set of minutes: 23
Is this in the am? (true/false) true
The difference between those times is 1 hours and 0 minutes.

Conversion Tasks:
1. Hours -> Minutes
2. Days -> Hours
3. Minutes -> Hours
4. Hours -> Days
5. Time Difference
Enter an option. 5
Enter the first hour: 4
Enter the first set of minutes: 55
Is this in the am? (true/false) true
Enter the second hour: 7
Enter the second set of minutes: 15
Is this in the am? (true/false) false
The difference between those times is 14 hours and 20 minutes.
*/