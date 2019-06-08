package enumerations;


public enum TypeMoteur {

    DIESEL("DIESEL"),
    ESSENCE("ESSENCE"),
    ELECTRIQUE("ELECTRIQUE"),
    HYBRIDE("HYBRIDE");


    public String name;

    TypeMoteur (String name){
        this.name=name;
    }

}
