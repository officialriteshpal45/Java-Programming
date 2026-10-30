// Method overloading 
public class day21 {
    static void Details(String name, int marks) {
        System.out.println("Welcome " + name);
        System.out.println("Your got "+ marks + " marks in exam.");
    }
    
    static void Details(String name, double marks) {
        System.out.println("Welcome " + name);
        System.out.println("Your got "+ marks + " marks in exam.");
    }
    // method with control statement 
       static void Details(int marks) {
        if (marks < 35) {
            System.out.println("Fail");
        } else if (marks >= 35 && marks < 65) {
            System.out.println("B grade");
        } else if (marks >= 65 && marks < 75) {
            System.out.println("A grade");
        } else if (marks >= 75 && marks < 100) {
            System.out.println("O grade");
        } else {
            System.out.println("Invalid marks entered");
        } 
    }
    
    public static void main(String[] args) {
        Details("Ridhi", 89);
        Details("Ritesh", 93.5);
    
    // Method with control statement 
        Details(25);
        Details(90);
        Details(60);
   }
}