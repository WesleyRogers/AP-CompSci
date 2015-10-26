/*
    Program 215c Don't Fence Me In
    Wesley Rogers 
    10/26/15
    Java 1.8u25, using Eclipse Mars
    Windows 7

    Gives you the maximum area of a fence with a perimeter of 100 on 3 sides.

    What I learned: Not much, slightly harder calculus problem.
    
    Difficulties: None.
*/
public class DontFenceMeIn {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int area;
        int previousArea =0;
        for (int i = 0; previousArea >= 0; i++ ){
            area = i*(100-2*i); //The area of the rectangle.
            
            if (area < previousArea){
                System.out.println("A fence with an area of " + previousArea+ " can be obtained using dimensions " + (i-1) + "*" + 2*(i-1) + ".");
                System.exit(0); //So things exit on the first finding.
            }
            previousArea = area;
        }
    }

}
/* Sample Output
A fence with an area of 1250 can be obtained using dimensions 25*50.
*/