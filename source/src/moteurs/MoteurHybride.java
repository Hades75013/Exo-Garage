package moteurs;

public class MoteurHybride extends Moteur {

    public String cylindre;
    public double prix;

    public MoteurHybride(String cylindre, double prix) {
        this.cylindre = cylindre;
        this.prix = prix;
    }
}
