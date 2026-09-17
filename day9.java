public class day9 {
    public static void main(String[] args) {
        // bitwise operator in java
        int a = 5; // binary: 0101
        int b = 3; // binary: 0011

        System.out.println("a & b: " + (a & b)); // binary: 0001, decimal: 1
        System.out.println("a | b: " + (a | b)); // binary: 0111, decimal: 7
        System.out.println("a ^ b: " + (a ^ b)); // binary: 0110, decimal: 6
        System.out.println("~a: " + (~a)); // binary: 1010, decimal: -6
        System.out.println("a << 1: " + (a << 1)); // binary: 1010, decimal: 10
        System.out.println("a >> 1: " + (a >> 1)); // binary: 0010, decimal: 2
    }
}