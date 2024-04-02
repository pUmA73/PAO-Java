
import classes.*;
import interfaces.CalculChirie;

import javax.sound.sampled.Port;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {

        Proprietar p1 = new Proprietar("Kara", "Benjamin", 33);
        Proprietar p2 = new Proprietar("Ben", "Collin", 62);
        Proprietar p3 = new Proprietar("Finn", "McCunning", 29);

        Magazin[] magazine = {
                new Magazin("1", "Funn Shop", p1, 100, 40),
                new Magazin("2", "SuperMarket", p2, 2000, 60),
                new Magazin("3", "Paints and Tools", p2, 6000, 120),
                new Magazin("4", "Hommage", p3, 15000, 160),
                new Magazin("5", "Abidas", p1, 1000, 78)
        };

        ShoppingMall mall = new ShoppingMall();

        for(Magazin magazin : magazine) {
            mall.adaugaMagazin(magazin);
        }

        CalculChirie chirieAlimentar = new MagazinAlimentar();
        CalculChirie chirieHaine = new MagazinHaine();
        CalculChirie chirieChimice = new MagazinChimicale();

        magazine[0].setChirie(chirieAlimentar);
        magazine[1].setChirie(chirieAlimentar);
        magazine[2].setChirie(chirieChimice);
        magazine[3].setChirie(chirieHaine);
        magazine[4].setChirie(chirieHaine);

        printareListaNesortata(mall);
        printareMagazineSortate(mall);
        printareMagazineDupaProprietar(mall, p2);
        printVenitTotalProprietar(mall, p1);
        printChirieToatlaProprietar(mall, p3);
    }

    private static void printareListaNesortata(ShoppingMall mall) {
        System.out.println("Magaine nesortate: \n" + mall.getListaMagazine() + "\n");
    }

    private static void printareMagazineSortate(ShoppingMall mall) {
        Collections.sort(mall.getListaMagazine(), Comparator.comparing(Magazin::getProprietar, Comparator.comparing(Proprietar::getNume)
                .thenComparing(Proprietar::getPrenume))
                .thenComparing(Magazin::getChirie));

        System.out.println("Magazine sortate(proprietar, chirie): \n" + mall.getListaMagazine() + "\n");
    }

    private static void printareMagazineDupaProprietar(ShoppingMall mall, Proprietar proprietar) {
        List<Magazin> magazineProprietar = mall.getMagazineAleProprietar(proprietar);
        Collections.sort(magazineProprietar, Comparator.comparing(Magazin::getNumeMagazin)
                .thenComparing(Magazin::getVenit)
                .thenComparing(Magazin::getChirie)
                .thenComparing(Magazin::getSuprafata));
        System.out.println("Magazine ala proprietarului(numeMagazin, venit, chirie, suprafata):\n" + magazineProprietar);
    }

    private static void printVenitTotalProprietar(ShoppingMall mall, Proprietar proprietar) {
        int venit = mall.getListaMagazine().stream()
                .filter(magazin -> magazin.getProprietar().equals(proprietar))
                .mapToInt(Magazin::getVenit)
                .sum();

        System.out.println("Venit total proprietar: " + venit + "\n");
    }

    private static void printChirieToatlaProprietar(ShoppingMall mall, Proprietar proprietar) {
        int chirie = mall.getListaMagazine().stream()
                .filter(magazin -> magazin.getProprietar().equals(proprietar))
                .mapToInt(Magazin::getChirie)
                .sum();

        System.out.println("Chirie totala proprietar: " + chirie + "\n");
    }
}
