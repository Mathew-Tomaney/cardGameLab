import java.util.ArrayList;

public class Game {
    private ArrayList<Player> players;
    private Dealer dealer;
    private Deck deck;

    public Game(){
        this.players = new ArrayList<Player>();
        this.dealer = new Dealer();
        this.deck = new Deck();
    }

    public void addPlayer(Player player){
        this.players.add(player);
    }

    public ArrayList<Player> getPlayers(){
        return this.players;
    }
}
