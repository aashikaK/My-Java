public class store_access{
    static int a=10; //static variable
    int b=8; //instance variable
    public static void main(String[] args){
        store_access obj= new store_access();
    int c=9; //local variable
        System.out.println(store_access.a);
        System.out.println(obj.b);
        System.out.println(c);
    }
}