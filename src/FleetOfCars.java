import java.util.ArrayList;

public class FleetOfCars {

    ArrayList<Car> fleetOfCars = new ArrayList<Car>();

    public void addCar(ACar car){

        fleetOfCars.add(car);
    }

    int totalSum;

    public int calculateTotal(FleetOfCars carArray){

        for (Car car:fleetOfCars) {

            totalSum += car.getRegistrationFee();

        }

        return totalSum;
    }



    @Override
    public String toString() {

        return "Fleet of Cars: " + fleetOfCars;

    }
}