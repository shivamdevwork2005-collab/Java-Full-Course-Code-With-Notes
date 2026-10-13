// Static keyword

public class Demo3 {
    public static void main(String[] args) {
        Student s1 = new Student("Aditya", 28, 101);
        Student s2 = new Student("Rohit", 28, 102);

        //Student.college = "IIT Guwahati";

        System.out.println(s1.name + " , " + s1.age + " , " + s1.rollNumber + " , " + Student.college);
        System.out.println(s2.name + " , " + s2.age + " , " + s2.rollNumber + " , " + Student.college);
    }
}

class Student {
    String name;
    int age;
    int rollNumber;
    static String college = "IIT Guwahati";
    static int grade;

    Student(String name, int age, int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    // Static block;
    static {
        grade = 8;
    }
}
