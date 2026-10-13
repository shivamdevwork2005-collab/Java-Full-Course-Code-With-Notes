public class Demo {
    public static void main(String[] args) {
        
       Student s1 = new Student();
       s1.name = "Aditya";
       s1.age = 28;
       s1.rollNumber = 101;
       s1.college = "IIT Guwahati"; 

       // Constructors --> To create an Object

       System.out.println(s1.name);
       System.out.println(s1.age);
       System.out.println(s1.rollNumber);
       System.out.println(s1.college);

        // int x; // local variable --> NO default values
        // System.out.println(x);

    }
}

/*
Integer --> 0
floating --> 0.0
Boolean --> false
String --> null (nothing)

*/

class Student {
    String name; // information/data/characteristics --> instance variables
    int age; 
    int rollNumber;
    String college;

    void markAttendance() { // behaviours --> functions --> instance methods
        System.out.println("Attendance marked for student " + name);
    }
}
