/*
    Program 166d Total Wages
    Wesley Rogers 
    10/12/15
    Java 1.8u25, using Eclipse Mars
    Windows 7

    Gives you the total cost of hiring 3 to 7 employees at $8 an hour

    What I learned: Not much, nested loops are not new.
    
    Difficulties: Nothing.
*/
public class TotalWages {

    public static final double hourlyRate = 8.00; //Double since we're not being time sensitive.
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        for(int i = 3; i<8; i++){//i is the number of employees
            System.out.println("Rates for " + i + " employees.");
            for(int k = 1; k < 5; k++){ //k is hours/10
                //k*10 is the hours, 10*i is the number of employees working 10 hours.
                System.out.println("For " + (k*10) + " hours of work, the required wage is $" + (10*k*i*hourlyRate));
            } 
        }
    }
}
/* Sample Output
Rates for 3 employees.
For 10 hours of work, the required wage is $240.0
For 20 hours of work, the required wage is $480.0
For 30 hours of work, the required wage is $720.0
For 40 hours of work, the required wage is $960.0
Rates for 4 employees.
For 10 hours of work, the required wage is $320.0
For 20 hours of work, the required wage is $640.0
For 30 hours of work, the required wage is $960.0
For 40 hours of work, the required wage is $1280.0
Rates for 5 employees.
For 10 hours of work, the required wage is $400.0
For 20 hours of work, the required wage is $800.0
For 30 hours of work, the required wage is $1200.0
For 40 hours of work, the required wage is $1600.0
Rates for 6 employees.
For 10 hours of work, the required wage is $480.0
For 20 hours of work, the required wage is $960.0
For 30 hours of work, the required wage is $1440.0
For 40 hours of work, the required wage is $1920.0
Rates for 7 employees.
For 10 hours of work, the required wage is $560.0
For 20 hours of work, the required wage is $1120.0
For 30 hours of work, the required wage is $1680.0
For 40 hours of work, the required wage is $2240.0
*/