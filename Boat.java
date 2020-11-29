public class Boat extends Vehicle {

    private boolean military;
    private int length;
    private int propeller;

    Boat(String mark, String model, String country, int year, int seats) {
        super(mark, model, country, year, seats);
    }

    Boat()
    {
        super();
    }

    @Override
    public String fieldsInString() {
        return super.fieldsInString()+","+isMilitary()+","+getLength()+","+getPropeller();
    }

    public void setFromArray(String[] arr)
    {
        setMark(arr[0]);
        setModel(arr[1]);
        setCountry(arr[2]);
        setYear(Integer.parseInt(arr[3]));
        setSeats(Integer.parseInt(arr[4]));
        setMilitary(Boolean.parseBoolean(arr[5]));
        setLength(Integer.parseInt(arr[6]));
        setPropeller(Integer.parseInt(arr[7]));
    }
    @Override
    protected void Print() {
        super.Print();
        System.out.println("Is Military: "+ isMilitary());
        System.out.println("Length: "+ getLength());
        System.out.println("Propellers number: "+ getPropeller());
    }

    public boolean isMilitary() {
        return military;
    }

    public void setMilitary(boolean military) {
        this.military = military;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getPropeller() {
        return propeller;
    }

    public void setPropeller(int propeller) {
        this.propeller = propeller;
    }


}
