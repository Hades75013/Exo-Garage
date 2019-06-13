package garage.vehicules.options;

import java.io.Serializable;

public class BarreDeToit implements Option, Serializable {

    public double getPrix() {
        return 29.9;
    }

    public String toString() {
        return "Barre de toit (" + this.getPrix() + "€)";
    }
}

