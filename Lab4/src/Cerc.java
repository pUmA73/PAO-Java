import interfata.Calcul;

public class Cerc implements Calcul {
    private double radius;

    public Cerc(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcPerim() {
        return 2 * Math.PI * radius;
    }
}
