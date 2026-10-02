class Test {
    // Calling a static Method 
    static void hello(){
        System.out.print("Hello World");
    }
}
public class day14{
    public static void main(String []args){

        day14 obj = new day14(); // Call Static Method Directly 
        Test.hello();
    }
}