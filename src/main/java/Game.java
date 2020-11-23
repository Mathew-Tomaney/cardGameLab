import java.util.ArrayList;

public class Game {
    private ArrayList<Player> players;
    private Deck deck;
    private Dealer dealer;

    public Game(Dealer dealer, Deck deck){
        this.players = new ArrayList<Player>();
        this.deck = deck;
        this.dealer = dealer;
    }

    public void addPlayer(Player player){
        this.players.add(player);
    }

    public ArrayList<Player> getPlayers(){
        return this.players;
    }

    public void start(){
        deck.fillDeck();
//        deck.shuffleCards();
        for(int i = 0; i < 2; i++){
            for(Player player : players){
                dealer.dealCardToPlayer(deck, player);
            }
            dealer.dealCardToSelf(deck);
        }
    }

    public int getHighestTotalScore(){
        int highScore = 0;
        int dealerScore = dealer.getTotalHand();
        for(Player player : players){
            if (player.getTotalHand() > highScore){
                highScore = player.getTotalHand();
            }
        }
        return Math.max(highScore, dealerScore);
    }
}
