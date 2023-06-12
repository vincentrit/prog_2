package Appendix_G;

public enum CarBrand {
    MERCEDES("Mercedes-AG", "Germany"),
    BMW("BMW-AG", "Germany"),
    FORD("GM", "USA"),
    TOYOTA("Toyota-AG", "Japan"),
    RENAULT("VW", "France");

    private String companyName;
    private String country;

    CarBrand(String companyName, String country){
        this.companyName = companyName;
        this.country = country;
    }

    @Override
    public String toString(){
        return "Marke: " + this.name() + " Hersteller: " + this.companyName + " Country: " + this.country;
    }
}
