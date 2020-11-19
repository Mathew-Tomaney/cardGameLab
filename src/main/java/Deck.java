import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(){
        this.cards = new ArrayList<Card>();
    }

    public int cardsInDeck(){
        return this.cards.size();
    }

}
