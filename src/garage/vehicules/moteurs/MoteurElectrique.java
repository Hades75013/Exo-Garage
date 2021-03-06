package garage.vehicules.moteurs;

import static garage.vehicules.moteurs.TypeMoteur.ELECTRIQUE;

public class MoteurElectrique extends Moteur {


    public MoteurElectrique(String cylindre, double prix) {
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
        return this.type = ELECTRIQUE;
    }


}
