package classes;

import interfaces.CalculChirie;

public class MagazinAlimentar implements CalculChirie{
    @Override
    public int fChirie(int n) {
        return 2 * n;
    }
}
