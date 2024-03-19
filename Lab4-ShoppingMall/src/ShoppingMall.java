import interfata.BankCard;

public class ShoppingMall {
    private BankCard card;

    public ShoppingMall(BankCard card) {
        this.card = card;
    }

    public void setCard(BankCard card) {
        this.card = card;
    }

    public void achizitie(double amount) {
        card.doTransaction(amount);
    }
}
