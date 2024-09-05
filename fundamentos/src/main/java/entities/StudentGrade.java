package entities;

public class StudentGrade {

    private String name;
    private double firstGrade;
    private double secondGrade;

    public StudentGrade(String name, double firstGrade, double secondGrade) {
        this.name = name;
        this.firstGrade = firstGrade;
        this.secondGrade = secondGrade;
    }

    public double averageGrade() {
            return (this.firstGrade + this.secondGrade) / 2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFirstGrade() {
        return firstGrade;
    }

    public void setFirstGrade(double firstGrade) {
        this.firstGrade = firstGrade;
    }

    public double getSecondGrade() {
        return secondGrade;
    }

    public void setSecondGrade(double secondGrade) {
        this.secondGrade = secondGrade;
    }
}
