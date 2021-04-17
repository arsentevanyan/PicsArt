package model;

public class Human {
    private String firstName;
    private String lastName;
    private int year;
    private char gender;
    private double weight;
    private boolean isArmenian;

    public Human(String firstName, String lastName, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isArmenian() {
        return isArmenian;
    }

    public void setArmenian(boolean armenian) {
        isArmenian = armenian;
    }

    public void fullName() {
        System.out.println(firstName + " " + lastName);
    }

    public void printInfo() {
        System.out.println("------------------------------------------------");
        System.out.printf("Name: %s %s\n", firstName, lastName);
        System.out.println("Year: " + year);
        System.out.println("Weught: " + weight);
        System.out.println("Gender: " + (gender == 'm' ? "Male:" : "Famale"));
        System.out.println("Is Armenian: " + (isArmenian ? "Yes" : "No"));
        System.out.println("------------------------------------------------");
    }
}
