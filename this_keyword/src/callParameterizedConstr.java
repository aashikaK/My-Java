public class callParameterizedConstr {
    
    public callParameterizedConstr(){
        this(40); //calls parameterized constructor
        
        System.out.println("This is default construcutor.");
    }
    public callParameterizedConstr(int a){
        System.out.println(a);
    }
    public static void main(String[] args) {
        callParameterizedConstr obj= new callParameterizedConstr();
    }
    
}
