public class Car extends Vehicle {
    private String fuelType;
    private int horsePower;
    private String engine;
    private String driveType;

    Car() {
        super();
    }


    Car(String mark, String model, String country, int year, int seats) {
        super(mark, model, country, year, seats);
    }

    @Override
    protected void Print() {
        super.Print();
        System.out.println("fuelType: " + getFuelType());
        System.out.println("HorsePower: " + getHorsePower());
        System.out.println("Engine: " + getEngine());
        System.out.println("driveType: " + getDriveType());
    }

    @Override
    public String fieldsInString() {
        return super.fieldsInString() +","+ getFuelType() + "," + getHorsePower() + "," + getEngine() + "," + getDriveType();
    }


    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getDriveType() {
        return driveType;
    }

    public void setDriveType(String driveType) {
        this.driveType = driveType;
    }
}
