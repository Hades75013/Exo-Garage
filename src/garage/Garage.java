package garage;


import garage.vehicules.Vehicule;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

public class Garage implements Serializable {

    private List<Vehicule> voitures = new ArrayList<>();

    public Garage() {
        super();

        try {
            FileInputStream fis = new FileInputStream("garage.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            voitures = (List<Vehicule>) ois.readObject();
        } catch (IOException e) {
            out.println("Aucune voiture sauvegardée !");
        } catch (NullPointerException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String toString() {

        out.println("****************************\n*  Garage OpenClassrooms   *\n****************************");

        StringBuilder str = new StringBuilder();

        for (Vehicule voiture : voitures) {
            str.append(" + Voiture ").append(voiture.toString()).append(" d'une valeure totale de ").append(voiture.getValeurTotale()).append("€ \n");
        }
        return str.toString();
    }

    public void addVoiture(Vehicule voiture) {
        voitures.add(voiture);

        try {
            FileOutputStream fos = new FileOutputStream("garage.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ObjectOutputStream oos = new ObjectOutputStream(bos);

            oos.writeObject(voitures);
        } catch (NullPointerException | IOException e) {
            e.printStackTrace();
        }
    }
}
