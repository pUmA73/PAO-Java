package classes;

import interfaces.CalculChirie;

public class MagazinHaine implements CalculChirie{
    @Override
    public int fChirie(int n) {
        return 3 * n;
    }
}
