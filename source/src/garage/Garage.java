package garage;


import vehicules.Vehicule;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Garage implements Serializable {

    private List<Vehicule> voitures;

    public Garage (){
        voitures = new ArrayList<>();
        System.out.println("****************************\n*  Garage OpenClassrooms   *\n****************************");
    }

    public String toString() {
        String str="";

        for (Vehicule voiture : voitures){
            str +=" + Voiture " + voiture.getMarque() + " : " + voiture.getNom() + " Moteur " + voiture.getMoteur() + " ( " + voiture.getPrix();
        }
        return str;
    }

    public void addVoiture (Vehicule voiture) {
        voitures.add(voiture);
    }
}
