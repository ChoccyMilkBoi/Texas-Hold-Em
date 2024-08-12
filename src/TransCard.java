public class TransCard {
    public String SuitTrans(Card card){
        switch (card.suit){
            case 1:
                return "Clubs";
            case 2:
                return "Diamonds";
            case 3:
                return "Hearts";
            case 4:
                return "Spades";
            default:
                return "Error, please reset game.";
        }
    }
    public String RankTrans(Card card){
        switch (card.rank){
            case 1:
                return "Two";
            case 2:
                return "Three";
            case 3:
                return "Four";
            case 4:
                return "Five";
            case 5:
                return "Six";
            case 6:
                return "Seven";
            case 7:
                return "Eight";
            case 8:
                return "Nine";
            case 9:
                return "Ten";
            case 10:
                return "Jack";
            case 11:
                return "Queen";
            case 12:
                return "King";
            case 13:
                return "Ace";
            default:
                return "Error, please reset game.";
        }
    }
    public String CardDef(Card card){
        return RankTrans(card) + " of " + SuitTrans(card);
    }
}
