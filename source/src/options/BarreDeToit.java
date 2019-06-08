package options;

public class BarreDeToit implements Option {

    public double getPrix() {
        return 29.9;
    }

    public String toString() {
        return "Barre de toit ("+this.getPrix()+"€)";
    }
}

