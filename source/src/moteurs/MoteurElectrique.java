package moteurs;

public class MoteurElectrique extends Moteur{

    private String cylindre;
    private double prix;

    public MoteurElectrique(String cylindre, double prix) {
        this.cylindre=cylindre;
        this.prix=prix;
    }
}
