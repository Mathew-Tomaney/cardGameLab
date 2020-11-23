import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {
    Dealer dealer;
    Player player;
    Player player2;
    Card card;
    Card card2;
    Deck deck;
    Game game;

    @Before
    public void before(){
        dealer = new Dealer();
        player = new Player("Mat");
        player2 = new Player("Suvi");
        card = new Card(SuitType.SPADES, RankType.ACE);
        card2 = new Card(SuitType.SPADES, RankType.KING);
        deck = new Deck();
        game = new Game(dealer, deck);
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
        assertEquals(RankType.ACE, player.getHand().get(0).getRank());
        assertEquals(RankType.TWO, player2.getHand().get(0).getRank());
        assertEquals(RankType.SIX, dealer.getHand().get(1).getRank());
    }

    @Test
    public void canGetHighestTotalScore(){
        game.addPlayer(player);
        game.addPlayer(player);
        dealer.addCard(card);
        dealer.addCard(card);
        dealer.addCard(card2);
        player.addCard(card2);
        player.addCard(card2);
        player2.addCard(card);
        player2.addCard(card2);
        assertEquals(20, game.getHighestTotalScore());
    }

    @Test
    public void canGetWinner(){

    }
}
