public class App {
    public static void main(String[] args) throws Exception {
       Multiple obj= new Multiple();
       obj.show();
    }
}
interface A{
    void show(); //its abstract+public by default
}
interface B{
    void show(); 
}
class Multiple implements A,B{
    public void show()// method of classes are defauy by default so write public  while implementing interfae
    {
        System.out.println("Interface A and B");
    }
}
