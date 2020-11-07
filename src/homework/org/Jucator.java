package homework.org;


public class Jucator {

    private String nume;
    private int scor;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getScor() {
        return scor;
    }

    public void setScor(int scor) {
        this.scor = scor;
    }

    public Jucator(String nume) {
        this.nume = nume;
        this.scor = 0;

    }
    public Jucator(String nume, int scor) {
        this.nume = nume;
        this.scor = scor;

    }

    public String toString() {
        return "UNO: " + this.nume + " " + this.scor;


    }
}

