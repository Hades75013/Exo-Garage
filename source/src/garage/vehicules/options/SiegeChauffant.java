package garage.vehicules.options;

import java.io.Serializable;

public class SiegeChauffant implements Option, Serializable {

    public double getPrix() {
        return 562.9;
    }

    public String toString() {
        return "Siège chauffant ("+this.getPrix()+"€)";
    }
}
