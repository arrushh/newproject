import methods.School;
import methods.Student;
import methods.Teacher;

public  class Main {
    public static void main(String[] args) {
        Student harry = new Student("Harry", "Potter", 21, true);
        harry.addGrade(78);
        harry.addGrade(89);
        harry.addGrade(99);
        harry.addGrade(51);

        Student ron = new Student("Ron", "Weasley", 20, true);
        ron.addGrade(78);
        ron.addGrade(89);
        ron.addGrade(75);
        ron.addGrade(63);
        ron.addGrade(82);

        Student hermione = new Student("Hermione", "Granger", 19, false);
        hermione.addGrade(100);
        hermione.addGrade(99);
        hermione.addGrade(95);
        hermione.addGrade(98);
        hermione.addGrade(100);
        hermione.addGrade(96);
        hermione.addGrade(97);

        Student luna = new Student("Luna", "Lovegood", 20, false);
        luna.addGrade(46);
        luna.addGrade(87);
        luna.addGrade(67);
        luna.addGrade(79);
        luna.addGrade(96);
        luna.addGrade(58);
        luna.addGrade(53);

        Student draco = new Student("Draco", "Malfoy", 21, true);
        draco.addGrade(45);
        draco.addGrade(0);
        draco.addGrade(9);
        draco.addGrade(51);
        draco.addGrade(43);
        draco.addGrade(58);
        draco.addGrade(100);



        Teacher snape = new Teacher("Severus", "Snape", 51, true,
                "math", 7,800000 );
        Teacher dumbledore = new Teacher("Albus", "Dumbledore",71, true,
                "philosophy", 25, 1100000);
        Teacher mcGonagall = new Teacher("Minerva", "McGonagall", 62, false,
                "Sociology", 17, 1100000);
        Teacher bellatrix = new Teacher("Bellatrix", "Lestrange", 35, false,
                "Programming", 3, 570000);
        Teacher sirius = new Teacher("Sirius", "Black", 49, true,
                "Physics", 9, 750000);

        School hogwarts = new School();
        hogwarts.addMember(harry);
        hogwarts.addMember(ron);
        hogwarts.addMember(hermione);
        hogwarts.addMember(luna);
        hogwarts.addMember(draco);
        hogwarts.addMember(snape);
        hogwarts.addMember(dumbledore);
        hogwarts.addMember(mcGonagall);
        hogwarts.addMember(bellatrix);
        hogwarts.addMember(sirius);

        System.out.println("Hermione's GPA: " + hermione.calculateGPA());
        System.out.println("Harry's GPA: " + harry.calculateGPA());
        System.out.println("Ron's GPA: " + ron.calculateGPA());
        System.out.println("Luna's GPA:" + luna.calculateGPA());
        System.out.println("Draco's GPA:" + draco.calculateGPA());
        System.out.println("\nGiving a raise to teachers with more than 10 years of experience:" +
                dumbledore.giveRaise());
        System.out.println("\nGiving a raise to teachers with more than 10 years of experience:" +
                mcGonagall.giveRaise());

        System.out.println("\nSchool members list:");
        System.out.println(hogwarts);
    }
}