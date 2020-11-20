import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DealerTest {
    Dealer dealer;
    Player player;
    Card card;

    @Before
    public void before(){
        dealer = new Dealer();
        player = new Player("Mat");
        card = new Card(SuitType.SPADES, RankType.ACE);
    }
    @Test
    public void handStartsEmpty(){
        assertEquals(0, dealer.getHand().size());
    }

}
