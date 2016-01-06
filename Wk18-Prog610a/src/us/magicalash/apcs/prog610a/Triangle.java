package us.magicalash.apcs.prog610a;


public class Triangle {
    public final int a;
    public final int b;
    public final int c;
    
    /**
     * Creates a triangle with sides a, b, and c. Does not check to see if if actually makes a triangle.
     * @param a   One side.
     * @param b   Another side.
     * @param c   Third Side.
     */
    public Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    /**
     * Gets the area of the triangle.
     * @return The area of the triangle. Returns -1 if the Object doesn't actually make a triangle.
     */
    public double area(){
        if((a+b)>c && (a+c)>b && (b+c)>a){ 
            double s = (a+b+c)/2d;
            double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            return area;
        } else {
            return -1;
        }
    }
}
