import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {
    Dealer dealer;
    Player player;
    Player player2;
    Card card;
    Deck deck;
    Game game;

    @Before
    public void before(){
        game = new Game(dealer, deck);
        dealer = new Dealer();
        player = new Player("Mat");
        player2 = new Player("Suvi");
//        card = new Card(SuitType.SPADES, RankType.ACE);
        deck = new Deck();
    }

    @Test
    public void canAddPlayer(){
        game.addPlayer(player);
        assertEquals(1, game.getPlayers().size());
    }

    @Test
    public void canStartGame(){
        game.addPlayer(player);
        game.addPlayer(player2);
        game.start();
        assertEquals(2, player.getHand().size() );
        assertEquals(2, player2.getHand().size());
        assertEquals(2, dealer.getHand().size());
        assertEquals(RankType.ACE, dealer.getHand().get(0).getRank());
        assertEquals(RankType.TWO, player.getHand().get(0).getRank());
        assertEquals(RankType.SIX, player2.getHand().get(1).getRank());
    }
}
