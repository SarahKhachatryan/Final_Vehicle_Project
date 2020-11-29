public class RaceCar extends Car implements Functions {
    private int acceleration;
    private int maxSpeed;

    RaceCar(String mark, String model, String country, int year, int seats) {
        super(mark, model, country, year, seats);
    }

    RaceCar() {
        super();
    }

    @Override
    public String fieldsInString() {
        return super.fieldsInString() + "," + getAcceleration() + "," + getMaxSpeed();
    }

    public void setFromArray(String[] arr) {
        setMark(arr[0]);
        setModel(arr[1]);
        setCountry(arr[2]);
        setYear(Integer.parseInt(arr[3]));
        setSeats(Integer.parseInt(arr[4]));
        setFuelType(arr[5]);
        setHorsePower(Integer.parseInt(arr[6]));
        setEngine(arr[7]);
        setDriveType(arr[8]);
        setAcceleration(Integer.parseInt(arr[9]));
        setMaxSpeed(Integer.parseInt(arr[10]));
    }

    @Override
    protected void Print() {
        super.Print();
        System.out.println("Acceleration: " + getAcceleration());
        System.out.println("Maximum Speed: " + getMaxSpeed());
    }

    public int getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(int acceleration) {
        if (acceleration > 0)
            this.acceleration = acceleration;
        else
            System.out.println("Enter valid value!!");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed >= 300)
            this.maxSpeed = maxSpeed;
        else
            System.out.println("Not a race car!!");
    }

    @Override
    public void inspection() {
        System.out.println("Needs to be inspected before every Race!!");
    }

    @Override
    public void inspectionCenters() {
        System.out.println("You can inspect your Race Car in Apex Inspection Center.");
    }

    @Override
    public void storyOfInvention() {
        System.out.println("Early history. Automobile racing began soon after the invention of the gasoline- (petrol-) " +
                "fueled internal-combustion engine in the 1880s. ... In 1895 the first true race was held, from Paris" +
                " to Bordeaux," +
                " France, and back, a distance of 1,178 km. The winner made an average speed of 24.15 kph.");
    }
}
