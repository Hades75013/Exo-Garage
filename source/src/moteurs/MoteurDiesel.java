package moteurs;

public class MoteurDiesel extends Moteur{

    public String cylindre;
    public double prix;

    public MoteurDiesel(String cylindre, double prix) {
        this.cylindre=cylindre;
        this.prix=prix;
    }
}
