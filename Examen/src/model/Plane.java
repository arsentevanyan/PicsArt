package model;

public class Plane {

    private String model = "boing";
    private String country = "USA";
    private int year = 2015;
    private double hours = 1000;
    private char military = 'n';
    private double weight = 150000;
    private int topSpeed = 1000;
    private int seats = 50;
    private double cost = 100000.5;


    public Plane(String model, String country, int year, double hours, char military, double weight, int topSpeed,
                 int seats, double cost) {
        this.model = model;
        this.country = country;
        this.year = year;
        this.hours = hours;
        this.military = military;
        this.weight = weight;
        this.topSpeed = topSpeed;
        this.seats = seats;
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public char getMilitary() {
        return military;
    }

    public void setMilitary(char military) {
        this.military = military;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void printInfo() {
        System.out.println("--------------");
        System.out.println("Model: " + model);
        System.out.println("Country: " + country);
        System.out.println("Year: " + year);
        System.out.println("Hours: " + hours);
        System.out.println("Military: " + (military == 'y' ? "Yes" : "No"));
        System.out.println("Weight: "+ weight );
        System.out.println("Top speed: "+ topSpeed );
        System.out.println("Seats: "+ seats );
        System.out.println("Cost: "+ cost );

        System.out.println("--------------");
    }
}
