package methods;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Student extends Person {
    private final int studentID;
    private final List<Integer> grades;

    public Student(String name, String surname, int age, boolean gender) {
        super(name, surname, age, gender);
        this.studentID = new Random().nextInt(10000);
        this.grades = new ArrayList<>();
    }


    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getAverageGrade() {
        int total = 0;
        for(Integer grade : grades) {
            total += grade;
        }
        double average;
        average = (int) (total / (double) grades.size());
        return average;
    }

    public double calculateGPA() {
            if ((getAverageGrade()<=100) & (getAverageGrade()>=95)) {
                return 4.0;
            }
            if ((getAverageGrade()<95) & (getAverageGrade()>=90)) {
                return 3.67;
            }
            if ((getAverageGrade()<=89) & (getAverageGrade()>=85)) {
                return 3.33;
            }
            if ((getAverageGrade()<=84) & (getAverageGrade()>=80)) {
                return 3.0;
            }
            if ((getAverageGrade()<=79) & (getAverageGrade()>=75)) {
                return 2.67;
            }
            if ((getAverageGrade()<=74) & (getAverageGrade()>=70)) {
                return 2.33;
            }
            if ((getAverageGrade()<=69) & (getAverageGrade()>=65)) {
                return 2.0;
            }
            if (getAverageGrade()<65) {
                return 1.0;
            }
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + " I am a student with ID " + studentID + ".";
    }
}

