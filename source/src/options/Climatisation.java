package options;

public class Climatisation implements Option{

    public double getPrix() {
        return 347.3;
    }

    public String toString() {
        return "Climatisation ("+this.getPrix()+"€)";
    }
}
