public class DieselCar extends AFuelCar {

    boolean particleFilter;

    public DieselCar(int kmPrLitre, String registrationNumber, String make, String model, int numberOfDoors, boolean particleFilter) {
        super(kmPrLitre, registrationNumber, make, model, numberOfDoors);
        this.particleFilter = particleFilter;

    }

    @Override
    String getFuelType() {
        return "Diesel";
    }

    int fee;

    @Override
    public int getRegistrationFee() {

        if (kmPrLitre > 20 && kmPrLitre <= 50)
            fee = 130;

        if (kmPrLitre > 15 && kmPrLitre <= 20)
            fee = 1390;

        if (kmPrLitre > 10 && kmPrLitre <= 15)
            fee = 1850;

        if (kmPrLitre > 5 && kmPrLitre <= 10)
            fee = 2770;

        if (kmPrLitre < 5)
            fee = 15260;

        if (!particleFilter) {
            return fee + 1000;
        }

        return fee;
    }

    public boolean hasParticleFilter() {
        return particleFilter;
    }

    @Override
    public String toString() {
        return make + " " + model + ", " +
                "KmPrLitre:" + kmPrLitre + ", " +
                "Number of doors:" + numberOfDoors + ", " +
                "Registration number:" + registrationNumber+'\n';

    }
}
