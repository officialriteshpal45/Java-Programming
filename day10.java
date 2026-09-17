public class day10 {
    public static void main(String[] args) {
        //Condition statements in java
        // Type of condition statements
        //if statement
        int age =38;
        if(age>18){
            System.out.println("You are eligible to vote");
        }
        //if-else statement
        if(age<18){
            System.out.println("You are eligible to vote");       
    }
    else{
        System.out.println("You are not eligible to vote");
    }
    //if-else-if statement
    if(age>18 && age<30){
        System.out.println("You are eligible to vote");
    }
    else if(age>=60){
        System.out.println("You are senior citizen");
    }
    else{
        System.out.println("You are not eligible to vote");
    }
    // nested if statement
    if(age>18){
        if(age<40){
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("You are senior citizen");
        }
    }
    else{
        System.out.println("You are not eligible to vote");
    }
}
}
