package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ShoppingMall {
    private List<Magazin> magazine = new ArrayList<>();

    public void adaugaMagazin(Magazin magazin) {
        magazine.add(magazin);
    }

    public void stergeMagazin(Magazin magazin) {
        magazine.remove(magazin);
    }

    public List<Magazin> getListaMagazine() {
        return magazine;
    }

    public List<Magazin> getMagazineAleProprietar(Proprietar proprietar) {
        return magazine.stream()
                .filter(magazin -> magazin.getProprietar().equals(proprietar))
                .collect(Collectors.toList());
    }
}
