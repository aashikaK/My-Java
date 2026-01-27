// method overriding

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}

class Shape{
    void draw(){
        System.out.println("Shape");
    }
}
class Circle extends Shape{
    void draw(){
        super.draw();
        System.out.println("Circle");
    }
}
