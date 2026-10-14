         // Java Method 
        // Passinng Single parameter
public class day20 {
     static void Data_emp(String name ,int age ,long SSn_no, String join_date) {
        System.out.println("Name : - " +name);
        System.out.println("Age :- "+age);
        System.out.println("SSn_no :- "+SSn_no);
        System.out.println("Join_date :- "+join_date);
    }
     static void Data_emp2(String name ,int age ,long SSn_no, String join_date) {
        System.out.println("Name : - " +name);
        System.out.println("Age :- "+age);
        System.out.println("SSn_no :- "+SSn_no);
        System.out.println("Join_date :- "+join_date);
    }
    
    public static void main(String[] args) {
      Data_emp("Ayush Yadav", 23, 7895425L, "10/08/2026");
        System.out.println("  ");
      Data_emp("Manish Goyal",22,3658749L,"07/05/2022");
    }
}
