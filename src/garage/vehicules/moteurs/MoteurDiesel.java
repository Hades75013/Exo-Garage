package garage.vehicules.moteurs;

public class MoteurDiesel extends Moteur {

    public MoteurDiesel(String cylindre, double prix) {
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
        return this.type = TypeMoteur.DIESEL;
    }
}