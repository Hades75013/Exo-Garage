package moteurs;

public class MoteurEssence extends Moteur{

    public String cylindre;
    public double prix;

    public MoteurEssence(String cylindre, double prix) {
        this.cylindre=cylindre;
        this.prix=prix;
    }
}
