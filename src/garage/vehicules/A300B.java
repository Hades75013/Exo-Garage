package garage.vehicules;

import static garage.vehicules.Marque.PIGEOT;

public class A300B extends Vehicule {

    public double getPrix() {
        return 28457.0;
    }

    public String getNom() {
        return "A300B";
    }

    public Marque getMarque() {
        return this.nomMarque = PIGEOT;
    }
}

