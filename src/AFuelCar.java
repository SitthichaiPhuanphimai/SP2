public abstract class AFuelCar extends ACar {

    int kmPrLitre;
    String registrationNumber;
    String make;
    String model;
    int numberOfDoors;


    public AFuelCar(int kmPrLitre, String registrationNumber, String make, String model, int numberOfDoors) {
        this.kmPrLitre = kmPrLitre;
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }

    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, String registrationNumber1, String make1, String model1, int numberOfDoors1) {

    }

    abstract String getFuelType();

    public int kmPrLitre() {

        return kmPrLitre;
    }

    @Override
    public String toString() {
        return '\n'+make+" "+ model +", "+
                "KmPrLitre:"+kmPrLitre+", "+
                "Number of doors:"+numberOfDoors+", "+
                "Registration number:"+registrationNumber;

    }
}
