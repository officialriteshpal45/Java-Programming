public class oops26 {
    // Inheritance in java 
    // Inheritance is the mechanism by which one class acquires the properties and features of another class
    void Force() {
        System.out.println("There are four fundamental forces.");
    }
}

class Gravitational extends oops26 {
    void Gravity() {
        System.out.println("Fruits fall to the ground due to gravitational Force.");
    }
}

class SingleInheritance {
    public static void main(String[] args) {
        // Instantiate the derived class to access both parent and child methods
        Gravitational G = new Gravitational();
        
        G.Force();   // Inherited from oops26
        G.Gravity(); // Defined in Gravitational
    }
}