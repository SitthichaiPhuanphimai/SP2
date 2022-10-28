public abstract class ACar implements Car{

    String registrationNumber;
    String make;
    String model;
    int numberOfDoors;



    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public String toString() {
        return '\n'+make+ " "+ model+ ", "+
                "Number of doors:"+numberOfDoors+", "+
                "Registration number:"+registrationNumber;

    }
}
