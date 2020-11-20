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

//    public void dealCardToPlayer(Player player){
//        player.addCard(this.dealCard());
//    }
//    public void dealCardToDealer(Dealer dealer) { dealer.addCard(this.dealCard()); }
}
