package garage;




import vehicules.Vehicule;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Garage implements Serializable {

    private List<Vehicule> voitures;

    public Garage (){
        voitures = new ArrayList<>();
        System.out.println("Aucune voiture sauvegardée !");
        System.out.println("****************************\n*  Garage OpenClassrooms   *\n****************************");
    }



    public String toString() {
        String str="";

        for (Vehicule voiture : voitures) {
            str += " + Voiture "+ voiture.toString()+ " d'une valeure totale de "+ voiture.getValeurTotale()+ "€ \n";
        }
        return str;
    }

    public void addVoiture (Vehicule voiture) {
        voitures.add(voiture);
        voitures.toString();
    }



}
