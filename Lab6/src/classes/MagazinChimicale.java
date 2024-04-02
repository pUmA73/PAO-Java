package classes;

import interfaces.CalculChirie;

public class MagazinChimicale implements CalculChirie {
    @Override
    public int fChirie(int n) {
        return 4 * n;
    }
}
