
// To prove that this method refers to current object like reference variable...

public class App {
    public static void main(String[] args) throws Exception {
        App obj= new App();
        System.out.println(obj);
        obj.show();
    }
    void show(){
        System.out.println(this);
    }
}
