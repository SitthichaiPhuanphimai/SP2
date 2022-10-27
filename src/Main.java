public class Main {

    public static void main(String[] args) {

        FleetOfCars fleetOfCars = new FleetOfCars();

        ACar audi = new GasolinCar(8,"EW213", "Audi", "Q5",4);
        ACar ford = new DieselCar(17,"XY105","Ford", "Fiesta",4,true);
        ACar volvo = new ElectricCar(2,450,"Volvo", "XC60", "AQ547",4);
        ACar toyota = new DieselCar(19,"LT9384","Toyota","Avensis",5,false);

        fleetOfCars.addCar(audi);
        fleetOfCars.addCar(ford);
        fleetOfCars.addCar(volvo);
        fleetOfCars.addCar(toyota);

        System.out.println(fleetOfCars.toString());
        System.out.println(fleetOfCars.calculateTotal(fleetOfCars));




    }
}
