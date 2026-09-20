public class day11 {
    public static void main(String[] args) {
        //Switch Statement
        // This statement is used to execute one block of code among many options based on the value of a variable
        // The switch statement Use Keyword like break,continue,default
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}