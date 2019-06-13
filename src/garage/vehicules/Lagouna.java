package garage.vehicules;

import static garage.vehicules.Marque.RENO;

public class Lagouna extends Vehicule {

    public double getPrix() {
        return 23123.0;
    }

    public String getNom() {
        return "Lagouna";
    }

    public Marque getMarque() {
        return this.nomMarque = RENO;
    }

}
