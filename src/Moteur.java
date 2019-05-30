abstract class Moteur extends Vehicule {

    public TypeMoteur type;
    public String cylindre;
    public double prix;

    public Moteur (){}

    public void Moteur(String cylindre, double prix) {
        this.cylindre = cylindre;
        this.prix = prix;
    }

    public String toString() {
        String str = "";
        return str;
    }

    public double getPrix(){
        return prix;
    }

}
