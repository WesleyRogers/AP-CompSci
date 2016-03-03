/*
    Program 428a Square Prisoners
    Wesley Rogers 
    2/24/16
    Java 1.8u25, using Eclipse Mars
    Windows 7

    Determines which prisoners get freed.

    What I learned: I had heard of thisproblem, but I never knew that all of the resulting numbers were squares. It makes sense, I just never really thought about it.
    
    Difficulties: None.
*/
public class Prisoners {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        boolean[] prisoners = new boolean[1001];
        int l = 0; //Used for formatting.
        
        for (int i = 2; i<=1000; i++){
            for(int k = 1; k*i < 1001; k++){
                prisoners[i*k] = !prisoners[i*k];
            }
        }
        System.out.println("The following prisoners escape: ");
        for(int i = 1; i<1001; i++){
            if(!prisoners[i]){
                if(l%5 == 0 && l != 0){
                    System.out.println();
                }
                
                System.out.print(i + "  ");
                l++;
            }
        }
    }

}
/*
The following prisoners escape: 
1  4  9  16  25  
36  49  64  81  100  
121  144  169  196  225  
256  289  324  361  400  
441  484  529  576  625  
676  729  784  841  900  
961  
*/