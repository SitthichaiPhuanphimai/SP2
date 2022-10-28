public class ElectricCar extends ACar{

    int batteryCapacity;
    int maxRange;

    String registrationNumber;
    String make;
    String model;
    int numberOfDoors;



    public ElectricCar(int batteryCapacity, int maxRange,String make, String model, String registrationNumber, int numberOfDoors) {
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
        this.make = make;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.numberOfDoors = numberOfDoors;

    }

    int fee;
    @Override

    public int getRegistrationFee() {

         double kmPrLitre = 100/ (getWhPrKm()/91.25) ;

        if(kmPrLitre > 20 && kmPrLitre <= 50)
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

    public int getBatteryCapacityKWh() {
        return batteryCapacity;
    }

    public int getMaxRangeKm() {
        return maxRange;
    }

    public int getWhPrKm() {

        return maxRange/batteryCapacity;
    }

    @Override
    public String toString() {
        return '\n'+ make+" "+ model + ", "+
                "Battery Capacity:"+ batteryCapacity+", "+
                "Max Range:"+maxRange+", "+
                "Number of doors:"+numberOfDoors+", "+
                "Registration number:"+registrationNumber+'\n';

    }
}
