public class Player {

    public String name;
    public Card[] hand;

    public void draw(Deck deck){
        hand = deck.deal();
    }

}
