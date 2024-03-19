package cards;

import interfata.BankCard;

public record CreditCard(String user) implements BankCard {
    private static double spentAmount = 0;

    @Override
    public void doTransaction(double amount) {
        spentAmount += amount;
        System.out.println("Utilizator " + user + " a cheltuit " + amount);

        System.out.println("Suma totala cheltuita cu carduri de credit este " + spentAmount);
        System.out.println();
    }
}
