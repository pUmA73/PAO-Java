package classes;

import interfaces.CalculChirie;

public class Magazin {
    private String id;
    private String numeMagazin;
    private Proprietar proprietar;
    private int venit;
    private int suprafata;
    private int chirie;

    public Magazin(String id, String numeMagazin, Proprietar proprietar, int venit, int suprafata) {
        this.id = id;
        this.numeMagazin = numeMagazin;
        this.proprietar = proprietar;
        this.venit = venit;
        this.suprafata = suprafata;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNumeMagazin(String numeMagazin) {
        this.numeMagazin = numeMagazin;
    }

    public void setProprietar(Proprietar proprietar) {
        this.proprietar = proprietar;
    }

    public void setVenit(int venit) {
        this.venit = venit;
    }

    public void setSuprafata(int suprafata) {
        this.suprafata = suprafata;
    }

    public int setChirie(CalculChirie func) {
        this.chirie = func.fChirie(suprafata);
        return this.chirie;
    }

    public String getId() {
        return id;
    }

    public String getNumeMagazin() {
        return numeMagazin;
    }

    public Proprietar getProprietar() {
        return proprietar;
    }

    public int getVenit() {
        return venit;
    }

    public int getSuprafata() {
        return suprafata;
    }

    public int getChirie() {
        return chirie;
    }

    @Override
    public String toString() {
        return "Magazin{" +
                "numeMAgazin = " + numeMagazin + "\n" +
                "proprietar = " + proprietar + "\n" +
                "suprafata = " + suprafata + "\n" +
                "chirie = " + chirie + "\n" +
                "}";
    }
}
