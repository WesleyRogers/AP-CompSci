import java.util.Arrays;

/*
    Program 433a 20 Random Numbers
    Wesley Rogers 
    2/24/16
    Java 1.8u25, using Eclipse Mars
    Windows 7

    Gets 20 random numbers from 1-30, where each member only appears once.

    What I learned: Not much, this could be better approached with sets however.
    
    Difficulties: None, it was pretty easy.
*/
public class RandomNumbers {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] randNum = new int[20];
        for(int i = 0; i<20; i+=0){
            int random = (int) (30*Math.random()+1);
            if (!isMemberInArray(randNum, random)){
                randNum[i] = random;
                i++;
            }
        }
        
        Arrays.sort(randNum); //Timsort is one of the fastest sorting algorithms available, might as well use it.
        for(int i = 1; i < 21; i++){
            if(i % 5 == 0){
                System.out.println(randNum[i-1]);
            } else {
                System.out.print(randNum[i-1] + " ");
            }
        }
    }

    public static boolean isMemberInArray(int[] array, int e){
        for(int i = 0; i<array.length-1; i++){
            if (array[i] == e){
                return true;
            }
        }
        return false;
    }
}
/*
1 5 6 7 9
10 11 13 15 16
17 18 19 21 22
23 25 26 27 30

2 3 4 5 6
8 11 12 15 16
17 18 20 22 23
24 27 28 29 30

1 3 4 5 8
9 10 13 15 16
17 18 19 20 22
23 25 26 29 30
*/