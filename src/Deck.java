import java.util.Random;

public class Deck {

    public final int deck_size = 52;
    private final int Shuffle_Count = 2500;
    private final int player_hand = 2;
    private final int comm_hand = 5;
    public int deckPos = 0;
    public boolean reshuffle = false;

    Card[] deck = new Card[deck_size];
    Random rand = new Random();

    public void StackDeck()
    {
        int counter = 0;
        for (int suit = 1; suit <= 4; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                deck[counter] = new Card();
                deck[counter].suit = suit;
                deck[counter].rank = rank;
                counter++;
            }
        }
    }
    public void Shuffle(){
        for(int i = 0; i <= Shuffle_Count; i++){
            int number1 = rand.nextInt(deck_size);
            int number2 = rand.nextInt(deck_size);
            Card temp = deck[number1];
            deck[number1] = deck[number2];
            deck[number2] = temp;
        }
    }
    public Card[] deal(){
        Card[] hand = new Card[player_hand];
        for(int i = 0; i < player_hand; i++) {
            hand[i] = deck[i + deckPos];
            deckPos++;
        }
        deckPos++;
        return hand;
    }
    public Card[] dealcomm(){
        Card[] community = new Card[comm_hand];
        for (int i = 0; i < comm_hand; i++) {
            community[i] = deck[i + deckPos];
            deckPos++;
        }
        return community;
    }
    public void ResetDeckPointer(){
        deckPos = 0;
    }

}
