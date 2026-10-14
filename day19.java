public class day19 {
    public static void main(String[] args) {
        // String method 
        // String name;
        // name = "Suraj";
        // System.out.println("My name is " + name);

        // same work but using in array 
        char[] name = {'V', 'i', 'r', 'a', 't'};
        String welcomeMsg = new String(name);  
        System.out.println("Welcome " + welcomeMsg);

        //Concatinate String
        String fname, lname;
        fname = "Rohit ";
        lname = "Shrma";
        System.out.println(fname + " " + lname);

        // Concatinate Method
        System.out.println(fname.concat(lname));
          
        // Split 
        String text = "Java is a fun programming language";

        // split string from space
    String[] result = text.split(" ");


      System.out.print("result = ");
      for (String str : result) {
      System.out.print(str + ", ");

      //find the string length
       String str1 = "gthsghghs";
       int length = str1.length();
       System.out.println(length);
    }
    }
}
