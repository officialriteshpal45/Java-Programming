public class day16 {
    public static void main(String[] args) {
        // Operations on Array Elements
         int[] arr = {2, 4, 8, 12, 16};

        // Accessing fourth element
        System.out.print(arr[3] + " ");

        // Accessing first element
        System.out.print(arr[0]);

        // Update Array Elements 

        // Updating first element
        arr[0] = 90;
        System.out.println(arr[0]);

        // Traverse Array 
         // Traversing and printing array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        
        
        // Size of Array 
         System.out.println("Size of array: " + arr.length);
        }
    }
}
