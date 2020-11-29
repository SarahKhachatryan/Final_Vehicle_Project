public class Vehicle {
    private String mark;
    private String model;
    private String country;
    private int year;
    private int seats;

    Vehicle()
    {

    }

    Vehicle(String mark, String model, String country, int year, int seats) {
        setMark(mark);
        setModel(model);
        setCountry(country);
        setYear(year);
        setSeats(seats);
    }

    protected void Print()
    {
        System.out.println("Mark: "+getMark());
        System.out.println("Model: "+getModel());
        System.out.println("Country: "+getCountry());
        System.out.println("Year: "+getYear());
        System.out.println("Seats:" + getSeats());

    }


    public String fieldsInString ()
 {
     return getMark()+ "," + getModel()+ "," +getCountry() + ","+ getYear()+ ","+
             getSeats();
 }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        if (mark != null && mark.length() != 0)
            this.mark = mark;
        else
            System.out.println("Not valid mark!!");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null && model.length() != 0)
            this.model = model;
        else System.out.println("Not valid model!!");
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country != null && country.length() != 0)
            this.country = country;
        else System.out.println("Not valid country!!");
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1950 && year <= 2020)
            this.year = year;
        else System.out.println("Not valid year!!");
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        if (seats > 0)
            this.seats= seats;
        else System.out.println("Enter valid value!!");
    }
}
