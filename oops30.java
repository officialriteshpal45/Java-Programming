// Rum time polymorphisum 
class Color {
    void paint() {
        System.out.println("I'm Painting.");
    }
}
    
class RedPaint extends Color {
    void paint() {
        System.out.println("I'm Painting with Red color.");
    }
}
    
class BluePaint extends Color {
    void paint() {
        System.out.println("I'm Painting with Blue color.");
    }
}

public class oops30 {

    public static void main(String[] args) {
        Color c;
        c = new RedPaint();
        c.paint();
        c = new BluePaint();
        c.paint();
    }
}
