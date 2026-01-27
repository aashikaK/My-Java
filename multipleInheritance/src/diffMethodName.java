public class diffMethodName {
    public static void main(String[] args) throws Exception {
       Multiple obj= new Multiple();
       obj.show();
       obj.display();
    }
}
interface A{
    void show(); //its abstract+public by default
}
interface B{
    void display(); 
}
class Multiple implements A,B{
    public void show()// Methods in a class are package-private by default so write public  while implementing interfae
    {
        System.out.println("Interface A");
    }
    public void display()// Methods in a class are package-private by defaultt so write public  while implementing interfae
    {
        System.out.println("Interface B");
    }
}


