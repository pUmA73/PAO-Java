package classes;

public class Proprietar {
    private String nume;
    private String prenume;
    private int varsta;

    public Proprietar(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        return "Proprietar{" +
                "nume = " + nume + '\'' +
                ", prenume = " + prenume + '\'' +
                "}";
    }
}
