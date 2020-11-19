import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(){
        this.cards = new ArrayList<Card>();
    }

    public int cardsInDeck(){
        return this.cards.size();
    }

    public void fillDeck(){
        for (SuitType suit : SuitType.values()){
            for (RankType rank : RankType.values()){
                cards.add(new Card(suit, rank));
            }
        }
    }

    public Card getFirstCard(){
        return this.cards.get(0);
    }

}
