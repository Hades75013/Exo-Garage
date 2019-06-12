package garage.vehicules;

import garage.vehicules.moteurs.*;
import garage.vehicules.options.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;



public class Vehicule implements Serializable {

    protected double prix;
    protected String nom;
    private List<Option> options;
    protected Marque nomMarque;
    private Moteur moteur;


    public Vehicule() {
        options = new ArrayList<>();
    }

    public double getValeurTotale() {

        double valeurTotale = this.getPrix();
        for(Option uneoption : options){
            valeurTotale+=uneoption.getPrix();
        }
        return valeurTotale;
    }

    public String toString() {
        return " "+this.getMarque()+" : "+this.getNom()+" "+this.getMoteur()+" ("+this.getPrix()+"€) "+this.getOption();
    }

    public void addOption(Option option) {
        options.add(option);
    }

    public void setMoteur(Moteur moteur) {
        this.moteur = moteur;
    }

    private Moteur getMoteur() {
        return moteur;
    }

    public double getPrix() {
        return prix;
    }

    private List<Option> getOption() {
        return options;
    }

    public Marque getMarque() {
        return nomMarque;
    }

    public String getNom() {
        return nom;
    }
}
