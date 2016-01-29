/**
 * A simple class for a rectangle.
 * @author Wesley Rogers
 *
 */
public class Rectangle {
    private double width;
    private double length;
    
    /**
     * Creates a rectangle with both sides length zero.
     */
    public Rectangle(){
        this.width = 0;
        this.length = 0;
    }
    
    /**
     * Creates a Rectangle object with the sides specified.
     * @param width
     * @param length
     */
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    
    /**
     * Sets the area of the Rectangle.
     * @return  The area of the Rectangle.
     */
    public double area(){
        return this.length * this.width;
    }
    
    /**
     * Sets the perimeter of the Rectangle.
     * @return  The perimeter of the Rectangle.
     */
    public double perimeter(){
        return 2*length + 2*width;
    }
    
    /**
     * Sets width.
     * @param width  The width to be set.
     */
    public void setWidth(double width){
        this.width = width;
    }
    
    /**
     * Sets length.
     * @param length  The length to be set.
     */
    public void setLength(double length){
        this.length = length;
    }
    
    /**
     * Gets the width of the rectangle.
     * @return  The width of the rectangle.
     */
    public double getWidth(){
        return this.width;
    }
    
    /**
     * Gets the length of the rectangle.
     * @return  The length of the rectangle.
     */
    public double getLength(){
        return this.length;
    }

    @Override
    public boolean equals(Object o){
        if (o instanceof Rectangle){ //This way doesn't break things, yay!
            Rectangle r = (Rectangle) o;
            if (r.getLength() == this.length && r.getWidth() == this.width){
                return true;
            }
        }
        return false;
    }
    
    @Override
    public String toString(){
        return "This rectangle has a width of " + this.width + " and a length of " + this.length + ".";
    }
    
    public static void displayAreaFormula() {
        System.out.println("The area formula for a rectangle is length*width.");
        
    }
    
    
}
