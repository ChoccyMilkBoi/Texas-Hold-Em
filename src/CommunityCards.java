public class CommunityCards {
    public Card[] CommCards;
    public Card[] FillComm(Deck deck){
        CommCards = deck.dealcomm();
        return CommCards;
    }
    public void River(){
        System.out.println("The River is: ");
    }
}
