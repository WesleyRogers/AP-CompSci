import java.util.ArrayList;
import java.util.Arrays;

/*
    Program 477h Bean Counter
    Wesley Rogers 
    4/5/16
    Java 1.8u25, using Eclipse Mars
    Windows 7
    
    Does a simulation where a bag is filled randomly with beans.
    
    What I learned: Not much programming wise, but the mathematics side was pretty cool. 
    
    Conclusion: The final bean will be white if and only if the number of white beans is odd.
                Since we can only remove white beans in pairs, and no more can be created, there will always be a left over one if there are an odd number.
    
    Difficulties: The mathematical conclusion took a minute, but that was just my brain derping out.
*/

public class RandomBeans {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        System.out.println("Beans White Black Final");
        
        for(int i = 10; i <= 60; i++){
            //True is a white bean, false is a black bean.
            ArrayList<Boolean> beans = new ArrayList<Boolean>(i);
            randomFillArray(beans, i);
            System.out.print(i + "    " + countNumberInArray(beans, true) + "     " + countNumberInArray(beans, false) + "   ");
            while(beans.size() > 1){
                //If we treat the beans as booleans, any time we XOR them together and it return false, we remove both and add a black bean.
                int x = (int) (Math.random()*beans.size());
                int y = (int) (Math.random()*beans.size());
                int z = (int) (Math.random()*(beans.size()-1)); //This is our random insertion position
                
                while(x ==y){ //This is to make sure we don't pull from the same position twice.
                    y = (int) (Math.random()*beans.size());
                }
                
                
                if (!(beans.get(x).booleanValue() ^ beans.get(y).booleanValue())){ //If we pull two of the same color, discard then add a black bean.
                    removeFromPositions(beans, x, y);
                    beans.add(z, false);
                } else { //If we pull two beans that are different colors, remove both and add a white back in.
                    removeFromPositions(beans, x, y);
                    beans.add(z, true);
                }
                
                
                
            }
            
            if(beans.get(0).booleanValue()){
                System.out.println("white");
            } else {
                System.out.println("black");
            }
        }
    }
    
    //I can't use a generic here because static or I would.
    public static ArrayList<Boolean> removeFromPositions(ArrayList<Boolean> l, int... pos){
        ArrayList<Boolean> removed = new ArrayList<Boolean>();
        Arrays.sort(pos);
        int numRemoved = 0;
        for(int i : pos){
            removed.add(l.remove(i - numRemoved));
            numRemoved++;
        }
        
        return removed;
    }
    
    // Does NOT randomly arrange the array. 
    public static void randomFillArray(ArrayList<Boolean> l, int size){
        int trues = (int) (Math.random()*size);
        int falses = size - trues;
        for(int i = 0; i <= trues; i++){
            l.add(true);
        }
        
        for(int i = 0; i <= falses; i++){
            l.add(false);
        }
        
        
    }
    
    //Randomly shuffles array b
    public static void shuffleArray(Boolean[] b){
        for(int i = 0; i < (int)(1.5*b.length); i++){
            swapArrayElements(b, ((int) (Math.random()*b.length)), (int) (Math.random()*b.length));
        }
    }
    
    //Swaps elements, nothing special.
    public static void swapArrayElements(Boolean[] array, int i, int k){
        Boolean temp = array[i];
        array[i] = array[k];
        array[k] = temp;
    }
    
    //Counts the total number of hits within the array.
    public static int countNumberInArray(ArrayList<Boolean> list, Boolean e){
        Boolean[] array = list.toArray(new Boolean[list.size()]);
        int num = 0;
        for(int i = 0; i<array.length-1; i++){
            if (array[i].equals(e)){
                num++;
            }
        }
        return num;
    }
}
/*
Beans White Black Final
10    2     9   black
11    2     10   black
12    9     4   white
13    2     12   black
14    13     2   white
15    15     1   white
16    16     1   black
17    2     16   black
18    14     5   black
19    13     7   white
20    10     11   black
21    5     17   white
22    10     13   black
23    12     12   black
24    23     2   white
25    15     11   white
26    2     25   black
27    23     5   white
28    1     28   white
29    3     27   white
30    21     10   white
31    12     20   black
32    18     15   black
33    30     4   black
34    21     14   white
35    1     35   white
36    11     26   white
37    18     20   black
38    22     17   black
39    8     32   black
40    39     2   white
41    12     30   black
42    3     40   white
43    21     23   white
44    18     27   black
45    37     9   white
46    44     3   black
47    43     5   white
48    46     3   black
49    34     16   black
50    30     21   black
51    19     33   white
52    43     10   white
53    11     43   white
54    14     41   black
55    36     20   black
56    31     26   white
57    30     28   black
58    34     25   black
59    50     10   black
60    27     34   white
*/