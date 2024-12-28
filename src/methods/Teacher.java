package methods;

public class Teacher extends Person {
    private final String subject;
    public int yearsOfExperience;
    private final int salary;
    private int newSalary;

    public Teacher(String name, String surname, int age, boolean gender, String subject, int experience, int salary) {
        super(name, surname, age, gender);
        this.subject = subject;
        this.yearsOfExperience = experience;
        this.salary = salary;
    }

    public double giveRaise(){
        if (yearsOfExperience>10) newSalary = (salary * 10) / 100;
        return newSalary;
    }

    @Override
    public String toString() {
        return super.toString() + " I teach " + subject + ".";
    }
}

