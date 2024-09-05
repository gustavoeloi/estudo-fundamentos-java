package entities;

public class Student {
    private String name;
    private double firstGrade;
    private double secondGrade;
    private double thirdGrade;

    public String finalResult() {

        if(sumOfGrades() >= 60) {
            return "\nPASS";
        } else {
            return "\nFAILED " +
                    "\nMISSING " + (60 - sumOfGrades())
                    + " POINTS";
        }
    }


    public double sumOfGrades() {
        return firstGrade + secondGrade + thirdGrade;
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

    public double getThirdGrade() {
        return thirdGrade;
    }

    public void setThirdGrade(double thirdGrade) {
        this.thirdGrade = thirdGrade;
    }

    @Override
    public String toString() {
        return "Final Grade = " + String.format("%.2f",  sumOfGrades()) +
                finalResult();
    }
}
