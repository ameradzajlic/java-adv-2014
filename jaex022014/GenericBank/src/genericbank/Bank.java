package genericbank;
public class Bank<CardType extends ICard> {
    CardType card;
    public Bank(CardType card){
        this.card = card;
    }
    public boolean pay(){
        if(card.validate()){
            card.getMoney(10);
        }
        return true;
    }
}
