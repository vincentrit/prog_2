package Appendix_G;

public class CarBrandDemo {
    public static void main(String[] args){

        for (CarBrand value: CarBrand.values()){
            System.out.println(value);
        }
    }

    public static CarBrand fromName(final String name){
        switch (name.toUpperCase()) {
            case "MERCEDES": return CarBrand.MERCEDES;
            case "BMW": return CarBrand.BMW;
            case "FORD": return CarBrand.FORD;
            case "TOYOTA": return CarBrand.TOYOTA;
            case "RENAULT": return CarBrand.RENAULT;
        }
        return null;
    }


    public static void printName(final CarBrand carBrand){
        System.out.println(carBrand);
    }

}
