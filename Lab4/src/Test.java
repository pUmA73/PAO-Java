import interfata.Calcul;

public class Test {

    public static void main(String[] args) {
        Cerc circle = new Cerc(3);
        Patrulater p1 = new Patrulater(1, 2, 3, 4);

        Calcul cerc2 = new Cerc(4);

        System.out.println(circle.calcPerim());

        System.out.println(p1.calcPerim());

        System.out.println(cerc2.calcPerim());
    }
}
