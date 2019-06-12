package garage.vehicules.options;

import java.io.Serializable;

public class Climatisation implements Option, Serializable {

    public double getPrix() {
        return 347.3;
    }

    public String toString() {
        return "Climatisation ("+this.getPrix()+"€)";
    }
}
