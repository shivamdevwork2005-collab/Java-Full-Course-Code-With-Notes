import java.util.function.Predicate;

public class Demo5 {
    public static void main(String[] args) {    

        Predicate<Student> passed = s -> s.marks >= 40;
        Predicate<Student> isAdult = s -> s.age >= 18;

        Predicate<Student> isEligible = passed.or(isAdult);

        System.out.println(isEligible.test(new Student(50, 17)));
    }
}

// and() --> &&
// or() --> ||
// negate() --> !

class Student {
    int marks;
    int age;

    public Student(int marks, int age) {
        this.marks = marks;
        this.age = age;
    }
}
