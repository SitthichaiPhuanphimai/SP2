public class GasolinCar extends AFuelCar {




    public GasolinCar(int kmPrLitre, String registrationNumber, String make, String model, int numberOfDoors) {
        super(kmPrLitre, registrationNumber, make, model, numberOfDoors);



    }



    @Override
    String getFuelType() {
        return "gasolin";
    }



    int fee;
    @Override
    public int getRegistrationFee() {


        if(kmPrLitre > 20 && kmPrLitre < 50)
            fee = 330;

        if(kmPrLitre > 15 && kmPrLitre <=20)
            fee = 1050;

        if(kmPrLitre > 10 && kmPrLitre <=15)
            fee = 2340;

        if(kmPrLitre >5 && kmPrLitre <=10)
            fee = 5500;

        if(kmPrLitre < 5)
            fee = 10470;

        return fee;
    }



    @Override
    public String toString() {
        return '\n'+ make+" "+model+", "+
                "Kilometer pr. litre:" + kmPrLitre+", "+
                "Number of doors:"+ numberOfDoors +", "+
                "Registration Number:" + registrationNumber +
                '\n';

    }
}
