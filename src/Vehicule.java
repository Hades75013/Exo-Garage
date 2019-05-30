import java.util.List;

public class Vehicule extends Garage implements Option {

    private double prix;
    public String cylindre;
    private String nom;
    private List<Option> options;
    private Marque nomMarque;
    TypeMoteur moteur;



    public Vehicule (){}

    public double getPrix(){
        return prix;
    }

    public Marque getNomMarque(){
        return nomMarque;
    }

    public List<Option> getOptions(){
        return options;
    }

    public void addOption(Option opt){}

    public void setMoteur(TypeMoteur moteur,String cylindre, double prix) {
        this.cylindre = cylindre;
        this.prix = prix;
        this.moteur=moteur;
    }

    public String toString(){
        String str = "";
        return str;
    }


}

