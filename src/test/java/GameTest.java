import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {
    Dealer dealer;
    Player player;
    Card card;
    Deck deck;
    Game game;

    @Before
    public void before(){
        game = new Game();
        dealer = new Dealer();
        player = new Player("Mat");
        card = new Card(SuitType.SPADES, RankType.ACE);
        deck = new Deck();
    }

    @Test
    public void canAddPlayer(){
        game.addPlayer(player);
        assertEquals(1, game.getPlayers().size());
    }
}
