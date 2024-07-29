import java.util.*;


public class Game {
    Scanner scan = new Scanner(System.in);
    String StrGameActive;
    boolean GameActive = true;
    public void play(){
        do{

            this.Replay();
        }while(GameActive);


        System.out.println("Thank you for playing!");





    // Method used to call for a new round or to end the program.
    }
    public void Replay(){
        do{
            System.out.println("Play again? (Y/N)");
            StrGameActive = scan.nextLine();
            switch(StrGameActive){
                case "Y":
                    System.out.println("Beginning New Game!");
                    break;
                case "N":
                    GameActive = false;
                    break;
                default:
                    System.out.println("Invalid input, go again.");
                    break;
            }
        }while(!(StrGameActive.equalsIgnoreCase("Y") || StrGameActive.equalsIgnoreCase("N")));
    }
}