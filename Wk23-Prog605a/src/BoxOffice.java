
public class BoxOffice {
    private int revenue;
    private int students;
    
    public BoxOffice(){
        revenue = 0;
        students = 0;
    }
    
    public void hasActivityTicket(){ //I renamed this one because this one follows conventions and makes it a tad easier to understand.
        students++;
    }
    
    public void noActivityTicket(){
        students++;
        revenue += 5;
    }
    
    public void display(){
        System.out.println("Revenue: " + revenue);
        System.out.println("Students: " + students);
        System.out.println();
    }
}
