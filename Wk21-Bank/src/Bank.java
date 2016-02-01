import java.util.Scanner; import java.text.NumberFormat;
public class Bank
{
    public static void main(String[] args)
    {
        Account munozAccount = new Account (250, "Maria", "Munoz", "110 Glades Road",
        "My town", "FL", "33445");
        Scanner input = new Scanner(System.in);
        double data;
        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.println(munozAccount) ;
        System.out.print("Enter deposit amount: ");
        data = input.nextDouble() ;
        munozAccount.deposit(data);
        System.out.println("Balance is: " + money.format(munozAccount.getBalance()));
        
        System.out.print("Enter withdrawal amount: ");
        data = input.nextDouble();
        munozAccount.withdrawal(data);
        System.out.println("Balance is: " + money.format(munozAccount.getBalance()));
        
        System.out.println("Would you like to change your address?");
        boolean yesNo = shouldContinue(input.next());
        if(yesNo){
            System.out.println("Enter your new street address.");
            String str = input.next();
            System.out.println("Enter your new City.");
            String cit = input.next();
            System.out.println("Enter your new State.");
            String sta = input.next();
            System.out.println("Enter your new zip code.");
            String zip = input.next();
            
            munozAccount.changeStreet(str, cit, sta, zip);
        }
        System.out.println(munozAccount);
    }
    
    private static boolean shouldContinue(String s){
        boolean output; //So it doesn't do funny stuff
        if (s.equals("y") || s.toLowerCase().equals("yes") || s.equals("true")){ //String's equals method checks to see if to strings have the same characters.
            output = true; //if input is y, yes or true, continue.
        } else {
            output = false; //stop if not.
        }
        
        return output;
    }
}
