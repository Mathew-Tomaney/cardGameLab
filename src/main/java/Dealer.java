import java.util.ArrayList;

public class Dealer {
    private ArrayList<Card> hand;

    public Dealer(){
        this.hand = new ArrayList<Card>();
    }

    public ArrayList<Card> getHand(){
        return this.hand;
    }

    public void addCard(Card card){
        this.hand.add(card);
    }

    public void dealCardToPlayer(Deck deck, Player player){
        player.addCard(deck.dealCard());
    }
    public void dealCardToSelf(Deck deck) { this.addCard(deck.dealCard()); }

    public int getTotalHand() {
        int total = 0;
        for(Card card : this.getHand()){
            total += card.getRankValue();
        }
        return total;
    }
}
