import java.util.Scanner;

public class GalacticWeight {

    public static final double weightRatios[] = {.27, .85, .16, .38, 2.64, 1.17, 1.12, .25};
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        while(true){ //choice 9 handles exiting, so we don't strictly need to do it here.
            double weight = 0;
            int choice = 0;
            Scanner input = new Scanner(System.in);
            System.out.println("Welcome to the weight finder! Type a number to find your weight on the corresponding planet, or 9 to exit.");
            System.out.print("1. Mercury \n2. Venus \n3. Moon \n4. Mars \n5. Jupiter \n6. Saturn \n7. Neptune \n8. Pluto \nChoose a planet: ");
            choice = input.nextInt();
            
            
            if(choice < 9){
                System.out.println("What's your weight? ");
                weight = input.nextDouble();
            }
            
            switch (choice){
                case 1: System.out.println("You would weight " + weightRatios[0]*weight + " pounds on Mercury.\n\n"); break;
                case 2: System.out.println("You would weight " + weightRatios[1]*weight + " pounds on Venus.\n\n"); break;
                case 3: System.out.println("You would weight " + weightRatios[2]*weight + " pounds on the Moon.\n\n"); break;
                case 4: System.out.println("You would weight " + weightRatios[3]*weight + " pounds on Mars.\n\n"); break;
                case 5: System.out.println("You would weight " + weightRatios[4]*weight + " pounds on Jupiter.\n\n"); break;
                case 6: System.out.println("You would weight " + weightRatios[5]*weight + " pounds on Saturn.\n\n"); break;
                case 7: System.out.println("You would weight " + weightRatios[6]*weight + " pounds on Neptune.\n\n"); break;
                case 8: System.out.println("You would weight " + weightRatios[7]*weight + " pounds on Pluto.\n\n"); break;
                case 9: System.exit(0);
                default: System.out.println("That is not a valid choice!"); break;
            }
            
        }
    }
    
}
/*
Welcome to the weight finder! Type a number to find your weight on the corresponding planet, or 9 to exit.
1. Mercury 
2. Venus 
3. Moon 
4. Mars 
5. Jupiter 
6. Saturn 
7. Neptune 
8. Pluto 
Choose a planet: 1
What's your weight? 
200
You would weight 54.0 pounds on Mercury.


Welcome to the weight finder! Type a number to find your weight on the corresponding planet, or 9 to exit.
1. Mercury 
2. Venus 
3. Moon 
4. Mars 
5. Jupiter 
6. Saturn 
7. Neptune 
8. Pluto 
Choose a planet: 5
What's your weight? 
150
You would weight 396.0 pounds on Jupiter.


Welcome to the weight finder! Type a number to find your weight on the corresponding planet, or 9 to exit.
1. Mercury 
2. Venus 
3. Moon 
4. Mars 
5. Jupiter 
6. Saturn 
7. Neptune 
8. Pluto 
Choose a planet: 7
What's your weight? 
50
You would weight 56.00000000000001 pounds on Neptune.


Welcome to the weight finder! Type a number to find your weight on the corresponding planet, or 9 to exit.
1. Mercury 
2. Venus 
3. Moon 
4. Mars 
5. Jupiter 
6. Saturn 
7. Neptune 
8. Pluto 
Choose a planet: 6
What's your weight? 
7
You would weight 8.19 pounds on Saturn.


Welcome to the weight finder! Type a number to find your weight on the corresponding planet, or 9 to exit.
1. Mercury 
2. Venus 
3. Moon 
4. Mars 
5. Jupiter 
6. Saturn 
7. Neptune 
8. Pluto 
Choose a planet: 9
*/