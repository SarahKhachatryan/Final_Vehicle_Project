public class Plane extends Vehicle {
    private boolean military;
    private double wingspan;
    private int hours;
    Plane(String mark, String model, String country, int year, int seats) {
        super(mark, model, country, year, seats);
    }

    public void setFromArray(String[] arr)
    {
        setMark(arr[0]);
        setModel(arr[1]);
        setCountry(arr[2]);
        setYear(Integer.parseInt(arr[3]));
        setSeats(Integer.parseInt(arr[4]));
        setMilitary(Boolean.parseBoolean(arr[5]));
        setWingspan(Double.parseDouble(arr[6]));
        setHours(Integer.parseInt(arr[7]));
    }
    Plane()
    {
        super();
    }

    @Override
    public String fieldsInString() {
        return super.fieldsInString()+","+isMilitary()+","+getWingspan()+","+getHours();
    }

    @Override
    protected void Print() {
        super.Print();
        System.out.println("Is military: " +isMilitary());
        System.out.println("Wingspan: "+ getWingspan());
        System.out.println("Hours: " + getHours());
    }

    public boolean isMilitary() {
        return military;
    }

    public void setMilitary(boolean military) {
        this.military = military;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }


}
