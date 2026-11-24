/* Polymorphisum in Java 
polymorphism is the ability of an object to take more than one form
There Are two type of Polymorphisum 

1. Compile time polymorphism
2. Run time polymorphism

*/
// Compile time polymorphisum 
class AddMethods {
    static int AddNums(int a, int b) {
        return (a+b);
    }
    
    static int AddNums(int a, int b, int c) {
        return (a+b+c);
    }
    
    static double AddNums(double a, double b) {
        return (a+b);
    }
}

public class oops29 {

    public static void main(String[] args) {
        System.out.println("Addition of two integers: "+ AddMethods.AddNums(6, 11));
        System.out.println("Addition of three integers: "+ AddMethods.AddNums(6, 11, 5));
        System.out.println("Addition of two decimal numbers: "+ AddMethods.AddNums(6.3, 2.8));
    }
}