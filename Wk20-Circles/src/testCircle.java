
public class testCircle {

    public static void main(String[] args) {      
        Circle spot = new Circle();
        spot. setRadius(3);
        System.out.println("Circle radius: " + spot. getRadius());
        System.out.println("Circle circumference: " + spot.circumference());
        System.out.println("Circle area: " + spot.area());
        System.out.println((new Circle(3).equals(spot) ? "These objects are equal." : "These objects are not equal."));
        System.out.println(spot);
        Circle.displayAreaFormula();
        
        System.out.println();
        
        Rectangle block = new Rectangle();
        block.setLength(2);
        block.setWidth(4);
        System.out.println("Rectangle area: " + block.area());
        System.out.println("Rectangle perimeter: " + block.perimeter());
        System.out.println((new Rectangle(4,2).equals(block) ? "These objects are equal." : "These objects are not equal."));
        System.out.println(block);
        Rectangle.displayAreaFormula();
        
        //spot.equals(new Object()); //This should crash. It does infact crash.
        //block.equals(new Object());  //This does not crash.
    }

}
/*
Circle radius: 3.0
Circle circumference: 18.84
The area formula of a circle is pi*r*r, or πr²

Rectangle area: 8.0
Rectangle perimeter: 12.0
The area formula for a rectangle is length*width.
*/