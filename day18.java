public class day18 {
    public static void main(){
        //  Break and continue statement 
        // Break 
        for(int n = 1; n <= 20; n++) {
            if(n % 2 == 0) {
                System.out.println(n);
                if (n == 12) {
                    break;
                }
            }
        }
        // Continue 
         for(int n = 1; n <= 20; n++) {
            if(n % 2 == 0) {
                if (n == 12) {
                    continue;
                }
                System.out.println(n);
            }
        }
    }
}

