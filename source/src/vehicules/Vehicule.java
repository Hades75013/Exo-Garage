package vehicules;

import enumerations.Marque;
import moteurs.Moteur;
import options.Option;

import java.util.ArrayList;
import java.util.List;

public class Vehicule {

    private double prix;
    private String nom;
    private List<Option> options;
    private Marque nomMarque;
    private Moteur moteur;

    public Vehicule() {
        options = new ArrayList<>();
    }


    public String toString() {
        return "";
    }

    public void addOption(Option option) {
        options.add(option);
    }

    public void setMoteur(Moteur mot) {
        moteur = mot;
    }

    public Moteur getMoteur() {
        return moteur;
    }

    public double getPrix() {
        return prix;
    }

    public List<Option> getOption() {
        return options;
    }

    public Marque getMarque() {
        return nomMarque;
    }

    public String getNom() {
        return nom;
    }
}
