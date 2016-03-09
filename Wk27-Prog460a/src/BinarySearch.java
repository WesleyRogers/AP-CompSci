import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/*
    Program 460a Binary Sort, Non-recursive
    Wesley Rogers 
    3/8/16
    Java 1.8u25, using Eclipse Mars
    Windows 7
    
    Uses a non-recursive form of binary search to find an element of an array.
    
    What I learned: I learned how to make a non recursive binary search! I'm used to seeing it recursively, so this threw me off a bit.
    
    Difficulties: None.
*/
public class BinarySearch {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = null;
        Scanner human = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        try {
            input = new Scanner(new File("sort.dat"));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        while(input.hasNextInt()){
            list.add(input.nextInt());
        }
        
        int[] nums = toIntArray(list);
        int inputNum = 0;
        
        do {
            System.out.print("Enter a number to search for: ");
            inputNum = human.nextInt();
            int index = binarySearch(nums, inputNum);
            if (index == -1){
                System.out.println("Your number is not in the array.\n");
            } else {
                System.out.println("Your number is at position: " + (index+1) + "\n");
            }
            
        } while (inputNum != -1);
    }

    public static int binarySearch(int[] list, int e){
        int low = 0;
        int upper = list.length-1;
        while(low<=upper){
            int mid = (low+upper)/2;
            if(list[mid] == e){ //If the middle of the search is our element, stop.
                return mid;
            } else if(list[mid] < e){ //If the middle is lower, split the array in half and check the top half
                low = mid+1; //+1 so it actually has a chance to end ever
            } else if(list[mid] > e){ //If the middle is higher than e, split if in half and check the bottom.
                upper = mid-1; //-1 so it can end eventually
            }
        }
        
        return -1; //Incase the element is not in the array.
    }
    
    public static int[] toIntArray(ArrayList<Integer> integers){
        int[] out = new int[integers.size()];
        for(int i = 0; i < out.length; i++){
            out[i] = integers.get(i);
        }
        
        return out;
    }
}
/*
Enter a number to search for: 110
Your number is not in the array.

Enter a number to search for: 60
Your number is at position: 41

Enter a number to search for: 1
Your number is at position: 1

Enter a number to search for: 92
Your number is at position: 53

Enter a number to search for: 19
Your number is at position: 14

Enter a number to search for: 98
Your number is not in the array.

Enter a number to search for: 70
Your number is not in the array.

*/