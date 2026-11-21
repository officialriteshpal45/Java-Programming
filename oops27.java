// Base class (Grandparent)
class FundamentalForce {
    void Force() {
        System.out.println("There are four fundamental forces.");
    }
}

// Intermediate class (Parent)
class NuclearForce extends FundamentalForce {
    void Nuclear() {
        System.out.println("Nuclear Forces are of two types:");
        System.out.println("1. Strong Nuclear Force");
        System.out.println("2. Weak Nuclear Force");
    }
}

// Derived class (Child)
class StrongNuclearForce extends NuclearForce {
    void Strong() {
        System.out.println("Strong Nuclear Force is responsible for the underlying stability of matter.");
    }
}

// Main class (Must match the file name oops27.java)
public class oops27 {
    public static void main(String[] args) {
        // Instantiating the lowest-level child class gives access to all methods in the hierarchy
        StrongNuclearForce st = new StrongNuclearForce();
        
        st.Force();   // Inherited from FundamentalForce
        st.Nuclear(); // Inherited from NuclearForce
        st.Strong();  // Defined in StrongNuclearForce
    }
}