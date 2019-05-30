public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        System.out.println(garage);

        Vehicule lag1 = new Lagouna();

        lag1.addOption(new GPS());
        lag1.addOption(new SiegeChauffant());
        lag1.addOption(new VitreElectrique());
        garage.addVoiture(lag1);

        Vehicule A300B_2 = new A300B();

        A300B_2.addOption(new Climatisation());
        A300B_2.addOption(new BarreDeToit());
        A300B_2.addOption(new SiegeChauffant());
        garage.addVoiture(A300B_2);

        Vehicule d4_1 = new D4();

        d4_1.addOption(new BarreDeToit());
        d4_1.addOption(new Climatisation());
        d4_1.addOption(new GPS());
        garage.addVoiture(d4_1);

        Vehicule lag2 = new Lagouna();
        garage.addVoiture(lag2);

        Vehicule A300B_1 = new A300B();

        A300B_1.addOption(new VitreElectrique());
        A300B_1.addOption(new BarreDeToit());
        garage.addVoiture(A300B_1);

        Vehicule d4_2 = new D4();

        d4_2.addOption(new SiegeChauffant());
        d4_2.addOption(new BarreDeToit());
        d4_2.addOption(new Climatisation());
        d4_2.addOption(new GPS());
        d4_2.addOption(new VitreElectrique());
        garage.addVoiture(d4_2);
    }
}
