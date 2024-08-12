import java.util.*;


public class Game {

    int HandScore;

    TransCard transCard = new TransCard();

    Scanner scan = new Scanner(System.in);

    Player gamer = new Player();
    CommunityCards commcards = new CommunityCards();

    String ScanDeal;
    String StrGameActive;
    String Shuffler;
    boolean GameActive = true;
    public void play(){
        System.out.println("Welcome to Java Poker");
        System.out.println("Please enter your name: ");
        gamer.name = scan.nextLine();
        System.out.println("Welcome " + gamer.name + " to Fortnite!");
        gamer.hand = new Card[5];
        do{
            Deck deck = new Deck();

            deck.StackDeck();
            deck.Shuffle();

            System.out.println("Deal 2 card hand to player? (Press Enter or submit any text to continue)");
            ScanDeal = scan.nextLine();



            gamer.draw(deck);
            System.out.println("Player Cards:");
            for (int i = 0; i < gamer.hand.length; i++) {
                System.out.print(transCard.CardDef(gamer.hand[i]) + " ");
            }
            System.out.println();


            commcards.FillComm(deck);
            System.out.println("Community Cards:");
            for (int i = 0; i < commcards.CommCards.length; i++) {
                System.out.print(transCard.CardDef(commcards.CommCards[i]) + ", ");
            }
            System.out.println();

            Replay();
            deck.ResetDeckPointer();
        }while(GameActive);


        System.out.println("Thank you for playing!");





    // Method used to call for a new round or to end the program.
    }
    public void Replay(){
        do{System.out.println("Play again? (Y/N)");
            StrGameActive = scan.nextLine();
            switch(StrGameActive){
                case "Y":
                    System.out.println("Beginning New Game!");
                    break;
                case "y":
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