package garage.vehicules.moteurs;

import static garage.vehicules.moteurs.TypeMoteur.ESSENCE;

public class MoteurEssence extends Moteur {

    public MoteurEssence(String cylindre, double prix) {
        this.cylindre = cylindre;
        this.prix = prix;
    }

    double getPrix() {
        return this.prix;
    }

    String getCylindre() {
        return this.cylindre;
    }

    TypeMoteur getTypeMoteur() {
        return this.type = ESSENCE;
    }

}
