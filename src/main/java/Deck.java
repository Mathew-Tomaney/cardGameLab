import java.util.ArrayList;
import java.util.Collections;

import static java.util.Collections.shuffle;

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

    public Card dealCard(){
        Card dealtCard = this.cards.get(0);
        this.cards.remove(dealtCard);
        return dealtCard;
    }

    public void shuffleCards() {
        shuffle(this.cards);
    }

}
