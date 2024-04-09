public class ConversieCalculImpl implements ConversieCalcul {

    @Override
    public double conversionToEur(double amount, Currency currency) {
        switch(currency) {
            case USD: return amount * 0.9;
            case GBP: return amount * 1.2;
            case RON: return amount * 0.2;
            case TRY: return amount * 0.05;
            default: return amount;     // caz default EUR
        }
    }

    @Override
    public void calculRata() {
        // implementare (nu folosim niciodata metoda)
    }

}
