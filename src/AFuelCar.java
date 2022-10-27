public abstract class AFuelCar extends ACar {

    int kmPrLitre;
    String registrationNumber;
    String make;
    String model;
    int numberOfDoors;


    public AFuelCar(int kmPrLitre,String registrationNumber, String make, String model, int numberOfDoors) {
        this.kmPrLitre = kmPrLitre;
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }

    abstract String getFuelType();

    public int kmPrLitre() {

        return kmPrLitre;
    }

    @Override
    public String toString() {
        return make+" "+ model +", "+
                "KmPrLitre:"+kmPrLitre+", "+
                "Number of doors:"+numberOfDoors+", "+
                "Registration number:"+registrationNumber;

    }
}
