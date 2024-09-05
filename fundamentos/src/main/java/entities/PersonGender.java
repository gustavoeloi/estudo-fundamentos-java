package entities;

public class PersonGender {
    private double height;
    private String gender;

    public PersonGender(double height, String gender) {
        this.height = height;
        this.gender = gender.toUpperCase();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
