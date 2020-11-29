public class ElectricCar extends Car {


    private String batteries;
    private int workHours;
    ElectricCar()
    {
        super();

    }

    ElectricCar(String mark, String model, String country, int year, int seats) {
        super(mark, model, country, year, seats);
        setFuelType("Electric");
    }
    public void setFromArray(String[] arr)
    {
        setMark(arr[0]);
        setModel(arr[1]);
        setCountry(arr[2]);
        setYear(Integer.parseInt(arr[3]));
        setSeats(Integer.parseInt(arr[4]));
        setFuelType(arr[5]);
        setHorsePower(Integer.parseInt(arr[6]));
        setEngine(arr[7]);
        setDriveType(arr[8]);
        setBatteries(arr[9]);
        setWorkHours(Integer.parseInt(arr[10]));
    }

    @Override
    public String fieldsInString() {
        return super.fieldsInString()+","+  getBatteries()+ ","+ getWorkHours();
    }

    @Override
    protected void Print() {
        super.Print();
        System.out.println("Batteries: " + getBatteries());
        System.out.println("Working Hours: "+getWorkHours());
    }

    public String getBatteries() {
        return batteries;
    }

    public void setBatteries(String batteries) {
        this.batteries = batteries;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }


}
