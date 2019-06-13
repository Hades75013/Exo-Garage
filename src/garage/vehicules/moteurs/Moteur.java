package garage.vehicules.moteurs;

import java.io.Serializable;

public abstract class Moteur implements Serializable {

    TypeMoteur type;
    String cylindre;
    double prix;

    Moteur() {
    }

    abstract double getPrix();

    abstract String getCylindre();

    abstract TypeMoteur getTypeMoteur();

    public String toString() {
        return "Moteur " + this.getTypeMoteur() + " " + this.getCylindre();
    }
}
