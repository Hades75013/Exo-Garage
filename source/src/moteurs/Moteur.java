package moteurs;

import enumerations.TypeMoteur;

public abstract class Moteur {

    protected TypeMoteur type;
    protected String cylindre;
    protected double prix;

    Moteur(){}

    abstract double getPrix();

    abstract String getCylindre();

    abstract TypeMoteur getTypeMoteur();

    public String toString(){
        return "Moteur "+this.getTypeMoteur()+" "+this.getCylindre();
    }
}
