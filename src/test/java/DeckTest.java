import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DeckTest {
    Deck deck;
    Card card;

    @Before
    public void before() {
        deck = new Deck();
        card = new Card(SuitType.SPADES,RankType.ACE);
    }

    @Test
    public void deckStartsEmpty(){
        assertEquals(0, deck.cardsInDeck());
    }

    @Test
    public void deckFull(){
        deck.fillDeck();
        assertEquals(52, deck.cardsInDeck());
    }

    @Test
    public void deckIsOrdered(){
        deck.fillDeck();
        assertEquals(RankType.ACE, deck.dealCard().getRank());
        assertEquals(SuitType.SPADES, deck.dealCard().getSuit());
    }

    @Test
    public void cardHasBeenDealt(){
        deck.fillDeck();
        deck.dealCard();
        assertEquals(51, deck.cardsInDeck());
    }


}
