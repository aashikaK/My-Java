// method overriding

public class App {
    public static void main(String[] args) throws Exception {
        Shape s= new Circle();
        s.draw();
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
