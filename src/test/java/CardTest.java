import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {
    Card card;

    @Before
    public void before() {
        card = new Card(SuitType.SPADES, RankType.FIVE);
    }

    @Test
    public void canGetSuit(){
        assertEquals(SuitType.SPADES, card.getSuit());
    }
    @Test
    public void canGetRank(){
        assertEquals(RankType.FIVE, card.getRank());
    }
    @Test
    public void canGetValue(){
        assertEquals(5, card.getRankValue());
    }
}