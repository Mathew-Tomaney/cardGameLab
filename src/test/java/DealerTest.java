import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DealerTest {
    Dealer dealer;
    Player player;
    Card card;
    Deck deck;

    @Before
    public void before(){
        dealer = new Dealer();
        player = new Player("Mat");
        card = new Card(SuitType.SPADES, RankType.ACE);
        deck = new Deck();
    }
    @Test
    public void handStartsEmpty(){
        assertEquals(0, dealer.getHand().size());
    }
    @Test
    public void canAddCard(){
        dealer.addCard(card);
        assertEquals(RankType.ACE, dealer.getHand().get(0).getRank());
    }
    @Test
    public void canDealCardToPlayer(){
        deck.fillDeck();
        dealer.dealCardToPlayer(deck, player);
        assertEquals(1, player.getFirstCard().getRankValue());
    }
    @Test
    public void canDealCardToSelf(){
        deck.fillDeck();
        dealer.dealCardToSelf(deck);
        assertEquals(1, dealer.getHand().get(0).getRankValue());
    }
    @Test
    public void canGetTotalHand(){
        dealer.addCard(card);
        dealer.addCard(card);
        assertEquals(2, dealer.getTotalHand());
    }
}
