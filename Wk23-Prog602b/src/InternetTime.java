
public class InternetTime {
    private int priority;
    private double time;
    private int accountNum;
    
    public InternetTime(int accountNum){
        this.accountNum = accountNum;
    }
    
    public InternetTime(int accountNum, double time ,int priority){
        this.accountNum = accountNum;
        this.priority = priority;
        this.time = time;
    }
    
    public double calculateTotal(){
        int surcharge = 0;
        
        switch (priority){
        case 0: break;
        case 1: surcharge = 50; break;
        case 2: surcharge = 150; break;
        }
        
        if (time <= 5){
            return 200 + surcharge;
        } else if(time > 5 && time <= 15){
            return Math.ceil(time)*30 + 200 + surcharge;
        } else {
            return Math.ceil(time)*30 + 550 + surcharge;
        }
    }
    
    public void setPriority(int p){
        priority = p;
    }
    
    public void setTime(double t){
        time = t;
    }
    
    @Override
    public String toString(){
        return lss(this.accountNum+"", 11, false) + lss(this.time+"", 6, false) + lss(this.priority+"", 1, false) + "  " + this.calculateTotal();
    }
    
    private static String lss(String string, int size, boolean isRightPadded){
        String stringOut = string + "";
        if (isRightPadded == true) {
            stringOut = String.format(("%1$" + size + "s"), string); //Pad it on the right if its short
        } else {
            stringOut = String.format(("%1$-" + size + "s"), string); //Pad it on the left if its short
        }
        stringOut = stringOut.substring(0, size);//Cut it short if its long.
        return stringOut; //Returns the formatted string.
    }
}
