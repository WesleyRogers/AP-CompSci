
public class CarnivalDriver {
    public static void main(String args[]){
        GameBooth balloonDartToss = new GameBooth (2, "tiger plush", "sticker");
        GameBooth ringToss = new GameBooth (2, "bear keychain", "pencil");
        GameBooth breakAPlate = new GameBooth(1.5, "pig plush", "plastic dinosaur");
        Player rhonda = new Player(5); //$5 spending money..
        Player luis = new Player(3); //$3 spending money
        System.out.print("Rhonda goes to Balloon Dart Toss. ");
        System.out.println(rhonda.play(balloonDartToss));
        System.out.print("Luis goes to Ring Toss. ");
        System.out.println(luis.play(ringToss) );
        System.out.print("Rhonda goes to Ring Toss. ");
        System.out.println(rhonda.play(ringToss));
        System.out.print("Luis goes to Break A Plate. ");
        System.out.println(luis.play (breakAPlate));
        
        System.out.println();
        System.out.println("The balloon dart toss game says that " + balloonDartToss.prizesAwarded());
        System.out.println("The ring toss game says that " + ringToss.prizesAwarded());
        System.out.println("The break a plate game says that " + breakAPlate.prizesAwarded());
        System.out.println("Rhonda says: " + rhonda);
        System.out.println("Luis says: " + luis);
    }
}
/*
Rhonda goes to Balloon Dart Toss. prize won: sticker
Luis goes to Ring Toss. prize won: bear keychain
Rhonda goes to Ring Toss. prize won: pencil
Luis goes to Break A Plate. Sorry, not enough money to play.

The balloon dart toss game says that there have been 0 first prizes won and 1 consolation prizes won.
The ring toss game says that there have been 1 first prizes won and 1 consolation prizes won.
The break a plate game says that there have been 0 first prizes won and 0 consolation prizes won.
Rhonda says: I have $1.0 left and have won: pencil sticker .
Luis says: I have $1.0 left and have won: bear keychain .

*/