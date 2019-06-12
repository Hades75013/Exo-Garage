package garage.vehicules.options;

import java.io.Serializable;

public class VitreElectrique implements Option, Serializable {

    public double getPrix() {
        return 212.35;
    }

    public String toString() {
        return "Vitre electrique ("+this.getPrix()+"€)";
    }
}
