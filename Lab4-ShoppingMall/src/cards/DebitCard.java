package cards;

import interfata.BankCard;

public record DebitCard(String user, double limitAmount) implements BankCard {

    private static double spentAmount = 0;

    @Override
    public void doTransaction(double amount) {
        if(amount <= limitAmount) {
            spentAmount += amount;
            System.out.println("Utilizator " + user + " a cheltuit " + amount);
            System.out.println("Suma totala cheltuita cu carduti de debit este " + spentAmount);
        } else {
            System.out.println("Not enough money");
        }
        System.out.println();
    }
}
