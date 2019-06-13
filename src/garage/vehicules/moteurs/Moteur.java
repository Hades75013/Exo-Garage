package garage.vehicules.moteurs;

import java.io.Serializable;

public abstract class Moteur implements Serializable {

    protected TypeMoteur type;
    protected String cylindre;
    protected double prix;

    Moteur() {
    }

    abstract double getPrix();

    abstract String getCylindre();

    abstract TypeMoteur getTypeMoteur();

    public String toString() {
        return "Moteur " + this.getTypeMoteur() + " " + this.getCylindre();
    }
}
