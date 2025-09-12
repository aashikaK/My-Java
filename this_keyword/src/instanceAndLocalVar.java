public class instanceAndLocalVar {

    int a; //instance variable
    instanceAndLocalVar(int a){  //localvariable
        this.a= a; //if we dont use this it assigns default value of a as jvm gets confused
    }
    void show(){     
        System.out.println(a);
    }
    public static void main(String[] args) {
        instanceAndLocalVar obj= new instanceAndLocalVar(9);
        obj.show();
    }
}
