public class Human {
    private String firstName;
    private String lastName;
    private int year;
    private char gender;
    private boolean IsArmenian;

    public int sum(int x, int y) {
        return x + y;
    }

    public void printFullName() {

        System.out.println(firstName + " " + lastName);
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

    public boolean isArmenian() {
        return IsArmenian;
    }

    public void setArmenian(boolean armenian) {
        IsArmenian = armenian;
    }
}
