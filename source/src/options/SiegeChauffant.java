package options;

public class SiegeChauffant implements Option{

    public double getPrix() {
        return 562.9;
    }

    public String toString() {
        return "Siège chauffant ("+this.getPrix()+"€)";
    }
}
