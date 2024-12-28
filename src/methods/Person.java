package methods;

public class Person {
    private final String name;
    private final String surname;
    private final int age;
    private final String gender;

    public Person(String name, String surname, int age, boolean gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender ? "Male" : "Female";
    }

    @Override
    public String toString() {
        return "Hi, I am " + name + " " + surname + ", a " + age + "-year-old " + gender + ".";
    }

}

