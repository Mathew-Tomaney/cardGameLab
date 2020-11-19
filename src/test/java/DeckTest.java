import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DeckTest {
    Deck deck;

    @Before
    public void before() {
        deck = new Deck();
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
}
