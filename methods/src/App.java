public class App {


    void add(){
        int a=10,b=40;
        System.out.println("a+b= "+(a+b));
    }
    public static void main(String[] args) throws Exception {
        App obj=new App();
       disp(); // bcz its static method, it can be called inside static method directly without creating reference to class
       for(int i=0;i<10;i++ )  //calling add method 10 times
        obj.add();
    }
    public static void disp(){
        System.out.println("This is an example of method");
    }
}
