import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Card> hand;

    public Player(String name){
        this.name = name;
        this.hand = new ArrayList<Card>();
    }

    public void addCard(Card card){
        this.hand.add(card);
    }

    public Card getFirstCard(){
        return this.hand.get(0);
    }

    public ArrayList<Card> getHand() { return this.hand; }

    public String getName() { return this.name; }

}
