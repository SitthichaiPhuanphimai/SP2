import java.util.ArrayList;

public class FleetOfCars {

    ArrayList<Car> fleetOfCars = new ArrayList<>();

    public void addCar(Car car){

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