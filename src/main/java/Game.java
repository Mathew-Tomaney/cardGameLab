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


}
