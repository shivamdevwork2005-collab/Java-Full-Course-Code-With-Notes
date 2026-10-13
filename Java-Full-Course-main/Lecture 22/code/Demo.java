import java.util.Objects;

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student(); 
        s1.name = "Aditya";
        s1.age = 28;

        
        //System.out.println(s1);

        Student s2 = new Student();
        s2.name = "Aditya";
        s2.age = 28;

        // System.out.println(s1.equals(s2));

        // System.out.println(s1.hashCode() == s2.hashCode());

        // System.out.println(s1.getClass().getName());
        // System.out.println(s2.getClass().getName());

        // System.out.println(s1 instanceof Object);

        Student s3 = (Student) s1.clone();
        System.out.println(s3.name);
        System.out.println(s3.age);

    }
}

// instanceOf operator -> Check if an object is instance of a class or any of its subclass

class Student extends Object implements Cloneable {
    String name;
    int age;

    @Override
    public String toString() {
        return (name + " , " + age);
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj) return true;

        if(obj == null) {
            return false;
        }

        // Check if both classes are of type Student
        // If not checked --> ClassCastExceptions
        if(obj.getClass() != this.getClass()) {
            return false;
        }
        
        Student s = (Student) obj;

        return (this.name == s.name && this.age == s.age);
    }

    @Override
    public int hashCode() {
        // int result = 17;
        // result = result * 31 + age;
        // result = result * 31 + ((name == null) ? 0 : name.hashCode());

        // return result;

        return Objects.hash(name, age);
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}