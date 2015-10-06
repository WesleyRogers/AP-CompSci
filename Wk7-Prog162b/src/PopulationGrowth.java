/*
    Program 162b Population Growth
    Wesley Rogers 
    10/6/15
    Java 1.8u25, using Eclipse Mars
    Windows 7

    Gives the population growth given a growth rate. Runs until population doubles.

    What I learned: Not much, although Eclipse was bugging me about not closing the datastream, so I did learn that.
    
    Difficulties: I initially forgot to reset i with each iteration of the loop, and some weird stuff was happening.
*/
import java.util.Scanner;

public class PopulationGrowth {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        int startPopulation = 236000000;
        int startYear = 2010;
        
        while(true) { //Since rate is determined in the loop, this is just about the best I could do. Checking here would require some weirdness.
            int i = 0;
            int population = startPopulation; //Starting over.
            
            System.out.println("What growth percentage would you like to use?");
            double rate = input.nextDouble();
            
            //If the rate is zero, exit the process.
            if (rate == 0d){
                System.out.print("Goodbye.");
                input.close(); //I knew I was forgetting to do something. 
                System.exit(0); //Zero because no error.
            }
            
            System.out.println("Year     Population (In millions)");
            
            while (population <= 2*startPopulation ){
                i++; //For the year.
                
                population = (int) (population * (1+(rate/100d))); //Rate+1 ensures growth. Int case is because we don't have partial people
                System.out.println((startYear + i) + "     " + (int)(population/1000000));
            
            }
            System.out.println("The population doubles by the year " + (startYear + i) + ". \n");
        }
    }
}
/* Sample Output
What growth percentage would you like to use?
10
Year     Population (In millions)
2011     259
2012     285
2013     314
2014     345
2015     380
2016     418
2017     459
2018     505
The population doubles by the year 2018. 

What growth percentage would you like to use?
5
Year     Population (In millions)
2011     247
2012     260
2013     273
2014     286
2015     301
2016     316
2017     332
2018     348
2019     366
2020     384
2021     403
2022     423
2023     445
2024     467
2025     490
The population doubles by the year 2025. 

What growth percentage would you like to use?
12
Year     Population (In millions)
2011     264
2012     296
2013     331
2014     371
2015     415
2016     465
2017     521
The population doubles by the year 2017. 

What growth percentage would you like to use?
2.9
Year     Population (In millions)
2011     242
2012     249
2013     257
2014     264
2015     272
2016     280
2017     288
2018     296
2019     305
2020     314
2021     323
2022     332
2023     342
2024     352
2025     362
2026     372
2027     383
2028     394
2029     406
2030     418
2031     430
2032     442
2033     455
2034     468
2035     482
The population doubles by the year 2035. 

What growth percentage would you like to use?
0
Goodbye.
*/
