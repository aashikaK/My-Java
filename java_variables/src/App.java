//to show difference between static and localvariable

public class App {
    static int a=10;
    public void fun(){
        int b=10;
        System.out.println("a = "+a+" b = "+b);
        ++a; ++b;
    }
    public static void main(String[] args) throws Exception {
        App ref= new App();
        ref.fun();
        ref.fun();
    }
}
