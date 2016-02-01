public class Customer
{
    private String firstName, lastName, street, city,state, zip;
    /**
    * constructor
    * pre: none
    * post: A Customer object has been created.
    * Customer data has been initialized with parameters
    */
    public Customer(String fName, String lName, String str, String c, String s, String z)
    {
        firstName = fName;
        lastName = lName;
        street = str;
        city = c;
        state = s;
        zip = z;
    }
    
    /**
     * Changes the street of the customer.
     * @param s the new street name.
     */
    public void changeStreet(String s){
        this.street = s;
    }
    
    /**
     * Changes the city of the customer.
     * @param s the new city.
     */
    public void changeCity(String s){
        this.city = s;
    }
    
    /**
     * Changes the state of the customer.
     * @param s the new state.
     */
    public void changeState(String s){
        this.state = s;
    }
    
    /**
     * Changes the zip code of the customer.
     * @param s The new zipcode as a string.
     */
    public void changeZip(String s){
        this.zip = s;
    }
    
    
    /**
    * Returns a String that represents the Customer Object
    * pre: none
    * post: A string representing the Account object has been returned.
    */
    public String toString()
    {
        String custString;
        custString=firstName + " " + lastName + "\n";
        custString +=street + "\n";
        custString += city + ", "+state+ " " + zip + "\n";
        return (custString);
    }
    
    
    
}