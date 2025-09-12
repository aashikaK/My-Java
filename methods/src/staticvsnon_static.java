public class staticvsnon_static {

    static int a=90;
    int b=89;
    public static void main(String[] args) {
        show(); //or classname.show();
        staticvsnon_static obj= new staticvsnon_static();
        obj.disp();
    }
    static void show(){
         System.out.println("Static method: "+a); //can only access static variable a 
    }
    void disp(){
        System.out.println("Non static: "+a+" "+b); //can access static variable a and non-static variable b
    }
}
