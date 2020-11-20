import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Card card;

    @Before
    public void before(){
        player = new Player("Mat");
        card = new Card(SuitType.SPADES, RankType.ACE);
    }

    @Test
    public void canAddCard(){
        player.addCard(card);
        assertEquals(RankType.ACE, player.getFirstCard().getRank());
    }

    @Test
    public void canGetHand(){
        player.addCard(card);
        player.addCard(card);
        assertEquals(2, player.getHand().size());
        assertEquals(1, player.getHand().get(1).getRankValue());
    }

    @Test
    public void canGetName(){
        assertEquals("Mat", player.getName());
    }

    @Test
    public void canGetTotalHand(){
        player.addCard(card);
        player.addCard(card);
        assertEquals(2, player.getTotalHand());
    }
}
