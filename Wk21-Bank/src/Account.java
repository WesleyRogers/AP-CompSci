import java.text.NumberFormat;
public class Account
{ 
    private double balance;
    private Customer cust;
    
    /**
    * constructor
    * pre: none
    * post: An account cree * customer data initia: */
    public Account(double bal, String fName, String lName, String str, String city,
    String st, String zip)
    {
        balance = bal;
        cust = new Customer(fName, lName, str, city, st, zip);
    }
    
    /**
    * Returns the current balance
    * pre: none
    * post: The account balance has been returned
    */
    public double getBalance()
    {
        return (balance);
    }
    
    /**
    * A deposit is made to the account
    * pre: none
    * post: The balance has been increased by the amount of the deposit.
    */
    public void deposit(double amt)
    {
        balance += amt;
    }
    
    /**
    * A withdrawal is made from the account if there is enough money
    * pre: none
    * post: The balance has been decreased by the amount withdrawn.
    */
    public void withdrawal(double amount)
    {
        if (amount <= balance) //Did noone read through this? amt != amount!
        balance -= amount;
        else
        System. out. println ("Not enough money in account.");
    }
    
    /**
     * Changes the address of the customer.
     * @param str   the new street address.
     * @param city  the new city.
     * @param sta   the new State.
     * @param zip   the new zip code.
     */
    public void changeStreet(String str, String city, String sta, String zip){
        cust.changeStreet(str);
        cust.changeCity(city);
        cust.changeState(sta);
        cust.changeZip(zip);
    }
    
    /**
    * Returns a String that represents the Account object.
    * pre: none
    * post: A string representing the Account object has been returned.
    */
    public String toString()
    {
        String accountString;
        NumberFormat money = NumberFormat.getCurrencyInstance();
        accountString = cust.toString();
        accountString += "Current balance is " + money.format (balance);
        return (accountString);
    }
}
