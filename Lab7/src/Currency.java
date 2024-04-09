public enum Currency {

    RON("Romania", "RO"),
    USD("United States of America", "US"),
    EUR("Europe", "EU"),
    GBP("United Kingdom", "GB"),
    TRY("Turkey", "TR");

    private final String countryName;
    private final String countrySymbol;

    Currency(String countryName, String countrySymbol) {
        this.countryName = countryName;
        this.countrySymbol = countrySymbol;
    }

    public String getCountryName() {
        return  countryName;
    }

    public String getCountrySymbol() {
        return  countrySymbol;
    }

}
