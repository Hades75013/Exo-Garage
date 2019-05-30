package moteurs;

import enumerations.TypeMoteur;

public class Moteur {

    private TypeMoteur type;
    private String cylindre;
    private double prix;

    public void Moteur (String cylindre, double prix){
        this.cylindre=cylindre;
        this.prix=prix;
    }

    public void Moteur (TypeMoteur type,String cylindre, double prix){
        this.type=type;
        this.cylindre=cylindre;
        this.prix=prix;
    }

    public String toString(){
        String str = "";
        return str;
    }

    public double getPrix(){
        return prix;
    }
}
