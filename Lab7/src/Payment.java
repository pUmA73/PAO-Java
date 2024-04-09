public class Payment {

    private double amount;
    private Currency currency;
    private User user;
    private String purpose;

    public Payment(double amount, Currency currency, User user, String purpose) {
        this.amount = amount;
        this.currency = currency;
        this.user = user;
        this.purpose = purpose;
    }

    public double getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public User getUser() {
        return user;
    }

    public String getPurpose() {
        return purpose;
    }

}
