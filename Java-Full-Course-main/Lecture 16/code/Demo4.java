//Types of inheritance
// Simple inheritance
// multi-level inheritance 
// hierarchical inheritance
// multiple inheritance (not supported in java)

public class Demo4 {
    public static void main(String[] args) {
        //CSEEngineeringStudent cs1 = new CSEEngineeringStudent();
    }
}

class Student { // Parent -> A
    String name;
    int age;

    public void markAttendance() {
        System.out.println("Attendance marked");
    }
}

class EngineeringStudent extends Student { // Child. --> B
    void attendLab() {
        System.out.println("lab attended for engineerng student");
    }
}

class MedicalStudent extends Student { // Child. --> C
    void attendLab() {
        System.out.println("lab attended for medical student");
    }
}

// class CSEEngineeringStudent extends EngineeringStudent {
//     void attendCSELab() {

//     }
// }

/*
Multi-level

Student 
|
EngineeringStudent
|
CSEEngineeringStudent
*/

/*
Hierrarchy 
        A
      /   \
     B     C 

*/

/*
Multiple 
        A   B
         \  /
          C
*/     


