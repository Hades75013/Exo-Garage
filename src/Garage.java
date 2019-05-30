import java.io.Serializable;
import java.util.List;

public class Garage implements Serializable {

    protected List<Vehicule> vehicule;

    public void toString() {
        for (Vehicule voiture : vehicule) {
            System.out.printLn(voiture.getPrix() + voiture.getNomMarque());
        }
    }

    public void addVehicule(Vehicule vehicule) {
        vehicule.add(vehicule);
    }


}