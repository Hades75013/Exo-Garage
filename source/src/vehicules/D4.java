package vehicules;

import enumerations.Marque;

public class D4 extends Vehicule {

    public double getPrix() {
        return 25147.0;
    }

    public String getNom() {
        return "D4";
    }

    public Marque getMarque() {
        return this.nomMarque= Marque.TROEN;
    }

}
