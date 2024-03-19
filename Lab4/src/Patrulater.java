import interfata.Calcul;

public class Patrulater implements Calcul {
    private double lat1;
    private double lat2;
    private double lat3;
    private double lat4;

    public Patrulater(double lat1, double lat2, double lat3, double lat4) {
        this.lat1 = lat1;
        this.lat2 = lat2;
        this.lat3 = lat3;
        this.lat4 = lat4;
    }

    @Override
    public double calcPerim() {
        return lat1 + lat2 + lat3 + lat4;
    }
}
