import java.util.ArrayList;
import java.util.Arrays;

/*
    Program 427a The Seive of Erantosthenes
    Wesley Rogers 
    2/24/16
    Java 1.8u25, using Eclipse Mars
    Windows 7
    
    Gives all of the prime numbers between 1 and 1000.
    
    What I learned: I learned the how to create the seive. I did something slightly different that I learned from the wikipedia page, but it works even faster than what was listed on the doc. Yay!
    
    Difficulties: I forgot that boolean arrays start out as all false, and that led to some infinite looping errors.
*/

public class Seive {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Integer[] primes = seive(1000);
        for(int i = 0; i<primes.length; i++){
            if(i % 5 == 4){
                System.out.println(lss(primes[i].toString(), 4, true));
            } else {
                System.out.print(lss(primes[i].toString(), 4, true));
            }
        }
    }

    public static Integer[] seive(int max){
        ArrayList<Integer> out = new ArrayList<Integer>();
        boolean[] primes = new boolean[max+1]; //For simplicities sake I'm ignoring the first and second indices.
        
        for(int i = 2; i*i<=max; i+=0){ //Don't increase i automagically, it must be done manually
            for(int k = 0; (i*(k+i)) <= max; k++){
                primes[i*(k+i)] = true; //Mark i^2 + k*i out because it's composite.
            }
            
            //Now to find the next i.
            boolean notFoundI = true;
            for(int l = i + 1; notFoundI; l++){
                if(!primes[l]){
                    i = l;
                    notFoundI=false;
                }
            }
            
        }
        
        //Add every instance of 'false' to the arraylist, as 'false''s are prime.
        for(int i=2; i<primes.length; i++){
            if(!primes[i]){
                out.add(new Integer(i));
            }
        }
        return out.toArray(new Integer[out.size()]);
    }
    
    //Since we know that all numbers under 1000 are 3 digits, I can use this!
    public static String lss(String string, int size, boolean isRightPadded){ //Lengthens a string to size.
        String stringOut = string;
        if (isRightPadded == true) {
            stringOut = String.format(("%1$" + size + "s"), string); //Pad it on the right if its short
        } else {
            stringOut = String.format(("%1$-" + size + "s"), string); //Pad it on the left if its short
        }
        stringOut = stringOut.substring(0, size);//Cut it short if its long.
        return stringOut; //Returns the formatted string.
    }
    
}
/*
   2   3   5   7  11
  13  17  19  23  29
  31  37  41  43  47
  53  59  61  67  71
  73  79  83  89  97
 101 103 107 109 113
 127 131 137 139 149
 151 157 163 167 173
 179 181 191 193 197
 199 211 223 227 229
 233 239 241 251 257
 263 269 271 277 281
 283 293 307 311 313
 317 331 337 347 349
 353 359 367 373 379
 383 389 397 401 409
 419 421 431 433 439
 443 449 457 461 463
 467 479 487 491 499
 503 509 521 523 541
 547 557 563 569 571
 577 587 593 599 601
 607 613 617 619 631
 641 643 647 653 659
 661 673 677 683 691
 701 709 719 727 733
 739 743 751 757 761
 769 773 787 797 809
 811 821 823 827 829
 839 853 857 859 863
 877 881 883 887 907
 911 919 929 937 941
 947 953 967 971 977
 983 991 997
*/