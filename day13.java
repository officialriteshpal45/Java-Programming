// Abstract method in java
abstract class Animal {
    abstract void sound();  

    void sleep() {        
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    void sound() {          
        System.out.println("Bark");
    }
}
public class day13 {
    public static void main(String[] args) {
        // calling Predefine method 
        
        day13 obj =new day13(); 
        System.out.println(obj.hashCode());// Predefine calling method

        Dog d = new Dog();
        d.sound();   
        d.sleep();   
    }
}