import cards.CreditCard;
import cards.DebitCard;

public class Application {
    public static void main(String[] args) {
        DebitCard cardDebit = new DebitCard("Ionut Popescu", 1500);

        CreditCard cardCredit = new CreditCard("David Rusu");

        ShoppingMall mall = new ShoppingMall(cardDebit);

        mall.achizitie(1400);

        mall.setCard(cardCredit);

        mall.achizitie(1500);
    }
}
