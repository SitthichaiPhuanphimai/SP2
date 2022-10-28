public class Main {

    public static void main(String[] args) {

        FleetOfCars allCars = new FleetOfCars();

        Car audi = new GasolinCar(8,"EW213", "Audi", "Q5",4);
        Car ford = new DieselCar(17,"XY105","Ford", "Fiesta",4,true);
        Car volvo = new ElectricCar(2,450,"Volvo", "XC60", "AQ547",4);
        Car toyota = new DieselCar(33,"LT9384","Toyota","Avensis",5,false);

        allCars.addCar(audi);
        allCars.addCar(ford);
        allCars.addCar(volvo);
        allCars.addCar(toyota);

        System.out.println(allCars.toString());
        System.out.println(allCars.calculateTotal(allCars));




    }
}
