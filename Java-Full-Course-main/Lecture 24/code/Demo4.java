public class Demo4 {
    public static void main(String[] args) {
        
    }
}

// Interface inheritance
interface Animal {
    void eat();
} 

interface Dog extends Animal {
    void bark();
}

class StreetDog implements Dog {
    
    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void bark() {
        System.out.println("Barking");
    }
}
