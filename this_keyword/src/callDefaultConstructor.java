public class callDefaultConstructor {
    public static void main(String[] args) {
        callDefaultConstructor c= new callDefaultConstructor(5);
    }
    callDefaultConstructor(){
        System.out.println("This is default constructor");
    }
    callDefaultConstructor(int a){
        this();
        System.out.println(a);
    }
}
