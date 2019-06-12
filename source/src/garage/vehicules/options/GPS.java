package garage.vehicules.options;

import java.io.Serializable;

public class GPS implements Option, Serializable {

    public double getPrix() {
        return 113.5;
    }

    public String toString() {
        return "GPS ("+this.getPrix()+"€)";
    }
}
