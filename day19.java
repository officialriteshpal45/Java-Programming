public class day19 {
    public static void main(String[] args) {
        // String method 
        // String name;
        // name = "Suraj";
        // System.out.println("My name is " + name);

        // same work but using in array 
        char[] name = {'D', 'i', 'a', 'b', 'l', 'o'};
        String welcomeMsg = new String(name);  
        System.out.println("Welcome " + welcomeMsg);
    }
}
