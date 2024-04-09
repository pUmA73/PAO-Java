public class Transaction extends ConversieCalculImpl implements Cloneable {

    private int id;
    private Payment payment;
    private Currency currency = Currency.EUR;
    private double amount;
    private int refNumber;

    public Transaction(int id, Payment payment) {
        this.id = id;
        this.payment = payment;
        this.amount = super.conversionToEur(payment.getAmount(), payment.getCurrency());
    }

    @Override
    protected Transaction clone() {
        try {
            Transaction clone = (Transaction) super.clone();
            return clone;
        } catch(CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public Transaction stornare() {
        Transaction transactionStornata = this.clone();
        transactionStornata.amount = -this.amount;
        transactionStornata.refNumber = this.id;
        return transactionStornata;
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public Payment getPayment() {
        return payment;
    }

    public int getRefNumber() {
        return refNumber;
    }

    @Override
    public String toString() {
        return String.format("Tranzactie{id=%d, amount=%.2f, currency=%s, refNumber=%s}", id, amount, currency, refNumber);
    }
}
