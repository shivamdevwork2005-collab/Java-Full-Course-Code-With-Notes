import java.util.*;

public class Demo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student("Aditya", 95));
        list.add(new Student("Rohit", 85));
        list.add(new Student("Rohan", 56));
        list.add(new Student("Monu", 85));

        Collections.sort(list);

        for(Student s : list) {
            System.out.println(s.name + " , " + s.marks);
        }

    }
}

class Student implements Comparable<Student> {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student other) {
        if(this.marks != other.marks) {
            return this.marks - other.marks;
        }
        return this.name.compareTo(other.name);
    }
}

// this.marks - other.marks; 
// < 0 : this.marks, other.marks
// > 0 : other.marks, this.marks
