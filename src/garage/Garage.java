package garage;


import garage.vehicules.Vehicule;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Garage implements Serializable {

    private List<Vehicule> voitures = new ArrayList<>();

    public Garage() {
        super();

        try (
                FileInputStream fis = new FileInputStream("garage.txt");
                ObjectInputStream ois = new ObjectInputStream(fis)
        ) {
            voitures = (List<Vehicule>) ois.readObject();
        } catch (IOException e) {
            System.out.println("Aucune voiture sauvegardée !");
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    public String toString() {

        System.out.println("****************************\n*  Garage OpenClassrooms   *\n****************************");

        String str = "";

        for (Vehicule voiture : voitures) {
            str += " + Voiture " + voiture.toString() + " d'une valeure totale de " + voiture.getValeurTotale() + "€ \n";
        }
        return str;
    }


    public void addVoiture(Vehicule voiture) {
        voitures.add(voiture);

        try (
                FileOutputStream fos = new FileOutputStream("garage.txt");
                BufferedOutputStream bos = new BufferedOutputStream(fos);
                ObjectOutputStream oos = new ObjectOutputStream(bos)
        ) {
            oos.writeObject(voitures);
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}