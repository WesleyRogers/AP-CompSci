public class Circle
{
    private static final double PI = 3.14;
    private double radius;
    
    /** constructor
    * pre: none
    * post: A Circle object created. Radius initialized to 1.
    */
    public Circle()
    {
    radius = 1; //default radius
    }
    
    /**
     * Creates a Circle object with the radius provided
     * @param radius  The radius of the Circle.
     */
    public Circle(double radius){
        this.radius = radius;
    }
    
    
    /**
    * Changes the radius of the circle.
    * pre: none
    * post: Radius has been changed.
    */
    public void setRadius(double newRadius)
    {
     radius = newRadius;
    }
   
    /**
    * Calculates the area of the circle.
    * pre: none
    * post: The area of the circle has been returned.
    */
    public double area()
    {
     double circleArea;
     circleArea = PI * radius * radius;
     return(circleArea);
    }
    
    /**
    * Returns the radius of the circle.
    * pre: none
    * post: The radius of the circle has been returned.
    */
    public double getRadius()
    {
     return (radius);
    }
    
    /**
     * Returns the circumfrence of the circle.
     * @return The circumfrence of the circle.
     */
    public double circumference(){ //Added
        return radius * 2 * Circle.PI;
    }
    
    //It said to modify it with the existing code, so ok?
    /**
    * Determines if the object is equal to another * Circle object.
    * pre: c is a Circle object.
    * post: true has been returned if the objects have
    * the same radii. false has been returned otherwise.*/
    public boolean equals(Object c)
    {
     Circle testObj = (Circle) c; //Ummm. Ok then. Lets hope that the object provided actually is a Circle. Should have used an instanceof here.
    if (testObj.getRadius() == radius)
     return true;
    else
     return false;
    }
    
    public String toString()
    {

     return "Circle has radius " + radius;
    }
    
    public static void displayAreaFormula(){
        System.out.println("The area formula of a circle is pi*r*r, or \u03C0r\u00B2"); // Pi symbol and squared symbol.
    }
}